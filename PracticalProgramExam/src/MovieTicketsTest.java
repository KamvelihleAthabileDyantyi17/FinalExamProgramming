import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovieTicketsTest {

    @Test
    void calculateTotalTickets() {
        // Arrange
        MovieTickets movieTickets = new MovieTickets();
        int numberOfTickets = 3;
        double ticketPrice = 10.0;
        double expectedTotal = 3 * 10.0;

        // Act
        double actualTotal = movieTickets.calculateTotalTickets(numberOfTickets, ticketPrice);

        // Assert
        assertEquals(expectedTotal, actualTotal, "Total ticket price calculation is incorrect.");
    }

    @Test
    void validateData() {
        // Arrange
        MovieTickets movieTickets = new MovieTickets();
        MovieTicketData validData = new MovieTicketData("Example Movie", 10.0, 3); // assuming constructor exists
        MovieTicketData invalidData = new MovieTicketData("", -5.0, 0); // invalid values

        // Act & Assert
        assertTrue(movieTickets.validateData(validData), "Expected data to be valid.");
        assertFalse(movieTickets.validateData(invalidData), "Expected data to be invalid.");
    }
}
