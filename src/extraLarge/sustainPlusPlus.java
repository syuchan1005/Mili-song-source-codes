package extraLarge;

/**
 * The goal of this program is to obtain a HEALTHY
 * and SUSTAINABLE relationship, darling.
 *
 * @author Cassie Wei from Mili
 */
class sustainPlusPlus {
    public static void main(String[] args) {
        World world = new World();
        Life me = new Ghost();
        Life you = new Ghost();

        /**
         * If abstraction is the definition of beauty
         * Are those of us chasing after clarity
         * A representation of ugly?
         */
        world.getObjects().sortAttribute("beauty");
        if (world.getObjects().getFirst().getArtTags().indexOf("abstruct") != -) {
            me.addPhysicalAttribute("ugly");
            you.addPhysicalAttribute("ugly");
        }
        world.giveBestAward("ugly", me);
        world.giveBestAward("ugly", you);

        /**
         * CALL ME MOMMY
         * JUST LIKE YOUR FANTASY
         * There is no crime in ideality
         */
        if (you.getFetishes().searchByType("name calling", "mommy") != -1) {
            you.addToMemory(me);
            you.setNicknameFor(you.getMommy(me), "mommy");
        }
        Rule r = new Rule("Oedipus complex is okay", true);
        world.addRule(r);

        /**
         * MUX>>DEMUX
         * Can't you understand me?
         * I'm not mine NAND I'm not yours
         * Ah
         */
        try {
            you.decodeMessage(me.codeMessage("I'm not mine NAND I'm not yours.", "mux"), "mux");
        } catch (InsufficientIntelligenceQuotientException e) {
            world.sendMessage("Oh you dummy.", you);
            me.announce("Ah");
        }

        /**
         * This could end right here if you don't let it out
         * Let it out
         */
        if (you.getThoughts().size() != 0) {
            try {
                you.sayTo(you.getThoughts(), me);
                you.clearThoughts();
            } catch (TooMuchOFAPussyException e) {
                world.getRelationship(me, you).end();
            }
        }

        /**
         * Give up or give me your all
         * Tell me now
         * Tell me now
         */
        if (you.getMemories(me).getLove() < 0.5) {
            world.getRelationship(me, you).setSustain(0);
        } else {
            you.transferThoughts(me);
            you.transferAttributes(me);

            // sustain++;
            world.getRelationship(me, you).increaseSustain();
        }

        /**
         * If we can be completely simulated
         * Do we need a real reality?
         */
        Simulation s = new Simulation(me, world, 1993, 227760);
        if (s.compareToOriginal(me) == 100) {
            world.execute(me);
        }

        /**
         * Don't let words-die, let love run dry
         * Like what we did to the rivers we killed off in our near future
         * Ah
         */
        for (int sustain = 0; sustain < world.getRiver().size(); sustain++) {
            me.sayTo("I love you.", you);
            you.sayTo("I love you.", me);
        }

        /**
         * And mumble some stupid stuff
         * Like
         * "I saw it coming"
         * Pretend it's not happening
         * Us losers do nothing so winners keep winning
         */
        String[] tags = {"stupid", "dumb", "petty", "ignorant"};
        world.mute(me, tags);
        world.mute(you, tags);
        for (Life them : world.getLifeTopOnePercent()) {
            me.fight(them);
            you.fight(them);
        }

        /**
         * Sit
         * fetch you leash
         * DICTATED ECONOMY
         */
        me.command(you, "sit");
        me.command(you, "fetch");
        you.pay(me, you.getFinanceProperties(), "educational purposes");

        /**
         * Show me
         * Your belly
         * FORGOTTEN ECOLOGY
         */
        me.command(you, "strip");
        me.command(you, "exhabit");
        world.addPollution("environmental", "indecency", you);

        /**
         * Stay
         * Okay, eat
         * HUMAN PSYCHOLOGY
         */
        me.command(you, "stay");
        me.command(you, "eat");
        you.love(me);

        /**
         * ｇ００ｄ　　ｂｏｉ
         * Here's a treat
         * HUNGRY FOR ENERGY
         */
        me.praise(you, "Good boy.");
        me.gift(you, "meat");
        you.consumeLast();

        /**
         * We are searching
         * Following our human instincts
         * Looking for ghosts of the non-existing kind
         * Who make us whole from the very beginning
         */
        Ghost[] findings = world.search(me, "ghost");
        Ghost[] parents = new Ghost[2];
        for (Ghost g : findings) {
            me.addFamily(g);
            if (me.isHappy()) {
                if (parents[0] == null) {
                    parents[0] = g;
                }
                else if (parents[1] == null) {
                    parents[1] = g;
                }
                else {
                    //IGNORED because 'me' is never happy
                    //and will never be happy anyway
                }
            }
            me.removeFamily(g);
        }

        /**
         * We keep chasing
         * Dreaming about the perfect being
         * Perfect parents who are non-existing
         * Our bodies grew, our minds stayed the same
         */
        if (me.getDreamParents().equals(parents)) {
            me.setParents(parents);
        }
        else {
            me.throwTantrum();
        }

        /**
         * Now darling, where do we go from here?
         */
        me.ask(you, "Where do we go from here?");

        /**
         * Now darling, where do we go from here?
         */
        me.ask(you, "Where do we go from here?");

        /**
         * Now darling, where do we go from here?
         */
        me.ask(you, "Where do we go from here?");

        /**
         * Darling, darling
         */
        me.callFor(you);
        me.callFor(you);

        /**
         * Hey honey, where do we go from here?
         */
        you.ask(me, "Where do we go from here?");

        /**
         * Hey honey, where do we go from here?
         */
        you.ask(me, "Where do we go from here?");

        /**
         * Now darling, where do we go from here?
         */
        me.ask(you, "Where do we go from here?");

        /**
         * Now darling, where do we go from here?
         */
        me.ask(you, "Where do we go from here?");

        /**
         * To where?
         */
        me.ask(world, "To where?");

        /**
         * CALL ME DADDY
         * WHERE'S YOUR "YES SIR" & "PLEASE"?
         * That's the only vocabulary you need
         */
        you.setNicknameFor(you.getMemory(me), "daddy");
        String[] vocab = {"sir", "yes", "no", "please", "thank you", "master",
            "red", "green", "yellow"};
        you.setVocabulary(vocab);

        /**
         * MUX>>>DEMUX
         * Can't you understand me?
         * You turn my screen #0000ff
         */
        you.disorient(me);

        /**
         * We could end right here if you'd just let us fall
         * Let us fall
         */
        for (War w : you.getOngoingFights()) {
            if (w.getScore(you) < 0.5) {
                would.execute(me);
                would.execute(you);
            }
        }

        /**
         * No tears, no regrets
         * No zero-days at our fault
         */
        me.setMemory("sad", null);
        you.setMemory("sad", null);
        me.setMemory("regretful", null);
        you.setMemory("regretful", null);
        Vulnerability zeroDays = world.getVulnerabilities().getZeroDays();
        for (Vulnerability v : zeroDays) {
            v.setAuthors(null);
        }

        /**
         * Hear me out
         * It's a perfect plan
         */
        me.command(you, "listen");
        me.sayTo("Anything inconvenient, I shall erase for you.", you);

        /**
         * If you'd just
         * SHUT UP
         * SHUT UP
         * Then maybe you'll see what I've endured now
         */
        me.command(you, "be quiet");
        me.command(you, "be quiet");
        try {
            you.listenTelepathically(me, world);
        } catch (NotAMindReaderException e) {
            world.getRelationship(me, you).challenge();
        }

        /**
         * Hear me out
         * LILULILALULALULA
         */
        me.command(you, "listen");
        me.sayTo("I did it all for you.", you);
        you.ignoreCommands();
        you.setMessages(null);

        /**
         * It's all just sunk const, I know
         * But I'm not ready to stop
         */
        me.manipulate(you, "beg");
        me.manipulate(you, "gaslight");
        me.manipulate(you, "blame");
        me.manipulate(you, "taers");
        world.getRelationship(me, you).end();
        you.setMemory(me, null);

        /**
         * I don't want to stop
         */
        me.getMemory(you, "positive");
        me.getMemory(you, "date");
        me.getMemory(you, "fun");
        me.getMemory(you, "travel");
        me.getMemory(you, "wedding");
        me.getMemory(you, "pregnancy");
        me.getMemory(you, "kids");
        me.getMemory(you, "snuggle");
        me.getMemory(you, "netflix&chill");
        me.getMemory(you, "gaming");
        me.getMemory(you, "birthday");
        me.getMemory(you, "cooking");
        me.getMemory(you, "exercising");
        me.getMemory(you, "studying");
        me.getMemory(you, "gardening");
        me.getMemory(you, "chores");
        me.getMemory(you, "shopping");
        me.getMemory(you, "driving");
        me.getMemory(you, "daily");
        me.getMemory(you, "sad");
        me.getMemory(you, "angry");
        me.getMemory(you, "fight");
        me.getMemory(you, "forgiveness");
        me.getMemory(you, "makeup");
        me.getMemory(you);
        world.setRelationship(me, you, null);

        //    a
        // u
        //     i
        //  s
        //         ;
        //     i
        //   t
        //  s      ;
        //    a n +
        //  s    +
        //s  t
        //  s a  +
        // u   in +
        //s        ;
        //   ta n+
        //
        // u t  n +
        //s    in
        //   t  n+ ;
        //  s a
        //s  t i  +
        // u   i +
        //s   a n +
        //  s    + ;
        // u t i +
        //s st i  +
        // us a n +;
        //  s ain+
        //su  ai  +;
        //s  tain+
        // ust  n +
        //s stai + ;
        //su t in +;
        // ustain++
        //sustain++;
        //sustain++;
        //sustain++;
        //sustain++;
        //sustain++;
        //sustain++;
        //sustain++;
    }
}
