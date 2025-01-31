// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sugarcoachpremium.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogSexBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AppCompatTextView profileDefinirTv;

  @NonNull
  public final AppCompatTextView profileFemTv;

  @NonNull
  public final AppCompatTextView profileMasTv;

  @NonNull
  public final AppCompatTextView profileOtroTv;

  private DialogSexBinding(@NonNull FrameLayout rootView,
      @NonNull AppCompatTextView profileDefinirTv, @NonNull AppCompatTextView profileFemTv,
      @NonNull AppCompatTextView profileMasTv, @NonNull AppCompatTextView profileOtroTv) {
    this.rootView = rootView;
    this.profileDefinirTv = profileDefinirTv;
    this.profileFemTv = profileFemTv;
    this.profileMasTv = profileMasTv;
    this.profileOtroTv = profileOtroTv;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogSexBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogSexBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_sex, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogSexBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.profile_definir_tv;
      AppCompatTextView profileDefinirTv = ViewBindings.findChildViewById(rootView, id);
      if (profileDefinirTv == null) {
        break missingId;
      }

      id = R.id.profile_fem_tv;
      AppCompatTextView profileFemTv = ViewBindings.findChildViewById(rootView, id);
      if (profileFemTv == null) {
        break missingId;
      }

      id = R.id.profile_mas_tv;
      AppCompatTextView profileMasTv = ViewBindings.findChildViewById(rootView, id);
      if (profileMasTv == null) {
        break missingId;
      }

      id = R.id.profile_otro_tv;
      AppCompatTextView profileOtroTv = ViewBindings.findChildViewById(rootView, id);
      if (profileOtroTv == null) {
        break missingId;
      }

      return new DialogSexBinding((FrameLayout) rootView, profileDefinirTv, profileFemTv,
          profileMasTv, profileOtroTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
