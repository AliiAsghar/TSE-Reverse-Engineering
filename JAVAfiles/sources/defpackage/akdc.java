package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akdc implements ajzc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akdc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ajzc
    public final ListenableFuture a(ajzd ajzdVar) {
        if (this.b != 0) {
            ajwt ajwtVar = ajzdVar.a;
            Object obj = this.a;
            return albo.bN(new akiq(obj, ajwtVar, 1, null), ((ansy) obj).a);
        }
        return ((akdi) this.a.b()).b(null);
    }
}
