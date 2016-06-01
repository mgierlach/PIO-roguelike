/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pio.roguelike;

/**
 *
 * @author rafal
 */
public class Item {
    static int nextId = 1;
    
    String name;
    float price;
    int id;
    
    public Item( String name, float price) {
        this.name = name;
        this.price = price;
        id = nextId;
        nextId++;
        
    }
    
}
