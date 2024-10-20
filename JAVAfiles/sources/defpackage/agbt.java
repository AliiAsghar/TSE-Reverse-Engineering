package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agbt extends arpw implements arqr {
    int a;
    final /* synthetic */ agbv b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbt(agbv agbvVar, boolean z, int i, arpe arpeVar) {
        super(1, arpeVar);
        this.b = agbvVar;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new agbt(this.b, this.c, this.d, (arpe) obj).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            agbv agbvVar = this.b;
            ListenableFuture b = agbvVar.e.b(new adhe(new agbs(agbvVar, this.c, this.d), 17), andi.a);
            this.a = 1;
            if (arro.F(b, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }
}
