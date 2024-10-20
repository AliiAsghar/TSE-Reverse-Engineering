package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessTelephonyChangeAction;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.mce;
import defpackage.rdh;
import defpackage.rji;
import defpackage.uhj;
import defpackage.vjs;
import defpackage.wma;
import defpackage.wyj;
import defpackage.xyo;
import defpackage.xze;
import defpackage.yjy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TelephonyChangeReceiver extends wma {
    private static final xze c = xze.g("Bugle", "TelephonyChangeReceiver");
    public armf a;
    public armf b;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.b.b()).b("TelephonyChangeReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.TelephonyChange.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 9;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.TelephonyChange.Latency";
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            xyo d = c.d();
            d.H("onReceive:");
            d.H(intent);
            d.q();
            if ("android.provider.action.EXTERNAL_PROVIDER_CHANGE".equals(action)) {
                rdh rdhVar = (rdh) this.a.b();
                Uri data = intent.getData();
                Context context2 = (Context) rdhVar.a.b();
                context2.getClass();
                yjy yjyVar = (yjy) rdhVar.d.b();
                yjyVar.getClass();
                mce mceVar = (mce) rdhVar.e.b();
                mceVar.getClass();
                rji rjiVar = (rji) rdhVar.f.b();
                rjiVar.getClass();
                vjs vjsVar = (vjs) rdhVar.g.b();
                vjsVar.getClass();
                uhj uhjVar = (uhj) rdhVar.h.b();
                uhjVar.getClass();
                wyj wyjVar = (wyj) rdhVar.i.b();
                wyjVar.getClass();
                armf armfVar = rdhVar.k;
                armf armfVar2 = rdhVar.j;
                new ProcessTelephonyChangeAction(context2, rdhVar.b, rdhVar.c, yjyVar, mceVar, rjiVar, vjsVar, uhjVar, wyjVar, armfVar2, armfVar, data).r(this);
            }
        }
    }

    @Override // defpackage.wna
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.wna
    public final String k(Context context, Intent intent) {
        return context.getString(R.string.updating_conversations_foreground_notification_text);
    }
}
