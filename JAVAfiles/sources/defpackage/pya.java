package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pya extends pyb {
    private final xon a;

    public pya(xon xonVar) {
        this.a = xonVar;
    }

    @Override // defpackage.pyg
    public final int b() {
        return 3;
    }

    @Override // defpackage.pyb, defpackage.pyg
    public final xon d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pyg) {
            pyg pygVar = (pyg) obj;
            if (pygVar.b() == 3 && this.a.equals(pygVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DownloadResultOrError{unsupportedNetwork=" + this.a.toString() + "}";
    }
}
