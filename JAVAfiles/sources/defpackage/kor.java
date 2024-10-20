package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kor {
    public final Object a;
    public final Object b;

    public kor(Object obj, armf armfVar) {
        this.a = obj;
        this.b = armfVar;
    }

    public static final Intent b(Context context, ksp kspVar) {
        Intent a = lqn.f(context, AdvancedFeedbackActivity.class, "android.intent.action.VIEW").a();
        a.putExtra("advanced_feedback_config_data", kspVar.c.k);
        kspVar.b.ifPresent(new ixj(a, 20));
        kspVar.a.ifPresent(new ktm(a, 1));
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ashu o(asho ashoVar) {
        apaa apaaVar = (apaa) ashu.a.createBuilder();
        apae apaeVar = ashp.b;
        aozy createBuilder = ashp.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ashp ashpVar = (ashp) createBuilder.b;
        ashpVar.j = ashoVar.e;
        ashpVar.c |= 128;
        apaaVar.ct(apaeVar, (ashp) createBuilder.s());
        return (ashu) apaaVar.s();
    }

    public static final boolean w(qrt qrtVar, String str, boolean z) {
        String a = qrtVar.a(str);
        if (a != null) {
            return Boolean.parseBoolean(a);
        }
        return z;
    }

    public static final int x(qrt qrtVar, String str, int i) {
        String a = qrtVar.a(str);
        if (a != null) {
            return Integer.parseInt(a);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.mwl
            if (r0 == 0) goto L13
            r0 = r5
            mwl r0 = (defpackage.mwl) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mwl r0 = new mwl
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.a
            r0.b = r3
            yyt r5 = (defpackage.yyt) r5
            java.lang.Object r5 = r5.J(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            mwk r0 = new mwk
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kor.A(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r6, defpackage.ksp r7) {
        /*
            r5 = this;
            uuf r0 = defpackage.ktf.a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5f
            android.content.Intent r0 = b(r6, r7)
            amek r7 = r7.c
            amek r1 = defpackage.amek.BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC
            boolean r7 = r7.equals(r1)
            r1 = 0
            if (r7 == 0) goto L24
            r7 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r7)
        L22:
            r7 = r1
            goto L2e
        L24:
            android.app.Activity r7 = defpackage.abbu.g(r6)
            if (r7 == 0) goto L22
            android.graphics.Bitmap r7 = defpackage.abrc.k(r7)
        L2e:
            if (r7 != 0) goto L34
            r6.startActivity(r0)
            return
        L34:
            java.lang.Object r2 = r5.b
            java.lang.Object r2 = r2.b()
            kkc r2 = (defpackage.kkc) r2
            haw r3 = new haw
            r4 = 12
            r3.<init>(r2, r7, r4, r1)
            java.lang.Object r7 = r2.a
            akul r7 = defpackage.aktp.ai(r3, r7)
            ksn r2 = new ksn
            r3 = 2
            r2.<init>(r0, r6, r3, r1)
            andy r6 = defpackage.qiu.c(r2)
            java.lang.Object r0 = r5.a
            java.lang.Object r0 = r0.b()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            r7.k(r6, r0)
            return
        L5f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Expect advanced feedback pheontype flag is on"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kor.a(android.content.Context, ksp):void");
    }

    public final Optional c() {
        if (((Optional) this.b).isEmpty()) {
            return Optional.empty();
        }
        albo.U(((Optional) this.a).isPresent(), "the isEnabledFn should be present when the feature is compiled in");
        ((Optional) this.a).get();
        Object e = abdh.a.e();
        e.getClass();
        if (!((Boolean) e).booleanValue()) {
            return Optional.empty();
        }
        Object b = ((apwt) ((Optional) this.b).get()).b();
        b.getClass();
        return Optional.of(b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v27, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [armf, java.lang.Object] */
    public final void d(int i, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        if (!((mif) this.a.b()).b()) {
            ((mif) this.a.b()).a();
            return;
        }
        aozy createBuilder = amel.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amel amelVar = (amel) createBuilder.b;
        amelVar.d = i - 1;
        amelVar.b |= 2;
        optional.isPresent();
        Object obj = optional.get();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amel amelVar2 = (amel) createBuilder.b;
        amelVar2.c = ((amek) obj).k;
        amelVar2.b |= 1;
        if (optional2.isPresent()) {
            Object obj2 = optional2.get();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amel amelVar3 = (amel) createBuilder.b;
            amelVar3.e = ((amei) obj2).m;
            amelVar3.b |= 4;
        }
        if (optional3.isPresent()) {
            ?? r3 = optional3.get();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amel amelVar4 = (amel) createBuilder.b;
            apao apaoVar = amelVar4.f;
            if (!apaoVar.c()) {
                amelVar4.f = apag.mutableCopy(apaoVar);
            }
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                amelVar4.f.g(((ameg) it.next()).g);
            }
        }
        if (optional4.isPresent()) {
            Object obj3 = optional4.get();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amel amelVar5 = (amel) createBuilder.b;
            amelVar5.g = ((amej) obj3).e;
            amelVar5.b |= 8;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_ADVANCED_FEEDBACK_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amel amelVar6 = (amel) createBuilder.s();
        amelVar6.getClass();
        amfrVar2.af = amelVar6;
        amfrVar2.d |= 32;
        ((maq) this.b.b()).j(amfqVar);
    }

    public final alog e(String str, Function function) {
        Object apply;
        Iterator it;
        String str2;
        boolean z;
        alob alobVar = new alob();
        sjk a = sjm.a();
        a.w(str);
        a.c(new mfk(11));
        String str3 = "count";
        a.n(new agpl("COUNT(*)"), "count");
        int i = 1;
        String str4 = "phones";
        a.n(new agpk("group_concat($V, '|')", new Object[]{sjm.e.c}), "phones");
        a.n(new agpk("group_concat($V, '|')", new Object[]{sjm.e.r}), "display_destinations");
        a.n(new agpk("group_concat($V, '|')", new Object[]{sjm.e.m}), "types");
        a.n(new agpk("group_concat(COALESCE($V, $V), '|')", new Object[]{sjm.e.j, ""}), "labels");
        apply = function.apply(new sjl());
        a.k(new agpw((sjl) apply));
        a.t((agmh) sjm.e.o);
        tby tbyVar = sjm.e;
        a.e(new atkn((agmh) tbyVar.f, (byte[]) null), new atkn((agmh) tbyVar.k, (byte[]) null));
        sjh sjhVar = (sjh) a.b().n();
        while (sjhVar.moveToNext()) {
            try {
                long c = sjhVar.c();
                String q = sjhVar.q();
                String s = sjhVar.s();
                String n = sjhVar.n();
                alob alobVar2 = new alob();
                int parseInt = Integer.parseInt(sjhVar.cX(str3));
                if (parseInt == i) {
                    alobVar2.h(((lxe) this.b).m(Integer.parseInt(sjhVar.cX("types")), sjhVar.cX("labels"), sjhVar.cX(str4), sjhVar.cX("display_destinations")));
                } else {
                    Iterable a2 = ((anna) this.a).a(sjhVar.cX(str4));
                    Iterator it2 = ((anna) this.a).a(sjhVar.cX("display_destinations")).iterator();
                    Iterator it3 = ((anna) this.a).a(sjhVar.cX("types")).iterator();
                    Iterator it4 = ((anna) this.a).a(sjhVar.cX("labels")).iterator();
                    Iterator it5 = a2.iterator();
                    while (it5.hasNext()) {
                        String str5 = (String) it5.next();
                        String str6 = str3;
                        int parseInt2 = Integer.parseInt((String) it3.next());
                        if (it4 != null) {
                            it = it5;
                            str2 = (String) it4.next();
                        } else {
                            it = it5;
                            str2 = null;
                        }
                        alobVar2.h(((lxe) this.b).m(parseInt2, str2, str5, (String) it2.next()));
                        it5 = it;
                        it2 = it2;
                        str3 = str6;
                        str4 = str4;
                    }
                }
                String str7 = str3;
                String str8 = str4;
                alog g = alobVar2.g();
                if (((alsx) g).c == parseInt) {
                    z = true;
                } else {
                    z = false;
                }
                d.s(z);
                alobVar.h(mkh.a(c, q, s, n, g, sjhVar.h()));
                str3 = str7;
                str4 = str8;
                i = 1;
            } finally {
            }
        }
        sjhVar.close();
        return alobVar.g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [armf, java.lang.Object] */
    public final void f(ammf ammfVar) {
        if (!((mif) this.a.b()).b()) {
            ((mif) this.a.b()).a();
            return;
        }
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_REPORT_ISSUE_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        ammfVar.getClass();
        amfrVar2.ag = ammfVar;
        amfrVar2.d |= 64;
        ((maq) this.b.b()).j(amfqVar);
    }

    public final void g(ahka ahkaVar, int i) {
        ((ahqr) this.b).e(ahkaVar);
        h(ahkaVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    public final void h(ahka ahkaVar, int i) {
        if (yhx.c && this.a.add(new mgy(ahkaVar, i))) {
            Trace.beginAsyncSection(ahkaVar.a, i);
        }
    }

    public final void i(ahka ahkaVar, int i) {
        j(ahkaVar, i, null);
    }

    public final void j(ahka ahkaVar, int i, ashu ashuVar) {
        k(ahkaVar, i, ashuVar, ahqp.SUCCESS);
    }

    public final void k(ahka ahkaVar, int i, ashu ashuVar, ahqp ahqpVar) {
        l(ahkaVar, i);
        ((ahqr) this.b).g(ahkaVar, ashuVar, ahqpVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    public final void l(ahka ahkaVar, int i) {
        if (yhx.c && this.a.remove(new mgy(ahkaVar, i))) {
            Trace.endAsyncSection(ahkaVar.a, i);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final ashu m(final rry rryVar) {
        return (ashu) ConcurrentMap.EL.computeIfAbsent(this.b, rryVar.u(), new Function() { // from class: mgk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo416andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v19, types: [armf, java.lang.Object] */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i;
                boolean h;
                aozy createBuilder = ashp.a.createBuilder();
                rry rryVar2 = rryVar;
                boolean c = tvu.c(rryVar2.b());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashp ashpVar = (ashp) createBuilder.b;
                ashpVar.c |= 8;
                ashpVar.f = c;
                aozy createBuilder2 = ashq.a.createBuilder();
                boolean am = rryVar2.am();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ashq ashqVar = (ashq) createBuilder2.b;
                ashqVar.b |= 1;
                ashqVar.c = am;
                for (MessagePartCoreData messagePartCoreData : rryVar2.e) {
                    if (messagePartCoreData.bh()) {
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        ashq ashqVar2 = (ashq) createBuilder2.b;
                        ashqVar2.b |= 16;
                        ashqVar2.g = true;
                    } else if (messagePartCoreData.bz()) {
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        ashq ashqVar3 = (ashq) createBuilder2.b;
                        ashqVar3.b = 4 | ashqVar3.b;
                        ashqVar3.e = true;
                    } else if (messagePartCoreData.aW()) {
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        ashq ashqVar4 = (ashq) createBuilder2.b;
                        ashqVar4.b |= 8;
                        ashqVar4.f = true;
                    } else if (messagePartCoreData.bk()) {
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        ashq ashqVar5 = (ashq) createBuilder2.b;
                        ashqVar5.b |= 2;
                        ashqVar5.d = true;
                    }
                }
                aozy createBuilder3 = ashr.a.createBuilder();
                if (rryVar2.aQ()) {
                    i = 2;
                } else if (rryVar2.av()) {
                    i = 4;
                } else if (rryVar2.aK()) {
                    i = 5;
                } else if (rryVar2.aF()) {
                    i = 3;
                } else {
                    i = 1;
                }
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                kor korVar = kor.this;
                ashr ashrVar = (ashr) createBuilder3.b;
                ashrVar.c = i - 1;
                ashrVar.b |= 1;
                amuk d = ((xtj) korVar.a.b()).d();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                ashr ashrVar2 = (ashr) createBuilder3.b;
                ashrVar2.d = d.e;
                ashrVar2.b |= 2;
                ashq ashqVar6 = (ashq) createBuilder2.s();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                ashr ashrVar3 = (ashr) createBuilder3.b;
                ashqVar6.getClass();
                ashrVar3.f = ashqVar6;
                ashrVar3.b |= 8;
                boolean aJ = rryVar2.aJ();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                ashr ashrVar4 = (ashr) createBuilder3.b;
                ashrVar4.b = 4 | ashrVar4.b;
                ashrVar4.e = aJ;
                ashr ashrVar5 = (ashr) createBuilder3.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashp ashpVar2 = (ashp) createBuilder.b;
                ashrVar5.getClass();
                ashpVar2.i = ashrVar5;
                ashpVar2.c |= 64;
                if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
                    if (((Boolean) new mst(14).get()).booleanValue()) {
                        h = rryVar2.r().z();
                    } else {
                        h = ((msx) rryVar2.t.b()).h(rryVar2.N());
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ashp ashpVar3 = (ashp) createBuilder.b;
                    ashpVar3.c |= 32;
                    ashpVar3.h = h;
                }
                apaa apaaVar = (apaa) ashu.a.createBuilder();
                apaaVar.ct(ashp.b, (ashp) createBuilder.s());
                return (ashu) apaaVar.s();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final ashu n(final miz mizVar, final boolean z, final boolean z2) {
        return (ashu) ConcurrentMap.EL.computeIfAbsent(this.b, rvc.b(mizVar.b().a()), new Function() { // from class: mgj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo416andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i;
                aozy createBuilder = ashp.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                miz mizVar2 = mizVar;
                boolean z3 = z;
                ashp ashpVar = (ashp) createBuilder.b;
                ashpVar.c |= 8;
                ashpVar.f = z3;
                aozy createBuilder2 = ashq.a.createBuilder();
                boolean z4 = mizVar2.e() instanceof myr;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ashq ashqVar = (ashq) createBuilder2.b;
                ashqVar.b |= 1;
                ashqVar.c = z4;
                boolean z5 = mizVar2.e() instanceof inb;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ashq ashqVar2 = (ashq) createBuilder2.b;
                ashqVar2.b |= 16;
                ashqVar2.g = z5;
                boolean z6 = gh.z(mizVar2.e().j());
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ashq ashqVar3 = (ashq) createBuilder2.b;
                ashqVar3.b |= 4;
                ashqVar3.e = z6;
                boolean z7 = mizVar2.e() instanceof mxh;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ashq ashqVar4 = (ashq) createBuilder2.b;
                ashqVar4.b |= 8;
                ashqVar4.f = z7;
                boolean m = gh.m(mizVar2.e().j());
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                boolean z8 = z2;
                ashq ashqVar5 = (ashq) createBuilder2.b;
                ashqVar5.b |= 2;
                ashqVar5.d = m;
                ashq ashqVar6 = (ashq) createBuilder2.s();
                aozy createBuilder3 = ashr.a.createBuilder();
                if (z8) {
                    i = 5;
                } else if (mizVar2.a() == miy.b) {
                    i = 3;
                } else if (!z3 && !(mizVar2.e() instanceof mxf)) {
                    if (mizVar2.e() instanceof myr) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                } else {
                    i = 4;
                }
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                kor korVar = kor.this;
                ashr ashrVar = (ashr) createBuilder3.b;
                ashrVar.c = i - 1;
                ashrVar.b |= 1;
                amuk d = ((xtj) korVar.a.b()).d();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar = createBuilder3.b;
                ashr ashrVar2 = (ashr) apagVar;
                ashrVar2.d = d.e;
                ashrVar2.b |= 2;
                if (!apagVar.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar2 = createBuilder3.b;
                ashr ashrVar3 = (ashr) apagVar2;
                ashqVar6.getClass();
                ashrVar3.f = ashqVar6;
                ashrVar3.b |= 8;
                boolean z9 = mizVar2 instanceof mty;
                if (!apagVar2.isMutable()) {
                    createBuilder3.u();
                }
                ashr ashrVar4 = (ashr) createBuilder3.b;
                ashrVar4.b |= 4;
                ashrVar4.e = z9;
                ashr ashrVar5 = (ashr) createBuilder3.s();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ashp ashpVar2 = (ashp) createBuilder.b;
                ashrVar5.getClass();
                ashpVar2.i = ashrVar5;
                ashpVar2.c |= 64;
                if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
                    mje c = mizVar2.c();
                    if (c instanceof muk) {
                        boolean z10 = ((muk) c).a.f().z();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ashp ashpVar3 = (ashp) createBuilder.b;
                        ashpVar3.c |= 32;
                        ashpVar3.h = z10;
                    }
                }
                apaa apaaVar = (apaa) ashu.a.createBuilder();
                apaaVar.ct(ashp.b, (ashp) createBuilder.s());
                return (ashu) apaaVar.s();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void p(String str, Number number) {
        ((aboj) this.b).c(str).a(0L, number.longValue(), aboj.b);
    }

    public final void q(String str, int i, long j) {
        ((aboj) this.b).d(str).a(i, j, aboj.b);
    }

    public final abnr r() {
        return abnr.i((Context) this.a, "ANDROID_MESSAGING");
    }

    public final abnr s() {
        return abnr.j((Context) this.a, "ANDROID_MESSAGING");
    }

    public final Duration t(Duration duration) {
        Duration minus = Duration.ofMillis(((xnv) this.a).a()).minus(duration);
        minus.getClass();
        return minus;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, anen] */
    public final nco u(ncq ncqVar) {
        if (ncqVar instanceof nco) {
            return (nco) ncqVar;
        }
        return new nco((wfh) this.b, this.a, ncqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qrt, java.lang.Object] */
    public final int v() {
        return x(this.b, "MAX_MESSAGE_SIZE", 307200);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arwe, java.lang.Object] */
    public final akul y(nfw nfwVar, List list) {
        akul c;
        list.getClass();
        c = qjh.c(this.a, arpj.a, arwf.a, new jyw(this, nfwVar, list, (arpe) null, 17));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(defpackage.nfw r8, java.util.List r9, defpackage.arpe r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.mwn
            if (r0 == 0) goto L13
            r0 = r10
            mwn r0 = (defpackage.mwn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mwn r0 = new mwn
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.aqil.P(r10)
            goto L81
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.aqil.P(r10)
            java.lang.Object r10 = r7.b
            qrw r2 = defpackage.qrw.SMS
            int r5 = r8.b()
            java.lang.Object r6 = r9.get(r3)
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient) r6
            msh r6 = r6.f()
            rdc r10 = (defpackage.rdc) r10
            akul r10 = r10.d(r2, r5, r6)
            r10.getClass()
            java.lang.Object r2 = r7.b
            arwl r10 = defpackage.qjh.e(r10)
            qrw r5 = defpackage.qrw.MMS
            int r8 = r8.b()
            java.lang.Object r9 = r9.get(r3)
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r9 = (com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient) r9
            msh r9 = r9.f()
            rdc r2 = (defpackage.rdc) r2
            akul r8 = r2.d(r5, r8, r9)
            r8.getClass()
            arwl r8 = defpackage.qjh.e(r8)
            r9 = 2
            arwl[] r9 = new defpackage.arwl[r9]
            r9[r3] = r10
            r9[r4] = r8
            r0.b = r4
            java.lang.Object r10 = defpackage.arrj.k(r9, r0)
            if (r10 != r1) goto L81
            return r1
        L81:
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r8 = r10.get(r3)
            qrt r8 = (defpackage.qrt) r8
            java.lang.Object r9 = r10.get(r4)
            qrt r9 = (defpackage.qrt) r9
            kor r10 = new kor
            r10.<init>(r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kor.z(nfw, java.util.List, arpe):java.lang.Object");
    }

    public kor(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public kor(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public kor(mjq mjqVar, alpt alptVar) {
        this.a = mjqVar;
        this.b = alptVar;
    }

    public kor(armf armfVar) {
        this.b = new ConcurrentHashMap();
        this.a = armfVar;
    }

    public kor(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2) {
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public kor(oao oaoVar, qif qifVar, armf armfVar, qop qopVar) {
        qifVar.getClass();
        armfVar.getClass();
        qopVar.getClass();
        this.a = oaoVar;
        this.b = armfVar;
    }

    public kor(ahqr ahqrVar) {
        this.a = alzz.N();
        this.b = ahqrVar;
    }

    public kor(armf armfVar, xnv xnvVar) {
        xnvVar.getClass();
        this.b = armfVar;
        this.a = xnvVar;
    }

    public kor(arwe arweVar, yyt yytVar) {
        arweVar.getClass();
        yytVar.getClass();
        this.b = arweVar;
        this.a = yytVar;
    }

    public kor(arwe arweVar, rdc rdcVar) {
        arweVar.getClass();
        this.a = arweVar;
        this.b = rdcVar;
    }

    public kor(lxe lxeVar) {
        this.a = anna.e('|');
        this.b = lxeVar;
    }

    public kor(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public kor(qrt qrtVar, qrt qrtVar2) {
        qrtVar.getClass();
        qrtVar2.getClass();
        this.a = qrtVar;
        this.b = qrtVar2;
    }

    public kor(agnq agnqVar, hgi hgiVar) {
        agnqVar.getClass();
        tbs d = PartsTable.d();
        d.w("MessagePartsChangeObserver");
        d.d(new mva(20));
        tbr b = d.b();
        this.a = b;
        this.b = hgiVar.D("SafeMessagePartsChangeObserver", b, new nap(agnqVar, 0));
    }

    public kor(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public kor(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public kor(mjq mjqVar) {
        this(mjqVar, (alpt) new altx(mjqVar));
    }

    public kor(armf armfVar, armf armfVar2, short[] sArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }
}
