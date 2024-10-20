package com.google.android.libraries.hats20.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import defpackage.agrw;
import defpackage.agsf;
import defpackage.agsg;
import defpackage.cg;
import defpackage.cj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SurveyViewPager extends ViewPager {
    public SurveyViewPager(Context context) {
        super(context);
        x();
    }

    private final void x() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hats_lib_survey_page_margin);
        int i = this.d;
        this.d = dimensionPixelSize;
        int width = getWidth();
        super.h(width, width, dimensionPixelSize, i);
        requestLayout();
        if (this.e != Integer.MAX_VALUE) {
            this.e = Integer.MAX_VALUE;
            f();
        }
        d(new agsf(this));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final agrw u() {
        if (getContext() instanceof cj) {
            int i = this.c;
            for (cg cgVar : ((cj) getContext()).a().l()) {
                if (agsg.m(cgVar) == i && (cgVar instanceof agrw)) {
                    return (agrw) cgVar;
                }
            }
            Log.e("HatsLibSurveyViewPager", "No Fragment found for the current item, something is very wrong.");
            return null;
        }
        Log.e("HatsLibSurveyViewPager", "Context is not a SurveyPromptActivity, something is very wrong.");
        return null;
    }

    public final void v() {
        u().p();
        u().o();
    }

    public final boolean w() {
        if (this.c == this.b.j() - 1) {
            return true;
        }
        return false;
    }

    public SurveyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x();
    }
}
