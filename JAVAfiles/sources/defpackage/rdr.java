package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdr extends arps {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ reb c;
    int d;
    reb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdr(reb rebVar, arpe arpeVar) {
        super(arpeVar);
        this.c = rebVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m(null, this);
    }
}
