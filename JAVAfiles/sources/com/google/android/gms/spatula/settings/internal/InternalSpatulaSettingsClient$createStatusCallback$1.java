package com.google.android.gms.spatula.settings.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.abhb;
import defpackage.acit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InternalSpatulaSettingsClient$createStatusCallback$1 extends IStatusCallback.Stub {
    final /* synthetic */ acit<Boolean> $completionSource;

    InternalSpatulaSettingsClient$createStatusCallback$1(acit<Boolean> acitVar) {
        this.$completionSource = acitVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(Status status) {
        if (status == null) {
            abhb.d(Status.c, false, this.$completionSource);
        } else {
            abhb.d(Status.a, Boolean.valueOf(status.c()), this.$completionSource);
        }
    }
}
