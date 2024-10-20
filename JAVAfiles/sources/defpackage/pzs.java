package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class pzs extends pzu {
    private final qep a;

    public pzs(qep qepVar) {
        this.a = qepVar;
    }

    @Override // defpackage.pzu, defpackage.pzv
    public final qep a() {
        return this.a;
    }

    @Override // defpackage.pzv
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pzv) {
            pzv pzvVar = (pzv) obj;
            if (pzvVar.b() == 1 && this.a.equals(pzvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FileInformationOrFileTransferFailure{fileInformation=" + this.a.toString() + "}";
    }
}
