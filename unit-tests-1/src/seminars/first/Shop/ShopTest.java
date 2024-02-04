package seminars.first.Shop;
import java.util.*;
import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        Shop testShop = new Shop();
        testShop.setProducts(getTestListProducts());
// проверяем утверждение, что магазин хранит верное количество продуктов
        assertThat(testShop.getProducts()).hasSize(5);
// проверяем утверждение, что магазин возвращает самый дорогой продукт
        assertThat(testShop.getMostExpensiveProduct().getTitle()).isEqualTo("orange");
// проверяем утверждения, что магазин верно сортирует список продуктов
        assertThat(testShop.sortProductsByPrice().get(0).getCost()).isEqualTo(40);
        assertThat(testShop.sortProductsByPrice().get(1).getCost()).isEqualTo(50);
        assertThat(testShop.sortProductsByPrice().get(2).getCost()).isEqualTo(100);
        assertThat(testShop.sortProductsByPrice().get(3).getCost()).isEqualTo(150);
        assertThat(testShop.sortProductsByPrice().get(4).getCost()).isEqualTo(250);

    }

    //    метод для создания списка продуктов
    static List<Product> getTestListProducts() {

        Product product1 = new Product();
        product1.setTitle("banana");
        product1.setCost(100);

        Product product2 = new Product();
        product2.setTitle("apple");
        product2.setCost(150);

        Product product3 = new Product();
        product3.setTitle("orange");
        product3.setCost(250);

        Product product4 = new Product();
        product4.setTitle("bread");
        product4.setCost(50);

        Product product5 = new Product();
        product5.setTitle("milk");
        product5.setCost(40);

        List<Product> productList = new ArrayList<>();

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        return productList;
    }

}