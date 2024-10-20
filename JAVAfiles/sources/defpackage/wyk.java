package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wyk extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyk(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        aozy builder;
        int i = 0;
        boolean z = false;
        switch (this.b) {
            case 0:
                return this.a.a();
            case 1:
                apbt apbtVar = (apbt) obj;
                apbtVar.getClass();
                Object apply = this.a.apply(apbtVar);
                apply.getClass();
                return (apbt) apply;
            case 2:
                Exception exc = (Exception) obj;
                exc.getClass();
                ((alvg) ((alvg) wzx.a.i()).g(exc).h("com/google/android/apps/messaging/shared/sms/TelephonyRetryWrapperInterfaceImpl$telephonyCallWithRetry$1", "invoke", 25, "TelephonyRetryWrapperInterfaceImpl.kt")).q("Initial Telephony call failed. Attempting retry");
                return wzx.b(this.a, vnk.s);
            case 3:
                qei qeiVar = (qei) obj;
                xtj xtjVar = (xtj) ((xft) this.a).b.b();
                qeiVar.getClass();
                return xtjVar.c(qeiVar);
            case 4:
                msh mshVar = (msh) obj;
                mshVar.getClass();
                return ((xii) this.a).c(mshVar.toString());
            case 5:
                String str = (String) obj;
                str.getClass();
                return ((xii) this.a).c(str);
            case 6:
                msh mshVar2 = (msh) obj;
                mshVar2.getClass();
                return ((xii) this.a).c(mshVar2.toString());
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                return ((xii) this.a).c(str2);
            case 8:
                String str3 = (String) obj;
                str3.getClass();
                return ((xii) this.a).c(str3);
            case 9:
                wzq wzqVar = (wzq) obj;
                wzqVar.getClass();
                xlb xlbVar = ((xjf) this.a).a.c;
                if (xlbVar == null) {
                    xlbVar = xlb.a;
                }
                xlbVar.getClass();
                wzqVar.a(yyb.bU(xlbVar));
                return arnb.a;
            case 10:
                wzq wzqVar2 = (wzq) obj;
                wzqVar2.getClass();
                xlb xlbVar2 = ((xjl) this.a).a.c;
                if (xlbVar2 == null) {
                    xlbVar2 = xlb.a;
                }
                xlbVar2.getClass();
                wzqVar2.b(yyb.bU(xlbVar2));
                return arnb.a;
            case 11:
                xlc xlcVar = (xlc) obj;
                xlcVar.getClass();
                vyv de = yyb.de(xlcVar.toBuilder());
                this.a.a(de);
                xlc x = de.x();
                int i2 = x.b;
                if ((i2 & 2) != 0 && (i2 & 1) == 0) {
                    throw new IllegalStateException("Check failed.");
                }
                apax<xlb> apaxVar = x.c;
                apaxVar.getClass();
                if (!apaxVar.isEmpty()) {
                    int i3 = 0;
                    for (xlb xlbVar3 : apaxVar) {
                        xlbVar3.getClass();
                        if (yyb.bV(xlbVar3) && (i3 = i3 + 1) < 0) {
                            aqjn.F();
                        }
                    }
                    if (i3 > 1) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                apax<xlb> apaxVar2 = x.c;
                apaxVar2.getClass();
                if (!apaxVar2.isEmpty()) {
                    int i4 = 0;
                    for (xlb xlbVar4 : apaxVar2) {
                        xlbVar4.getClass();
                        if (yyb.bW(xlbVar4) && (i4 = i4 + 1) < 0) {
                            aqjn.F();
                        }
                    }
                    if (i4 > 1) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                apax<xlb> apaxVar3 = x.c;
                apaxVar3.getClass();
                if (!apaxVar3.isEmpty()) {
                    for (xlb xlbVar5 : apaxVar3) {
                        xlbVar5.getClass();
                        if (yyb.bU(xlbVar5) && (i = i + 1) < 0) {
                            aqjn.F();
                        }
                    }
                    if (i > 1) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                return x;
            case 12:
                vyv vyvVar = (vyv) obj;
                vyvVar.getClass();
                vyvVar.y((xku) this.a);
                return arnb.a;
            case 13:
                vyv vyvVar2 = (vyv) obj;
                vyvVar2.getClass();
                vyvVar2.y((xku) this.a);
                return arnb.a;
            case 14:
                vyv vyvVar3 = (vyv) obj;
                vyvVar3.getClass();
                vyvVar3.B();
                vyvVar3.A();
                vyvVar3.B();
                vyvVar3.z(((xmn) this.a).a);
                vyvVar3.y(((xmn) this.a).b);
                return arnb.a;
            case 15:
                vyv vyvVar4 = (vyv) obj;
                vyvVar4.getClass();
                vyvVar4.y((xku) this.a);
                aozy aozyVar = (aozy) vyvVar4.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                xlc xlcVar2 = (xlc) aozyVar.b;
                xlc xlcVar3 = xlc.a;
                xlcVar2.e = null;
                xlcVar2.b &= -3;
                return arnb.a;
            case 16:
                vyv vyvVar5 = (vyv) obj;
                vyvVar5.getClass();
                vyvVar5.y((xku) this.a);
                return arnb.a;
            case 17:
                qei qeiVar2 = (qei) obj;
                xtj xtjVar2 = (xtj) ((xti) this.a).a.b();
                qeiVar2.getClass();
                if (xtjVar2.c(qeiVar2) == xtg.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                Double d = (Double) obj;
                d.getClass();
                double doubleValue = d.doubleValue();
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                ammu ammuVar = (ammu) aozyVar2.b;
                ammu ammuVar2 = ammu.a;
                ammuVar.b |= 512;
                ammuVar.h = doubleValue;
                return arnb.a;
            case 19:
                uvg uvgVar = (uvg) obj;
                uvgVar.getClass();
                this.a.B().a();
                yyb.aO(uvgVar.a(), "BugleUsageStatistics", "Failed to log P2pSuggestionRequest");
                return arnb.a;
            default:
                apag apagVar = (apag) obj;
                if (apagVar == null || (builder = apagVar.toBuilder()) == null) {
                    return null;
                }
                this.a.a(builder);
                return builder.s();
        }
    }
}
