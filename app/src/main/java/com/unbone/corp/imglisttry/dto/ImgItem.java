package com.unbone.corp.imglisttry.dto;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by yongbeom on 2018. 8. 6..
 */

public class ImgItem {
    private String imgUrl;
    private String imgSubject;

    private ArrayList<ImgItem> subImgItems;


    public ImgItem(){

    }


    public String getImgUrl() {
        return imgUrl;
    }

    public String getImgSubject() {
        return imgSubject;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public void setImgSubject(String imgSubject){
        this.imgSubject = imgSubject;
    }

    public ArrayList<ImgItem> getSubImgItems() {
        return subImgItems;
    }
    public void setSubImgItems(ArrayList<ImgItem> subImgItems) {
        this.subImgItems = subImgItems;
    }
}