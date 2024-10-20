package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfk extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ wfl c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfk(wfl wflVar, arpe arpeVar) {
        super(arpeVar);
        this.c = wflVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(null, this);
    }
}
