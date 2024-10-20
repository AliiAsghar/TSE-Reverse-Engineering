package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.adub;
import defpackage.agui;
import defpackage.ahta;
import defpackage.ahuv;
import defpackage.ahux;
import defpackage.albo;
import defpackage.ancj;
import defpackage.anee;
import defpackage.aocu;
import defpackage.xrd;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (!stringExtra.contains("../") && !stringExtra.contains("/..")) {
                ahta a = ahta.a(context);
                if (a == null) {
                    ahta.e();
                    albo.T(false);
                    return;
                }
                Map a2 = ahuv.a(context);
                if (!a2.isEmpty()) {
                    ahuv ahuvVar = (ahuv) a2.get(stringExtra);
                    if (ahuvVar != null && ahuvVar.b.equals(aocu.PROCESS_STABLE)) {
                        BroadcastReceiver.PendingResult goAsync = goAsync();
                        anee p = ((anee) ancj.g(anee.o(ancj.f(anee.o(ahux.b(a).a()), new agui(stringExtra, 7), a.d())), new xrd((Object) ahuvVar, stringExtra, (Object) a, 12), a.d())).p(25L, TimeUnit.SECONDS, a.d());
                        p.c(new adub(p, stringExtra, goAsync, 5, (char[]) null), a.d());
                        return;
                    }
                    Log.i("PhenotypeBackgroundRecv", a.bW(stringExtra, "Skipping ", " which doesn't use ProcessStable flags."));
                    return;
                }
                return;
            }
            Log.w("PhenotypeBackgroundRecv", a.bW(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
        }
    }
}
