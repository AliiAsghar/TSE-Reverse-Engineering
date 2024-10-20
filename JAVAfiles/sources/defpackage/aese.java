package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aese implements aesf {
    private final arqg a;

    public aese(arqg arqgVar) {
        this.a = arqgVar;
    }

    @Override // defpackage.aeze
    public final arqg a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aese) && d.F(this.a, ((aese) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TapToLoad(onClick=" + this.a + ")";
    }

    public aese() {
        this(aepz.m);
    }
}
