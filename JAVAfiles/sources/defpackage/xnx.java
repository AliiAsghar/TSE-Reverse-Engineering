package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xnx implements xny {
    private final String a;

    public xnx(String str) {
        this.a = str;
    }

    @Override // defpackage.xny
    public final akrh a() {
        return aktp.e(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xnx) {
            return this.a.equals(((xnx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraceSpanSupplier: ".concat(this.a);
    }
}
