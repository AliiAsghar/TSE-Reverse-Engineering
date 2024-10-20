package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvl {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(final int... iArr) {
        if (b.compareAndSet(false, true)) {
            abnr.k(new abnp() { // from class: ahvk
                @Override // defpackage.abnp
                public final void a(abnq abnqVar) {
                    int i = ahvl.a;
                    try {
                        abnqVar.f(iArr);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            });
        }
    }
}
