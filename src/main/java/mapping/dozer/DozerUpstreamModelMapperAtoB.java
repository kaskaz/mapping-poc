package mapping.dozer;

import models.StructureA;
import models.StructureB;

public class DozerUpstreamModelMapperAtoB extends DozerModelMapper<StructureA, StructureB> {
    public DozerUpstreamModelMapperAtoB() {
        super(StructureB.class);
    }
}
