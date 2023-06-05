package lesson_1.lesson_2.homework;

public abstract class Operations implements Calculate {
    
    protected Double result;
    
    public abstract Double getResult();

    public abstract void setResult(Double result);
 
    public Operations() {
        this.result = null;
    }

    
}
