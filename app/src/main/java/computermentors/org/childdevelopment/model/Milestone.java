package computermentors.org.childdevelopment.model;

/**
 * Created by CryoFlar3 on 4/23/15.
 */
public class Milestone {


    public String[] getMilestone(int choice){

        String[] milestones0 = {"Making cooing sounds to get my attention",
                "Beginning to develop a social smile",
                "Imitating some of my movements and facial expressions",
                "Raising his / her head and chest when lying on his / her stomach",
                "Opening and shutting his / her hands",
                "Holding a rattle or other small toy briefly before dropping it"};
        String[] milestones1 = {"Respond to his / her own name",
                "Use his / her voice to express joy and displeasure",
                "Transfer objects from one hand to the other",
                "Roll from front to back and back to front",
                "Sit without putting his / her hands down on the ground for support",
                "Show interest in looking at him / herself in the mirror"};
        String[] milestones2 = {"Babbling",
                "Repeating sequences of sounds over and over",
                "Trying to imitate sounds",
                "Trying to get things that are out of reach",
                "Making noises to show displeasure and satisfaction",
                "Picking up small objects with his / her thumb and finger (pincer grasp)",
                "Show some anxiety when your or another caregiver leaves" };
        String[] milestones3 = {"Saying 2 or 3 words besides 'mama' and 'dada'",
                "Trying to imitate familiar words",
                "Looking for and finding hidden objects",
                "Sitting without assistance",
                "Pulling him / herself to stand and maybe walking while holding on to furniture",
                "Being shy or anxious around strangers",
                "Repeating sounds or gestures for attention"};
        String[] milestones4 = {"Walking without help",
                "Holding objects / toys while walking",
                "Turning pages in a book",
                "Using 10 to 20 different words",
                "Understanding the word 'no'",
                "Waving goodbye",
                "Playing games like Pat-A-Cake",
                "Showing a lot of affection",
                "Scribbling with a crayon" };
        String[] milestones5 = {"Being able to identify body parts",
                "Having conversations with him / herself, toys, dolls, etc.",
                "Using sentences of 2 to 3 words",
                "Make believe / fantasy play",
                "Running and kicking a ball",
                "Pulling toys behind him / herself while walking",
                "Getting more exited about being around other children",
                "Showing some deviant behavior"};
        String[] milestones6 = {"Identifying some colors by name",
                "Practicing new words through talking to him / herself",
                "Singing songs",
                "Matching objects in his / her hand to objects in a book",
                "Running easily",
                "Pedalling a Tricycle",
                "Being able to screw and unscrew lids",
                "Imitating others",
                "Beginning to play alone"};
        String[] milestones7 = {"Identifying different shapes by name",
                "Using sentences of 4 / 5 words",
                "Using past tense correctly",
                "Naming several colors",
                "Being able to count a few numbers",
                "Drawing a person with 2 / 4 body parts",
                "Cooperating with other children",
                "Playing 'mom' or 'dad'",
                "Being more independent"};
        String[] milestones8 = {"Being able to tell his / her own address",
                "Identifying coins by name",
                "Using past, present, or future tense",
                "Knowing his / her own right and left",
                "Counting 10 or more objects",
                "Being able to draw a person with a body",
                "Showing an understanding of time",
                "Wanting to be like his / her own friends",
                "Being more agreeable to rules"};
        String[] milestones9 = {""};


        String[][] milestones = {milestones0, milestones1, milestones2, milestones3, milestones4, milestones5, milestones6, milestones7, milestones8, milestones9};

        return milestones[choice];


    }

    public String[] getCaution(int choice){

        String[] caution0 = {"Does not notice his / her own hands",
                "Does not visually follow moving objects",
                "Does not smile",
                "Does not reach or grab for things",
                "Cannot support his / her head well",
                "Does not pay attention to new faces"};
        String[] caution1 = {"Seems very stiff with tight muscles or very floppy like a rag doll",
                "Does not laugh or make squealing sounds",
                "Does not turn his / her head to locate sounds",
                "Cannot sit with help or roll",
                "Does not seem to enjoy being around people" };
        String[] caution2 = {"Does not babble",
                "Is not interested in games like Peek-A-Boo",
                "Does not follow objects with both eyes",
                "Cannot sit when supported",
                "Does not reach for objects",
                "Does not turn head to locate sounds"};
        String[] caution3 = {"Does not crawl",
                "Cannot stand when supported",
                "Does not say words",
                "Does not point to objects or pictures",
                "Does not show affection for you or other caregivers",
                "Does not enjoy being around people" };
        String[] caution4 = {"Does not point to objects or pictures",
                "Does not crawl or walk",
                "Cannot stand with support",
                "Has less than 10 words",
                "Does not use gestures like waving goodbye"};
        String[] caution5 = {"Cannot walk",
                "Does not say at least 15 words",
                "Does not use 2 word sentances",
                "Does not follow simple instructions",
                "Cannot push a wheeled toy",
                "Does not imitate actions or words"};
        String[] caution6 = {"Has very unclear speech",
                "Cannot copy a circle",
                "Shows no interest in pretend play",
                "Does not understand simple instructions",
                "Has difficulty handling small objects",
                "Falls frequently"};
        String[] caution7 = {"Cannot throw a ball overhead",
                "Cannot hold a pencil or crayon correctly",
                "Still is very anxious when you or another caregiver leaves",
                "Ignores or has no interest in other children",
                "Does not engage in pretend / fantasy play",
                "Does not use sentences of more than three words"};
        String[] caution8 = {"Acts extremely fearful or timid",
                "Is unable to seperate from you or another caregiver",
                "Refuses to respond to people",
                "Does not express a wide range of emotion",
                "Cannot give first and last name",
                "Cannot do self-care skills like brushing teeth or washing / drying hands"};
        String[] caution9 = {""};


        String[][] milestones = {caution0, caution1, caution2, caution3, caution4, caution5, caution6, caution7, caution8, caution9};

        return milestones[choice];


    }
}
