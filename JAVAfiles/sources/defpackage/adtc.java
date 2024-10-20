package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adtc extends AsyncTask {
    final /* synthetic */ Context a;
    final /* synthetic */ Intent b;
    final /* synthetic */ BroadcastReceiver.PendingResult c;
    final /* synthetic */ adtd d;

    public adtc(adtd adtdVar, Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.a = context;
        this.b = intent;
        this.c = pendingResult;
        this.d = adtdVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        this.d.c(this.a, this.b);
        return null;
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Object obj) {
        BroadcastReceiver.PendingResult pendingResult = this.c;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
