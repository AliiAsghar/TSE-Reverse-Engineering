package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aati implements emx {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aati(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        if (this.c != 0) {
            ((pui) this.a).g.h(this.b);
            return;
        }
        Uri[] uriArr = aatk.a;
        int length = uriArr.length;
        for (int i = 0; i < 2; i++) {
            Uri uri = uriArr[i];
            ((atsg) this.a).j(uri, true, (aker) this.b);
        }
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        if (this.c != 0) {
            ((pui) this.a).g.i(this.b);
        } else {
            ((atsg) this.a).k((aker) this.b);
        }
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
