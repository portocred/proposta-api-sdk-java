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
 * Enumeration dos tipos de cliente.
 */
@JsonAdapter(TipoCliente.Adapter.class)
public enum TipoCliente {
  
  CLIENTE_PRINCIPAL("CLIENTE_PRINCIPAL"),
  
  AVALISTA_1("AVALISTA_1"),
  
  AVALISTA_2("AVALISTA_2");

  private String value;

  TipoCliente(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TipoCliente fromValue(String text) {
    for (TipoCliente b : TipoCliente.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TipoCliente> {
    @Override
    public void write(final JsonWriter jsonWriter, final TipoCliente enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TipoCliente read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TipoCliente.fromValue(String.valueOf(value));
    }
  }
}
