package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zes extends xcf {
    public static final xze a = xze.g("Bugle", "BugleStartup");
    public final xyt b;
    private final Context c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final anen g;

    public zes(Context context, armf armfVar, xyt xytVar, armf armfVar2, armf armfVar3, anen anenVar) {
        this.c = context;
        this.d = armfVar;
        this.b = xytVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = anenVar;
    }

    @Override // defpackage.xny
    public final akrh a() {
        return aktp.e("PhoneAsyncPermissionsStartupTask");
    }

    @Override // defpackage.xcf
    public final akul b() {
        try {
            xze xzeVar = a;
            xzeVar.o("Registering SIM change receiver...");
            akrh e = aktp.e("PhoneAsyncPermissionsStartupTask#registerSimChangeReceiverAndUpdateAppConfig");
            try {
                epw.a(this.c).b(new wmn(), adtr.s());
                if (((yjv) this.e.b()).e()) {
                    xzeVar.o("Updating app config...");
                    ((wlb) this.f.b()).a();
                }
                xzeVar.o("Done with SIM change receiver & app config.");
                e.close();
            } finally {
            }
        } catch (RuntimeException e2) {
            a.r("Failed to register SIM change receiver.", e2);
        }
        a.o("Handling shared prefs upgrade & Load MMS Configuration...");
        final lzt lztVar = (lzt) this.d.b();
        return aktp.ah(new Runnable() { // from class: lzr
            @Override // java.lang.Runnable
            public final void run() {
                akrh e3 = aktp.e("SharedAsyncPermissionsStartupTask#initializeDataModelMmsLibSimInfoProviderAndCsLibFlags");
                final lzt lztVar2 = lzt.this;
                try {
                    if (((yjv) lztVar2.d.b()).e()) {
                        ubl ublVar = (ubl) lztVar2.i.b();
                        qzj qzjVar = (qzj) ublVar.e.b();
                        uie uieVar = (uie) qzjVar.a.b();
                        uieVar.getClass();
                        agnq agnqVar = (agnq) qzjVar.b.b();
                        agnqVar.getClass();
                        xnv xnvVar = (xnv) qzjVar.d.b();
                        xnvVar.getClass();
                        armf armfVar = qzjVar.f;
                        new FixupMessageStatusOnStartupAction(uieVar, agnqVar, qzjVar.c, xnvVar, qzjVar.e, armfVar).F(Action.r);
                        rje.a();
                        if (ublVar.d()) {
                            if (((Boolean) ((utz) wzp.a.get()).e()).booleanValue()) {
                                ((wzp) ublVar.d.b()).l(amvm.DATA_MODEL_INIT_MICRO_APP);
                            } else {
                                ((wzp) ublVar.d.b()).h();
                            }
                        }
                        ((yaq) ublVar.b.a()).i(new ubk(ublVar));
                        ublVar.j.post(new rui(ublVar, 9));
                        lztVar2.b.registerReceiver((BroadcastReceiver) lztVar2.k.b(), new IntentFilter("android.telephony.action.CARRIER_CONFIG_CHANGED"), 2);
                    }
                    akrh e4 = aktp.e("SharedAsyncPermissionsStartupTask#initializeSimInfoProviderAndCsLibFlags");
                    try {
                        ((adtl) lztVar2.h.b()).i();
                        aczc.m();
                        ((wvv) lztVar2.j.b()).a();
                        e4.close();
                        final int d = ((ykw) lztVar2.c.b()).d("shared_preferences_version", -1);
                        int parseInt = Integer.parseInt(lztVar2.b.getString(R.string.pref_version));
                        if (parseInt > d) {
                            alvw g = lzt.a.g();
                            g.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/SharedAsyncPermissionsStartupTask", "maybeHandleSharedPrefsUpgrade", 123, "SharedAsyncPermissionsStartupTask.java")).u("Upgrading shared prefs from %d to %d", d, parseInt);
                            try {
                                ((ykw) lztVar2.c.b()).c(d);
                                ((yjy) lztVar2.e.b()).n(new yjx() { // from class: lzs
                                    @Override // defpackage.yjx
                                    public final boolean a(int i) {
                                        ((zxy) lzt.this.f.b()).x(i).c(d);
                                        return true;
                                    }
                                });
                                ((ykw) lztVar2.c.b()).j("shared_preferences_version", parseInt);
                            } catch (Exception e5) {
                                alvw h = lzt.a.h();
                                h.X(alwp.a, "Bugle");
                                ((alvg) ((alvg) ((alvg) h).g(e5)).h("com/google/android/apps/messaging/shared/SharedAsyncPermissionsStartupTask", "maybeHandleSharedPrefsUpgrade", (char) 143, "SharedAsyncPermissionsStartupTask.java")).q("Failed to upgrade shared prefs");
                            }
                        } else if (parseInt < d) {
                            alvw h2 = lzt.a.h();
                            h2.X(alwp.a, "Bugle");
                            ((alvg) ((alvg) h2).h("com/google/android/apps/messaging/shared/SharedAsyncPermissionsStartupTask", "maybeHandleSharedPrefsUpgrade", 148, "SharedAsyncPermissionsStartupTask.java")).u("Shared prefs downgrade requested and ignored. oldVersion = %d, newVersion = %d", d, parseInt);
                        }
                        e3.close();
                    } finally {
                    }
                } finally {
                }
            }
        }, lztVar.g).h(new zet(this, 1), this.g);
    }

    @Override // defpackage.xck
    public final boolean fI() {
        return true;
    }
}
