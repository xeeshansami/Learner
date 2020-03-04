package com.paxees;

import android.content.Context;
import android.widget.Toast;

public class SumUpClass extends printValue{
    ICalculator iCalculator;
    Context  context;
    public SumUpClass(ICalculator iCalculator,Context context) {
        this.iCalculator = iCalculator;
        this.context = context;
    }

    public void setValue(Integer a,Integer b){
        this.iCalculator.add(a,b);
        this.iCalculator.min(a,b);
        this.iCalculator.mult(a,b);
        this.iCalculator.div(a,b);
    }

    @Override
    public void printMyValue(String msg) {
        Toast.makeText(this.context, msg, Toast.LENGTH_SHORT).show();
    }
}
