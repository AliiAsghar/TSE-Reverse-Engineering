package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aktp;
import defpackage.gsw;
import defpackage.gsx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RequestRegisteredVerifiedSmsSendersWork extends gsx {
    public RequestRegisteredVerifiedSmsSendersWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        return aktp.ag(new gsw());
    }
}
