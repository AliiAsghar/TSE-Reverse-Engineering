package defpackage;

import android.content.Context;
import com.google.android.libraries.communications.mobileconfiguration.sync.CleanupWorker;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aegy implements aegz {
    public static final alvi a = alvi.m("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi");
    public final anen b;
    public final anen c;
    public final aehw d;
    public final aehm e;
    public final vco f;
    private final Context g;
    private final aeha h;

    public aegy(Context context, anen anenVar, anen anenVar2, aehm aehmVar, aeha aehaVar, vco vcoVar, aehw aehwVar) {
        this.g = context;
        this.b = anenVar;
        this.c = anenVar2;
        this.e = aehmVar;
        this.h = aehaVar;
        this.f = vcoVar;
        this.d = aehwVar;
    }

    @Override // defpackage.aegz
    public final Optional a(String str) {
        return this.h.a(str);
    }

    @Override // defpackage.aegz
    public final void b() {
        ((alvg) ((alvg) a.g()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "forceSyncConfigurations", 148, "MobileConfigurationApi.java")).q("MobileConfigurationApi: force sync mobile configuration");
        if (aqnl.c(this.g)) {
            anen anenVar = this.b;
            aehm aehmVar = this.e;
            aehmVar.getClass();
            ListenableFuture g = ancj.g(anenVar.submit(new aaze(aehmVar, 8)), new ahce(this, 1), this.b);
            c(g, "MobileConfigurationApi: force sync failed to reset config validities");
            g.c(new aefw(this.d, 2), this.c);
            return;
        }
        this.d.a();
    }

    public final void c(ListenableFuture listenableFuture, String str) {
        albo.bR(listenableFuture, new adnx(str, 5), this.c);
    }

    @Override // defpackage.aegz
    public final void d(alor alorVar) {
        albo.bR(anee.o(this.b.submit(new aakf(this, alorVar, 17, null))), new pum(14), this.c);
        Context context = this.g;
        gtm ar = gvf.ar(context);
        if (aqnl.a.get().i(context)) {
            gsd gsdVar = new gsd();
            gsdVar.a = true;
            gsf a2 = gsdVar.a();
            gtg gtgVar = new gtg(CleanupWorker.class, aqnl.a.get().b(context), TimeUnit.SECONDS);
            gtgVar.f(a2);
            gtgVar.e(gry.LINEAR, aqnl.a.get().d(context), TimeUnit.SECONDS);
            gtgVar.c("CLEANUP");
            ar.j("CLEANUP", 2, gtgVar.j());
            return;
        }
        ar.a("CLEANUP");
    }
}
