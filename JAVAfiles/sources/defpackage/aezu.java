package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezu {
    public final aap a;
    public final aap b;
    public final aap c;
    public final aap d;
    public final aap e;
    public final aap f;
    public final aaw g;
    public final arqr h;
    public final aaw i;
    public final aap j;
    public final aap k;
    public final aap l;
    public final aaj m;
    public final xl n;
    public final aaj o;
    private final aap p;
    private final aap q;
    private final aaj r;
    private final xn s;

    public aezu(aap aapVar, aap aapVar2, aap aapVar3, aap aapVar4, aap aapVar5, aap aapVar6, aaw aawVar, arqr arqrVar, aaw aawVar2, aap aapVar7, aap aapVar8, aap aapVar9, aap aapVar10, aap aapVar11, aaj aajVar, aaj aajVar2, xl xlVar, xn xnVar, aaj aajVar3) {
        this.a = aapVar;
        this.b = aapVar2;
        this.c = aapVar3;
        this.d = aapVar4;
        this.e = aapVar5;
        this.f = aapVar6;
        this.g = aawVar;
        this.h = arqrVar;
        this.i = aawVar2;
        this.j = aapVar7;
        this.k = aapVar8;
        this.l = aapVar9;
        this.p = aapVar10;
        this.q = aapVar11;
        this.m = aajVar;
        this.r = aajVar2;
        this.n = xlVar;
        this.s = xnVar;
        this.o = aajVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aezu)) {
            return false;
        }
        aezu aezuVar = (aezu) obj;
        if (d.F(this.a, aezuVar.a) && d.F(this.b, aezuVar.b) && d.F(this.c, aezuVar.c) && d.F(this.d, aezuVar.d) && d.F(this.e, aezuVar.e) && d.F(this.f, aezuVar.f) && d.F(this.g, aezuVar.g) && d.F(this.h, aezuVar.h) && d.F(this.i, aezuVar.i) && d.F(this.j, aezuVar.j) && d.F(this.k, aezuVar.k) && d.F(this.l, aezuVar.l) && d.F(this.p, aezuVar.p) && d.F(this.q, aezuVar.q) && d.F(this.m, aezuVar.m) && d.F(this.r, aezuVar.r) && d.F(this.n, aezuVar.n) && d.F(this.s, aezuVar.s) && d.F(this.o, aezuVar.o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.m.hashCode()) * 31) + this.r.hashCode()) * 31) + this.n.hashCode()) * 31) + this.s.hashCode()) * 31) + this.o.hashCode();
    }

    public final String toString() {
        return "AbcMotionScheme(bannerSlideInAnimationSpec=" + this.a + ", bannerSlideOutAnimationSpec=" + this.b + ", composeAiIconScaleInSpec=" + this.c + ", composeAiIconScaleOutSpec=" + this.d + ", textResultsBarSlideInAnimationSpec=" + this.e + ", reactionsBarFadeOutAnimationSpec=" + this.f + ", timerDotAnimationSpec=" + this.g + ", recordingDotAnimationSpec=" + this.h + ", recordingDotIndicatorAnimationSpec=" + this.i + ", swipeUpToLockPillZIndexAnimationSpec=" + this.j + ", topAppBarFadeInAnimationSpec=" + this.k + ", topAppBarFadeOutAnimationSpec=" + this.l + ", conversationBackgroundFadeInAnimationSpec=" + this.p + ", conversationBackgroundFadeOutAnimationSpec=" + this.q + ", topAppBarHighlightAnimationSpec=" + this.m + ", aiButtonBackgroundAnimationSpec=" + this.r + ", animatedLinkPreviewEnterTransitionSpec=" + this.n + ", animatedLinkPreviewExitTransitionSpec=" + this.s + ", swipeButtonSnapAnimationSpec=" + this.o + ")";
    }
}
