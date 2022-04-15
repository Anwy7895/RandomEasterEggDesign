public class Start {
    public static void main(String[] args) {
        String[] basesForAtlas = {"White", "Black", "Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Pink"};
        String[] patternsForAtlas = {"zigzags", "dots", "stripes", "eggs", "circles", "squares", "triangles", "waves"};
        String[] patternColorsForAtlas = {"white", "black", "red", "orange", "yellow", "green", "blue", "purple", "pink"};
        String[] motifsForAtlas = {"chicken", "daffodil", "egg", "pig", "candle", "lamb", "rabbit", "fish"};

        Atlas atlas = new Atlas(basesForAtlas, patternsForAtlas, patternColorsForAtlas, motifsForAtlas);
        Randomizer randomizer = new Randomizer(atlas);
        System.out.println("Your egg design is: ");
        randomizer.egg.printEggDesign();
    }
}
