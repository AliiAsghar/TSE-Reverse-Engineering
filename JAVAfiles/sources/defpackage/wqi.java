package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wqi extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ wqq b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqi(wqq wqqVar, arpe arpeVar) {
        super(arpeVar);
        this.b = wqqVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object a = this.b.a(this);
        if (a == arpl.a) {
            return a;
        }
        return new armq(a);
    }
}
