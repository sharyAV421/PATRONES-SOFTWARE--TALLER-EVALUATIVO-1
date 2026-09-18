public class Main {

    static class Policy {
        String name, product;
        double hectares, value;

        Policy(String name, String product, double hectares, double value) {
            this.name = name;
            this.product = product;
            this.hectares = hectares;
            this.value = value;
        }

        double premium() {
            return hectares * value * 0.09;
        }
    }

    static class Builder {
        String name, product;
        double hectares, value;

        Builder name(String x) {
            name = x;
            return this;
        }

        Builder product(String x) {
            product = x;
            return this;
        }

        Builder hectares(double x) {
            hectares = x;
            return this;
        }

        Builder value(double x) {
            value = x;
            return this;
        }

        Policy build() {
            return new Policy(name, product, hectares, value);
        }
    }

    static class Factory {
        static String create(String product) {
            if (product.equals("DROUGHT"))
                return "Drought Certificate";

            if (product.equals("FROST"))
                return "Frost Certificate";

            return "Rain Certificate";
        }
    }

    static class Sales {
        void sell(Policy p, String channel) {
            System.out.println(p.name + " - " + p.product);
            System.out.println("Channel: " + channel);
            System.out.println("Premium: $" + p.premium());
            System.out.println("Certificate: " +
                    Factory.create(p.product));
        }
    }

    public static void main(String[] args) {

        Policy p = new Builder()
                .name("Rosa Elena Pabon")
                .product("FROST")
                .hectares(3.5)
                .value(8000000)
                .build();

        Sales sales = new Sales();

        sales.sell(p, "COOPERATIVE");

        System.out.println("Indemnity: $15400000");
    }
}
