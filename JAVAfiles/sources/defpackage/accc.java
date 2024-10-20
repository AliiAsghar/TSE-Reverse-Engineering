package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accc extends BroadcastReceiver {
    final /* synthetic */ acce a;

    public accc(acce acceVar) {
        this.a = acceVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        acce acceVar = this.a;
        acceVar.b = false;
        Set<acby> aE = aqjn.aE(acceVar.a);
        zfm zfmVar = acce.n;
        Objects.toString(aE);
        zfmVar.g("Re-registering listeners: ".concat(aE.toString()));
        ArrayList arrayList = new ArrayList(aqjn.J(aE, 10));
        for (acby acbyVar : aE) {
            acbyVar.getClass();
            acceVar.a.remove(acbyVar);
            arrayList.add(acceVar.w(new zwj(acceVar, acbyVar, 18), accd.a));
        }
        actx.t(arrayList).c(new acdl(acceVar, 1)).d(andi.a, new abpk(aE, acceVar, 3)).b(andi.a, new acca(0));
    }
}
