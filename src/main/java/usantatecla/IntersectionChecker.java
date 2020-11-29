package usantatecla;

public class IntersectionChecker {


    public boolean isThereIntersection(Interval interval, Interval compareInterval){
        return compareInterval.getMin().isWithin(interval.getMax().value) && compareInterval.getMax().isWithin(interval.getMin().value);
    }
    public Interval getIntersection(Interval interval, Interval compareInterval) {
        assert this.isThereIntersection(interval, compareInterval);
        Min min = this.getMin(interval, compareInterval);
        Max max = this.getMax(interval, compareInterval);
        return new Interval(min,max);
    }

}
