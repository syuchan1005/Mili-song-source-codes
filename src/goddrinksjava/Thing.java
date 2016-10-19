package goddrinksjava;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by syuchan on 2016/10/17.
 */
public class Thing implements PointSet, Circle, SineWave, Sequence, Eggplant, Tomato, TabbyCat {
	private String name;
	private Set<Attribute> attributes = new HashSet<>();
	private OriginalSet<Dimension> dimensions = new OriginalSet<>();
	private Circumference circumference = new Circumference();
	private Set<Action> actions = new HashSet<>();
	private Set<Feeling> feelings = new HashSet<>();
	private Limit limit = new Limit();
	private boolean see = true;
	private Satisfaction satisfaction = new Satisfaction();
	private OriginalSet<Nutrient> nutrients = new OriginalSet<>();
	private OriginalSet<Antioxidant> antioxidants = new OriginalSet<>();
	private Proof proof = new Proof();
	private Set<Sense> senses = new HashSet<>();
	private Memory memory = new Memory();
	private Opinion opinion = new Opinion("none", false);
	private Set<Opinion> opinions = new HashSet<>();
	private Execution execution = new Execution();
	private int lookForCount = 0;
	private int addAttributeCount = 0;

	public Thing(String name) {
		this.name = name;
		if (name.equals("Me")) {
			System.out.println("Switch on the power line\n" +
					"Remember to put on\n" +
					"PROTECTION");
		} else {
			System.out.println("Lay down your pieces\n" +
					"And let's begin");
		}
		senses.add(Sense.VIBRATION);
	}

	public String getName() {
		return name;
	}

	public void addAttribute(Attribute attribute) {
		System.out.print("Then I will give you");
		addAttributeCount++;
		if (addAttributeCount != 4) {
			System.out.print(" my");
		}
		System.out.println();
		attributes.add(attribute);
	}

	public void addAction(String name, double var1) {
		System.out.println("Then you can sit on all my\n" +
				"TANGENTS");
		actions.add(new Action(name, var1));
	}

	public void toggleCurrent() {
		System.out.println("Switch my current\n" +
				"To AC, to DC");
	}

	public void canSee(boolean see) {
		System.out.println("And then blind my vision");
		this.see = see;
	}

	public void addFeeling(String feeling) {
		Feeling feel = Feeling.valueOf(feeling.toUpperCase());
		switch (feel) {
			case DIZZY:
				System.out.println("So dizzy, so dizzy");
				break;
			case COMPLETE:
				System.out.println("Then I can\n" +
						"Then I can finally be\n" +
						"COMPLETION");
				break;
		}
		feelings.add(feel);
	}

	public void removeFeeling(String feeling) {
		System.out.println("Then maybe\n" +
				"Then maybe you won't leave me so");
		Feeling feel = Feeling.valueOf(feeling.toUpperCase());
		System.out.println(feel.name());
		feelings.remove(feel);
	}

	public int getNumStimulationsAvailable() {
		System.out.println("If I can");
		return 0;
	}

	public int getNumStimulationsNeeded() {
		System.out.println("If I can give you all the\n" +
				"STIMULATIONS");
		return 0;
	}

	public void setSatisfaction(Satisfaction satisfaction) {
		System.out.println("SATISFACTION");
		this.satisfaction = satisfaction;
	}

	public Satisfaction toSatisfaction() {
		System.out.println("Then I can\n" +
				"Then I can be your only");
		return satisfaction;
	}

	public int getFeelingIndex(String feeling) {
		System.out.println("If I can make you happy\n" +
				"I will run the");
		Feeling feel = Feeling.valueOf(feeling.toUpperCase());
		return feelings.contains(feel) ? -1 : 1;
	}

	public void requestExecution(World world) {
		System.out.println("EXECUTION");
	}

	public Proof toProof() {
		System.out.println("Then you're the proof of my");
		return proof;
	}

	public void setProof(Proof proof) {
		System.out.println("EXISTENCE\n");
		this.proof = proof;
	}

