package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hta implements hnl {
    private final hnl a;
    private final Resources b;

    public hta(Resources resources, hnl hnlVar) {
        hwr.i(resources);
        this.b = resources;
        hwr.i(hnlVar);
        this.a = hnlVar;
    }

    @Override // defpackage.hnl
    public final hpt a(Object obj, int i, int i2, hnj hnjVar) {
        return huh.f(this.b, this.a.a(obj, i, i2, hnjVar));
    }

    @Override // defpackage.hnl
    public final boolean b(Object obj, hnj hnjVar) {
        return this.a.b(obj, hnjVar);
    }
}
