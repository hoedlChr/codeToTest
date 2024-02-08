import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CarTest {

    Car myCar;

    @BeforeEach
    void initializeClass(){
        myCar = new Car("Citroen", "Black", 100000, 2017);
    }

    @Test
    @DisplayName("Fucking Test one")
    void  testProperties(){
        Assertions.assertEquals("Black", myCar.getColor());
    }

}