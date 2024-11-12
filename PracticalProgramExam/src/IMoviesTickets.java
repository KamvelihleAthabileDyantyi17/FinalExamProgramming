public interface IMoviesTickets {

    // Calculates the total ticket price given the number of tickets and price per ticket
    double calculateTotalTickets(int numberOfTickets, double ticketPrice);

    // Validates the data related to movie tickets
    boolean validateData(MovieTicketData movieTicketData);

    // Getters and Setters for movie ticket properties
    String getMovieName();
    void setMovieName(String movieName);

    double getTicketPrice();
    void setTicketPrice(double ticketPrice);

    int getNumberOfTickets();
    void setNumberOfTickets(int numberOfTickets);
}
