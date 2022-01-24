package com.toolstore.session;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import com.toolstore.model.Cart;
import com.toolstore.model.User;

@Component
@SessionScope
public class SessionObject {
    private User user = null;
    final Cart cart = new Cart();

    public boolean isLogged() {
        return this.user != null;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cart getCart() {
        return cart;
    }
}
