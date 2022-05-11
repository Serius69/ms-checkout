package ucb.edu.arqsoft.mscheckout.dto;

import ucb.edu.arqsoft.mscheckout.entity.*;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
