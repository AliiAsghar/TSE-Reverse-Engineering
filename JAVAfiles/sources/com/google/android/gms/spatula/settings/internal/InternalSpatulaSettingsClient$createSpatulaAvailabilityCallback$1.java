package com.google.android.gms.spatula.settings.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaAvailability;
import com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks;
import defpackage.abhb;
import defpackage.achz;
import defpackage.acit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InternalSpatulaSettingsClient$createSpatulaAvailabilityCallback$1 extends ISpatulaAvailabilityCallbacks.Stub {
    final /* synthetic */ acit<SpatulaAvailability> $completionSource;
    final /* synthetic */ achz this$0;

    InternalSpatulaSettingsClient$createSpatulaAvailabilityCallback$1(achz achzVar, acit<SpatulaAvailability> acitVar) {
        this.this$0 = achzVar;
        this.$completionSource = acitVar;
    }

    @Override // com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks
    public void onGetSpatulaAvailability(Status status, SpatulaAvailability spatulaAvailability) {
        if (spatulaAvailability == null) {
            SpatulaAvailability spatulaAvailability2 = new SpatulaAvailability();
            spatulaAvailability2.a = 0;
            abhb.d(status, spatulaAvailability2, this.$completionSource);
            return;
        }
        abhb.d(status, spatulaAvailability, this.$completionSource);
    }
}
