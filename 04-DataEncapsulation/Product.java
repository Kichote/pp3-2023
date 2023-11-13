public class Product {

      // Attributes
      private String productName;
      private boolean isVegetarian;
  
      // Constructor
      public Product(String productName, boolean isVegetarian) {
          this.productName = productName;
          this.isVegetarian = isVegetarian;
      }
  
      // Getter and Setter methods for productName
      public String getProductName() {
          return productName;
      }
  
      public void setProductName(String productName) {
          this.productName = productName;
      }
  
      // Getter and Setter methods for isVegetarian
      public boolean isVegetarian() {
          return isVegetarian;
      }
  
      public void setVegetarian(boolean vegetarian) {
          isVegetarian = vegetarian;
      }
  
      // Method to display product information
      public void displayProductInfo() {
          System.out.println("Product Name: " + productName);
          System.out.println("Is Vegetarian: " + isVegetarian);
      }
  
      public static void main(String[] args) {
          // Creating a product and setting attributes' values
          Product myProduct = new Product("Tomato Soup", true);
  
          // Displaying product information
          myProduct.displayProductInfo();
      }
}