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
 * Entidade representando um documento da proposta.
 */
@ApiModel(description = "Entidade representando um documento da proposta.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-10T12:41:57.739Z")
public class DocumentoProposta {
  @SerializedName("fileContent")
  private byte[] fileContent = null;

  @SerializedName("nomeArquivo")
  private String nomeArquivo = null;

  public DocumentoProposta fileContent(byte[] fileContent) {
    this.fileContent = fileContent;
    return this;
  }

   /**
   * Conteúdo do aruqivo em binário.
   * @return fileContent
  **/
  @ApiModelProperty(value = "Conteúdo do aruqivo em binário.")
  public byte[] getFileContent() {
    return fileContent;
  }

  public void setFileContent(byte[] fileContent) {
    this.fileContent = fileContent;
  }

  public DocumentoProposta nomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
    return this;
  }

   /**
   * Nome do arquivo.
   * @return nomeArquivo
  **/
  @ApiModelProperty(value = "Nome do arquivo.")
  public String getNomeArquivo() {
    return nomeArquivo;
  }

  public void setNomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoProposta documentoProposta = (DocumentoProposta) o;
    return Objects.equals(this.fileContent, documentoProposta.fileContent) &&
        Objects.equals(this.nomeArquivo, documentoProposta.nomeArquivo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileContent, nomeArquivo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoProposta {\n");
    
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
    sb.append("    nomeArquivo: ").append(toIndentedString(nomeArquivo)).append("\n");
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

