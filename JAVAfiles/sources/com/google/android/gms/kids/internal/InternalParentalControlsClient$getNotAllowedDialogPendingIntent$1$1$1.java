package com.google.android.gms.kids.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import defpackage.abhb;
import defpackage.acit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InternalParentalControlsClient$getNotAllowedDialogPendingIntent$1$1$1 extends AbstractKidsCallbacks {
    final /* synthetic */ acit<PendingIntent> $completionSource;

    InternalParentalControlsClient$getNotAllowedDialogPendingIntent$1$1$1(acit<PendingIntent> acitVar) {
        this.$completionSource = acitVar;
    }

    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
    public void onPendingIntent(Status status, PendingIntent pendingIntent) {
        status.getClass();
        abhb.d(status, pendingIntent, this.$completionSource);
    }
}
