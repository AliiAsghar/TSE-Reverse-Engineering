package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfp extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ mfq c;
    int d;
    mfq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfp(mfq mfqVar, arpe arpeVar) {
        super(arpeVar);
        this.c = mfqVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
