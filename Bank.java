class Bank { 
  private static Counter[] counters; //only one instance of counters 

  public Bank(int numOfCounters){
    counters = new Counter[numOfCounters];
    
    for(int i = 0; i < numOfCounters; i = i + 1) {
      counters[i] = new Counter(i, true);
    }
  }
  
  public static boolean assignCounter(Customer c) {
    for(int i = 0; i < counters.length; i++) {
      if(counters[i].isAvailable()) { 
        counters[i].setAvailability(false); //assign a customer to a counter if available
        return true; //assigned
      }
    }
    return false; //counter is occupied
  }

  public static void freeCounter(int counterId) {
    counters[counterId].setAvailability(true);
  } //counter become free again
}
