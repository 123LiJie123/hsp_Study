package gui_Swing_bookManage.object;

import java.util.Date;

public class Book {
    private int id;//图书序号
    private String author;//作者
    private String name;//书名
    private int pages;//价格
    private String price;//出版社
    private Date time;//出版时间
    private Double size;//库存数量
    private String type;//分类

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", price='" + price + '\'' +
                ", time=" + time +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }

}