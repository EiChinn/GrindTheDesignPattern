package com.eichinn.composite.practical;

/**
 * Created by ei_chinn on 2017/5/31.
 */
public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
