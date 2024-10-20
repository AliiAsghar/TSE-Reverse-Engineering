package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qse extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ qsm c;
    int d;
    qsn e;
    String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qse(qsm qsmVar, arpe arpeVar) {
        super(arpeVar);
        this.c = qsmVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
