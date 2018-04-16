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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Enumeration dos tipos de conta bancária.
 */
@JsonAdapter(TipoContaBancaria.Adapter.class)
public enum TipoContaBancaria {
  
  CORRENTE_PF("CONTA_CORRENTE_PF"),
  
  POUPANCA_PF("CONTA_POUPANCA_PF"),
  
  FACIL_PF_CEF("CONTA_FACIL_PF_CEF"),
  
  SALARIO_PF("CONTA_SALARIO_PF"),
  
  CORRENTE_PJ("CONTA_CORRENTE_PJ"),
  
  POUPANCA_PJ("CONTA_POUPANCA_PJ");

  private String value;

  TipoContaBancaria(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TipoContaBancaria fromValue(String text) {
    for (TipoContaBancaria b : TipoContaBancaria.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TipoContaBancaria> {
    @Override
    public void write(final JsonWriter jsonWriter, final TipoContaBancaria enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TipoContaBancaria read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TipoContaBancaria.fromValue(String.valueOf(value));
    }
  }
}
