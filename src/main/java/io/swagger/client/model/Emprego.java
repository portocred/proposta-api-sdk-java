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
import io.swagger.client.model.Endereco;
import io.swagger.client.model.Telefone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * Entidade representando um emprego.
 */
@ApiModel(description = "Entidade representando um emprego.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-10T12:41:57.739Z")
public class Emprego {
  @SerializedName("nomeEmpresa")
  private String nomeEmpresa = null;

  @SerializedName("codigoClasseProfissional")
  private String codigoClasseProfissional = null;

  @SerializedName("codigoAtividade")
  private String codigoAtividade = null;

  @SerializedName("dataAdmissao")
  private LocalDate dataAdmissao = null;

  @SerializedName("codigoConveniada")
  private String codigoConveniada = null;

  @SerializedName("orgaoConveniada")
  private String orgaoConveniada = null;

  @SerializedName("numeroBeneficio")
  private String numeroBeneficio = null;

  @SerializedName("especieBeneficio")
  private String especieBeneficio = null;

  @SerializedName("matriculaFucional")
  private String matriculaFucional = null;

  @SerializedName("renda")
  private Double renda = null;

  @SerializedName("cnpj")
  private String cnpj = null;

  @SerializedName("telefones")
  private List<Telefone> telefones = null;

  @SerializedName("endereco")
  private Endereco endereco = null;

