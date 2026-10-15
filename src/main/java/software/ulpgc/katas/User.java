package software.ulpgc.katas;

public record User(String name, Gender gender, byte[] pictures) {

    public enum Gender {
        male, female
    }
}
