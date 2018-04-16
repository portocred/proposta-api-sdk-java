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
import io.swagger.client.model.CartaoCredito;
import io.swagger.client.model.Conjuge;
import io.swagger.client.model.ContaBancaria;
import io.swagger.client.model.Documento;
import io.swagger.client.model.Emprego;
import io.swagger.client.model.Endereco;
import io.swagger.client.model.EstadoCivil;
import io.swagger.client.model.IndicativoSimNao;
import io.swagger.client.model.Nacionalidade;
import io.swagger.client.model.ReferenciaPessoal;
import io.swagger.client.model.RendaAdicional;
import io.swagger.client.model.Sexo;
import io.swagger.client.model.Telefone;
import io.swagger.client.model.TipoCliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * Entidade representando um cliente da proposta.
 */
@ApiModel(description = "Entidade representando um cliente da proposta.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-10T12:41:57.739Z")
public class Cliente {
  @SerializedName("nome")
  private String nome = null;

  @SerializedName("cpf")
  private String cpf = null;

  @SerializedName("dataNascimento")
  private LocalDate dataNascimento = null;

  @SerializedName("numeroDependentes")
  private String numeroDependentes = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("codigoEscolaridade")
  private String codigoEscolaridade = null;

  @SerializedName("nomeMae")
  private String nomeMae = null;

  @SerializedName("nomePai")
  private String nomePai = null;

  @SerializedName("cidade")
  private String cidade = null;

  @SerializedName("uf")
  private String uf = null;

  @SerializedName("tipo")
  private TipoCliente tipo = null;

  @SerializedName("documentos")
  private List<Documento> documentos = null;

  @SerializedName("estadoCivil")
  private EstadoCivil estadoCivil = null;

  @SerializedName("nacionalidade")
  private Nacionalidade nacionalidade = null;

  @SerializedName("sexo")
  private Sexo sexo = null;

  @SerializedName("telefones")
  private List<Telefone> telefones = null;

  @SerializedName("conjuge")
  private Conjuge conjuge = null;

  @SerializedName("emprego")
  private Emprego emprego = null;

  @SerializedName("enderecos")
  private List<Endereco> enderecos = null;

  @SerializedName("rendasAdicionais")
  private List<RendaAdicional> rendasAdicionais = null;

  @SerializedName("negativado")
  private IndicativoSimNao negativado = null;

  @SerializedName("possuiCheque")
  private IndicativoSimNao possuiCheque = null;

  @SerializedName("contasBancarias")
  private List<ContaBancaria> contasBancarias = null;

  @SerializedName("cartoesCredito")
  private List<CartaoCredito> cartoesCredito = null;

  @SerializedName("referenciasPessoais")
  private List<ReferenciaPessoal> referenciasPessoais = null;

  public Cliente nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Nome do Cliente.
   * @return nome
  **/
  @ApiModelProperty(value = "Nome do Cliente.")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Cliente cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * Cpf do Cliente - Formatar com zeros a esquerda.
   * @return cpf
  **/
  @ApiModelProperty(value = "Cpf do Cliente - Formatar com zeros a esquerda.")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Cliente dataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

   /**
   * Data de nascimento do cliente. (aaaa-mm-dd).
   * @return dataNascimento
  **/
  @ApiModelProperty(value = "Data de nascimento do cliente. (aaaa-mm-dd).")
  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public Cliente numeroDependentes(String numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
    return this;
  }

   /**
   * Número de dependentes do cliente.
   * @return numeroDependentes
  **/
  @ApiModelProperty(value = "Número de dependentes do cliente.")
  public String getNumeroDependentes() {
    return numeroDependentes;
  }

  public void setNumeroDependentes(String numeroDependentes) {
    this.numeroDependentes = numeroDependentes;
  }

  public Cliente email(String email) {
    this.email = email;
    return this;
  }

   /**
   * E-mail do cliente.
   * @return email
  **/
  @ApiModelProperty(value = "E-mail do cliente.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Cliente codigoEscolaridade(String codigoEscolaridade) {
    this.codigoEscolaridade = codigoEscolaridade;
    return this;
  }

