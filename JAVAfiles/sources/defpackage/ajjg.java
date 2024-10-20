package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjg extends ajiv {
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;

    public ajjg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray a = ajig.a(context, attributeSet, ajjs.b, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        this.l = a.getInt(0, 0);
        int c = ajki.c(context, a, 4, dimensionPixelSize);
        int i = this.a;
        this.m = Math.max(c, i + i);
        this.n = ajki.c(context, a, 3, dimensionPixelSize2);
        this.o = a.getInt(2, 0);
        this.p = a.getBoolean(1, true);
        a.recycle();
        a();
    }
}
