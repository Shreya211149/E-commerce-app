package com.genie.Ecommerce.repo;

import com.genie.Ecommerce.entities.Orders;
import com.genie.Ecommerce.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends CrudRepository<Orders,Long> {
    @Query("SELECT o from Orders o Join Fetch o.user")
    List<Orders> findAllOrdersWithUsers();

    List<Orders> findByUser(User user);
}
