package com.google.android.apps.messaging.ui.rcs.setup.success;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.abag;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsSuccessSingleSimPopup extends abag {
    public RcsSuccessSingleSimPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.rcs_success_single_sim_popup, (ViewGroup) this, true);
    }

    @Override // defpackage.abag
    protected final View a() {
        return findViewById(R.id.rcs_success_dismiss_button);
    }

    @Override // defpackage.abag
    public final void b() {
        TextView textView = (TextView) findViewById(R.id.rcs_success_title);
        TextView textView2 = (TextView) findViewById(R.id.rcs_success_body);
        textView.setText(this.b.m);
        textView2.setText(this.b.n);
        this.b.e(textView2);
    }
}
