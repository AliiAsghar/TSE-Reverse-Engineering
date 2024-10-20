package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class absb extends abss implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b;
    public final Handler c;
    protected final abqa d;

    public absb(abst abstVar, abqa abqaVar) {
        super(abstVar);
        this.b = new AtomicReference(null);
        this.c = new acda(Looper.getMainLooper());
        this.d = abqaVar;
    }

    private static final int k(atal atalVar) {
        if (atalVar == null) {
            return -1;
        }
        return atalVar.a;
    }

    public final void a(ConnectionResult connectionResult, int i) {
        this.b.set(null);
        e(connectionResult, i);
    }

    public final void b() {
        this.b.set(null);
        f();
    }

    @Override // defpackage.abss
    public final void c(int i, int i2, Intent intent) {
        atal atalVar = (atal) this.b.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.d.g(l());
                if (g == 0) {
                    b();
                    return;
                } else if (atalVar != null) {
                    if (((ConnectionResult) atalVar.b).c == 18 && g == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            if (i2 == -1) {
                b();
                return;
            }
            if (i2 == 0) {
                if (atalVar != null) {
                    int i3 = 13;
                    if (intent != null) {
                        i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                    }
                    a(new ConnectionResult(i3, null, ((ConnectionResult) atalVar.b).toString()), k(atalVar));
                    return;
                }
                return;
            }
        }
        if (atalVar != null) {
            a((ConnectionResult) atalVar.b, atalVar.a);
        }
    }

    @Override // defpackage.abss
    public final void d(Bundle bundle) {
        atal atalVar;
        if (bundle != null) {
            AtomicReference atomicReference = this.b;
            if (bundle.getBoolean("resolving_error", false)) {
                atalVar = new atal(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                atalVar = null;
            }
            atomicReference.set(atalVar);
        }
    }

    protected abstract void e(ConnectionResult connectionResult, int i);

    protected abstract void f();

    @Override // defpackage.abss
    public final void g(Bundle bundle) {
        atal atalVar = (atal) this.b.get();
        if (atalVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", atalVar.a);
        bundle.putInt("failed_status", ((ConnectionResult) atalVar.b).c);
        bundle.putParcelable("failed_resolution", ((ConnectionResult) atalVar.b).d);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, null), k((atal) this.b.get()));
    }
}
