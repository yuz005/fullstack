package org.scoula.ex05.dto;

public class LoginDto {
    private String name;
    private String passwd;

    public LoginDto(){
    }
    public LoginDto(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}

