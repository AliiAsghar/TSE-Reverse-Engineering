package defpackage;

/* loaded from: classes2.dex */
public final class jdz extends arps {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    final /* synthetic */ ifg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdz(ifg ifgVar, arpe arpeVar) {
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
