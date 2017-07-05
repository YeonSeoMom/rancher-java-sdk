package io.rancher.type;

import io.rancher.base.AbstractType;

public class HostAccess extends AbstractType {
    
    private String token;
    
    private String url;
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
}
