package defpackage;

/* loaded from: classes2.dex */
public final class jir extends arps {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public int d;
    public long e;
    final /* synthetic */ ifg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jir(ifg ifgVar, arpe arpeVar) {
        super(arpeVar);
        this.f = ifgVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.fv(null, this);
    }
}
