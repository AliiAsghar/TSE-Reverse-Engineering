package defpackage;

/* loaded from: classes3.dex */
public final class qks extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ lfr c;
    public lfr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qks(lfr lfrVar, arpe arpeVar) {
        super(arpeVar);
        this.c = lfrVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fv(null, this);
    }
}
