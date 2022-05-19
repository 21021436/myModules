package sg.edu.rp.c346.id21021436.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvc346;
    TextView tvc229;
    TextView tvc328;
    TextView tvc331;
    TextView tvc203;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvc346 = findViewById(R.id.textViewc346);
        tvc229 = findViewById(R.id.textViewc229);
        tvc328 = findViewById(R.id.textViewc328);
        tvc331 = findViewById(R.id.textViewc331);
        tvc203 = findViewById(R.id.textViewc203);

        tvc346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C346");
                startActivity(intent);
                finish();
            }
        });

        tvc229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C229");
                startActivity(intent);
                finish();
            }
        });

        tvc328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C328");
                startActivity(intent);
                finish();
            }
        });

        tvc331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C331");
                startActivity(intent);
                finish();
            }
        });

        tvc203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Code", "C203");
                startActivity(intent);
                finish();
            }
        });

    }
}