package app.com.example.android.myapplicationlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_1 = (Button)findViewById(R.id.button);
        button_1.setText("热门电影");
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用:热门电影", Toast.LENGTH_SHORT).show();
            }
        });

        Button button_2 = (Button)findViewById(R.id.button2);
        button_2.setText("股票雄鹰");
        button_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用:股票雄鹰", Toast.LENGTH_SHORT).show();
            }
        });

        Button button_3 = (Button)findViewById(R.id.button3);
        button_3.setText("XY阅读器");
        button_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用:XY阅读器", Toast.LENGTH_SHORT).show();
            }
        });

        Button button_4 = (Button)findViewById(R.id.button4);
        button_4.setText("最新闻");
        button_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用:最新闻", Toast.LENGTH_SHORT).show();
            }
        });

        Button button_5 = (Button)findViewById(R.id.button5);
        button_5.setText("毕业设计");
        button_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "启动应用:毕业设计", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
