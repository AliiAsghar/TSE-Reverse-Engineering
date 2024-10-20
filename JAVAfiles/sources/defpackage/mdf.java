package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdf extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ lru c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdf(lru lruVar, arpe arpeVar) {
        super(arpeVar);
        this.c = lruVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
