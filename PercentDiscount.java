abstract  public class PercentDiscount implements DiscountPolicy.PERCENT, DiscountCondition {
    private final double percent;
    PercentDiscount(double percent) {
        this.percent = percent;
    }
    @Override
    public final Money calculateFee(Money fee) {
        return fee.minus(fee.multi(percent));
    }
}