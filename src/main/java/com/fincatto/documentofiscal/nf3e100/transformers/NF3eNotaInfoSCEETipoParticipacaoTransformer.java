package com.fincatto.documentofiscal.nf3e100.transformers;

import com.fincatto.documentofiscal.nf3e100.classes.nota.NF3eNotaInfoSCEETipoParticipacao;
import org.simpleframework.xml.transform.Transform;

public class NF3eNotaInfoSCEETipoParticipacaoTransformer implements Transform<NF3eNotaInfoSCEETipoParticipacao> {

    @Override
    public NF3eNotaInfoSCEETipoParticipacao read(final String codigo) {
        return NF3eNotaInfoSCEETipoParticipacao.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NF3eNotaInfoSCEETipoParticipacao tipo) {
        return tipo.getCodigo();
    }

}
