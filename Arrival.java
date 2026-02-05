class Arrival extends Event{
  private Customer c;

  public Arrival(Customer c, double time) {
    super(time); //calls event's constructor 
    this.c = c;
  }

  @Override
  public String toString() {
    String str = "";
    str = String.format(": Customer %d arrives", this.c.customerId);
  }
  
  @Override
  public Event[] simulate() {
    if(Bank.assignCounter(this.c)) {
      return new Event[] {
        new ServiceBegin(this.getTime(), this.c, 1.0)
       };
    }
    return new Event[] {
      new Departure(this.getTime(), this.c)
    };
  }
}
