package Repository;

import Entity.Cart;
import Entity.CartLineItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartLineItemRepository extends JpaRepository<CartLineItem, Long> {
    List<CartLineItem> findByCart(Cart cart);
}