package ua.lviv.lgs;

public interface Iterator {
    boolean hasNext();

    Number next();
}

class Collection {
    private Number[] array;

    public Collection(Number[] array) {
        this.array = array;
    }

    public class FirstIterator implements Iterator {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < array.length;
        }

        @Override
        public Number next() {
            Number currentNumber = array[currentIndex++];
            if (currentNumber.intValue() % 2 != 0) {
                array[currentIndex - 1] = 0;
            }
            return currentNumber;
        }
    }

    public class SecondIterator implements Iterator {
        private int currentIndex = array.length - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Number next() {
            Number currentNumber = array[currentIndex];
            currentIndex -= 2;
            return currentNumber;
        }
    }

}
