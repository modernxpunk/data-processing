/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.alexkovalskyi;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class UserContainer {

    private String name;
    private String gender;
    private List<String> language;
    private String country;

    
    
    public UserContainer() {
    }

    public UserContainer(String name, String gender, String[] language, String country) {
        this.name = name;
        this.gender = gender;
        
        if (language != null ){
            this.language = Arrays.asList(language);
        }
        
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", gender=" + gender + ", language=" + language + ", country=" + country + '}';
    }

}