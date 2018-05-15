public class Passenger implements Comparable<Passenger> {
    private String ticketNumber, name;
    private int priority;

    public Passenger(String ticketNumber, String name, int priority) {
        this.ticketNumber = ticketNumber;
        this.name = name;
        this.priority = priority;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Passenger o) {
        if (o.getPriority() > priority) {
            return -1;
        } else if(o.getPriority() < priority) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return priority + " ";
    }
}
