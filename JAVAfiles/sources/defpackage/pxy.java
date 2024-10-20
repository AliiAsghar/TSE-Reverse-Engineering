package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pxy extends pyb {
    private final pwr a;

    public pxy(pwr pwrVar) {
        this.a = pwrVar;
    }

    @Override // defpackage.pyb, defpackage.pyg
    public final pwr a() {
        return this.a;
    }

    @Override // defpackage.pyg
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pyg) {
            pyg pygVar = (pyg) obj;
            if (pygVar.b() == 2 && this.a.equals(pygVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DownloadResultOrError{downloadFailure=" + this.a.toString() + "}";
    }
}
