package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doj {
    public final dhv a;
    public final long b;
    public final djc c;

    public doj(dhv dhvVar, long j, djc djcVar) {
        this.a = dhvVar;
        this.b = djd.b(j, a().length());
        this.c = djcVar != null ? new djc(djd.b(djcVar.b, a().length())) : null;
    }

    public static /* synthetic */ doj b(doj dojVar, dhv dhvVar, long j, int i) {
        djc djcVar;
        if ((i & 1) != 0) {
            dhvVar = dojVar.a;
        }
        if ((i & 2) != 0) {
            j = dojVar.b;
        }
        if ((i & 4) != 0) {
            djcVar = dojVar.c;
        } else {
            djcVar = null;
        }
        return new doj(dhvVar, j, djcVar);
    }

    public final String a() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doj)) {
            return false;
        }
        doj dojVar = (doj) obj;
        if (a.bB(this.b, dojVar.b) && d.F(this.c, dojVar.c) && d.F(this.a, dojVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        djc djcVar = this.c;
        if (djcVar != null) {
            i = a.A(djcVar.b);
        } else {
            i = 0;
        }
        return ((hashCode + a.A(this.b)) * 31) + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) djc.f(this.b)) + ", composition=" + this.c + ')';
    }

    public /* synthetic */ doj(dhv dhvVar, long j) {
        this(dhvVar, j, (djc) null);
    }

    public /* synthetic */ doj(String str, long j, int i) {
        this(new dhv(1 == (i & 1) ? "" : str), (i & 2) != 0 ? djc.a : j, (djc) null);
    }
}
