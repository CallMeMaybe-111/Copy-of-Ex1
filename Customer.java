class Customer {
  private int customerId;
  
  public Customer(int customerId) {
   this.customerId = customerId;
  }

  @Override 
  public String toString() {
    return String.valueOf(customerId);
  } //convert customer ID to a string
}  
