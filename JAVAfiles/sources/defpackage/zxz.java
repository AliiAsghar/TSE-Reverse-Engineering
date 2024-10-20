package defpackage;

/* loaded from: classes2.dex */
public final class zxz extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ lgn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxz(lgn lgnVar, arpe arpeVar) {
        super(arpeVar);
        this.c = lgnVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fv(null, this);
    }
}
