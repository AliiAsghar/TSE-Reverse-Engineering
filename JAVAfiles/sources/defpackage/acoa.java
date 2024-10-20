package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acoa {
    private static final acyz a = aczd.a(164466999);
    private final Context b;
    private final adtn c;
    private final acnu d;

    public acoa(Context context, adtn adtnVar, acnu acnuVar) {
        this.b = context;
        this.c = adtnVar;
        this.d = acnuVar;
    }

    public final void a(int i) {
        if (!this.d.c(this.c.k())) {
            aozy createBuilder = apfk.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apfk apfkVar = (apfk) createBuilder.b;
            apfkVar.c = Integer.valueOf(i - 1);
            apfkVar.b = 1;
            if (((Boolean) a.a()).booleanValue()) {
                aozy e = this.d.e(this.b, amnn.CARRIER_SERVICES_EVENT_SOURCE_RCS);
                if (!e.b.isMutable()) {
                    e.u();
                }
                amno amnoVar = (amno) e.b;
                apfk apfkVar2 = (apfk) createBuilder.s();
                amno amnoVar2 = amno.a;
                apfkVar2.getClass();
                amnoVar.f = apfkVar2;
                amnoVar.e = 38;
                this.d.b(this.b, (amno) e.s(), apkj.JIBE_SERVICE_EVENT);
            }
        }
    }
}
