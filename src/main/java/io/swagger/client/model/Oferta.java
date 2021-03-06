/*
 * Gestão de Propostas
 * API de Gestão de Propostas.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.IndicativoSimNao;
import io.swagger.client.model.TipoSimulacao;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * Entidade representando uma oferta simulada para uma proposta.
 */
@ApiModel(description = "Entidade representando uma oferta simulada para uma proposta.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-10T12:41:57.739Z")
public class Oferta {
  @SerializedName("idOferta")
  private String idOferta = null;

  @SerializedName("origemOferta")
  private String origemOferta = null;

  @SerializedName("dataVencimentoPrimeiraParcela")
  private LocalDate dataVencimentoPrimeiraParcela = null;

  @SerializedName("dataVencimentoUltimaParcela")
  private LocalDate dataVencimentoUltimaParcela = null;

  @SerializedName("cetAnual")
  private Double cetAnual = null;

  @SerializedName("cetMensal")
  private Double cetMensal = null;

  @SerializedName("dataMovimento")
  private LocalDate dataMovimento = null;

  @SerializedName("codigoPlano")
  private String codigoPlano = null;

  @SerializedName("descricaoPlano")
  private String descricaoPlano = null;

  @SerializedName("codigoProduto")
  private String codigoProduto = null;

  @SerializedName("descricaoProduto")
  private String descricaoProduto = null;

  @SerializedName("dataEmissao")
  private LocalDate dataEmissao = null;

  @SerializedName("financiadoIndice")
  private Double financiadoIndice = null;

  @SerializedName("finioFSeguro")
  private Double finioFSeguro = null;

  @SerializedName("idProdutoSeguro")
  private Long idProdutoSeguro = null;

  @SerializedName("valorIOF")
  private Double valorIOF = null;

  @SerializedName("prazo")
  private Integer prazo = null;

  @SerializedName("valorPrimeiraPrestacao")
  private Double valorPrimeiraPrestacao = null;

  @SerializedName("seguradora")
  private String seguradora = null;

  @SerializedName("seguro")
  private Double seguro = null;

  @SerializedName("valorTAC")
  private Double valorTAC = null;

  @SerializedName("valorTaxa")
  private Double valorTaxa = null;

  @SerializedName("valorTaxaAnual")
  private Double valorTaxaAnual = null;

  @SerializedName("valorCompra")
  private Double valorCompra = null;

  @SerializedName("valorCredito")
  private Double valorCredito = null;

  @SerializedName("valorFinanciado")
  private Double valorFinanciado = null;

  @SerializedName("valorLiberado")
  private Double valorLiberado = null;

  @SerializedName("valorLiquidar")
  private Double valorLiquidar = null;

  @SerializedName("valorParcela")
  private Double valorParcela = null;

  @SerializedName("valorSeguro")
  private Double valorSeguro = null;

  @SerializedName("valorTaxaInclusao")
  private Double valorTaxaInclusao = null;

  @SerializedName("valorTaxaRenovacao")
  private Double valorTaxaRenovacao = null;

  @SerializedName("valorTotal")
  private Double valorTotal = null;

  @SerializedName("valorTotalPST")
  private Double valorTotalPST = null;

  @SerializedName("expiradaFaixaTarifaInclusao")
  private IndicativoSimNao expiradaFaixaTarifaInclusao = null;

  @SerializedName("sugeridoFaixaRetorno")
  private IndicativoSimNao sugeridoFaixaRetorno = null;

  @SerializedName("tipoSimulacao")
  private TipoSimulacao tipoSimulacao = null;

  public Oferta idOferta(String idOferta) {
    this.idOferta = idOferta;
    return this;
  }

   /**
   * Identificador da oferta.
   * @return idOferta
  **/
  @ApiModelProperty(value = "Identificador da oferta.")
  public String getIdOferta() {
    return idOferta;
  }

  public void setIdOferta(String idOferta) {
    this.idOferta = idOferta;
  }

  public Oferta origemOferta(String origemOferta) {
    this.origemOferta = origemOferta;
    return this;
  }

