package com.google.android.apps.messaging.ui.rcs.setup.success;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.abag;
import defpackage.abai;
import defpackage.yjy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsSuccessMultiSimPopup extends abag {
    public RcsSuccessMultiSimPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.rcs_success_multi_sim_popup, (ViewGroup) this, true);
    }

    @Override // defpackage.abag
    protected final View a() {
        return findViewById(R.id.rcs_success_msim_dismiss_button);
    }

    @Override // defpackage.abag
    protected final void b() {
        TextView textView = (TextView) findViewById(R.id.rcs_success_msim_index);
        TextView textView2 = (TextView) findViewById(R.id.rcs_success_msim_display_name);
        TextView textView3 = (TextView) findViewById(R.id.rcs_success_msim_title);
        TextView textView4 = (TextView) findViewById(R.id.rcs_success_msim_body);
        textView.setText(this.b.k);
        abai abaiVar = this.b;
        if (abaiVar.l == null) {
            abaiVar.l = ((yjy) abaiVar.d.b()).k().t();
        }
        textView2.setText(abaiVar.l);
        textView3.setText(this.b.m);
        textView4.setText(this.b.n);
        this.b.e(textView4);
    }
}
