package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igd extends igf {
    private final int a;

    public igd(int i) {
        this.a = i;
    }

    @Override // defpackage.ihc
    public final int a() {
        return 1;
    }

    @Override // defpackage.igf, defpackage.ihc
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ihc) {
            ihc ihcVar = (ihc) obj;
            if (ihcVar.a() == 1 && this.a == ihcVar.b()) {
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
        return a.bW(Integer.toString(a.M(this.a)), "DialogLoggingSource{blockAndReportSpamDialogSource=", "}");
    }
}
