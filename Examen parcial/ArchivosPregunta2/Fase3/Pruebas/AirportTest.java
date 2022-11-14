import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {
    //Refactorización de la clase AirportTest. Pregunta3
    @DisplayName("Dado que hay un vuelo economico")
    @Nested
    class EconomyFlightTest {

        private Flight economyFlight;
        private Passenger jessica;
        private Passenger cesar;

        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("1");
            jessica = new Passenger("Jessica", false);
            cesar = new Passenger("Cesar", true);
        }

        @Test
        public void testEconomyFlightRegularPassenger() {


            assertEquals("1", economyFlight.getId());
            assertEquals(true, economyFlight.addPassenger(jessica));
            assertEquals(1, economyFlight.getPassengersList().size());
            assertEquals("Jessica", economyFlight.getPassengersList().get(0).getName());

            assertEquals(true, economyFlight.removePassenger(jessica));
            assertEquals(0, economyFlight.getPassengersList().size());
        }

        @Test
        public void testEconomyFlightVipPassenger() {


            assertEquals("1", economyFlight.getId());
            assertEquals(true, economyFlight.addPassenger(cesar));
            assertEquals(1, economyFlight.getPassengersList().size());
            assertEquals("Cesar", economyFlight.getPassengersList().get(0).getName());

            assertEquals(false, economyFlight.removePassenger(cesar));
            assertEquals(1, economyFlight.getPassengersList().size());
        }

    }

    @DisplayName("Dado que hay un vuelo negocios")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;
        private Passenger jessica;
        private Passenger cesar;

        @BeforeEach
        void setUp() {
            businessFlight = new BusinessFlight("2");
            jessica = new Passenger("Jessica", false);
            cesar = new Passenger("Cesar", true);
        }

        @Test
        public void testBusinessFlightRegularPassenger() {


            assertEquals(false, businessFlight.addPassenger(jessica));
            assertEquals(0, businessFlight.getPassengersList().size());
            assertEquals(false, businessFlight.removePassenger(jessica));
            assertEquals(0, businessFlight.getPassengersList().size());

        }

        @Test
        public void testBusinessFlightVipPassenger() {

            assertEquals(true, businessFlight.addPassenger(cesar));
            assertEquals(1, businessFlight.getPassengersList().size());
            assertEquals(false, businessFlight.removePassenger(cesar));
            assertEquals(1, businessFlight.getPassengersList().size());

        }

    }

}