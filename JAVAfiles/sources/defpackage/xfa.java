package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xfa implements vgh {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter");
    public final anen b;
    public final wfh c;
    private final xcs d;
    private final Map e;

    public xfa(Map map, xcs xcsVar, wfh wfhVar, anen anenVar) {
        this.d = xcsVar;
        this.c = wfhVar;
        this.b = anenVar;
        this.e = map;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Collection, java.lang.Iterable] */
    @Override // defpackage.vgh
    public final akul a(aqds aqdsVar) {
        akul c;
        akrh e = aktp.e("TachygramInboxMessageHandlerAdapter#handleInboxMessage");
        try {
            Map map = this.e;
            aqdr b = aqdr.b(aqdsVar.d);
            if (b == null) {
                b = aqdr.UNRECOGNIZED;
            }
            xex xexVar = (xex) map.get(b);
            aqdr b2 = aqdr.b(aqdsVar.d);
            if (b2 == null) {
                b2 = aqdr.UNRECOGNIZED;
            }
            b2.a();
            xexVar.getClass();
            xga a2 = xexVar.a(aqdsVar);
            ?? a3 = a2.a();
            aqdr b3 = aqdr.b(aqdsVar.d);
            if (b3 == null) {
                b3 = aqdr.UNRECOGNIZED;
            }
            boolean u = albo.u(a3, b3);
            aqdr b4 = aqdr.b(aqdsVar.d);
            if (b4 == null) {
                b4 = aqdr.UNRECOGNIZED;
            }
            albo.V(u, "Tachygram does not support receiving InboxMessage.MessageType: %s", b4.a());
            this.d.g(xcr.TACHYGRAM_MESSAGE_ARRIVED, aqdsVar.c);
            aqdsVar.getClass();
            c = qjh.c(a2.a, arpj.a, arwf.a, new wwh(a2, aqdsVar, (arpe) null, 6));
            akul e2 = c.h(new xeu(aqdsVar, 2), andi.a).f(xfg.class, new wkh(this, aqdsVar, 14), this.b).e(aniv.class, new xeu(aqdsVar, 3), this.b).e(Throwable.class, new xeu(aqdsVar, 4), this.b);
            e.b(e2);
            e.close();
            return e2;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
