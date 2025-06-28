package ru.netology.sitebff;

import lombok.Data;
import ru.netology.orders.Order;
import ru.netology.users.User;

@Data
public class UserOrders {
    private User user;
    private Order order;

    public UserOrders(User user, Order order) {
        this.user = user;
        this.order = order;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public Order getOrder() {
        return order;
    }
}
