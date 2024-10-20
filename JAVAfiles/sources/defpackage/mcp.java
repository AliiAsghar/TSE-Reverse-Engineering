package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcp extends mdy {
    public mcp(armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ioe(14);
    }

    public final void b(Iterable iterable, int i, int i2, boolean z) {
        c(5, iterable, i, i2, z);
    }

    public final void c(final int i, final Iterable iterable, final int i2, final int i3, final boolean z) {
        n(new Supplier() { // from class: mco
            @Override // java.util.function.Supplier
            public final Object get() {
                aozy createBuilder = amsl.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                int i4 = i;
                apag apagVar = createBuilder.b;
                amsl amslVar = (amsl) apagVar;
                amslVar.c = i4 - 1;
                amslVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                amsl amslVar2 = (amsl) createBuilder.b;
                apax apaxVar = amslVar2.e;
                if (!apaxVar.c()) {
                    amslVar2.e = apag.mutableCopy(apaxVar);
                }
                aoyj.addAll(iterable, amslVar2.e);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                int i5 = i2;
                apag apagVar2 = createBuilder.b;
                amsl amslVar3 = (amsl) apagVar2;
                amslVar3.f = i5 - 1;
                amslVar3.b |= 4;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                int i6 = i3;
                apag apagVar3 = createBuilder.b;
                amsl amslVar4 = (amsl) apagVar3;
                amslVar4.b |= 8;
                amslVar4.g = i6;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                boolean z2 = z;
                amsl amslVar5 = (amsl) createBuilder.b;
                amslVar5.b |= 2;
                amslVar5.d = z2;
                return (amsl) createBuilder.s();
            }
        });
    }
}
