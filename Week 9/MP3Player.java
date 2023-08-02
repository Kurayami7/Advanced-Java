public class MP3Player extends Electronics{
   
    private String color;
   
    /**
     * Creates a new instance of MP3Player
     */
    public MP3Player(double regularPrice,
                String manufacturer,
                String color) {
        super(regularPrice, manufacturer);
        this.color = color;
    }
   
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.9;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void usage() {
      System.out.println("This product can be used to listen to music");
    }

    @Override 
    public void payWarrantyFees() {
      System.out.printf("You have to pay $%.2f for warranty each year on this product\n" , (computeSalePrice() * 1.4));
    }
}