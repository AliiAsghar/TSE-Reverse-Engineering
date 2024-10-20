package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.agui;
import defpackage.ahnu;
import defpackage.ahnx;
import defpackage.ahsi;
import defpackage.ahta;
import defpackage.ahux;
import defpackage.aidu;
import defpackage.albo;
import defpackage.ancd;
import defpackage.ancj;
import defpackage.andi;
import defpackage.anee;
import defpackage.aneh;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        String str;
        ListenableFuture listenableFuture;
        ListenableFuture listenableFuture2;
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("accountType")) != null) {
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    str = extras.getString("authAccount");
                } else {
                    str = null;
                }
                if (str != null && (str.contains("../") || str.contains("/.."))) {
                    Log.w("AccountRemovedRecv", a.bW(str, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
                    return;
                }
                ahta.e();
                ahta a = ahta.a(context);
                if (a == null) {
                    Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                    return;
                }
                BroadcastReceiver.PendingResult goAsync = goAsync();
                ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                if (str != null) {
                    listenableFuture = ancj.g(anee.o(ahux.b(a).b(new agui(str, 6), a.d())), new ahsi(a, str, 2), a.d());
                } else {
                    listenableFuture = aneh.a;
                }
                listenableFutureArr[0] = ancd.f(listenableFuture, IOException.class, new ahnx(7), andi.a);
                if (str != null) {
                    listenableFuture2 = a.d().submit(new ahnu(context, str, 7, null));
                } else {
                    listenableFuture2 = aneh.a;
                }
                listenableFutureArr[1] = listenableFuture2;
                albo.bW(listenableFutureArr).a(new aidu(goAsync, 1), andi.a);
            }
        }
    }
}
