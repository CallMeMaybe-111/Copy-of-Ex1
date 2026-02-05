class Counter{
  private int counterId;
  private boolean available;

  public Counter(int counterId, boolean available) {
    this.counterId = counterId;
    this.available = available;
  }
  
  public void setAvailability(boolean available) {
    this.available = available;
  }

  public boolean isAvailable() {
    return available;
  }
}
