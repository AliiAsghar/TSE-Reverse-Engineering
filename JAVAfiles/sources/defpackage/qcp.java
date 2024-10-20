package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qcp extends unp {
    public static final utz a = uuh.e(uuh.b, "incoming_chat_message_max_retry_count", 5);
    public static final Duration b = Duration.ofSeconds(((Integer) uuh.e(uuh.b, "incoming_chat_message_retry_delay_seconds", 2).e()).intValue());
    private final qdc c;
    private final armf d;

    public qcp(qdc qdcVar, armf armfVar) {
        this.c = qdcVar;
        this.d = armfVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.d(((Integer) a.e()).intValue());
        a2.h(b.toMillis());
        a2.g(gry.EXPONENTIAL);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("IncomingChatMessageRequestHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        qfo qfoVar = (qfo) apbtVar;
        nej nejVar = (nej) this.d.b();
        qgr qgrVar = qfoVar.m;
        if (qgrVar == null) {
            qgrVar = qgr.a;
        }
        nejVar.d(qgrVar, rve.a(qfoVar.g), 22, 9, 5);
        qdc qdcVar = this.c;
        aozy createBuilder = qfp.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfp qfpVar = (qfp) createBuilder.b;
        qfoVar.getClass();
        qfpVar.c = qfoVar;
        qfpVar.b |= 1;
        boolean c = unsVar.c();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfp qfpVar2 = (qfp) createBuilder.b;
        qfpVar2.b |= 2;
        qfpVar2.d = c;
        return qdcVar.a((qfp) createBuilder.s()).h(new psf(19), andi.a);
    }

    @Override // defpackage.unx
    public final apca e() {
        return qfo.b.getParserForType();
    }
}
