package com.google.android.apps.messaging.rcsprovisioning;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.akrc;
import defpackage.akrh;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amww;
import defpackage.aozy;
import defpackage.armd;
import defpackage.armf;
import defpackage.ldx;
import defpackage.lsi;
import defpackage.oqv;
import defpackage.oqz;
import defpackage.pbx;
import defpackage.qiu;
import defpackage.uof;
import defpackage.upk;
import defpackage.vpq;
import defpackage.vyv;
import defpackage.wjr;
import defpackage.wkq;
import defpackage.xti;
import defpackage.xtj;
import defpackage.xyo;
import defpackage.xyp;
import defpackage.xze;
import defpackage.yhx;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsProvisioningBroadcastReceiver extends lsi {
    private static final xze k = xze.g("Bugle", "RcsProvisioningBroadcastReceiver");
    private static final alvi l = alvi.m("com/google/android/apps/messaging/rcsprovisioning/RcsProvisioningBroadcastReceiver");
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    public armf e;
    public armf f;
    public armf g;
    public armf h;
    public armf i;
    public armf j;

    private static String m(Intent intent) {
        return o(intent, RcsIntents.EXTRA_PREVIOUS_SIM_ID);
    }

    private static String n(Intent intent) {
        return o(intent, RcsIntents.EXTRA_SIM_ID);
    }

    private static String o(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return "";
        }
        return Objects.toString(extras.getString(str), "");
    }

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.a.b()).b("RcsProvisioningBroadcastReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.Provisioning.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 17;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.Provisioning.Latency";
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [armf, java.lang.Object] */
    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            if (!((pbx) this.h.b()).a() && RcsIntents.ACTION_CSAPK_INITIALIZED.equals(action)) {
                xti xtiVar = (xti) this.c.b();
                akrh e = aktp.e("ChatTransportControllerDefaultSimAdapter#kickOffUpdateActiveTransport");
                try {
                    ((xtj) xtiVar.a.b()).s();
                    armd.i(e, null);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        armd.i(e, th);
                        throw th2;
                    }
                }
            }
            if (RcsIntents.ACTION_RCS_CONFIG_REFRESH.equals(action)) {
                ((wjr) this.b.b()).e(n(intent), Duration.ZERO, amww.CSLIB_PHENOTYPE_UPDATE);
                return;
            }
            if (((oqz) this.i.b()).a() && action.equals("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING")) {
                if (yhx.h) {
                    ((vpq) this.e.b()).g(intent.getIntExtra("sub_id", -1));
                    return;
                }
                alvw g = l.g();
                g.X(alwp.a, "Bugle");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/rcsprovisioning/RcsProvisioningBroadcastReceiver", "handleIntentProcessing", 149, "RcsProvisioningBroadcastReceiver.java")).q("RCS Provisioning cannot be scheduled for Fi sim with this intent because it is not supported on SDK versions less than U");
                return;
            }
            if (RcsIntents.ACTION_RCS_CANCEL_PROVISIONING_WORK.equals(action)) {
                ((wjr) this.b.b()).a(amww.CSLIB_PHENOTYPE_UPDATE).k(qiu.b(), (Executor) this.d.b());
                return;
            }
            if (RcsIntents.ACTION_RCS_SIM_SWAP.equals(action)) {
                ((vpq) this.e.b()).l(m(intent), n(intent));
                return;
            }
            if (action.equals(RcsIntents.ACTION_DEFAULT_VOICE_SIM_REMOVED)) {
                ((vpq) this.e.b()).k(m(intent));
                return;
            }
            if (RcsIntents.ACTION_RCS_RECONFIGURATION_REQUIRED.equals(action)) {
                ((vpq) this.e.b()).j(amww.SIP_403_RESPONSE);
                return;
            }
            if (RcsIntents.ACTION_RCS_SYSTEM_BINDING.equals(action)) {
                Collection.EL.forEach((Set) this.g.b(), new ldx(13));
                return;
            }
            if (action.equals(RcsIntents.ACTION_JIBE_DEPROVISION)) {
                xyo c = k.c();
                c.H("[SR]: Enqueueing UnregisterGoogleRcs Work Handler.");
                c.q();
                vyv vyvVar = (vyv) this.f.b();
                aozy createBuilder = wkq.a.createBuilder();
                int intExtra = intent.getIntExtra(RcsIntents.EXTRA_SUB_ID, -1);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wkq wkqVar = (wkq) createBuilder.b;
                wkqVar.b |= 1;
                wkqVar.c = intExtra;
                String n = n(intent);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wkq wkqVar2 = (wkq) createBuilder.b;
                n.getClass();
                wkqVar2.b |= 2;
                wkqVar2.d = n;
                ((uof) vyvVar.a.b()).a(upk.a("unregister_google_rcs_call", (wkq) createBuilder.s()));
                return;
            }
            if (action.equals(RcsIntents.ACTION_RCS_SIM_REMOVED)) {
                ((vpq) this.e.b()).k(m(intent));
            }
        }
    }

    @Override // defpackage.wna
    protected final boolean h(Context context, Intent intent) {
        String sentFromPackage;
        if (((oqz) this.i.b()).a() && ((oqv) this.j.b()).a()) {
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return false;
            }
            if (action.equals("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING") && yhx.h) {
                if (!xyp.h() && ((sentFromPackage = getSentFromPackage()) == null || !sentFromPackage.equals("com.google.android.apps.tycho"))) {
                    return false;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("acknowledged_broadcast", true);
                setResultExtras(bundle);
            }
        }
        return true;
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }
}
