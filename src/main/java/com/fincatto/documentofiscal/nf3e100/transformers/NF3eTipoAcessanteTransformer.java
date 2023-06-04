package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eTipoAcessante;
import org.simpleframework.xml.transform.Transform;

public class NF3eTipoAcessanteTransformer implements Transform<NF3eTipoAcessante> {

    @Override
    public NF3eTipoAcessante read(final String codigo) {
        return NF3eTipoAcessante.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eTipoAcessante tipo) {
        return tipo.getCodigo();
    }

}
