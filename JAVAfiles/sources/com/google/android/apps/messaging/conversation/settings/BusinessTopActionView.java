package com.google.android.apps.messaging.conversation.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.abbu;
import defpackage.akec;
import defpackage.iyt;
import defpackage.mho;
import defpackage.xvd;
import defpackage.yyb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BusinessTopActionView extends iyt implements View.OnClickListener {
    public xvd a;
    public mho b;
    public abbu c;
    public final yyb d;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        yyb b();
    }

    public BusinessTopActionView(Context context) {
        super(context);
        this.d = ((a) akec.w(context, a.class)).b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xvd xvdVar = this.a;
        if (xvdVar == null) {
            this.b.aL(1, 2, null);
            this.c.k(R.string.business_action_failed_to_launch);
        } else {
            if (!xvdVar.i()) {
                this.c.k(R.string.business_action_failed_to_launch);
            }
            this.b.aL(this.a.j(), 2, this.a.h());
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
    }

    public BusinessTopActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = ((a) akec.w(context, a.class)).b();
    }
}
