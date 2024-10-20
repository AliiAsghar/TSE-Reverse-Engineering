package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qlg extends arps {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ qlh d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlg(qlh qlhVar, arpe arpeVar) {
        super(arpeVar);
        this.d = qlhVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(false, this);
    }
}
