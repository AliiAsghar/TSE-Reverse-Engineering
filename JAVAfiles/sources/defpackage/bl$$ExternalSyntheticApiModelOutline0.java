package defpackage;

import android.app.NotificationChannel;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Handler;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import java.lang.invoke.MethodHandles;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl$$ExternalSyntheticApiModelOutline0 {
    /* renamed from: m$2, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m112m$2() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ NotificationChannel m(Object obj) {
        return (NotificationChannel) obj;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m109m$1() {
        return AutofillManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ StorageStatsManager m90m(Object obj) {
        return (StorageStatsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AutofillId m94m(Object obj) {
        return (AutofillId) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AutofillManager m95m(Object obj) {
        return (AutofillManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m97m() {
        return StorageStatsManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ MethodHandles.Lookup m101m(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m107m(Object obj) {
        return obj instanceof AdaptiveIconDrawable;
    }
}
