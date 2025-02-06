public class Soda {
    private String brandName;
    private int caffeineContent;
    private boolean isDiet;

    public Soda(String brandName, int caffeineContent, boolean isDiet) {
        this.brandName = brandName;
        this.caffeineContent = caffeineContent;
        this.isDiet = isDiet;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getCaffeineContent() {
        return caffeineContent;
    }

    public boolean isDiet() {
        return isDiet;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setCaffeineContent(int caffeineContent) {
        this.caffeineContent = caffeineContent;
    }

    public void setDiet(boolean diet) {
        isDiet = diet;
    }

    @Override
    public String toString() {
        return "Soda{" +
                "brandName='" + brandName + '\'' +
                ", caffeineContent=" + caffeineContent +
                ", isDiet=" + isDiet +
                '}';
    }

    public void drink() {
        System.out.println("I am drinking this delicious soda! " + this.getBrandName());
    }
}
