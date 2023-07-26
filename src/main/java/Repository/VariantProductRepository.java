package Repository;

import Entity.VariantProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariantProductRepository extends JpaRepository<VariantProduct, Long> {
}