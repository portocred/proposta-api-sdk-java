
# Proposta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numero** | **String** | Número da proposta. |  [optional]
**dataEmissao** | [**LocalDate**](LocalDate.md) | Data de emissão da Proposta. Não pode ser inferior a data que vai ser liberado o dinheiro. Data base do cálculo do financiamento (dd-mm-aaaa). |  [optional]
**dataVencimentoPrimeiraParcela** | [**LocalDate**](LocalDate.md) | Data de vencimento da 1ª parcela. Verificar se está coerente com a  Carência mínima e máxima combinada com a financeira (dd-mm-aaaa). |  [optional]
**codigoProduto** | **String** | Código do produto. Pelo Produto se descobre também a família de produto. |  [optional]
**codigoPlanoPagamento** | **String** | Código do plano de pagamentos. |  [optional]
**prazoPagamento** | **String** | Prazo de pagamento. |  [optional]
**codigoMidia** | **String** | Informar a origem da proposta. |  [optional]
**tipoContrato** | [**TipoContrato**](TipoContrato.md) |  |  [optional]
**valorCompra** | **Double** | Valor da compra sem entrada (neste caso valor da prestação &#x3D; zero). |  [optional]
**valorEntrada** | **Double** | Valor da entrada (neste caso valor da prestação &#x3D; zero/ Valor da Compra &lt;&gt; zero). |  [optional]
**valorPrestacao** | **Double** | Valor da PMT a (neste caso valor da compra &#x3D; zero/ valor da entrada &#x3D; 0). |  [optional]
**valorLiberado** | **Double** | Valor liberado da proposta. |  [optional]
**dadosAdicionais** | [**List&lt;DadoAdicional&gt;**](DadoAdicional.md) |  |  [optional]
**tipoSeguro** | [**TipoSeguro**](TipoSeguro.md) |  |  [optional]
**clientes** | [**List&lt;Cliente&gt;**](Cliente.md) |  |  [optional]
**cheques** | [**List&lt;Cheque&gt;**](Cheque.md) |  |  [optional]
**formaEnvio** | [**FormaEnvio**](FormaEnvio.md) |  |  [optional]
**dadosLiberacao** | [**DadosLiberacao**](DadosLiberacao.md) |  |  [optional]
**tipoEfetivacao** | [**TipoEfetivacao**](TipoEfetivacao.md) |  |  [optional]



