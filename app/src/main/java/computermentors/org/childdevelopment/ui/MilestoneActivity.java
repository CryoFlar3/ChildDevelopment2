package computermentors.org.childdevelopment.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import computermentors.org.childdevelopment.R;
import computermentors.org.childdevelopment.model.Milestones;
import computermentors.org.childdevelopment.model.Page;

public class MilestoneActivity extends ActionBarActivity {

    private int mYear;
    private int mMonths;
    private ImageView mImageView;
    private TextView mTextView;
    private Page mCurrentPage;
    private Button mReturnButton;
    //private Milestones mMilestones = new Milestones();
    //private String mName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milestone);

        mImageView = (ImageView)findViewById(R.id.titleImageView);
        mTextView = (TextView)findViewById(R.id.milestoneTextView);
        mReturnButton = (Button)findViewById(R.id.returnButton);



        Intent intent = getIntent();
        mYear = intent.getIntExtra("years", 0);
        mMonths = intent.getIntExtra("months", 0);

        mReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMenu();
            }
        });


        Toast.makeText(MilestoneActivity.this, "Years: " + mYear + ", " + "Months: " + mMonths, Toast.LENGTH_LONG).show();
    }

    private void startMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
