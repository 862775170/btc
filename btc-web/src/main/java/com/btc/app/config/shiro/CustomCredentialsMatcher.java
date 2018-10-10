package com.btc.app.config.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

import com.btc.common.util.EncryUtil;


public class CustomCredentialsMatcher extends SimpleCredentialsMatcher{
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token,
            AuthenticationInfo info)
    {
        // TODO Auto-generated method stub
        String string =new String(toBytes(token.getCredentials()));
        Object tokenCredentials=EncryUtil.encrypt(string).getBytes();
        Object accountCredentials = getCredentials(info);
        return equals(tokenCredentials, accountCredentials);
    }
}
