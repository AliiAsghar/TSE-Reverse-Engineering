package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcr extends mdy {
    public final armf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcr(armf armfVar, itw itwVar, Executor executor, armf armfVar2) {
        super(armfVar, itwVar, executor);
        armfVar.getClass();
        executor.getClass();
        armfVar2.getClass();
        this.a = armfVar2;
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ioe(15);
    }

    public final void b(final long j, final int i, final int i2, final Iterable iterable, final lte lteVar) {
        iterable.getClass();
        n(new Supplier() { // from class: mcq
            @Override // java.util.function.Supplier
            public final Object get() {
                ahlp bD = aktp.bD(amsm.a.createBuilder());
                bD.q(j);
                bD.s();
                bD.r(iterable);
                aozy aozyVar = (aozy) bD.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                int i3 = i;
                amsm amsmVar = (amsm) aozyVar.b;
                amsmVar.e = i3 - 1;
                amsmVar.b |= 2;
                aozy aozyVar2 = (aozy) bD.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                lte lteVar2 = lteVar;
                int i4 = i2;
                amsm amsmVar2 = (amsm) aozyVar2.b;
                amsmVar2.b |= 4;
                amsmVar2.f = i4;
                if (lteVar2 != null) {
                    ((Optional) ((apxx) this.a).a).ifPresent(new leq(new lgk(13), 19));
                }
                return bD.o();
            }
        });
    }
}
