package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.abrz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StatusCallback extends IStatusCallback.Stub {
    private final abrz a;

    public StatusCallback(abrz<Status> abrzVar) {
        this.a = abrzVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(Status status) {
        this.a.c(status);
    }
}
