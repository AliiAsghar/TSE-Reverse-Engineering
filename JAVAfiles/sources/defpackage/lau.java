package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lau implements lbb {
    private final Context a;
    private final int b;
    private final Paint c;
    private Drawable d;
    private float e = brg.a;
    private final atal f;

    public lau(Context context, atal atalVar, int i, int i2) {
        this.a = context;
        this.f = atalVar;
        this.b = i2;
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(ahnz.f(context, i, "SwipeActionCallback"));
    }

    @Override // defpackage.lbb
    public final void a() {
        if (this.d == null) {
            Drawable p = this.f.p();
            this.d = p;
            p.setTint(ahnz.f(this.a, this.b, "SwipeActionCallback"));
        }
    }

    @Override // defpackage.lbb
    public final void b(Canvas canvas, RecyclerView recyclerView, oo ooVar, float f, boolean z) {
        law lawVar = new law();
        lawVar.a = this.a;
        lawVar.h(this.f);
        lawVar.e(this.d);
        lawVar.b = this.c;
        lawVar.b(canvas);
        lawVar.c = recyclerView;
        lawVar.d = ooVar;
        lawVar.c(f);
        lawVar.d(this.e);
        lawVar.f(z);
        lawVar.g();
        this.e = lga.C(lawVar.a());
    }
}
