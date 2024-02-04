package seminars.first.Calculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
//        if (8 != Calculator.calculation(2, 6, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (0 != Calculator.calculation(2, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (14 != Calculator.calculation(2, 7, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//
//        if (2 != Calculator.calculation(100, 50, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }

        // Случаи с неправильными аргументами
        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
        // try {
        //     seminars.first.Calculator.Calculator.calculation(8, 4, '_');
        // } catch (IllegalStateException e) {
        //     if (!e.getMessage().equals("Unexpected value operator: _")) {
        //         throw new AssertionError("Ошибка в методе");
        //     }
        // }

        // Проверка базового функционала с целыми числами, с использованием утверждений:
//        assert 8 == Calculator.calculation(2, 6, '+');
//        assert 0 == Calculator.calculation(2, 2, '-');
//        assert 14 == Calculator.calculation(2, 7, '*');
//        assert 2 == Calculator.calculation(100, 50, '/');

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() ->
                Calculator.calculation(8, 6, '!')
        ).isInstanceOf(IllegalStateException.class);
        assertThatThrownBy(() ->
                Calculator.calculation(8, 0, '/')
        ).isInstanceOf(ArithmeticException.class);


//        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
//        System.out.println(Calculator.squareRootExtraction(3));


        assertThat(seminars.first.Calculator.Calculator.squareRootExtraction(0.0)).isEqualTo(0.0);
        assertThat(seminars.first.Calculator.Calculator.squareRootExtraction(16.0)).isEqualTo(4.0);
        assertThatThrownBy(() ->
                seminars.first.Calculator.Calculator.squareRootExtraction(-3.0))
                .isInstanceOf(IllegalArgumentException.class);


        assertThat(seminars.first.Calculator.Calculator.calculatingDiscount(100, 10)).isEqualTo(90);
        assertThatThrownBy(() -> seminars.first.Calculator.Calculator.
                calculatingDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid arguments");
        assertThatThrownBy(() -> seminars.first.Calculator.Calculator.
                calculatingDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid arguments");
        assertThatThrownBy(() -> seminars.first.Calculator.Calculator.
                calculatingDiscount(100, 110))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid arguments");

    }





}