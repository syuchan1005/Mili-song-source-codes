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
	}

	public void addThing(Thing thing) {
		things.add(thing);
	}

	public void startSimulation() {}

	public void timeTravelForTwo(String kinen, int year, Thing... thing) {
		this.kinen = kinen;
		this.year = year;
	}

	public void unite(Thing... things) {}

	public void lockThing(Thing thing) {}

	public Thing getGod() {
		return (Thing) things.toArray()[0];
	}

	public void procreate(Thing... things) {}

	public void makeHigh(Thing thing) {}

	public void unlock(Thing thing) {}

	public void removeThing(Thing thing) {
		things.remove(thing);
	}

	public int getThingIndex(Thing thing) {
		return 0;
	}

	public void announce(String... args) {}

	public void runExecution() {}

	public boolean isExecutableBy(Thing thing) {
		return things.contains(thing);
	}

	public void execute(Thing thing) {}
}
