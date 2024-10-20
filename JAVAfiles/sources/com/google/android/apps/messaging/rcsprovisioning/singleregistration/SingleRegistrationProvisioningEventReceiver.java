package com.google.android.apps.messaging.rcsprovisioning.singleregistration;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.advq;
import defpackage.advr;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alvg;
import defpackage.alvw;
import defpackage.alwp;
import defpackage.armf;
import defpackage.lsl;
import defpackage.lsm;
import defpackage.lsq;
import defpackage.lss;
import defpackage.xzb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SingleRegistrationProvisioningEventReceiver extends lsl {
    public armf a;
    public armf b;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.a.b()).b("SingleRegistrationProvisioningEventReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.SingleRegistrationProvisioningEventReceiver.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 14;
    }

    @Override // defpackage.wna
    public final String f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wna
    public final akul j(Context context, Intent intent) {
        if (advr.c <= 3) {
            advr.c("[SR]: SingleRegistrationProvisioningInfoEvent intent details:\n%s", advq.GENERIC.c("SingleRegistration provisioning intent details:" + String.format("\ntype: %s", intent.getType()) + String.format("\nextras: %s", xzb.a(intent))));
        }
        try {
            lsm.a(intent, RcsIntents.ACTION_RCS_SINGLE_REGISTRATION_PROVISIONING_EVENT);
            lsm.b(intent, RcsIntents.EXTRA_SIM_ID);
            String stringExtra = intent.getStringExtra(RcsIntents.EXTRA_SIM_ID);
            stringExtra.getClass();
            lsm.b(intent, RcsIntents.EXTRA_SUB_ID);
            int intExtra = intent.getIntExtra(RcsIntents.EXTRA_SUB_ID, -1);
            boolean booleanExtra = intent.getBooleanExtra(RcsIntents.EXTRA_SETUP_VENDOR_IMS, false);
            alvw d = lss.a.d();
            d.X(alwp.a, "BugleRcsEngine");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/rcsprovisioning/singleregistration/SingleRegistrationProvisioningEventInfo", "fromIntent", 57, "SingleRegistrationProvisioningEventInfo.java")).J("[SR]: Received SingleRegistrationProvisioningEvent intent with simId: %s, subId: %d, shouldSetupVendorIms: %b", advq.SIM_ID.c(stringExtra), Integer.valueOf(intExtra), Boolean.valueOf(booleanExtra));
            return ((lsq) this.b.b()).a(new lss(stringExtra, intExtra, booleanExtra));
        } catch (lsm e) {
            advr.i(e, "[SR]: Failed to parse an incoming intent.", new Object[0]);
            return aktp.ag(null);
        }
    }
}
