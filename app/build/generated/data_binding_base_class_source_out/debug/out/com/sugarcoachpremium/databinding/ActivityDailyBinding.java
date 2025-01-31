// Generated by view binder compiler. Do not edit!
package com.sugarcoachpremium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcoachpremium.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDailyBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatImageView bg;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final AppCompatTextView dailyDateTxt;

  @NonNull
  public final LinearLayout dailyHome;

  @NonNull
  public final RecyclerView dailyList;

  @NonNull
  public final FloatingActionButton dailyPdfIv;

  @NonNull
  public final LinearLayout dailyRegister;

  @NonNull
  public final LinearLayout dailyStatistics;

  @NonNull
  public final AppCompatTextView dailyTimeTxt;

  @NonNull
  public final LinearLayout dailyTratamiento;

  @NonNull
  public final CircleImageView dailyUserimgIv;

  @NonNull
  public final AppCompatTextView dailyUsernameTxt;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final FrameLayout loading;

  @NonNull
  public final AppCompatImageView planet;

  private ActivityDailyBinding(@NonNull LinearLayout rootView, @NonNull AppCompatImageView bg,
      @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView dailyDateTxt,
      @NonNull LinearLayout dailyHome, @NonNull RecyclerView dailyList,
      @NonNull FloatingActionButton dailyPdfIv, @NonNull LinearLayout dailyRegister,
      @NonNull LinearLayout dailyStatistics, @NonNull AppCompatTextView dailyTimeTxt,
      @NonNull LinearLayout dailyTratamiento, @NonNull CircleImageView dailyUserimgIv,
      @NonNull AppCompatTextView dailyUsernameTxt, @NonNull Guideline guideline,
      @NonNull LinearLayout linearLayout, @NonNull FrameLayout loading,
      @NonNull AppCompatImageView planet) {
    this.rootView = rootView;
    this.bg = bg;
    this.constraintLayout = constraintLayout;
    this.dailyDateTxt = dailyDateTxt;
    this.dailyHome = dailyHome;
    this.dailyList = dailyList;
    this.dailyPdfIv = dailyPdfIv;
    this.dailyRegister = dailyRegister;
    this.dailyStatistics = dailyStatistics;
    this.dailyTimeTxt = dailyTimeTxt;
    this.dailyTratamiento = dailyTratamiento;
    this.dailyUserimgIv = dailyUserimgIv;
    this.dailyUsernameTxt = dailyUsernameTxt;
    this.guideline = guideline;
    this.linearLayout = linearLayout;
    this.loading = loading;
    this.planet = planet;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDailyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDailyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_daily, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDailyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bg;
      AppCompatImageView bg = ViewBindings.findChildViewById(rootView, id);
      if (bg == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.daily_date_txt;
      AppCompatTextView dailyDateTxt = ViewBindings.findChildViewById(rootView, id);
      if (dailyDateTxt == null) {
        break missingId;
      }

      id = R.id.daily_home;
      LinearLayout dailyHome = ViewBindings.findChildViewById(rootView, id);
      if (dailyHome == null) {
        break missingId;
      }

      id = R.id.daily_list;
      RecyclerView dailyList = ViewBindings.findChildViewById(rootView, id);
      if (dailyList == null) {
        break missingId;
      }

      id = R.id.daily_pdf_iv;
      FloatingActionButton dailyPdfIv = ViewBindings.findChildViewById(rootView, id);
      if (dailyPdfIv == null) {
        break missingId;
      }

      id = R.id.daily_register;
      LinearLayout dailyRegister = ViewBindings.findChildViewById(rootView, id);
      if (dailyRegister == null) {
        break missingId;
      }

      id = R.id.daily_statistics;
      LinearLayout dailyStatistics = ViewBindings.findChildViewById(rootView, id);
      if (dailyStatistics == null) {
        break missingId;
      }

      id = R.id.daily_time_txt;
      AppCompatTextView dailyTimeTxt = ViewBindings.findChildViewById(rootView, id);
      if (dailyTimeTxt == null) {
        break missingId;
      }

      id = R.id.daily_tratamiento;
      LinearLayout dailyTratamiento = ViewBindings.findChildViewById(rootView, id);
      if (dailyTratamiento == null) {
        break missingId;
      }

      id = R.id.daily_userimg_iv;
      CircleImageView dailyUserimgIv = ViewBindings.findChildViewById(rootView, id);
      if (dailyUserimgIv == null) {
        break missingId;
      }

      id = R.id.daily_username_txt;
      AppCompatTextView dailyUsernameTxt = ViewBindings.findChildViewById(rootView, id);
      if (dailyUsernameTxt == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.loading;
      FrameLayout loading = ViewBindings.findChildViewById(rootView, id);
      if (loading == null) {
        break missingId;
      }

      id = R.id.planet;
      AppCompatImageView planet = ViewBindings.findChildViewById(rootView, id);
      if (planet == null) {
        break missingId;
      }

      return new ActivityDailyBinding((LinearLayout) rootView, bg, constraintLayout, dailyDateTxt,
          dailyHome, dailyList, dailyPdfIv, dailyRegister, dailyStatistics, dailyTimeTxt,
          dailyTratamiento, dailyUserimgIv, dailyUsernameTxt, guideline, linearLayout, loading,
          planet);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
