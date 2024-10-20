package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xnu extends arps {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ znj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnu(znj znjVar, arpe arpeVar) {
        super(arpeVar);
        this.c = znjVar;
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.R(this);
    }
}
