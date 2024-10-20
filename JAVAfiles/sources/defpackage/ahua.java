package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahua implements ahtx {
    private final acgl a;

    public ahua(acgl acglVar) {
        acglVar.getClass();
        this.a = acglVar;
    }

    private static ListenableFuture k(acir acirVar) {
        return ancd.g(agkx.f(acirVar), abra.class, new xdg(20), andi.a);
    }

    @Override // defpackage.ahtx
    public final ListenableFuture a(String str) {
        str.getClass();
        return k(this.a.b(str));
    }

    @Override // defpackage.ahtx
    public final ListenableFuture b(ahtt ahttVar) {
        ahttVar.getClass();
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abot(ahttVar, 12);
        ajxpVar.d = new Feature[]{acgb.a};
        ajxpVar.c();
        abtl b = ajxpVar.b();
        acgl acglVar = this.a;
        return k(acglVar.g(b).c(new abpk(acglVar, ahttVar, 4, null)));
    }

    @Override // defpackage.ahtx
    public final ListenableFuture c(String str, String str2) {
        str2.getClass();
        return k(this.a.y(str, str2).b(andi.a, new acig() { // from class: ahtz
            @Override // defpackage.acig
            public final Object a(acir acirVar) {
                int i;
                ahtw ahtwVar;
                Configurations configurations = (Configurations) acirVar.h();
                aozy createBuilder = ahtu.a.createBuilder();
                String str3 = configurations.a;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                ahtu ahtuVar = (ahtu) apagVar;
                str3.getClass();
                ahtuVar.b |= 1;
                ahtuVar.c = str3;
                String str4 = configurations.c;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                ahtu ahtuVar2 = (ahtu) apagVar2;
                str4.getClass();
                ahtuVar2.b |= 4;
                ahtuVar2.e = str4;
                boolean z = configurations.f;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                ahtu ahtuVar3 = (ahtu) apagVar3;
                ahtuVar3.b |= 8;
                ahtuVar3.h = z;
                long j = configurations.g;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                ahtu ahtuVar4 = (ahtu) createBuilder.b;
                ahtuVar4.b |= 16;
                ahtuVar4.i = j;
                byte[] bArr = configurations.b;
                int i2 = 2;
                if (bArr != null) {
                    aozb w = aozb.w(bArr);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ahtu ahtuVar5 = (ahtu) createBuilder.b;
                    ahtuVar5.b |= 2;
                    ahtuVar5.d = w;
                }
                Configuration[] configurationArr = configurations.d;
                int length = configurationArr.length;
                int i3 = 0;
                while (i3 < length) {
                    Configuration configuration = configurationArr[i3];
                    Flag[] flagArr = configuration.b;
                    int length2 = flagArr.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        Flag flag = flagArr[i4];
                        int i5 = flag.g;
                        if (i5 != 1) {
                            if (i5 != i2) {
                                if (i5 != 3) {
                                    if (i5 != 4) {
                                        if (i5 == 5) {
                                            aozy createBuilder2 = ahtw.a.createBuilder();
                                            String str5 = flag.a;
                                            if (!createBuilder2.b.isMutable()) {
                                                createBuilder2.u();
                                            }
                                            ahtw ahtwVar2 = (ahtw) createBuilder2.b;
                                            str5.getClass();
                                            ahtwVar2.b |= 1;
                                            ahtwVar2.e = str5;
                                            aozb w2 = aozb.w(flag.f());
                                            if (!createBuilder2.b.isMutable()) {
                                                createBuilder2.u();
                                            }
                                            ahtw ahtwVar3 = (ahtw) createBuilder2.b;
                                            ahtwVar3.c = 5;
                                            ahtwVar3.d = w2;
                                            ahtwVar = (ahtw) createBuilder2.s();
                                        } else {
                                            throw new IllegalArgumentException(a.bV(i5, "Unrecognized flag type: "));
                                        }
                                    } else {
                                        aozy createBuilder3 = ahtw.a.createBuilder();
                                        String str6 = flag.a;
                                        if (!createBuilder3.b.isMutable()) {
                                            createBuilder3.u();
                                        }
                                        ahtw ahtwVar4 = (ahtw) createBuilder3.b;
                                        str6.getClass();
                                        ahtwVar4.b |= 1;
                                        ahtwVar4.e = str6;
                                        String c = flag.c();
                                        if (!createBuilder3.b.isMutable()) {
                                            createBuilder3.u();
                                        }
                                        ahtw ahtwVar5 = (ahtw) createBuilder3.b;
                                        ahtwVar5.c = 4;
                                        ahtwVar5.d = c;
                                        ahtwVar = (ahtw) createBuilder3.s();
                                    }
                                } else {
                                    aozy createBuilder4 = ahtw.a.createBuilder();
                                    String str7 = flag.a;
                                    if (!createBuilder4.b.isMutable()) {
                                        createBuilder4.u();
                                    }
                                    ahtw ahtwVar6 = (ahtw) createBuilder4.b;
                                    str7.getClass();
                                    ahtwVar6.b |= 1;
                                    ahtwVar6.e = str7;
                                    double a = flag.a();
                                    if (!createBuilder4.b.isMutable()) {
                                        createBuilder4.u();
                                    }
                                    ahtw ahtwVar7 = (ahtw) createBuilder4.b;
                                    ahtwVar7.c = 3;
                                    ahtwVar7.d = Double.valueOf(a);
                                    ahtwVar = (ahtw) createBuilder4.s();
                                }
                                i = 2;
                            } else {
                                aozy createBuilder5 = ahtw.a.createBuilder();
                                String str8 = flag.a;
                                if (!createBuilder5.b.isMutable()) {
                                    createBuilder5.u();
                                }
                                ahtw ahtwVar8 = (ahtw) createBuilder5.b;
                                str8.getClass();
                                ahtwVar8.b |= 1;
                                ahtwVar8.e = str8;
                                boolean e = flag.e();
                                if (!createBuilder5.b.isMutable()) {
                                    createBuilder5.u();
                                }
                                ahtw ahtwVar9 = (ahtw) createBuilder5.b;
                                i = 2;
                                ahtwVar9.c = 2;
                                ahtwVar9.d = Boolean.valueOf(e);
                                ahtwVar = (ahtw) createBuilder5.s();
                            }
                        } else {
                            i = i2;
                            aozy createBuilder6 = ahtw.a.createBuilder();
                            String str9 = flag.a;
                            if (!createBuilder6.b.isMutable()) {
                                createBuilder6.u();
                            }
                            ahtw ahtwVar10 = (ahtw) createBuilder6.b;
                            str9.getClass();
                            ahtwVar10.b |= 1;
                            ahtwVar10.e = str9;
                            long b = flag.b();
                            if (!createBuilder6.b.isMutable()) {
                                createBuilder6.u();
                            }
                            ahtw ahtwVar11 = (ahtw) createBuilder6.b;
                            ahtwVar11.c = 1;
                            ahtwVar11.d = Long.valueOf(b);
                            ahtwVar = (ahtw) createBuilder6.s();
                        }
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ahtu ahtuVar6 = (ahtu) createBuilder.b;
                        ahtwVar.getClass();
                        apax apaxVar = ahtuVar6.f;
                        if (!apaxVar.c()) {
                            ahtuVar6.f = apag.mutableCopy(apaxVar);
                        }
                        ahtuVar6.f.add(ahtwVar);
                        i4++;
                        i2 = i;
                    }
                    int i6 = i2;
                    String[] strArr = configuration.c;
                    if (strArr != null) {
                        for (String str10 : strArr) {
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            ahtu ahtuVar7 = (ahtu) createBuilder.b;
                            str10.getClass();
                            apax apaxVar2 = ahtuVar7.g;
                            if (!apaxVar2.c()) {
                                ahtuVar7.g = apag.mutableCopy(apaxVar2);
                            }
                            ahtuVar7.g.add(str10);
                        }
                    }
                    i3++;
                    i2 = i6;
                }
                return (ahtu) createBuilder.s();
            }
        }));
    }

    @Override // defpackage.ahtx
    public final ListenableFuture d(String str) {
        str.getClass();
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abot(str, 9);
        return k(this.a.g(ajxpVar.b()).b(andi.a, new acca(3)));
    }

    @Override // defpackage.ahtx
    public final ListenableFuture e() {
        ajxp ajxpVar = new ajxp(null);
        ajxpVar.c = new abxb(6);
        ajxpVar.d = new Feature[]{acgb.i};
        ajxpVar.c();
        return k(this.a.g(ajxpVar.b()));
    }

    @Override // defpackage.ahtx
    public final ListenableFuture f(String str, int i, String[] strArr, byte[] bArr) {
        str.getClass();
        strArr.getClass();
        return k(this.a.c(str, i, strArr, bArr));
    }

    @Override // defpackage.ahtx
    public final ListenableFuture g(String str, aocv aocvVar) {
        return k(this.a.d(str, aocvVar));
    }

    @Override // defpackage.ahtx
    public final ListenableFuture h(String str, aocv aocvVar, byte[] bArr) {
        acgl acglVar = this.a;
        return k(acglVar.d(str, aocvVar).c(new aogv(acglVar, str, bArr, 1)));
    }

    @Override // defpackage.ahtx
    public final boolean i() {
        return this.a.w(12200000);
    }

    @Override // defpackage.ahtx
    public final ListenableFuture j(ahuy ahuyVar) {
        String str;
        String simpleName = acgq.class.getSimpleName();
        acgl acglVar = this.a;
        absy e = acglVar.e(ahuyVar, simpleName);
        String a = abvj.a();
        if (a == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = a + "|" + System.identityHashCode(acgq.class);
        }
        acdk acdkVar = new acdk(str, e, 4);
        abxb abxbVar = new abxb(7);
        abte abteVar = new abte();
        abteVar.c = e;
        abteVar.a = acdkVar;
        abteVar.b = abxbVar;
        abteVar.d = new Feature[]{acgb.d};
        abteVar.a();
        return k(acglVar.v(abteVar.b()));
    }
}
