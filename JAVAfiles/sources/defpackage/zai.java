package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zai {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public zai(Context context, ydf ydfVar, Optional optional, armf armfVar, armf armfVar2) {
        this.d = context;
        this.c = ydfVar;
        this.a = optional;
        this.e = armfVar;
        this.b = armfVar2;
    }

    private final long D() {
        return ((ydf) this.c).d((Context) this.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    private final wul E() {
        return (wul) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [arwe, java.lang.Object] */
    private final void F(uth uthVar) {
        if (((ansy) ((oul) this.b).a.b()).e("bugle.enable_sequence_audit_log")) {
            albo.ax(this.c, (ahlp) this.d, new yhj(this, uthVar, (arpe) null, 1));
        }
    }

    private static final List G(List list) {
        ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((thm) it.next()).k());
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int r(int i) {
        String str;
        char c;
        if (i == 1) {
            str = "DEVICE_GAIA_AVAILABILITY_UNKNOWN";
        } else if (i == 2) {
            str = "SINGLE_GAIA";
        } else if (i != 3) {
            str = "NO_GAIA";
        } else {
            str = "MULTI_GAIA";
        }
        switch (str.hashCode()) {
            case -1932906678:
                if (str.equals("DEVICE_GAIA_AVAILABILITY_UNKNOWN")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1437539536:
                if (str.equals("NO_GAIA")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 450392329:
                if (str.equals("SINGLE_GAIA")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1763862232:
                if (str.equals("MULTI_GAIA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 4;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int s(int i) {
        String str;
        char c;
        if (i == 1) {
            str = "SIGN_IN_EVENT_FLOW_UNKNOWN";
        } else if (i == 2) {
            str = "AVATAR_MENU";
        } else if (i == 3) {
            str = "WELCOME_FLOW_LEGACY_COMPLETION";
        } else if (i == 4) {
            str = "WELCOME_FLOW_LEGACY_LAUNCH";
        } else if (i != 5) {
            str = "WELCOME_FLOW_FOR_PROFILES";
        } else {
            str = "STICKY_ESI_POPUP";
        }
        switch (str.hashCode()) {
            case -1715371899:
                if (str.equals("AVATAR_MENU")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -817421290:
                if (str.equals("SIGN_IN_EVENT_FLOW_UNKNOWN")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -681994530:
                if (str.equals("WELCOME_FLOW_LEGACY_COMPLETION")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1324300916:
                if (str.equals("WELCOME_FLOW_FOR_PROFILES")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2056105909:
                if (str.equals("WELCOME_FLOW_LEGACY_LAUNCH")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2137311698:
                if (str.equals("STICKY_ESI_POPUP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 4;
        }
        if (c == 4) {
            return 5;
        }
        if (c == 5) {
            return 6;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int t(int i) {
        String str;
        char c;
        switch (i) {
            case 1:
                str = "SIGN_IN_UI_EVENT_UNKNOWN";
                break;
            case 2:
                str = "WELCOME_FLOW_LEGACY_GAIA_PAGE_SEEN";
                break;
            case 3:
                str = "AUTO_SIGN_IN_TOOLTIP_SEEN";
                break;
            case 4:
                str = "STICKY_ESI_POPUP_SEEN";
                break;
            case 5:
                str = "STICKY_ESI_POPUP_CONTINUE_BUTTON_CLICKED";
                break;
            case 6:
                str = "STICKY_ESI_POPUP_OPT_OUT_BUTTON_CLICKED";
                break;
            case 7:
                str = "STICKY_ESI_POPUP_LEARN_MORE_LINK_CLICKED";
                break;
            default:
                str = "STICKY_ESI_POPUP_BACK_BUTTON_CLICKED";
                break;
        }
        switch (str.hashCode()) {
            case -2103553198:
                if (str.equals("SIGN_IN_UI_EVENT_UNKNOWN")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -975309920:
                if (str.equals("WELCOME_FLOW_LEGACY_GAIA_PAGE_SEEN")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -952083612:
                if (str.equals("STICKY_ESI_POPUP_OPT_OUT_BUTTON_CLICKED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -561493953:
                if (str.equals("AUTO_SIGN_IN_TOOLTIP_SEEN")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -387184440:
                if (str.equals("STICKY_ESI_POPUP_SEEN")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -111406299:
                if (str.equals("STICKY_ESI_POPUP_CONTINUE_BUTTON_CLICKED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 175172709:
                if (str.equals("STICKY_ESI_POPUP_BACK_BUTTON_CLICKED")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1331450020:
                if (str.equals("STICKY_ESI_POPUP_LEARN_MORE_LINK_CLICKED")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int u(int i) {
        String str;
        char c;
        if (i == 1) {
            str = "SIGN_IN_STATUS_UNKNOWN";
        } else if (i == 2) {
            str = "SIGNED_IN";
        } else if (i != 3) {
            str = "SIGNED_OUT";
        } else {
            str = "OPTED_TO_NOT_SIGN_IN";
        }
        switch (str.hashCode()) {
            case -493496437:
                if (str.equals("SIGNED_OUT")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -431561432:
                if (str.equals("SIGNED_IN")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1144426805:
                if (str.equals("SIGN_IN_STATUS_UNKNOWN")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1841592068:
                if (str.equals("OPTED_TO_NOT_SIGN_IN")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 4;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[LOOP:0: B:11:0x005c->B:13:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(java.util.List r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.txz
            if (r0 == 0) goto L13
            r0 = r8
            txz r0 = (defpackage.txz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            txz r0 = new txz
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r7 = r0.a
            defpackage.aqil.P(r8)
            goto L3e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.aqil.P(r8)
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = r6.B(r7, r0)
            if (r8 == r1) goto Ld0
        L3e:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r0 = 10
            int r1 = defpackage.aqjn.J(r8, r0)
            int r1 = defpackage.aqjn.i(r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 16
            int r1 = defpackage.arrn.r(r1, r3)
            r2.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L5c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r8.next()
            r4 = r1
            sec r4 = (defpackage.sec) r4
            java.lang.String r4 = r4.g()
            r2.put(r4, r1)
            goto L5c
        L71:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            int r0 = defpackage.aqjn.J(r7, r0)
            int r0 = defpackage.aqjn.i(r0)
            int r0 = defpackage.arrn.r(r0, r3)
            r8.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L86:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lcf
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo r3 = new com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo
            java.lang.Object r1 = r2.get(r1)
            sec r1 = (defpackage.sec) r1
            aron r4 = new aron
            r5 = 0
            r4.<init>(r5)
            if (r1 == 0) goto Lb9
            boolean r5 = r1.j()
            if (r5 == 0) goto Lae
            uao r5 = defpackage.uao.b
            r4.add(r5)
        Lae:
            boolean r1 = r1.k()
            if (r1 == 0) goto Lb9
            uao r1 = defpackage.uao.c
            r4.add(r1)
        Lb9:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Lc4
            uao r1 = defpackage.uao.a
            r4.add(r1)
        Lc4:
            java.util.List r1 = defpackage.aqjn.x(r4)
            r3.<init>(r1)
            r8.put(r0, r3)
            goto L86
        Lcf:
            return r8
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.A(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(java.util.List r13, defpackage.arpe r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.tya
            if (r0 == 0) goto L13
            r0 = r14
            tya r0 = (defpackage.tya) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            tya r0 = new tya
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akrh r13 = r0.c
            defpackage.aqil.P(r14)     // Catch: java.lang.Throwable -> L29
            goto L57
        L29:
            r14 = move-exception
            goto L63
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            defpackage.aqil.P(r14)
            java.lang.String r14 = "E2eeInfoDataLoader#getRegistrations"
            akrh r14 = defpackage.aktp.e(r14)
            java.lang.Object r2 = r12.b     // Catch: java.lang.Throwable -> L5f
            rdx r10 = new rdx     // Catch: java.lang.Throwable -> L5f
            r8 = 14
            r9 = 0
            r7 = 0
            r4 = r10
            r5 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5f
            r0.c = r14     // Catch: java.lang.Throwable -> L5f
            r0.b = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r13 = defpackage.arro.q(r2, r10, r0)     // Catch: java.lang.Throwable -> L5f
            if (r13 == r1) goto L5e
            r11 = r14
            r14 = r13
            r13 = r11
        L57:
            alog r14 = (defpackage.alog) r14     // Catch: java.lang.Throwable -> L29
            r0 = 0
            defpackage.armd.i(r13, r0)
            return r14
        L5e:
            return r1
        L5f:
            r13 = move-exception
            r11 = r14
            r14 = r13
            r13 = r11
        L63:
            throw r14     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            defpackage.armd.i(r13, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.B(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [armf, java.lang.Object] */
    public final twc C(String str) {
        ?? b = this.d.b();
        b.getClass();
        str.getClass();
        anen anenVar = (anen) this.e.b();
        anenVar.getClass();
        ((lga) this.a.b()).getClass();
        ((lga) this.c.b()).getClass();
        return new twc(b, str, this.b, anenVar);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [arwe, java.lang.Object] */
    public final void a(you youVar, ypd ypdVar, ypi ypiVar) {
        youVar.getClass();
        ypiVar.getClass();
        akrh e = aktp.e("ReinforcedSpamProtectionEntrypoint.reinforceSpamClassifications");
        try {
            for (ypb ypbVar : (Set) ((apxx) this.c).a) {
                if (ypbVar.a() != ypiVar) {
                    qjh.l(this.b, null, new ypc(this, youVar, ypbVar, ypdVar, null), 3);
                }
            }
            armd.i(e, null);
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean b(ConversationIdType conversationIdType) {
        if (((rtz) this.d.b()).r(conversationIdType) == tqc.SPAM_FOLDER) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Set, java.lang.Object] */
    public final akul c() {
        if (((Boolean) yfe.s.e()).booleanValue()) {
            return aktp.ag((yfb) this.b.iterator().next());
        }
        return akul.g(((akbj) this.a).c());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final yde d(long j) {
        int b = ((yjy) this.b.b()).b();
        ?? r1 = this.b;
        long D = D();
        ykb h = ((yjy) r1.b()).h(b);
        if (!adom.u((Context) this.d) && h.F() && !((yyt) this.e.b()).S()) {
            return new yde(D, Optional.of("File auto download is disabled while roaming"));
        }
        if (D == -1) {
            return new yde(-1L, Optional.of("File auto download is disabled by RCS config"));
        }
        if (j > D) {
            return new yde(D, Optional.of("File is bigger than max auto download file size"));
        }
        return new yde(D, Optional.empty());
    }

    public final yde e(ContentType contentType, long j) {
        if (((Boolean) ((Optional) this.a).map(new ybe(3)).orElse(true)).booleanValue()) {
            return d(j);
        }
        return new yde(D(), Optional.of("File auto download is disabled for the content type: ".concat(contentType.toString())));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ycm
            if (r0 == 0) goto L13
            r0 = r5
            ycm r0 = (defpackage.ycm) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ycm r0 = new ycm
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
            wul r5 = r4.E()
            r0.b = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(boolean r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ycn
            if (r0 == 0) goto L13
            r0 = r7
            ycn r0 = (defpackage.ycn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ycn r0 = new ycn
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zai r6 = r0.d
            defpackage.aqil.P(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            wul r7 = r5.E()
            jsw r2 = new jsw
            r4 = 2
            r2.<init>(r6, r4)
            r0.d = r5
            r0.b = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r6 = r5
        L4a:
            uth r7 = (defpackage.uth) r7
            r7.getClass()
            r6.F(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.g(boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(int r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yco
            if (r0 == 0) goto L13
            r0 = r7
            yco r0 = (defpackage.yco) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yco r0 = new yco
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zai r6 = r0.d
            defpackage.aqil.P(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            wul r7 = r5.E()
            iim r2 = new iim
            r4 = 9
            r2.<init>(r6, r4)
            r0.d = r5
            r0.b = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            uth r7 = (defpackage.uth) r7
            r7.getClass()
            r6.F(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.h(int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(int r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ycp
            if (r0 == 0) goto L13
            r0 = r7
            ycp r0 = (defpackage.ycp) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ycp r0 = new ycp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zai r6 = r0.d
            defpackage.aqil.P(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            wul r7 = r5.E()
            iim r2 = new iim
            r4 = 10
            r2.<init>(r6, r4)
            r0.d = r5
            r0.b = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            uth r7 = (defpackage.uth) r7
            r7.getClass()
            r6.F(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.i(int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(boolean r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ycq
            if (r0 == 0) goto L13
            r0 = r7
            ycq r0 = (defpackage.ycq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ycq r0 = new ycq
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zai r6 = r0.d
            defpackage.aqil.P(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            wul r7 = r5.E()
            jsw r2 = new jsw
            r4 = 3
            r2.<init>(r6, r4)
            r0.d = r5
            r0.b = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r6 = r5
        L4a:
            uth r7 = (defpackage.uth) r7
            r7.getClass()
            r6.F(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.j(boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(boolean r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ycr
            if (r0 == 0) goto L13
            r0 = r7
            ycr r0 = (defpackage.ycr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ycr r0 = new ycr
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zai r6 = r0.d
            defpackage.aqil.P(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            wul r7 = r5.E()
            jsw r2 = new jsw
            r4 = 4
            r2.<init>(r6, r4)
            r0.d = r5
            r0.b = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r6 = r5
        L4a:
            uth r7 = (defpackage.uth) r7
            r7.getClass()
            r6.F(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.k(boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(boolean r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ycs
            if (r0 == 0) goto L13
            r0 = r7
            ycs r0 = (defpackage.ycs) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ycs r0 = new ycs
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zai r6 = r0.d
            defpackage.aqil.P(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            wul r7 = r5.E()
            jsw r2 = new jsw
            r4 = 5
            r2.<init>(r6, r4)
            r0.d = r5
            r0.b = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r6 = r5
        L4a:
            uth r7 = (defpackage.uth) r7
            r7.getClass()
            r6.F(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.l(boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(boolean r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yct
            if (r0 == 0) goto L13
            r0 = r7
            yct r0 = (defpackage.yct) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yct r0 = new yct
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zai r6 = r0.d
            defpackage.aqil.P(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            wul r7 = r5.E()
            jsw r2 = new jsw
            r4 = 6
            r2.<init>(r6, r4)
            r0.d = r5
            r0.b = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r6 = r5
        L4a:
            uth r7 = (defpackage.uth) r7
            r7.getClass()
            r6.F(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.m(boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(boolean r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ycu
            if (r0 == 0) goto L13
            r0 = r7
            ycu r0 = (defpackage.ycu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ycu r0 = new ycu
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zai r6 = r0.d
            defpackage.aqil.P(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            wul r7 = r5.E()
            jsw r2 = new jsw
            r4 = 7
            r2.<init>(r6, r4)
            r0.d = r5
            r0.b = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r6 = r5
        L4a:
            uth r7 = (defpackage.uth) r7
            r7.getClass()
            r6.F(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.n(boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(boolean r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ycv
            if (r0 == 0) goto L13
            r0 = r7
            ycv r0 = (defpackage.ycv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ycv r0 = new ycv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zai r6 = r0.d
            defpackage.aqil.P(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            wul r7 = r5.E()
            jsw r2 = new jsw
            r4 = 8
            r2.<init>(r6, r4)
            r0.d = r5
            r0.b = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            uth r7 = (defpackage.uth) r7
            r7.getClass()
            r6.F(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.o(boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [arpi, java.lang.Object] */
    public final Object p(arpe arpeVar) {
        Object q = arro.q(this.b, new txt(this, (arpe) null, 15, (byte[]) null), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e8, code lost:
    
        if (defpackage.arro.q(r1.b, new defpackage.uwn(r1, r9, (defpackage.arpe) null, 3, (byte[]) null), r2) == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (defpackage.arro.q(r1.b, new defpackage.uwn(r1, r10, (defpackage.arpe) null, 2), r2) != r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(int r19, j$.time.Instant r20, int r21, boolean r22, j$.time.Instant r23, boolean r24, j$.time.Instant r25, defpackage.arpe r26) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.q(int, j$.time.Instant, int, boolean, j$.time.Instant, boolean, j$.time.Instant, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    public final uit v(uip uipVar, String str) {
        Context context = (Context) this.c.b();
        context.getClass();
        mce mceVar = (mce) this.e.b();
        mceVar.getClass();
        yhf yhfVar = (yhf) this.a.b();
        yhfVar.getClass();
        anen anenVar = (anen) this.b.b();
        anenVar.getClass();
        uipVar.getClass();
        return new uit(context, mceVar, yhfVar, this.d, anenVar, uipVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8 A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:46:0x007a, B:48:0x0095, B:50:0x00a3, B:51:0x00b8, B:53:0x00be, B:55:0x00cc, B:59:0x00dd, B:61:0x00f8, B:62:0x010d, B:64:0x0113, B:66:0x0122), top: B:45:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(defpackage.qei r12, defpackage.amkd r13, java.util.List r14, defpackage.arpe r15) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.w(qei, amkd, java.util.List, arpe):java.lang.Object");
    }

    @armg
    public final Object x(amkd amkdVar, List list, arpe arpeVar) {
        Object w = w(null, amkdVar, list, arpeVar);
        if (w == arpl.a) {
            return w;
        }
        return arnb.a;
    }

    public final Object y(qei qeiVar, amkd amkdVar, List list, arpe arpeVar) {
        Object w = w(qeiVar, amkdVar, list, arpeVar);
        if (w == arpl.a) {
            return w;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v2, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(java.util.List r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.txy
            if (r0 == 0) goto L13
            r0 = r8
            txy r0 = (defpackage.txy) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            txy r0 = new txy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r8)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.aqil.P(r8)
            java.lang.Object r8 = r6.b
            rdx r2 = new rdx
            r4 = 0
            r5 = 13
            r2.<init>(r6, r7, r4, r5)
            r0.b = r3
            java.lang.Object r8 = defpackage.arro.q(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zai.z(java.util.List, arpe):java.lang.Object");
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, anen anenVar) {
        this.a = xze.g("Lighter", "LighterPWChangeHelper");
        this.e = armfVar;
        this.d = armfVar2;
        this.c = armfVar3;
        this.b = anenVar;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, anen anenVar) {
        this.e = armfVar;
        this.d = armfVar2;
        this.a = armfVar3;
        this.b = armfVar4;
        this.c = anenVar;
    }

    public zai(qei qeiVar, anen anenVar, anen anenVar2, vbs vbsVar, xdj xdjVar) {
        this.d = vbsVar;
        this.b = anenVar;
        this.c = anenVar2;
        this.e = xdjVar;
        this.a = qeiVar;
    }

    public zai(ttj ttjVar, wyp wypVar, usk uskVar, trz trzVar, anen anenVar) {
        this.c = ttjVar;
        this.d = wypVar;
        this.e = uskVar;
        this.b = trzVar;
        this.a = anenVar;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, short[] sArr) {
        this.d = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.e = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        arweVar.getClass();
        this.c = armfVar;
        this.e = armfVar2;
        this.d = armfVar3;
        this.a = armfVar4;
        this.b = arweVar;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map, java.lang.Object] */
    public zai(vmu vmuVar, Executor executor, anen anenVar, List list) {
        this.d = new HashMap();
        this.a = vmuVar;
        this.e = executor;
        this.b = anenVar;
        this.c = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next();
            if (bundle.containsKey("extra_im_notification_conversation_id")) {
                this.d.put(ruy.b(bundle.getString("extra_im_notification_conversation_id")), bundle);
            }
        }
    }

    public zai(zas zasVar, anen anenVar, Set set, yfg yfgVar) {
        this.c = zasVar;
        this.e = anenVar;
        this.b = set;
        this.d = yfgVar;
        this.a = new akbj(new vbo(this, 13), anenVar);
    }

    public zai(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "user_references._id";
        a.c = new wsy();
        tog togVar = new tog(a.a());
        this.d = togVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.i(true);
        a2.c(true);
        a2.d(true);
        a2.b = new toe(2);
        a2.a = "user_references.message_id";
        a2.e(true);
        a2.c = new wsy();
        tog togVar2 = new tog(a2.a());
        this.b = togVar2;
        agmi a3 = agmk.a();
        a3.d = 2;
        a3.i(true);
        a3.c(true);
        a3.d(true);
        a3.b = new toe(3);
        a3.a = "user_references.user_ref_id";
        a3.e(true);
        a3.c = new wsy();
        tog togVar3 = new tog(a3.a());
        this.c = togVar3;
        agmi a4 = agmk.a();
        a4.d = 2;
        a4.a = "user_references.user_ref_datetime";
        a4.c = new wsy();
        tog togVar4 = new tog(a4.a());
        this.e = togVar4;
        this.a = new tog[]{togVar, togVar2, togVar3, togVar4};
    }

    public zai(arwe arweVar, zen zenVar, zhi zhiVar, armf armfVar) {
        arweVar.getClass();
        zenVar.getClass();
        armfVar.getClass();
        this.a = arweVar;
        this.d = zenVar;
        this.b = zhiVar;
        this.e = armfVar;
        jdn jdnVar = new jdn(new asaa(new lfn(this, (arpe) null, 13)), zenVar.e, new liz((Object) this, 2, (char[]) null), 17, null);
        int i = ascp.a;
        this.c = arrn.T(jdnVar, arweVar, asco.a(0L, 3), new zaj(null));
    }

    public zai(arpi arpiVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        arpiVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = arpiVar;
        this.d = armfVar;
        this.a = armfVar2;
        this.c = armfVar3;
        this.e = armfVar4;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, char[] cArr, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.a = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, arwe arweVar, oum oumVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        arweVar.getClass();
        this.e = armfVar2;
        this.c = arweVar;
        this.b = oumVar;
        this.d = new ahlp(null, null, null, null);
        this.a = armd.a(new vnq(armfVar, 12));
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, char[] cArr) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        this.d = armfVar5;
    }

    public zai() {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.c(true);
        a.d(true);
        a.b = new toe(14);
        a.a = "vmt.part_id";
        a.e(true);
        a.c = new wsy();
        tpv tpvVar = new tpv(a.a());
        this.c = tpvVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.a = "vmt.vmt_status";
        a2.c = new wsy();
        tpv tpvVar2 = new tpv(a2.a());
        this.d = tpvVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "vmt.text";
        a3.c = new wsy();
        tpv tpvVar3 = new tpv(a3.a());
        this.e = tpvVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "vmt.locale";
        a4.c = new wsy();
        tpv tpvVar4 = new tpv(a4.a());
        this.b = tpvVar4;
        this.a = new tpv[]{tpvVar, tpvVar2, tpvVar3, tpvVar4};
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.b = armfVar5;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.c = armfVar5;
    }

    public zai(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.e = armfVar3;
        this.b = armfVar4;
        this.a = armfVar5;
    }

    public zai(arpi arpiVar, arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3) {
        arpiVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.b = arpiVar;
        this.c = arweVar;
        this.e = armfVar;
        this.d = armfVar2;
        this.a = armfVar3;
    }
}
