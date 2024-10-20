package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acay extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ acaz b;

    public acay(acaz acazVar, WeakReference weakReference) {
        this.a = weakReference;
        this.b = acazVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onTogglingPipProcessed(TogglingData togglingData) {
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            this.b.h(acbc.a);
            return;
        }
        if (!TextUtils.isEmpty(togglingData.b)) {
            togglingData.c = abmr.n(activity);
        }
        new acda(Looper.getMainLooper()).post(new acaj(activity, new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_TOGGLING_DATA", togglingData).putExtra("EXTRA_START_TICK", System.nanoTime()), 3, (byte[]) null));
        this.b.j(Status.a);
    }
}
