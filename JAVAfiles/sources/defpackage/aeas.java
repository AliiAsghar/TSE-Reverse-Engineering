package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeas extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ adtl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeas(adtl adtlVar, arpe arpeVar) {
        super(arpeVar);
        this.c = adtlVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.m(null, this);
    }
}
