package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class psm extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ qxr c;
    public qxr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psm(qxr qxrVar, arpe arpeVar) {
        super(arpeVar);
        this.c = qxrVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.m(null, this);
    }
}
