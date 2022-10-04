package co.edu.unisabana.parcialarquitectura.service;


import co.edu.unisabana.parcialarquitectura.repository.Database;
import co.edu.unisabana.parcialarquitectura.service.model.Info;
import co.edu.unisabana.parcialarquitectura.service.port.Verify;
import org.springframework.stereotype.Service;

@Service
public class Buy {

  private final Database data;

  public Buy(Database data) {
    this.data = data;
  }

  public String makePurchase(Info info) {
    if (info.getVendorCode() == info.getVendorCode()) {
      throw new IllegalSaleException(info.getVendorCode(), info.getBuyerCode());
    }
    int result = data.savePurchase(info.getBuyerCode(), info.getItem());
    if (result == 1) {
      return "Product sold";
    } else {
      return "The sale was not possible";
    }
  }
}
