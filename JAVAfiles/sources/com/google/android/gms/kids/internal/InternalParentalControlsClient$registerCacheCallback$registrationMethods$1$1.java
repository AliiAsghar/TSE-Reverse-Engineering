package com.google.android.gms.kids.internal;

import com.google.android.gms.common.api.Status;
import defpackage.abhb;
import defpackage.acit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InternalParentalControlsClient$registerCacheCallback$registrationMethods$1$1 extends AbstractKidsCallbacks {
    final /* synthetic */ acit<Void> $taskCompletionSource;

    InternalParentalControlsClient$registerCacheCallback$registrationMethods$1$1(acit<Void> acitVar) {
        this.$taskCompletionSource = acitVar;
    }

    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
    public void onStatus(Status status) {
        status.getClass();
        abhb.c(status, this.$taskCompletionSource);
    }
}
