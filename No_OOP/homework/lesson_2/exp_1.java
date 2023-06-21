package No_OOP.homework.lesson_2;

/**
 * Написать калькулятор в ООП стиле(инкапсуляция, наследованеи. полиморфизм)
 */

public class exp_1 {
    public static void main(String[] args) {
        Operations res = new Simple_calc();
        res.get_summ(2.0,2.0);
        System.out.println(res);
        res.get_subst(2.0,2.0);
        System.out.println(res);
        res.get_mult(2.0,2.0);
        System.out.println(res);
        res.get_div(2.0,2.0);
        System.out.println(res);
    }
}