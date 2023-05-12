package baitap12;

import java.util.ArrayList;
import java.util.Scanner;

public class News {
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;
    ArrayList<Integer> RateList = new ArrayList<>();

    public News(int ID, String title, String publishDate, String author, String content) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setAverageRate(float averageRate) {
        AverageRate = averageRate;
    }

    public void Display() {
        System.out.println("Tiêu đề: " + Title);
        System.out.println("Ngày xuất bản: " + PublishDate);
        System.out.println("Tác giả: " + Author);
        System.out.println("Nội dung: " + Content);
        System.out.println("Đánh giá trung bình: " + AverageRate);
        System.out.println("Danh sách các đánh giá: " + RateList);
    }

    public void InputRate() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Nhập số lượng đánh giá:");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            System.out.println("Nhập đánh giá thứ "+i+":");
            int rate = sc.nextInt();
            RateList.add(rate);
        }
        Calculate();
    }

    public void Calculate() {
        int sum = 0;
        for (int rate : RateList) {
            sum += rate;
        }
        AverageRate = (float) sum / RateList.size();
    }

}


