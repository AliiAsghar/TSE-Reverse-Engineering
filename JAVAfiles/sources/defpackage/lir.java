package defpackage;

/* loaded from: classes2.dex */
public final class lir extends arps {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    final /* synthetic */ lfr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lir(lfr lfrVar, arpe arpeVar) {
        super(arpeVar);
        this.d = lfrVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.fv(null, this);
    }
}
