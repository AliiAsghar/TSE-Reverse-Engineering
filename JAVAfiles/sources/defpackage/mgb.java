package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgb extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ lfl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgb(lfl lflVar, arpe arpeVar) {
        super(arpeVar);
        this.c = lflVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.j(this);
    }
}
