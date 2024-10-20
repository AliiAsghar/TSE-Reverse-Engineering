package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzv extends arps {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ fzq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzv(fzq fzqVar, arpe arpeVar) {
        super(arpeVar);
        this.c = fzqVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fv(null, this);
    }
}
