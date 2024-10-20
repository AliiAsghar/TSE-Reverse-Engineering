package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwb extends arps {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ vwd c;
    int d;
    vwd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwb(vwd vwdVar, arpe arpeVar) {
        super(arpeVar);
        this.c = vwdVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
