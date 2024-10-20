package defpackage;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atoy implements atoq {
    final /* synthetic */ Type a;
    final /* synthetic */ Executor b;

    public atoy(Type type, Executor executor) {
        this.a = type;
        this.b = executor;
    }

    @Override // defpackage.atoq
    public final /* bridge */ /* synthetic */ Object a(atoo atooVar) {
        Executor executor = this.b;
        if (executor == null) {
            return atooVar;
        }
        return new atpa(executor, atooVar);
    }

    @Override // defpackage.atoq
    public final Type b() {
        return this.a;
    }
}
