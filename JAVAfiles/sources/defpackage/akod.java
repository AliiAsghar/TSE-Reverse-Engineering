package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akod implements akoc {
    private final BatteryManager a;

    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public akod(Context context) {
        this.a = (BatteryManager) context.getSystemService("batterymanager");
    }

    @Override // defpackage.akoc
    public final boolean a() {
        return this.a.isCharging();
    }
}
