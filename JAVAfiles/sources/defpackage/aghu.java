package defpackage;

/* loaded from: classes4.dex */
public final class aghu extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ agco c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghu(agco agcoVar, arpe arpeVar) {
        super(arpeVar);
        this.c = agcoVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fv(null, this);
    }
}
