package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class admm implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ admm(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [arwe, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.c != 0) {
            if (this.a) {
                ((zfj) ((abeg) this.b).a.b()).d(new uta(null, "sync_data_to_wearable_app_dedupe", null, null, null, null));
            }
            return null;
        }
        adms admsVar = (adms) this.b;
        adji adjiVar = admsVar.e;
        boolean D = admsVar.D();
        int size = adjiVar.i().size();
        boolean z = this.a;
        wyp wypVar = admsVar.n;
        qjh.l(wypVar.a, null, new wfb(wypVar, z, D, size, null), 3);
        return null;
    }
}
