package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eGrupoTensao;
import org.simpleframework.xml.transform.Transform;

public class NF3eGrupoTensaoTransformer implements Transform<NF3eGrupoTensao> {

    @Override
    public NF3eGrupoTensao read(final String codigo) {
        return NF3eGrupoTensao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eGrupoTensao tipo) {
        return tipo.getCodigo();
    }

}
