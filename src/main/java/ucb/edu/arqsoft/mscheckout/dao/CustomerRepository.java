package ucb.edu.arqsoft.mscheckout.dao;

import ucb.edu.arqsoft.mscheckout.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

}
