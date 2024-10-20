package defpackage;

/* loaded from: classes4.dex */
public final class albs extends arps {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    final /* synthetic */ agco d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public albs(agco agcoVar, arpe arpeVar) {
        super(arpeVar);
        this.d = agcoVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.fv(null, this);
    }
}
