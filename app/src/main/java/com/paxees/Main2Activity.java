package com.paxees;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.paxees.Utils.cLog;

public class Main2Activity extends AppCompatActivity implements ResponseListner, ICalculator {

    ImplementationClass  implementationClass;
    SumUpClass sumUpClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        implementationClass=new ImplementationClass(this);
        implementationClass.isCheck("zeeshan","");
        sumUpClass=new SumUpClass(this,Main2Activity.this);
        try {
            for(int i=0;i<5;i++) {
                sumUpClass.setValue(2, Integer.valueOf(i--));
                sumUpClass.printMyValue("zbrdst");
            }
        }catch (Exception e){
            cLog.Logs(this,e.getMessage(),false,true,false);
        }
    }

    @Override
    public void isSuccess() {
        Toast.makeText(this, "successs", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void isFailure() {
        Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void validationError() {
        Toast.makeText(this, "validation Error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(int viewID) {

    }

    @Override
    public void add(Integer a, Integer b) {
        Integer c=a+b;

        Toast.makeText(this, ""+c, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void min(Integer a, Integer b) {
        Integer c=a-b;
        Toast.makeText(this, ""+c, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mult(Integer a, Integer b) {
        Integer c=a*b;
        Toast.makeText(this, ""+c, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void div(Integer a, Integer b) {
        Integer c=a/b;
        Toast.makeText(this, ""+c, Toast.LENGTH_SHORT).show();
    }
}
