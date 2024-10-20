package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uuz implements uuo {
    public static final xze a = xze.g("BugleNetwork", "PhonePingRefreshHandler");
    public final vbs b;
    public final anen c;
    private final armf d;
    private final armf e;

    public uuz(vbs vbsVar, anen anenVar, armf armfVar, armf armfVar2) {
        this.b = vbsVar;
        this.c = anenVar;
        this.d = armfVar;
        this.e = armfVar2;
    }

    @Override // defpackage.uuo
    public final akul a() {
        if (!vht.d()) {
            a.o("Phone registration refresh on ping is not enabled.");
            return aktp.ag(null);
        }
        a.o("Refreshing Tachyon phone registration.");
        return aktp.an(((adjc) this.d.b()).f().h(new ult(this, 12), this.c)).h(new kli(18), this.c).e(IllegalArgumentException.class, new uhw(11), andi.a);
    }
}
