package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgb {
    public static boolean A(apwt apwtVar) {
        return ((Boolean) mgx.j.e()).booleanValue();
    }

    public static boolean B(apwt apwtVar) {
        return ((Boolean) mgx.b.e()).booleanValue();
    }

    public static amsg C(int i, int i2) {
        aozy createBuilder = amsg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amsg amsgVar = (amsg) apagVar;
        int i3 = i - 1;
        if (i != 0) {
            amsgVar.c = i3;
            amsgVar.b |= 1;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amsg amsgVar2 = (amsg) createBuilder.b;
            amsgVar2.b |= 2;
            amsgVar2.d = i2;
            return (amsg) createBuilder.s();
        }
        throw null;
    }

    public static amsb D(int i, int i2, ampm ampmVar) {
        aozy createBuilder = amsb.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amsb amsbVar = (amsb) apagVar;
        amsbVar.b |= 1;
        amsbVar.c = i;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amsb amsbVar2 = (amsb) apagVar2;
        amsbVar2.d = i2 - 1;
        amsbVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amsb amsbVar3 = (amsb) apagVar3;
        ampmVar.getClass();
        amsbVar3.e = ampmVar;
        amsbVar3.b |= 4;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        amsb amsbVar4 = (amsb) createBuilder.b;
        amsbVar4.b |= 8;
        amsbVar4.f = false;
        return (amsb) createBuilder.s();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r9.equals("com.google.android.inputmethod.japanese/.MozcService") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int E(android.content.Context r9) {
        /*
            android.content.ContentResolver r9 = r9.getContentResolver()
            java.lang.String r0 = "default_input_method"
            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 == 0) goto L13
            goto L8f
        L13:
            java.lang.String r0 = "com.google.android.inputmethod.latin"
            boolean r0 = r9.startsWith(r0)
            r2 = 3
            if (r0 == 0) goto L1f
            r1 = r2
            goto L8f
        L1f:
            int r0 = r9.hashCode()
            r3 = 2
            r4 = 5
            r5 = 8
            r6 = 6
            r7 = 7
            r8 = 4
            switch(r0) {
                case -1805168051: goto L7e;
                case -1376502153: goto L74;
                case -1200358650: goto L6a;
                case -158919340: goto L60;
                case -142100592: goto L56;
                case 170093862: goto L4c;
                case 617167760: goto L43;
                case 833628043: goto L39;
                case 961426403: goto L2f;
                default: goto L2d;
            }
        L2d:
            goto L88
        L2f:
            java.lang.String r0 = "com.google.android.apps.inputmethod.hindi/.HindiInputMethodService"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r1 = r3
            goto L89
        L39:
            java.lang.String r0 = "com.touchtype.swiftkey/com.touchtype.KeyboardService"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r1 = r4
            goto L89
        L43:
            java.lang.String r0 = "com.google.android.inputmethod.japanese/.MozcService"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            goto L89
        L4c:
            java.lang.String r0 = "com.cootek.smartinputv5/com.cootek.smartinput5.TouchPalIME"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r1 = r5
            goto L89
        L56:
            java.lang.String r0 = "com.google.android.inputmethod.korean/.KoreanIme"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r1 = 0
            goto L89
        L60:
            java.lang.String r0 = "com.jb.emoji.gokeyboard/com.jb.gokeyboard.GoKeyboard"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r1 = r6
            goto L89
        L6a:
            java.lang.String r0 = "com.google.android.inputmethod.pinyin/.PinyinIME"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r1 = r2
            goto L89
        L74:
            java.lang.String r0 = "panda.keyboard.emoji.theme/com.android.inputmethod.latin.LatinIME"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r1 = r7
            goto L89
        L7e:
            java.lang.String r0 = "com.google.android.googlequicksearchbox/com.google.android.voicesearch.ime.VoiceInputMethodService"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L88
            r1 = r8
            goto L89
        L88:
            r1 = -1
        L89:
            switch(r1) {
                case 0: goto L9d;
                case 1: goto L9c;
                case 2: goto L9b;
                case 3: goto L9a;
                case 4: goto L99;
                case 5: goto L96;
                case 6: goto L93;
                case 7: goto L90;
                case 8: goto L8d;
                default: goto L8c;
            }
        L8c:
            return r3
        L8d:
            r1 = 11
        L8f:
            return r1
        L90:
            r9 = 12
            return r9
        L93:
            r9 = 10
            return r9
        L96:
            r9 = 9
            return r9
        L99:
            return r5
        L9a:
            return r7
        L9b:
            return r8
        L9c:
            return r4
        L9d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgb.E(android.content.Context):int");
    }

    public static /* synthetic */ void F(mdg mdgVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        mdgVar.c(i);
    }

    public static /* synthetic */ mdg H(mgu mguVar, int i) {
        return mguVar.h(i, null);
    }

    public static int I(MessageCoreData messageCoreData) {
        int d = messageCoreData.d();
        if (d == 0) {
            return 2;
        }
        if (d == 1 || d == 2) {
            return 3;
        }
        if (d != 3 && d != 4) {
            return 1;
        }
        return 4;
    }

    public static int J(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 5;
        }
        if (i2 != 5) {
            return 7;
        }
        return 6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [arqv] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object K(defpackage.mce r5, java.lang.String r6, defpackage.arqv r7, defpackage.arpe r8) {
        /*
            boolean r0 = r8 instanceof defpackage.mcf
            if (r0 == 0) goto L13
            r0 = r8
            mcf r0 = (defpackage.mcf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mcf r0 = new mcf
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.b
            java.lang.String r6 = r0.e
            java.lang.Object r7 = r0.a
            defpackage.aqil.P(r8)     // Catch: java.lang.Exception -> L2d
            goto L53
        L2d:
            r5 = move-exception
            r4 = r7
            r7 = r5
            r5 = r4
            goto L59
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            defpackage.aqil.P(r8)
            mbm r8 = r5.b(r6)
            r0.a = r5     // Catch: java.lang.Exception -> L58
            r0.e = r6     // Catch: java.lang.Exception -> L58
            r0.b = r8     // Catch: java.lang.Exception -> L58
            r0.d = r3     // Catch: java.lang.Exception -> L58
            java.lang.Object r7 = r7.a(r8, r0)     // Catch: java.lang.Exception -> L58
            if (r7 == r1) goto L57
            r4 = r7
            r7 = r5
            r5 = r8
            r8 = r4
        L53:
            r5.c()     // Catch: java.lang.Exception -> L2d
            return r8
        L57:
            return r1
        L58:
            r7 = move-exception
        L59:
            r5.e(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgb.K(mce, java.lang.String, arqv, arpe):java.lang.Object");
    }

    public static final mbh L(xnv xnvVar) {
        xnvVar.getClass();
        return new mbh(xnvVar.f().toEpochMilli(), xnvVar.a());
    }

    public static final ahco M(ngu nguVar) {
        apae apaeVar = mdl.c;
        aozy createBuilder = amrq.a.createBuilder();
        createBuilder.getClass();
        aozy createBuilder2 = amrr.a.createBuilder();
        createBuilder2.getClass();
        aktp.aI((String) nguVar.b, createBuilder2);
        aktp.aJ(createBuilder2);
        aktp.bt(aktp.aH(createBuilder2), createBuilder);
        return new ahco(apaeVar, aktp.bs(createBuilder));
    }

    public static final ahcr N(ngu nguVar) {
        apae apaeVar = mdl.b;
        aozy createBuilder = amrq.a.createBuilder();
        createBuilder.getClass();
        aozy createBuilder2 = amrr.a.createBuilder();
        createBuilder2.getClass();
        aktp.aI((String) nguVar.b, createBuilder2);
        aktp.aJ(createBuilder2);
        aktp.bt(aktp.aH(createBuilder2), createBuilder);
        return new ahcr(apaeVar, aktp.bs(createBuilder));
    }

    public static boolean O(ansy ansyVar) {
        return ansyVar.e("bugle.single_inbox_for_rohan_query_fallback");
    }

    public static boolean P(ansy ansyVar) {
        return ansyVar.e("bugle.enable_synchronized_lock");
    }

    public static boolean Q(ansy ansyVar) {
        return ansyVar.e("bugle.enable_profiles");
    }

    public static boolean R(ansy ansyVar) {
        return ansyVar.e("bugle.location_skip_throwing_exception_on_api_error");
    }

    public static boolean S(ansy ansyVar) {
        return ansyVar.e("bugle.enable_incremental_sync");
    }

    public static boolean T(ansy ansyVar) {
        return ansyVar.e("bugle.enable_cancelling_pending_pwq_tasks");
    }

    public static boolean U(ansy ansyVar) {
        return ansyVar.e("bugle.fix_google_tos_button_clickability");
    }

    public static boolean V(ansy ansyVar) {
        return ansyVar.e("bugle.enforce_thread_checks_on_cursors");
    }

    private static final aeqj W(cas casVar) {
        return (aeqj) casVar.a();
    }

    public static final void a(arqg arqgVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(2145760288);
        if (i4 == 0) {
            if (true != c.I(arqgVar)) {
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
            lgi lgiVar = new lgi(arqgVar);
            enm enmVar = (enm) c.g(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int i5 = rr.a;
            ro a = rr.a(c);
            if (a != null) {
                bxl.c(lgiVar, new eiw((Object) a.c(), (Object) enmVar, (Object) lgiVar, 11, (char[]) null), c);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kjt(arqgVar, i, 5);
        }
    }

    public static final void b(ascv ascvVar, cga cgaVar, bwj bwjVar, int i) {
        cga b;
        cgaVar.getClass();
        bwj c = bwjVar.c(605007432);
        lgh lghVar = (lgh) cak.a(ascvVar, c).a();
        if (lghVar.a) {
            b = amv.b(cgaVar, 1.0f);
            bic.b(b, null, 0L, 0L, brg.a, cdk.e(-1261529972, new lfw(lghVar, 4), c), c, 1572864, 62);
            bzz e = c.e();
            if (e != null) {
                ((bzf) e).d = new kie(ascvVar, cgaVar, i, 11);
                return;
            }
            return;
        }
        bzz e2 = c.e();
        if (e2 != null) {
            ((bzf) e2).d = new kie(ascvVar, cgaVar, i, 10);
        }
    }

    public static final void c(lij lijVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(-1750431852);
        if (i4 == 0) {
            if (true != c.G(lijVar)) {
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
            aeqa aeqaVar = (aeqa) cak.a(lijVar.d, c).a();
            c.y(1250031446);
            if (!aeqaVar.b.isEmpty()) {
                agkx.I(aeqaVar, null, c, 0);
            }
            ((bwk) c).Y();
            bqv.c(null, null, 0L, 0L, brg.a, brg.a, null, cdk.e(-551607121, new lfw(lijVar, 5), c), c, 127);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kjt(lijVar, i, 9);
        }
    }

    public static final void d(lij lijVar, bwj bwjVar, int i) {
        int i2;
        cga b;
        cga a;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-426760287);
        if (i4 == 0) {
            if (true != c2.G(lijVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            kkc a2 = iaw.a(c2);
            yzc.A(a2, bmp.a(c2).F, false, null, c2, 0, 12);
            b = amv.b(cga.e, 1.0f);
            a = adf.a(anh.b(b, new amc(anl.e(c2), 63)), bmp.a(c2).p, clw.a);
            c2.y(-1727639426);
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                T = lgk.i;
                bwkVar.ad(T);
            }
            bwkVar.Y();
            c = dhb.c(a, false, (arqr) T);
            ahji.y(c, null, null, null, null, 0, 0L, 0L, null, cdk.e(-564986960, new ifo(a2, lijVar, 4, null), c2), c2, 805306368, 510);
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(lijVar, i, 10);
        }
    }

    public static final void e(ascv ascvVar, cga cgaVar, bwj bwjVar, int i) {
        cgaVar.getClass();
        bwj c = bwjVar.c(-1470212746);
        cas a = cak.a(ascvVar, c);
        if (W(a) != null) {
            aeqj W = W(a);
            W.getClass();
            agkx.s(W, amh.c(ani.a(cgaVar), amh.h(brg.a, brg.a, 16.0f, 17.0f, 3)), c, 0);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kie(ascvVar, cgaVar, i, 13);
        }
    }

    public static /* synthetic */ String f(int i) {
        if (i != 2) {
            return "MULTI_SHARE";
        }
        return "START_CHAT";
    }

    public static final DirectSendResult g(Intent intent) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        if (Build.VERSION.SDK_INT <= 33) {
            parcelableExtra = intent.getParcelableExtra("direct_send_result");
        } else {
            parcelableExtra2 = intent.getParcelableExtra("direct_send_result", DirectSendResult.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        }
        return (DirectSendResult) parcelableExtra;
    }

    public static final lte h(MessageCoreData messageCoreData) {
        if (messageCoreData.u() != null) {
            rve E = messageCoreData.E();
            E.getClass();
            return new lte(E, messageCoreData.V());
        }
        return null;
    }

    public static final void i(lsa lsaVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-37431158);
        if (i4 == 0) {
            if (true != c2.G(lsaVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !c2.L()) {
            c = amv.c(cga.e, 1.0f);
            cga e = amh.e(c, 8.0f, 4.0f);
            ajw.c cVar = ajw.e;
            int i5 = cfq.a;
            cue a = amq.a(cVar, cfq.a.j, c2, 6);
            int a2 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, e);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            amh.j(amv.w(cga.e), 12.0f, 4.0f, 12.0f, brg.a, 8);
            throw null;
        }
        c2.v();
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new kjt(lsaVar, i, 18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(defpackage.bwj r2, int r3) {
        /*
            r0 = -168551696(0xfffffffff5f41af0, float:-6.1888027E32)
            bwj r2 = r2.c(r0)
            if (r3 != 0) goto L16
            boolean r3 = r2.L()
            r0 = 0
            if (r3 != 0) goto L12
            r3 = r0
            goto L16
        L12:
            r2.v()
            goto L26
        L16:
            cga$a r0 = defpackage.cga.e
            cga r0 = defpackage.amv.p(r0)
            r1 = 1092616192(0x41200000, float:10.0)
            cga r0 = defpackage.amv.d(r0, r1)
            defpackage.amx.a(r0, r2)
            r0 = r3
        L26:
            bzz r2 = r2.e()
            if (r2 == 0) goto L36
            lhs r3 = new lhs
            r1 = 2
            r3.<init>(r0, r1)
            bzf r2 = (defpackage.bzf) r2
            r2.d = r3
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgb.j(bwj, int):void");
    }

    public static final void k(lrr lrrVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(362269365);
        if (i4 == 0) {
            if (true != c2.G(lrrVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            int i5 = cfq.a;
            cfq.c cVar = cfq.a.k;
            c = amv.c(amh.j(cga.e, 7.0f, brg.a, 7.0f, brg.a, 10), 1.0f);
            cue a = amq.a(ajw.a, cVar, c2, 48);
            int a2 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, c);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            ahji.af(null, null, ahji.aj(bmp.a(c2).D, c2, 14), null, null, cdk.e(-1341307381, new jjs(lrrVar, 19), c2), c2, 196608, 27);
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(lrrVar, i, 15);
        }
    }

    public static final void l(lrr lrrVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c = bwjVar.c(14851237);
        if (i4 == 0) {
            if (true != c.G(lrrVar)) {
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
            yzc.t(null, null, false, null, false, cdk.e(1058916241, new lfw(lrrVar, 10), c), c, 196608, 31);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new kjt(lrrVar, i, 16);
        }
    }

    public static final void m(long j, int i, bwj bwjVar, int i2) {
        int i3;
        bwj bwjVar2;
        int i4;
        int i5;
        int i6 = i2 & 14;
        bwj c = bwjVar.c(1823488893);
        if (i6 == 0) {
            if (true != c.F(j)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (true != c.E(i)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i3 |= i4;
        }
        int i7 = i3;
        if ((i7 & 91) == 18 && c.L()) {
            c.v();
            bwjVar2 = c;
        } else {
            cga l = amv.l(amh.j(cga.e, 7.0f, brg.a, brg.a, brg.a, 14), 31.0f);
            ajw.c cVar = ajw.e;
            int i8 = cfq.a;
            cue a = akk.a(cVar, cfq.a.n, c, 54);
            int a2 = bwg.a(c);
            bwk bwkVar = (bwk) c;
            byx P = bwkVar.P();
            cga b = cfv.b(c, l);
            int i9 = cwl.a;
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
            cga j2 = amv.j(amh.j(cga.e, 7.0f, brg.a, brg.a, brg.a, 14), 31.0f, 24.0f);
            cue a3 = akc.a(cfq.a.e, false);
            int a4 = bwg.a(c);
            byx P2 = bwkVar.P();
            cga b2 = cfv.b(c, j2);
            arqg arqgVar2 = cwl.a.a;
            c.A();
            if (bwkVar.y) {
                c.l(arqgVar2);
            } else {
                c.C();
            }
            caw.b(c, a3, cwl.a.e);
            caw.b(c, P2, cwl.a.d);
            arqv arqvVar2 = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                bwkVar.ad(valueOf2);
                c.j(valueOf2, arqvVar2);
            }
            caw.b(c, b2, cwl.a.c);
            akf akfVar = akf.a;
            ahji.N(aeke.bg(aerb.ap, c), null, akfVar.a(amv.h(cga.e, 24.0f), cfq.a.e), j, c, ((i7 << 9) & 7168) | 56, 0);
            cga a5 = akfVar.a(cga.e, cfq.a.e);
            bwjVar2 = c;
            ahji.e(String.valueOf(i), a5, j, 0L, 0L, new dqi(3), 0L, 0, false, 0, 0, null, dje.y(bmp.d(c).n, 0L, 0L, null, null, null, "tnum", 0L, 0, 0, 0L, null, null, 0, 16777151), bwjVar2, (i7 << 6) & 896, 0, 65016);
            bwjVar2.p();
            bwjVar2.p();
        }
        bzz e = bwjVar2.e();
        if (e != null) {
            ((bzf) e).d = new lrq(j, i, i2);
        }
    }

    public static final void n(lrr lrrVar, bwj bwjVar, int i) {
        int i2;
        cga c;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(1382334556);
        if (i4 == 0) {
            if (true != c2.G(lrrVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            cga.a aVar = cga.e;
            ajw.e eVar = ajw.c;
            int i5 = cfq.a;
            cue a = akk.a(eVar, cfq.a.m, c2, 0);
            int a2 = bwg.a(c2);
            bwk bwkVar = (bwk) c2;
            byx P = bwkVar.P();
            cga b = cfv.b(c2, aVar);
            int i6 = cwl.a;
            arqg arqgVar = cwl.a.a;
            c2.A();
            if (bwkVar.y) {
                c2.l(arqgVar);
            } else {
                c2.C();
            }
            caw.b(c2, a, cwl.a.e);
            caw.b(c2, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                bwkVar.ad(valueOf);
                c2.j(valueOf, arqvVar);
            }
            caw.b(c2, b, cwl.a.c);
            c = amv.c(cga.e, 1.0f);
            ahji.e(dga.b(R.string.security_key_page_identity_intro, new Object[]{Integer.valueOf(lrrVar.c), wfh.y(lrrVar.e)}, c2), amh.f(c, 14.0f, 15.0f, 20.0f, 15.0f), bmp.a(c2).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, bmp.d(c2).k, c2, 0, 0, 65528);
            c2.p();
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new kjt(lrrVar, i, 17);
        }
    }

    public static /* synthetic */ void o(lre lreVar, aeqg aeqgVar) {
        lreVar.d(aeqgVar, true);
    }

    public static /* synthetic */ void p(lre lreVar, arqr arqrVar) {
        lreVar.e(true, arqrVar);
    }

    public static String q(int i) {
        return Integer.toString(a.M(i));
    }

    public static int r(int i) {
        return i - 2;
    }

    public static int s() {
        return r(1);
    }

    public static boolean t() {
        return ((Boolean) ((utz) mik.a.get()).e()).booleanValue();
    }

    public static ahka u(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return mgv.a;
                }
                return mgv.j;
            }
            return mgv.i;
        }
        return mgv.h;
    }

    public static amfg v(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return amfg.CONVERSATION_TYPE_ONE_ON_ONE;
            }
            if (num.intValue() == 1) {
                return amfg.CONVERSATION_TYPE_GROUP_MMS;
            }
            if (num.intValue() == 2) {
                return amfg.CONVERSATION_TYPE_GROUP_RCS;
            }
        }
        return amfg.UNKNOWN_BUGLE_CONVERSATION_TYPE;
    }

    public static amgz w(int i) {
        if (i == -2) {
            return amgz.UNKNOWN_BUGLE_MMS_FAILURE_CODE;
        }
        return (amgz) Optional.ofNullable(amgz.b(i)).orElse(amgz.UNKNOWN_BUGLE_MMS_FAILURE_CODE);
    }

    public static int x(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1 || i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            if (i != 7) {
                return 1;
            }
            return 15;
        }
        return 5;
    }

    public static final void y(long j, int i, mbh mbhVar) {
        mbhVar.getClass();
        ((alvg) mgr.a.d().h("com/google/android/apps/messaging/shared/analytics/statistics/MessageStatusEventLogger$Companion", "debugLogMessageStatusTimestamp", 127, "MessageStatusEventLogger.kt")).J("BugleMessage[eventTimeMs=%d, messageId=%d, messageStatus=%s]", Long.valueOf(mbhVar.a), Long.valueOf(j), akec.aK(i));
    }

    public static amgj z(MessageCoreData messageCoreData, int i) {
        int i2 = i - 1;
        if (i2 != 2 && i2 != 3) {
            return messageCoreData.y().j();
        }
        return amgj.INCOMING;
    }
}
