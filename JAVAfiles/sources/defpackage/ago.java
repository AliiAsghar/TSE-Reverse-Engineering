package defpackage;

import defpackage.ags;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ago {
    public final cbh a = new cbh(new ags.a[16]);

    public final void a(Throwable th) {
        cbh cbhVar = this.a;
        int i = cbhVar.b;
        arvo[] arvoVarArr = new arvo[i];
        for (int i2 = 0; i2 < i; i2++) {
            arvoVarArr[i2] = ((ags.a) cbhVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            arvoVarArr[i3].h(th);
        }
        if (this.a.b == 0) {
            return;
        }
        aju.d("uncancelled requests present");
    }
}
