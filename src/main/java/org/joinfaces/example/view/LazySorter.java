/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joinfaces.example.view;

import org.joinfaces.example.model.Customer;
import java.util.Comparator;
import org.primefaces.model.SortOrder;

public class LazySorter implements Comparator<Customer> {

    private String sortField;
    private SortOrder sortOrder;

    public LazySorter(String sortField, SortOrder sortOrder) {
        this.sortField = sortField;
        this.sortOrder = sortOrder;
    }

    @Override
    public int compare(Customer customer1, Customer customer2) {
        try {
            Object value1 = customer1.getClass().getField(sortField).get(customer1);
            Object value2 = customer2.getClass().getField(sortField).get(customer2);

            int value = ((Comparable)value1).compareTo(value2);

            return SortOrder.ASCENDING.equals(sortOrder) ? value : -1 * value;
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

}