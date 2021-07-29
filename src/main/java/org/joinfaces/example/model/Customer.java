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
    public Country country;
    public LocalDate date;
    public CustomerStatus status;
    public int activity;
    public Representative representative;

    public Customer() {
    }

    public Customer(int id, String name, String company, Country country, LocalDate date, CustomerStatus status, int activity, Representative representative) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.country = country;
        this.date = date;
        this.status = status;
        this.activity = activity;
        this.representative = representative;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public Representative getRepresentative() {
        return representative;
    }

    public void setRepresentative(Representative representative) {
        this.representative = representative;
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
                Objects.equals(country, customer.country) &&
                Objects.equals(date, customer.date) &&
                status == customer.status &&
                Objects.equals(representative, customer.representative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, company, country, date, status, activity, representative);
    }
}