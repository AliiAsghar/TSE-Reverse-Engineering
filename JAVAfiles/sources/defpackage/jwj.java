package defpackage;

/* loaded from: classes2.dex */
public final class jwj extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ jtd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwj(jtd jtdVar, arpe arpeVar) {
        super(arpeVar);
        this.c = jtdVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fv(null, this);
    }
}
