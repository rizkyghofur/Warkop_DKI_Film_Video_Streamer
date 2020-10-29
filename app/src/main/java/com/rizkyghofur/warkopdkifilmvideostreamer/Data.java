package com.rizkyghofur.warkopdkifilmvideostreamer;

public class Data {

    private String namafilm;
    private String deskripsifilm;
    private String key;
    private int album;

    public Data(String namafilm, String deskripsifilm, int album, String key) {
        this.namafilm = namafilm;
        this.deskripsifilm = deskripsifilm;
        this.album = album;
        this.key = key;
    }

    public String getNamafilm() {
        return namafilm;
    }

    public String getDeskripsifilm() {
        return deskripsifilm;
    }

    public int getAlbum() {
        return album;
    }

    public String getKey() {
        return key;
    }
}