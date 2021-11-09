package acao;

import DAO.LeilaoDaoSession;
import Enumeradores.SituacaoEnum;
import Model.LeilaoTeste;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class CadastrarLeilao {

    private final HttpServletResponse resp;
    private final HttpServletRequest req;

    public CadastrarLeilao(HttpServletResponse resp, HttpServletRequest req){
        this.resp = resp;
        this.req = req;
    }

    public SituacaoEnum retornaEnum(int num){
        if(num == 1){
            return SituacaoEnum.FECHADO;
        }else if(num == 2){
            return SituacaoEnum.ABERTO;
        }else if(num == 3){
            return SituacaoEnum.ENCERRADO;
        }
        return SituacaoEnum.CANCELADO;
    }

    public void executa() throws IOException {
        String campoNome = req.getParameter("objeto");
        String descricao = req.getParameter("descricao");
        int status = Integer.parseInt(req.getParameter("status"));
        LeilaoTeste leilao = new LeilaoTeste(campoNome,descricao,retornaEnum(status));
        LeilaoDaoSession dao = new LeilaoDaoSession();
        dao.salva(leilao);
        resp.sendRedirect(req.getServletContext().getContextPath() + "/entrada?acao=novoLeilao");
    }
}
