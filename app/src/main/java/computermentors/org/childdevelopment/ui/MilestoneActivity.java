package computermentors.org.childdevelopment.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import computermentors.org.childdevelopment.R;
import computermentors.org.childdevelopment.model.Headers;
import computermentors.org.childdevelopment.model.Milestone;
import computermentors.org.childdevelopment.model.Page;

public class MilestoneActivity extends Activity {

    private int mYear;
    private int mMonths;
    private boolean mPremature;
    private TextView mHeaderView;
    private TextView mTextView;
    private TextView mProgressTextView;
    private TextView mCautionTextView;
    private Page mCurrentPage;
    private Headers mHeaders = new Headers();
    private ListView lv1 = null;
    private ListView lv2 = null;
    private Milestone mMilestone = new Milestone();
    private TextView mMilestoneText;
    private TextView mCautionHeaderTextView;
    private Button mBackButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milestone);


        mHeaderView = (TextView)findViewById(R.id.headerTextView);
        mTextView = (TextView)findViewById(R.id.milestoneHeaderTextView);
        mProgressTextView = (TextView)findViewById(R.id.progressTextView);
        mCautionHeaderTextView = (TextView)findViewById(R.id.cautionHeaderTextView);
        mCautionTextView = (TextView)findViewById(R.id.cautionTextView);
        mMilestoneText = (TextView)findViewById(R.id.milestoneTextView);
        mBackButton = (Button)findViewById(R.id.backButton);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMenu();
            }
        });

        Intent intent = getIntent();
        mYear = intent.getIntExtra("years", 0);
        mMonths = intent.getIntExtra("months", 0);
        mPremature = getIntent().getExtras().getBoolean("perfect");


        if(mYear > 5){
            //loadPage(9);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Oops!");
            builder.setMessage("It looks like your child's age is out side the scope of this app. Please Try again!");
            builder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    startMenu();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (mYear > 4) {
            loadPage(8);
        }
        else if(mYear > 3) {
            loadPage(7);
        }
        else if(mYear > 2) {
            loadPage(6);
        }
        else if(mYear > 1 || (mYear == 1 && mMonths > 6)) {
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
        else if (mYear == 0 && mMonths >= 0){
            loadPage(0);
        }
        else if (mYear == 0 && mMonths >= 0 || mPremature == true){
            loadPage(0);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Oops!");
            builder.setMessage("It looks like your child was born in the future! Please try again!");
            builder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    startMenu();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }




        Toast.makeText(MilestoneActivity.this, "Years: " + mYear + ", " + "Months: " + mMonths, Toast.LENGTH_LONG).show();
    }

    private void loadPage(int choice){
        mCurrentPage = mHeaders.getPage(choice);
        String[] milestone = mMilestone.getMilestone(choice);
        String[] caution = mMilestone.getCaution(choice);

        Drawable drawable = getResources().getDrawable(mCurrentPage.getImageId());
        //mImageView.setImageDrawable(drawable);

        String pageSub1 = mCurrentPage.getSubHeader1();
        String pageSub2 = mCurrentPage.getSubHeader2();
        String pageHeader = mCurrentPage.getHeader();
        String pageProgress = mCurrentPage.getProgress();
        //Add name if placeholder is included
        pageSub1 = String.format(pageSub1);
        mHeaderView.setText(pageHeader);
        mTextView.setText(pageSub1);
        mProgressTextView.setText(pageProgress);
        mCautionHeaderTextView.setText(pageSub2);

        StringBuilder builder = new StringBuilder();
        for (String s : milestone) {
            builder.append("\n" + s + "\n");
            mMilestoneText.setText(builder.toString());
        }

        for (String s : caution) {
            builder.append("\n" + s + "\n");
            mCautionTextView.setText(builder.toString());
        }



    }

    private void startMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
