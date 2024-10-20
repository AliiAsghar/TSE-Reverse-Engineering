package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gxe extends gxg {
    private final BroadcastReceiver e;

    public gxe(Context context, gpx gpxVar) {
        super(context, gpxVar);
        this.e = new gxd(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.gxg
    public final void d() {
        gsy.a().c(gxf.a, String.valueOf(getClass().getSimpleName()).concat(": registering receiver"));
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.gxg
    public final void e() {
        gsy.a().c(gxf.a, String.valueOf(getClass().getSimpleName()).concat(": unregistering receiver"));
        this.a.unregisterReceiver(this.e);
    }
}
