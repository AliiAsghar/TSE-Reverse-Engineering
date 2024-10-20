package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlf {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/DraftUiAdapterImpl");
    public jlb b;
    public final ascv c;
    private final ascv d;

    public jlf(arwe arweVar, jpd jpdVar, jto jtoVar, jmc jmcVar, jsy jsyVar, Optional optional, Optional optional2, jrv jrvVar, jre jreVar, Optional optional3) {
        ascv qjrVar;
        ascv qjrVar2;
        Object obj;
        Object obj2;
        arweVar.getClass();
        jpdVar.getClass();
        jtoVar.getClass();
        jmcVar.getClass();
        jsyVar.getClass();
        jrvVar.getClass();
        jreVar.getClass();
        qjh.l(jpdVar.c, jpdVar.b, new ikq(jpdVar, (arpe) null, 20), 2);
        int i = ascp.a;
        ascp ascpVar = asco.b;
        ascv ascvVar = jsyVar.d;
        Object orElse = optional.map(new ivi(jbs.r, 12)).orElse(new qjr(jlc.a));
        orElse.getClass();
        Object orElse2 = optional3.map(new ivi(jld.b, 13)).orElse(new qjr(jlc.c));
        orElse2.getClass();
        Object orElse3 = optional2.map(new ivi(jld.a, 14)).orElse(new qjr(jlc.d));
        orElse3.getClass();
        jle jleVar = new jle(this, 0);
        ascvVar.getClass();
        ascv[] ascvVarArr = {ascvVar, (ascv) orElse, (ascv) orElse2, (ascv) orElse3};
        int i2 = 0;
        while (true) {
            if (i2 < 4) {
                ascv ascvVar2 = ascvVarArr[i2];
                if (ascvVar2 != null && !(ascvVar2 instanceof qjr)) {
                    ascv[] ascvVarArr2 = (ascv[]) aqil.o(ascvVarArr).toArray(new ascv[0]);
                    jdn jdnVar = new jdn((asai[]) Arrays.copyOf(ascvVarArr2, ascvVarArr2.length), ascvVarArr, (Object) jleVar, 13);
                    ArrayList arrayList = new ArrayList(4);
                    for (int i3 = 0; i3 < 4; i3++) {
                        ascv ascvVar3 = ascvVarArr[i3];
                        if (ascvVar3 != null) {
                            obj2 = ascvVar3.c();
                        } else {
                            obj2 = null;
                        }
                        arrayList.add(obj2);
                    }
                    Object[] array = arrayList.toArray(new Object[0]);
                    qjrVar = arrn.T(jdnVar, arweVar, ascpVar, jleVar.a(array[0], array[1], array[2], array[3]));
                } else {
                    i2++;
                }
            } else {
                qjrVar = new qjr(new qjz(ascvVarArr, jleVar, 3));
                break;
            }
        }
        this.d = qjrVar;
        ascp ascpVar2 = asco.b;
        ascv ascvVar4 = jtoVar.m;
        ascv ascvVar5 = jmcVar.g;
        ascv a2 = jrvVar.a();
        ascv ascvVar6 = jreVar.d;
        jke jkeVar = new jke(2);
        ascvVar4.getClass();
        ascvVar5.getClass();
        a2.getClass();
        qjrVar.getClass();
        ascvVar6.getClass();
        ascv[] ascvVarArr3 = {ascvVar4, ascvVar5, a2, qjrVar, ascvVar6};
        int i4 = 0;
        while (true) {
            if (i4 < 5) {
                ascv ascvVar7 = ascvVarArr3[i4];
                if (ascvVar7 != null && !(ascvVar7 instanceof qjr)) {
                    ascv[] ascvVarArr4 = (ascv[]) aqil.o(ascvVarArr3).toArray(new ascv[0]);
                    jdn jdnVar2 = new jdn((asai[]) Arrays.copyOf(ascvVarArr4, ascvVarArr4.length), ascvVarArr3, (Object) jkeVar, 14);
                    ArrayList arrayList2 = new ArrayList(5);
                    for (int i5 = 0; i5 < 5; i5++) {
                        ascv ascvVar8 = ascvVarArr3[i5];
                        if (ascvVar8 != null) {
                            obj = ascvVar8.c();
                        } else {
                            obj = null;
                        }
                        arrayList2.add(obj);
                    }
                    Object[] array2 = arrayList2.toArray(new Object[0]);
                    qjrVar2 = arrn.T(jdnVar2, arweVar, ascpVar2, jkeVar.f(array2[0], array2[1], array2[2], array2[3], array2[4]));
                } else {
                    i4++;
                }
            } else {
                qjrVar2 = new qjr(new qjz(ascvVarArr3, jkeVar, 4));
                break;
            }
        }
        this.c = qjrVar2;
    }
}
