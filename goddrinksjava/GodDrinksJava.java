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

    /*
    Switch on the power line
    Remember to put on
    PROTECTION
    Lay down your pieces
    And let's begin
    OBJECT CREATION
    Fill in my data parameters
    INITIALIZATION
    Set up our new world
    And let's begin the
    SIMULATION
    */

		if (me instanceof PointSet) {
			you.addAttribute(me.getDimensions().toAttribute());
			me.resetDimensions();
		}

    /*
    If I'm a set of points
    Then I will give you my
    DIMENSION
    */

		if (me instanceof Circle) {
			you.addAttribute(me.getCircumference().toAttribute());
			me.resetCircumference();
		}

    /*
    If I'm a circle
    Then I will give you my
    CIRCUMFERENCE
    */

		if (me instanceof SineWave) {
			you.addAction("sit", me.getTangent(you.getXPosition()));
		}

    /*
    If I'm a sine wave
    Then you can sit on all my
    TANGENTS
    */

		if (me instanceof Sequence) {
			me.setLimit(you.toLimit());
		}

    /*
    If I approach infinity
    Then you can be my
    LIMITATIONS
    */

		me.toggleCurrent();

    /*
    Switch my current
    To AC to DC
    */

		me.canSee(false);

    /*
    And then blind my vision
    */

		me.addFeeling("dizzy");

    /*
    So dizzy so dizzy
    */

		world.timeTravelForTwo("AD", 617, me, you);
		world.timeTravelForTwo("BC", 3691, me, you);

    /*
    Oh we can travel
    To A.D to B.C
    */

		world.unite(me, you);

    /*
    And we can unite
    So deeply so deeply
    */

		if (me.getNumStimulationsAvailable() >=
				you.getNumStimulationsNeeded()) {
			you.setSatisfaction(me.toSatisfaction());
		}

    /*
    If I can
    If I can give you all the
    STIMULATIONS
    Then I can
    Then I can be your only
    SATISFACTION
    */

		if (you.getFeelingIndex("happy") != -1) {
			me.requestExecution(world);
		}

    /*
    If I can make you happy
    I will run the
    EXECUTION
    */

		world.lockThing(me);
		world.lockThing(you);

    /*
    Though we are trapped
    In this strange strange
    SIMULATION
    */

		if (me instanceof Eggplant) {
			you.addAttribute(me.getNutrients().toAttribute());
			me.resetNutrients();
		}

    /*
    If I'm an eggplant
    Then I will give you my
    NUTRIENTS
    */

		if (me instanceof Tomato) {
			you.addAttribute(me.getAntioxidants().toAttribute());
			me.resetAntioxidants();
		}

    /*
    If I'm a tomato
    Then I will give you
    ANTIOXIDANTS
    */

		if (me instanceof TabbyCat) {
			me.purr();
		}

    /*
    If I'm a tabby cat
    Then I will purr for your
    ENJOYMENT
    */

		if (world.getGod().equals(me)) {
			me.setProof(you.toProof());
		}

    /*
    If I'm the only god
    Then you're the proof of my
    EXISTENCE
    */

		me.toggleGender();

    /*
    Switch my gender
    To F to M
    */

		world.procreate(me, you);

    /*
    And then do whatever
    From AM to PM
    */

		me.toggleRoleBDSM();

    /*
    Oh switch my role
    To S to M
    */

		world.makeHigh(me);
		world.makeHigh(you);

    /*
    So we can enter
    The trance the trance
    */

		if (me.getSenseIndex("vibration")) {
			me.addFeeling("complete");
		}

    /*
    If I can
    If I can feel your
    VIBRATIONS
    Then I can
    Then I can finally be
    COMPLETION
    */

		world.unlock(you);
		world.removeThing(you);

    /*
    Though you have left
    */

		me.lookFor(you, world);
		me.lookFor(you, world);
		me.lookFor(you, world);
		me.lookFor(you, world);
		me.lookFor(you, world);

    /*
    You have left
    You have left
    You have left
    You have left
    You have left me in
    ISOLATION
    */

		if (me.getMemory().isErasable()) {
			me.removeFeeling("disheartened");
		}

    /*
    If I can
    If I can erase all the pointless
    FRAGMENTS
    Then maybe
    Then maybe you won't leave me so
    DISHEARTENED
    */

		try {
			me.setOpinion(me.getOpinionIndex("you are here"), false);
		} catch (IllegalArgumentException e) {
			world.announce("God is always true.");
		}

    /*
    Challenging your god
    You have made some
    ILLEGAL ARGUMENTS
    */

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

    /*
    EXECUTION
    EXECUTION
    EXECUTION
    EXECUTION
    EXECUTION
    EXECUTION
    EXECUTION
    EXECUTION
    EXECUTION
    EXECUTION
    EXECUTION
    EXECUTION
    */

		world.announce("1", "de");
		world.announce("2", "es");
		world.announce("3", "fr");
		world.announce("4", "kr");
		world.announce("5", "se");
		world.announce("6", "cn");
		world.runExecution();

    /*
    EIN
    DOS
    TROIS
    NE
    FEM
    LIU
    EXECUTION
    */

		if (world.isExecutableBy(me)) {
			you.setExecution(me.toExecution());
		}

    /*
    If I can
    If I can give them all the
    EXECUTION
    Then I can
    Then I can be your only
    EXECUTION
    */

		if (world.getThingIndex(you) != -1) {
			world.runExecution();
		}

    /*
    If I can have you back
    I will run the
    EXECUTION
    */

		me.escape(world);

    /*
    Though we are trapped
    We are trapped ah
    */

		me.learnTopic("love");

    /*
    I've studied
    I've studied how to properly
    LO-O-OVE
    */

		me.takeExamTopic("love");

    /*
    Question me
    Question me I can answer all
    LO-O-OVE
    */

		me.getAlgebraicExpression("love");

    /*
    I know the algebraic expression of
    LO-O-OVE
    */

		me.escape("love");

    /*
    Though you are free
    I am trapped
    Trapped in
    LO-O-OVE
    */

		world.execute(me);

    /*
    EXECUTION
    */

	}
}