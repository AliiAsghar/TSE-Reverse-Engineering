package defpackage;

/* loaded from: classes4.dex */
public final class asbd extends arps {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ asbe c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asbd(asbe asbeVar, arpe arpeVar) {
        super(arpeVar);
        this.c = asbeVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
