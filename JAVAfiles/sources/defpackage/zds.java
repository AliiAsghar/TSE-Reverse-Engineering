package defpackage;

/* loaded from: classes3.dex */
public final class zds extends arps {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ zdd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zds(zdd zddVar, arpe arpeVar) {
        super(arpeVar);
        this.d = zddVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.fv(null, this);
    }
}
