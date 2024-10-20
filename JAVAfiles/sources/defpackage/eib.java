package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eib extends arps {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ eij d;
    int e;
    eij f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eib(eij eijVar, arpe arpeVar) {
        super(arpeVar);
        this.d = eijVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(false, this);
    }
}
