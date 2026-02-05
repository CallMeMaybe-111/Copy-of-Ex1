class ServiceEnd extends Event{
  private Customer customer;
  private int counterId;
  
  public ServiceEnd(double time, Customer c, int counterId) {
    super(time);
    this.customer = c;
    this.counterId = counterId;
  }

  @Override
  public String toString() {
    return String.format(": Customer %d service ends (at Counter %d)", this.customer, this.counterId);
  }

  @Override
  public Event[] simulate() {
    Bank.freeCounter(this.counterId);
    return new Event[] {};
  }
}
