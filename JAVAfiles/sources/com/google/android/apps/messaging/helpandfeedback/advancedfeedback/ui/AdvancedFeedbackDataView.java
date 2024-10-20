package com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aohs;
import defpackage.klx;
import defpackage.ksq;
import defpackage.ktw;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AdvancedFeedbackDataView extends ktw {
    public CheckBox g;
    public TextView h;
    public TextView i;
    public ksq j;
    public aohs k;

    public AdvancedFeedbackDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final Optional f() {
        ksq ksqVar = this.j;
        if (ksqVar == null) {
            return Optional.empty();
        }
        return Optional.of(ksqVar);
    }

    public final boolean g() {
        return this.g.isChecked();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (CheckBox) findViewById(R.id.advanced_feedback_data_checkbox);
        this.i = (TextView) findViewById(R.id.advanced_feedback_learn_more_button);
        this.h = (TextView) findViewById(R.id.advanced_feedback_data_title);
        this.k.r(this.i, new klx(this, 8));
        setOnClickListener(new klx(this, 9));
    }
}
