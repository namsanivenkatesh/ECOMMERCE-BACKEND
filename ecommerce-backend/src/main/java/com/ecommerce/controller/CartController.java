package com.ecommerce.controller;

import com.ecommerce.model.CartItem;
import com.ecommerce.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public CartItem addItemToCart(@RequestBody CartItem cartItem) {
        return cartService.addItem(cartItem);
    }

    @PutMapping("/update")
    public CartItem updateCartItem(@RequestBody CartItem cartItem) {
        return cartService.updateCartItem(cartItem);
    }

    @DeleteMapping("/remove/{id}")
    public void removeItemFromCart(@PathVariable Long id) {
        cartService.removeCartItem(id);
    }

    @GetMapping
    public List<CartItem> getCartItems() {
        return cartService.getCartItems();
    }
}
