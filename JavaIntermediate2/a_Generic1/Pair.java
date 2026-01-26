package a_Generic1;

public class Pair<I, S> {
    private I first;
    private S second;

    public void setFirst(I first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public I getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
