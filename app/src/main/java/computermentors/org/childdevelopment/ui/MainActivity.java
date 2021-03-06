package computermentors.org.childdevelopment.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Date;

import computermentors.org.childdevelopment.R;
import computermentors.org.childdevelopment.model.Calculate;
import computermentors.org.childdevelopment.ui.MilestoneActivity;


public class MainActivity extends ActionBarActivity {

    private Calculate mCalculate= new Calculate();
    private DatePicker mBirthDatePicker;
    private EditText mPrematureEditText;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBirthDatePicker = (DatePicker)findViewById(R.id.birthDatePicker);
        mPrematureEditText = (EditText)findViewById(R.id.prematureEditText);
        mStartButton = (Button)findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker birth = mBirthDatePicker;
                String value = mPrematureEditText.getText().toString();
                if(value.equals("")){
                    value = "0";
                }

                int premature = Integer.parseInt(value);

                Date trueDate = mCalculate.Calculate(birth, premature);
                int years = mCalculate.getYear(trueDate);
                int months = mCalculate.getMonth(trueDate);
                boolean early = false;
                if (premature > 0){
                    early = true;
                }


                startMilestone(years, months, early);
            }
        });
    }

    private void startMilestone(int years, int months, boolean premature) {
        Intent intent = new Intent(this, MilestoneActivity.class);
        intent.putExtra("years", years);
        intent.putExtra("months", months);
        intent.putExtra("perfect", premature);
        startActivity(intent);
    }

}
