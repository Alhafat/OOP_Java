package No_OOP.homework.lesson_2;

import No_OOP.homework.lesson_2.Calculate;

public abstract class Operations implements Calculate {
    
    protected Double result;
    
    public abstract Double getResult();

    public abstract void setResult(Double result);
 
    public Operations() {
        this.result = null;
    }

    
}
