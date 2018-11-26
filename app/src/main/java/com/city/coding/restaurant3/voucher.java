package com.city.coding.restaurant3;

public class voucher {
    //voucher property
    private String name ;
    private String image ;
    private String code ;
    private String price ;
    private String desc ;
    private int QR ;
    private String QRnumber;
    private int quantity;
    //end voucher fields



    //constructor
    public voucher(String name, String price, String desc  , int quantity , String qrNumber) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.quantity = quantity;
        QRnumber = qrNumber ;
    }
    public voucher(String name, String price, String desc  , int quantity ) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.quantity = quantity;
    }
    //end constructor

    // get QR number
    public String getQRnumber() {
        return QRnumber;
    }

    //set QR number


    public void setQRnumber(String QRnumber) {
        this.QRnumber = QRnumber;
    }

    //set voucher name
    private void setName(String name) {
        this.name = name;
    }

    // set voucher image
    private void setImage(String image) {
        this.image = image;
    }

    // set voucher product code
    private void setCode(String code) {
        this.code = code;
    }

    // set voucher price
    private void setPrice(String price) {
        this.price = price;
    }

    // set voucher description
    private void setDesc(String desc) {
        this.desc = desc;
    }

    // get vouchser name
    public String getName() {
        return name;
    }

    // get vouchser image
    public String getImage() {
        return image;
    }

    // get vouchser product code
    public String getCode() {
        return code;
    }

    // get vouchser price
    public String getPrice() {
        return price;
    }

    // get vouchser description
    public String getDesc() {
        return desc;
    }

    //set voucher QR code
    public void setQR(int QR) {
        this.QR = QR;
    }

    // set voucher quantity left
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // get voucher QR
    public int getQR() {
        return QR;
    }

    //get voucher quantity
    public int getQuantity() {
        return quantity;
    }
}
