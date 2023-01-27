package com.mybatis.pojo;

public class Hello {
    private String xiao;

    public Hello() {
    }


    public String getXiao() {
        return xiao;
    }

    public void setXiao(String xiao) {
        this.xiao = xiao;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "xiao='" + xiao + '\'' +
                '}';
    }
}
