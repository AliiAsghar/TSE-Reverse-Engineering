package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahmg extends ahmj {
    public static final ahmg a = new ahmg();

    private ahmg() {
    }

    @Override // defpackage.ahmj
    public final /* bridge */ /* synthetic */ apbt a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        if (intValue == 0) {
            return null;
        }
        aozy createBuilder = ashg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ashg ashgVar = (ashg) createBuilder.b;
        ashgVar.b |= 1;
        ashgVar.c = intValue;
        if (str != null) {
            ashh n = ahmc.n(str);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashg ashgVar2 = (ashg) createBuilder.b;
            n.getClass();
            ashgVar2.d = n;
            ashgVar2.b |= 2;
        }
        return (ashg) createBuilder.s();
    }

    @Override // defpackage.ahmj
    public final /* synthetic */ apbt b(apbt apbtVar, apbt apbtVar2) {
        int i;
        ashg ashgVar = (ashg) apbtVar;
        ashg ashgVar2 = (ashg) apbtVar2;
        if (ashgVar != null && ashgVar2 != null) {
            if ((ashgVar.b & 1) == 0 || (i = ashgVar.c - ashgVar2.c) == 0) {
                return null;
            }
            aozy createBuilder = ashg.a.createBuilder();
            if ((ashgVar.b & 2) != 0) {
                ashh ashhVar = ashgVar.d;
                if (ashhVar == null) {
                    ashhVar = ashh.a;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashg ashgVar3 = (ashg) createBuilder.b;
                ashhVar.getClass();
                ashgVar3.d = ashhVar;
                ashgVar3.b |= 2;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ashg ashgVar4 = (ashg) createBuilder.b;
            ashgVar4.b |= 1;
            ashgVar4.c = i;
            return (ashg) createBuilder.s();
        }
        return ashgVar;
    }

    @Override // defpackage.ahmj
    public final /* bridge */ /* synthetic */ String c(apbt apbtVar) {
        ashh ashhVar = ((ashg) apbtVar).d;
        if (ashhVar == null) {
            ashhVar = ashh.a;
        }
        return ashhVar.d;
    }
}
