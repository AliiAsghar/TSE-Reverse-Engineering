package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arzd extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ arzf b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arzd(arzf arzfVar, arpe arpeVar) {
        super(arpeVar);
        this.b = arzfVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object k = arzf.k(this.b, this);
        if (k == arpl.a) {
            return k;
        }
        return new arzn(k);
    }
}
