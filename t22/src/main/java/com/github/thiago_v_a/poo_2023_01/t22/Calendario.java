package com.github.thiago_v_a.poo_2023_01.t22;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Calendario {
    private List<Date> datas;

    public List<Date> getDatas() {
        return datas;
    }

    public void setDatas(List<Date> value) {
        datas = value;
    }

    public Calendario() {
        this.setDatas(new ArrayList<Date>());
    }

    public void mostrarDatas() {
        int i = 0;
        for (Date data : getDatas()) {
            System.out.println("#" + (++i) + "- " + data);
        }
    }
}
