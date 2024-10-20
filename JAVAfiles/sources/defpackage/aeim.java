package defpackage;

import android.net.Uri;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.csv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeim {
    public static final /* synthetic */ int a = 0;
    private static final Set b = aqil.r(new aein[]{aein.n, aein.o, aein.p, aein.q});

    public static final cti a(byn bynVar) {
        return (cti) bynVar.a();
    }

    public static final diy b(byn bynVar) {
        return (diy) bynVar.a();
    }

    public static final Object c(crk crkVar, diy diyVar, cti ctiVar, List list, boolean z, arpe arpeVar) {
        Object bn;
        bn = adom.bn(crkVar, new jmq(z, diyVar, ctiVar, list, 3), false, arpeVar);
        if (bn == arpl.a) {
            return bn;
        }
        return arnb.a;
    }

    public static final void d(String str, cga cgaVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(2071795734);
        if (i5 == 0) {
            if (true != c.G(str)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(cgaVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            bqv.c(cgaVar, bmp.c(c).a, bmp.a(c).p, 0L, brg.a, brg.a, null, cdk.e(-747277349, new zny(str, 18), c), c, 120);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(str, cgaVar, i, 11);
        }
    }

    public static final void e(akn aknVar, aeid aeidVar, boolean z, bwj bwjVar, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6 = i & 14;
        bwj c = bwjVar.c(477427974);
        if (i6 == 0) {
            if (true != c.G(aknVar)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(aeidVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (true != c.H(z)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && c.L()) {
            c.v();
        } else {
            Uri parse = Uri.parse(aeidVar.a);
            int i7 = csv.a;
            csv csvVar = csv.a.d;
            cga.a aVar = cga.e;
            int i8 = cfq.a;
            cga e = amv.e(aknVar.a(aVar, cfq.a.m), 48.0f, 400.0f);
            if (z) {
                f = 16.0f;
            } else {
                f = 0.0f;
            }
            cga a2 = chk.a(amh.i(e, f, brg.a, 2), bmp.c(c).c);
            c.y(262416107);
            int i9 = i2 & 112;
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (i9 == 32 || T == bwj.a.a) {
                T = new abcv(aeidVar, 9);
                bwkVar.ad(T);
            }
            bwkVar.Y();
            aeke.bf(parse, null, adw.c(a2, false, null, (arqg) T, 7), null, null, null, csvVar, null, brg.a, 500, 500, null, null, null, null, null, c, 12582920, 432, 518008);
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new jyn(aknVar, aeidVar, z, i, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(defpackage.aeip r34, defpackage.cga r35, long r36, defpackage.dje r38, long r39, defpackage.arqr r41, boolean r42, defpackage.arqv r43, defpackage.bwj r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeim.f(aeip, cga, long, dje, long, arqr, boolean, arqv, bwj, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:78|(1:243)|82|(1:242)|86|(1:88)|89|(1:91)|92|(1:94)|95|(1:97)|98|(1:241)|102|(1:240)(1:106)|107|(1:237)|111|(1:113)|114|(1:236)|118|(1:235)|122|(1:234)|126|(4:129|(2:134|135)(3:137|138|139)|136|127)|141|142|(3:210|(3:213|(10:215|216|(4:219|(5:221|(1:223)|224|225|226)(2:228|229)|227|217)|230|231|147|(4:150|(3:170|171|172)(5:152|153|(3:155|(1:157)(1:162)|158)(2:163|(3:167|168|169))|159|160)|161|148)|205|206|207)(1:232)|211)|233)|146|147|(1:148)|205|206|207) */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0502, code lost:
    
        r0 = new defpackage.armo(new defpackage.dhv(r11), defpackage.arnv.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x05fb, code lost:
    
        if (r8.G(r0) == false) goto L168;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:172:0x03d4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x063f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(java.lang.String r41, java.util.List r42, java.lang.String r43, defpackage.cga r44, long r45, defpackage.dje r47, long r48, boolean r50, defpackage.arqr r51, defpackage.bwj r52, int r53) {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeim.g(java.lang.String, java.util.List, java.lang.String, cga, long, dje, long, boolean, arqr, bwj, int):void");
    }

    private static final dij h(arml armlVar) {
        return (dij) armlVar.a();
    }

    private static final List i(List list, int i, int i2) {
        aron aronVar = new aron((byte[]) null);
        int a2 = ((aeig) list.get(i)).a() + i2;
        for (aeig aeigVar : list.subList(i + 1, list.size())) {
            aronVar.add(aeigVar.c(arrn.r(0, aeigVar.b() - a2), aeigVar.a() - a2));
        }
        return aqjn.x(aronVar);
    }

    private static final armo j(String str, List list) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (i < size) {
            aeig aeigVar = (aeig) list.get(i);
            if (!(aeigVar instanceof aeid) && !(aeigVar instanceof aeic)) {
                int i2 = i + 1;
                if (n(aeigVar)) {
                    aeig aeigVar2 = aeigVar;
                    do {
                        aeig aeigVar3 = (aeig) aqjn.aa(list, i2);
                        if (aeigVar3 == null) {
                            break;
                        }
                        if (n(aeigVar3)) {
                            aeigVar2 = aeigVar3;
                        } else if (aeigVar3.b() > aeigVar2.a()) {
                            break;
                        }
                        i2++;
                    } while (i2 <= list.size());
                    if (i2 == list.size()) {
                        obj2 = null;
                        obj = null;
                    } else {
                        String substring = str.substring(aeigVar2.a());
                        substring.getClass();
                        String obj3 = arsd.F(substring).toString();
                        armo j = j(obj3, i(list, i2 - 1, substring.length() - obj3.length()));
                        obj = j.a;
                        obj2 = j.b;
                    }
                    aron aronVar = new aron((byte[]) null);
                    if (aeigVar.b() > 0) {
                        String substring2 = str.substring(0, aeigVar.b());
                        substring2.getClass();
                        aronVar.add(substring2);
                    }
                    String substring3 = str.substring(aeigVar.b(), aeigVar2.a());
                    substring3.getClass();
                    aronVar.add(substring3);
                    List list2 = (List) obj;
                    if (list2 != null) {
                        aronVar.addAll(list2);
                    }
                    List x = aqjn.x(aronVar);
                    aron aronVar2 = new aron((byte[]) null);
                    if (aeigVar.b() > 0) {
                        aronVar2.add(list.subList(0, i));
                    }
                    List<aeig> subList = list.subList(i, i2);
                    ArrayList arrayList = new ArrayList(aqjn.J(subList, 10));
                    for (aeig aeigVar4 : subList) {
                        arrayList.add(aeigVar4.c(aeigVar4.b() - aeigVar.b(), aeigVar4.a() - aeigVar.b()));
                    }
                    aronVar2.add(arrayList);
                    List list3 = (List) obj2;
                    if (list3 != null) {
                        aronVar2.addAll(list3);
                    }
                    return new armo(x, aqjn.x(aronVar2));
                }
                i = i2;
            } else {
                String substring4 = str.substring(aeigVar.a());
                substring4.getClass();
                String obj4 = arsd.F(substring4).toString();
                armo j2 = j(obj4, i(list, i, substring4.length() - obj4.length()));
                Object obj5 = j2.a;
                Object obj6 = j2.b;
                String substring5 = str.substring(0, aeigVar.b());
                substring5.getClass();
                String obj7 = arsd.E(substring5).toString();
                aron aronVar3 = new aron((byte[]) null);
                boolean z = aeigVar instanceof aeic;
                if (z) {
                    aeic aeicVar = (aeic) aeigVar;
                    String substring6 = str.substring(0, aeicVar.a);
                    substring6.getClass();
                    aronVar3.add(arsd.E(substring6).toString());
                    String substring7 = str.substring(aeicVar.a, aeicVar.b - 1);
                    substring7.getClass();
                    aronVar3.add(substring7);
                } else {
                    if (obj7.length() > 0) {
                        aronVar3.add(obj7);
                    }
                    aronVar3.add(null);
                }
                aronVar3.addAll((Collection) obj5);
                List x2 = aqjn.x(aronVar3);
                aron aronVar4 = new aron((byte[]) null);
                if (i == 0) {
                    if (z || obj7.length() > 0) {
                        aronVar4.add(arnv.a);
                    }
                } else {
                    aronVar4.add(list.subList(0, i));
                }
                aronVar4.add(aqjn.y(aeigVar));
                aronVar4.addAll((Collection) obj6);
                return new armo(x2, aqjn.x(aronVar4));
            }
        }
        if (str.length() == 0) {
            str = null;
        }
        return new armo(aqjn.y(str), aqjn.y(list));
    }

    private static final void k(List list, int i, boolean z) {
        int b2;
        aeig aeigVar = (aeig) list.get(i);
        if (z) {
            b2 = aeigVar.b() + 4;
        } else {
            b2 = aeigVar.b();
        }
    }

    private static final boolean l(aeig aeigVar) {
        if ((aeigVar instanceof aeie) && ((aeie) aeigVar).a == aein.i) {
            return true;
        }
        return false;
    }

    private static final boolean m(List list) {
        if (list.size() != 1 || !(list.get(0) instanceof aeid)) {
            return false;
        }
        return true;
    }

    private static final boolean n(aeig aeigVar) {
        if ((aeigVar instanceof aeie) && b.contains(((aeie) aeigVar).a)) {
            return true;
        }
        return false;
    }

    private static /* synthetic */ dip o(arml armlVar) {
        return (dip) armlVar.a();
    }
}
