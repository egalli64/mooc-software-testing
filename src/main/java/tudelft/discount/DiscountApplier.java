package tudelft.discount;

public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier(ProductDao dao) {
        this.dao = dao;
    }

    public void setNewPrices() {

        for (Product product : dao.all()) {
            switch(product.getCategory()) {
                case "BUSINESS":
                    product.setPrice(product.getPrice() * 1.1);
                    break;
                case "HOME":
                    product.setPrice(product.getPrice() * .9);
                    break;
            }
        }
    }
}
