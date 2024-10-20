package defpackage;

/* loaded from: classes3.dex */
public final class xko extends arps {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ xkp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xko(xkp xkpVar, arpe arpeVar) {
        super(arpeVar);
        this.c = xkpVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fv(null, this);
    }
}
