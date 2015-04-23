package computermentors.org.childdevelopment.model;

import computermentors.org.childdevelopment.R;

/**
 * Created by CryoFlar3 on 4/19/2015.
 */
public class Headers {
    private Page[] mPages;

    public Headers() {
        mPages = new Page[10];

        mPages[0] = new Page(
                R.drawable.page0,
                "Age 0 - 3 months",
                "I may see my child...",
                "At this age, it is important to spend a lot of time touching, looking at, cuddling, playing, reading to and talking to your baby.",
                "Consult your pediatrician if your child...");

        mPages[1] = new Page(
                R.drawable.page1,
                "Age 3 - 6 months",
                "I may see my child...",
                "At this age, your baby is showing his /her personality. Reading, playing, touching, and talking will all be things that stimulate your baby’s brain development.",
                "Consult your pediatrician if your child...");

        mPages[2] = new Page(
                R.drawable.page2,
                "Age 6 - 9 months",
                "I may see my child...",
                "At this age it is important to set up an environment that is safe for your baby to explore in. He / she is becoming more mobile and social.",
                "Consult your pediatrician if your child...");

        mPages[3] = new Page(
                R.drawable.page3,
                "Age 9 - 12 months",
                "I may see my child...",
                "At this age your child is expressing feelings with gestures, sounds and facial expressions. He / she starts to understand cause and effect. A consistent routine is very helpful.",
                "Consult your pediatrician if your child...");

        mPages[4] = new Page(
                R.drawable.page4,
                "Age 12 - 18 Months",
                "I may see my child...",
                "At this age your child is gaining confidence, showing more curiosity and a better understanding of the world around him / her. A careful balance between encouragement and safe boundaries are very important.",
                "Consult your pediatrician if your child...");

        mPages[5] = new Page(
                R.drawable.page5,
                "Age 18 - 24 months",
                "I may see my child...",
                "At this age my child is copying what he / she sees and is trying to be more independent. My child gets frustrated when told “no” and sometimes offering choices instead of saying “no” works better.",
                "Consult your pediatrician if your child...");

        mPages[6] = new Page(
                R.drawable.page6,
                "Age 2 - 3 years",
                "I may see my child...",
                "At this age it is important to encourage your child’s imagination and fantasy through play, reading, talking, etc. He / she may start to no longer need afternoon naps and resist bedtime.",
                "Consult your pediatrician if your child...");

        mPages[7] = new Page(
                R.drawable.page6,
                "Age 3 - 4 years",
                "I may see my child...",
                "At this age my child may get frustrated easily but is also gaining more self-control. It is important to be able to model self-control and patience yourself.",
                "Consult your pediatrician if your child...");

        mPages[8] = new Page(
                R.drawable.page6,
                "Age 4 - 5 years",
                "I may see my child...",
                "At this age my child will be getting ready to start Kindergarten. It is important to help my child by making sure that he / she gets enough sleep, is used to following rules & directions, and interacts well with peers. ",
                "Consult your pediatrician if your child...");

        mPages[9] = new Page(
                R.drawable.page6,
                "Age 6 years and up",
                "",
                "Your child is to old for the scope of this App.",
                " ");
    }
    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
}
