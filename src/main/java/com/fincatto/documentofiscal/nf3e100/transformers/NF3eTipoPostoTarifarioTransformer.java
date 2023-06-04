package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eTipoPostoTarifario;
import org.simpleframework.xml.transform.Transform;

public class NF3eTipoPostoTarifarioTransformer implements Transform<NF3eTipoPostoTarifario> {

    @Override
    public NF3eTipoPostoTarifario read(final String codigo) {
        return NF3eTipoPostoTarifario.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eTipoPostoTarifario tipo) {
        return tipo.getCodigo();
    }

}
