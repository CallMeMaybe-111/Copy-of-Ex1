class ServiceBegin extends Event{
  private Customer customer;
  private int counterId;
  private double serviceTime;
  
  public ServiceBegin(double time, Customer c, double serviceTime) {
    super(time);
    this.customer = c;
    this.serviceTime = serviceTime;
    this.counterId = c.getCounterId();
  }

  @Override
  public String toString() {
    return String.format(": Customer %d service begins (at Counter %d)", this.customer, this.counterId);  
  }

  @Override 
  public Event[] simulate() {
    double endTime = this.getTime() + this.serviceTime;

    return new Event[] {
      new ServiceEnd(endTime, this.customer, this.counterId) 
    };
  }
}
