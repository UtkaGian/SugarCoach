//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium.adapter

import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.StringAdapter
import com.apollographql.apollo3.api.json.JsonReader
import com.apollographql.apollo3.api.json.JsonWriter
import com.sugarcoachpremium.GetUserDataQuery
import kotlin.IllegalStateException
import kotlin.Unit

public object GetUserDataQuery_VariablesAdapter : Adapter<GetUserDataQuery> {
  public override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters):
      GetUserDataQuery = throw IllegalStateException("Input type used in output position")

  public override fun toJson(
    writer: JsonWriter,
    customScalarAdapters: CustomScalarAdapters,
    `value`: GetUserDataQuery,
  ): Unit {
    writer.name("id")
    StringAdapter.toJson(writer, customScalarAdapters, value.id)
  }
}
