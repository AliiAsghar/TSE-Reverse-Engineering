package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbt extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ gbu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbt(gbu gbuVar, arpe arpeVar) {
        super(arpeVar);
        this.b = gbuVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.fv(null, this);
    }
}
