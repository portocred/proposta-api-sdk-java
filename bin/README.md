# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.PropostaApi;

import java.io.File;
import java.util.*;

public class PropostaApiExample {

    public static void main(String[] args) {
        
        PropostaApi apiInstance = new PropostaApi();
        String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
        String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
        byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
        String cpf = "cpf_example"; // String | Cpf utilizado na proposta.
        try {
            List<PropostaResponse> result = apiInstance.propostasGet(clientId, accessToken, xAuthorization, cpf);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PropostaApi#propostasGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://dev-api.portocred.com.br/gestao-proposta/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PropostaApi* | [**propostasGet**](docs/PropostaApi.md#propostasGet) | **GET** /propostas | 
*PropostaApi* | [**propostasIdClientesDocumentosPost**](docs/PropostaApi.md#propostasIdClientesDocumentosPost) | **POST** /propostas/{id}/clientes/documentos | 
*PropostaApi* | [**propostasIdDocUploadUrlGet**](docs/PropostaApi.md#propostasIdDocUploadUrlGet) | **GET** /propostas/{id}/doc-upload-url | 
*PropostaApi* | [**propostasIdDocumentosGet**](docs/PropostaApi.md#propostasIdDocumentosGet) | **GET** /propostas/{id}/documentos | 
*PropostaApi* | [**propostasIdGet**](docs/PropostaApi.md#propostasIdGet) | **GET** /propostas/{id} | 
*PropostaApi* | [**propostasIdHistoricosGet**](docs/PropostaApi.md#propostasIdHistoricosGet) | **GET** /propostas/{id}/historicos | 
*PropostaApi* | [**propostasIdMensagensPost**](docs/PropostaApi.md#propostasIdMensagensPost) | **POST** /propostas/{id}/mensagens | 
*PropostaApi* | [**propostasIdOfertasGet**](docs/PropostaApi.md#propostasIdOfertasGet) | **GET** /propostas/{id}/ofertas | 
*PropostaApi* | [**propostasIdOfertasPost**](docs/PropostaApi.md#propostasIdOfertasPost) | **POST** /propostas/{id}/ofertas | 
*PropostaApi* | [**propostasIdPendenciasGet**](docs/PropostaApi.md#propostasIdPendenciasGet) | **GET** /propostas/{id}/pendencias | 
*PropostaApi* | [**propostasIdPut**](docs/PropostaApi.md#propostasIdPut) | **PUT** /propostas/{id} | 
*PropostaApi* | [**propostasIdStatusGet**](docs/PropostaApi.md#propostasIdStatusGet) | **GET** /propostas/{id}/status | 
*PropostaApi* | [**propostasPost**](docs/PropostaApi.md#propostasPost) | **POST** /propostas | 


## Documentation for Models

 - [AcaoAlteracaoProposta](docs/AcaoAlteracaoProposta.md)
 - [AlteracaoPropostaRequest](docs/AlteracaoPropostaRequest.md)
 - [Candidato](docs/Candidato.md)
 - [CartaoCredito](docs/CartaoCredito.md)
 - [Cheque](docs/Cheque.md)
 - [Cliente](docs/Cliente.md)
 - [Conjuge](docs/Conjuge.md)
 - [ContaBancaria](docs/ContaBancaria.md)
 - [CpfDocumentoProposta](docs/CpfDocumentoProposta.md)
 - [DadoAdicional](docs/DadoAdicional.md)
 - [DadosLiberacao](docs/DadosLiberacao.md)
 - [Documento](docs/Documento.md)
 - [DocumentoProposta](docs/DocumentoProposta.md)
 - [Emprego](docs/Emprego.md)
 - [Endereco](docs/Endereco.md)
 - [EstadoCivil](docs/EstadoCivil.md)
 - [FormaEnvio](docs/FormaEnvio.md)
 - [Historico](docs/Historico.md)
 - [InclusaoPrePropostaResponse](docs/InclusaoPrePropostaResponse.md)
 - [InclusaoPropostaResponse](docs/InclusaoPropostaResponse.md)
 - [IndicativoSimNao](docs/IndicativoSimNao.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [Nacionalidade](docs/Nacionalidade.md)
 - [Oferta](docs/Oferta.md)
 - [Pendencia](docs/Pendencia.md)
 - [PreEfetivacaoPropostaRequest](docs/PreEfetivacaoPropostaRequest.md)
 - [PreProposta](docs/PreProposta.md)
 - [Proposta](docs/Proposta.md)
 - [PropostaResponse](docs/PropostaResponse.md)
 - [ReferenciaPessoal](docs/ReferenciaPessoal.md)
 - [RendaAdicional](docs/RendaAdicional.md)
 - [Sexo](docs/Sexo.md)
 - [StatusPropostaResponse](docs/StatusPropostaResponse.md)
 - [Telefone](docs/Telefone.md)
 - [TipoCliente](docs/TipoCliente.md)
 - [TipoConta](docs/TipoConta.md)
 - [TipoContaBancaria](docs/TipoContaBancaria.md)
 - [TipoContrato](docs/TipoContrato.md)
 - [TipoCorrespondencia](docs/TipoCorrespondencia.md)
 - [TipoEfetivacao](docs/TipoEfetivacao.md)
 - [TipoResidencia](docs/TipoResidencia.md)
 - [TipoSeguro](docs/TipoSeguro.md)
 - [TipoSimulacao](docs/TipoSimulacao.md)
 - [TipoTelefone](docs/TipoTelefone.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



