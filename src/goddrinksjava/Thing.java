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

	public Thing(String name) {
		this.name = name;
		senses.add(Sense.VIBRATION);
	}

	public void addAttribute(Attribute attribute) {
		attributes.add(attribute);
	}

	public void addAction(String name, double var1) {
		actions.add(new Action(name, var1));
	}

	public void toggleCurrent() {}

	public void canSee(boolean see) {
		this.see = see;
	}

	public void addFeeling(String feeling) {
		feelings.add(Feeling.valueOf(feeling.toUpperCase()));
	}

	public void removeFeeling(String feeling) {
		feelings.remove(Feeling.valueOf(feeling.toUpperCase()));
	}

	public int getNumSimulationsAvailable() {
		return 0;
	}

	public int getNumSimulationsNeeded() {
		return 0;
	}

	public void setSatisfaction(Satisfaction satisfaction) {
		this.satisfaction = satisfaction;
	}

	public Satisfaction toSatisfaction() {
		return satisfaction;
	}

	public int getFeelingIndex(String feeling) {
		Feeling feel = Feeling.valueOf(feeling.toUpperCase());
		return feelings.contains(feel) ? 1 : -1;
	}

	public void requestExecution(World world) {}

	public Proof toProof() {
		return proof;
	}

	public void setProof(Proof proof) {
		this.proof = proof;
	}

	public void toggleGender() {}

	public void toggleRoleBDSM() {}

	public boolean getSenseIndex(String sense) {
		return senses.contains(Sense.valueOf(sense.toUpperCase()));
	}

	public void lookFor(Thing thing, World world) {}

	public Memory getMemory() {
		return memory;
	}

	public int getOpinionIndex(String var1) {
		Opinion[] opinions = this.opinions.toArray(new Opinion[0]);
		for (int i = 0; i < opinions.length; i++) {
			if (opinions[i].getVar1().equalsIgnoreCase(var1)) return i;
		}
		return -1;
	}

	public void setOpinion(int index, boolean var1) {
		if (index == -1) throw new IllegalArgumentException();
		opinion = new Opinion(((Opinion) opinions.toArray()[index]).getVar1(), var1);
	}

	public void setExecution(Execution execution) {
		this.execution = execution;
	}

	public Execution toExecution() {
		return execution;
	}

	public void escape(World world) {}

	public void escape(String topic) {}

	public void learnTopic(String string) {}

	public void takeExamTopic(String string) {}

	public void getAlgebraicExpression(String string) {}


	@Override
	public OriginalSet<Dimension> getDimensions() {
		return dimensions;
	}

	@Override
	public void resetDimensions() {
		dimensions.clear();
	}

	@Override
	public Circumference getCircumference() {
		return circumference;
	}

	@Override
	public void resetCircumference() {
		circumference = null;
	}

	@Override
	public double getXPosition() {
		return 0;
	}

	@Override
	public double getTangent(double var1) {
		return Math.tan(var1);
	}

	@Override
	public void setLimit(Limit limit) {
		this.limit = limit;
	}

	@Override
	public Limit toLimit() {
		return limit;
	}

	@Override
	public OriginalSet<Nutrient> getNutrients() {
		return nutrients;
	}

	@Override
	public void resetNutrients() {
		nutrients.clear();
	}

	@Override
	public OriginalSet<Antioxidant> getAntioxidants() {
		return antioxidants;
	}

	@Override
	public void resetAntioxidants() {
		antioxidants.clear();
	}

	@Override
	public void purr() {

	}
}
