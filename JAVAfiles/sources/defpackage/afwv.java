package defpackage;

import android.graphics.Point;
import android.view.View;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.material.snackbar.Snackbar;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cwl;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class afwv {
    private afwv() {
    }

    public static boolean A(View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static void B(CharSequence charSequence, View view) {
        view.getClass();
        Snackbar.q(view, charSequence, 0).i();
    }

    public static Object C(enh enhVar, enf enfVar, arqg arqgVar, arpe arpeVar) {
        arvp arvpVar = new arvp(arhi.i(arpeVar), 1);
        arvpVar.A();
        afzw afzwVar = new afzw(enfVar, enhVar, arvpVar);
        enhVar.c(afzwVar);
        arvpVar.d(new afho(enhVar, afzwVar, 12));
        arqgVar.a();
        Object l = arvpVar.l();
        arpl arplVar = arpl.a;
        if (l == arplVar) {
            arpeVar.getClass();
        }
        if (l == arplVar) {
            return l;
        }
        return arnb.a;
    }

    public static /* synthetic */ aftw E(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aftw) s;
    }

    public static afsx F(afts aftsVar) {
        return aftsVar.l().c();
    }

    public static List G() {
        return (List) aftm.b.a();
    }

    public static afsx H(String str) {
        Object obj;
        afsq afsqVar;
        String str2;
        String str3;
        str.getClass();
        List aa = arsd.aa(str, new char[]{'/'});
        if (aa.size() != 2) {
            aa = null;
        }
        if (aa == null) {
            return null;
        }
        try {
            int i = afsw.b;
            Iterator it = afst.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (d.F(((afsw) obj).b(), aqjn.X(aa))) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            afsw afswVar = (afsw) obj;
            if (afswVar == null) {
                afswVar = new afsr((String) aqjn.X(aa));
            }
            List aa2 = arsd.aa((CharSequence) aqjn.ac(aa), new char[]{';'});
            String str4 = (String) aqjn.X(aa2);
            if (aa2.size() != 2) {
                aa2 = null;
            }
            if (aa2 != null && (str2 = (String) aqjn.ac(aa2)) != null) {
                List aa3 = arsd.aa(str2, new char[]{'='});
                String str5 = (String) aqjn.X(aa3);
                if (aa3.size() != 2) {
                    aa3 = null;
                }
                if (aa3 != null) {
                    str3 = (String) aqjn.ac(aa3);
                } else {
                    str3 = null;
                }
                afsqVar = new afsq(str5, str3);
            } else {
                afsqVar = null;
            }
            return new afsx(afswVar, str4, afsqVar);
        } catch (IllegalArgumentException e) {
            ((alvg) ((alvg) afsx.a.h()).g(e).h("com/google/android/libraries/compose/media/MediaType$Companion", "fromString", 93, "MediaType.kt")).t("Could not build MediaType from '%s'", str);
            return null;
        }
    }

    public static afsw I(afsm afsmVar) {
        return afsmVar.l().b();
    }

    public static afsx J(afsm afsmVar) {
        return ((afqr) afsmVar).a.c();
    }

    public static List K() {
        return (List) afsk.e.a();
    }

    public static afsx L(afru afruVar) {
        return new afsx(afruVar.b(), afruVar.a(), null);
    }

    public static void M(ascv ascvVar, arqv arqvVar, bwj bwjVar, int i) {
        long j;
        float f;
        arqvVar.getClass();
        bwj c = bwjVar.c(-1140356141);
        cga a = dea.a(amh.d(amv.n(amv.p(cga.e)), 8.0f), "magic_compose");
        awg a2 = awh.a(24.0f);
        if (((Boolean) c.g(bli.b)).booleanValue()) {
            c.y(-852293632);
            j = bmp.a(c).p;
            ((bwk) c).Y();
        } else {
            c.y(-852236809);
            j = bmp.a(c).F;
            ((bwk) c).Y();
        }
        if (true != ((Boolean) c.g(bli.b)).booleanValue()) {
            f = brg.a;
        } else {
            f = 2.0f;
        }
        bqv.c(a, a2, j, 0L, f, brg.a, null, cdk.e(1079257368, new aezg(ascvVar, arqvVar, 8, null), c), c, 104);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afbs(ascvVar, arqvVar, i, 5, null);
        }
    }

    public static void N(cas casVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-399502333);
        if (i4 == 0) {
            if (true != c.G(casVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            List list = ((afrh) casVar.a()).a;
            int i5 = cfq.a;
            cfq.b bVar = cfq.a.o;
            ajw.e eVar = ajw.c;
            cga p = amv.p(cga.e);
            cue a = akk.a(eVar, bVar, c, 54);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, p);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar);
            } else {
                c.C();
            }
            caw.b(c, a, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            ako akoVar = ako.a;
            c.y(-1213268858);
            int i7 = ((afrh) casVar.a()).h;
            bwkVar.Y();
            c.y(1044265604);
            wf.b(akoVar, true, null, null, wx.h(zs.d(250, 0, null, 6), 2), null, afqx.a, c, 1597446, 22);
            bwkVar.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afaz(casVar, i, 6);
        }
    }

    public static afqq O(afqu afquVar) {
        if (afquVar.c == 200) {
            return afqp.a;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static afqu P(afqs afqsVar) {
        aozy createBuilder = afqu.a.createBuilder();
        createBuilder.getClass();
        String h = afqsVar.h();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        afqu afquVar = (afqu) apagVar;
        afquVar.b |= 1;
        afquVar.e = h;
        String g = afqsVar.g();
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        afqu afquVar2 = (afqu) apagVar2;
        afquVar2.b |= 2;
        afquVar2.f = g;
        String i = afqsVar.i();
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        afqu afquVar3 = (afqu) createBuilder.b;
        afquVar3.b |= 4;
        afquVar3.g = i;
        Iterable f = afqsVar.f();
        ArrayList arrayList = new ArrayList(aqjn.J(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(b((afsm) it.next()));
        }
        afvg g2 = g(arrayList);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        afqu afquVar4 = (afqu) createBuilder.b;
        afquVar4.h = g2;
        afquVar4.b |= 8;
        if (afqsVar.b() instanceof afqp) {
            aozy createBuilder2 = afqt.a.createBuilder();
            createBuilder2.getClass();
            apag s = createBuilder2.s();
            s.getClass();
            afqt afqtVar = (afqt) s;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            afqu afquVar5 = (afqu) createBuilder.b;
            afquVar5.d = afqtVar;
            afquVar5.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        apag s2 = createBuilder.s();
        s2.getClass();
        return (afqu) s2;
    }

    public static void Q(afqv afqvVar, afqu afquVar) {
        String str = afquVar.e;
        str.getClass();
        afqvVar.d(str);
        String str2 = afquVar.f;
        str2.getClass();
        afqvVar.c(str2);
        String str3 = afquVar.g;
        str3.getClass();
        afqvVar.f(str3);
        afvg afvgVar = afquVar.h;
        if (afvgVar == null) {
            afvgVar = afvg.a;
        }
        afvgVar.getClass();
        afmo afmoVar = new afmo(afqvVar, 6);
        apax<afvf> apaxVar = afvgVar.b;
        apaxVar.getClass();
        ArrayList arrayList = new ArrayList(aqjn.J(apaxVar, 10));
        for (afvf afvfVar : apaxVar) {
            afvfVar.getClass();
            arrayList.add(afmoVar.a(afvfVar));
        }
        afqvVar.e(arrayList);
    }

    public static EnumSet S() {
        Object a = aflr.a.a();
        a.getClass();
        return (EnumSet) a;
    }

    public static EnumSet T() {
        Object a = aflq.a.a();
        a.getClass();
        return (EnumSet) a;
    }

    public static void U(int i, StringBuilder sb) {
        sb.append(Character.toChars(i));
    }

    public static void V(List list, StringBuilder sb) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            afnc afncVar = aflw.c;
            U(intValue, sb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.bwj r3, int r4) {
        /*
            r0 = 1596226231(0x5f247ab7, float:1.1851987E19)
            bwj r3 = r3.c(r0)
            if (r4 != 0) goto L16
            boolean r4 = r3.L()
            r0 = 0
            if (r4 != 0) goto L12
            r4 = r0
            goto L16
        L12:
            r3.v()
            goto L31
        L16:
            bzc r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b
            java.lang.Object r0 = r3.g(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r0 = defpackage.afzv.b(r0)
            android.view.Window r0 = r0.getWindow()
            afmo r1 = new afmo
            r2 = 13
            r1.<init>(r0, r2)
            defpackage.bxl.c(r0, r1, r3)
            r0 = r4
        L31:
            bzz r3 = r3.e()
            if (r3 == 0) goto L42
            aerz r4 = new aerz
            r1 = 12
            r4.<init>(r0, r1)
            bzf r3 = (defpackage.bzf) r3
            r3.d = r4
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afwv.a(bwj, int):void");
    }

    public static afvf b(afsm afsmVar) {
        afve afveVar;
        afsmVar.getClass();
        aozy createBuilder = afvf.a.createBuilder();
        createBuilder.getClass();
        afsz n = afsmVar.n();
        n.getClass();
        int ordinal = n.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        afveVar = afve.ORIGINAL;
                    } else {
                        throw new armm();
                    }
                } else {
                    afveVar = afve.HIGH;
                }
            } else {
                afveVar = afve.LOW;
            }
        } else {
            afveVar = afve.VERY_LOW;
        }
        afveVar.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        afvf afvfVar = (afvf) createBuilder.b;
        afvfVar.c = afveVar.a();
        afvfVar.b |= 1;
        String a = afsmVar.l().c().a();
        a.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        afvf afvfVar2 = (afvf) apagVar;
        afvfVar2.b = 2 | afvfVar2.b;
        afvfVar2.d = a;
        String i = afsmVar.i();
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        afvf afvfVar3 = (afvf) apagVar2;
        afvfVar3.b |= 4;
        afvfVar3.e = i;
        if (afsmVar instanceof afsl) {
            afsl afslVar = (afsl) afsmVar;
            int k = afslVar.k();
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            afvf afvfVar4 = (afvf) apagVar3;
            afvfVar4.b |= 8;
            afvfVar4.g = k;
            int j = afslVar.j();
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            afvf afvfVar5 = (afvf) createBuilder.b;
            afvfVar5.b |= 16;
            afvfVar5.h = j;
        }
        long b = afsmVar.b();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        afvf afvfVar6 = (afvf) createBuilder.b;
        afvfVar6.b |= 32;
        afvfVar6.i = b;
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(afvfVar6.f)).getClass();
        Map o = afsmVar.o();
        if (o == null) {
            o = arnw.a;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        afvf afvfVar7 = (afvf) createBuilder.b;
        apbo apboVar = afvfVar7.f;
        if (!apboVar.b) {
            afvfVar7.f = apboVar.a();
        }
        afvfVar7.f.putAll(o);
        apag s = createBuilder.s();
        s.getClass();
        return (afvf) s;
    }

    public static afsz c(afve afveVar) {
        int ordinal = afveVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new armm();
                            }
                        } else {
                            return afsz.d;
                        }
                    } else {
                        return afsz.c;
                    }
                } else {
                    return afsz.b;
                }
            } else {
                return afsz.a;
            }
        }
        Class<?> cls = afveVar.getClass();
        int i = arsc.a;
        arrh arrhVar = new arrh(cls);
        arrhVar.toString();
        throw new IllegalStateException("Unknown media quality in serialized media: ".concat(arrhVar.toString()));
    }

    public static void d(afvh afvhVar, afvf afvfVar) {
        String str = afvfVar.d;
        str.getClass();
        afvhVar.i(afrt.d(str));
        afve b = afve.b(afvfVar.c);
        if (b == null) {
            b = afve.UNRECOGNIZED;
        }
        b.getClass();
        afvhVar.n(c(b));
        String str2 = afvfVar.e;
        str2.getClass();
        afvhVar.t(str2);
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(afvfVar.f);
        if (true == unmodifiableMap.isEmpty()) {
            unmodifiableMap = null;
        }
        afvhVar.j(unmodifiableMap);
        afvhVar.q(afvfVar.i);
    }

    public static void e(afvh afvhVar, afvg afvgVar, arqv arqvVar) {
        apax apaxVar = afvgVar.b;
        apaxVar.getClass();
        Object ag = aqjn.ag(apaxVar);
        ag.getClass();
        arqvVar.a(afvhVar, ag);
    }

    public static void f(afvj afvjVar, afvf afvfVar) {
        d(afvjVar, afvfVar);
        afvjVar.u(afvfVar.g);
        afvjVar.k(afvfVar.h);
    }

    public static afvg g(List list) {
        aozy createBuilder = afvg.a.createBuilder();
        createBuilder.getClass();
        DesugarCollections.unmodifiableList(((afvg) createBuilder.b).b).getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        afvg afvgVar = (afvg) createBuilder.b;
        apax apaxVar = afvgVar.b;
        if (!apaxVar.c()) {
            afvgVar.b = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(list, afvgVar.b);
        apag s = createBuilder.s();
        s.getClass();
        return (afvg) s;
    }

    public static afcp h(afuh afuhVar) {
        afcp afcnVar;
        afdc afdcVar;
        afty aftyVar;
        afud afudVar;
        int i;
        afuc afucVar;
        int i2;
        afue afueVar;
        String str;
        int i3 = afuhVar.c;
        String str2 = null;
        int i4 = 3;
        int i5 = 2;
        if (i3 == 200) {
            int i6 = ((afub) afuhVar.d).b;
            if (i6 != 0) {
                if (i6 != 100) {
                    if (i6 != 101) {
                        i4 = 0;
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 1;
                }
            }
            if (i4 != 0) {
                int i7 = i4 - 1;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new armm();
                        }
                        Class<?> cls = afuhVar.getClass();
                        int i8 = arsc.a;
                        throw new IllegalStateException("GallerySource proto has no source set during deserialization in local media: ".concat(String.valueOf(new arrh(cls).c())));
                    }
                    return afgf.a;
                }
                return afge.a;
            }
            throw null;
        }
        if (i3 == 201) {
            afuf afufVar = (afuf) afuhVar.d;
            afufVar.getClass();
            int i9 = afufVar.c;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            afudVar = null;
                        } else {
                            afudVar = afud.POPUP_CAMERA;
                        }
                    } else {
                        afudVar = afud.FULLSCREEN;
                    }
                } else {
                    afudVar = afud.MINI_CAMERA;
                }
            } else {
                afudVar = afud.CAMERA_LAYOUT_UNKNOWN;
            }
            if (afudVar == null) {
                afudVar = afud.UNRECOGNIZED;
            }
            afudVar.getClass();
            int ordinal = afudVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new armm();
                            }
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
                int i10 = afufVar.d;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            afucVar = null;
                        } else {
                            afucVar = afuc.FRONT;
                        }
                    } else {
                        afucVar = afuc.BACK;
                    }
                } else {
                    afucVar = afuc.CAMERA_FACING_UNKNOWN;
                }
                if (afucVar == null) {
                    afucVar = afuc.UNRECOGNIZED;
                }
                afucVar.getClass();
                int ordinal2 = afucVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new armm();
                            }
                            Class<?> cls2 = afucVar.getClass();
                            int i11 = arsc.a;
                            arrh arrhVar = new arrh(cls2);
                            arrhVar.toString();
                            throw new IllegalStateException("Unknown in app camera source facing value during deserialization in local media: ".concat(arrhVar.toString()));
                        }
                        i2 = 3;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 1;
                }
                int i12 = afufVar.e;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            afueVar = null;
                        } else {
                            afueVar = afue.LANDSCAPE;
                        }
                    } else {
                        afueVar = afue.PORTRAIT;
                    }
                } else {
                    afueVar = afue.ORIENTATION_UNKNOWN;
                }
                if (afueVar == null) {
                    afueVar = afue.UNRECOGNIZED;
                }
                afueVar.getClass();
                int ordinal3 = afueVar.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            if (ordinal3 != 3) {
                                throw new armm();
                            }
                            Class<?> cls3 = afueVar.getClass();
                            int i13 = arsc.a;
                            arrh arrhVar2 = new arrh(cls3);
                            arrhVar2.toString();
                            throw new IllegalStateException("Unknown in app camera source orientation during deserialization in local media: ".concat(arrhVar2.toString()));
                        }
                        i5 = 3;
                    }
                } else {
                    i5 = 1;
                }
                boolean z = afufVar.f;
                String str3 = afufVar.g;
                if ((afufVar.b & 16) == 0) {
                    str = null;
                } else {
                    str = str3;
                }
                return new afgh(i, i2, i5, z, null, str);
            }
            Class<?> cls4 = afudVar.getClass();
            int i14 = arsc.a;
            arrh arrhVar3 = new arrh(cls4);
            arrhVar3.toString();
            throw new IllegalStateException("Unknown in app camera source camera layout during deserialization in local media: ".concat(arrhVar3.toString()));
        }
        if (i3 == 202) {
            return afgi.a;
        }
        if (i3 == 203) {
            if (afuhVar.c == 203) {
                aftyVar = (afty) afuhVar.d;
            } else {
                aftyVar = afty.a;
            }
            aftyVar.getClass();
            afcnVar = new afqe(aftyVar);
        } else {
            afcy afcyVar = afuhVar.f;
            if (afcyVar == null) {
                afcyVar = afcy.a;
            }
            afcyVar.getClass();
            if (aeke.ce(afcyVar)) {
                afcy afcyVar2 = afuhVar.f;
                if (afcyVar2 == null) {
                    afcyVar2 = afcy.a;
                }
                afcyVar2.getClass();
                return aeke.cc(afcyVar2);
            }
            afdf afdfVar = afuhVar.e;
            if (afdfVar == null) {
                afdfVar = afdf.a;
            }
            afdfVar.getClass();
            int i15 = afdfVar.b;
            if (aeke.cb(i15) != 0 && aeke.cb(i15) != 1) {
                if (i15 == 201) {
                    afdc afdcVar2 = (afdc) afdfVar.c;
                    if (1 != (afdcVar2.b & 1)) {
                        afdcVar = null;
                    } else {
                        afdcVar = afdcVar2;
                    }
                    if (afdcVar != null) {
                        str2 = afdcVar.c;
                    }
                    int T = a.T(afdcVar2.d);
                    if (T == 0) {
                        T = 1;
                    }
                    int i16 = T - 2;
                    if (i16 != 0) {
                        if (i16 != 1) {
                            if (i16 != 2) {
                                if (i16 != 3) {
                                    if (i16 == 4) {
                                        i4 = 5;
                                    } else {
                                        throw new IllegalStateException("Unrecognized external source entrypoint during attachment deserialization");
                                    }
                                } else {
                                    i4 = 4;
                                }
                            }
                        } else {
                            i4 = 2;
                        }
                    } else {
                        i4 = 1;
                    }
                    afcnVar = new afcm(str2, i4);
                } else if (i15 == 202) {
                    int aa = a.aa(((afdd) afdfVar.c).c);
                    if (aa == 0) {
                        aa = 1;
                    }
                    if (aa - 2 == 1) {
                        afcnVar = new afcn();
                    } else {
                        throw new IllegalStateException("Unrecognized remote source category during attachment deserialization");
                    }
                } else {
                    if (i15 == 200) {
                        return afco.a;
                    }
                    int cb = aeke.cb(i15);
                    Objects.toString(aeke.ca(cb));
                    throw new IllegalStateException("Unrecognized source serialized as ".concat(aeke.ca(cb)));
                }
            } else {
                throw new IllegalArgumentException("Attachment source wasn't set");
            }
        }
        return afcnVar;
    }

    public static afuh i(afts aftsVar) {
        afud afudVar;
        afuc afucVar;
        afue afueVar;
        aozy createBuilder = afuh.a.createBuilder();
        createBuilder.getClass();
        aozy createBuilder2 = afdf.a.createBuilder();
        createBuilder2.getClass();
        afcp fh = aftsVar.fh();
        int i = 3;
        if (fh instanceof afcm) {
            aozy createBuilder3 = afdc.a.createBuilder();
            createBuilder3.getClass();
            afcm afcmVar = (afcm) fh;
            String str = afcmVar.a;
            if (str != null) {
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                afdc afdcVar = (afdc) createBuilder3.b;
                afdcVar.b |= 1;
                afdcVar.c = str;
            }
            int i2 = afcmVar.b - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            i = 6;
                        } else {
                            i = 5;
                        }
                    } else {
                        i = 4;
                    }
                }
            } else {
                i = 2;
            }
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            afdc afdcVar2 = (afdc) createBuilder3.b;
            afdcVar2.d = a.am(i);
            afdcVar2.b |= 2;
            apag s = createBuilder3.s();
            s.getClass();
            afdc afdcVar3 = (afdc) s;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            afdf afdfVar = (afdf) createBuilder2.b;
            afdfVar.c = afdcVar3;
            afdfVar.b = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
        } else if (fh instanceof afcn) {
            aozy createBuilder4 = afdd.a.createBuilder();
            createBuilder4.getClass();
            int i3 = ((afcn) fh).a;
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            afdd afddVar = (afdd) createBuilder4.b;
            afddVar.c = a.ap(3);
            afddVar.b |= 1;
            apag s2 = createBuilder4.s();
            s2.getClass();
            afdd afddVar2 = (afdd) s2;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            afdf afdfVar2 = (afdf) createBuilder2.b;
            afdfVar2.c = afddVar2;
            afdfVar2.b = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
        } else if (fh instanceof afco) {
            aozy createBuilder5 = afde.a.createBuilder();
            createBuilder5.getClass();
            apag s3 = createBuilder5.s();
            s3.getClass();
            afde afdeVar = (afde) s3;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            afdf afdfVar3 = (afdf) createBuilder2.b;
            afdfVar3.c = afdeVar;
            afdfVar3.b = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        apag s4 = createBuilder2.s();
        s4.getClass();
        afdf afdfVar4 = (afdf) s4;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        afuh afuhVar = (afuh) createBuilder.b;
        afuhVar.e = afdfVar4;
        afuhVar.b |= 1;
        afcy cd = aeke.cd(aftsVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        afuh afuhVar2 = (afuh) createBuilder.b;
        afuhVar2.f = cd;
        afuhVar2.b |= 2;
        afvg g = g(aqjn.y(b(aftsVar)));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        afuh afuhVar3 = (afuh) apagVar;
        afuhVar3.g = g;
        afuhVar3.b |= 4;
        afcp fh2 = aftsVar.fh();
        if (fh2 instanceof aftp) {
            aftp aftpVar = (aftp) fh2;
            if (aftpVar instanceof afgg) {
                aozy createBuilder6 = afub.a.createBuilder();
                createBuilder6.getClass();
                afgg afggVar = (afgg) aftpVar;
                if (d.F(afggVar, afge.a)) {
                    aozy createBuilder7 = aftz.a.createBuilder();
                    createBuilder7.getClass();
                    apag s5 = createBuilder7.s();
                    s5.getClass();
                    aftz aftzVar = (aftz) s5;
                    if (!createBuilder6.b.isMutable()) {
                        createBuilder6.u();
                    }
                    afub afubVar = (afub) createBuilder6.b;
                    afubVar.c = aftzVar;
                    afubVar.b = 100;
                } else if (d.F(afggVar, afgf.a)) {
                    aozy createBuilder8 = afua.a.createBuilder();
                    createBuilder8.getClass();
                    apag s6 = createBuilder8.s();
                    s6.getClass();
                    afua afuaVar = (afua) s6;
                    if (!createBuilder6.b.isMutable()) {
                        createBuilder6.u();
                    }
                    afub afubVar2 = (afub) createBuilder6.b;
                    afubVar2.c = afuaVar;
                    afubVar2.b = 101;
                } else {
                    throw new armm();
                }
                apag s7 = createBuilder6.s();
                s7.getClass();
                afub afubVar3 = (afub) s7;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                afuh afuhVar4 = (afuh) createBuilder.b;
                afuhVar4.d = afubVar3;
                afuhVar4.c = BasePaymentResult.ERROR_REQUEST_FAILED;
            } else if (aftpVar instanceof afgh) {
                aozy createBuilder9 = afuf.a.createBuilder();
                createBuilder9.getClass();
                afgh afghVar = (afgh) aftpVar;
                int i4 = afghVar.d - 1;
                if (i4 != 0) {
                    if (i4 != 1) {
                        afudVar = afud.POPUP_CAMERA;
                    } else {
                        afudVar = afud.FULLSCREEN;
                    }
                } else {
                    afudVar = afud.MINI_CAMERA;
                }
                afudVar.getClass();
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                afuf afufVar = (afuf) createBuilder9.b;
                afufVar.c = afudVar.a();
                afufVar.b |= 1;
                int i5 = afghVar.e - 1;
                if (i5 != 1) {
                    if (i5 != 2) {
                        afucVar = afuc.CAMERA_FACING_UNKNOWN;
                    } else {
                        afucVar = afuc.FRONT;
                    }
                } else {
                    afucVar = afuc.BACK;
                }
                afucVar.getClass();
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                afuf afufVar2 = (afuf) createBuilder9.b;
                afufVar2.d = afucVar.a();
                afufVar2.b |= 2;
                int i6 = afghVar.f - 1;
                if (i6 != 1) {
                    if (i6 != 2) {
                        afueVar = afue.ORIENTATION_UNKNOWN;
                    } else {
                        afueVar = afue.LANDSCAPE;
                    }
                } else {
                    afueVar = afue.PORTRAIT;
                }
                afueVar.getClass();
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                afuf afufVar3 = (afuf) createBuilder9.b;
                afufVar3.e = afueVar.a();
                afufVar3.b |= 4;
                boolean z = afghVar.a;
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                apag apagVar2 = createBuilder9.b;
                afuf afufVar4 = (afuf) apagVar2;
                afufVar4.b |= 8;
                afufVar4.f = z;
                String str2 = afghVar.c;
                if (str2 != null) {
                    if (!apagVar2.isMutable()) {
                        createBuilder9.u();
                    }
                    afuf afufVar5 = (afuf) createBuilder9.b;
                    afufVar5.b |= 16;
                    afufVar5.g = str2;
                }
                apag s8 = createBuilder9.s();
                s8.getClass();
                afuf afufVar6 = (afuf) s8;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                afuh afuhVar5 = (afuh) createBuilder.b;
                afuhVar5.d = afufVar6;
                afuhVar5.c = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
            } else if (aftpVar instanceof afgi) {
                aozy createBuilder10 = afug.a.createBuilder();
                createBuilder10.getClass();
                apag s9 = createBuilder10.s();
                s9.getClass();
                afug afugVar = (afug) s9;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                afuh afuhVar6 = (afuh) createBuilder.b;
                afuhVar6.d = afugVar;
                afuhVar6.c = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
            } else if (aftpVar instanceof afqe) {
                afty aftyVar = ((afqe) aftpVar).c;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                afuh afuhVar7 = (afuh) createBuilder.b;
                afuhVar7.d = aftyVar;
                afuhVar7.c = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
            }
        }
        apag s10 = createBuilder.s();
        s10.getClass();
        return (afuh) s10;
    }

    public static void l(afuq afuqVar, afsx afsxVar) {
        afuqVar.i(afrt.c(afsxVar));
    }

    public static /* synthetic */ aftx m(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (aftx) s;
    }

    public static /* synthetic */ afty n(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (afty) s;
    }

    public static void o(aftw aftwVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        afty aftyVar = (afty) aozyVar.b;
        afty aftyVar2 = afty.a;
        aftyVar.c = aftwVar;
        aftyVar.b = 101;
    }

    public static void p(aftx aftxVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        afty aftyVar = (afty) aozyVar.b;
        afty aftyVar2 = afty.a;
        aftyVar.c = aftxVar;
        aftyVar.b = 100;
    }

    public static void q(agcj agcjVar, bqn bqnVar, bwj bwjVar, int i) {
        int i2;
        bwj bwjVar2;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(1625947891);
        if (i5 == 0) {
            if (true != c.G(agcjVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(bqnVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            agcw agcwVar = agcjVar.b;
            c.y(426088369);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(null, cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            bwkVar.Y();
            c.y(426091217);
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                byu byuVar2 = new byu(null, cav.a);
                bwkVar.ad(byuVar2);
                T2 = byuVar2;
            }
            byn bynVar2 = (byn) T2;
            bwkVar.Y();
            c.y(426094033);
            Object T3 = bwkVar.T();
            if (T3 == bwj.a.a) {
                byu byuVar3 = new byu(null, cav.a);
                bwkVar.ad(byuVar3);
                T3 = byuVar3;
            }
            byn bynVar3 = (byn) T3;
            bwkVar.Y();
            arnb arnbVar = arnb.a;
            c.y(426096509);
            int i6 = i2 & 14;
            Object T4 = bwkVar.T();
            if (i6 == 4 || T4 == bwj.a.a) {
                T4 = new afbh(agcjVar, (arpe) null, 10);
                bwkVar.ad(T4);
            }
            bwkVar.Y();
            bxl.g(arnbVar, (arqv) T4, c);
            bwjVar2 = c;
            bqv.c(agcwVar.a, null, bmp.a(c).p, 0L, brg.a, brg.a, null, cdk.e(-1649688242, new agcv(agcjVar, agcwVar, bqnVar, bynVar2, bynVar3, bynVar), c), bwjVar2, 122);
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new afbs(agcjVar, bqnVar, i, 7, null);
        }
    }

    public static void r(byn bynVar) {
    }

    public static void s(arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        arqvVar.getClass();
        int i4 = i & 14;
        bwj c = bwjVar.c(-1707938378);
        if (i4 == 0) {
            if (true != c.I(arqvVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c.L()) {
            c.v();
        } else {
            afzv.i(true, null, cdk.e(825250781, new aeyl(arqvVar, 15), c), c, 390, 2);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afaz(arqvVar, i, 7);
        }
    }

    public static void t(agcj agcjVar, bqn bqnVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = i & 14;
        bwj c = bwjVar.c(426626035);
        if (i5 == 0) {
            if (true != c.G(agcjVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (true != c.G(bqnVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c.L()) {
            c.v();
        } else {
            if (agcjVar != null) {
                z = true;
            } else {
                z = false;
            }
            wf.a(z, null, null, null, null, cdk.e(-1219322165, new afao(agcjVar, bqnVar, 6), c), c, 196608, 30);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new afbs(agcjVar, bqnVar, i, 6, null);
        }
    }

    public static Point w(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static asai x(View view) {
        return new asac(new lfn(view, (arpe) null, 17));
    }

    public static asai y(View view) {
        view.getClass();
        return asar.a(new lhh(x(view), 17));
    }

    public static asai z(View view) {
        view.getClass();
        return asar.a(new lhh(x(view), 18));
    }

    public afwv(byte[] bArr) {
    }

    public afwv(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
    }
}
