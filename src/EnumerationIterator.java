/**
 * Created by Тим on 24.05.2017.
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumiration;

    public EnumerationIterator(Enumeration enumiration) {
        this.enumiration = enumiration;
    }

    @Override
    public void hasNext() {
        return enumiration.hasMoreElements();

    }

    @Override
    public void next() {
        return enumiration.nextElement();

    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();

    }
}