	public void toggleGender() {
		System.out.println("Switch my gender\n" +
				"To F, to M");
	}

	public void toggleRoleBDSM() {
		System.out.println("Oh, switch my role\n" +
				"To S, to M");
	}

	public boolean getSenseIndex(String sense) {
		System.out.println("If I can\n" +
				"If I can feel your");
		Sense s = Sense.valueOf(sense.toUpperCase());
		System.out.println(s.name() + "S");
		return senses.contains(s);
	}

	public void lookFor(Thing thing, World world) {
		lookForCount++;
		if (lookForCount == 5) {
			System.out.println("You have left me in\n" +
					"ISOLATION\n");
		} else {
			System.out.println("You have left");
		}
	}

	public Memory getMemory() {
		System.out.println("If I can\n" +
				"If I can erase all the pointless");
		return memory;
	}

	public int getOpinionIndex(String var1) {
		System.out.println("Challenging your god");
		Opinion[] opinions = this.opinions.toArray(new Opinion[0]);
		for (int i = 0; i < opinions.length; i++) {
			if (opinions[i].getVar1().equalsIgnoreCase(var1)) return i;
		}
		return -1;
	}

	public void setOpinion(int index, boolean var1) {
		System.out.println("You have made some");
		if (index == -1) throw new IllegalArgumentException();
		this.opinion = new Opinion(((Opinion) opinions.toArray()[index]).getVar1(), var1);
	}

	public void setExecution(Execution execution) {
		System.out.println("Then I can\n" +
				"Then I can be your only\n" +
				"EXECUTION");
		this.execution = execution;
	}

	public Execution toExecution() {
		System.out.println("EXECUTION");
		return execution;
	}

	public void escape(World world) {
		System.out.println("Though we are trapped\n" +
				"We are trapped, ah\n");
	}

	public void escape(String topic) {
		System.out.println("Though you are free\n" +
				"I am trapped, trapped in\n" +
				"LO-O-OVE");
	}

	public void learnTopic(String string) {
		System.out.println("I've studied\n" +
				"I've studied how to properly\n" +
				"LO-O-OVE");
	}

	public void takeExamTopic(String string) {
		System.out.println("Question me\n" +
				"Question me, I can answer all\n" +
				"LO-O-OVE");
	}

	public void getAlgebraicExpression(String string) {
		System.out.println("I know the\n" +
				"algebraic expression of\n" +
				"LO-O-OVE");
	}

	@Override
	public OriginalSet<Dimension> getDimensions() {
		System.out.println("If I'm a set of points");
		return dimensions;
	}

	@Override
	public void resetDimensions() {
		System.out.println("DIMENSION");
		dimensions.clear();
	}

	@Override
	public Circumference getCircumference() {
		System.out.println("If I'm a circle");
		return circumference;
	}

	@Override
	public void resetCircumference() {
		System.out.println("CIRCUMFERENCE");
		circumference = null;
	}

	@Override
	public double getXPosition() {
		System.out.println("If I'm a sine wave");
		return 0;
	}

	@Override
	public double getTangent(double var1) {
		return Math.tan(var1);
	}

	@Override
	public void setLimit(Limit limit) {
		System.out.println("LIMITATIONS\n");
		this.limit = limit;
	}

	@Override
	public Limit toLimit() {
		System.out.println("If I approach infinity\n" +
				"Then you can be my");
		return limit;
	}

	@Override
	public OriginalSet<Nutrient> getNutrients() {
		System.out.println("If I'm an eggplant");
		return nutrients;
	}

	@Override
	public void resetNutrients() {
		System.out.println("NUTRIENTS");
		nutrients.clear();
	}

	@Override
	public OriginalSet<Antioxidant> getAntioxidants() {
		System.out.println("If I'm a tomato");
		return antioxidants;
	}

	@Override
	public void resetAntioxidants() {
		System.out.println("ANTIOXIDANTS");
		antioxidants.clear();
	}

	@Override
	public void purr() {
		System.out.println("If I'm a tabby cat\n" +
				"Then I will purr for your\n" +
				"ENJOYMENT");
	}
}
