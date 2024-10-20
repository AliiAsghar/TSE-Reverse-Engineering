package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ige extends igf {
    private final int a;

    public ige(int i) {
        this.a = i;
    }

    @Override // defpackage.ihc
    public final int a() {
        return 2;
    }

    @Override // defpackage.igf, defpackage.ihc
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ihc) {
            ihc ihcVar = (ihc) obj;
            if (ihcVar.a() == 2 && this.a == ihcVar.c()) {
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
        return a.bW(Integer.toString(a.M(this.a)), "DialogLoggingSource{rbmBlockAndReportSpamDialogSource=", "}");
    }
}
