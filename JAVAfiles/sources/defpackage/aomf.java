package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aomf implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aomf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                algs algsVar = aomg.a;
                return (Boolean) ((algw) this.a.b()).d(false);
            }
            return abqq.c((Context) this.a);
        }
        return new akvb((aksr) this.a);
    }
}
