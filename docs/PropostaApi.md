# PropostaApi

All URIs are relative to *https://dev-api.portocred.com.br/gestao-proposta/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**propostasGet**](PropostaApi.md#propostasGet) | **GET** /propostas | 
[**propostasIdClientesDocumentosPost**](PropostaApi.md#propostasIdClientesDocumentosPost) | **POST** /propostas/{id}/clientes/documentos | 
[**propostasIdDocUploadUrlGet**](PropostaApi.md#propostasIdDocUploadUrlGet) | **GET** /propostas/{id}/doc-upload-url | 
[**propostasIdDocumentosGet**](PropostaApi.md#propostasIdDocumentosGet) | **GET** /propostas/{id}/documentos | 
[**propostasIdGet**](PropostaApi.md#propostasIdGet) | **GET** /propostas/{id} | 
[**propostasIdHistoricosGet**](PropostaApi.md#propostasIdHistoricosGet) | **GET** /propostas/{id}/historicos | 
[**propostasIdMensagensPost**](PropostaApi.md#propostasIdMensagensPost) | **POST** /propostas/{id}/mensagens | 
[**propostasIdOfertasGet**](PropostaApi.md#propostasIdOfertasGet) | **GET** /propostas/{id}/ofertas | 
[**propostasIdOfertasPost**](PropostaApi.md#propostasIdOfertasPost) | **POST** /propostas/{id}/ofertas | 
[**propostasIdPendenciasGet**](PropostaApi.md#propostasIdPendenciasGet) | **GET** /propostas/{id}/pendencias | 
[**propostasIdPut**](PropostaApi.md#propostasIdPut) | **PUT** /propostas/{id} | 
[**propostasIdStatusGet**](PropostaApi.md#propostasIdStatusGet) | **GET** /propostas/{id}/status | 
[**propostasPost**](PropostaApi.md#propostasPost) | **POST** /propostas | 


<a name="propostasGet"></a>
# **propostasGet**
> List&lt;PropostaResponse&gt; propostasGet(clientId, accessToken, xAuthorization, cpf)



Recuperação da lista de propostas vinculadas a um CPF.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **cpf** | **String**| Cpf utilizado na proposta. |

### Return type

[**List&lt;PropostaResponse&gt;**](PropostaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdClientesDocumentosPost"></a>
# **propostasIdClientesDocumentosPost**
> propostasIdClientesDocumentosPost(id, clientId, accessToken, documentacao)



Inclusão de documentos a uma proposta. Obs. A obrigatoriedade dos campos não está definida na interface da API. Consulte a documentação técnica para conhecer a cardinalidade real do conjunto de campos.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
CpfDocumentoProposta documentacao = new CpfDocumentoProposta(); // CpfDocumentoProposta | CPF do operador, documento convertido em base64 (limitado a 2MB) e extensão do documento (EX. PDF).
try {
    apiInstance.propostasIdClientesDocumentosPost(id, clientId, accessToken, documentacao);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdClientesDocumentosPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **documentacao** | [**CpfDocumentoProposta**](CpfDocumentoProposta.md)| CPF do operador, documento convertido em base64 (limitado a 2MB) e extensão do documento (EX. PDF). |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdDocUploadUrlGet"></a>
# **propostasIdDocUploadUrlGet**
> InlineResponse200 propostasIdDocUploadUrlGet(id, clientId, accessToken)



Recuperação do link SAFEDOC para inclusão de documentos a uma proposta.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
try {
    InlineResponse200 result = apiInstance.propostasIdDocUploadUrlGet(id, clientId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdDocUploadUrlGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdDocumentosGet"></a>
# **propostasIdDocumentosGet**
> List&lt;DocumentoProposta&gt; propostasIdDocumentosGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, tipoDocumento)



Recuperação de documentos a serem assinados e anexados a uma proposta. O tipo de documento deverá ser passado PLANILHA_CET (Pode ser gerado a partir da seleção de uma oferta). / CHECKLIST (Pode ser gerado a partir da seleção de uma oferta). / TODOS_DOCUMENTOS_PROPOSTA para todos os documentos relacionados a proposta de acordo com o produto e a opção do seguro (Podem ser gerados nos status de proposta “pré efetivada” e também “contrato efetivado”). Como retorno, serão informados os nomes dos arquivos PDF e seus conteúdos no formato byte array. Quando acionada a opção DOCUMENTOS_PDV, serão retornados os conteúdos finais dos arquivos a serem impressos em formato texto. Nessa lista de retorno, poderão ser devolvidos os arquivos ccb.txt e seguro.txt.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
String tipoDocumento = "tipoDocumento_example"; // String | Tipo do documento.
try {
    List<DocumentoProposta> result = apiInstance.propostasIdDocumentosGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, tipoDocumento);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdDocumentosGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |
 **tipoDocumento** | **String**| Tipo do documento. | [enum: PLANILHA_CET, CHECKLIST, TODOS_DOCUMENTOS_PROPOSTA, DOCUMENTOS_PDV]

### Return type

[**List&lt;DocumentoProposta&gt;**](DocumentoProposta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdGet"></a>
# **propostasIdGet**
> Proposta propostasIdGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista)



Recupera os dados da proposta de acordo com o ID proposta. Esta API pode ser utilizada desde a criação até a efetivação da proposta. Obs. A obrigatoriedade dos campos não está definida na interface da API. Consulte a documentação técnica para conhecer a cardinalidade real do conjunto de campos.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
try {
    Proposta result = apiInstance.propostasIdGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |

### Return type

[**Proposta**](Proposta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdHistoricosGet"></a>
# **propostasIdHistoricosGet**
> List&lt;Historico&gt; propostasIdHistoricosGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista)



Recuperação do histórico de atividades realizadas em uma proposta.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
try {
    List<Historico> result = apiInstance.propostasIdHistoricosGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdHistoricosGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |

### Return type

[**List&lt;Historico&gt;**](Historico.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdMensagensPost"></a>
# **propostasIdMensagensPost**
> propostasIdMensagensPost(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, mensagem)



Envio de mensagens para a mesa sobre a proposta em análise.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
String mensagem = "mensagem_example"; // String | Mensagem.
try {
    apiInstance.propostasIdMensagensPost(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, mensagem);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdMensagensPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |
 **mensagem** | **String**| Mensagem. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdOfertasGet"></a>
# **propostasIdOfertasGet**
> List&lt;Oferta&gt; propostasIdOfertasGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista)



Consulta de ofertas disponíveis para associar a uma proposta. Obs. A obrigatoriedade dos campos não está definida na interface da API. Consulte a documentação técnica para conhecer a cardinalidade real do conjunto de campos.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
try {
    List<Oferta> result = apiInstance.propostasIdOfertasGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdOfertasGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |

### Return type

[**List&lt;Oferta&gt;**](Oferta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdOfertasPost"></a>
# **propostasIdOfertasPost**
> propostasIdOfertasPost(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, idOferta)



Associa uma oferta a uma proposta.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
String idOferta = "idOferta_example"; // String | Identificador da oferta.
try {
    apiInstance.propostasIdOfertasPost(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, idOferta);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdOfertasPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |
 **idOferta** | **String**| Identificador da oferta. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdPendenciasGet"></a>
# **propostasIdPendenciasGet**
> List&lt;Pendencia&gt; propostasIdPendenciasGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista)



Recuperação da lista de pendências de uma proposta.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
try {
    List<Pendencia> result = apiInstance.propostasIdPendenciasGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdPendenciasGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |

### Return type

[**List&lt;Pendencia&gt;**](Pendencia.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdPut"></a>
# **propostasIdPut**
> propostasIdPut(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, alteracaoPropostaRequest)



Altera uma proposta conforme alterações feitas pelo usuário. Esta API pode ser utilizada a partir da criação até a conclusão da análise de crédito. Para cancelar a proposta use a opção &#39;CANCELAMENTO&#39; no atributo acaoAlteracao.tipoAlteracaoProposta; para efetivar a proposta para pagamento use a opção &#39;EFETIVACAO&#39; no atributo acaoAlteracao.tipoAlteracaoProposta e preencha o atributo uploadConfirmado; para pré-efetivar a proposta use a opção &#39;PRE_EFETIVACAO&#39; no atributo acaoAlteracao.tipoAlteracaoProposta; para alterar a proposta use a opção &#39;ATUALIZACAO&#39; no atributo acaoAlteracao.tipoAlteracaoProposta.  Obs. A obrigatoriedade dos campos e a relação de domínios a serem respeitadas pelos parceiros não estão definidas na interfaces das APIs. Consulte a documentação técnica para conhecer a cardinalidade real do conjunto de campos e domínios.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
AlteracaoPropostaRequest alteracaoPropostaRequest = new AlteracaoPropostaRequest(); // AlteracaoPropostaRequest | Proposta a ser alterada.
try {
    apiInstance.propostasIdPut(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, alteracaoPropostaRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |
 **alteracaoPropostaRequest** | [**AlteracaoPropostaRequest**](AlteracaoPropostaRequest.md)| Proposta a ser alterada. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasIdStatusGet"></a>
# **propostasIdStatusGet**
> StatusPropostaResponse propostasIdStatusGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista)



Consulta status da proposta. A partir da criação da proposta, a qualquer momento pode ser utilizada a API para consulta de status. Obs. A obrigatoriedade dos campos não está definida na interface da API. Consulte a documentação técnica para conhecer a cardinalidade real do conjunto de campos.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String id = "id_example"; // String | Identificador da proposta.
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
try {
    StatusPropostaResponse result = apiInstance.propostasIdStatusGet(id, clientId, accessToken, xAuthorization, codigoLoja, codigoLojista);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasIdStatusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identificador da proposta. |
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |

### Return type

[**StatusPropostaResponse**](StatusPropostaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="propostasPost"></a>
# **propostasPost**
> InclusaoPropostaResponse propostasPost(clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, proposta)



Esta API tem o objetivo de incluir uma proposta de crédito. Caso o cliente já possua uma proposta em andamento, ou qualquer outra inconsistência na inclusão, o sistema irá retornar um código de erro informando o motivo.  Obs. A obrigatoriedade dos campos e a relação de domínios a serem respeitadas pelos parceiros não estão definidas na interfaces das APIs. Consulte a documentação técnica para conhecer a cardinalidade real do conjunto de campos e domínios.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PropostaApi;


PropostaApi apiInstance = new PropostaApi();
String clientId = "clientId_example"; // String | Client ID disponibilizado na criação da App.
String accessToken = "accessToken_example"; // String | Access Token com permissões de acesso.
byte[] xAuthorization = B; // byte[] | base64 do codigoParceiro:codigoUsuario:senha.
String codigoLoja = "codigoLoja_example"; // String | Código da loja (Filial). (fixo informada pela financeira).
String codigoLojista = "codigoLojista_example"; // String | Código do lojista (Rede de loja). (fixo informada pela financeira).
Proposta proposta = new Proposta(); // Proposta | Proposta a ser criada.
try {
    InclusaoPropostaResponse result = apiInstance.propostasPost(clientId, accessToken, xAuthorization, codigoLoja, codigoLojista, proposta);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PropostaApi#propostasPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client ID disponibilizado na criação da App. |
 **accessToken** | **String**| Access Token com permissões de acesso. |
 **xAuthorization** | **byte[]**| base64 do codigoParceiro:codigoUsuario:senha. |
 **codigoLoja** | **String**| Código da loja (Filial). (fixo informada pela financeira). |
 **codigoLojista** | **String**| Código do lojista (Rede de loja). (fixo informada pela financeira). |
 **proposta** | [**Proposta**](Proposta.md)| Proposta a ser criada. |

### Return type

[**InclusaoPropostaResponse**](InclusaoPropostaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

