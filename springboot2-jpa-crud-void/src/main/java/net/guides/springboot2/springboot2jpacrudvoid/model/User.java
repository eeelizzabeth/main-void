package net.guides.springboot2.springboot2jpacrudvoid.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import net.guides.springboot2.springboot2jpacrudvoid.model.Closet;
import net.guides.springboot2.springboot2jpacrudvoid.model.Cart;

@Document(collection = "user")
public class User {
    @Id
    private String id;
 
    private String name;
    private String last;
    private String password;
    private String address;
    

    private String phone_number;

    // private String credit_card;
    // private Closet closet;
    // private Cart cart;

    private boolean active;

    public User() {

    }

    public User(String name, String last, String password, String address, String phone_number) {
      this.name = name;
      this.last = last;
      this.password = password; //hash the password
      this.address = address;
      this.phone_number = phone_number;

  }

  //   public User(String name, String last, String address, String phone_number) {
  //     this.name = name;
  //     this.last = last;
  //     this.address = address;
  //     this.phone_number = phone_number;

  //     this.credit_card = "";
  // }

    // public User(String name, String last, String address, String phone_number, String closet_name) {
    //     this.name = name;
    //     this.last = last;
    //     this.address = address;
    //     this.phone_number = phone_number;
    //     this.closet.setName(closet_name);

    //     this.credit_card = "";
    // }

    public String getId() {return this.id;}
    public String getName() { return this.name;}
    public String getLastName() {return this.last;}
    public String getAddress() { return this.address;}
    public String getPhoneNumber() { return this.phone_number;}
    // public String getCreditCard() { return this.credit_card;}
    // public Closet getCloset() { return this.closet;}
    // public Cart getCart() { return this.cart;}
    public boolean getActive() {return this.active;}

    public void setId(String id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setLastName(String last) {this.last = last;}
    public void setAddress(String address) {this.address = address;}
    public void setPhoneNumber(String phone_number) {this.phone_number = phone_number;}
    // public void setCreditCard(String credit_card) {this.credit_card = credit_card;}
    // public void setCloset(Closet closet) {this.closet = closet;}
    // public void setCart(Cart cart) {this.cart = cart;}
    public void setActive(boolean active) {this.active = active;}

    @Override
    public String toString() {
      return "User [id=" + id + ", name=" + name + ", address=" + address + ", phone_number="+ phone_number + ", active=" + active + "]";
    }
    
}
