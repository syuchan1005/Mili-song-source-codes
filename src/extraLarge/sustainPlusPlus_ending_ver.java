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

        // TO BE CONTINUED
    }
}
