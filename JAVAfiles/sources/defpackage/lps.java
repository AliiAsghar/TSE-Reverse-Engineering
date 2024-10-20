package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lps extends arps {
    public /* synthetic */ Object a;
    public int b;
    public akrh c;
    final /* synthetic */ nei d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lps(nei neiVar, arpe arpeVar) {
        super(arpeVar);
        this.d = neiVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
