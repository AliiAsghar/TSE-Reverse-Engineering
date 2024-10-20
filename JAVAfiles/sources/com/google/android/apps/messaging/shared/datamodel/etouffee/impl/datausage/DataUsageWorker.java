package com.google.android.apps.messaging.shared.datamodel.etouffee.impl.datausage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aktp;
import defpackage.gsu;
import defpackage.gsx;
import defpackage.gvf;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class DataUsageWorker extends gsx {
    private final Context e;

    public DataUsageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = context;
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        gvf.ar(this.e).a("data_usage_recurring_worker");
        return aktp.ag(new gsu());
    }
}
