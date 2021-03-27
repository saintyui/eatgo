package com.saintpress.eatgo.domain;

import com.fasterxml.jackson.databind.node.ArrayNode;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final String name;
    private final String address;
    private final Long id;
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(Long id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getInformation(){
        return name + " in " + address;
    }

    public Long getId() {
        return id;
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        for (MenuItem menuItem: menuItems){
            addMenuItem(menuItem);
        }
    }
}
