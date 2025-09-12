public enum TicTacToeValue {
    X {
        @Override
        public boolean isOpen() {
            return false;
        }

        @Override
        public TicTacToeValue opponent() {
            return O;
        }

        @Override
        public String toString() {
            return "X";
        }
    }, O {
        @Override
        public boolean isOpen() {
            return false;
        }

        @Override
        public TicTacToeValue opponent() {
            return X;
        }

        @Override
        public String toString() {
            return "O";
        }
    }, EMPTY {
        @Override
        public boolean isOpen() {
            return true;
        }

        @Override
        public TicTacToeValue opponent() {
            throw new IllegalStateException("EMPTY has no opponent");
        }

        @Override
        public String toString() {
            return "_";
        }
    };

    abstract public boolean isOpen();
    abstract public TicTacToeValue opponent();
}
