package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class affl extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ affq c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public affl(affq affqVar, arpe arpeVar) {
        super(arpeVar);
        this.c = affqVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(this);
    }
}
