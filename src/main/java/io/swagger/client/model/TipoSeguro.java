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
 * Enumeration dos tipos de seguro.
 */
@JsonAdapter(TipoSeguro.Adapter.class)
public enum TipoSeguro {
  
  SEM_SEGURO("SEM_SEGURO"),
  
  SEGURO_BASICO("SEGURO_BASICO"),
  
  SEGURO_COMPLETO("SEGURO_COMPLETO");

  private String value;

  TipoSeguro(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TipoSeguro fromValue(String text) {
    for (TipoSeguro b : TipoSeguro.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TipoSeguro> {
    @Override
    public void write(final JsonWriter jsonWriter, final TipoSeguro enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TipoSeguro read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TipoSeguro.fromValue(String.valueOf(value));
    }
  }
}
