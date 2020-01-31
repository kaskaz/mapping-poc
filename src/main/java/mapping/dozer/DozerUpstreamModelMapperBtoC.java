package mapping.dozer;

import models.StructureB;
import models.StructureC;

public class DozerUpstreamModelMapperBtoC extends DozerModelMapper<StructureB, StructureC> {
    public DozerUpstreamModelMapperBtoC() {
        super(StructureC.class);
    }
}
