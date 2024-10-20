package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlo extends arps {
    public Object a;
    public /* synthetic */ Object b;
    public int c;
    final /* synthetic */ jxv d;
    public jxv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlo(jxv jxvVar, arpe arpeVar) {
        super(arpeVar);
        this.d = jxvVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.f(null, null, false, false, this);
    }
}
