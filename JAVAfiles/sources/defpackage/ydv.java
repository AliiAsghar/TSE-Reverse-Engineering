package defpackage;

import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydv implements andy {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public ydv(Function function, RuntimeException runtimeException, int i) {
        this.a = i;
        this.b = function;
        this.c = runtimeException;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.function.Function] */
    @Override // defpackage.andy
    public final void a(Throwable th) {
        if (this.a != 0) {
            qiu.g(th, (RuntimeException) this.c, this.b);
        } else {
            ?? r0 = this.c;
            if (r0 != 0) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [algk, java.lang.Object] */
    @Override // defpackage.andy
    public final void b(Object obj) {
        if (this.a != 0) {
            return;
        }
    }

    public ydv(Consumer consumer, int i) {
        this.a = i;
        this.b = akto.a(new yez(consumer, 1));
        this.c = null;
    }

    public ydv(Consumer consumer, Consumer consumer2, int i) {
        this.a = i;
        this.b = akto.a(new xqi(consumer, 19));
        this.c = akto.a(new xqi(consumer2, 20));
    }
}
