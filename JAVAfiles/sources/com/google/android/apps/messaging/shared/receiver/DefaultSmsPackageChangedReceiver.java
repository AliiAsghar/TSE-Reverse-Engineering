package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.alhr;
import defpackage.armf;
import defpackage.uuh;
import defpackage.uvj;
import defpackage.wll;
import defpackage.xze;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DefaultSmsPackageChangedReceiver extends wll {
    public static final xze a = xze.g("Bugle", "DefaultSmsPackageChangedReceiver");
    public static final alhr b = uuh.x(188682638, "use_background_executor_for_default_sms_app_change_logging");
    public armf c;
    public armf d;
    public armf e;
    public armf f;
    public armf g;
    public armf h;
    public armf i;
    public Executor j;
    public Executor k;
    public armf l;
    public armf m;
    public armf n;
    public armf o;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.i.b()).b("DefaultSmsPackageChangedReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return "Bugle.Broadcast.DefaultPackageChanged.Latency";
    }

    @Override // defpackage.wng
    protected final int e() {
        return 10;
    }

    @Override // defpackage.wna
    public final String f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wna
    public final akul j(Context context, Intent intent) {
        return aktp.aj(new uvj(this, intent, 16, null), (Executor) this.l.b());
    }

    @Override // defpackage.wna
    public final void g(Context context, Intent intent) {
    }
}
