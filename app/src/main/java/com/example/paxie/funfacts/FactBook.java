package com.example.paxie.funfacts;

import java.util.Random;

/**
 * Created by paxie on 6/7/15.
 */
public class FactBook {

    // Member variables (properties about the object)

    public String[] mFacts = {
            "Searing meat does not seal in moisture, and in fact may actually cause meat to lose moisture in comparison to an equivalent amount of cooking without searing. Generally, the value in searing meat is that it creates a brown crust with a rich flavor via the Maillard reaction.",
            "Some people believe that food items cooked with wine or liquor will be totally non-alcoholic, because alcohol's low boiling point causes it to evaporate quickly when heated. However, a study found that some of the alcohol remains: 25 percent after one hour of baking or simmering, and 10 percent after two hours; in either case, however, the amount consumed while eating a dish prepared with alcohol will rarely if ever contain sufficient alcohol to cause even low levels of intoxication.",
            "Monosodium glutamate (MSG) has a widespread reputation for triggering migraine headache exacerbations and other symptoms of so-called Chinese restaurant syndrome, but there are no consistent data to support this relationship. Although there have been reports of an MSG-sensitive subset of the population, this has not been demonstrated in placebo-controlled trials.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };

    // Method (abilities: things an object can do

    public String getFact() {
        String fact = "";
        //randomly select another fact
        Random randomGenerator = new Random(); //construct a new random generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];
        return fact;

    }
}
