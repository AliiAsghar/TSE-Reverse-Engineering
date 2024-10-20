package com.google.android.apps.messaging.welcome;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.abfc;
import defpackage.brg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EmergencySmsButtonView extends FrameLayout {
    public View a;
    private final boolean b;

    public EmergencySmsButtonView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        inflate(getContext(), R.layout.emergency_sms_button, this);
        super.onFinishInflate();
        View findViewById = findViewById(R.id.emergency_sms_text);
        this.a = findViewById;
        if (!this.b) {
            findViewById.setVisibility(8);
            this.a.setAlpha(brg.a);
        }
    }

    public EmergencySmsButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, abfc.a, 0, 0);
        try {
            this.b = obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
