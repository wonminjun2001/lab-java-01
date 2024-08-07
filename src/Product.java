
public class Product {
    private String name;
    private double price;
    private double tax;

    //    tạo một hàm trống để có thể sử dụng các thuộc tính trong class Product
    public Product(){}

    //    làm một hàm tạo constructor tên của hàm tạo trùng với tên class
    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    //    tạo các hàm get và set để dùng được tính đóng gói Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    //    đây là một phương thức method tên là nhapThongTin phương thức này có kiểu dữ liệu là Product
//    nhận vào 3 tham số và trả về đối tượng pr vừa dc tạo
    public Product nhapThongTin(String name, double price, double tax) {
        Product pr = new Product(name, price, tax);
        return pr;
    }

    //    đây là phương thức method để xuất thông tin có tham số đầu vào là pr và kiểu dữ liệu là Product
//    sử dụng các phương thức get để các giá trị tương ứng vì tính đóng gói Encapsulation
    public void xuatThongTin(Product pr) {
        System.out.println(" name" + pr.getName() +"price " + pr.getPrice() +" tax" + pr.getTax() );
    }

    //    method nhận vào 2 tham số và trả về giá trị
    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }
}