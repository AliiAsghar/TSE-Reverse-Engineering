package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.ajiu;
import defpackage.ajiv;
import defpackage.ajja;
import defpackage.ajjf;
import defpackage.ajjg;
import defpackage.ajjj;
import defpackage.ajjp;
import defpackage.ajjq;
import defpackage.ajjr;
import defpackage.gmz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CircularProgressIndicator extends ajiu<ajjg> {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.ajiu
    public final /* synthetic */ ajiv a(Context context, AttributeSet attributeSet) {
        return new ajjg(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        ajjq ajjaVar;
        ajjp ajjpVar = new ajjp(this.a);
        Context context2 = getContext();
        ajiv ajivVar = this.a;
        ajjg ajjgVar = (ajjg) ajivVar;
        if (ajjgVar.l == 1) {
            ajjaVar = new ajjf(context2, ajjgVar);
        } else {
            ajjaVar = new ajja(ajjgVar);
        }
        ajjr ajjrVar = new ajjr(context2, ajivVar, ajjpVar, ajjaVar);
        ajjrVar.c = gmz.b(context2.getResources(), R.drawable.indeterminate_static, null);
        setIndeterminateDrawable(ajjrVar);
        setProgressDrawable(new ajjj(getContext(), this.a, ajjpVar));
    }
}
