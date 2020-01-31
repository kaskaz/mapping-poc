package mapping.dozer;

import models.StructureB;
import models.StructureC;

public class DozerDownstreamModelMapperCtoB extends DozerModelMapper<StructureC,StructureB> {
    public DozerDownstreamModelMapperCtoB() {
        super(StructureB.class);
    }
}
