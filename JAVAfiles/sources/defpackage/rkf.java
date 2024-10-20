package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rkf {
    public final rkd a;
    public final String b;

    public rkf(rkd rkdVar, String str) {
        this.a = rkdVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkf)) {
            return false;
        }
        rkf rkfVar = (rkf) obj;
        if (d.F(this.a, rkfVar.a) && d.F(this.b, rkfVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BackupTableWriterWithLogTag(backupTableWriter=" + this.a + ", logTag=" + this.b + ")";
    }
}
