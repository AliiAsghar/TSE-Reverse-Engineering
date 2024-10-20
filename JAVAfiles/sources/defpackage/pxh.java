package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pxh extends pxj {
    private final pwr a;

    public pxh(pwr pwrVar) {
        this.a = pwrVar;
    }

    @Override // defpackage.pxj, defpackage.pxn
    public final pwr a() {
        return this.a;
    }

    @Override // defpackage.pxn
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pxn) {
            pxn pxnVar = (pxn) obj;
            if (pxnVar.b() == 2 && this.a.equals(pxnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HttpHeadersOrError{error=" + this.a.toString() + "}";
    }
}
