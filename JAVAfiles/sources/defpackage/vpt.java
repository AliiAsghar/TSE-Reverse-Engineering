package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vpt implements vps {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy");
    private final alor b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;

    public vpt(Map map, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.b = alor.j(map);
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
    }

    @Override // defpackage.vps
    public final akul a(msh mshVar) {
        if (!((oqj) this.d.b()).a() && !((oqk) this.e.b()).a() && !((oql) this.f.b()).a()) {
            amuk d = ((xtj) this.c.b()).d();
            Optional map = Collection.EL.stream(this.b.entrySet()).filter(new uhe(d, 12)).findFirst().map(new vmd(7));
            if (map.isEmpty()) {
                alvw i = a.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy", "getBotChatEndpoint", 84, "BotIdResolverTransportProxy.java")).t("getBotChatEndpoint: no BotIdResolver implementation registered for transport: %s", d.name());
                return aktp.ag(Optional.empty());
            }
            akrh e = aktp.e("BotIdResolverTransportProxy::getBotChatEndpoint2");
            try {
                akul a2 = ((vps) ((armf) map.get()).b()).a(mshVar);
                e.b(a2);
                e.close();
                return a2;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        alvi alviVar = a;
        alvw g = alviVar.g();
        g.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy", "getBotChatEndpoint", 62, "BotIdResolverTransportProxy.java")).q("getBotChatEndpoint: viaBotInfo is enabled");
        armf armfVar = (armf) this.b.get(vpu.BOT_INFO);
        if (armfVar != null) {
            akrh e2 = aktp.e("BotIdResolverTransportProxy::getBotChatEndpoint1");
            try {
                akul a3 = ((vps) armfVar.b()).a(mshVar);
                e2.b(a3);
                e2.close();
                return a3;
            } catch (Throwable th3) {
                try {
                    e2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        alvw i2 = alviVar.i();
        i2.X(alwp.a, "Bugle");
        ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy", "getBotChatEndpoint", 72, "BotIdResolverTransportProxy.java")).q("getBotChatEndpoint: no BotResolverStrategy.BOT_INFO impl");
        return aktp.ag(Optional.empty());
    }
}
