package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agog {
    public agoz a;
    public agmh b;
    public agmh c;
    public String d;
    public agpw e;
    public String f;
    private boolean g;
    private byte h;

    public final agoh a() {
        agoz agozVar;
        if (this.f == null) {
            agoz agozVar2 = this.a;
            if (agozVar2 != null) {
                this.f = agozVar2.k;
            } else {
                throw new IllegalStateException("Property \"query\" has not been set");
            }
        }
        if (this.h == 1 && (agozVar = this.a) != null) {
            return new agoh(agozVar, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" query");
        }
        if (this.h == 0) {
            sb.append(" isExemptFromIndexRequirementOnJoinedColumn");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.g = z;
        this.h = (byte) 1;
    }

    public final void c() {
        this.d = "!= -1 OR -1 !=";
    }
}
