package by.gstu.training.task2.symbol;

/**
 * Class with common description of Symbols
 */

public class Symbol {

    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Symbol symbol1 = (Symbol) o;
        return symbol == symbol1.symbol;
    }

    @Override
    public int hashCode() {
        final int hash = 47;
        return hash + super.hashCode();
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
