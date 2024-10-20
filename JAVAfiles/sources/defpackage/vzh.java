package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzh {
    public static final alhr a = uuh.w("enable_xsl_smapi_send_message_method");
    public static final alhr b = uuh.w("enable_xsl_smapi_send_service_chat");
    public static final alhr c = uuh.w("enable_xsl_smapi_update_sent_intent");
    public static final alhr d = uuh.w("enable_xsl_smapi_process_intent_chat");
    public static final alhr e = uuh.w("enable_xsl_smapi_get_incoming_messages");
    public static final alhr f = uuh.w("enable_xsl_smapi_update_incoming_intent");
    private final armf g;
    private final xnv h;
    private final pvw i;

    public vzh(armf armfVar, xnv xnvVar, pvw pvwVar) {
        this.g = armfVar;
        this.h = xnvVar;
        this.i = pvwVar;
    }

    private final void h(aozy aozyVar) {
        maq maqVar = (maq) this.g.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.XSL_REQUEST_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        asgx asgxVar = (asgx) aozyVar.s();
        asgxVar.getClass();
        amfrVar2.aI = asgxVar;
        amfrVar2.e |= 16777216;
        maqVar.j(amfqVar);
    }

    @Deprecated
    public final void a(qgr qgrVar, rve rveVar) {
        g(qgrVar, rveVar, 9, 16);
    }

    public final void b(qgr qgrVar, rve rveVar) {
        g(qgrVar, rveVar, 5, 15);
    }

    public final void c(qgr qgrVar, rve rveVar) {
        g(qgrVar, rveVar, 6, 15);
    }

    public final void d(qgr qgrVar, rve rveVar) {
        g(qgrVar, rveVar, 4, 17);
    }

    public final void e(qgr qgrVar, rve rveVar) {
        g(qgrVar, rveVar, 9, 17);
    }

    public final void f(rve rveVar, int i, int i2) {
        aozy createBuilder = asgx.a.createBuilder();
        if (rve.l(rveVar)) {
            aozy createBuilder2 = asgv.a.createBuilder();
            createBuilder2.bP(rveVar.f());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asgx asgxVar = (asgx) createBuilder.b;
            asgv asgvVar = (asgv) createBuilder2.s();
            asgvVar.getClass();
            asgxVar.d = asgvVar;
            asgxVar.b |= 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).f = atpj.b(23);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).e = a.aq(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).g = arsd.at(i2);
        apct b2 = apds.b(this.h.f().toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        asgx asgxVar2 = (asgx) createBuilder.b;
        b2.getClass();
        asgxVar2.h = b2;
        asgxVar2.b |= 4;
        h(createBuilder);
    }

    public final void g(qgr qgrVar, rve rveVar, int i, int i2) {
        aozy createBuilder = asgx.a.createBuilder();
        if (!qgrVar.equals(qgr.a)) {
            atok atokVar = (atok) this.i.m().fu(qgrVar);
            if (yad.a(atokVar)) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                asgx asgxVar = (asgx) createBuilder.b;
                atokVar.getClass();
                asgxVar.c = atokVar;
                asgxVar.b |= 1;
            } else {
                return;
            }
        }
        if (rve.l(rveVar)) {
            aozy createBuilder2 = asgv.a.createBuilder();
            createBuilder2.bP(rveVar.f());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asgx asgxVar2 = (asgx) createBuilder.b;
            asgv asgvVar = (asgv) createBuilder2.s();
            asgvVar.getClass();
            asgxVar2.d = asgvVar;
            asgxVar2.b |= 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).f = atpj.b(23);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).e = a.aq(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).g = arsd.at(i2);
        apct b2 = apds.b(this.h.f().toEpochMilli());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        asgx asgxVar3 = (asgx) createBuilder.b;
        b2.getClass();
        asgxVar3.h = b2;
        asgxVar3.b |= 4;
        h(createBuilder);
    }
}
