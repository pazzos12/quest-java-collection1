import java.util.*;


public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

	Hero blackwidow = new Hero("Black Widow", 34); 
	Hero captainamerica = new Hero("Captain America", 100); 
	Hero vision = new Hero("Vision", 3); 
	Hero ironman = new Hero("Iron Man", 48); 
	Hero scarletwitch = new Hero("Scarlet Witch", 48); 
	Hero thor = new Hero("Thor", 1500); 
	Hero spiderman = new Hero("Spider Man", 18); 
	Hero hulk = new Hero("Hulk", 49); 
	Hero doctorstrange = new Hero("Doctor Strange", 42); 

        // TODO 2 : Add those heroes to the list
	
	ArrayList<Hero>heroes = new ArrayList<>();
	heroes.add(blackwidow);
	heroes.add(captainamerica);
	heroes.add(vision);
	heroes.add(ironman);
	heroes.add(scarletwitch);
	heroes.add(thor);
	heroes.add(spiderman);
	heroes.add(hulk);
	heroes.add(doctorstrange);
	
        // TODO 3 : It's Thor birthday, now he's 1501

	thor.setAge (1501);
		System.out.println("Thor's birthday now is " + thor.getAge());

        // TODO 4 : Shuffle the heroes list

	Collections.shuffle(heroes);
		
        // TODO 5 : Keep only the half of the list
	
	List<Hero>heroes2 = heroes.subList(0, heroes.size()/2);
		System.out.println("The list of Heroes remaining after shuffle : ");

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
		
	for (int i = 0; i < heroes2.size(); i++) {
		System.out.println(heroes2.get(i).getName());
	}
		
    }
}
