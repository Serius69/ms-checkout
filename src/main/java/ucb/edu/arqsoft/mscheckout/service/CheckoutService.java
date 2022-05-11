package ucb.edu.arqsoft.mscheckout.service;

import org.springframework.stereotype.Service;
import ucb.edu.arqsoft.mscheckout.dto.*;
@Service
public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
