package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.ahnz;
import defpackage.aizj;
import defpackage.aizp;
import defpackage.aqqx;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SurveyPromptBannerWrapper extends FrameLayout {
    public SurveyPromptBannerWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        ahnz ahnzVar = aizp.c;
        if (aizp.c(aqqx.a.get().b(aizp.b))) {
            i2 = aizj.b(this, findViewById(R.id.survey_prompt_banner), i, i2, findViewById(R.id.survey_prompt_header), null, false);
        }
        super.onMeasure(i, i2);
    }
}
