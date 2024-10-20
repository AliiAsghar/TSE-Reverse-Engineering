package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IStatusCallback;
import defpackage.abhb;
import defpackage.acit;
import defpackage.arnb;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class InternalSafetyCoreClient$prewarm$1$callback$1 extends IStatusCallback.Stub {
    final /* synthetic */ acit<arnb> $completionSource;

    InternalSafetyCoreClient$prewarm$1$callback$1(acit<arnb> acitVar) {
        this.$completionSource = acitVar;
    }

    @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IStatusCallback
    public void onResult(Status status) {
        status.getClass();
        abhb.d(status, arnb.a, this.$completionSource);
    }
}
