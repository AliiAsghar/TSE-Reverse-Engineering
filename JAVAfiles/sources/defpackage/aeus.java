package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeus extends arrp implements arqv {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeus(aerb aerbVar, long j, cga cgaVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.c = aerbVar;
        this.a = j;
        this.d = cgaVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, cga] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                bwj bwjVar = (bwj) obj;
                ((Number) obj2).intValue();
                Object obj3 = this.c;
                Duration duration = (Duration) obj3;
                agiz.K(duration, (dje) this.d, this.a, bwjVar, bzh.a(this.b | 1));
                return arnb.a;
            }
            bwj bwjVar2 = (bwj) obj;
            ((Number) obj2).intValue();
            Object obj4 = this.c;
            apdy apdyVar = (apdy) obj4;
            agkx.x(apdyVar, (zj) this.d, this.a, bwjVar2, bzh.a(this.b | 1));
            return arnb.a;
        }
        bwj bwjVar3 = (bwj) obj;
        ((Number) obj2).intValue();
        adcx.bU((aerb) this.c, this.a, this.d, bwjVar3, bzh.a(this.b | 1));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeus(Object obj, Object obj2, long j, int i, int i2) {
        super(2);
        this.e = i2;
        this.c = obj;
        this.d = obj2;
        this.a = j;
        this.b = i;
    }
}
