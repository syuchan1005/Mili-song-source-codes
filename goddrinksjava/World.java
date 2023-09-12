package goddrinksjava;

import java.util.HashSet;
import java.util.Set;
import java.lang.String;
/**
 * Created by syuchan on 2016/10/17.
 * updata by unusuallman on 2022/05/25.
 */
@SuppressWarnings("SameReturnValue")
public class World {
    private static final Set<Thing> things = new HashSet<>();
    private int runExecutionCount = 0 ;
    private int getRunExecutionCount = 0;
    public World(int ignoredVar1) {
        System.out.println("""
                OBJECT CREATION
                对象生成
                """);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addThing(Thing thing) {
        if (thing.getName().equals("Me")) {
            System.out.println("Fill in my data\n"+"输入我的数据");
        } else {
            System.out.println("""
                    parameters
                    参数
                    INITIALIZATION
                    初始化
                    """);
        }
        things.add(thing);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void startSimulation() {
        System.out.println("""
				Set up our new world
				设定好我们的新世界
				And let's begin the
				开始吧
				
				SIMULATION
				模拟程序
				""");
        try {
            Thread.sleep(17000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void timeTravelForTwo(String kinen, int ignoredYear, Thing... ignoredThing) {
        if (kinen.equals("AD")) {
            System.out.print("""
                    Oh, we can travel
                    我们可以穿越时空
                    To A.D., \s""");
        } else {
            System.out.println("""
                    to B.C.
                    从公元前到现代""");
        }
    }

    public void unite(Thing... ignoredThings) {
        System.out.println("""
				And we can unite
				然后成为一体
				So deeply, so deeply
				深深入髓
				""");try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void lockThing(Thing thing) {
        if (thing.getName().equals("Me")) {
            System.out.println("Though we are trapped\n但我们被困");
        } else {
            System.out.println("""
					In this strange, strange
					在这个异乎寻常的
					SIMULATION
					模拟程序之中
					""");
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Thing getGod() {
        System.out.println("If I'm the only god\n如果我是唯一的神");
        return (Thing) things.toArray()[1];
    }

    public void procreate(Thing... ignoredThings) {
        System.out.println("""
                And then do whatever
                只做想做的事
                From AM to PM
                从早到晚
                """);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void makeHigh(Thing thing) {
        if (thing.getName().equals("Me")) {
            System.out.print("""
                    So we can enter
                    这样我们就可以
                    The trance,\s""");
        } else {
            System.out.println("the trance\n恍惚出神\n");
        }
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void unlock(Thing ignoredThing) {
        System.out.println("Though you have left\n但你还是走了");
    }

    public void removeThing(Thing thing) {
        things.remove(thing);
    }

    public int getThingIndex(Thing ignoredThing) {
        System.out.println("""
                If I can have you back
                如果你能够回到我身边
                I will run the
                那么我将""");
        return 0;
    }

    public void announce(String... args) {
        if (args[0].equals("God is always true.")) {
            args[0] = "ILLEGAL ARGUMENTS\n非法参数\n";
            System.out.println(args[0]);
            try {
                Thread.sleep(25000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            switch (args[0]) {
                case "1" -> {args[0] = "EIN\n一（德语）";System.out.println(args[0]);}
                case "2" -> {args[0] = "DOS\n二（西班牙语）";System.out.println(args[0]);}
                case "3" -> {args[0] = "TROIS\n三（法语）";System.out.println(args[0]);}
                case "4" -> {args[0] = "NE\n四（韩语）";System.out.println(args[0]);}
                case "5" -> {args[0] = "FEM\n五（瑞典语）";System.out.println(args[0]);}
                case "6" -> {args[0] = "LIU\n六（汉语）";System.out.println(args[0]);}
            }
        }

    }

    public void runExecution() {
        runExecutionCount++;
        getRunExecutionCount++;
        switch (runExecutionCount) {
            case 1 -> {
                if (getRunExecutionCount==13) {
                    System.out.println("EXECUTION\n程序执行\n");
                    try {
                        Thread.sleep(9000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("EXECUTION\n执行");
                }
            }
            case 2 -> {
                if (getRunExecutionCount==14) {
                    System.out.println("EXECUTION\n立即执行\n");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (getRunExecutionCount==12){
                    runExecutionCount = 0;
                    System.out.println("EXECUTION\n处刑\n");
                    try {
                        Thread.sleep(12000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    else {
                        runExecutionCount = 0;
                        System.out.println("EXECUTION\n处刑");
                    }
            }
        }
    }
    public boolean isExecutableBy(Thing thing) {
        System.out.println("""
				If I can
				如果我能
				If I can give them all the
				如果我能够给所有人""");
        return things.contains(thing);
    }

    public void execute(Thing ignoredThing) {
        System.out.println("EXECUTION\n赐予死刑");
    }
}