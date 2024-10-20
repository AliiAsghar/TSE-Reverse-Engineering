package defpackage;

/* loaded from: classes3.dex */
public final class zbb extends arps {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    final /* synthetic */ lfr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbb(lfr lfrVar, arpe arpeVar) {
        super(arpeVar);
        this.e = lfrVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.fv(null, this);
    }
}
