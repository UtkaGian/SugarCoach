//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.NullableAnyAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.nullable
import com.apollographql.apollo3.api.obj
import com.sugarcoachpremium.UpdateTreatmentMutation
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public object UpdateTreatmentMutation_ResponseAdapter {
  public object Data : Adapter<UpdateTreatmentMutation.Data> {
    public val RESPONSE_NAMES: List<String> = listOf("updateTreatment")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        UpdateTreatmentMutation.Data {
      var _updateTreatment: UpdateTreatmentMutation.UpdateTreatment? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _updateTreatment = UpdateTreatment.obj().nullable().fromJson(reader,
              customScalarAdapters)
          else -> break
        }
      }

      return UpdateTreatmentMutation.Data(
        updateTreatment = _updateTreatment
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: UpdateTreatmentMutation.Data,
    ): Unit {
      writer.name("updateTreatment")
      UpdateTreatment.obj().nullable().toJson(writer, customScalarAdapters, value.updateTreatment)
    }
  }

  public object UpdateTreatment : Adapter<UpdateTreatmentMutation.UpdateTreatment> {
    public val RESPONSE_NAMES: List<String> = listOf("data")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        UpdateTreatmentMutation.UpdateTreatment {
      var _data: UpdateTreatmentMutation.Data1? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _data = Data1.obj().nullable().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return UpdateTreatmentMutation.UpdateTreatment(
        `data` = _data
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: UpdateTreatmentMutation.UpdateTreatment,
    ): Unit {
      writer.name("data")
      Data1.obj().nullable().toJson(writer, customScalarAdapters, value.`data`)
    }
  }

  public object Data1 : Adapter<UpdateTreatmentMutation.Data1> {
    public val RESPONSE_NAMES: List<String> = listOf("attributes")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        UpdateTreatmentMutation.Data1 {
      var _attributes: UpdateTreatmentMutation.Attributes? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _attributes = Attributes.obj().nullable().fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return UpdateTreatmentMutation.Data1(
        attributes = _attributes
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: UpdateTreatmentMutation.Data1,
    ): Unit {
      writer.name("attributes")
      Attributes.obj().nullable().toJson(writer, customScalarAdapters, value.attributes)
    }
  }

  public object Attributes : Adapter<UpdateTreatmentMutation.Attributes> {
    public val RESPONSE_NAMES: List<String> = listOf("createdAt", "updatedAt")

    public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
        UpdateTreatmentMutation.Attributes {
      var _createdAt: Any? = null
      var _updatedAt: Any? = null

      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> _createdAt = NullableAnyAdapter.fromJson(reader, customScalarAdapters)
          1 -> _updatedAt = NullableAnyAdapter.fromJson(reader, customScalarAdapters)
          else -> break
        }
      }

      return UpdateTreatmentMutation.Attributes(
        createdAt = _createdAt,
        updatedAt = _updatedAt
      )
    }

    public override fun toJson(
      writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters,
      `value`: UpdateTreatmentMutation.Attributes,
    ): Unit {
      writer.name("createdAt")
      NullableAnyAdapter.toJson(writer, customScalarAdapters, value.createdAt)

      writer.name("updatedAt")
      NullableAnyAdapter.toJson(writer, customScalarAdapters, value.updatedAt)
    }
  }
}