  public Emprego nomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
    return this;
  }

   /**
   * Nome da empresa.
   * @return nomeEmpresa
  **/
  @ApiModelProperty(value = "Nome da empresa.")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }

  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  public Emprego codigoClasseProfissional(String codigoClasseProfissional) {
    this.codigoClasseProfissional = codigoClasseProfissional;
    return this;
  }

   /**
   * Código da classe profissional.
   * @return codigoClasseProfissional
  **/
  @ApiModelProperty(value = "Código da classe profissional.")
  public String getCodigoClasseProfissional() {
    return codigoClasseProfissional;
  }

  public void setCodigoClasseProfissional(String codigoClasseProfissional) {
    this.codigoClasseProfissional = codigoClasseProfissional;
  }

  public Emprego codigoAtividade(String codigoAtividade) {
    this.codigoAtividade = codigoAtividade;
    return this;
  }

   /**
   * Código da atividade exercida.
   * @return codigoAtividade
  **/
  @ApiModelProperty(value = "Código da atividade exercida.")
  public String getCodigoAtividade() {
    return codigoAtividade;
  }

  public void setCodigoAtividade(String codigoAtividade) {
    this.codigoAtividade = codigoAtividade;
  }

  public Emprego dataAdmissao(LocalDate dataAdmissao) {
    this.dataAdmissao = dataAdmissao;
    return this;
  }

   /**
   * Data da admissão. (aaaa-mm-dd).
   * @return dataAdmissao
  **/
  @ApiModelProperty(value = "Data da admissão. (aaaa-mm-dd).")
  public LocalDate getDataAdmissao() {
    return dataAdmissao;
  }

  public void setDataAdmissao(LocalDate dataAdmissao) {
    this.dataAdmissao = dataAdmissao;
  }

  public Emprego codigoConveniada(String codigoConveniada) {
    this.codigoConveniada = codigoConveniada;
    return this;
  }

   /**
   * Código da empresa conveniada. (para Consignado e Débito em Conta).
   * @return codigoConveniada
  **/
  @ApiModelProperty(value = "Código da empresa conveniada. (para Consignado e Débito em Conta).")
  public String getCodigoConveniada() {
    return codigoConveniada;
  }

  public void setCodigoConveniada(String codigoConveniada) {
    this.codigoConveniada = codigoConveniada;
  }

  public Emprego orgaoConveniada(String orgaoConveniada) {
    this.orgaoConveniada = orgaoConveniada;
    return this;
  }

   /**
   * Órgão da empresa conveniada. (para Consignado e Débito em Conta).
   * @return orgaoConveniada
  **/
  @ApiModelProperty(value = "Órgão da empresa conveniada. (para Consignado e Débito em Conta).")
  public String getOrgaoConveniada() {
    return orgaoConveniada;
  }

  public void setOrgaoConveniada(String orgaoConveniada) {
    this.orgaoConveniada = orgaoConveniada;
  }

  public Emprego numeroBeneficio(String numeroBeneficio) {
    this.numeroBeneficio = numeroBeneficio;
    return this;
  }

   /**
   * Número do benefício.
   * @return numeroBeneficio
  **/
  @ApiModelProperty(value = "Número do benefício.")
  public String getNumeroBeneficio() {
    return numeroBeneficio;
  }

  public void setNumeroBeneficio(String numeroBeneficio) {
    this.numeroBeneficio = numeroBeneficio;
  }

  public Emprego especieBeneficio(String especieBeneficio) {
    this.especieBeneficio = especieBeneficio;
    return this;
  }

   /**
   * Espécie do benefício.
   * @return especieBeneficio
  **/
  @ApiModelProperty(value = "Espécie do benefício.")
  public String getEspecieBeneficio() {
    return especieBeneficio;
  }

  public void setEspecieBeneficio(String especieBeneficio) {
    this.especieBeneficio = especieBeneficio;
  }

  public Emprego matriculaFucional(String matriculaFucional) {
    this.matriculaFucional = matriculaFucional;
    return this;
  }

   /**
   * Matrícula funcional.
   * @return matriculaFucional
  **/
  @ApiModelProperty(value = "Matrícula funcional.")
  public String getMatriculaFucional() {
    return matriculaFucional;
  }

  public void setMatriculaFucional(String matriculaFucional) {
    this.matriculaFucional = matriculaFucional;
  }

  public Emprego renda(Double renda) {
    this.renda = renda;
    return this;
  }

   /**
   * Valor da renda.
   * @return renda
  **/
  @ApiModelProperty(value = "Valor da renda.")
  public Double getRenda() {
    return renda;
  }

  public void setRenda(Double renda) {
    this.renda = renda;
  }

  public Emprego cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

   /**
   * CNPJ da empresa.
   * @return cnpj
  **/
  @ApiModelProperty(value = "CNPJ da empresa.")
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Emprego telefones(List<Telefone> telefones) {
    this.telefones = telefones;
    return this;
  }

  public Emprego addTelefonesItem(Telefone telefonesItem) {
    if (this.telefones == null) {
      this.telefones = new ArrayList<Telefone>();
    }
    this.telefones.add(telefonesItem);
    return this;
  }

   /**
   * Get telefones
   * @return telefones
  **/
  @ApiModelProperty(value = "")
  public List<Telefone> getTelefones() {
    return telefones;
  }

  public void setTelefones(List<Telefone> telefones) {
    this.telefones = telefones;
  }

  public Emprego endereco(Endereco endereco) {
    this.endereco = endereco;
    return this;
  }

   /**
   * Get endereco
   * @return endereco
  **/
  @ApiModelProperty(value = "")
  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emprego emprego = (Emprego) o;
    return Objects.equals(this.nomeEmpresa, emprego.nomeEmpresa) &&
        Objects.equals(this.codigoClasseProfissional, emprego.codigoClasseProfissional) &&
        Objects.equals(this.codigoAtividade, emprego.codigoAtividade) &&
        Objects.equals(this.dataAdmissao, emprego.dataAdmissao) &&
        Objects.equals(this.codigoConveniada, emprego.codigoConveniada) &&
        Objects.equals(this.orgaoConveniada, emprego.orgaoConveniada) &&
        Objects.equals(this.numeroBeneficio, emprego.numeroBeneficio) &&
        Objects.equals(this.especieBeneficio, emprego.especieBeneficio) &&
        Objects.equals(this.matriculaFucional, emprego.matriculaFucional) &&
        Objects.equals(this.renda, emprego.renda) &&
        Objects.equals(this.cnpj, emprego.cnpj) &&
        Objects.equals(this.telefones, emprego.telefones) &&
        Objects.equals(this.endereco, emprego.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeEmpresa, codigoClasseProfissional, codigoAtividade, dataAdmissao, codigoConveniada, orgaoConveniada, numeroBeneficio, especieBeneficio, matriculaFucional, renda, cnpj, telefones, endereco);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emprego {\n");
    
    sb.append("    nomeEmpresa: ").append(toIndentedString(nomeEmpresa)).append("\n");
    sb.append("    codigoClasseProfissional: ").append(toIndentedString(codigoClasseProfissional)).append("\n");
    sb.append("    codigoAtividade: ").append(toIndentedString(codigoAtividade)).append("\n");
    sb.append("    dataAdmissao: ").append(toIndentedString(dataAdmissao)).append("\n");
    sb.append("    codigoConveniada: ").append(toIndentedString(codigoConveniada)).append("\n");
    sb.append("    orgaoConveniada: ").append(toIndentedString(orgaoConveniada)).append("\n");
    sb.append("    numeroBeneficio: ").append(toIndentedString(numeroBeneficio)).append("\n");
    sb.append("    especieBeneficio: ").append(toIndentedString(especieBeneficio)).append("\n");
    sb.append("    matriculaFucional: ").append(toIndentedString(matriculaFucional)).append("\n");
    sb.append("    renda: ").append(toIndentedString(renda)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
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

