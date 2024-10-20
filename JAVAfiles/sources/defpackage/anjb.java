package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjb {
    public final anji a;
    public final anjn b;
    public final alpt c;
    public final anix d;

    public anjb(anji anjiVar, anjn anjnVar, alpt alptVar, anix anixVar) {
        alptVar.getClass();
        this.a = anjiVar;
        this.b = anjnVar;
        this.c = alptVar;
        this.d = anixVar;
        if (anjq.a != anjnVar.b) {
            if (!alptVar.isEmpty()) {
                return;
            } else {
                throw new IllegalStateException("Must specify at least 1 group member.");
            }
        }
        throw new IllegalStateException("Must specify a valid GroupType.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anjb)) {
            return false;
        }
        anjb anjbVar = (anjb) obj;
        if (d.F(this.a, anjbVar.a) && d.F(this.b, anjbVar.b) && d.F(this.c, anjbVar.c) && d.F(this.d, anjbVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        anix anixVar = this.d;
        if (anixVar == null) {
            hashCode = 0;
        } else {
            hashCode = anixVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "CreateGroupRequest(id=" + this.a + ", properties=" + this.b + ", members=" + this.c + ", traceId=" + this.d + ")";
    }
}
