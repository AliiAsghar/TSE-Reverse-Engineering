package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import defpackage.a;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.ryg;
import defpackage.via;
import defpackage.xzb;
import defpackage.yjr;
import defpackage.yjy;
import defpackage.zhi;
import defpackage.ziw;
import defpackage.zmd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SimFullReceiver extends ziw {
    public armf a;
    public armf b;
    public armf c;
    public armf d;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.c.b()).b("SimFullReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [armf, java.lang.Object] */
    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
        if ("android.provider.Telephony.SIM_FULL".equals(intent.getAction())) {
            int a = ((yjy) this.a.b()).h(intent.getIntExtra("subscription", -1)).a();
            xzb.j("Bugle", a.cb(a, "SIM ", " storage full"));
            if (((yjr) this.b.b()).B()) {
                zhi zhiVar = (zhi) this.d.b();
                Resources resources = context.getResources();
                yjy yjyVar = (yjy) zhiVar.c.b();
                yjyVar.getClass();
                ryg rygVar = (ryg) zhiVar.b.b();
                rygVar.getClass();
                via viaVar = (via) zhiVar.a.b();
                viaVar.getClass();
                resources.getClass();
                new zmd(yjyVar, rygVar, viaVar, resources, a).e(new Void[0]);
            }
        }
    }

    @Override // defpackage.wng
    protected final int e() {
        return 16;
    }
}
