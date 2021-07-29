/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joinfaces.example.view;

import org.joinfaces.example.model.Customer;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.joinfaces.example.service.CustomerService;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;

@Named
@ViewScoped
public class LazyView implements Serializable {

    private LazyDataModel<Customer> lazyModel;

    private Customer selectedCustomer;

    @PostConstruct
    public void init() {
        CustomerService service = new CustomerService();
        service.init();
        lazyModel = new LazyCustomerDataModel(service.getCustomers(200));
    }

    public LazyDataModel<Customer> getLazyModel() {
        return lazyModel;
    }

    public Customer getSelectedCustomer() {
        return selectedCustomer;
    }

    public void setSelectedCustomer(Customer selectedCustomer) {
        this.selectedCustomer = selectedCustomer;
    }

    public void onRowSelect(SelectEvent<Customer> event) {
        FacesMessage msg = new FacesMessage("Customer Selected", String.valueOf(event.getObject().getId()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void startDetailAction() {
        FacesMessage msg = new FacesMessage("Customer Selected", String.valueOf(selectedCustomer.getId()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}