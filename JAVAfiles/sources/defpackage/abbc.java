package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbc implements emx {
    public static final alwo a = alwo.o("Bugle");
    public final anen b;
    public final armf c;
    public final ArrayList d = new ArrayList();
    public volatile boolean e = true;

    public abbc(anen anenVar, armf armfVar) {
        this.b = anenVar;
        this.c = armfVar;
    }

    @Override // defpackage.emx
    public final void gF(enm enmVar) {
        this.e = false;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.d.clear();
    }

    @Override // defpackage.emx
    public final /* synthetic */ void d(enm enmVar) {
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
