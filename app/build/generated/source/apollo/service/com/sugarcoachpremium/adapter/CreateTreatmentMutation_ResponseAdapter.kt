//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableAnyAdapter
import com.apollographql.apollo3.api.NullableStringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.nullable
import com.apollographql.apollo3.api.obj
import com.sugarcoachpremium.CreateTreatmentMutation
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object CreateTreatmentMutation_ResponseAdapter {
  public object Data : Adapter<CreateTreatmentMutation.Data> {
    public val RESPONSE_NAMES: List<String> = listOf("createTreatment")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        CreateTreatmentMutation.Data {
      var _createTreatment: CreateTreatmentMutation.CreateTreatment? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _createTreatment = CreateTreatment.obj().nullable().fromJson(reader,
              customScalarAdapters)
          else -> break
        }
      }

      return CreateTreatmentMutation.Data(
        createTreatment = _createTreatment
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: CreateTreatmentMutation.Data,
    ): Unit {
      writer.name("createTreatment")
      CreateTreatment.obj().nullable().toJson(writer, customScalarAdapters, value.createTreatment)
    }
  }

  public object CreateTreatment : Adapter<CreateTreatmentMutation.CreateTreatment> {
    public val RESPONSE_NAMES: List<String> = listOf("data")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        CreateTreatmentMutation.CreateTreatment {
      var _data: CreateTreatmentMutation.Data1? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _data = Data1.obj().nullable().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return CreateTreatmentMutation.CreateTreatment(
        `data` = _data
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: CreateTreatmentMutation.CreateTreatment,
    ): Unit {
      writer.name("data")
      Data1.obj().nullable().toJson(writer, customScalarAdapters, value.`data`)
    }
  }

  public object Data1 : Adapter<CreateTreatmentMutation.Data1> {
    public val RESPONSE_NAMES: List<String> = listOf("id", "attributes")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        CreateTreatmentMutation.Data1 {
      var _id: String? = null
      var _attributes: CreateTreatmentMutation.Attributes? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _id = NullableStringAdapter.fromJson(reader, customScalarAdapters)
          1 -> _attributes = Attributes.obj().nullable().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return CreateTreatmentMutation.Data1(
        id = _id,
        attributes = _attributes
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: CreateTreatmentMutation.Data1,
    ): Unit {
      writer.name("id")
      NullableStringAdapter.toJson(writer, customScalarAdapters, value.id)

      writer.name("attributes")
      Attributes.obj().nullable().toJson(writer, customScalarAdapters, value.attributes)
    }
  }

  public object Attributes : Adapter<CreateTreatmentMutation.Attributes> {
    public val RESPONSE_NAMES: List<String> = listOf("createdAt", "updatedAt")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        CreateTreatmentMutation.Attributes {
      var _createdAt: Any? = null
      var _updatedAt: Any? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _createdAt = NullableAnyAdapter.fromJson(reader, customScalarAdapters)
          1 -> _updatedAt = NullableAnyAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return CreateTreatmentMutation.Attributes(
        createdAt = _createdAt,
        updatedAt = _updatedAt
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: CreateTreatmentMutation.Attributes,
    ): Unit {
      writer.name("createdAt")
      NullableAnyAdapter.toJson(writer, customScalarAdapters, value.createdAt)

      writer.name("updatedAt")
      NullableAnyAdapter.toJson(writer, customScalarAdapters, value.updatedAt)
    }
  }
}
