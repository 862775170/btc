package com.mpool.account.config.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

import com.mpool.common.util.EncryUtil;



public class CustomCredentialsMatcher extends SimpleCredentialsMatcher{
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token,
            AuthenticationInfo info)
    {
        String string =new String(toBytes(token.getCredentials()));
        Object tokenCredentials=EncryUtil.encrypt(string).getBytes();
        Object accountCredentials = getCredentials(info);
        return equals(tokenCredentials, accountCredentials);
    }
}
