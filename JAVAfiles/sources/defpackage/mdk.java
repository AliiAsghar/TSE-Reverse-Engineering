package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdk extends arps {
    public /* synthetic */ Object a;
    public int b;
    public mdg c;
    final /* synthetic */ mgu d;
    public mgu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdk(mgu mguVar, arpe arpeVar) {
        super(arpeVar);
        this.d = mguVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.f(null, 0L, this);
    }
}
