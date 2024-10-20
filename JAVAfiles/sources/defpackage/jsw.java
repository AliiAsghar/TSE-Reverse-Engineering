package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsw extends arrp implements arqr {
    final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsw(boolean z, int i) {
        super(1);
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                jhc jhcVar = (jhc) obj;
                jhcVar.getClass();
                return jhc.c(jhcVar, null, null, null, this.a, false, 0, 1015);
            case 1:
                aagd aagdVar = (aagd) obj;
                aagdVar.getClass();
                aozy builder = aagdVar.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                boolean z = this.a;
                aagd aagdVar2 = (aagd) builder.b;
                aagdVar2.b |= 4;
                aagdVar2.e = z;
                apag s = builder.s();
                s.getClass();
                return (aagd) s;
            case 2:
                aozy builder2 = ((uth) obj).toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                boolean z2 = this.a;
                uth uthVar = (uth) builder2.b;
                uthVar.b |= 4;
                uthVar.e = z2;
                return (uth) builder2.s();
            case 3:
                aozy builder3 = ((uth) obj).toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                boolean z3 = this.a;
                uth uthVar2 = (uth) builder3.b;
                uthVar2.b |= 64;
                uthVar2.i = z3;
                return (uth) builder3.s();
            case 4:
                aozy builder4 = ((uth) obj).toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                boolean z4 = this.a;
                uth uthVar3 = (uth) builder4.b;
                uthVar3.b |= 32;
                uthVar3.h = z4;
                return (uth) builder4.s();
            case 5:
                aozy builder5 = ((uth) obj).toBuilder();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                boolean z5 = this.a;
                uth uthVar4 = (uth) builder5.b;
                uthVar4.b |= 8;
                uthVar4.f = z5;
                return (uth) builder5.s();
            case 6:
                aozy builder6 = ((uth) obj).toBuilder();
                if (!builder6.b.isMutable()) {
                    builder6.u();
                }
                boolean z6 = this.a;
                uth uthVar5 = (uth) builder6.b;
                uthVar5.b |= 2;
                uthVar5.d = z6;
                return (uth) builder6.s();
            case 7:
                aozy builder7 = ((uth) obj).toBuilder();
                if (!builder7.b.isMutable()) {
                    builder7.u();
                }
                boolean z7 = this.a;
                uth uthVar6 = (uth) builder7.b;
                uthVar6.b |= 16;
                uthVar6.g = z7;
                return (uth) builder7.s();
            case 8:
                aozy builder8 = ((uth) obj).toBuilder();
                if (!builder8.b.isMutable()) {
                    builder8.u();
                }
                boolean z8 = this.a;
                uth uthVar7 = (uth) builder8.b;
                uthVar7.b |= 1;
                uthVar7.c = z8;
                return (uth) builder8.s();
            case 9:
                abgb abgbVar = (abgb) obj;
                abgbVar.getClass();
                aozy builder9 = abgbVar.toBuilder();
                if (!builder9.b.isMutable()) {
                    builder9.u();
                }
                boolean z9 = this.a;
                abgb abgbVar2 = (abgb) builder9.b;
                abgbVar2.b |= 16;
                abgbVar2.d = z9;
                apag s2 = builder9.s();
                s2.getClass();
                return (abgb) s2;
            case 10:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                if (!this.a) {
                    dhl.d(dhoVar);
                }
                return arnb.a;
            case 11:
                dho dhoVar2 = (dho) obj;
                dhoVar2.getClass();
                if (!this.a) {
                    dhl.d(dhoVar2);
                }
                return arnb.a;
            default:
                int intValue = ((Number) obj).intValue();
                if (!this.a) {
                    intValue = -intValue;
                }
                return Integer.valueOf(intValue);
        }
    }
}
