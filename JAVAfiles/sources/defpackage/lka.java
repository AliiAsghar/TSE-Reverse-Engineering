package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lka extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ lkb c;
    int d;
    lkb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lka(lkb lkbVar, arpe arpeVar) {
        super(arpeVar);
        this.c = lkbVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.fv(null, this);
    }
}
