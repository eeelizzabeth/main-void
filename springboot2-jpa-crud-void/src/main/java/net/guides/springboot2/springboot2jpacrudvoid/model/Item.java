package net.guides.springboot2.springboot2jpacrudvoid.model;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Item {
    @Id
    private String id;
 
    private String name;
    private Double price;
    private String description;
    private Date date;

    public Item() {

    }

    public Item(String name, Double price, String description, Date date) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.date = date;
    }

    public String getName() { return name;}
    public Double getPrice() { return price;}
    public String getDescription() { return description;}
    public Date getDate() { return date;}

    public void setName(String name) { this.name = name;}
    public void setPrice(Double price) { this.price = price;}
    public void setDescription(String description) {this.description = description;}
    public void setDate(Date date) { this.date = date;}

    @Override
    public String toString() {
      return "Item [id=" + id + ", name=" + name + ", price=" + price + ", description="+ description + ", date" + date + "]";
    }
}
