package br.ufg.inf.estevaocs;

import br.ufg.inf.estevaocs.dto.*;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class app {


    public static void main(String[] args) {
        Calendar cal = null;
        List<DtoInterface> list = new ArrayList<>();
        PaisDto pais = new PaisDto();
        NascimentoPluraridadeDto nascP = new NascimentoPluraridadeDto();
        SexoDto sexo = new SexoDto();
        NascimentoOrdemDto nascO = new NascimentoOrdemDto();
        DataSeguimentoDto dtSeg = new DataSeguimentoDto();
        RacaDto raca = new RacaDto();
        ObitoFonteDto obtoFnt = new ObitoFonteDto();
        NacionalidadeDto nac = new NacionalidadeDto();
        SituacaoFamiliarDto stFm = new SituacaoFamiliarDto();
        EstadoDto estd = new EstadoDto();
        MunicipioDto mcp = new MunicipioDto();
        IndividuoDto ind = new IndividuoDto();
        DadoDemograficoDto ddDm = new DadoDemograficoDto();
        EnderecoLinhaDto endLin = new EnderecoLinhaDto();
        EnderecoTipoDto endTip = new EnderecoTipoDto();
        EnderecoDto end = new EnderecoDto();
        UsoCondicionalDto usoCon = new UsoCondicionalDto();
        NomePreferidoDto nomePref = new NomePreferidoDto();
        NomeDto nome = new NomeDto();
        RepresentacaoDto rprs = new RepresentacaoDto();
        ComunicacaoUsoDto cmUs = new ComunicacaoUsoDto();
        ComunicacaoMeioDto cmMe = new ComunicacaoMeioDto();
        ComunicacaoPreferenciaDto cmPrf = new ComunicacaoPreferenciaDto();
        ComunicacaoDto cmnc = new ComunicacaoDto();
        AreaGeograficaDto arGeo = new AreaGeograficaDto();
        IdentificadorTipoDto idtTip = new IdentificadorTipoDto();
        IdentificadorDto idt = new IdentificadorDto();
        CtpsDto ctps = new CtpsDto();
        RelacionamentoTipoDto rlcTp = new RelacionamentoTipoDto();
        VinculoDto vinc = new VinculoDto();
        NomeUsoDto nomUso = new NomeUsoDto();
        UtilizacaoDto utl = new UtilizacaoDto();
        TituloEleitoralDto ttl = new TituloEleitoralDto();
        CertidaoTipoDto certTp =  new CertidaoTipoDto();
        CertidaoDto cert = new CertidaoDto();

        cal = Calendar.getInstance();
        ind = new IndividuoDto("Fulano");
        pais = new PaisDto(1, "Brasil");
        nascP = new NascimentoPluraridadeDto(1, "Nascimento");
        sexo = new SexoDto(1, "Masculino", null);
        nascO = new NascimentoOrdemDto(1, "nascimento Ordem");
        dtSeg = new DataSeguimentoDto("1", "data Seguimento");
        raca = new RacaDto(1, "Parda");
        obtoFnt = new ObitoFonteDto(1, "obito");
        nac = new NacionalidadeDto(1, "Brasileira");
        stFm = new SituacaoFamiliarDto(1, "Situcao Familiar");
        estd = new EstadoDto("1", "Goiás");
        mcp = new MunicipioDto("1", "Goiás", "Goiânia");
        ddDm = new DadoDemograficoDto(ind, cal, "21/11/1983",
                dtSeg, nascP, nascO, cal, "25/05/2016", obtoFnt, sexo, "Maria de Tal",
                "José da Silva", stFm, raca, "comentario", nac, mcp, estd, pais, cal);
        endLin = new EnderecoLinhaDto("Rua A, Num 312", "Linha", 1);
        endTip = new EnderecoTipoDto(1, "Casa");
        end = new EnderecoDto("Endereco1", ind, "Centro", "Central", mcp, estd, "99999-999", "123546", pais, endTip, cal,
                "20/07/2007", cal, "23/12/2010");
        usoCon = new UsoCondicionalDto(1, "Uso Condicional");
        nomePref = new NomePreferidoDto(1,"Josias");
        nome = new NomeDto("1", ind, "Dr.", "José", "Silva", "", nomePref, usoCon);
        rprs = new RepresentacaoDto(nome, "Utilizacao", "v");
        cmUs = new ComunicacaoUsoDto(1, "Profissional", "v");
        cmMe = new ComunicacaoMeioDto(1, "Celular", "f");
        cmPrf = new ComunicacaoPreferenciaDto("1", "Celular");
        cmnc = new ComunicacaoDto(ind, cmMe, cmPrf, "Profissional", cmUs);
        arGeo = new AreaGeograficaDto(1,"v", "Cerrado");
        idtTip = new IdentificadorTipoDto("1","Abrev");
        idt = new IdentificadorDto("1",ind,"Identificacao",arGeo, "SSP", cal, idtTip);
        ctps = new CtpsDto(idt, 1, estd);
        rlcTp = new RelacionamentoTipoDto(1, "Indentificador");
        vinc = new VinculoDto(idt, ind, rlcTp , cal, cal);
        nomUso = new NomeUsoDto(1,"f", "Identificacao");
        utl = new UtilizacaoDto(nome, nomUso, idt, cal, cal);
        ttl = new TituloEleitoralDto(idt, 30, 17);
        certTp = new CertidaoTipoDto(1, "Nascimento");
        cert = new CertidaoDto(idt, certTp, "Cartório Eleitoral 312", 525, 123,45);

        list.add(ind);
        list.add(pais);
        list.add(nascP);
        list.add(sexo);
        list.add(nascO);
        list.add(dtSeg);
        list.add(raca);
        list.add(obtoFnt);
        list.add(nac);
        list.add(stFm);
        list.add(estd);
        list.add(mcp);
        list.add(ddDm);
        list.add(endLin);
        list.add(endTip);
        list.add(end);
        list.add(usoCon);
        list.add(nomePref);
        list.add(nome);
        list.add(rprs);
        list.add(cmUs);
        list.add(cmMe);
        list.add(cmPrf);
        list.add(cmnc);
        list.add(arGeo);
        list.add(idtTip);
        list.add(idt);
        list.add(ctps);
        list.add(rlcTp);
        list.add(vinc);
        list.add(nomUso);
        list.add(utl);
        list.add(ttl);
        list.add(certTp);
        list.add(cert);

        list.forEach(item -> {
            try {
                String path = "/home/estevao/Área de Trabalho/mf-2018/aula-7/dto/out/";
                String className = item.getClass().getName().replace(item.getClass().getPackageName() + ".", "");
                String caminhoJson = String.format("%sjson/%s", path, className);
                String caminhoXml = String.format("%sxml/%s", path, className);
                File fileJson = new File(caminhoJson + ".json");
                File fileXml = new File(caminhoXml + ".xml");
                item = GenericDto.fromJson(fileJson, item.getClass());
                item = GenericDto.fromXml(fileXml, item.getClass());
            } catch (IOException | JAXBException e) {
                e.printStackTrace();
            }
        });

        list.forEach(item -> {
            try {

                System.out.println(item.toXml());
                System.out.println(item.toJson());
            } catch (IOException | JAXBException e) {
                e.printStackTrace();
            }
        });
    }
}
