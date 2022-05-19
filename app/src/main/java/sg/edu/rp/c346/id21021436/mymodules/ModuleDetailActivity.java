package sg.edu.rp.c346.id21021436.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSemester;
    TextView tvCredit;
    TextView tvVenue;
    String tvNameOut;
    String tvYearOut;
    String tvSemesterOut;
    String tvCreditOut;
    String tvVenueOut;
    Button back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewModuleCodeSpecific);
        Intent intentReceived = getIntent();
        String codeReceived = intentReceived.getStringExtra("Code");
        tvCode.setText(codeReceived);

        switch(codeReceived){
            case "C346":
                tvNameOut = getString(R.string.c346CourseName);
                tvYearOut = "2022";
                tvSemesterOut = "1";
                tvCreditOut = "4";
                tvVenueOut = getString(R.string.c346Venue);
                break;

            case "C229":
                tvNameOut = getString(R.string.c229CourseName);
                tvYearOut = "2022";
                tvSemesterOut = "1";
                tvCreditOut = "4";
                tvVenueOut = getString(R.string.c229Venue);
                break;

            case "C328":
                tvNameOut = getString(R.string.c328CourseName);
                tvYearOut = "2022";
                tvSemesterOut = "1";
                tvCreditOut = "4";
                tvVenueOut = getString(R.string.c328Venue);
                break;

            case "C331":
                tvNameOut = getString(R.string.c331CourseName);
                tvYearOut = "2022";
                tvSemesterOut = "1";
                tvCreditOut = "4";
                tvVenueOut = getString(R.string.c331Venue);
                break;

            case "C203":
                tvNameOut = getString(R.string.c203CourseName);
                tvYearOut = "2022";
                tvSemesterOut = "1";
                tvCreditOut = "4";
                tvVenueOut = getString(R.string.c203Venue);
                break;

        }

        tvName = findViewById(R.id.textViewModuleNameSpecific);
        tvName.setText(tvNameOut);

        tvYear = findViewById(R.id.textViewAcademicYearSpecific);
        tvYear.setText(tvYearOut);

        tvSemester = findViewById(R.id.textViewSemesterSpecific);
        tvSemester.setText(tvSemesterOut);

        tvCredit = findViewById(R.id.textViewModuleCreditSpecific);
        tvCredit.setText(tvCreditOut);

        tvVenue = findViewById(R.id.textViewVenueSpecific);
        tvVenue.setText(tvVenueOut);

        back = findViewById(R.id.buttonBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });





    }
}