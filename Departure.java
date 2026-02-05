class Departure extends Event{
  private Customer customer;

  public Departure(double time, Customer c) {
    super(time);
    this.customer = c;
  }
  
  @Override
  public String toString() {
    return String.format(": Customer %d departs", this.customerId);
  }

  @Override
  public Event[] simulate() {
    return new Event[] {};
  }
}
