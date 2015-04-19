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
    private Milestones mMilestones = new Milestones();
    private Button mReturnButton;


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

        if(mYear > 5){
            loadPage(9);
        }
        else if (mYear < 5) {
            loadPage(8);
        }
        else if(mYear < 4) {
            loadPage(7);
        }
        else if(mYear < 3) {
            loadPage(6);
        }
        else if(mYear < 2 || (mYear == 1 && mMonths > 6)) {
            loadPage(5);
        }
        else if(mYear == 1 && mMonths >= 0) {
            loadPage(4);
        }
        else if(mYear == 0 && mMonths > 9) {
            loadPage(3);
        }
        else if(mYear == 0 && mMonths > 6) {
            loadPage(2);
        }
        else if(mYear == 0 && mMonths > 3) {
            loadPage(1);
        }
        else {
            loadPage(0);
        }

        Toast.makeText(MilestoneActivity.this, "Years: " + mYear + ", " + "Months: " + mMonths, Toast.LENGTH_LONG).show();
    }

    private void loadPage(int choice){
        mCurrentPage = mMilestones.getPage(choice);

        Drawable drawable = getResources().getDrawable(mCurrentPage.getImageId());
        mImageView.setImageDrawable(drawable);

        String pageText = mCurrentPage.getText();
        //Add name if placeholder is included
        pageText = String.format(pageText);
        mTextView.setText(pageText);


    }



}
