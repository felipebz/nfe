package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eSubclasseConsumo;
import org.simpleframework.xml.transform.Transform;

public class NF3eSubclasseConsumoTransformer implements Transform<NF3eSubclasseConsumo> {

    @Override
    public NF3eSubclasseConsumo read(final String codigo) {
        return NF3eSubclasseConsumo.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eSubclasseConsumo tipo) {
        return tipo.getCodigo();
    }

}
