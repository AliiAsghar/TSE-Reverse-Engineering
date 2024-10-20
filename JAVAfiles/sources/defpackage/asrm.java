package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrm {
    private static final asrl a = new asrl(new byte[0], 0, 0, false);
    private static final int b;
    private static final AtomicReference[] c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int highestOneBit = Integer.highestOneBit((availableProcessors + availableProcessors) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final asrl a() {
        AtomicReference c2 = c();
        asrl asrlVar = a;
        asrl asrlVar2 = (asrl) c2.getAndSet(asrlVar);
        if (asrlVar2 == asrlVar) {
            return new asrl();
        }
        if (asrlVar2 == null) {
            c2.set(null);
            return new asrl();
        }
        c2.set(asrlVar2.f);
        asrlVar2.f = null;
        asrlVar2.c = 0;
        return asrlVar2;
    }

    public static final void b(asrl asrlVar) {
        int i;
        if (asrlVar.f == null && asrlVar.g == null) {
            if (!asrlVar.d) {
                AtomicReference c2 = c();
                asrl asrlVar2 = a;
                asrl asrlVar3 = (asrl) c2.getAndSet(asrlVar2);
                if (asrlVar3 != asrlVar2) {
                    if (asrlVar3 != null) {
                        i = asrlVar3.c;
                    } else {
                        i = 0;
                    }
                    if (i >= 65536) {
                        c2.set(asrlVar3);
                        return;
                    }
                    asrlVar.f = asrlVar3;
                    asrlVar.b = 0;
                    asrlVar.c = i + 8192;
                    c2.set(asrlVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final AtomicReference c() {
        return c[(int) (Thread.currentThread().getId() & (b - 1))];
    }
}
