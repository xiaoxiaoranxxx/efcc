package org.xiao.sql;

public class Users {
    private Integer typeid;
    private String typename;

    public Users(Integer typeid, String typename) {
        this.typeid = typeid;
        this.typename = typename;
    }

    public Users() {
        super();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
