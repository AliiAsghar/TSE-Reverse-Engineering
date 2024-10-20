package defpackage;

/* loaded from: classes3.dex */
public final class zbc extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ lgn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbc(lgn lgnVar, arpe arpeVar) {
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
