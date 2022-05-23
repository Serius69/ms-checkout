package ucb.edu.arqsoft.mscheckout.controller;

import ucb.edu.arqsoft.mscheckout.dto.*;
import ucb.edu.arqsoft.mscheckout.service.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("https://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        return checkoutService.placeOrder(purchase);
    }

}









