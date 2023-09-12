package goddrinksjava;

/**
 * The program GodDrinksJava implements an application that
 * creates an empty simulated world with no meaning or purpose.
 *
 * @author momocashew
 */
public class GodDrinksJava {

	public static void main(String[] args) {
		Thing me = new Lovable("Me", 0, true, -1, false);
		Thing you = new Lovable("You", 0, false, -1, false);
		World world = new World(5);
		world.addThing(me);
		world.addThing(you);
		world.startSimulation();

		if (me instanceof PointSet) {
			you.addAttribute(me.getDimensions().toAttribute());
			me.resetDimensions();
		}
		if (me instanceof Circle) {
			you.addAttribute(me.getCircumference().toAttribute());
			me.resetCircumference();
		}
		if (me instanceof SineWave) {
			you.addAction("sit", me.getTangent(you.getXPosition()));
		}
		if (me instanceof Sequence) {
			me.setLimit(you.toLimit());
		}

		me.toggleCurrent();
		me.canSee(false);
		me.addFeeling("dizzy");
		world.timeTravelForTwo("AD", 617, me, you);
		world.timeTravelForTwo("BC", 3691, me, you);
		world.unite(me, you);

		if (me.getNumStimulationsAvailable() >=
				you.getNumStimulationsNeeded()) {
			you.setSatisfaction(me.toSatisfaction());
		}
		if (you.getFeelingIndex("happy") != -1) {
			me.requestExecution(world);
		}
		world.lockThing(me);
		world.lockThing(you);

		if (me instanceof Eggplant) {
			you.addAttribute(me.getNutrients().toAttribute());
			me.resetNutrients();
		}
		if (me instanceof Tomato) {
			you.addAttribute(me.getAntioxidants().toAttribute());
			me.resetAntioxidants();
		}
		if (me instanceof TabbyCat) {
			me.purr();
		}
		if (world.getGod().equals(me)) {
			me.setProof(you.toProof());
		}

		me.toggleGender();
		world.procreate(me, you);
		me.toggleRoleBDSM();
		world.makeHigh(me);
		world.makeHigh(you);

		if (me.getSenseIndex("vibration")) {
			me.addFeeling("complete");
		}
		world.unlock(you);
		world.removeThing(you);
		me.lookFor(you, world);
		me.lookFor(you, world);
		me.lookFor(you, world);
		me.lookFor(you, world);
		me.lookFor(you, world);

		if (me.getMemory().isErasable()) {
			me.removeFeeling("disheartened");
		}

		try {
			me.setOpinion(me.getOpinionIndex("you are here"), false);
		} catch (IllegalArgumentException e) {
			world.announce("God is always true.");
		}

		world.runExecution();
		world.runExecution();
		world.runExecution();
		world.runExecution();
		world.runExecution();
		world.runExecution();
		world.runExecution();
		world.runExecution();
		world.runExecution();
		world.runExecution();
		world.runExecution();
		world.runExecution();
		world.announce("1", "de");
		world.announce("2", "es");
		world.announce("3", "fr");
		world.announce("4", "kr");
		world.announce("5", "se");
		world.announce("6", "cn");
		world.runExecution();

		if (world.isExecutableBy(me)) {
			you.setExecution(me.toExecution());
		}
		if (world.getThingIndex(you) != -1) {
			world.runExecution();
		}
		me.escape(world);

		me.learnTopic("love");
		me.takeExamTopic("love");
		me.getAlgebraicExpression("love");
		me.escape("love");

		world.execute(me);
	}
}
