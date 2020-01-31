package mapping.dozer;

import mapping.ModelMapper;
import org.dozer.DozerBeanMapper;

public class DozerModelMapper<I,O> extends ModelMapper<I,O> {

    private final Class outputType;

    public DozerModelMapper(Class outputType) {
        this.outputType = outputType;
    }

    public O map(I input) {
        org.dozer.Mapper mapper = new DozerBeanMapper();
        return (O) mapper.map(input, outputType);
    }
}
