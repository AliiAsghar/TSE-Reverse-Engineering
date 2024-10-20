package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mak implements Function {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ mak(long j, long j2, int i) {
        this.c = i;
        this.a = j;
        this.b = j2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        if (this.c != 0) {
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.c != 0) {
            syc sycVar = (syc) obj;
            sycVar.Q(1, 22);
            sycVar.U(new agph("messages.sent_timestamp", String.valueOf(this.a), String.valueOf(this.b)));
            return sycVar;
        }
        sxk sxkVar = (sxk) obj;
        int i = man.b;
        sxkVar.b(this.a - this.b);
        return sxkVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        if (this.c != 0) {
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
