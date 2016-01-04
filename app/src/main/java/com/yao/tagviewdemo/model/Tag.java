package com.yao.tagviewdemo.model;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by yao on 2015/9/29.
 */

/**
 * 序列化Tag类 支持判断是否选中，左侧头像 右侧TextView数字
 * target:在json解析中列表字段最好以这种形式展现
 */
public class Tag implements Serializable {

    /**
     *序列化唯一标识
     */
    private static final long serialVersionUID = 2684657309332033242L;

    private int backgroundResId ;
    private int id ;
    private boolean isChecked ;
    private String leftBitmapUrl;
    private String rightText ;
    private String title;

    public Tag() {}

    public Tag( int paramInt, String paramString) {
        this .id = paramInt;
        this .title = paramString;
    }

    public int getBackgroundResId() {
        return this.backgroundResId ;
    }

    public int getId() {
        return this.id ;
    }

    public String getLeftBitmapUrl() {
        return this.leftBitmapUrl;
    }

    public String getRightText() {
        return this.rightText;
    }

    public String getTitle() {
        return this .title ;
    }

    public boolean isChecked() {
        return this .isChecked ;
    }

    public void setBackgroundResId( int paramInt) {
        this .backgroundResId = paramInt;
    }

    public void setChecked( boolean paramBoolean) {
        this .isChecked = paramBoolean;
    }

    public void setId(int paramInt) {
        this.id = paramInt;
    }

    public void setLeftBitmapUrl(String url) {
        this.leftBitmapUrl = url;
    }

    public void setRightText( String text) {
        this.rightText = text;
    }

    public void setTitle(String paramString) {
        this .title = paramString;
    }
}
