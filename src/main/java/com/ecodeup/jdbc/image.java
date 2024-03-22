package com.ecodeup.jdbc;

public class image {
    private int iduser;
    private String url;
    private int productid;

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getIduser() {
        return iduser;
    }

    public String getUrl() {
        return url;
    }

    public int getProductid() {
        return productid;
    }

    public image(int iduser, String url, int productid) {

        this.iduser = iduser;
        this.url = url;
        this.productid =productid;

    }
}
