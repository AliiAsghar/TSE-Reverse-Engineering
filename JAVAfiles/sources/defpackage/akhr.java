package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akhr extends akgu {
    public akgu a = null;
    private final cg b;
    private final Executor c;
    private final ahiy d;

    public akhr(cg cgVar, ahiy ahiyVar, Executor executor) {
        this.b = cgVar;
        this.d = ahiyVar;
        this.c = executor;
    }

    @Override // defpackage.akgu
    public final akec a(int i, akgr akgrVar, akgs akgsVar) {
        boolean z;
        aiut.c();
        try {
            if (((eno) this.b.O().N()).c == eng.INITIALIZED) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the LocalSubscriptionMixin's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.");
            if (this.a == null) {
                try {
                    akmy c = akmy.c(this.b.O(), this.b);
                    this.a = new akhc(new akhf(new akgz(this.b.O(), c, this.c), c, this.d, this.c, this.b.O()));
                    this.b.O().N().c(new akuj(new akly(this, 1)));
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("Currently a Fragment cannot inject both `@ViewLifecycle StreamMixin` and `@ViewLifecycle LocalSubscriptionMixin` at the same time. Please file go/tiktok-bug if you need it.\n\nIf this Fragment injects both unqualified and `@ViewLifecycle` qualified Mixins it's likely a bug. Only one the two Mixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle` Mixin exclusively.", e);
                }
            }
            return this.a.a(i, akgrVar, akgsVar);
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the LocalSubscriptionMixin's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.", e2);
        }
    }
}
