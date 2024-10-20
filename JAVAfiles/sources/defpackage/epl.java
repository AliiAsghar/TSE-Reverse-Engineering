package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class epl implements enz {
    public final epr a;
    public final epi b;
    public boolean c = false;

    public epl(epr eprVar, epi epiVar) {
        this.a = eprVar;
        this.b = epiVar;
    }

    @Override // defpackage.enz
    public final void a(Object obj) {
        if (epj.c(2)) {
            Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + epr.n(obj));
        }
        this.c = true;
        this.b.b(this.a, obj);
    }

    public final String toString() {
        return this.b.toString();
    }
}
