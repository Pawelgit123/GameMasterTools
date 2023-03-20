package com.example.gamemastertools.houses;

import com.example.gamemastertools.R;

import java.util.ArrayList;
import java.util.List;

public class HouseCreator {

    public static List<House> createHouseList() {
        List<House> houseList = new ArrayList<>();
        houseList.add(createHouseBear());
        houseList.add(createHouseElk());
        houseList.add(createHouseFalcon());
        houseList.add(createHouseSerpent());
        houseList.add(createHouseFox());
        houseList.add(createHouseWolf());
        houseList.add(createHouseHorse());
        houseList.add(createHouseBoar());

        return houseList;
    }

    private static House createHouseFox() {
        House house = new House(R.drawable.house_fox);
        house.setName("House of the Fox");
        house.setVirtue("+1 Beauty");
        house.setDescription("FOX’S BEAUTY\n" +
                "   Beauty represents your character’s " +
                "creativity, expression, and natural charm. " +
                "Whenever your character embarks on a " +
                "creative endeavor, his Beauty determines " +
                "his ability to create works that resonate.\n" +
                "   If you choose Beauty as one of your Virtues…" +
                "… you’re character knows and understands " +
                "the finer points of sophistication and culture. " +
                "He can debate, paint, sculpt, write music " +
                "and plays, or conduct an orchestra.\n" +
                "   If you do not choose Beauty… " +
                "… your character does not care for the " +
                "finer parts of culture—probably because " +
                "he does not understand them. He cannot " +
                "interpret poetry, appreciate music, or enjoy " +
                "the subtle nuances of any of the Arts.");
        house.setAdditional("   A ven without any sense of Beauty will " +
                "find great difficulty with Romance, Art and " +
                "other vital elements in the game. You may " +
                "want to take a few Aspects to compensate" +
                "for your weakness.");
        return house;
    }

    private static House createHouseBear() {
        House house = new House(R.drawable.house_bear);
        house.setName("House of the Bear");
        house.setVirtue("+1 Strength");
        house.setDescription("BEAR’S STRENGTH\n" +
                "   Strength represents almost all your character’s physical actions. Lifting, " +
                "pushing, tearing, pulling, punching, jumping, wrestling and other forms of unarmed" +
                "combat are all determined by Strength.\n" +
                "   If you choose Strength as one of your Virtues… " +
                "…he can always lift, push, pull, move, " +
                "jump, run, climb better than anyone else " +
                "around and never needs any help for " +
                "anything.\n" +
                "   If you do not choose Strength… " +
                "… your character is a weakling. He can’t " +
                "shove heavy (or jammed) doors open, can’t " +
                "bend bars, and certainly can’t lift gates. " +
                "You roll a number of dice equal to your " +
                "Strength for any physical risk. Physical " +
                "force, manual dexterity, everything. If you " +
                "do not have Strength, you get no dice. No " +
                "dice means you do not get to narrate your " +
                "character’s success or failure.");
        house.setAdditional("   You roll a number of dice equal to your " +
                "Strength for any physical risk. Physical " +
                "force, manual dexterity, everything. If you " +
                "do not have Strength, you get no dice. No " +
                "dice means you do not get to narrate your " +
                "character’s success or failure.");
        return house;
    }

    private static House createHouseElk() {
        House house = new House(R.drawable.house_elk);
        house.setName("House of the Elk");
        house.setVirtue("+1 Cunning");
        house.setDescription("ELK’S CUNNING\n" +
                "   Cunning is a measure of your character’s " +
                "ability to see what others are trying to hide " +
                "and find creative solutions for difficult " +
                "problems. You know how to put together " +
                "elaborate plans from disparate parts and " +
                "how to see patterns where others cannot.\n" +
                "   If you choose Cunning as one of your Virtues… " +
                "… your character is always thinking " +
                "outside of the box. He doesn’t go for " +
                "traditional solutions, turns disparate " +
                "advantages into delicate and detailed plans. " +
                "He can see.\n" +
                "   If you do not choose Cunning… " +
                "… your character is overwhelmed by " +
                "obstacles, cannot think quickly on his feet, " +
                "or see what others want to hide.");
        house.setAdditional("   Cunning also determines the number " +
                "of Season Actions your character gets. " +
                "Without Season Actions, your character’s " +
                "Domain will grow very slowly; more slowly " +
                "than other Domains.");
        return house;
    }

    private static House createHouseSerpent() {
        House house = new House(R.drawable.house_serpent);
        house.setName("House of the Serpent");
        house.setVirtue("+1 Wisdom");
        house.setDescription("SERPENT’S WISDOM\n" +
                "   A character’s Wisdom represents his " +
                "memory and learning ability. When you " +
                "have to recall facts or memorize charts, you " +
                "call upon your Wisdom.\n" +
                "   If you choose Wisdom as one of your Virtues… " +
                "… the amount of information you carry " +
                "is immense. You know something about " +
                "everything and can talk for hours about " +
                "even the most trivial matters.\n" +
                "   If you do not choose Wisdom… " +
                "… your character is very naive about the " +
                "world around him. He won’t be able to draw " +
                "on any experiences, won’t know what berries " +
                "are poisonous, and has problems making " +
                "change between the different currencies.");
        house.setAdditional("   Without Wisdom, you cannot define " +
                "elements of the world. Wisdom is the key " +
                "trait to knowing Shanri’s secrets. If you " +
                "want your character to know anything " +
                "about the ven and their world, you must " +
                "have Wisdom.");
        return house;
    }

