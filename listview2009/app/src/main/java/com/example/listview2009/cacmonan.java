package com.example.listview2009;

public class cacmonan {
    private String tenmon;
    private String chitiet;
    private String giatien;
    private int them;
    private int tru;
    private int img;

    public cacmonan(String tenmon, String chitiet, String giatien, int them, int tru, int img) {
        this.tenmon = tenmon;
        this.chitiet = chitiet;
        this.giatien = giatien;
        this.them = them;
        this.tru = tru;
        this.img = img;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public int getThem() {
        return them;
    }

    public void setThem(int them) {
        this.them = them;
    }

    public int getTru() {
        return tru;
    }

    public void setTru(int tru) {
        this.tru = tru;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
