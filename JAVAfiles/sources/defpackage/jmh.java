package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmh extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ jmi b;
    int c;
    jmi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmh(jmi jmiVar, arpe arpeVar) {
        super(arpeVar);
        this.b = jmiVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, 0, this);
    }
}
