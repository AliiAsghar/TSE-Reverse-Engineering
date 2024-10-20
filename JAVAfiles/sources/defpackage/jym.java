package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jym {
    public final asai a;
    public final ascv b;
    public final asai c;
    public final jzh d;
    public final ascv e;
    public final ascv f;
    public final ascv g;
    public final arqv h;
    public final arqv i;
    public final ascv j;
    public final arqr k;
    public final arqr l;
    public final arqr m;
    public final arqr n;
    public final arqr o;
    public final arqg p;
    public final jyl q;
    public final arqg r;
    public final kjp s;
    public final lfl t;

    public jym(asai asaiVar, ascv ascvVar, asai asaiVar2, jzh jzhVar, ascv ascvVar2, ascv ascvVar3, ascv ascvVar4, kjp kjpVar, lfl lflVar, arqv arqvVar, arqv arqvVar2, ascv ascvVar5, arqr arqrVar, arqr arqrVar2, arqr arqrVar3, arqr arqrVar4, arqr arqrVar5, arqg arqgVar, jyl jylVar, arqg arqgVar2) {
        asaiVar.getClass();
        ascvVar4.getClass();
        this.a = asaiVar;
        this.b = ascvVar;
        this.c = asaiVar2;
        this.d = jzhVar;
        this.e = ascvVar2;
        this.f = ascvVar3;
        this.g = ascvVar4;
        this.s = kjpVar;
        this.t = lflVar;
        this.h = arqvVar;
        this.i = arqvVar2;
        this.j = ascvVar5;
        this.k = arqrVar;
        this.l = arqrVar2;
        this.m = arqrVar3;
        this.n = arqrVar4;
        this.o = arqrVar5;
        this.p = arqgVar;
        this.q = jylVar;
        this.r = arqgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jym)) {
            return false;
        }
        jym jymVar = (jym) obj;
        if (d.F(this.a, jymVar.a) && d.F(this.b, jymVar.b) && d.F(this.c, jymVar.c) && d.F(this.d, jymVar.d) && d.F(this.e, jymVar.e) && d.F(this.f, jymVar.f) && d.F(this.g, jymVar.g) && d.F(this.s, jymVar.s) && d.F(this.t, jymVar.t) && d.F(this.h, jymVar.h) && d.F(this.i, jymVar.i) && d.F(this.j, jymVar.j) && d.F(this.k, jymVar.k) && d.F(this.l, jymVar.l) && d.F(this.m, jymVar.m) && d.F(this.n, jymVar.n) && d.F(this.o, jymVar.o) && d.F(this.p, jymVar.p) && d.F(this.q, jymVar.q) && d.F(this.r, jymVar.r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }

    public final String toString() {
        return "PagedMessageListUiData(messagesFlow=" + this.a + ", initialMessageId=" + this.b + ", jumpIndexFlow=" + this.c + ", messageListFooterUiData=" + this.d + ", headerUiData=" + this.e + ", scheduledMessagesListUiData=" + this.f + ", scrollToBottomUiDataFlow=" + this.g + ", messageListInsetsProvider=" + this.s + ", messageListContentOffsetTracker=" + this.t + ", generateMessageListKey=" + this.h + ", invalidateMessageListKey=" + this.i + ", parentalApprovalStatusFlow=" + this.j + ", onBottomReached=" + this.k + ", onBottomReachedV2=" + this.l + ", onScroll=" + this.m + ", onMessageListInteractive=" + this.n + ", onMostRecentMessageDisplayedOrChanged=" + this.o + ", onPagingError=" + this.p + ", flags=" + this.q + ", onClick=" + this.r + ")";
    }
}
