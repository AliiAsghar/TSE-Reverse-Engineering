package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylv extends ylx {
    public static final xze a = xze.g("Bugle", "CsApkPackageUidUpdater");
    public ylu b;
    public aksr c;
    public anen d;

    @Override // defpackage.wng
    public final akrc a() {
        return this.c.b("CsApkPackageUidUpdater Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    @Override // defpackage.wna
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.CsApkPackageUpdated.Latency";
    }

    @Override // defpackage.wna
    public final akul j(Context context, Intent intent) {
        return aktp.ah(new yar(this, intent, 13), this.d);
    }
}
