package computermentors.org.childdevelopment.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
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
    private TextView mHeaderView;
    private TextView mTextView;
    private TextView mProgressTextView;
    private TextView mCautionTextView;
    private Page mCurrentPage;
    private Headers mHeaders = new Headers();
    private ListView lv1 = null;
    private ListView lv2 = null;
    private Milestone mMilestone = new Milestone();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milestone);

        String[] array1 = {"a", "b", "c", "d", "e", "f"};
        String[] array2 = {"red", "blue", "gold", "white", "black", "orange", "silver"};
        String[] array3 = {"r", "s", "t", "u", "v", "w", "x"};

        String[][] arrays = {array1, array2};

        mHeaderView = (TextView)findViewById(R.id.headerTextView);
        mTextView = (TextView)findViewById(R.id.milestoneTextView);
        mProgressTextView = (TextView)findViewById(R.id.progressTextView);
        mCautionTextView = (TextView)findViewById(R.id.cautionTextView);

        lv1 = (ListView) findViewById (R.id.list1);
        lv2 = (ListView) findViewById (R.id.list2);

        lv1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrays[0]));
        lv2.setAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, arrays[1]));



        Intent intent = getIntent();
        mYear = intent.getIntExtra("years", 0);
        mMonths = intent.getIntExtra("months", 0);

        if(mYear > 5){
            loadPage(9);
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
        else {
            loadPage(0);
        }




        Toast.makeText(MilestoneActivity.this, "Years: " + mYear + ", " + "Months: " + mMonths, Toast.LENGTH_LONG).show();
    }

    private void loadPage(int choice){
        mCurrentPage = mHeaders.getPage(choice);

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
        mCautionTextView.setText(pageSub2);



    }

    private void startMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
