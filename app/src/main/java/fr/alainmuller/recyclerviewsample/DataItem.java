package fr.alainmuller.recyclerviewsample;

public class DataItem {
    // Title
    private String itemTitle;

    // Data displayed in ListView is faked in MainActivity, nothing here...

    public DataItem() {
    }

    public DataItem(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }
}
