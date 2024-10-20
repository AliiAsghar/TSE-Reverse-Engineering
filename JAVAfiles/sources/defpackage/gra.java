package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gra {
    public final efo a;
    private final gon b;
    private final float c;

    public gra(gon gonVar, efo efoVar, float f) {
        this.b = gonVar;
        this.a = efoVar;
        this.c = f;
    }

    public final Rect a() {
        return this.b.c();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!d.F(cls2, cls)) {
            return false;
        }
        obj.getClass();
        gra graVar = (gra) obj;
        if (d.F(this.b, graVar.b) && d.F(this.a, graVar.a) && this.c == graVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.b + ", _windowInsetsCompat=" + this.a + ", density=" + this.c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gra(Rect rect, efo efoVar, float f) {
        this(new gon(rect), efoVar, f);
        efoVar.getClass();
    }
}
