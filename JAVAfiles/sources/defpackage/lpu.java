package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpu extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ lpw c;
    int d;
    lpw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpu(lpw lpwVar, arpe arpeVar) {
        super(arpeVar);
        this.c = lpwVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
