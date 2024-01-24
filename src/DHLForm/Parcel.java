/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DHLForm;

/**
 *
 * @author smgKV878
 */
public class Parcel {
    private String senderName;
    private String receiverName;
    private String weight;
    private String price;
    private String number;
    
    public Parcel() {
        this.senderName = "";
        this.receiverName = "";
        this.weight = "";
        this.price = "";
        this.number = "";
    }

    public Parcel(String senderName, String receiverName, String weight, String price, String number) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.weight = weight;
        this.price = price;
        this.number = number;
    }
    

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
}
