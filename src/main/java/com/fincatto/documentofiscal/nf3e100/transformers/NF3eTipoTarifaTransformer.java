package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eTipoTarifa;
import org.simpleframework.xml.transform.Transform;

public class NF3eTipoTarifaTransformer implements Transform<NF3eTipoTarifa> {

    @Override
    public NF3eTipoTarifa read(final String codigo) {
        return NF3eTipoTarifa.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eTipoTarifa tipo) {
        return tipo.getCodigo();
    }

}