    private static House createHouseFalcon() {
        House house = new House(R.drawable.house_falcon);
        house.setName("House of the Falcon");
        house.setVirtue("+1 Courage");
        house.setDescription("FALCON’S COURAGE\n" +
                "   Courage represents your character’s " +
                "physical will and determination to go on, " +
                "regardless of the things that stand in his " +
                "way. Whenever you face danger, whenever " +
                "you must make selfless decisions, whenever " +
                "you have to fight through the pain, your " +
                "Courage helps you reach the other side.\n" +
                "   If you choose Courage as one of your Virtues… " +
                "… your character’s will is powerful. " +
                "Others must test their skills to tempt him. " +
                "He can ignore pain and fear, and do what " +
                "must be done.\n" +
                "   If you do not choose Courage… " +
                "… your character finds temptation and " +
                "distraction difficult hurdles. He doesn’t " +
                "have any midnight oil to burn and he " +
                "can’t face danger without some external " +
                "motivation to push him along.");
        house.setAdditional("   Without Courage, your character’s risks " +
                "will face difficulties. Every dangerous risk " +
                "requires that you test your Courage. If " +
                "you are successful, your character receives " +
                "bonus dice. If unsuccessful, your character’s " +
                "dice are penalized.");
        return house;
    }

    private static House createHouseWolf() {
        House house = new House(R.drawable.house_wolf);
        house.setName("House of the Wolf");
        house.setVirtue("+1 Prowess");
        house.setDescription("WOLF’S PROWESS\n" +
                "   Prowess reflects your character’s martial " +
                "training. Using weapons, surviving on a " +
                "battlefield, understanding strategy and " +
                "tactics all fall under the purview of Prowess.\n" +
                "   If you choose Prowess as one of your Virtues… " +
                "… a sword feels like a natural extension " +
                "of his body. He will dodge deadly blows, " +
                "maneuver through battlefields, and " +
                "understand the philosophy of warfare.\n" +
                "   If you do not choose Prowess… " +
                "… your character has never even been in a " +
                "fight, let alone held a sword. He cannot stand " +
                "on his own against a trained opponent and " +
                "will likely break at the first sign of danger.");
        house.setAdditional("   Without Prowess, your character will lose " +
                "every fight. He’ll be helpless. No hope. No " +
                "chance. Get yourself a bodyguard or buy " +
                "up some “fighting Aspects” to compensate. " +
                "Otherwise, you’ll be nothing more than a tool " +
                "in a world of weapons.");
        return house;
    }

    private static House createHouseBoar() {
        House house = new House(R.drawable.house_boar);
        house.setName("House of the Boar");
        house.setVirtue("+1 lowest Virtue, Tenacity available");
        house.setDescription("BOAR'S TENACITY\n" +
                "   The Boar treasure a Virtue of their own. Like the sacred animal from " +
                "which their House takes its name, ven under the banner of the Boar " +
                "exhibit an incredible degree of resolve. In spite of physical hardship, " +
                "injury, disease, oppressive climate, hunger or thirst, the Boar carry on " +
                "and pursue their goals with dogged, tireless determination. When all " +
                "other means have failed, when failure seems certain, when Strength " +
                "has faltered and Courage is threadbare, the Boar continue against all " +
                "odds through sheer, stubborn Tenacity.\n" +
                "   If you choose Tenacity as one of your Virtues… " +
                "…your character has a raw, unfl agging determination to keep going in " +
                "spite of all odds. Failure is nothing more than a setback. Wounds are " +
                "merely a hindrance. You don’t quit until you’re dead.\n" +
                "   If you do not choose Tenacity… " +
                "…your character’s resolve and determination can be broken. Morale " +
                "fl ags and the determination to continue weakens in the face of " +
                "adversity. Your character may give up on a particular tack and look for " +
                "other ways to solve a problem, succumb to wo");
        house.setAdditional("   Your Tenacity adds to your character’s ability to resist wounds and " +
                "overcome hardships. Every point of Tenacity is an additional level of " +
                "Injury that your ven can sustain. Also after you have failed a contested risk, spend a Style Point. You discard all " +
                "your wagers from that roll and, instead, gain a number of wagers equal to your " +
                "Tenacity.");
        return house;
    }

    private static House createHouseHorse() {
        House house = new House(R.drawable.house_horse);
        house.setName("House of the Horse");
        house.setVirtue("+1 lowest Virtue, Service available");
        house.setDescription("HORSE’S SERVICE\n" +
                "   The lost virtue of the veiled house of the Horse is Service: the desire and dedication " +
                "to pursue your civic duty, to better the lives of your fellow man, to serve your neighbors " +
                "without expectation of recompense. To do what is right instead of what benefits you.\n" +
                "   If you choose Service as one of your Virtues… " +
                "You are selfless, generous, charitable, even kind. You " +
                "care about the well-being of others, and you act upon that " +
                "concern with alacrity, power, and grace.\n" +
                "   If you do not choose Service… " +
                "You generally act in your own best interests, " +
                "occasionally in the interests of your family or liege. Strangers are only worth your " +
                "attention if they might become useful to you.");
        house.setAdditional("   The ven are selfish creatures. Self-promotion is essential. Now, I’m not going to put " +
                "a mechanic in this game that makes your character a self-serving ass… but if he neglects " +
                "Service, it’ going to be harder for him to accomplish particularly selfless deeds. " +
                "Before any ven can take an action that does not somehow benefit him, he must first " +
                "make a Service risk. Helping a stranger, defending an disliked innocent before your " +
                "peers, just extending a hand. Danger. Potential Loss. Risk.");
        return house;
    }
}
