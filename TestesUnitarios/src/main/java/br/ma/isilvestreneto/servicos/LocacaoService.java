package br.ma.isilvestreneto.servicos;

import br.ma.isilvestreneto.entidades.Filme;
import br.ma.isilvestreneto.entidades.Locacao;
import br.ma.isilvestreneto.entidades.Usuario;

import java.util.Date;

import static br.ce.wcaquino.utils.DataUtils.adicionarDias;

public class LocacaoService {

    public static void main(String[] args) {

    }

    public Locacao alugarFilme(Usuario usuario, Filme filme) {
        Locacao locacao = new Locacao();
        locacao.setFilme(filme);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(new Date());
        locacao.setValor(filme.getPrecoLocacao());

        //Entrega no dia seguinte
        Date dataEntrega = new Date();
        dataEntrega = adicionarDias(dataEntrega, 1);
        locacao.setDataRetorno(dataEntrega);

        //Salvando a locacao...
        //TODO adicionar método para salvar

        return locacao;
    }
}