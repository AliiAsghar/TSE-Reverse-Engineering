package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpp implements uvn {
    private final adtn c;
    private final anen d;
    private final znp e;
    private static final alvi b = alvi.m("com/google/android/apps/messaging/fi/FiFeedbackDataProvider");
    public static final uuf a = uuh.f(uuh.b, "fi_psd_client_timeout_ms", 5000);

    public kpp(Context context, adtn adtnVar, anen anenVar, anen anenVar2) {
        this.e = new znp(context, (ExecutorService) anenVar);
        this.c = adtnVar;
        this.d = anenVar2;
    }

    public final /* synthetic */ List a() {
        try {
            znp znpVar = this.e;
            return (List) znpVar.e(new abia(znpVar, 1), Duration.ofMillis(((Long) a.e()).longValue()));
        } catch (abig e) {
            ((alvg) ((alvg) ((alvg) b.i()).g(e)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsbdData", 'q', "FiFeedbackDataProvider.java")).q("Failed to load Fi PSBD");
            return new ArrayList();
        } catch (InterruptedException e2) {
            ((alvg) ((alvg) ((alvg) b.i()).g(e2)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsbdData", 'u', "FiFeedbackDataProvider.java")).q("Interrupted while loading Fi PSBD");
            return new ArrayList();
        } catch (TimeoutException e3) {
            ((alvg) ((alvg) ((alvg) b.i()).g(e3)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsbdData", 's', "FiFeedbackDataProvider.java")).q("Timeout while loading Fi PSBD");
            return new ArrayList();
        }
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul b() {
        return uvl.b();
    }

    @Override // defpackage.uvn
    public final akul c() {
        if (!this.c.u()) {
            int i = alog.d;
            return aktp.ag(alsx.a);
        }
        return aktp.ai(new gvk(this, 17), this.d);
    }

    @Override // defpackage.uvn
    public final akul d() {
        if (!this.c.u()) {
            int i = alog.d;
            return aktp.ag(alsx.a);
        }
        return aktp.ai(new gvk(this, 18), this.d);
    }

    public final /* synthetic */ List e() {
        try {
            znp znpVar = this.e;
            return (List) Collection.EL.stream((List) znpVar.e(new abia(znpVar, 0), Duration.ofMillis(((Long) a.e()).longValue()))).map(new koa(3)).collect(Collectors.toCollection(new ijk(13)));
        } catch (abig e) {
            ((alvg) ((alvg) ((alvg) b.i()).g(e)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsdData", 'J', "FiFeedbackDataProvider.java")).q("Failed to load Fi PSD");
            return new ArrayList();
        } catch (InterruptedException e2) {
            ((alvg) ((alvg) ((alvg) b.i()).g(e2)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsdData", 'N', "FiFeedbackDataProvider.java")).q("Interrupted while loading Fi PSD");
            return new ArrayList();
        } catch (TimeoutException e3) {
            ((alvg) ((alvg) ((alvg) b.i()).g(e3)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsdData", 'L', "FiFeedbackDataProvider.java")).q("Timeout while loading Fi PSD");
            return new ArrayList();
        }
    }
}
