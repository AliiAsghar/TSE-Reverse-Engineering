package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class by extends ce {
    final /* synthetic */ cg a;

    public by(cg cgVar) {
        this.a = cgVar;
    }

    @Override // defpackage.ce
    public final void a() {
        Bundle bundle;
        this.a.af.v();
        eol.c(this.a);
        Bundle bundle2 = this.a.h;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        this.a.af.w(bundle);
    }
}
