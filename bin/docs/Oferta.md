
# Oferta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idOferta** | **String** | Identificador da oferta. |  [optional]
**origemOferta** | **String** | Origem da oferta. |  [optional]
**dataVencimentoPrimeiraParcela** | [**LocalDate**](LocalDate.md) | Data de vencimento da 1ª parcela. |  [optional]
**dataVencimentoUltimaParcela** | [**LocalDate**](LocalDate.md) | Data de vencimento da última parcela. |  [optional]
**cetAnual** | **Double** | Valor CET anual. |  [optional]
**cetMensal** | **Double** | Valor CET mensal. |  [optional]
**dataMovimento** | [**LocalDate**](LocalDate.md) | Data do movimento. |  [optional]
**codigoPlano** | **String** | Código do plano utilizada na simulação. |  [optional]
**descricaoPlano** | **String** | Descrição do plano utilizado na simulação. |  [optional]
**codigoProduto** | **String** | Código do produto utilizado na simulação. |  [optional]
**descricaoProduto** | **String** | Descrição do produto utilizado na simulação. |  [optional]
**dataEmissao** | [**LocalDate**](LocalDate.md) | Data da emissão. |  [optional]
**financiadoIndice** | **Double** | Valor financiado índice. |  [optional]
**finioFSeguro** | **Double** | Valor finio seguro. |  [optional]
**idProdutoSeguro** | **Long** | Identificador do produto do seguro. |  [optional]
**valorIOF** | **Double** | Valor Final do IOF. |  [optional]
**prazo** | **Integer** | Prazo / Qtd de Parcelas utilizada na simulação. |  [optional]
**valorPrimeiraPrestacao** | **Double** | Valor da 1ª prestação. |  [optional]
**seguradora** | **String** | seguradora. |  [optional]
**seguro** | **Double** | Valor do seguro. |  [optional]
**valorTAC** | **Double** | Valor do TAC. |  [optional]
**valorTaxa** | **Double** | Valor da Taxa. |  [optional]
**valorTaxaAnual** | **Double** | Valor da Taxa anual. |  [optional]
**valorCompra** | **Double** | Valor da compra. Resultante pela PMT ou utilizado no cálculo da simulação. |  [optional]
**valorCredito** | **Double** | Valor do crédito. |  [optional]
**valorFinanciado** | **Double** | Valor financiado. |  [optional]
**valorLiberado** | **Double** | Valor liberado. |  [optional]
**valorLiquidar** | **Double** | Valor a liquidar. |  [optional]
**valorParcela** | **Double** | Valor da parcela. |  [optional]
**valorSeguro** | **Double** | Valor Final do Seguro (se foi solicitado seguro). |  [optional]
**valorTaxaInclusao** | **Double** | Valor da taxa de inclusão. |  [optional]
**valorTaxaRenovacao** | **Double** | Valor da taxa de renovação. |  [optional]
**valorTotal** | **Double** | Valor do total com Juros (soma de todas as PMTs). |  [optional]
**valorTotalPST** | **Double** | Valor do total PST. |  [optional]
**expiradaFaixaTarifaInclusao** | [**IndicativoSimNao**](IndicativoSimNao.md) |  |  [optional]
**sugeridoFaixaRetorno** | [**IndicativoSimNao**](IndicativoSimNao.md) |  |  [optional]
**tipoSimulacao** | [**TipoSimulacao**](TipoSimulacao.md) |  |  [optional]



