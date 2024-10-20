package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmb extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ afmd c;
    int d;
    afmd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmb(afmd afmdVar, arpe arpeVar) {
        super(arpeVar);
        this.c = afmdVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
