package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahno implements ancr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ahno(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [arwe, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        int i;
        if (this.d != 0) {
            wes wesVar = (wes) this.b;
            Optional flatMap = wesVar.c.i().flatMap(new vvi(16));
            xgj xgjVar = (xgj) wesVar.b.b();
            xgjVar.getClass();
            znj znjVar = (znj) flatMap.map(new vxg(xgjVar, 10)).orElseThrow(new vtc(9));
            if (this.a - 1 != 1) {
                i = 1;
            } else {
                i = 2;
            }
            Object obj = this.c;
            obj.getClass();
            return qjh.j(znjVar.b, new mdi(znjVar, (aqfn) obj, i, (arpe) null, 10));
        }
        if (((AtomicInteger) this.c).getAndDecrement() <= 0) {
            return aneh.a;
        }
        int i2 = this.a;
        ahnq ahnqVar = (ahnq) this.b;
        return ahnqVar.n(i2, (ahni) ahnqVar.b.b());
    }
}
