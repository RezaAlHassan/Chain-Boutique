
package javafxapplication1.Model;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Product implements Serializable, ViewProduct {
    private static final long serialVersionUID = 155155669277299909L;;
    private int productId;
    private String productName;
    private double productPrice;
    private String productCategory;
    private double productCost;
    private int noAvailableForDelivery;


     public Product(int productId, String productName, String productCategory, double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
     }
     
     public Product(){ }
     
     public Product(int productId, String productName, String productCategory, double productPrice, int noAvailableForDelivery){
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.noAvailableForDelivery = noAvailableForDelivery;
     }
     

     //all getters
     public int getProductId() {
     return productId;
  }

     public int getProductId(int productId) {
     return productId;
  }
     public String getProductName() {
     return productName;
  }
     public double getProductPrice() {
     return productPrice;
  }
     
    public double getProductPrice(int productId) {
     return productPrice;
  }
     public String getProductCategory() {
     return productCategory;
  }
     public double getProductCost() {
     return productCost;
  } 
     public int getNoAvailableForDelivery() {
     return noAvailableForDelivery;
  }
     //all setters
     public void setProductId(int productId) {
     this.productId=productId;
  }
     public void setProductName(String productName) {
     this.productName=productName;
  }
     public void setProductPrice(double productPrice) {
     this.productPrice=productPrice;
  }
     public void setProductCategory(String productCategory) {
     this.productCategory=productCategory;
  }
     public void setProductCost(double productCost) {
     this.productCost=productCost;
  }
     public void setNoAvailableForDelivery(int noAvailableForDelivery) {
     this.noAvailableForDelivery=noAvailableForDelivery;
  }
        private void writeObject(ObjectOutputStream out)
        throws IOException {
        out.writeObject(getProductId());
        out.writeObject(getProductName());
        out.writeObject(getProductCategory());
        out.writeObject(getProductPrice());
    }
    
    private void readObject(ObjectInputStream in)
        throws IOException, ClassNotFoundException {
        productId =  in.readInt();
        productName =in.readUTF();
        productCategory = in.readUTF();
        productPrice = in.readDouble();
    }

    @Override
    public void viewProduct(){
        System.out.println("Id="+productId+", Name="+productName+", Category="+productCategory+", Cost="+productCost+", No.available for delivery="+noAvailableForDelivery);
    }
   
        public String productToString(){
        return "Id="+productId+", Name="+productName+", Category="+productCategory+", Cost="+productCost+", No.available for delivery="+noAvailableForDelivery;
    }
} 


