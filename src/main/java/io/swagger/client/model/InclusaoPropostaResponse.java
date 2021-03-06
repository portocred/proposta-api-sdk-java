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
import java.io.IOException;

/**
 * Objeto de resposta para o número da proposta.
 */
@ApiModel(description = "Objeto de resposta para o número da proposta.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-10T12:41:57.739Z")
public class InclusaoPropostaResponse {
  @SerializedName("numero")
  private String numero = null;

  @SerializedName("situacao")
  private String situacao = null;

  public InclusaoPropostaResponse numero(String numero) {
    this.numero = numero;
    return this;
  }

   /**
   * Número da proposta.
   * @return numero
  **/
  @ApiModelProperty(value = "Número da proposta.")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public InclusaoPropostaResponse situacao(String situacao) {
    this.situacao = situacao;
    return this;
  }

   /**
   * Situação da proposta.
   * @return situacao
  **/
  @ApiModelProperty(value = "Situação da proposta.")
  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InclusaoPropostaResponse inclusaoPropostaResponse = (InclusaoPropostaResponse) o;
    return Objects.equals(this.numero, inclusaoPropostaResponse.numero) &&
        Objects.equals(this.situacao, inclusaoPropostaResponse.situacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero, situacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InclusaoPropostaResponse {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    situacao: ").append(toIndentedString(situacao)).append("\n");
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

