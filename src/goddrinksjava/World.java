package goddrinksjava;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by syuchan on 2016/10/17.
 */
public class World {
	private static Set<Thing> things = new HashSet<>();
	private int var1;
	private String kinen;
	private int year;

	public World(int var1) {
		this.var1 = var1;
		System.out.println("OBJECT CREATION");
	}

	public void addThing(Thing thing) {
		if (thing.getName().equals("Me")) {
			System.out.println("Fill in my data");
		} else {
			System.out.println("parameters\n" +
					"INITIALIZATION");
		}
		things.add(thing);
	}

	public void startSimulation() {
		System.out.println("Set up our new world\n" +
				"And let's begin the\n" +
				"SIMULATION\n");
	}

	public void timeTravelForTwo(String kinen, int year, Thing... thing) {
		if (kinen.equals("AD")) {
			System.out.print("Oh, we can travel\n" +
					"To A.D., ");
		} else {
			System.out.println("to B.C.");
		}
		this.kinen = kinen;
		this.year = year;
	}

	public void unite(Thing... things) {
		System.out.println("And we can unite\n" +
					"So deeply, so deeply\n");
	}

	public void lockThing(Thing thing) {
		if (thing.getName().equals("Me")) {
			System.out.println("Though we are trapped");
		} else {
			System.out.println("In this strange, strange\n" +
					"SIMULATION\n");
		}
	}

	public Thing getGod() {
		System.out.println("If I'm the only god");
		return (Thing) things.toArray()[1];
	}

	public void procreate(Thing... things) {
		System.out.println("And then do whatever\n" +
				"From AM to PM");
	}

	public void makeHigh(Thing thing) {
		if (thing.getName().equals("Me")) {
			System.out.print("So we can enter\n" +
					"The trance, ");
		} else {
			System.out.println("the trance\n");
		}
	}

	public void unlock(Thing thing) {
		System.out.println("Though you have left\n");
	}

	public void removeThing(Thing thing) {
		things.remove(thing);
	}

	public int getThingIndex(Thing thing) {
		System.out.println("If I can have you back\n" +
				"I will run the");
		return 0;
	}

	public void announce(String... args) {
		if (args[0].equals("God is always true.")) {
			args[0] = "ILLEGAL ARGUMENTS\n";
		} else {
			switch (args[0]) {
				case "1":
					args[0] = "EIN";
					break;
				case "2":
					args[0] = "DOS";
					break;
				case "3":
					args[0] = "TROIS";
					break;
				case "4":
					args[0] = "NE";
					break;
				case "5":
					args[0] = "FEM";
					break;
				case "6":
					args[0] = "LIU";
					break;
			}
		}
		System.out.println(args[0]);
	}

	public void runExecution() {
		System.out.println("EXECUTION");
	}

	public boolean isExecutableBy(Thing thing) {
		System.out.println("\nIf I can\n" +
				"If I can give them all the");
		return things.contains(thing);
	}

	public void execute(Thing thing) {
		System.out.println("\nEXECUTION");
	}
}
