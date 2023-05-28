package com.fincatto.documentofiscal.nf3e100.classes;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nf3e100.parsers.NF3eChaveParser;

import java.util.Arrays;

public enum NF3eAutorizador100 {

    PR {
        @Override
        public String getStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nf3e.fazenda.pr.gov.br/nf3e/NF3eStatusServico" : "https://nf3e.fazenda.pr.gov.br/nf3e/NF3eStatusServico";
        }

        @Override
        public String getConsultaProtocolo(DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nf3e.fazenda.pr.gov.br/nf3e/NF3eConsulta" : "https://nf3e.fazenda.pr.gov.br/nf3e/NF3eConsulta";
        }

        @Override
        public String getRecepcaoEvento(DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://homologacao.nf3e.fazenda.pr.gov.br/nf3e/NF3eRecepcaoEvento" : "https://nf3e.fazenda.pr.gov.br/nf3e/NF3eRecepcaoEvento";
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{DFUnidadeFederativa.PR};
        }
    },

    SVRS {
        @Override
        public String getStatusServico(final DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nf3e-homologacao.svrs.rs.gov.br/ws/nf3eStatusServico/nf3eStatusServico.asmx" : "https://nf3e.svrs.rs.gov.br/ws/nf3eStatusServico/nf3eStatusServico.asmx";
        }

        @Override
        public String getConsultaProtocolo(DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nf3e-homologacao.svrs.rs.gov.br/ws/nf3eConsulta/nf3eConsulta.asmx" : "https://nf3e.svrs.rs.gov.br/ws/nf3eConsulta/nf3eConsulta.asmx";
        }

        @Override
        public String getRecepcaoEvento(DFAmbiente ambiente) {
            return DFAmbiente.HOMOLOGACAO.equals(ambiente) ? "https://nf3e-homologacao.svrs.rs.gov.br/ws/nf3eRecepcaoEvento/nf3eRecepcaoEvento.asmx" : "https://nf3e.svrs.rs.gov.br/ws/nf3eRecepcaoEvento/nf3eRecepcaoEvento.asmx";
        }

        @Override
        public DFUnidadeFederativa[] getUFs() {
            return new DFUnidadeFederativa[]{
                    DFUnidadeFederativa.AL,
                    DFUnidadeFederativa.AM,
                    DFUnidadeFederativa.CE,
                    DFUnidadeFederativa.ES,
                    DFUnidadeFederativa.GO,
                    DFUnidadeFederativa.MA,
                    DFUnidadeFederativa.PA,
                    DFUnidadeFederativa.PB,
                    DFUnidadeFederativa.RJ,
                    DFUnidadeFederativa.RS,
                    DFUnidadeFederativa.SC,
                    DFUnidadeFederativa.SE,
                    DFUnidadeFederativa.TO};
        }
    };

    public abstract String getStatusServico(final DFAmbiente ambiente);

    public abstract String getConsultaProtocolo(final DFAmbiente ambiente);

    public abstract String getRecepcaoEvento(final DFAmbiente ambiente);
    
    public abstract DFUnidadeFederativa[] getUFs();
    
    public static NF3eAutorizador100 valueOfCodigoUF(final DFUnidadeFederativa uf) {
        for (final NF3eAutorizador100 autorizador : NF3eAutorizador100.values()) {
            if (Arrays.asList(autorizador.getUFs()).contains(uf)) {
                return autorizador;
            }
        }
        throw new IllegalStateException(String.format("Não existe autorizador para a UF %s", uf.getCodigo()));
    }
    
    public static NF3eAutorizador100 valueOfChaveAcesso(final String chaveAcesso) {
        final NF3eChaveParser chaveParser = new NF3eChaveParser(chaveAcesso);
        return NF3eAutorizador100.valueOfCodigoUF(chaveParser.getNFUnidadeFederativa());
    }
}