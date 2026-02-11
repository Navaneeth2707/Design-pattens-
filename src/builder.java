 class User {

    private final int roll;
    private final String firstname;
    private final String lastname;

    private User(Builder builder) {
        this.roll = builder.roll;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
    }

    // Static Inner Builder Class
    public static class Builder {

        // Required field
        private final int roll;

        // Optional fields
        private String firstname;
        private String lastname;

        public Builder(int roll) {
            this.roll = roll;
        }

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
