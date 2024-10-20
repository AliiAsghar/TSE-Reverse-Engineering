package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibu {
    public aiba a;
    public String b;
    public adae c;
    private long d;
    private byte e;

    public final aibv a() {
        boolean z = true;
        if (this.e == 1) {
            aibv aibvVar = new aibv(this.a, this.b, this.d, this.c);
            aiba aibaVar = aibvVar.a;
            if (aibaVar != null) {
                if (aibaVar.q == null) {
                    z = false;
                }
                d.t(z, "Place must have a valid place id.");
            }
            return aibvVar;
        }
        throw new IllegalStateException("Missing required properties: utcTimeMillis");
    }

    public final void b(long j) {
        this.d = j;
        this.e = (byte) 1;
    }
}
