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
 * Enumeration dos tipos de simulações.
 */
@JsonAdapter(TipoSimulacao.Adapter.class)
public enum TipoSimulacao {
  
  VALOR_CREDITO("VALOR_CREDITO"),
  
  PRESTACAO_APROXIMADA("PRESTACAO_APROXIMADA");

  private String value;

  TipoSimulacao(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TipoSimulacao fromValue(String text) {
    for (TipoSimulacao b : TipoSimulacao.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TipoSimulacao> {
    @Override
    public void write(final JsonWriter jsonWriter, final TipoSimulacao enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TipoSimulacao read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TipoSimulacao.fromValue(String.valueOf(value));
    }
  }
}

