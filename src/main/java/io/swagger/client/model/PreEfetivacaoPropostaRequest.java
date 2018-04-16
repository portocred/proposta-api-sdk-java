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
import io.swagger.client.model.Cheque;
import io.swagger.client.model.DadosLiberacao;
import io.swagger.client.model.FormaEnvio;
import io.swagger.client.model.TipoEfetivacao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Objeto de entrada com os dados para pré-efetivar a proposta.
 */
@ApiModel(description = "Objeto de entrada com os dados para pré-efetivar a proposta.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-10T12:41:57.739Z")
public class PreEfetivacaoPropostaRequest {
  @SerializedName("cheques")
  private List<Cheque> cheques = null;

  @SerializedName("dadosLiberacao")
  private DadosLiberacao dadosLiberacao = null;

  @SerializedName("formaEnvio")
  private FormaEnvio formaEnvio = null;

  @SerializedName("tipoEfetivacao")
  private TipoEfetivacao tipoEfetivacao = null;

  public PreEfetivacaoPropostaRequest cheques(List<Cheque> cheques) {
    this.cheques = cheques;
    return this;
  }

  public PreEfetivacaoPropostaRequest addChequesItem(Cheque chequesItem) {
    if (this.cheques == null) {
      this.cheques = new ArrayList<Cheque>();
    }
    this.cheques.add(chequesItem);
    return this;
  }

   /**
   * Get cheques
   * @return cheques
  **/
  @ApiModelProperty(value = "")
  public List<Cheque> getCheques() {
    return cheques;
  }

  public void setCheques(List<Cheque> cheques) {
    this.cheques = cheques;
  }

  public PreEfetivacaoPropostaRequest dadosLiberacao(DadosLiberacao dadosLiberacao) {
    this.dadosLiberacao = dadosLiberacao;
    return this;
  }

   /**
   * Get dadosLiberacao
   * @return dadosLiberacao
  **/
  @ApiModelProperty(value = "")
  public DadosLiberacao getDadosLiberacao() {
    return dadosLiberacao;
  }

  public void setDadosLiberacao(DadosLiberacao dadosLiberacao) {
    this.dadosLiberacao = dadosLiberacao;
  }

  public PreEfetivacaoPropostaRequest formaEnvio(FormaEnvio formaEnvio) {
    this.formaEnvio = formaEnvio;
    return this;
  }

   /**
   * Get formaEnvio
   * @return formaEnvio
  **/
  @ApiModelProperty(value = "")
  public FormaEnvio getFormaEnvio() {
    return formaEnvio;
  }

  public void setFormaEnvio(FormaEnvio formaEnvio) {
    this.formaEnvio = formaEnvio;
  }

  public PreEfetivacaoPropostaRequest tipoEfetivacao(TipoEfetivacao tipoEfetivacao) {
    this.tipoEfetivacao = tipoEfetivacao;
    return this;
  }

   /**
   * Get tipoEfetivacao
   * @return tipoEfetivacao
  **/
  @ApiModelProperty(value = "")
  public TipoEfetivacao getTipoEfetivacao() {
    return tipoEfetivacao;
  }

  public void setTipoEfetivacao(TipoEfetivacao tipoEfetivacao) {
    this.tipoEfetivacao = tipoEfetivacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreEfetivacaoPropostaRequest preEfetivacaoPropostaRequest = (PreEfetivacaoPropostaRequest) o;
    return Objects.equals(this.cheques, preEfetivacaoPropostaRequest.cheques) &&
        Objects.equals(this.dadosLiberacao, preEfetivacaoPropostaRequest.dadosLiberacao) &&
        Objects.equals(this.formaEnvio, preEfetivacaoPropostaRequest.formaEnvio) &&
        Objects.equals(this.tipoEfetivacao, preEfetivacaoPropostaRequest.tipoEfetivacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cheques, dadosLiberacao, formaEnvio, tipoEfetivacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreEfetivacaoPropostaRequest {\n");
    
    sb.append("    cheques: ").append(toIndentedString(cheques)).append("\n");
    sb.append("    dadosLiberacao: ").append(toIndentedString(dadosLiberacao)).append("\n");
    sb.append("    formaEnvio: ").append(toIndentedString(formaEnvio)).append("\n");
    sb.append("    tipoEfetivacao: ").append(toIndentedString(tipoEfetivacao)).append("\n");
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

