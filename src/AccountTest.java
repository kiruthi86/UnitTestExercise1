import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class AccountTest {
      Account accountTest;
      Customer customerTest;
      @BeforeEach
      public void setUp(){
          this.customerTest = new Customer("Kiruthika",35,0.4);
          this.accountTest = new Account(this.customerTest);
      }

   @Test
    public void  creditScoreTooLowTest(){
          Assertions.assertEquals(1.0,accountTest.getInterest());
    }


}
