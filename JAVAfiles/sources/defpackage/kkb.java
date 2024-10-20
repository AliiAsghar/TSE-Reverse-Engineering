package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkb {
    public final aeww a;
    public final kjo b;

    public kkb(aeww aewwVar, kjo kjoVar) {
        kjoVar.getClass();
        this.a = aewwVar;
        this.b = kjoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkb)) {
            return false;
        }
        kkb kkbVar = (kkb) obj;
        if (d.F(this.a, kkbVar.a) && d.F(this.b, kkbVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RbmTopAppBarUiData(appBar=" + this.a + ", backBehavior=" + this.b + ")";
    }
}
