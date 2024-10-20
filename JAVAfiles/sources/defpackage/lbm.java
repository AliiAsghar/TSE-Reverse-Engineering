package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbm extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ lbn b;
    int c;
    lbn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbm(lbn lbnVar, arpe arpeVar) {
        super(arpeVar);
        this.b = lbnVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.fv(null, this);
    }
}
