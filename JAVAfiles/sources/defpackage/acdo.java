package defpackage;

import android.content.Context;
import com.google.android.gms.location.CurrentLocationRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdo extends abrc implements acdd {
    public static final aaoc a;
    static final abmt b;

    static {
        abmt abmtVar = new abmt();
        b = abmtVar;
        a = new aaoc("LocationServices.API", new acdm(), abmtVar);
    }

    public acdo(Context context) {
        super(context, a, abqy.q, abrb.a);
    }

    @Override // defpackage.acdd
    public final acir a(int i) {
        acdb acdbVar = new acdb();
        acdbVar.c(i);
        return c(acdbVar.a(), null);
    }

    @Override // defpackage.acdd
    public final void b(acde acdeVar) {
        h(abhb.f(acdeVar, "acde"), 2418).b(new sp(14), new acca(2));
    }

    @Override // defpackage.acdd
    public final acir c(CurrentLocationRequest currentLocationRequest, adae adaeVar) {
        if (adaeVar != null) {
            d.t(!((aciv) adaeVar.a).k(), "cancellationToken may not be already canceled");
        }
        ajxp ajxpVar = new ajxp(null);
        int i = 0;
        ajxpVar.c = new acdk(currentLocationRequest, adaeVar, i, null);
        ajxpVar.b = 2415;
        acir g = g(ajxpVar.b());
        if (adaeVar != null) {
            acit acitVar = new acit(adaeVar);
            g.a(new acdl(acitVar, i));
            return (acir) acitVar.a;
        }
        return g;
    }
}
