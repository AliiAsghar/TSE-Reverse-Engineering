package defpackage;

import android.content.Context;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acof extends acns {
    public static final acyz b = acyy.b("enable_xsl_rcs_messaging_send_message");
    private final Context c;

    public acof(Context context, adeo adeoVar, adtn adtnVar, anen anenVar, acnu acnuVar) {
        super(adeoVar, adtnVar, amnn.CARRIER_SERVICES_EVENT_SOURCE_RCS, anenVar, acnuVar);
        this.c = context;
    }

    public final void d(atok atokVar, String str) {
        f(atokVar, str, 8);
    }

    public final void e(atok atokVar, String str) {
        f(atokVar, str, 7);
    }

    public final void f(atok atokVar, String str, int i) {
        aozy createBuilder = asgx.a.createBuilder();
        aozy createBuilder2 = asgv.a.createBuilder();
        createBuilder2.bP(str);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        asgx asgxVar = (asgx) createBuilder.b;
        asgv asgvVar = (asgv) createBuilder2.s();
        asgvVar.getClass();
        asgxVar.d = asgvVar;
        asgxVar.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).f = atpj.b(24);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).e = a.aq(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((asgx) createBuilder.b).g = arsd.at(21);
        apct b2 = apds.b(agkx.W().longValue());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        asgx asgxVar2 = (asgx) createBuilder.b;
        b2.getClass();
        asgxVar2.h = b2;
        asgxVar2.b |= 4;
        if (!atokVar.equals(atok.a)) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            asgx asgxVar3 = (asgx) createBuilder.b;
            atokVar.getClass();
            asgxVar3.c = atokVar;
            asgxVar3.b |= 1;
        }
        asgx asgxVar4 = (asgx) createBuilder.s();
        aozy c = c(this.c);
        if (c == null) {
            advr.q("Unable to send RCS extension log", new Object[0]);
            return;
        }
        if ((asgxVar4.b & 1) != 0) {
            atok atokVar2 = asgxVar4.c;
            if (atokVar2 == null) {
                atokVar2 = atok.a;
            }
            double doubleValue = aczf.p().doubleValue();
            if (doubleValue < 1.0d && (doubleValue <= 0.0d || atokVar2 == null || Math.abs(UUID.fromString(atokVar2.b).hashCode()) > ((int) (doubleValue * 2.147483647E9d)))) {
                return;
            }
        }
        if (!c.b.isMutable()) {
            c.u();
        }
        amno amnoVar = (amno) c.b;
        amno amnoVar2 = amno.a;
        asgxVar4.getClass();
        amnoVar.f = asgxVar4;
        amnoVar.e = 39;
        b(this.c, (amno) c.s(), apkj.XSL_REQUEST_EVENT);
    }
}
