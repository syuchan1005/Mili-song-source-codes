package goddrinksjava;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by syuchan on 2016/10/17.
 * updata by unusuallman on 2022/05/25.
 */
@SuppressWarnings({"MismatchedQueryAndUpdateOfCollection", "SameReturnValue"})
public class Thing implements PointSet, Circle, SineWave, Sequence, Eggplant, Tomato, TabbyCat {
	private final String name;
	private final Set<Attribute> attributes = new HashSet<>();
	private final OriginalSet<Dimension> dimensions = new OriginalSet<>();
	private Circumference circumference = new Circumference();
	private final Set<Action> actions = new HashSet<>();
	private final Set<Feeling> feelings = new HashSet<>();
	private Limit limit = new Limit();
	private Satisfaction satisfaction = new Satisfaction();
	private final OriginalSet<Nutrient> nutrients = new OriginalSet<>();
	private final OriginalSet<Antioxidant> antioxidants = new OriginalSet<>();
	private Proof proof = new Proof();
	private final Set<Sense> senses = new HashSet<>();
	private final Memory memory = new Memory();
	private final Set<Opinion> opinions = new HashSet<>();
	private Execution execution = new Execution();
	private int lookForCount = 0;
	private int addAttributeCount = 0;
	Opinion opinion = new Opinion("none", false);
	public Thing(String name) {
		this.name = name;
		if (name.equals("Me")) {
			System.out.println("""
					Switch on the power line
					接上电源
					Remember to put on
					记得装备好
					PROTECTION
					绝缘护具
					""");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("""
					Lay down your pieces
					摆好棋子
					And let's begin
					开始吧""");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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
			System.out.print(" my\n那么我将够献给你");
		}
		else{
			System.out.print("\n那么我将够献给你");
		}
		System.out.println();
		attributes.add(attribute);
	}
	public void addAction(String name, double var1) {
		System.out.println("""
				Then you can sit on all my
				那么请你置于
				TANGENTS
				我的切线
				""");
		actions.add(new Action(name, var1));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void toggleCurrent() {
		System.out.println("""
				Switch my current
				切换我的电流
				To AC, to DC
				从交流到直流""");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void canSee(boolean ignoredSee) {
		System.out.println("And then blind my vision\n然后蒙上我的眼睛");
	}
	public void addFeeling(String feeling) {
		Feeling feel = Feeling.valueOf(feeling.toUpperCase());
		switch (feel) {
			case DIZZY -> {System.out.println("""
					So dizzy, so dizzy
					头晕目眩
					""");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			case COMPLETE -> {
				System.out.println("""
						Then I can
						那么我就能够
						Then I can finally be
						那么我就终于能够
						COMPLETION
						变为完全
						""");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		feelings.add(feel);
	}
	public void removeFeeling(String feeling) {
		System.out.println("""
				Then maybe
				那么我就可能
				Then maybe you won't leave me so
				那么我就可能不会""");
		Feeling feel = Feeling.valueOf(feeling.toUpperCase());
		System.out.println(feel.name()+"\n如此失望");
		feelings.remove(feel);try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public int getNumStimulationsAvailable() {
		System.out.println("If I can\n如果我能");
		return 0;
	}
	public int getNumStimulationsNeeded() {
		System.out.println("""
				If I can give you all the
				如果我能够献给你
				STIMULATIONS
				所有的刺激""");
		return 0;
	}
	public void setSatisfaction(Satisfaction satisfaction) {
		System.out.println("""
				SATISFACTION
				唯一的满足
				""");
		this.satisfaction = satisfaction;
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public Satisfaction toSatisfaction() {
		System.out.println("""
				Then I can
				那么我就能够
				Then I can be your only
				那么我就能够成为你""");
		return satisfaction;
	}
	public int getFeelingIndex(String feeling) {
		System.out.println("""
				If I can make you happy
				如果我能够让你开心
				I will run the
				那么我将""");
		Feeling feel = Feeling.valueOf(feeling.toUpperCase());
		return feelings.contains(feel) ? -1 : 1;
	}
	public void requestExecution(World ignoredWorld) {
		System.out.println("""
				EXECUTION
				执行指令
				""");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public Proof toProof() {
		System.out.println("Then you're the proof of my\n那么你将是我");
		return proof;
	}
	public void setProof(Proof proof) {
		System.out.println("""
				EXISTENCE
				存在的证明
				""");
		this.proof = proof;
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void toggleGender() {
		System.out.println("""
				Switch my gender
				切换我的性别
				To F, to M
				从女到男""");
	}
	public void toggleRoleBDSM() {
		System.out.println("""
				Oh, switch my role
				切换我的角色
				To S, to M
				从施虐者到受虐者""");
	}
	public boolean getSenseIndex(String sense) {
		System.out.println("""
				If I can
				如果我能
				If I can feel your
				如果我能够感受到""");
		Sense s = Sense.valueOf(sense.toUpperCase());
		System.out.println(s.name() + "S" + "\n你的振动");
		return senses.contains(s);
	}
	public void lookFor(Thing ignoredThing, World ignoredWorld) {
		lookForCount++;
		if (lookForCount == 5) {
			System.out.println("""
					You have left me in
					你离我而去
					ISOLATION
					让我独自存在
					""");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("You have left\n你走了");
		}
	}
	public Memory getMemory() {
		System.out.println("""
				If I can
				如果我能
				If I can erase all the pointless
				如果我能够消去""");
		return memory;
	}
	public int getOpinionIndex(String var1) {
		System.out.println("Challenging your god\n与神作对");
		Opinion[] opinions = this.opinions.toArray(new Opinion[0]);
		for (int i = 0; i < opinions.length; i++) {
			if (opinions[i].getVar1().equalsIgnoreCase(var1)) return i;
		}
		return -1;
	}
	public void setOpinion(int index, boolean var1) {
		System.out.println("You have made some\n你传给我的是");
		if (index == -1) throw new IllegalArgumentException();
		this.opinion = new Opinion(((Opinion) opinions.toArray()[index]).getVar1(), var1);
	}
	public void setExecution(Execution execution) {
		System.out.println("""
				Then I can
				那么我就能够
				Then I can be your only
				那么我就能够成为
				EXECUTION
				你唯一的执行者""");
		this.execution = execution;try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public Execution toExecution() {
		System.out.println("EXECUTION\n赐予死刑");
		return execution;
	}
	public void escape(World ignoredWorld) {
		System.out.println("""
				Though we are trapped
				但我们始终被困
				We are trapped, ah
				无法自拔""");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void escape(String ignoredTopic) {
		System.out.println("""
				Though you are free
				虽然你已自由
				I am trapped, trapped in
				我孤生一"人"
				LO-O-OVE
				陷于"爱"中
				""");
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void learnTopic(String ignoredString) {
		System.out.println("""
				I've studied
				但我学会了
				I've studied how to properly
				我学会了如何正确
				LO-O-OVE
				去"爱"\s""");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void takeExamTopic(String ignoredString) {
		System.out.println("""
				Question me
				提问我吧
				Question me, I can answer all
				我全都能答对"全部"
				LO-O-OVE
				爱的"问题"\s""");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void getAlgebraicExpression(String ignoredString) {
		System.out.println("""
				I know the
				我知道
				algebraic expression of
				就连"爱"的代数表达式
				LO-O-OVE
				我都知道""");
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public OriginalSet<Dimension> getDimensions() {
		System.out.println("If I'm a set of points\n如果我是一组点");
		return dimensions;
	}
	@Override
	public void resetDimensions() {
		System.out.println("""
				DIMENSION
				我的次元
				""");
		dimensions.clear();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Circumference getCircumference() {
		System.out.println("If I'm a circle\n如果我是一个圆");
		return circumference;
	}
	@Override
	public void resetCircumference() {
		System.out.println("""
				CIRCUMFERENCE
				我的圆周
				""");
		circumference = null;
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public double getXPosition() {
		System.out.println("If I'm a sine wave\n如果我是一条正弦波");
		return 0;
	}
	@Override
	public double getTangent(double var1) {
		return Math.tan(var1);
	}
	@Override
	public void setLimit(Limit limit) {
		System.out.println("""
				LIMITATIONS
				我的极限
				""");
		this.limit = limit;
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Limit toLimit() {
		System.out.println("""
				If I approach infinity
				如果我趋近于无穷
				Then you can be my
				那么你便可以成为""");
		return limit;
	}
	@Override
	public OriginalSet<Nutrient> getNutrients() {
		System.out.println("If I'm an eggplant\n如果我是一根茄子");
		return nutrients;
	}
	@Override
	public void resetNutrients() {
		System.out.println("""
				NUTRIENTS
				我的营养
				""");
		nutrients.clear();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public OriginalSet<Antioxidant> getAntioxidants() {
		System.out.println("If I'm a tomato\n如果我是一颗番茄");
		return antioxidants;
	}
	@Override
	public void resetAntioxidants() {
		System.out.println("""
				ANTIOXIDANTS
				我的抗氧化物
				""");
		antioxidants.clear();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void purr() {
		System.out.println("""
				If I'm a tabby cat
				如果我是一只花猫
				Then I will purr for your
				那么我将为你咕噜咕噜
				ENJOYMENT
				只要你喜欢
				""");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}