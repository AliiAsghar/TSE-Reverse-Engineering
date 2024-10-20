package com.google.android.gms.kids.internal;

import com.google.android.gms.common.api.Status;
import defpackage.abhb;
import defpackage.acit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InternalParentalControlsClient$registerCacheCallback$registrationMethods$2$1 extends AbstractKidsCallbacks {
    final /* synthetic */ acit<Boolean> $taskCompletionSource;

    InternalParentalControlsClient$registerCacheCallback$registrationMethods$2$1(acit<Boolean> acitVar) {
        this.$taskCompletionSource = acitVar;
    }

    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
    public void onStatus(Status status) {
        status.getClass();
        abhb.d(status, true, this.$taskCompletionSource);
    }
}
