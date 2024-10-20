package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqx extends apsd {
    public final Object a;
    public agqw b;
    public boolean c;
    public final ahpn d;

    public agqx(ahpn ahpnVar) {
        super(null);
        this.a = new Object();
        this.c = false;
        this.d = ahpnVar;
        ahpnVar.c("application/grpc");
    }

    @Override // defpackage.apsd
    public final aqrx b() {
        synchronized (this.a) {
            if (this.b != null) {
                return new aqrx();
            }
            agqw agqwVar = new agqw(this.d);
            this.b = agqwVar;
            return agqwVar;
        }
    }
}
