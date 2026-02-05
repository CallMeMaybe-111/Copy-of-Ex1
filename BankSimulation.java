import java.util.Scanner;

/**
 * This class implements a bank simulation.
 *
 * @author Wei Tsang
 * @version CS2030S AY25/26 Semester 2
 */
class BankSimulation extends Simulation {
  /**
   * The availability of counters in the bank.
   */
  public boolean[] available;

  /**
   * The list of customer arrival events to populate
   * the simulation with.
   */
  public Event[] initEvents;

  /**
   * Constructor for a bank simulation.
   *
   * @param sc A scanner to read the parameters from.  The first
   *           integer scanned is the number of customers; followed
   *           by the number of service counters.  Next is a
   *           sequence of (arrival time, service time) pair, each
   *           pair represents a customer.
   */
  public BankSimulation(Scanner sc) {
    initEvents = new Event[sc.nextInt()];
    int numOfCounters = sc.nextInt();

    available = new boolean[numOfCounters];
    for (int i = 0; i < numOfCounters; i++) {
      available[i] = true;
    }

    int id = 0;
    while (sc.hasNextDouble()) {
      double arrivalTime = sc.nextDouble();
      double serviceTime = sc.nextDouble();
      initEvents[id] = new Arrival(new Customer(id), arrivalTime); //creating an array with the size of no. of customer & put the event Arrival inside -> contains Customer w ID and their arrival time
      id += 1;
    }
  }

  /**
   * Retrieve an array of events to populate the
   * simulator with.
   *
   * @return An array of events for the simulator.
   */
  @Override
  public Event[] getInitialEvents() {
    return initEvents;
  }
}
