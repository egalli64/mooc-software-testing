package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

class DiscountApplierTest {
    @Test
    void plain() {
        Product home = new Product("home", 100, "HOME");
        Product biz = new Product("biz", 100, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);
        List<Product> results = Arrays.asList(home, biz);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier disc = new DiscountApplier(dao);
        disc.setNewPrices();

        Assertions.assertEquals(90.0, home.getPrice(), 0.001);
        Assertions.assertEquals(110.0, biz.getPrice(), 0.001);
    }
}
