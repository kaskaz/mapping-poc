package mapping;

public abstract class ModelMapper<I,O> {
    public abstract O map(I input);
}
