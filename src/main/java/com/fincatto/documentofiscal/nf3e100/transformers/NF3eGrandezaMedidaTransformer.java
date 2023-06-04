package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eGrandezaMedida;
import org.simpleframework.xml.transform.Transform;

public class NF3eGrandezaMedidaTransformer implements Transform<NF3eGrandezaMedida> {

    @Override
    public NF3eGrandezaMedida read(final String codigo) {
        return NF3eGrandezaMedida.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eGrandezaMedida tipo) {
        return tipo.getCodigo();
    }

}
