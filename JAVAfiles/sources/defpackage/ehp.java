package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehp extends arps {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ egp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehp(egp egpVar, arpe arpeVar) {
        super(arpeVar);
        this.e = egpVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.d(null, null, this);
    }
}
