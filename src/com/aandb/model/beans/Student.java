package com.aandb.model.beans;

public class Student
{
    private int cui;
    private String name;
    private String lastName;
    private String e_mail;

    public int getCui()
    {
        return cui;
    }
    
    public void setCui(int cui)
    {
        this.cui = cui;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getE_mail()
    {
        return e_mail;
    }

    public void setE_mail(String e_mail)
    {
        this.e_mail = e_mail;
    }
}
