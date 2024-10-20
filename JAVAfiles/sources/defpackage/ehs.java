package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehs extends arps {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ eiv c;
    eiv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehs(eiv eivVar, arpe arpeVar) {
        super(arpeVar);
        this.c = eivVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
