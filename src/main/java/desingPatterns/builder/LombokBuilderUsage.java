package desingPatterns.builder;

public class LombokBuilderUsage {
    public static void main(String[] args) {
        GraphicsCard graphicsCard=GraphicsCard.builder()
                .memoryInMb(2048)
                .modelName("GF116")
                .producer("Asus")
                .series("1xxxx")
                .build();
        System.out.println(graphicsCard);
    }
}
