package computermentors.org.childdevelopment.model;

import computermentors.org.childdevelopment.R;

/**
 * Created by CryoFlar3 on 4/19/2015.
 */
public class Milestones {
    private Page[] mPages;

    public Milestones() {
        mPages = new Page[10];

        mPages[0] = new Page(
                R.drawable.page0,
                "Age 0 - 3 months",
                "Page 1");

        mPages[1] = new Page(
                R.drawable.page1,
                "Age 3 - 6 months",
                "Page 2");

        mPages[2] = new Page(
                R.drawable.page2,
                "Age 6 - 9 months",
                "Page 2");

        mPages[3] = new Page(
                R.drawable.page3,
                "Age 9 - 12 months",
                "Page 3");

        mPages[4] = new Page(
                R.drawable.page4,
                "Age 12 - 18 Months",
                "Page 4");

        mPages[5] = new Page(
                R.drawable.page5,
                "Age 18 - 24 months",
                "Page 5");

        mPages[6] = new Page(
                R.drawable.page6,
                "Age 2 - 3 years",
                "Page 6");

        mPages[7] = new Page(
                R.drawable.page6,
                "Age 3 - 4 years",
                "Page 7");

        mPages[8] = new Page(
                R.drawable.page6,
                "Age 4 - 5 years",
                "Page 8");

        mPages[9] = new Page(
                R.drawable.page6,
                "Age 6 years and up",
                "Your child is to old for the scope of this App.");
    }
    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
}
