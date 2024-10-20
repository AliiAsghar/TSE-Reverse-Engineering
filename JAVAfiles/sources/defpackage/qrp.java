package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qrp extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ qrq c;
    int d;
    qrq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrp(qrq qrqVar, arpe arpeVar) {
        super(arpeVar);
        this.c = qrqVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
