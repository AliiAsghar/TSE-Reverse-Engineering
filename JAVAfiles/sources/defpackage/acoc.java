package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acoc extends acns {
    public acoc(adeo adeoVar, adtn adtnVar, anen anenVar, acnu acnuVar) {
        super(adeoVar, adtnVar, amnn.CARRIER_SERVICES_EVENT_SOURCE_RCS, anenVar, acnuVar);
    }

    public final void d(Context context, apfd apfdVar) {
        aozy c = c(context);
        if (c == null) {
            advr.q("Unable to send RCS extension log", new Object[0]);
            return;
        }
        if (!c.b.isMutable()) {
            c.u();
        }
        amno amnoVar = (amno) c.b;
        amno amnoVar2 = amno.a;
        apfdVar.getClass();
        amnoVar.f = apfdVar;
        amnoVar.e = 33;
        b(context, (amno) c.s(), apkj.IMS_SERVICE_SESSION_EVENT);
    }

    public final void e(Context context, apfh apfhVar) {
        aozy createBuilder = apkr.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apkr apkrVar = (apkr) createBuilder.b;
        apfhVar.getClass();
        apkrVar.d = apfhVar;
        apkrVar.c = 11;
        i(context, createBuilder, apkj.INCOMING_RPC_EVENT);
    }

    public final void f(Context context, apfo apfoVar) {
        aozy createBuilder = apkr.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apkr apkrVar = (apkr) createBuilder.b;
        apfoVar.getClass();
        apkrVar.d = apfoVar;
        apkrVar.c = 10;
        i(context, createBuilder, apkj.MSRP_EVENT);
    }

    public final void g(Context context, apfw apfwVar, apfy apfyVar) {
        aozy createBuilder = apkr.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apkr apkrVar = (apkr) apagVar;
        apfwVar.getClass();
        apkrVar.e = apfwVar;
        apkrVar.b |= 4;
        if (apfyVar != null) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apkr apkrVar2 = (apkr) createBuilder.b;
            apkrVar2.d = apfyVar;
            apkrVar2.c = 6;
        }
        i(context, createBuilder, apkj.SELF_SERVICE_MESSAGE_EVENT);
    }

    public final void h(Context context, apgv apgvVar) {
        aozy createBuilder = apkr.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apkr apkrVar = (apkr) createBuilder.b;
        apgvVar.getClass();
        apkrVar.d = apgvVar;
        apkrVar.c = 13;
        i(context, createBuilder, apkj.SINGLE_REGISTRATION_API_CALL_EVENT);
    }

    public final void i(Context context, aozy aozyVar, apkj apkjVar) {
        aozy c = c(context);
        if (c == null) {
            advr.q("Unable to send RCS extension log", new Object[0]);
            return;
        }
        if (!c.b.isMutable()) {
            c.u();
        }
        amno amnoVar = (amno) c.b;
        apkr apkrVar = (apkr) aozyVar.s();
        amno amnoVar2 = amno.a;
        apkrVar.getClass();
        amnoVar.f = apkrVar;
        amnoVar.e = 18;
        b(context, (amno) c.s(), apkjVar);
    }
}
