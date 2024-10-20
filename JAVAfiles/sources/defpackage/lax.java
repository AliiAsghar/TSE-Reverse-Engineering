package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lax {
    public final Context a;
    public final Drawable b;
    public final Paint c;
    public final Canvas d;
    public final RecyclerView e;
    public final oo f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public final atal k;

    public lax() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lax) {
            lax laxVar = (lax) obj;
            if (this.a.equals(laxVar.a) && this.k.equals(laxVar.k) && this.b.equals(laxVar.b) && this.c.equals(laxVar.c) && this.d.equals(laxVar.d) && this.e.equals(laxVar.e) && this.f.equals(laxVar.f)) {
                if (Float.floatToIntBits(this.g) == Float.floatToIntBits(laxVar.g)) {
                    if (Float.floatToIntBits(this.h) == Float.floatToIntBits(laxVar.h) && this.i == laxVar.i) {
                        if (Float.floatToIntBits(this.j) == Float.floatToIntBits(laxVar.j)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ Float.floatToIntBits(this.h);
        if (true != this.i) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ Float.floatToIntBits(this.j);
    }

    public final String toString() {
        oo ooVar = this.f;
        RecyclerView recyclerView = this.e;
        Canvas canvas = this.d;
        Paint paint = this.c;
        Drawable drawable = this.b;
        atal atalVar = this.k;
        return "IconDrawParameters{context=" + String.valueOf(this.a) + ", iconProvider=" + String.valueOf(atalVar) + ", drawable=" + String.valueOf(drawable) + ", backgroundPaint=" + String.valueOf(paint) + ", canvas=" + String.valueOf(canvas) + ", recyclerView=" + String.valueOf(recyclerView) + ", viewHolder=" + String.valueOf(ooVar) + ", dX=" + this.g + ", dXLast=" + this.h + ", isCurrentlyActive=" + this.i + ", swipeThreshold=" + this.j + "}";
    }

    public lax(Context context, atal atalVar, Drawable drawable, Paint paint, Canvas canvas, RecyclerView recyclerView, oo ooVar, float f, float f2, boolean z, float f3) {
        this.a = context;
        this.k = atalVar;
        this.b = drawable;
        this.c = paint;
        this.d = canvas;
        this.e = recyclerView;
        this.f = ooVar;
        this.g = f;
        this.h = f2;
        this.i = z;
        this.j = f3;
    }
}
