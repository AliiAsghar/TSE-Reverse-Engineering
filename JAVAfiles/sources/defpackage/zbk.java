package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.telephony.ims.ProvisioningManager;
import android.telephony.ims.RcsClientConfiguration;
import com.google.android.ims.provisioning.config.Configuration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbk {
    public final int a;
    public final Object b;
    public final Object c;
    public Object d;
    private final Object e;
    private final Object f;

    public zbk(adej adejVar, adii adiiVar, adnk adnkVar, String str, int i) {
        this.c = adejVar;
        this.b = adiiVar;
        this.f = adnkVar;
        this.e = str;
        this.a = i;
    }

    private final synchronized boolean k(String str) {
        if (this.d != null) {
            Configuration f = ((adnk) this.f).f(str);
            if (f.c().B && f.p()) {
                advr.k("[SR]: Callback is already registered and valid configuration exists for subId: %s", Integer.valueOf(this.a));
                return true;
            }
            Object obj = this.d;
            obj.getClass();
            if (!((adip) obj).d.get()) {
                advr.k("[SR]: Callback is already registered, however the configuration was not received yet for subId: %s", Integer.valueOf(this.a));
                return true;
            }
        }
        return false;
    }

    public final void a() {
        ijp.e((ijp) this.b, 10, 0, this.a, 10);
    }

    public final void b() {
        ijp.e((ijp) this.b, 13, 0, this.a, 10);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [armf, java.lang.Object] */
    public final void c(boolean z) {
        if (z) {
            ((ijp) this.b).d(10, this.a);
            ((ahqr) this.e.b()).g(yci.l, null, ahqp.SUCCESS);
            ((ahqr) this.e.b()).e(yci.m);
            return;
        }
        ((ahqr) this.e.b()).g(yci.l, null, ahqp.CANCEL);
    }

    public final void d() {
        ijp.e((ijp) this.b, 8, 0, this.a, 10);
        g(false);
    }

    public final void e() {
        Object obj = this.d;
        if (obj != null) {
            ((mdg) obj).a();
        }
    }

    public final void f(boolean z) {
        ((ijp) this.b).d(7, this.a);
        c(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    public final void g(boolean z) {
        ahqp ahqpVar;
        if (!((osb) this.f.b()).a()) {
            return;
        }
        if (z) {
            ahqpVar = ahqp.SUCCESS;
        } else {
            ahqpVar = ahqp.CANCEL;
        }
        ((ahqr) this.e.b()).g(yci.k, null, ahqpVar);
        ((ahqr) this.e.b()).g(yci.m, null, ahqpVar);
    }

    final synchronized adip h(adip adipVar) {
        Object obj;
        obj = this.d;
        this.d = adipVar;
        return (adip) obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, adii] */
    public final synchronized void i() {
        adip h = h(null);
        if (h == null) {
            advr.k("[SR]: No active AOSP callback found for subId: %s", Integer.valueOf(this.a));
        } else {
            this.b.a(this.a).unregisterRcsProvisioningCallback(h);
            advr.k("[SR]: Terminated AOSP callback for subId: %s", Integer.valueOf(this.a));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, adii] */
    public final synchronized void j(apuv apuvVar) {
        if (k((String) this.e)) {
            return;
        }
        ?? r0 = this.b;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        ProvisioningManager a = r0.a(i);
        Context context = (Context) ((adej) obj).e.b();
        adnk adnkVar = (adnk) ((adej) obj).d.b();
        adnb adnbVar = (adnb) ((adej) obj).b.b();
        adko adkoVar = (adko) ((adej) obj).a.b();
        adin adinVar = (adin) ((adej) obj).c.b();
        adinVar.getClass();
        adip h = h(new adip(context, adnkVar, adnbVar, adkoVar, apuvVar, (String) obj2, i, adinVar));
        if (h != null) {
            a.unregisterRcsProvisioningCallback(h);
        }
        advr.k("[SR]: Initializing AOSP callback for subId: %s", Integer.valueOf(this.a));
        String t = aczf.t();
        String s = aczf.s();
        String q = aczf.q();
        String r = aczf.r();
        advr.c("[SR]: RcsClientConfiguration: rcs_version[%s], rcs_profile[%s], client_vendor[%s], single_reg_client_version[%s]", t, s, q, r);
        a.setRcsClientConfiguration(new RcsClientConfiguration(t, s, q, r));
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Object obj3 = this.d;
        obj3.getClass();
        a.registerRcsProvisioningCallback(newSingleThreadExecutor, (ProvisioningManager.RcsProvisioningCallback) obj3);
        advr.k("[SR]: AOSP callback registered for subId: %s", Integer.valueOf(this.a));
    }

    public zbk(ijp ijpVar, mgu mguVar, eog eogVar, armf armfVar, armf armfVar2) {
        int Y;
        ijpVar.getClass();
        mguVar.getClass();
        eogVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.b = ijpVar;
        this.c = mguVar;
        this.e = armfVar;
        this.f = armfVar2;
        Bundle bundle = (Bundle) eogVar.a("startchat_logger_bundle");
        Integer num = (Integer) eogVar.a("contact_picker_source");
        if (bundle != null) {
            Y = a.Y(bundle.getInt("contact_picker_source"));
        } else {
            Y = num != null ? a.Y(num.intValue()) : 0;
        }
        this.a = Y == 0 ? 1 : Y;
    }
}
