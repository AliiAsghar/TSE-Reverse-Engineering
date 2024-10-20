package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbn extends arps {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ gbo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbn(gbo gboVar, arpe arpeVar) {
        super(arpeVar);
        this.c = gboVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fv(null, this);
    }
}
