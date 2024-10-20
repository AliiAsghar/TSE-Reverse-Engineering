package com.google.android.libraries.appdoctor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aakf;
import defpackage.abjp;
import defpackage.aday;
import defpackage.adcx;
import defpackage.aefk;
import defpackage.aetn;
import defpackage.albo;
import defpackage.xqt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AppDoctorReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a(ListenableFuture listenableFuture, BroadcastReceiver.PendingResult pendingResult) {
        try {
            try {
                listenableFuture.get(8L, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                Log.w("AppDoctorReceiver", "Failed to complete fix in time for broadcast.");
            }
        } finally {
            Log.i("AppDoctorReceiver", "App doctor is complete.");
            pendingResult.setResultCode(-1);
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ListenableFuture bj;
        if (!"com.google.android.libraries.appdoctor.ACTION_TELE_DOCTOR_FIX".equals(intent.getAction())) {
            Log.e("AppDoctorReceiver", "Wrong action.");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey("com.google.android.libraries.appdoctor.EXTRA_TELE_FIX")) {
            aefk B = new aday((byte[]) null, (byte[]) null).B();
            abjp abjpVar = abjp.TELEDOCTOR;
            if (!adcx.z(context)) {
                bj = albo.bI(false);
            } else {
                bj = aetn.bj(new xqt(B, context, abjpVar, 14, (char[]) null));
            }
            setResultCode(-1);
            if (bj.isDone()) {
                Log.i("AppDoctorReceiver", "Fix has already been completed.");
                return;
            } else {
                aetn.bj(new aakf(bj, goAsync(), 16));
                return;
            }
        }
        Log.w("AppDoctorReceiver", "No fix found in broadcast.");
    }
}
