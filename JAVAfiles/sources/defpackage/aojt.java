package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aojt implements aokc {
    private static final alwo a = alwo.o("xRPC");
    private final armf b;

    public aojt(armf armfVar) {
        this.b = armfVar;
    }

    @Override // defpackage.aokc
    public final aqrs a(aokb aokbVar) {
        boolean z;
        aiut.b();
        try {
            aqyv j = aqyv.j(aokbVar.b(), aokbVar.a(), (CronetEngine) this.b.b());
            String str = aokbVar.g;
            if (str == null) {
                str = new CronetEngine.Builder(aokbVar.b).getDefaultUserAgent();
            }
            j.i(str);
            j.e(aokbVar.e);
            j.h(aokbVar.d);
            j.f(aokbVar.k, TimeUnit.MILLISECONDS);
            int i = aokbVar.l;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            d.t(z, "maxMessageSize must be >= 0");
            j.c = i;
            ScheduledExecutorService scheduledExecutorService = aokbVar.f;
            if (scheduledExecutorService != null) {
                j.a = scheduledExecutorService;
            }
            Integer num = aokbVar.i;
            if (num != null) {
                int intValue = num.intValue();
                j.f = true;
                j.g = intValue;
            }
            Integer num2 = aokbVar.j;
            if (num2 != null) {
                j.k(num2.intValue());
            }
            return apsd.r(j.a(), new agqt(new arll(aokbVar.h, 1)));
        } catch (IllegalStateException | UnsatisfiedLinkError e) {
            ((alwl) ((alwl) ((alwl) a.h()).g(e)).h("com/google/frameworks/client/data/android/CronetWithOkHttpFallbackTransport", "getTransportChannel", '\'', "CronetWithOkHttpFallbackTransport.java")).q("Failed to load Cronet, falling back on OkHttp implementation");
            ariy ariyVar = new ariy(aokbVar.b(), aokbVar.a());
            ariyVar.e(aokbVar.e);
            ariyVar.m(aokbVar.d);
            ariyVar.h(aokbVar.d);
            ariyVar.f(aokbVar.k, TimeUnit.MILLISECONDS);
            ariyVar.k(aokbVar.m, TimeUnit.MILLISECONDS);
            ariyVar.l(aokbVar.m, TimeUnit.MILLISECONDS);
            ScheduledExecutorService scheduledExecutorService2 = aokbVar.f;
            if (scheduledExecutorService2 != null) {
                ariyVar.d = new arhm(scheduledExecutorService2, 1);
            }
            String str2 = aokbVar.g;
            if (str2 != null) {
                ariyVar.i(str2);
            }
            return apsd.r(ariyVar.a(), new arll(aokbVar.h, 1));
        }
    }
}
