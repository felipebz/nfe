package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eTipoPostoTarifarioCompleto;
import org.simpleframework.xml.transform.Transform;

public class NF3eTipoPostoTarifarioCompletoTransformer implements Transform<NF3eTipoPostoTarifarioCompleto> {

    @Override
    public NF3eTipoPostoTarifarioCompleto read(final String codigo) {
        return NF3eTipoPostoTarifarioCompleto.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eTipoPostoTarifarioCompleto tipo) {
        return tipo.getCodigo();
    }

}
