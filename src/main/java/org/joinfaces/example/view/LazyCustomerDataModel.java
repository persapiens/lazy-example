/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joinfaces.example.view;

import org.joinfaces.example.model.Customer;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;

public class LazyCustomerDataModel extends LazyDataModel<Customer> {

    private List<Customer> datasource;

    public LazyCustomerDataModel(List<Customer> datasource) {
        this.datasource = datasource;
    }

    @Override
    public Customer getRowData(String rowKey) {
        for (Customer customer : datasource) {
            if (customer.getId() == Integer.parseInt(rowKey)) {
                return customer;
            }
        }

        return null;
    }

    @Override
    public String getRowKey(Customer customer) {
        return String.valueOf(customer.getId());
    }

    @Override
    public List<Customer> load(int offset, int pageSize, Map<String, SortMeta> sortBy, Map<String, FilterMeta> filterBy) {
        long rowCount = datasource.stream()
                .count();

        // apply offset
        List<Customer> customers = datasource.stream()
                .skip(offset)
                .limit(pageSize)
                .collect(Collectors.toList());

        // rowCount
        setRowCount((int) rowCount);

        return customers;
    }
}