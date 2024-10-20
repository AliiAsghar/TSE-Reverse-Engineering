package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absn implements abtg, abtv {
    public final abqz a;
    public final abrv b;
    public final /* synthetic */ abso d;
    private IAccountAccessor e = null;
    private Set f = null;
    public boolean c = false;

    public absn(abso absoVar, abqz abqzVar, abrv abrvVar) {
        this.d = absoVar;
        this.a = abqzVar;
        this.b = abrvVar;
    }

    @Override // defpackage.abtv
    public final void a(ConnectionResult connectionResult) {
        this.d.o.post(new aanh(this, connectionResult, 16));
    }

    @Override // defpackage.abtg
    public final void b(ConnectionResult connectionResult) {
        absl abslVar = (absl) this.d.l.get(this.b);
        if (abslVar != null) {
            abslVar.i(connectionResult);
        }
    }

    @Override // defpackage.abtg
    public final void c(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor != null && set != null) {
            this.e = iAccountAccessor;
            this.f = set;
            e();
        } else {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new ConnectionResult(4));
        }
    }

    @Override // defpackage.abtg
    public final void d(int i) {
        absl abslVar = (absl) this.d.l.get(this.b);
        if (abslVar != null) {
            if (abslVar.f) {
                abslVar.i(new ConnectionResult(17));
            } else {
                abslVar.onConnectionSuspended(i);
            }
        }
    }

    public final void e() {
        IAccountAccessor iAccountAccessor;
        if (this.c && (iAccountAccessor = this.e) != null) {
            this.a.o(iAccountAccessor, this.f);
        }
    }
}
