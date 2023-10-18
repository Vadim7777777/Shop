import orders.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Orders {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/list")
    public List<Order> listOrder() {
        return orderService.list();
    }
}
