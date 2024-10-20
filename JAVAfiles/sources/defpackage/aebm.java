package defpackage;

/* loaded from: classes4.dex */
public final class aebm extends arps {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    final /* synthetic */ zdd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aebm(zdd zddVar, arpe arpeVar) {
        super(arpeVar);
        this.e = zddVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.fv(null, this);
    }
}
