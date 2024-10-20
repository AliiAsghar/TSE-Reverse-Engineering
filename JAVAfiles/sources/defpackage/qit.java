package defpackage;

import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qit implements andy {
    private final Consumer a;
    private final Function b;
    private final RuntimeException c;

    public qit(Consumer consumer, Function function, RuntimeException runtimeException) {
        this.a = consumer;
        this.b = function;
        this.c = runtimeException;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        qiu.g(th, this.c, this.b);
    }

    @Override // defpackage.andy
    public final void b(Object obj) {
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            qiu.g(th, this.c, this.b);
        }
    }
}
