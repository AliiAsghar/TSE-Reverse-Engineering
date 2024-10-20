package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acaw extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ acbb c;
    final /* synthetic */ abmr d;

    public acaw(Intent intent, WeakReference weakReference, acbb acbbVar, abmr abmrVar) {
        this.a = intent;
        this.b = weakReference;
        this.c = acbbVar;
        this.d = abmrVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onGoogleHelpProcessed(GoogleHelp googleHelp) {
        Intent intent = this.a;
        long nanoTime = System.nanoTime();
        intent.putExtra("EXTRA_START_TICK", nanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity != null) {
            if (this.d != null) {
                abmr.t(activity.getApplicationContext(), this.d, nanoTime, googleHelp);
            }
            googleHelp.z = abqa.b;
            TogglingData togglingData = googleHelp.w;
            if (togglingData != null) {
                togglingData.c = abmr.n(activity);
            }
            acbc.b(this.c, activity, this.a, googleHelp);
            return;
        }
        this.c.h(acbc.a);
    }
}
