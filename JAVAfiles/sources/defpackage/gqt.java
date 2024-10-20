package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqt {
    private final gon a;
    private final gqs b;
    private final gqr c;

    public gqt(gon gonVar, gqs gqsVar, gqr gqrVar) {
        this.a = gonVar;
        this.b = gqsVar;
        this.c = gqrVar;
        if (gonVar.b() == 0 && gonVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (gonVar.b != 0 && gonVar.c != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final Rect a() {
        return this.a.c();
    }

    public final gqq b() {
        gon gonVar = this.a;
        if (gonVar.b() > gonVar.a()) {
            return gqq.b;
        }
        return gqq.a;
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
        gqt gqtVar = (gqt) obj;
        if (d.F(this.a, gqtVar.a) && d.F(this.b, gqtVar.b) && d.F(this.c, gqtVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "gqt { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
