// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sugarcoachpremium.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogConfigDeleteBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button deleteAccept;

  @NonNull
  public final Button deleteCancel;

  private DialogConfigDeleteBinding(@NonNull FrameLayout rootView, @NonNull Button deleteAccept,
      @NonNull Button deleteCancel) {
    this.rootView = rootView;
    this.deleteAccept = deleteAccept;
    this.deleteCancel = deleteCancel;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogConfigDeleteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogConfigDeleteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_config_delete, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogConfigDeleteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delete_accept;
      Button deleteAccept = ViewBindings.findChildViewById(rootView, id);
      if (deleteAccept == null) {
        break missingId;
      }

      id = R.id.delete_cancel;
      Button deleteCancel = ViewBindings.findChildViewById(rootView, id);
      if (deleteCancel == null) {
        break missingId;
      }

      return new DialogConfigDeleteBinding((FrameLayout) rootView, deleteAccept, deleteCancel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
