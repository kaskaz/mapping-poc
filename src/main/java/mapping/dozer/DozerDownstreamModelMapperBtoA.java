package mapping.dozer;

import models.StructureA;
import models.StructureB;

public class DozerDownstreamModelMapperBtoA extends DozerModelMapper<StructureB, StructureA> {
    public DozerDownstreamModelMapperBtoA() {
        super(StructureA.class);
    }
}
