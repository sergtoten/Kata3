package software.ulpgc.katas;

public record User(String name, Gender gender) {

    public enum Gender {
        male, female
    }
}
