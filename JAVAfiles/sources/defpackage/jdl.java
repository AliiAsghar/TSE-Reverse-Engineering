package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdl extends arps {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ jdo d;
    int e;
    jdo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdl(jdo jdoVar, arpe arpeVar) {
        super(arpeVar);
        this.d = jdoVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
