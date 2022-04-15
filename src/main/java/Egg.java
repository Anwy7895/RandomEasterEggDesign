public class Egg {
    private String baseColor;
    private String pattern;
    private String patternColor;
    private String motif;

    public Egg(String baseColor, String pattern, String patternColor, String motif){
        this.baseColor = baseColor;
        this.pattern = pattern;
        this.patternColor = patternColor;
        this.motif = motif;
    }

    public void printEggDesign(){
        System.out.println("A " + this.baseColor + " egg, with " + this.patternColor + " " + this.pattern +
                " in the background, and a " + this.motif + " motif.");
    }
}
