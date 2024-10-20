package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vx extends arrp implements arqr<bxi, bxh> {
    final /* synthetic */ cez a;
    final /* synthetic */ Object b;
    final /* synthetic */ AnimatedContentTransitionScopeImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(cez cezVar, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        super(1);
        this.a = cezVar;
        this.b = obj;
        this.c = animatedContentTransitionScopeImpl;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new vw(this.a, this.b, this.c);
    }
}
