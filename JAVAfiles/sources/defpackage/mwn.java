package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwn extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ kor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwn(kor korVar, arpe arpeVar) {
        super(arpeVar);
        this.c = korVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.z(null, null, this);
    }
}
