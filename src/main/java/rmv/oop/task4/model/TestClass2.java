package rmv.oop.task4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TestClass2 {
    private TestClass1 testClass1;
    private Boolean aBoolean;

    private int get100(){
        return 100;
    }

}