   /**
   * Origem da oferta.
   * @return origemOferta
  **/
  @ApiModelProperty(value = "Origem da oferta.")
  public String getOrigemOferta() {
    return origemOferta;
  }

  public void setOrigemOferta(String origemOferta) {
    this.origemOferta = origemOferta;
  }

  public Oferta dataVencimentoPrimeiraParcela(LocalDate dataVencimentoPrimeiraParcela) {
    this.dataVencimentoPrimeiraParcela = dataVencimentoPrimeiraParcela;
    return this;
  }

   /**
   * Data de vencimento da 1ª parcela.
   * @return dataVencimentoPrimeiraParcela
  **/
  @ApiModelProperty(value = "Data de vencimento da 1ª parcela.")
  public LocalDate getDataVencimentoPrimeiraParcela() {
    return dataVencimentoPrimeiraParcela;
  }

  public void setDataVencimentoPrimeiraParcela(LocalDate dataVencimentoPrimeiraParcela) {
    this.dataVencimentoPrimeiraParcela = dataVencimentoPrimeiraParcela;
  }

  public Oferta dataVencimentoUltimaParcela(LocalDate dataVencimentoUltimaParcela) {
    this.dataVencimentoUltimaParcela = dataVencimentoUltimaParcela;
    return this;
  }

   /**
   * Data de vencimento da última parcela.
   * @return dataVencimentoUltimaParcela
  **/
  @ApiModelProperty(value = "Data de vencimento da última parcela.")
  public LocalDate getDataVencimentoUltimaParcela() {
    return dataVencimentoUltimaParcela;
  }

  public void setDataVencimentoUltimaParcela(LocalDate dataVencimentoUltimaParcela) {
    this.dataVencimentoUltimaParcela = dataVencimentoUltimaParcela;
  }

  public Oferta cetAnual(Double cetAnual) {
    this.cetAnual = cetAnual;
    return this;
  }

   /**
   * Valor CET anual.
   * @return cetAnual
  **/
  @ApiModelProperty(value = "Valor CET anual.")
  public Double getCetAnual() {
    return cetAnual;
  }

  public void setCetAnual(Double cetAnual) {
    this.cetAnual = cetAnual;
  }

  public Oferta cetMensal(Double cetMensal) {
    this.cetMensal = cetMensal;
    return this;
  }

   /**
   * Valor CET mensal.
   * @return cetMensal
  **/
  @ApiModelProperty(value = "Valor CET mensal.")
  public Double getCetMensal() {
    return cetMensal;
  }

  public void setCetMensal(Double cetMensal) {
    this.cetMensal = cetMensal;
  }

  public Oferta dataMovimento(LocalDate dataMovimento) {
    this.dataMovimento = dataMovimento;
    return this;
  }

   /**
   * Data do movimento.
   * @return dataMovimento
  **/
  @ApiModelProperty(value = "Data do movimento.")
  public LocalDate getDataMovimento() {
    return dataMovimento;
  }

  public void setDataMovimento(LocalDate dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  public Oferta codigoPlano(String codigoPlano) {
    this.codigoPlano = codigoPlano;
    return this;
  }

   /**
   * Código do plano utilizada na simulação.
   * @return codigoPlano
  **/
  @ApiModelProperty(value = "Código do plano utilizada na simulação.")
  public String getCodigoPlano() {
    return codigoPlano;
  }

  public void setCodigoPlano(String codigoPlano) {
    this.codigoPlano = codigoPlano;
  }

  public Oferta descricaoPlano(String descricaoPlano) {
    this.descricaoPlano = descricaoPlano;
    return this;
  }

   /**
   * Descrição do plano utilizado na simulação.
   * @return descricaoPlano
  **/
  @ApiModelProperty(value = "Descrição do plano utilizado na simulação.")
  public String getDescricaoPlano() {
    return descricaoPlano;
  }

  public void setDescricaoPlano(String descricaoPlano) {
    this.descricaoPlano = descricaoPlano;
  }

  public Oferta codigoProduto(String codigoProduto) {
    this.codigoProduto = codigoProduto;
    return this;
  }

   /**
   * Código do produto utilizado na simulação.
   * @return codigoProduto
  **/
  @ApiModelProperty(value = "Código do produto utilizado na simulação.")
  public String getCodigoProduto() {
    return codigoProduto;
  }

  public void setCodigoProduto(String codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  public Oferta descricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
    return this;
  }

   /**
   * Descrição do produto utilizado na simulação.
   * @return descricaoProduto
  **/
  @ApiModelProperty(value = "Descrição do produto utilizado na simulação.")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }

  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  public Oferta dataEmissao(LocalDate dataEmissao) {
    this.dataEmissao = dataEmissao;
    return this;
  }

