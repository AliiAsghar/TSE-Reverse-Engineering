package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazd implements vrl {
    public ProgressBar a;
    public View b;
    public Runnable c;
    public final aazc d;
    public final armf e;

    public aazd(aazc aazcVar, armf armfVar) {
        this.d = aazcVar;
        this.e = armfVar;
    }

    public final void a() {
        LayoutInflater.Factory fe = this.d.fe();
        if (fe == null) {
            return;
        }
        try {
            aaza aazaVar = (aaza) ((akkh) fe).E();
            xzb.j("BugleRcs", "RcsPromoActivity: onProvisioningSuccess");
            aazaVar.d();
            aazaVar.b.z();
            aazaVar.a();
        } catch (ClassCastException unused) {
            throw new ClassCastException(String.valueOf(fe.getClass().getName()).concat(" must implement OnProvisioningListener"));
        }
    }

    @Override // defpackage.vrl
    public final void am(vrm vrmVar) {
        if (vrmVar.a == amwt.AVAILABLE) {
            a();
        }
    }
}
