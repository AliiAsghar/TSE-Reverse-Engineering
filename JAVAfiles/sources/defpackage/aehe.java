package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aehe extends aehf {
    private final int a;

    public aehe(int i) {
        this.a = i;
    }

    @Override // defpackage.aehj
    public final int b() {
        return 2;
    }

    @Override // defpackage.aehf, defpackage.aehj
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aehj) {
            aehj aehjVar = (aehj) obj;
            if (aehjVar.b() == 2 && this.a == aehjVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.bm(i);
        return i;
    }

    public final String toString() {
        return a.bW(Integer.toString(a.ao(this.a)), "ConfigDataMapOrSyncFailureReason{syncFailureReason=", "}");
    }
}
