package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acax extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ acbb b;
    final /* synthetic */ abmr c;

    public acax(WeakReference weakReference, acbb acbbVar, abmr abmrVar) {
        this.a = weakReference;
        this.b = acbbVar;
        this.c = abmrVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onInProductHelpProcessed(InProductHelp inProductHelp) {
        long nanoTime = System.nanoTime();
        GoogleHelp googleHelp = inProductHelp.a;
        Intent putExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_START_TICK", nanoTime);
        PendingIntent pendingIntent = googleHelp.y;
        if (pendingIntent != null) {
            putExtra.putExtra("EXTRA_CUSTOM_FEEDBACK", pendingIntent);
            googleHelp.y = null;
        }
        abhi.d(inProductHelp, putExtra);
        Activity activity = (Activity) this.a.get();
        if (activity != null) {
            if (this.c != null) {
                abmr.t(activity.getApplicationContext(), this.c, nanoTime, googleHelp);
            }
            googleHelp.z = abqa.b;
            TogglingData togglingData = googleHelp.w;
            if (togglingData != null) {
                togglingData.c = abmr.n(activity);
            }
            acbc.b(this.b, activity, putExtra, googleHelp);
            return;
        }
        this.b.h(acbc.a);
    }
}
