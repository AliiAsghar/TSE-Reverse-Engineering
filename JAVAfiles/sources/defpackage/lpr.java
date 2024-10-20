package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpr extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ nei c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpr(nei neiVar, arpe arpeVar) {
        super(arpeVar);
        this.c = neiVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
