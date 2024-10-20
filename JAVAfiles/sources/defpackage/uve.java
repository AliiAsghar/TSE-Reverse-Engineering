package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uve implements uun {
    public static final xze a = xze.g("BugleNetwork", "TachyonClientPingHandler");
    private final armf b;

    public uve(armf armfVar) {
        this.b = armfVar;
    }

    @Override // defpackage.uun
    public final void a(aoiq aoiqVar) {
        xze xzeVar = a;
        xzeVar.o("Received Client Ping from Tachyon");
        String str = (String) aoiqVar.c().get("app");
        armf armfVar = (armf) ((Map) this.b.b()).get(str);
        if (armfVar == null) {
            String str2 = (String) aoiqVar.c().get("tickle");
            xyo e = xzeVar.e();
            e.H("PingRefreshHandler not registered for app");
            e.z("appName", str);
            e.z("tickleId", str2);
            e.q();
            return;
        }
        aktp.aa(((uuo) armfVar.b()).a().e(aqwb.class, new uhw(12), andi.a), qiu.c(new uoa(str, 6)), andi.a);
    }

    @Override // defpackage.uun
    public final void b() {
    }

    @Override // defpackage.uun
    public final void c() {
    }
}