   /**
   * Código de escolaridade do cliente.
   * @return codigoEscolaridade
  **/
  @ApiModelProperty(value = "Código de escolaridade do cliente.")
  public String getCodigoEscolaridade() {
    return codigoEscolaridade;
  }

  public void setCodigoEscolaridade(String codigoEscolaridade) {
    this.codigoEscolaridade = codigoEscolaridade;
  }

  public Cliente nomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
    return this;
  }

   /**
   * Nome da mãe do cliente.
   * @return nomeMae
  **/
  @ApiModelProperty(value = "Nome da mãe do cliente.")
  public String getNomeMae() {
    return nomeMae;
  }

  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  public Cliente nomePai(String nomePai) {
    this.nomePai = nomePai;
    return this;
  }

   /**
   * Nome do pai do cliente.
   * @return nomePai
  **/
  @ApiModelProperty(value = "Nome do pai do cliente.")
  public String getNomePai() {
    return nomePai;
  }

  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  public Cliente cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

   /**
   * Cidade do cliente.
   * @return cidade
  **/
  @ApiModelProperty(value = "Cidade do cliente.")
  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public Cliente uf(String uf) {
    this.uf = uf;
    return this;
  }

   /**
   * Unidade federativa do endereço.
   * @return uf
  **/
  @ApiModelProperty(value = "Unidade federativa do endereço.")
  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public Cliente tipo(TipoCliente tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(value = "")
  public TipoCliente getTipo() {
    return tipo;
  }

  public void setTipo(TipoCliente tipo) {
    this.tipo = tipo;
  }

  public Cliente documentos(List<Documento> documentos) {
    this.documentos = documentos;
    return this;
  }

  public Cliente addDocumentosItem(Documento documentosItem) {
    if (this.documentos == null) {
      this.documentos = new ArrayList<Documento>();
    }
    this.documentos.add(documentosItem);
    return this;
  }

   /**
   * Get documentos
   * @return documentos
  **/
  @ApiModelProperty(value = "")
  public List<Documento> getDocumentos() {
    return documentos;
  }

  public void setDocumentos(List<Documento> documentos) {
    this.documentos = documentos;
  }

  public Cliente estadoCivil(EstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }

   /**
   * Get estadoCivil
   * @return estadoCivil
  **/
  @ApiModelProperty(value = "")
  public EstadoCivil getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(EstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public Cliente nacionalidade(Nacionalidade nacionalidade) {
    this.nacionalidade = nacionalidade;
    return this;
  }

   /**
   * Get nacionalidade
   * @return nacionalidade
  **/
  @ApiModelProperty(value = "")
  public Nacionalidade getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(Nacionalidade nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public Cliente sexo(Sexo sexo) {
    this.sexo = sexo;
    return this;
  }

   /**
   * Get sexo
   * @return sexo
  **/
  @ApiModelProperty(value = "")
  public Sexo getSexo() {
    return sexo;
  }

  public void setSexo(Sexo sexo) {
    this.sexo = sexo;
  }

  public Cliente telefones(List<Telefone> telefones) {
    this.telefones = telefones;
    return this;
  }

  public Cliente addTelefonesItem(Telefone telefonesItem) {
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

  public Cliente conjuge(Conjuge conjuge) {
    this.conjuge = conjuge;
    return this;
  }

   /**
   * Get conjuge
   * @return conjuge
  **/
  @ApiModelProperty(value = "")
  public Conjuge getConjuge() {
    return conjuge;
  }

  public void setConjuge(Conjuge conjuge) {
    this.conjuge = conjuge;
  }

  public Cliente emprego(Emprego emprego) {
    this.emprego = emprego;
    return this;
  }

   /**
   * Get emprego
   * @return emprego
  **/
  @ApiModelProperty(value = "")
  public Emprego getEmprego() {
    return emprego;
  }

  public void setEmprego(Emprego emprego) {
    this.emprego = emprego;
  }

  public Cliente enderecos(List<Endereco> enderecos) {
    this.enderecos = enderecos;
    return this;
  }

  public Cliente addEnderecosItem(Endereco enderecosItem) {
    if (this.enderecos == null) {
      this.enderecos = new ArrayList<Endereco>();
    }
    this.enderecos.add(enderecosItem);
    return this;
  }

   /**
   * Get enderecos
   * @return enderecos
  **/
  @ApiModelProperty(value = "")
  public List<Endereco> getEnderecos() {
    return enderecos;
  }

  public void setEnderecos(List<Endereco> enderecos) {
    this.enderecos = enderecos;
  }

  public Cliente rendasAdicionais(List<RendaAdicional> rendasAdicionais) {
    this.rendasAdicionais = rendasAdicionais;
    return this;
  }

  public Cliente addRendasAdicionaisItem(RendaAdicional rendasAdicionaisItem) {
    if (this.rendasAdicionais == null) {
      this.rendasAdicionais = new ArrayList<RendaAdicional>();
    }
    this.rendasAdicionais.add(rendasAdicionaisItem);
    return this;
  }

   /**
   * Get rendasAdicionais
   * @return rendasAdicionais
  **/
  @ApiModelProperty(value = "")
  public List<RendaAdicional> getRendasAdicionais() {
    return rendasAdicionais;
  }

  public void setRendasAdicionais(List<RendaAdicional> rendasAdicionais) {
    this.rendasAdicionais = rendasAdicionais;
  }

  public Cliente negativado(IndicativoSimNao negativado) {
    this.negativado = negativado;
    return this;
  }

   /**
   * Get negativado
   * @return negativado
  **/
  @ApiModelProperty(value = "")
  public IndicativoSimNao getNegativado() {
    return negativado;
  }

  public void setNegativado(IndicativoSimNao negativado) {
    this.negativado = negativado;
  }

  public Cliente possuiCheque(IndicativoSimNao possuiCheque) {
    this.possuiCheque = possuiCheque;
    return this;
  }

   /**
   * Get possuiCheque
   * @return possuiCheque
  **/
  @ApiModelProperty(value = "")
  public IndicativoSimNao getPossuiCheque() {
    return possuiCheque;
  }

  public void setPossuiCheque(IndicativoSimNao possuiCheque) {
    this.possuiCheque = possuiCheque;
  }

  public Cliente contasBancarias(List<ContaBancaria> contasBancarias) {
    this.contasBancarias = contasBancarias;
    return this;
  }

  public Cliente addContasBancariasItem(ContaBancaria contasBancariasItem) {
    if (this.contasBancarias == null) {
      this.contasBancarias = new ArrayList<ContaBancaria>();
    }
    this.contasBancarias.add(contasBancariasItem);
    return this;
  }

   /**
   * Get contasBancarias
   * @return contasBancarias
  **/
  @ApiModelProperty(value = "")
  public List<ContaBancaria> getContasBancarias() {
    return contasBancarias;
  }

  public void setContasBancarias(List<ContaBancaria> contasBancarias) {
    this.contasBancarias = contasBancarias;
  }

  public Cliente cartoesCredito(List<CartaoCredito> cartoesCredito) {
    this.cartoesCredito = cartoesCredito;
    return this;
  }

  public Cliente addCartoesCreditoItem(CartaoCredito cartoesCreditoItem) {
    if (this.cartoesCredito == null) {
      this.cartoesCredito = new ArrayList<CartaoCredito>();
    }
    this.cartoesCredito.add(cartoesCreditoItem);
    return this;
  }

   /**
   * Get cartoesCredito
   * @return cartoesCredito
  **/
  @ApiModelProperty(value = "")
  public List<CartaoCredito> getCartoesCredito() {
    return cartoesCredito;
  }

  public void setCartoesCredito(List<CartaoCredito> cartoesCredito) {
    this.cartoesCredito = cartoesCredito;
  }

  public Cliente referenciasPessoais(List<ReferenciaPessoal> referenciasPessoais) {
    this.referenciasPessoais = referenciasPessoais;
    return this;
  }

  public Cliente addReferenciasPessoaisItem(ReferenciaPessoal referenciasPessoaisItem) {
    if (this.referenciasPessoais == null) {
      this.referenciasPessoais = new ArrayList<ReferenciaPessoal>();
    }
    this.referenciasPessoais.add(referenciasPessoaisItem);
    return this;
  }

   /**
   * Get referenciasPessoais
   * @return referenciasPessoais
  **/
  @ApiModelProperty(value = "")
  public List<ReferenciaPessoal> getReferenciasPessoais() {
    return referenciasPessoais;
  }

  public void setReferenciasPessoais(List<ReferenciaPessoal> referenciasPessoais) {
    this.referenciasPessoais = referenciasPessoais;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(this.nome, cliente.nome) &&
        Objects.equals(this.cpf, cliente.cpf) &&
        Objects.equals(this.dataNascimento, cliente.dataNascimento) &&
        Objects.equals(this.numeroDependentes, cliente.numeroDependentes) &&
        Objects.equals(this.email, cliente.email) &&
        Objects.equals(this.codigoEscolaridade, cliente.codigoEscolaridade) &&
        Objects.equals(this.nomeMae, cliente.nomeMae) &&
        Objects.equals(this.nomePai, cliente.nomePai) &&
        Objects.equals(this.cidade, cliente.cidade) &&
        Objects.equals(this.uf, cliente.uf) &&
        Objects.equals(this.tipo, cliente.tipo) &&
        Objects.equals(this.documentos, cliente.documentos) &&
        Objects.equals(this.estadoCivil, cliente.estadoCivil) &&
        Objects.equals(this.nacionalidade, cliente.nacionalidade) &&
        Objects.equals(this.sexo, cliente.sexo) &&
        Objects.equals(this.telefones, cliente.telefones) &&
        Objects.equals(this.conjuge, cliente.conjuge) &&
        Objects.equals(this.emprego, cliente.emprego) &&
        Objects.equals(this.enderecos, cliente.enderecos) &&
        Objects.equals(this.rendasAdicionais, cliente.rendasAdicionais) &&
        Objects.equals(this.negativado, cliente.negativado) &&
        Objects.equals(this.possuiCheque, cliente.possuiCheque) &&
        Objects.equals(this.contasBancarias, cliente.contasBancarias) &&
        Objects.equals(this.cartoesCredito, cliente.cartoesCredito) &&
        Objects.equals(this.referenciasPessoais, cliente.referenciasPessoais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cpf, dataNascimento, numeroDependentes, email, codigoEscolaridade, nomeMae, nomePai, cidade, uf, tipo, documentos, estadoCivil, nacionalidade, sexo, telefones, conjuge, emprego, enderecos, rendasAdicionais, negativado, possuiCheque, contasBancarias, cartoesCredito, referenciasPessoais);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    numeroDependentes: ").append(toIndentedString(numeroDependentes)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    codigoEscolaridade: ").append(toIndentedString(codigoEscolaridade)).append("\n");
    sb.append("    nomeMae: ").append(toIndentedString(nomeMae)).append("\n");
    sb.append("    nomePai: ").append(toIndentedString(nomePai)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    documentos: ").append(toIndentedString(documentos)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    nacionalidade: ").append(toIndentedString(nacionalidade)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    telefones: ").append(toIndentedString(telefones)).append("\n");
    sb.append("    conjuge: ").append(toIndentedString(conjuge)).append("\n");
    sb.append("    emprego: ").append(toIndentedString(emprego)).append("\n");
    sb.append("    enderecos: ").append(toIndentedString(enderecos)).append("\n");
    sb.append("    rendasAdicionais: ").append(toIndentedString(rendasAdicionais)).append("\n");
    sb.append("    negativado: ").append(toIndentedString(negativado)).append("\n");
    sb.append("    possuiCheque: ").append(toIndentedString(possuiCheque)).append("\n");
    sb.append("    contasBancarias: ").append(toIndentedString(contasBancarias)).append("\n");
    sb.append("    cartoesCredito: ").append(toIndentedString(cartoesCredito)).append("\n");
    sb.append("    referenciasPessoais: ").append(toIndentedString(referenciasPessoais)).append("\n");
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

