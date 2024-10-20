package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acod implements adtj {
    private final Context a;
    private final adtn b;
    private final acnu c;

    public acod(Context context, adtn adtnVar, acnu acnuVar) {
        this.a = context;
        this.b = adtnVar;
        this.c = acnuVar;
    }

    @Override // defpackage.adtj
    public final void a(aphp aphpVar) {
        if (this.c.c(this.b.k())) {
            return;
        }
        acnu acnuVar = this.c;
        Context context = this.a;
        aozy e = acnuVar.e(context, amnn.CARRIER_SERVICES_EVENT_SOURCE_COMMON);
        aozy createBuilder = aphw.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphw aphwVar = (aphw) createBuilder.b;
        aphpVar.getClass();
        aphwVar.c = aphpVar;
        aphwVar.b = 3;
        aphw aphwVar2 = (aphw) createBuilder.s();
        if (!e.b.isMutable()) {
            e.u();
        }
        amno amnoVar = (amno) e.b;
        amno amnoVar2 = amno.a;
        aphwVar2.getClass();
        amnoVar.f = aphwVar2;
        amnoVar.e = 22;
        acnuVar.b(context, (amno) e.s(), apkj.TELEPHONY_EVENT);
    }

    @Override // defpackage.adtj
    public final void b(aphq aphqVar) {
        if (this.c.c(this.b.k())) {
            return;
        }
        acnu acnuVar = this.c;
        Context context = this.a;
        aozy e = acnuVar.e(context, amnn.CARRIER_SERVICES_EVENT_SOURCE_COMMON);
        aozy createBuilder = aphw.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphw aphwVar = (aphw) createBuilder.b;
        aphqVar.getClass();
        aphwVar.c = aphqVar;
        aphwVar.b = 2;
        aphw aphwVar2 = (aphw) createBuilder.s();
        if (!e.b.isMutable()) {
            e.u();
        }
        amno amnoVar = (amno) e.b;
        amno amnoVar2 = amno.a;
        aphwVar2.getClass();
        amnoVar.f = aphwVar2;
        amnoVar.e = 22;
        acnuVar.b(context, (amno) e.s(), apkj.TELEPHONY_EVENT);
    }

    @Override // defpackage.adtj
    public final void c(apht aphtVar) {
        if (this.c.c(this.b.k())) {
            return;
        }
        acnu acnuVar = this.c;
        Context context = this.a;
        aozy e = acnuVar.e(context, amnn.CARRIER_SERVICES_EVENT_SOURCE_COMMON);
        aozy createBuilder = aphw.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphw aphwVar = (aphw) createBuilder.b;
        aphtVar.getClass();
        aphwVar.c = aphtVar;
        aphwVar.b = 1;
        aphw aphwVar2 = (aphw) createBuilder.s();
        if (!e.b.isMutable()) {
            e.u();
        }
        amno amnoVar = (amno) e.b;
        amno amnoVar2 = amno.a;
        aphwVar2.getClass();
        amnoVar.f = aphwVar2;
        amnoVar.e = 22;
        acnuVar.b(context, (amno) e.s(), apkj.TELEPHONY_EVENT);
    }

    @Override // defpackage.adtj
    public final void d(aphv aphvVar) {
        if (this.c.c(this.b.k())) {
            return;
        }
        acnu acnuVar = this.c;
        Context context = this.a;
        aozy e = acnuVar.e(context, amnn.CARRIER_SERVICES_EVENT_SOURCE_RCS);
        aozy createBuilder = aphw.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aphw aphwVar = (aphw) createBuilder.b;
        aphvVar.getClass();
        aphwVar.c = aphvVar;
        aphwVar.b = 4;
        aphw aphwVar2 = (aphw) createBuilder.s();
        if (!e.b.isMutable()) {
            e.u();
        }
        amno amnoVar = (amno) e.b;
        amno amnoVar2 = amno.a;
        aphwVar2.getClass();
        amnoVar.f = aphwVar2;
        amnoVar.e = 22;
        acnuVar.b(context, (amno) e.s(), apkj.TELEPHONY_EVENT);
    }
}
