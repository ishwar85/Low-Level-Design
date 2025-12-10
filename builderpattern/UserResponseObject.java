package builderpattern;

public class UserResponseObject {
    private String name;
    private String email;
    private String mobile;
    private Integer age;

    private Adderess adderes;

    private String Group;

    public static Builder builder() {
        return new Builder();
    }

    private UserResponseObject(Builder builder) {
        this.name = builder.name;
        this.adderes = builder.adderes;
        this.age = builder.age;
        this.Group = builder.Group;
        this.email = builder.email;
        this.mobile = builder.mobile;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public Integer getAge() {
        return age;
    }

    public Adderess getAdderes() {
        return adderes;
    }

    public String getGroup() {
        return Group;
    }

    public static class Builder {
        String name;
        String email;
        String mobile;
        Integer age;

        Adderess adderes;

        String Group;
        public UserResponseObject build() {
            return new UserResponseObject(this);
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder mobile(String mobile){
            this.mobile = mobile;
            return this;
        }
        public Builder Group(String Group){
            this.Group = Group;
            return this;
        }
        public Builder adderes(Adderess adderes){
            this.adderes = adderes;
            return this;
        }
        public Builder age(Integer age){
            this.age = age;
            return this;
        }
    }
}
