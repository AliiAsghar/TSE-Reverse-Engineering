package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vpj extends arps {
    /* synthetic */ Object a;
    final /* synthetic */ vpk b;
    int c;
    vpk d;
    qei e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpj(vpk vpkVar, arpe arpeVar) {
        super(arpeVar);
        this.b = vpkVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object h = this.b.h(null, 0, this);
        if (h == arpl.a) {
            return h;
        }
        return new armq(h);
    }
}
