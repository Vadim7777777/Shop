package orders;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Repository
    private OrderRepository orderRepository;

    public List<Order> list() {
    }
}
