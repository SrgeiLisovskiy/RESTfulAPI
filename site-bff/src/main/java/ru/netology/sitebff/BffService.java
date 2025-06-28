package ru.netology.sitebff;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestClient;
import ru.netology.orders.Order;
import ru.netology.users.User;

@Service
public class BffService {
    @Value("${user.service.uri}")
    private String userServiceUri;

    @Value("${order.service.uri}")
    private String orderServiceUri;

    public UserOrders getById(int userId) {
        var restClient = RestClient.create();

        User user = restClient.get()
                .uri(userServiceUri + "/api/users/{userId}", userId)
                .retrieve()
                .body(User.class);

        Order order = restClient.get()
                .uri(orderServiceUri + "/api/orders/by-user/{userId}", userId)
                .retrieve()
                .body(Order.class);
        UserOrders userOrders = new UserOrders(user,order);
        return new UserOrders(user, order);
    }
}
