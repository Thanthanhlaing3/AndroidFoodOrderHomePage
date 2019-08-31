package com.uigitdev.foodorder.model;

public class TypeItem {
    private int iconId;
    private String title;
    private boolean isOpened;

    public TypeItem(int iconId, String title, boolean isOpened) {
        this.iconId = iconId;
        this.title = title;
        this.isOpened = isOpened;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int icon_id) {
        this.iconId = icon_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
