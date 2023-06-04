package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.NF3eTipoEmissao;
import org.simpleframework.xml.transform.Transform;

public class NF3eTipoEmissaoTransformer implements Transform<NF3eTipoEmissao> {

    @Override
    public NF3eTipoEmissao read(final String codigo) {
        return NF3eTipoEmissao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eTipoEmissao tipo) {
        return tipo.getCodigo();
    }

}
