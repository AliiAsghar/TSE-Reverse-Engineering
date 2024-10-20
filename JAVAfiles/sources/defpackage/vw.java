package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vw implements bxh {
    final /* synthetic */ cez a;
    final /* synthetic */ Object b;
    final /* synthetic */ AnimatedContentTransitionScopeImpl c;

    public vw(cez cezVar, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.a = cezVar;
        this.b = obj;
        this.c = animatedContentTransitionScopeImpl;
    }

    @Override // defpackage.bxh
    public final void a() {
        this.a.remove(this.b);
        this.c.d.g(this.b);
    }
}
