package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class andf extends andg {
    final /* synthetic */ andh a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public andf(andh andhVar, Callable callable, Executor executor) {
        super(andhVar, executor);
        this.a = andhVar;
        this.c = callable;
    }

    @Override // defpackage.anej
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.anej
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.andg
    public final void c(Object obj) {
        this.a.set(obj);
    }
}
