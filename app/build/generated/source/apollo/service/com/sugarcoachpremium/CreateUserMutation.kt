//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '3.8.2'.
//
package com.sugarcoachpremium

import com.apollographql.apollo3.annotations.ApolloAdaptableWith
import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CompiledField
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.Mutation
import com.apollographql.apollo3.api.Optional
import com.apollographql.apollo3.api.json.JsonWriter
import com.apollographql.apollo3.api.obj
import com.sugarcoachpremium.adapter.CreateUserMutation_ResponseAdapter
import com.sugarcoachpremium.adapter.CreateUserMutation_VariablesAdapter
import com.sugarcoachpremium.selections.CreateUserMutationSelections
import kotlin.String
import kotlin.Unit

public data class CreateUserMutation(
  public val username: Optional<String?> = Optional.Absent,
  public val email: Optional<String?> = Optional.Absent,
  public val FirebaseId: Optional<String?> = Optional.Absent,
) : Mutation<CreateUserMutation.Data> {
  public override fun id(): String = OPERATION_ID

  public override fun document(): String = OPERATION_DOCUMENT

  public override fun name(): String = OPERATION_NAME

  public override fun serializeVariables(writer: JsonWriter,
      customScalarAdapters: CustomScalarAdapters): Unit {
    CreateUserMutation_VariablesAdapter.toJson(writer, customScalarAdapters, this)
  }

  public override fun adapter(): Adapter<Data> = CreateUserMutation_ResponseAdapter.Data.obj()

  public override fun rootField(): CompiledField = CompiledField.Builder(
    name = "data",
    type = com.sugarcoachpremium.type.Mutation.type
  )
  .selections(selections = CreateUserMutationSelections.__root)
  .build()

  @ApolloAdaptableWith(CreateUserMutation_ResponseAdapter.Data::class)
  public data class Data(
    public val createUsersPermissionsUser: CreateUsersPermissionsUser,
  ) : Mutation.Data

  public data class CreateUsersPermissionsUser(
    public val `data`: Data1?,
  )

  public data class Data1(
    public val id: String?,
    public val attributes: Attributes?,
  )

  public data class Attributes(
    public val username: String,
    public val email: String,
  )

  public companion object {
    public const val OPERATION_ID: String =
        "1ed83644d7f6b043f8a9f032da4b508da9c82cf568fddeed37b3d2a4b96616b0"

    /**
     * The minimized GraphQL document being sent to the server to save a few bytes.
     * The un-minimized version is:
     *
     * mutation CreateUser($username: String, $email: String, $FirebaseId: String) {
     *   createUsersPermissionsUser(data: {
     *     username: $username
     *     email: $email
     *     confirmed: true
     *     blocked: false
     *     role: 1
     *     password: "123456"
     *     FirebaseUID: $FirebaseId
     *   }
     *   ) {
     *     data {
     *       id
     *       attributes {
     *         username
     *         email
     *       }
     *     }
     *   }
     * }
     */
    public val OPERATION_DOCUMENT: String
      get() =
          "mutation CreateUser(${'$'}username: String, ${'$'}email: String, ${'$'}FirebaseId: String) { createUsersPermissionsUser(data: { username: ${'$'}username email: ${'$'}email confirmed: true blocked: false role: 1 password: \"123456\" FirebaseUID: ${'$'}FirebaseId } ) { data { id attributes { username email } } } }"

    public const val OPERATION_NAME: String = "CreateUser"
  }
}
