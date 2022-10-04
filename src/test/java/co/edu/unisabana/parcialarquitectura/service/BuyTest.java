package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.service.port.Verify;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import co.edu.unisabana.parcialarquitectura.service.model.Info;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class BuyTest {

    @InjectMocks
    private Buy buy;

    @Mock
    private Verify verify;


    @Test
    public void Given_Data_Buy_When_Right_Data_Then_Succesfull() {
        Info info = new Info();
        info.setVendorCode(2);
        info.setBuyerCode(3);
        info.setItem("Books");
        int result = Integer.parseInt(buy.makePurchase(info));
        Assertions.assertEquals(1,result);
        }
    }

