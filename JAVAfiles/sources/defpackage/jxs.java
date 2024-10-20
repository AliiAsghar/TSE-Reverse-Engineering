package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxs extends arps {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ jxt c;
    int d;
    jxt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxs(jxt jxtVar, arpe arpeVar) {
        super(arpeVar);
        this.c = jxtVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(0, this);
    }
}
