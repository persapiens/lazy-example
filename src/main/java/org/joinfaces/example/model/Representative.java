/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joinfaces.example.model;

import java.io.Serializable;

/**
 *
 * @author devin
 */
public class Representative implements Comparable<Representative>, Serializable {
    
    private String image;

    private String name;

    public Representative(String name, String image) {
        this.image = image;
        this.name = name;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the value of image
     *
     * @return the value of image
     */
    public String getImage() {
        return image;
    }

    /**
     * Set the value of image
     *
     * @param image new value of image
     */
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int compareTo(Representative o) {
        return this.getName().compareTo(o.getName());
    }

}
