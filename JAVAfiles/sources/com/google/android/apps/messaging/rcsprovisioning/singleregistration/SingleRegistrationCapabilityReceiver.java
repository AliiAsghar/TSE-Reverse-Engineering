package com.google.android.apps.messaging.rcsprovisioning.singleregistration;

import android.content.Context;
import android.content.Intent;
import defpackage.aczf;
import defpackage.adim;
import defpackage.adtl;
import defpackage.advr;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.alvg;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.amww;
import defpackage.aphg;
import defpackage.armf;
import defpackage.kut;
import defpackage.lsk;
import defpackage.lsm;
import defpackage.lsn;
import defpackage.lso;
import defpackage.lta;
import defpackage.mhp;
import defpackage.qiu;
import defpackage.utt;
import defpackage.vei;
import defpackage.vrk;
import defpackage.vrn;
import defpackage.wjr;
import defpackage.xyt;
import defpackage.yll;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SingleRegistrationCapabilityReceiver extends lsk {
    public armf a;
    public armf b;
    public armf c;
    public armf d;
    public armf e;
    public armf f;
    public armf g;
    public armf h;
    public armf i;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.a.b()).b("SingleRegistrationCapabilityReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.SingleRegistrationCapabilityReceiver.Latency";
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        int i;
        String str;
        boolean z;
        boolean z2;
        int i2 = 0;
        advr.k("[SR]: Single Registration Capability Intent received!", new Object[0]);
        try {
            lsm.a(intent, "android.telephony.ims.action.RCS_SINGLE_REGISTRATION_CAPABILITY_UPDATE");
            lsm.b(intent, "android.telephony.ims.extra.STATUS");
            lsm.b(intent, "android.telephony.ims.extra.SUBSCRIPTION_ID");
            int intExtra = intent.getIntExtra("android.telephony.ims.extra.SUBSCRIPTION_ID", 0);
            int i3 = 1;
            int intExtra2 = intent.getIntExtra("android.telephony.ims.extra.STATUS", 1);
            if (intExtra2 != 0) {
                if (intExtra2 != 1) {
                    if (intExtra2 != 2) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
            alvw d = lsn.a.d();
            d.X(alwp.a, "BugleRcsEngine");
            alvg alvgVar = (alvg) ((alvg) d).h("com/google/android/apps/messaging/rcsprovisioning/singleregistration/SingleRegistrationCapabilityInfo", "fromIntent", 53, "SingleRegistrationCapabilityInfo.java");
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "STATUS_CARRIER_NOT_CAPABLE";
                    } else {
                        str = "STATUS_DEVICE_NOT_CAPABLE";
                    }
                } else {
                    str = "STATUS_CAPABLE";
                }
            } else {
                str = "STATUS_UNKNOWN";
            }
            alvgVar.w("[SR]: Received intent with subId: %d and status: %s", intExtra, str);
            if (i != 2) {
                z = false;
            } else {
                z = true;
            }
            lsn lsnVar = new lsn(intExtra, i, z);
            int a = ((adtl) this.d.b()).a(context);
            if (a == lsnVar.b) {
                z2 = true;
            } else {
                z2 = false;
            }
            ((adim) this.f.b()).b(lsnVar.d, z2, !aczf.H());
            if (!z2) {
                advr.q("[SR]: The subscriptionId in the received ACTION_RCS_SINGLE_REGISTRATION_CAPABILITY_UPDATE intent: %d is different than the Call SIM's subscriptionId: %d. The provisioning process will not be started.", Integer.valueOf(lsnVar.b), Integer.valueOf(a));
                return;
            }
            ((utt) this.h.b()).b(context, yll.PHENOTYPE_REGISTRATION_TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE);
            ((vrn) ((xyt) this.c.b()).a()).o(vrk.SINGLE_REGISTRATION_CAPABILITY_UPDATE);
            if (lsnVar.c) {
                int i4 = lsnVar.b;
                qiu.h(((wjr) this.g.b()).a(amww.SINGLE_REGISTRATION_CAPABILITY_UPDATE).i(new mhp(this, i4, i3), (Executor) this.b.b()));
            } else {
                int i5 = lsnVar.b;
                lta ltaVar = (lta) this.e.b();
                aphg aphgVar = aphg.TRIGGER_SINGLE_REGISTRATION_CAPABILITY_UPDATE_INTENT;
                advr.d(lta.a, "[SR]: Enabled to run VendorImsCallQueue:cancelAllPending asynchronously", new Object[0]);
                qiu.h(aktp.ah(new kut(ltaVar, 9), (Executor) ltaVar.c.b()).i(new vei(ltaVar, i5, aphgVar, i3), (Executor) ltaVar.c.b()).i(new lso(this, i2), (Executor) this.b.b()));
            }
        } catch (lsm e) {
            advr.i(e, "[SR]: Failed to parse an incoming intent to SingleRegistrationCapabilityInfo.", new Object[0]);
            ((adim) this.f.b()).a();
        }
    }

    @Override // defpackage.wng
    protected final int e() {
        return 13;
    }
}
