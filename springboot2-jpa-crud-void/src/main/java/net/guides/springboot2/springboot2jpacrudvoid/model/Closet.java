package net.guides.springboot2.springboot2jpacrudvoid.model;

import java.util.HashMap;
import org.springframework.data.annotation.Id;
import java.util.Date;
import net.guides.springboot2.springboot2jpacrudvoid.model.Item;

public class Closet {
    @Id
    private String id;

    private String name;
    private HashMap<String, Item> items;
    private Date date;

    public String getName() { return this.name;}
    public HashMap<String, Item> getItems() { return this.items;}
    public Date getDate() { return this.date;}

    public void setName(String name) { this.name = name;}
    public void setItems(HashMap<String, Item> items) {this.items = items;}
    public void setDate(Date date) {this.date = date;}

    @Override
    public String toString() {
      return "Closet [id=" + id + ", name=" + name + ", items=" + items + ", date" + date + "]";
    }

    
}