   /**
   * Data da emissão.
   * @return dataEmissao
  **/
  @ApiModelProperty(value = "Data da emissão.")
  public LocalDate getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(LocalDate dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public Oferta financiadoIndice(Double financiadoIndice) {
    this.financiadoIndice = financiadoIndice;
    return this;
  }

   /**
   * Valor financiado índice.
   * @return financiadoIndice
  **/
  @ApiModelProperty(value = "Valor financiado índice.")
  public Double getFinanciadoIndice() {
    return financiadoIndice;
  }

  public void setFinanciadoIndice(Double financiadoIndice) {
    this.financiadoIndice = financiadoIndice;
  }

  public Oferta finioFSeguro(Double finioFSeguro) {
    this.finioFSeguro = finioFSeguro;
    return this;
  }

   /**
   * Valor finio seguro.
   * @return finioFSeguro
  **/
  @ApiModelProperty(value = "Valor finio seguro.")
  public Double getFinioFSeguro() {
    return finioFSeguro;
  }

  public void setFinioFSeguro(Double finioFSeguro) {
    this.finioFSeguro = finioFSeguro;
  }

  public Oferta idProdutoSeguro(Long idProdutoSeguro) {
    this.idProdutoSeguro = idProdutoSeguro;
    return this;
  }

   /**
   * Identificador do produto do seguro.
   * @return idProdutoSeguro
  **/
  @ApiModelProperty(value = "Identificador do produto do seguro.")
  public Long getIdProdutoSeguro() {
    return idProdutoSeguro;
  }

  public void setIdProdutoSeguro(Long idProdutoSeguro) {
    this.idProdutoSeguro = idProdutoSeguro;
  }

  public Oferta valorIOF(Double valorIOF) {
    this.valorIOF = valorIOF;
    return this;
  }

   /**
   * Valor Final do IOF.
   * @return valorIOF
  **/
  @ApiModelProperty(value = "Valor Final do IOF.")
  public Double getValorIOF() {
    return valorIOF;
  }

  public void setValorIOF(Double valorIOF) {
    this.valorIOF = valorIOF;
  }

  public Oferta prazo(Integer prazo) {
    this.prazo = prazo;
    return this;
  }

   /**
   * Prazo / Qtd de Parcelas utilizada na simulação.
   * @return prazo
  **/
  @ApiModelProperty(value = "Prazo / Qtd de Parcelas utilizada na simulação.")
  public Integer getPrazo() {
    return prazo;
  }

  public void setPrazo(Integer prazo) {
    this.prazo = prazo;
  }

  public Oferta valorPrimeiraPrestacao(Double valorPrimeiraPrestacao) {
    this.valorPrimeiraPrestacao = valorPrimeiraPrestacao;
    return this;
  }

   /**
   * Valor da 1ª prestação.
   * @return valorPrimeiraPrestacao
  **/
  @ApiModelProperty(value = "Valor da 1ª prestação.")
  public Double getValorPrimeiraPrestacao() {
    return valorPrimeiraPrestacao;
  }

  public void setValorPrimeiraPrestacao(Double valorPrimeiraPrestacao) {
    this.valorPrimeiraPrestacao = valorPrimeiraPrestacao;
  }

  public Oferta seguradora(String seguradora) {
    this.seguradora = seguradora;
    return this;
  }

   /**
   * seguradora.
   * @return seguradora
  **/
  @ApiModelProperty(value = "seguradora.")
  public String getSeguradora() {
    return seguradora;
  }

  public void setSeguradora(String seguradora) {
    this.seguradora = seguradora;
  }

  public Oferta seguro(Double seguro) {
    this.seguro = seguro;
    return this;
  }

   /**
   * Valor do seguro.
   * @return seguro
  **/
  @ApiModelProperty(value = "Valor do seguro.")
  public Double getSeguro() {
    return seguro;
  }

  public void setSeguro(Double seguro) {
    this.seguro = seguro;
  }

  public Oferta valorTAC(Double valorTAC) {
    this.valorTAC = valorTAC;
    return this;
  }

   /**
   * Valor do TAC.
   * @return valorTAC
  **/
  @ApiModelProperty(value = "Valor do TAC.")
  public Double getValorTAC() {
    return valorTAC;
  }

  public void setValorTAC(Double valorTAC) {
    this.valorTAC = valorTAC;
  }

  public Oferta valorTaxa(Double valorTaxa) {
    this.valorTaxa = valorTaxa;
    return this;
  }

   /**
   * Valor da Taxa.
   * @return valorTaxa
  **/
  @ApiModelProperty(value = "Valor da Taxa.")
  public Double getValorTaxa() {
    return valorTaxa;
  }

  public void setValorTaxa(Double valorTaxa) {
    this.valorTaxa = valorTaxa;
  }

  public Oferta valorTaxaAnual(Double valorTaxaAnual) {
    this.valorTaxaAnual = valorTaxaAnual;
    return this;
  }

   /**
   * Valor da Taxa anual.
   * @return valorTaxaAnual
  **/
  @ApiModelProperty(value = "Valor da Taxa anual.")
  public Double getValorTaxaAnual() {
    return valorTaxaAnual;
  }

  public void setValorTaxaAnual(Double valorTaxaAnual) {
    this.valorTaxaAnual = valorTaxaAnual;
  }

  public Oferta valorCompra(Double valorCompra) {
    this.valorCompra = valorCompra;
    return this;
  }

   /**
   * Valor da compra. Resultante pela PMT ou utilizado no cálculo da simulação.
   * @return valorCompra
  **/
  @ApiModelProperty(value = "Valor da compra. Resultante pela PMT ou utilizado no cálculo da simulação.")
  public Double getValorCompra() {
    return valorCompra;
  }

  public void setValorCompra(Double valorCompra) {
    this.valorCompra = valorCompra;
  }

  public Oferta valorCredito(Double valorCredito) {
    this.valorCredito = valorCredito;
    return this;
  }

   /**
   * Valor do crédito.
   * @return valorCredito
  **/
  @ApiModelProperty(value = "Valor do crédito.")
  public Double getValorCredito() {
    return valorCredito;
  }

  public void setValorCredito(Double valorCredito) {
    this.valorCredito = valorCredito;
  }

  public Oferta valorFinanciado(Double valorFinanciado) {
    this.valorFinanciado = valorFinanciado;
    return this;
  }

   /**
   * Valor financiado.
   * @return valorFinanciado
  **/
  @ApiModelProperty(value = "Valor financiado.")
  public Double getValorFinanciado() {
    return valorFinanciado;
  }

  public void setValorFinanciado(Double valorFinanciado) {
    this.valorFinanciado = valorFinanciado;
  }

  public Oferta valorLiberado(Double valorLiberado) {
    this.valorLiberado = valorLiberado;
    return this;
  }

   /**
   * Valor liberado.
   * @return valorLiberado
  **/
  @ApiModelProperty(value = "Valor liberado.")
  public Double getValorLiberado() {
    return valorLiberado;
  }

  public void setValorLiberado(Double valorLiberado) {
    this.valorLiberado = valorLiberado;
  }

  public Oferta valorLiquidar(Double valorLiquidar) {
    this.valorLiquidar = valorLiquidar;
    return this;
  }

   /**
   * Valor a liquidar.
   * @return valorLiquidar
  **/
  @ApiModelProperty(value = "Valor a liquidar.")
  public Double getValorLiquidar() {
    return valorLiquidar;
  }

  public void setValorLiquidar(Double valorLiquidar) {
    this.valorLiquidar = valorLiquidar;
  }

  public Oferta valorParcela(Double valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }

   /**
   * Valor da parcela.
   * @return valorParcela
  **/
  @ApiModelProperty(value = "Valor da parcela.")
  public Double getValorParcela() {
    return valorParcela;
  }

  public void setValorParcela(Double valorParcela) {
    this.valorParcela = valorParcela;
  }

  public Oferta valorSeguro(Double valorSeguro) {
    this.valorSeguro = valorSeguro;
    return this;
  }

   /**
   * Valor Final do Seguro (se foi solicitado seguro).
   * @return valorSeguro
  **/
  @ApiModelProperty(value = "Valor Final do Seguro (se foi solicitado seguro).")
  public Double getValorSeguro() {
    return valorSeguro;
  }

  public void setValorSeguro(Double valorSeguro) {
    this.valorSeguro = valorSeguro;
  }

  public Oferta valorTaxaInclusao(Double valorTaxaInclusao) {
    this.valorTaxaInclusao = valorTaxaInclusao;
    return this;
  }

   /**
   * Valor da taxa de inclusão.
   * @return valorTaxaInclusao
  **/
  @ApiModelProperty(value = "Valor da taxa de inclusão.")
  public Double getValorTaxaInclusao() {
    return valorTaxaInclusao;
  }

  public void setValorTaxaInclusao(Double valorTaxaInclusao) {
    this.valorTaxaInclusao = valorTaxaInclusao;
  }

  public Oferta valorTaxaRenovacao(Double valorTaxaRenovacao) {
    this.valorTaxaRenovacao = valorTaxaRenovacao;
    return this;
  }

   /**
   * Valor da taxa de renovação.
   * @return valorTaxaRenovacao
  **/
  @ApiModelProperty(value = "Valor da taxa de renovação.")
  public Double getValorTaxaRenovacao() {
    return valorTaxaRenovacao;
  }

  public void setValorTaxaRenovacao(Double valorTaxaRenovacao) {
    this.valorTaxaRenovacao = valorTaxaRenovacao;
  }

  public Oferta valorTotal(Double valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

   /**
   * Valor do total com Juros (soma de todas as PMTs).
   * @return valorTotal
  **/
  @ApiModelProperty(value = "Valor do total com Juros (soma de todas as PMTs).")
  public Double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(Double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public Oferta valorTotalPST(Double valorTotalPST) {
    this.valorTotalPST = valorTotalPST;
    return this;
  }

   /**
   * Valor do total PST.
   * @return valorTotalPST
  **/
  @ApiModelProperty(value = "Valor do total PST.")
  public Double getValorTotalPST() {
    return valorTotalPST;
  }

  public void setValorTotalPST(Double valorTotalPST) {
    this.valorTotalPST = valorTotalPST;
  }

  public Oferta expiradaFaixaTarifaInclusao(IndicativoSimNao expiradaFaixaTarifaInclusao) {
    this.expiradaFaixaTarifaInclusao = expiradaFaixaTarifaInclusao;
    return this;
  }

   /**
   * Get expiradaFaixaTarifaInclusao
   * @return expiradaFaixaTarifaInclusao
  **/
  @ApiModelProperty(value = "")
  public IndicativoSimNao getExpiradaFaixaTarifaInclusao() {
    return expiradaFaixaTarifaInclusao;
  }

  public void setExpiradaFaixaTarifaInclusao(IndicativoSimNao expiradaFaixaTarifaInclusao) {
    this.expiradaFaixaTarifaInclusao = expiradaFaixaTarifaInclusao;
  }

  public Oferta sugeridoFaixaRetorno(IndicativoSimNao sugeridoFaixaRetorno) {
    this.sugeridoFaixaRetorno = sugeridoFaixaRetorno;
    return this;
  }

   /**
   * Get sugeridoFaixaRetorno
   * @return sugeridoFaixaRetorno
  **/
  @ApiModelProperty(value = "")
  public IndicativoSimNao getSugeridoFaixaRetorno() {
    return sugeridoFaixaRetorno;
  }

  public void setSugeridoFaixaRetorno(IndicativoSimNao sugeridoFaixaRetorno) {
    this.sugeridoFaixaRetorno = sugeridoFaixaRetorno;
  }

  public Oferta tipoSimulacao(TipoSimulacao tipoSimulacao) {
    this.tipoSimulacao = tipoSimulacao;
    return this;
  }

   /**
   * Get tipoSimulacao
   * @return tipoSimulacao
  **/
  @ApiModelProperty(value = "")
  public TipoSimulacao getTipoSimulacao() {
    return tipoSimulacao;
  }

  public void setTipoSimulacao(TipoSimulacao tipoSimulacao) {
    this.tipoSimulacao = tipoSimulacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oferta oferta = (Oferta) o;
    return Objects.equals(this.idOferta, oferta.idOferta) &&
        Objects.equals(this.origemOferta, oferta.origemOferta) &&
        Objects.equals(this.dataVencimentoPrimeiraParcela, oferta.dataVencimentoPrimeiraParcela) &&
        Objects.equals(this.dataVencimentoUltimaParcela, oferta.dataVencimentoUltimaParcela) &&
        Objects.equals(this.cetAnual, oferta.cetAnual) &&
        Objects.equals(this.cetMensal, oferta.cetMensal) &&
        Objects.equals(this.dataMovimento, oferta.dataMovimento) &&
        Objects.equals(this.codigoPlano, oferta.codigoPlano) &&
        Objects.equals(this.descricaoPlano, oferta.descricaoPlano) &&
        Objects.equals(this.codigoProduto, oferta.codigoProduto) &&
        Objects.equals(this.descricaoProduto, oferta.descricaoProduto) &&
        Objects.equals(this.dataEmissao, oferta.dataEmissao) &&
        Objects.equals(this.financiadoIndice, oferta.financiadoIndice) &&
        Objects.equals(this.finioFSeguro, oferta.finioFSeguro) &&
        Objects.equals(this.idProdutoSeguro, oferta.idProdutoSeguro) &&
        Objects.equals(this.valorIOF, oferta.valorIOF) &&
        Objects.equals(this.prazo, oferta.prazo) &&
        Objects.equals(this.valorPrimeiraPrestacao, oferta.valorPrimeiraPrestacao) &&
        Objects.equals(this.seguradora, oferta.seguradora) &&
        Objects.equals(this.seguro, oferta.seguro) &&
        Objects.equals(this.valorTAC, oferta.valorTAC) &&
        Objects.equals(this.valorTaxa, oferta.valorTaxa) &&
        Objects.equals(this.valorTaxaAnual, oferta.valorTaxaAnual) &&
        Objects.equals(this.valorCompra, oferta.valorCompra) &&
        Objects.equals(this.valorCredito, oferta.valorCredito) &&
        Objects.equals(this.valorFinanciado, oferta.valorFinanciado) &&
        Objects.equals(this.valorLiberado, oferta.valorLiberado) &&
        Objects.equals(this.valorLiquidar, oferta.valorLiquidar) &&
        Objects.equals(this.valorParcela, oferta.valorParcela) &&
        Objects.equals(this.valorSeguro, oferta.valorSeguro) &&
        Objects.equals(this.valorTaxaInclusao, oferta.valorTaxaInclusao) &&
        Objects.equals(this.valorTaxaRenovacao, oferta.valorTaxaRenovacao) &&
        Objects.equals(this.valorTotal, oferta.valorTotal) &&
        Objects.equals(this.valorTotalPST, oferta.valorTotalPST) &&
        Objects.equals(this.expiradaFaixaTarifaInclusao, oferta.expiradaFaixaTarifaInclusao) &&
        Objects.equals(this.sugeridoFaixaRetorno, oferta.sugeridoFaixaRetorno) &&
        Objects.equals(this.tipoSimulacao, oferta.tipoSimulacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOferta, origemOferta, dataVencimentoPrimeiraParcela, dataVencimentoUltimaParcela, cetAnual, cetMensal, dataMovimento, codigoPlano, descricaoPlano, codigoProduto, descricaoProduto, dataEmissao, financiadoIndice, finioFSeguro, idProdutoSeguro, valorIOF, prazo, valorPrimeiraPrestacao, seguradora, seguro, valorTAC, valorTaxa, valorTaxaAnual, valorCompra, valorCredito, valorFinanciado, valorLiberado, valorLiquidar, valorParcela, valorSeguro, valorTaxaInclusao, valorTaxaRenovacao, valorTotal, valorTotalPST, expiradaFaixaTarifaInclusao, sugeridoFaixaRetorno, tipoSimulacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Oferta {\n");
    
    sb.append("    idOferta: ").append(toIndentedString(idOferta)).append("\n");
    sb.append("    origemOferta: ").append(toIndentedString(origemOferta)).append("\n");
    sb.append("    dataVencimentoPrimeiraParcela: ").append(toIndentedString(dataVencimentoPrimeiraParcela)).append("\n");
    sb.append("    dataVencimentoUltimaParcela: ").append(toIndentedString(dataVencimentoUltimaParcela)).append("\n");
    sb.append("    cetAnual: ").append(toIndentedString(cetAnual)).append("\n");
    sb.append("    cetMensal: ").append(toIndentedString(cetMensal)).append("\n");
    sb.append("    dataMovimento: ").append(toIndentedString(dataMovimento)).append("\n");
    sb.append("    codigoPlano: ").append(toIndentedString(codigoPlano)).append("\n");
    sb.append("    descricaoPlano: ").append(toIndentedString(descricaoPlano)).append("\n");
    sb.append("    codigoProduto: ").append(toIndentedString(codigoProduto)).append("\n");
    sb.append("    descricaoProduto: ").append(toIndentedString(descricaoProduto)).append("\n");
    sb.append("    dataEmissao: ").append(toIndentedString(dataEmissao)).append("\n");
    sb.append("    financiadoIndice: ").append(toIndentedString(financiadoIndice)).append("\n");
    sb.append("    finioFSeguro: ").append(toIndentedString(finioFSeguro)).append("\n");
    sb.append("    idProdutoSeguro: ").append(toIndentedString(idProdutoSeguro)).append("\n");
    sb.append("    valorIOF: ").append(toIndentedString(valorIOF)).append("\n");
    sb.append("    prazo: ").append(toIndentedString(prazo)).append("\n");
    sb.append("    valorPrimeiraPrestacao: ").append(toIndentedString(valorPrimeiraPrestacao)).append("\n");
    sb.append("    seguradora: ").append(toIndentedString(seguradora)).append("\n");
    sb.append("    seguro: ").append(toIndentedString(seguro)).append("\n");
    sb.append("    valorTAC: ").append(toIndentedString(valorTAC)).append("\n");
    sb.append("    valorTaxa: ").append(toIndentedString(valorTaxa)).append("\n");
    sb.append("    valorTaxaAnual: ").append(toIndentedString(valorTaxaAnual)).append("\n");
    sb.append("    valorCompra: ").append(toIndentedString(valorCompra)).append("\n");
    sb.append("    valorCredito: ").append(toIndentedString(valorCredito)).append("\n");
    sb.append("    valorFinanciado: ").append(toIndentedString(valorFinanciado)).append("\n");
    sb.append("    valorLiberado: ").append(toIndentedString(valorLiberado)).append("\n");
    sb.append("    valorLiquidar: ").append(toIndentedString(valorLiquidar)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    valorSeguro: ").append(toIndentedString(valorSeguro)).append("\n");
    sb.append("    valorTaxaInclusao: ").append(toIndentedString(valorTaxaInclusao)).append("\n");
    sb.append("    valorTaxaRenovacao: ").append(toIndentedString(valorTaxaRenovacao)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    valorTotalPST: ").append(toIndentedString(valorTotalPST)).append("\n");
    sb.append("    expiradaFaixaTarifaInclusao: ").append(toIndentedString(expiradaFaixaTarifaInclusao)).append("\n");
    sb.append("    sugeridoFaixaRetorno: ").append(toIndentedString(sugeridoFaixaRetorno)).append("\n");
    sb.append("    tipoSimulacao: ").append(toIndentedString(tipoSimulacao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

