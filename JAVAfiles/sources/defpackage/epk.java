package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epk extends eny {
    public final int g;
    public final Bundle h;
    public final epr i;
    public epl j;
    private enm k;

    public epk(int i, Bundle bundle, epr eprVar) {
        this.g = i;
        this.h = bundle;
        this.i = eprVar;
        if (eprVar.i == null) {
            eprVar.i = this;
            eprVar.b = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.env
    public final void f() {
        if (epj.c(2)) {
            toString();
            Log.v("LoaderManager", "  Starting: ".concat(toString()));
        }
        epr eprVar = this.i;
        eprVar.d = true;
        eprVar.f = false;
        eprVar.e = false;
        eprVar.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.env
    public final void g() {
        if (epj.c(2)) {
            toString();
            Log.v("LoaderManager", "  Stopping: ".concat(toString()));
        }
        epr eprVar = this.i;
        eprVar.d = false;
        eprVar.m();
    }

    @Override // defpackage.env
    public final void i(enz enzVar) {
        super.i(enzVar);
        this.k = null;
        this.j = null;
    }

    public final void l() {
        enm enmVar = this.k;
        epl eplVar = this.j;
        if (enmVar != null && eplVar != null) {
            super.i(eplVar);
            d(enmVar, eplVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        if (epj.c(3)) {
            toString();
            Log.d("LoaderManager", "  Destroying: ".concat(toString()));
        }
        this.i.g();
        this.i.e = true;
        epl eplVar = this.j;
        if (eplVar != null) {
            i(eplVar);
            if (eplVar.c) {
                if (epj.c(2)) {
                    epr eprVar = eplVar.a;
                    Objects.toString(eprVar);
                    Log.v("LoaderManager", "  Resetting: ".concat(String.valueOf(eprVar)));
                }
                eplVar.b.c(eplVar.a);
            }
        }
        epr eprVar2 = this.i;
        epk epkVar = eprVar2.i;
        if (epkVar != null) {
            if (epkVar == this) {
                eprVar2.i = null;
                eprVar2.k();
                eprVar2.f = true;
                eprVar2.d = false;
                eprVar2.e = false;
                eprVar2.g = false;
                eprVar2.h = false;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(enm enmVar, epi epiVar) {
        epl eplVar = new epl(this.i, epiVar);
        d(enmVar, eplVar);
        enz enzVar = this.j;
        if (enzVar != null) {
            i(enzVar);
        }
        this.k = enmVar;
        this.j = eplVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.g);
        sb.append(" : ");
        sb.append(this.i.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.i)));
        sb.append("}}");
        return sb.toString();
    }
}
