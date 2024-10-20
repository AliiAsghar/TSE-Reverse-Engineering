package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class law {
    public Context a;
    public Paint b;
    public RecyclerView c;
    public oo d;
    private Drawable e;
    private Canvas f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private byte k;
    private atal l;

    public final lax a() {
        Context context;
        atal atalVar;
        Drawable drawable;
        Paint paint;
        Canvas canvas;
        RecyclerView recyclerView;
        oo ooVar;
        if (this.k == 15 && (context = this.a) != null && (atalVar = this.l) != null && (drawable = this.e) != null && (paint = this.b) != null && (canvas = this.f) != null && (recyclerView = this.c) != null && (ooVar = this.d) != null) {
            return new lax(context, atalVar, drawable, paint, canvas, recyclerView, ooVar, this.g, this.h, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" context");
        }
        if (this.l == null) {
            sb.append(" iconProvider");
        }
        if (this.e == null) {
            sb.append(" drawable");
        }
        if (this.b == null) {
            sb.append(" backgroundPaint");
        }
        if (this.f == null) {
            sb.append(" canvas");
        }
        if (this.c == null) {
            sb.append(" recyclerView");
        }
        if (this.d == null) {
            sb.append(" viewHolder");
        }
        if ((this.k & 1) == 0) {
            sb.append(" dX");
        }
        if ((this.k & 2) == 0) {
            sb.append(" dXLast");
        }
        if ((this.k & 4) == 0) {
            sb.append(" isCurrentlyActive");
        }
        if ((this.k & 8) == 0) {
            sb.append(" swipeThreshold");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Canvas canvas) {
        if (canvas != null) {
            this.f = canvas;
            return;
        }
        throw new NullPointerException("Null canvas");
    }

    public final void c(float f) {
        this.g = f;
        this.k = (byte) (this.k | 1);
    }

    public final void d(float f) {
        this.h = f;
        this.k = (byte) (this.k | 2);
    }

    public final void e(Drawable drawable) {
        if (drawable != null) {
            this.e = drawable;
            return;
        }
        throw new NullPointerException("Null drawable");
    }

    public final void f(boolean z) {
        this.i = z;
        this.k = (byte) (this.k | 4);
    }

    public final void g() {
        this.j = 0.5f;
        this.k = (byte) (this.k | 8);
    }

    public final void h(atal atalVar) {
        if (atalVar != null) {
            this.l = atalVar;
            return;
        }
        throw new NullPointerException("Null iconProvider");
    }
}
