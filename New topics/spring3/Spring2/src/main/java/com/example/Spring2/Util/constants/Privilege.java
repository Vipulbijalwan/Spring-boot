package com.example.Spring2.Util.constants;

public enum Authorities {

    RESET_ANY_USER_PASSWORD(1l,"REST_ANY_USER_PESSWORD"),
    ACCESS_ADMIN_PANEL(2l,"ACCESS_ADMIN_PANEL");


    private long authorityId;
    private String authorityString;

 Authorities(long authorityId, String authorityString) {
        this.authorityId = authorityId;
        this.authorityString = authorityString;
    }

    public Long getAuthorityId() {
        return authorityId;
    }


    public String getAuthorityString() {
        return authorityString;
    }

}
