package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uam implements algk {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ uam(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                aozy builder = ((ual) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                boolean z2 = this.a;
                ual ualVar = (ual) builder.b;
                ualVar.b = 1 | ualVar.b;
                ualVar.c = z2;
                return (ual) builder.s();
            case 1:
                aozy builder2 = ((ual) obj).toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                boolean z3 = this.a;
                ual ualVar2 = (ual) builder2.b;
                ualVar2.b |= 2;
                ualVar2.d = z3;
                return (ual) builder2.s();
            case 2:
                akfc akfcVar = uwu.a;
                aozy builder3 = ((uwt) obj).toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                boolean z4 = this.a;
                uwt uwtVar = (uwt) builder3.b;
                uwtVar.b |= 8;
                uwtVar.d = z4;
                return (uwt) builder3.s();
            case 3:
                if (!((Boolean) obj).booleanValue() || this.a) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                utz utzVar = xjw.a;
                aozy builder4 = ((xju) obj).toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                boolean z5 = this.a;
                xju xjuVar = (xju) builder4.b;
                xjuVar.b = 1 | xjuVar.b;
                xjuVar.c = z5;
                return (xju) builder4.s();
            case 5:
                zkb zkbVar = (zkb) obj;
                uuf uufVar = zke.a;
                zkbVar.getClass();
                aozy builder5 = zkbVar.toBuilder();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                boolean z6 = this.a;
                zkb zkbVar2 = (zkb) builder5.b;
                zkbVar2.b |= 16;
                zkbVar2.g = z6;
                return (zkb) builder5.s();
            case 6:
                zkb zkbVar3 = (zkb) obj;
                uuf uufVar2 = zke.a;
                zkbVar3.getClass();
                aozy builder6 = zkbVar3.toBuilder();
                if (!builder6.b.isMutable()) {
                    builder6.u();
                }
                boolean z7 = this.a;
                zkb zkbVar4 = (zkb) builder6.b;
                zkbVar4.b |= 2;
                zkbVar4.d = z7;
                return (zkb) builder6.s();
            case 7:
                zkb zkbVar5 = (zkb) obj;
                uuf uufVar3 = zke.a;
                zkbVar5.getClass();
                aozy builder7 = zkbVar5.toBuilder();
                if (!builder7.b.isMutable()) {
                    builder7.u();
                }
                boolean z8 = this.a;
                zkb zkbVar6 = (zkb) builder7.b;
                zkbVar6.b |= 64;
                zkbVar6.i = z8;
                return (zkb) builder7.s();
            case 8:
                zkb zkbVar7 = (zkb) obj;
                uuf uufVar4 = zke.a;
                zkbVar7.getClass();
                aozy builder8 = zkbVar7.toBuilder();
                if (!builder8.b.isMutable()) {
                    builder8.u();
                }
                boolean z9 = this.a;
                zkb zkbVar8 = (zkb) builder8.b;
                zkbVar8.b |= 8;
                zkbVar8.f = z9;
                return (zkb) builder8.s();
            case 9:
                zkb zkbVar9 = (zkb) obj;
                uuf uufVar5 = zke.a;
                zkbVar9.getClass();
                aozy builder9 = zkbVar9.toBuilder();
                if (!builder9.b.isMutable()) {
                    builder9.u();
                }
                boolean z10 = this.a;
                zkb zkbVar10 = (zkb) builder9.b;
                zkbVar10.b = 1 | zkbVar10.b;
                zkbVar10.c = z10;
                return (zkb) builder9.s();
            default:
                zkb zkbVar11 = (zkb) obj;
                uuf uufVar6 = zke.a;
                zkbVar11.getClass();
                aozy builder10 = zkbVar11.toBuilder();
                if (!builder10.b.isMutable()) {
                    builder10.u();
                }
                boolean z11 = this.a;
                zkb zkbVar12 = (zkb) builder10.b;
                zkbVar12.b |= 4;
                zkbVar12.e = z11;
                return (zkb) builder10.s();
        }
    }
}
