package net.guides.springboot2.springboot2jpacrudvoid.model;

import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import net.guides.springboot2.springboot2jpacrudvoid.model.Item;

public class Cart {
    
    // @Document(collection = "cart");

    @Id
    private String id;
    private HashMap<String, Item> items;
    private boolean checkout;
    private Date date;

    public Cart() {
      this.items = new HashMap<String, Item> ();
      this.checkout = false;
    }

    public Cart(String id, HashMap<String, Item> items, boolean checkout, Date date) {
        this.id = id;
        this.items = items;
        this.checkout = checkout;
        this.date = date;

    }

    public String getId() { return this.id;}
    public HashMap<String, Item> getItems() { return this.items;}
    public boolean getCheckout() {return this.checkout;}
    public Date getDate() {return this.date;}

    public void setId(String id) {this.id = id;}
    public void setItems(HashMap<String, Item> items) {this.items = items;}
    public void setCheckout(boolean checkout) {this.checkout = checkout;}
    public void setDate(Date date) {this.date = date;}

    @Override
    public String toString() {
      return "Cart [id=" + id + ", items=" + items + ", checkout=" + checkout + ", date=" + date + "]";
    }

}
