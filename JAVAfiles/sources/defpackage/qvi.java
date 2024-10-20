package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qvi extends agps {
    public qvi() {
        super("my_identities");
    }

    public final boolean b(qwe qweVar) {
        qvj qvjVar = new qvj();
        qvjVar.U(new agmd("my_identities.token", 1, riw.n(qweVar)));
        return ae(new agpw(qvjVar), "my_identities-buildAndUpdateForToken");
    }

    @Override // defpackage.agps
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void d(String str) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 60120) {
            agnc.t("display_name", intValue2);
        }
        if (intValue >= 60120) {
            agnc.r(this.a, "display_name", str);
        }
    }
}
