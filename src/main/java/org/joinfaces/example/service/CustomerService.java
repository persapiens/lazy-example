/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joinfaces.example.service;

import org.joinfaces.example.model.Customer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CustomerService {

    private List<Customer> customers;
    private String[] names;
    private String[] companies;

    public void init() {
        customers = new ArrayList<>();

        companies = new String[]{"Benton, John B Jr", "Chanay, Jeffrey A Esq", "Chemel, James L Cpa", "Feltz Printing Service",
                "Printing Dimensions", "Chapman, Ross E Esq", "Morlong Associates", "Commercial Press", "Truhlar And Truhlar Attys",
                "King, Christopher A Esq","Dorl, James J Esq","Rangoni Of Florence","Feiner Bros","Buckley Miller Wright","Rousseaux, Michael Esq",};

        names = new String[]{"James Butt", "David Darakjy", "Jeanfrancois Venere", "Ivar Paprocki", "Tony Foller",
                "Adams Morasca", "Claire Tollner", "Costa Dilliard", "Juan Wieser", "Maria Marrier", "Jennifer Amigon",
                "Stacey Maclead", "Leja Caldarera", "Morrow Ruta", "Arvin Albares", "Darci Poquette", "Izzy Garufi",
                "Ricardo Gaucho", "Clifford Rim", "Emily Whobrey", "Kadeem Flosi", "Mujtaba Nicka", "Aika Inouye",
                "Mayumi Kolmetz", "Misaki Royster", "Silvio Slusarski", "Nicolas Iturbide", "Antonio Caudy", "" +
                "Deepesh Chui", "Aditya Kusko", "Aruna Figeroa", "Jones Vocelka", "Julie Stenseth", "Smith Glick",
                "Johnson Sergi", "Francesco Shinko", "Salvatore Stockham", "Kaitlin Ostrosky", "Faith Gillian",
                "Maisha Rulapaugh", "Jefferson Schemmer", "Leon Oldroyd", "Rodrigues Campain", "Alejandro Perin",
                "Munro Ferencz", "Cody Saylors", "Chavez Briddick", "Sinclair Waycott", "Isabel Bowley", "Octavia Malet",
                "Murillo Malet", "Greenwood Bolognia", "Wickens Nestle", "Ashley Doe"};
    }


    public List<Customer> getCustomers(int number) {
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            customers.add(new Customer(i + 1000, getName(), getCompany(), getDate(), getActivity()));
        }
        return customers;
    }

    private String getName() {
        return names[(int) (Math.random() * names.length)];
    }

    private String getCompany() {
        return companies[(int) (Math.random() * companies.length)];
    }

    private LocalDate getDate() {
        LocalDate now = LocalDate.now();
        long randomDay = ThreadLocalRandom.current().nextLong(now.minusDays(30).toEpochDay(), now.toEpochDay());
        return LocalDate.ofEpochDay(randomDay);
    }

    private int getActivity() {
        return (int) (Math.random() * 100);
    }
}