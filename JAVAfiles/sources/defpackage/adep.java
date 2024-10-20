package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adep implements adeo {
    private final adnv b;
    private adju c;

    public adep(Context context, adnv adnvVar) {
        this.b = adnvVar;
        adwi.i(context);
        adwi.i(context);
    }

    @Override // defpackage.adeo
    public final int a() {
        adju adjuVar = this.c;
        if (adjuVar != null) {
            return adjuVar.q;
        }
        return 0;
    }

    @Override // defpackage.adeo
    @Deprecated
    public final String b() {
        return (String) this.b.c().orElse(null);
    }

    @Override // defpackage.adeo
    public final String c() {
        adju adjuVar = this.c;
        if (adjuVar != null) {
            return adjuVar.n;
        }
        return null;
    }

    @Override // defpackage.adeo
    public final String d() {
        adju adjuVar = this.c;
        if (adjuVar != null) {
            return adjuVar.p;
        }
        return null;
    }

    @Override // defpackage.adeo
    public final void e(adju adjuVar) {
        this.c = adjuVar;
    }

    @Override // defpackage.adeo
    public final boolean f() {
        adju adjuVar = this.c;
        if (adjuVar != null && adjuVar.B) {
            return true;
        }
        return false;
    }
}
