package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acob extends acns {
    public final Context b;

    public acob(Context context, anen anenVar, adtn adtnVar, acnu acnuVar) {
        super(adeo.a, adtnVar, amnn.CARRIER_SERVICES_EVENT_SOURCE_RCS, anenVar, acnuVar);
        this.b = context;
    }

    public static aozy g(int i, String str, Optional optional) {
        aozy createBuilder = aphz.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aphz aphzVar = (aphz) apagVar;
        aphzVar.c = i - 1;
        aphzVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aphz aphzVar2 = (aphz) createBuilder.b;
        str.getClass();
        aphzVar2.b |= 32;
        aphzVar2.h = str;
        optional.ifPresent(new aauv(createBuilder, 16));
        return createBuilder;
    }

    public final acnv d(boolean z, String str) {
        int i;
        if (true != z) {
            i = 4;
        } else {
            i = 5;
        }
        return new acnv(this, str, i);
    }

    public final void e(int i, String str, int i2, Optional optional, Optional optional2) {
        aozy g = g(i, str, optional);
        if (!g.b.isMutable()) {
            g.u();
        }
        aphz aphzVar = (aphz) g.b;
        aphz aphzVar2 = aphz.a;
        aphzVar.f = i2 - 1;
        aphzVar.b |= 8;
        optional2.ifPresent(new abid(g, optional2, 2, null));
        f(g);
    }

    public final void f(aozy aozyVar) {
        aozy c = c(this.b);
        if (c == null) {
            advr.q("Unable to send :s/http/HTTP/ file transfer log. (event is null)", new Object[0]);
            return;
        }
        if (!c.b.isMutable()) {
            c.u();
        }
        amno amnoVar = (amno) c.b;
        aphz aphzVar = (aphz) aozyVar.s();
        amno amnoVar2 = amno.a;
        aphzVar.getClass();
        amnoVar.f = aphzVar;
        amnoVar.e = 37;
        b(this.b, (amno) c.s(), apkj.FILE_TRANSFER_EVENT);
    }

    public acob(Context context, adeo adeoVar, adtn adtnVar, anen anenVar, acnu acnuVar) {
        super(adeoVar, adtnVar, amnn.CARRIER_SERVICES_EVENT_SOURCE_RCS, anenVar, acnuVar);
        this.b = context;
    }
}
