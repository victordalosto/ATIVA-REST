package dnit.ativa.controller.api;
import java.util.List;

import dnit.ativa.model.Modelo;

public interface APIController {

    /** Define o modelo dos metodos que as APIs Controller 
     *  precisam implementar e os parametros das requisicoes 
     *  as quais elas precisam filtrar.                   
     *  @Param nome     : Filtra os ativos pelo o seu nome.
     *  @Param condicao : Filtra os ativos pela sua condicao.
     *  @Param uf     : Filtra os ativos pela sua unidade federativa.
     *  @Param br     : Filtra os ativos pela BR a qual ela esta.
     *  @Param km  : Filtra usando o km exato que o ativo se encontra.
     *  @Param kmI : Filtra todos os ativos com km maior que o kmI. 
     *  @Param kmF : Filtra todos os ativos com km menor que o kmF. 
     * @return retorna um JSON (Lista) com todos os ativos filtrados.
     * */
    public List<? extends Modelo> get(String nome, String condicao, 
                                      String uf, String br, String km,
                                      String kmI, String kmF);

    
}
