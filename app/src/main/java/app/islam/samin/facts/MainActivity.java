package app.islam.samin.facts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.TestMethod;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    public String fact;
    int randNumberFact;


    List<String> list = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayFact(String fact){
        TextView newFact = (TextView)findViewById(R.id.questionsTextView);
        newFact.setText(fact);
    }

    public void factBank(View view){
        list.add("Banging your head against a wall burns 150 calories an hour.");
        list.add("In the UK, it is illegal to eat mince pies on Christmas Day!");
        list.add("Pteronophobia is the fear of being tickled by feathers!");
        list.add("When hippos are upset, their sweat turns red.");
        list.add("A flock of crows is known as a murder.");
        list.add("“Facebook Addiction Disorder” is a mental disorder identified by Psychologists.");
        list.add("The average woman uses her height in lipstick every 5 years.");
        list.add("29th May is officially “Put a Pillow on Your Fridge Day“.");
        list.add("Cherophobia is the fear of fun.");
        list.add("Human saliva has a boiling point three times that of regular water.");
        list.add("If you lift a kangaroo’s tail off the ground it can’t hop.");
        list.add("Hyphephilia are people who get aroused by touching fabrics.");
        list.add("The person who invented the Frisbee was cremated and made into frisbees after he died!");
        list.add("During your lifetime, you will produce enough saliva to fill two swimming pools.");
        list.add("If Pinokio says “My Noes Will Grow Now”, it would cause a paradox.");
        list.add("Polar bears can eat as many as 86 penguins in a single sitting. (If they lived in the same place)");
        list.add("King Henry VIII slept with a gigantic axe beside him.");
        list.add("Bikinis and tampons invented by men.");
        list.add("An eagle can kill a young deer and fly away with it.");
        list.add("Heart attacks are more likely to happen on a Monday.");
        list.add("If you consistently fart for 6 years & 9 months, enough gas is produced to create the energy of an atomic bomb!");
        list.add("An average person’s yearly fast food intake will contain 12 pubic hairs.");
        list.add("The top six foods that make your fart are beans, corn, bell peppers, cauliflower, cabbage and milk!");
        list.add("There is a species of spider called the Hobo Spider.");
        list.add("‘Penis Fencing’ is a scientific term for the mating ritual between flatworms. It involves two flatworms attempting to stab the other flatworm with their penis.");
        list.add("A toaster uses almost half as much energy as a full-sized oven.");
        list.add("A baby spider is called a spiderling.");
        list.add("You cannot snore and dream at the same time.");
        list.add("The following can be read forward and backwards: Do geese see God?");
        list.add("A baby octopus is about the size of a flea when it is born.");
        list.add("A sheep, a duck and a rooster were the first passengers in a hot air balloon.");
        list.add("In Uganda, 50% of the population is under 15 years of age.");
        list.add("Hitler’s mother considered abortion but the doctor persuaded her to keep the baby.");
        list.add("Arab women can initiate a divorce if their husbands don’t pour coffee for them.");
        list.add("Recycling one glass jar saves enough energy to watch TV for 3 hours.");
        list.add("Smearing a small amount of dog feces on an insect bite will relieve the itching and swelling.");
        list.add("Catfish are the only animals that naturally have an odd number of whiskers.");
        list.add("Facebook, Skype and Twitter are all banned in China.");
        list.add("95% of people text things they could never say in person");
        list.add("Billy goats urinate on their own heads to smell more attractive to females.");

        randNumberFact = random.nextInt(40);

        displayFact(list.get(randNumberFact));


    }

}
