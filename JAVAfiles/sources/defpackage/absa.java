package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Build;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absa implements Runnable {
    public final Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public absa(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ih ihVar;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                argc argcVar = (argc) this.b;
                arga p = argcVar.p(argcVar.q.e, false);
                if (p == null) {
                    return;
                }
                ((argc) this.b).f.execute(new ardm(this, p, 3, null));
                return;
            }
            ij ijVar = ((jq) this.b).c;
            if (ijVar != null && (ihVar = ijVar.b) != null) {
                ihVar.G(ijVar);
            }
            View view = (View) ((jq) this.b).f;
            if (view != null && view.getWindowToken() != null && ((it) this.a).h()) {
                ((jq) this.b).i = (jp) this.a;
            }
            ((jq) this.b).k = null;
            return;
        }
        if (((absb) this.b).a) {
            ConnectionResult connectionResult = (ConnectionResult) ((atal) this.a).b;
            if (connectionResult.a()) {
                Object obj = this.b;
                PendingIntent pendingIntent = connectionResult.d;
                Activity l = ((abss) obj).l();
                abhg.m(pendingIntent);
                ((absb) obj).f.startActivityForResult(GoogleApiActivity.a(l, pendingIntent, ((atal) this.a).a, false), 1);
                return;
            }
            Object obj2 = this.b;
            if (((absb) obj2).d.i(((abss) obj2).l(), connectionResult.c, null) != null) {
                ?? r1 = this.b;
                int i2 = connectionResult.c;
                Activity l2 = ((abss) r1).l();
                absb absbVar = (absb) r1;
                abqa abqaVar = absbVar.d;
                Dialog d = abqaVar.d(l2, i2, new abue(abqaVar.i(l2, i2, "d"), absbVar.f), r1);
                if (d != null) {
                    abqaVar.b(l2, d, "GooglePlayServicesErrorDialog", r1);
                    return;
                }
                return;
            }
            if (connectionResult.c == 18) {
                ?? r0 = this.b;
                Activity l3 = ((abss) r0).l();
                ProgressBar progressBar = new ProgressBar(l3, null, R.attr.progressBarStyleLarge);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(l3);
                builder.setView(progressBar);
                builder.setMessage(abub.c(l3, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                ((absb) r0).d.b(l3, create, "GooglePlayServicesUpdatingDialog", r0);
                Context applicationContext = ((abss) this.b).l().getApplicationContext();
                absq absqVar = new absq(this, create);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                absr absrVar = new absr(absqVar);
                if (Build.VERSION.SDK_INT >= 33) {
                    applicationContext.registerReceiver(absrVar, intentFilter, 2);
                } else {
                    applicationContext.registerReceiver(absrVar, intentFilter);
                }
                absrVar.a = applicationContext;
                if (!abqp.g(applicationContext)) {
                    absqVar.a();
                    absrVar.a();
                    return;
                }
                return;
            }
            ((absb) this.b).a(connectionResult, ((atal) this.a).a);
        }
    }
}
