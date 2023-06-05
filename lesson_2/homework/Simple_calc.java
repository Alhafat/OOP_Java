package lesson_2.homework;

public class Simple_calc extends Operations {

    private Double value_1;
    private Double value_2;

    public Double getValue_1() {
        return value_1;
    }

    public void setValue_1(Double value_1) {
        this.value_1 = value_1;
    }

    public Double getValue_2() {
        return value_2;
    }

    public void setValue_2(Double value_2) {
        this.value_2 = value_2;
    }

    public Simple_calc() {
        super();
        setValue_1(null);
        setValue_2(null);
    }

    @Override
    public String toString() {
        return "Simple_calc [value_1=" + getValue_1() + ", value_2=" + getValue_2() + ", result=" + getResult() + "]";
    }

    @Override
    public Double get_summ(Double value_1, Double value_2) {
        setValue_1(value_1);
        setValue_2(value_2);
        setResult(getValue_1() + getValue_2());
        return getResult();
    }

    @Override
    public Double get_subst(Double value_1, Double value_2) {
        setValue_1(value_1);
        setValue_2(value_2);
        setResult(getValue_1() - getValue_2());
        return getResult();
    }

    @Override
    public Double get_mult(Double value_1, Double value_2) {
        setValue_1(value_1);
        setValue_2(value_2);
        setResult(getValue_1() * getValue_2());
        return getResult();
    }

    @Override
    public Double get_div(Double value_1, Double value_2) {
        setValue_1(value_1);
        setValue_2(value_2);
        setResult(getValue_1() / getValue_2());
        return getResult();
    }

    @Override
    public Double getResult() {
        return super.result;
    }

    @Override
    public void setResult(Double result) {
        super.result = result;
    }
}
