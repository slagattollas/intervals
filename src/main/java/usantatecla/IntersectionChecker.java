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
    public Min getMin(Interval interval, Interval compareInterval){
        if(compareInterval.getMin().isOpen()){
            if(interval.getMin().value > compareInterval.getMin().value) return interval.getMin();
        }else{
            if(interval.getMin().value >= compareInterval.getMin().value) return interval.getMin();
        }
        return compareInterval.getMin();
    }
    public Max getMax(Interval interval, Interval compareInterval){
        if(compareInterval.getMax().isOpen()){
            if(interval.getMax().value < compareInterval.getMax().value) return interval.getMax();
        }else{
            if(interval.getMax().value <= compareInterval.getMax().value) return interval.getMax();
        }
        return compareInterval.getMax();
    }
}
