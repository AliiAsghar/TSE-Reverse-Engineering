package defpackage;

/* loaded from: classes3.dex */
public final class zdl extends arps {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ zdd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdl(zdd zddVar, arpe arpeVar) {
        super(arpeVar);
        this.c = zddVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fv(null, this);
    }
}
