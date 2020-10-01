package CreatingAndDestroyingObject;

/*
* Created on : Wednesday 9/30/2020
* Description: Consider a builder when faced with many constructor parameters
* */


public class Item2 {

    private final int weight;

    private final int height;
    private final String furColor;

    public static class Builder {
        private final int weight;

        private int height = 0;
        private String furColor = null;

        public Builder(int weight){
            this.weight = weight;
        }

        public Builder height(int val){
            height = val;
            return this;
        }

        public Builder furColor(String val){
            furColor = val;
            return this;
        }

        public Item2 build() {
            return new Item2(this);
        }
    }

    private Item2(Builder builder){
        weight = builder.weight;
        height = builder.height;
        furColor = builder.furColor;
    }

    public static void main(String[] args) {
        Item2 item2 = new Builder(3).height(40).furColor("Black and White").build();
        System.out.println(item2.height);
    }
}
