package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmi implements lkf {
    public final String a;
    public final boolean b;

    public lmi() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmi)) {
            return false;
        }
        lmi lmiVar = (lmi) obj;
        if (d.F(this.a, lmiVar.a) && this.b == lmiVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }

    public final String toString() {
        return "ExitRenameGroup(newName=" + this.a + ", groupRenamed=" + this.b + ")";
    }

    public lmi(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public /* synthetic */ lmi(int i) {
        this(1 != (i & 1) ? null : "", false);
    }
}
