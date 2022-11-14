package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class InvoiceTest {


        @Test
        void test1() {
            Invoice invoice = new Invoice(new BigDecimal("2500"),"NL",
                    CustomerType.COMPANY);
            double v = invoice.calculate();
            assertThat(v).isEqualTo(250);
        }


}