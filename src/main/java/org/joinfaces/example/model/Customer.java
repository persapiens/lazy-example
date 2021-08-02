/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joinfaces.example.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

    public int id;
    public String name;
    public String company;
    public LocalDate date;
    public int activity;

    public Customer() {
    }

    public Customer(int id, String name, String company, LocalDate date, int activity) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.date = date;
        this.activity = activity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                activity == customer.activity &&
                Objects.equals(name, customer.name) &&
                Objects.equals(company, customer.company) &&
                Objects.equals(date, customer.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, company, date, activity);
    }
}