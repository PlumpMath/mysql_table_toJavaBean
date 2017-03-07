package me.tianshuang;

import lombok.Data;

/**
 * Created by Poison on 8/3/2016.
 */
@Data
public class Field {

    private Class clazz;
    private String name;

    public Field(Class clazz, String name) {
        this.clazz = clazz;
        this.name = name;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
