package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvc extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ jvd c;
    int d;
    jvd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvc(jvd jvdVar, arpe arpeVar) {
        super(arpeVar);
        this.c = jvdVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
