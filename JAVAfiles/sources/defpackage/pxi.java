package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pxi extends pxj {
    private final alpg a;

    public pxi(alpg alpgVar) {
        this.a = alpgVar;
    }

    @Override // defpackage.pxn
    public final int b() {
        return 1;
    }

    @Override // defpackage.pxj, defpackage.pxn
    public final alpg c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pxn) {
            pxn pxnVar = (pxn) obj;
            if (pxnVar.b() == 1 && this.a.equals(pxnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HttpHeadersOrError{httpHeaders=" + this.a.toString() + "}";
    }
}
