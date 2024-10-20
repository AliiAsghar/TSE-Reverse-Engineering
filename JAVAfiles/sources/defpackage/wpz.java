package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpz extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ wqd b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpz(wqd wqdVar, arpe arpeVar) {
        super(arpeVar);
        this.b = wqdVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object b = this.b.b(null, this);
        if (b == arpl.a) {
            return b;
        }
        return new armq(b);
    }
}
