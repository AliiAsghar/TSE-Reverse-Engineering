package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ajjq {
    protected ajjr j;
    protected final List k;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajjq() {
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        arrayList.add(new ajjo());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final float f(int i, int i2, int i3) {
        return dze.b((i - i2) / i3, brg.a, 1.0f);
    }

    public abstract void a();

    public abstract void b(gmm gmmVar);

    public abstract void c();

    public abstract void d();

    public abstract void e();
}
