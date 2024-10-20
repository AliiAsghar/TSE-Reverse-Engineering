package defpackage;

/* loaded from: classes2.dex */
public final class jjx extends arps {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ jju c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjx(jju jjuVar, arpe arpeVar) {
        super(arpeVar);
        this.c = jjuVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fv(null, this);
    }
}
