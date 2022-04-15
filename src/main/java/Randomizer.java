import java.util.Random;

public class Randomizer {
    public Egg egg;
    private Atlas atlas;

    Random rand = new Random();

    public Randomizer(Atlas atlas){
        this.atlas = atlas;
        String base = randomBaseColor();
        String pattern = randomPattern();
        String patternColor = randomPatternColor();
        String motif = randomMotif();

        while(base.equals(patternColor)){
            patternColor = randomPatternColor();
        }

        this.egg = new Egg(base, pattern, patternColor, motif);
    }

    private String randomBaseColor() {
        int n = rand.nextInt(atlas.baseColors.length);
        return atlas.baseColors[n];
    }

    private String randomPattern() {
        int n = rand.nextInt(atlas.patterns.length);
        return atlas.patterns[n];
    }

    private String randomPatternColor() {
        int n = rand.nextInt(atlas.patternColors.length);
        return atlas.patternColors[n];
    }

    private String randomMotif() {
        int n = rand.nextInt(atlas.motifs.length);
        return atlas.motifs[n];
    }
}
