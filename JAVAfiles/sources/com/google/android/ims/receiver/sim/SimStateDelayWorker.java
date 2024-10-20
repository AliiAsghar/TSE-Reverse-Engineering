package com.google.android.ims.receiver.sim;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.acrk;
import defpackage.adtl;
import defpackage.adto;
import defpackage.advr;
import defpackage.albo;
import defpackage.gsu;
import defpackage.gsw;
import defpackage.gsx;
import defpackage.gvf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SimStateDelayWorker extends gsx {
    gvf e;
    private final Context f;
    private final adtl g;

    public SimStateDelayWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = new gsu();
        this.f = context;
        this.g = ((adto) acrk.a(adto.class)).q();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [adtm, java.lang.Object] */
    @Override // defpackage.gsx
    public final ListenableFuture b() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SIM_STATE_CHANGED");
        Context context = this.f;
        Intent intent2 = null;
        if (context != null) {
            intent = context.registerReceiver(null, intentFilter);
        } else {
            intent = null;
        }
        if (intent == null) {
            advr.k("No SIM state found", new Object[0]);
        } else {
            intent2 = intent;
        }
        this.g.a.m(this.f, intent2);
        gsw gswVar = new gsw();
        this.e = gswVar;
        return albo.bI(gswVar);
    }
}
