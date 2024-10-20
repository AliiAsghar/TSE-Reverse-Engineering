package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.ims.util.common.RcsIntents;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abts extends abtu {
    public final int a;
    public final Bundle b;
    final /* synthetic */ BaseGmsClient c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abts(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, true);
        this.c = baseGmsClient;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    protected abstract boolean c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abtu
    public final /* bridge */ /* synthetic */ void d() {
        PendingIntent pendingIntent = null;
        if (this.a != 0) {
            this.c.C(1, null);
            Bundle bundle = this.b;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable(RcsIntents.EXTRA_PENDING_INTENT);
            }
            a(new ConnectionResult(this.a, pendingIntent));
            return;
        }
        if (!c()) {
            this.c.C(1, null);
            a(new ConnectionResult(8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abtu
    public final void b() {
    }
}
