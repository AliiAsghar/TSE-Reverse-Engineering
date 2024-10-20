package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wkj extends TelephonyCallback implements TelephonyCallback.ServiceStateListener {
    final /* synthetic */ wkk a;

    public wkj(wkk wkkVar) {
        this.a = wkkVar;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        if (serviceState.getState() == 0) {
            ((alwl) ((alwl) wkk.a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl$ServiceStateListener", "onServiceStateChanged", 2103, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onServiceStateChanged: %s", serviceState);
            this.a.m(vrk.SERVICE_STATE_CHANGE, false).k(qiu.b(), this.a.g);
        }
    }
}
