# ATIVA-REST
API desenvolvida para disponibilizar os dados dos ativos rodoviários do DNIT, a catalogação dos seus defeitos, bem como as principais características das rodovias.

<br>

## Iniciando com a API
Para usar a API, basta usar programas que trabalham com requisições REST, podendo-se usar os navegadores **Google Chrome** e o **Firefox**.<br/>
Em seguida, basta digitar o **endereço** de end-point da requisição, bem como os **parâmetros** utilizados como filtros na busca.
<br/>

### Exemplo de uso:
Para obter os dados de sinalização da malha rodoviaria do distrito federal em condição ruim, basta digitar no navegador:
```
.../api/sinalizacao?uf=df&condicao=ruim
```
Para buscar todos os defeitos no pavimento da Bahia, da BR-020, entre os KMs 330 e 360:
```
.../api/defeito?uf=ba&br=020&kmi=330000&kmf=360000
```
Onde **sinalizacao** e **defeito** são endereços de end-point da API, e os valores colocados após o **?** são os parâmetros usados como filtro na busca. Nesses casos: <br/> A primeira pesquisa está sendo filtrada por: **uf** e **condicao**, e <br/> A segunda requisição acrescenta como filtro, além da **uf** e da **br**, a faixa de intervalo entre os kms 330 e 360 da rodovia por meio dos parâmetros **kmi** e **kmf**.<br/>
<br/><br/>

## End-points 
Atualmente, é possível fazer a pesquisa para os seguintes tipos (End-points):
* `/sinalizacao`: sinalizações verticais de **Advertencia**, **Regulamentacao**, **Indicativa**, **Atrativos turisticos**, **Serviços auxiliares**, **Educativa** e **Temporaria**; incluso também aqui **Lombada** e **Faixa de pedestre**;

* `/defeito`: Os principais tipos de defeitos marcados no pavimento, incluindo: **Panela**, **Quebra de Bordo** e **Afundamento**;

* `/defensa`: Dispositivos de segurança (barreira / defensa), incluindo  **New Jersey**, **Concreto**, **Guarda Corpo**, **Metalica Simples**, **Metalica Dupla** e **Mista**;

* `/semaforo`: Locais com postes de semáforos;

* `/pardal`: Locais com barreiras eletrônicas;

* `/posto`: Postos de Segurança (PRF).

* `/gasolina`: Postos de Gasolina.

* `/iluminacao`: Postes de iluminação.
<br/><br/>

## Parâmetros 
Os principais parâmetros que podem ser utilizados como filtros nas buscas estão apresentados abaixo. Caso não sejam inseridos parâmetros, é retornado todos os valores do banco de dados.

* `nome`: Filtra a busca pelo nome do ativo, como ex: **lombada**;
* `condicao`: Filtra a busca pela condição do ativo, podendo ser **BOM**, **REGULAR** ou **RUIM**;
* `uf`: Filtra a busca pela Unidade Federativa;
* `br`: Filtra a busca pela BR a qual o objeto se encontra;
* `kmi`: Possibilita trabalhar com intervalos, filtrando por tudo que esta no km da rodovia maior que o km Inicial (**kmi**) informado ;
* `kmf`: Filtra tudo que esta no km da rodovia menor que o km Final (**kmf**) informado ;
* `km`: Permite realizar uma busca em um km exato da rodovia.
<br/><br/>


## Resultado 
De modo a facilitar e a padronizar as buscas, todos os objetos nos end-points foram projetados para compartilhar os mesmos atributos. Todos eles podem ser utilizados para busca.<br/>
Após ser inserido o end-point e os parâmetros desejados, é retornado um JSON com os resultados da busca, conforme o exemplo mostrado a seguir:
```
[
  {
    "nome": "REGULAMENTACAO",
    "condicao": "BOA",
    "uf": "DF",
    "br": "080",
    "km": 9858,
    "x": -48.16672134399414,
    "y": -15.730979919433594
  },
  {
    "nome": "ADVERTENCIA",
    "condicao": "BOA",
    "uf": "DF",
    "br": "080",
    "km": 9870,
    "x": -48.16685104370117,
    "y": -15.73095989227295
  },
  ...
```

<br/><br/>

## Sobre
Essa **API Rest** foi desenvolvida em linguagem JAVA usando as frameworks do **SPRING**, sendo utilizado as próprias tecnologias do SPRING 
para fazer os controles das requisições, e o *SPRING DATA JPA* fazer as comunicações com o banco de dados. <br/>
Duvidas ou sugestões podem ser encaminhadas para: `victordalosto@gmail.com`
