package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uux implements uun {
    public static final xze a = xze.g("BugleNetwork", "NewLightTickleFcmHandler");
    final Map b;
    private final uum c;
    private final xnv d;
    private final armf e;

    public uux(Map map, uum uumVar, xnv xnvVar, armf armfVar) {
        this.b = map;
        this.c = uumVar;
        this.d = xnvVar;
        this.e = armfVar;
    }

    private final boolean d() {
        return vht.d();
    }

    @Override // defpackage.uun
    public final void a(aoiq aoiqVar) {
        if (!((Boolean) utw.i.e()).booleanValue() && !d()) {
            a.l("Ignore received Firebase messages because features are not enabled.");
            return;
        }
        String str = (String) aoiqVar.c().get("tickle");
        if (str == null) {
            xyo c = a.c();
            c.H("Received FCM tickle without tickle key.");
            c.q();
            return;
        }
        aqfn a2 = uvc.a((String) aoiqVar.c().get("receiverId"));
        if (a2 == null) {
            xyo c2 = a.c();
            c2.H("Received FCM tickle without a receiver id.");
            c2.q();
            return;
        }
        asku b = asku.b(a2.b);
        if (b == null) {
            b = asku.UNRECOGNIZED;
        }
        Integer valueOf = Integer.valueOf(b.a());
        if (this.b.containsKey(valueOf)) {
            uup uupVar = (uup) ((armf) this.b.get(valueOf)).b();
            if (aoiqVar.b() == 2 && aoiqVar.a() == 1) {
                xyo c3 = a.c();
                c3.H("FireBase message priority downgraded.");
                c3.q();
                this.d.f().toEpochMilli();
                uupVar.c();
            }
            uupVar.b(a2, str, aoiqVar.b(), aoiqVar.a());
            return;
        }
        xyo c4 = a.c();
        c4.H("No handler registered for tickle type");
        c4.z("IdType", valueOf);
        c4.q();
    }

    @Override // defpackage.uun
    public final void b() {
        if (!((Boolean) utw.i.e()).booleanValue() && !d()) {
            a.l("Skipping Firebase Instance ID refresh because feature is not enabled.");
            return;
        }
        xze xzeVar = a;
        xyo c = xzeVar.c();
        c.H("Handling firebase new token");
        c.q();
        if (this.c == null) {
            xzeVar.m("firebaseInstanceIDManager is null");
        } else {
            aktp.aa(aktp.ao((Iterable) Collection.EL.stream(((alor) this.b).values()).map(new unt(14)).map(new unt(15)).collect(Collectors.toCollection(new tyr(18)))).h(new kli(17), andi.a), new ydv(new uhb(6), new uhb(7), 0), andi.a);
        }
    }

    @Override // defpackage.uun
    public final void c() {
    }
}
