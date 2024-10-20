package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnc extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ lxe c;
    public lxe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnc(lxe lxeVar, arpe arpeVar) {
        super(arpeVar);
        this.c = lxeVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.k(null, this);
    }
}
