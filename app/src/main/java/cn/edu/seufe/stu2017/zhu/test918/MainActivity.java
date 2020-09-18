package cn.edu.seufe.stu2017.zhu.test918;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        TextView tv1 = findViewById(R.id.editText);
        double oriTem = Double.valueOf(tv1.getText().toString());
        double ansTem = (oriTem*9/5)+32;
        TextView tv2 = findViewById(R.id.textView3);
        tv2.setText("华氏温度为:"+String.valueOf(ansTem));
    }
    public void myclick(View v){
        onClick(v);
    }
}