package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pzt extends pzu {
    private final pwr a;

    public pzt(pwr pwrVar) {
        this.a = pwrVar;
    }

    @Override // defpackage.pzv
    public final int b() {
        return 2;
    }

    @Override // defpackage.pzu, defpackage.pzv
    public final pwr c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pzv) {
            pzv pzvVar = (pzv) obj;
            if (pzvVar.b() == 2 && this.a.equals(pzvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FileInformationOrFileTransferFailure{fileTransferFailure=" + this.a.toString() + "}";
    }
}
