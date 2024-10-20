package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.gsy;
import defpackage.gvw;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintProxy extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;
    private static final String b = gsy.b("ConstraintProxy");

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class NetworkStateProxy extends ConstraintProxy {
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gsy a2 = gsy.a();
        String str = b;
        Objects.toString(intent);
        a2.c(str, "onReceive : ".concat(String.valueOf(intent)));
        context.startService(gvw.b(context));
    }
}
