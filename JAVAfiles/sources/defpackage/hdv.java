package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdv {
    private final String a;

    public hdv() {
        throw null;
    }

    public static final float a(hbb hbbVar) {
        her g = hbbVar.g();
        if (g == null) {
            return 1.0f;
        }
        return arrn.q((g.b + g.c) / hbbVar.j, brg.a, 1.0f);
    }

    public static final float b(hbb hbbVar) {
        float f;
        her g = hbbVar.g();
        if (g != null) {
            f = g.b;
        } else {
            f = 0.0f;
        }
        return arrn.q(f / hbbVar.j, brg.a, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hdv) && d.F(this.a, ((hdv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Marker(marker=" + this.a + ")";
    }

    public hdv(byte[] bArr) {
        this.a = "rest";
    }
}
