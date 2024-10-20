package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbp extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ zbu c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbp(zbu zbuVar, arpe arpeVar) {
        super(arpeVar);
        this.c = zbuVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, null, this);
    }
}
