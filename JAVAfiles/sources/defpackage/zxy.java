package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.Guideline;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsViewModel;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxy {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public zxy(abbu abbuVar, uhc uhcVar, aksr aksrVar, msk mskVar, anen anenVar) {
        this.c = abbuVar;
        this.b = uhcVar;
        this.a = aksrVar;
        this.d = mskVar;
        this.e = anenVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    private final wul E() {
        return (wul) this.e.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    public final xsf A() {
        if (((xtj) this.d.b()).d() == amuk.TRANSPORT_TACHYGRAM) {
            return (xsf) this.c.b();
        }
        return (xsf) this.e.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v2, types: [asai, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xkm
            if (r0 == 0) goto L13
            r0 = r5
            xkm r0 = (defpackage.xkm) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            xkm r0 = new xkm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            java.lang.Object r5 = r4.c
            r0.b = r3
            java.lang.Object r5 = defpackage.arrn.U(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            xlc r5 = (defpackage.xlc) r5
            boolean r5 = r5.f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxy.B(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v6, types: [asai, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xkn
            if (r0 == 0) goto L13
            r0 = r6
            xkn r0 = (defpackage.xkn) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            xkn r0 = new xkn
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            zxy r0 = r0.d
            defpackage.aqil.P(r6)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            zxy r2 = r0.d
            defpackage.aqil.P(r6)
            goto L48
        L3a:
            defpackage.aqil.P(r6)
            r0.d = r5
            r0.b = r4
            java.lang.Object r6 = r5.B(r0)
            if (r6 == r1) goto L7b
            r2 = r5
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L52
            r6 = 0
            return r6
        L52:
            java.lang.Object r6 = r2.c
            r0.d = r2
            r0.b = r3
            java.lang.Object r6 = defpackage.arrn.U(r6, r0)
            if (r6 == r1) goto L7b
            r0 = r2
        L5f:
            xlc r6 = (defpackage.xlc) r6
            apct r6 = r6.g
            if (r6 != 0) goto L67
            apct r6 = defpackage.apct.a
        L67:
            r6.getClass()
            j$.time.Instant r6 = defpackage.aoue.m(r6)
            java.lang.Object r0 = r0.d
            xnv r0 = (defpackage.xnv) r0
            j$.time.Instant r0 = r0.f()
            j$.time.Duration r6 = j$.time.Duration.between(r6, r0)
            return r6
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxy.C(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v6, types: [asai, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(boolean r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.xkr
            if (r0 == 0) goto L13
            r0 = r10
            xkr r0 = (defpackage.xkr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xkr r0 = new xkr
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r9 = r0.a
            arsb r9 = (defpackage.arsb) r9
            defpackage.aqil.P(r10)
            goto L85
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            boolean r9 = r0.b
            arsb r2 = r0.e
            java.lang.Object r4 = r0.a
            zxy r4 = (defpackage.zxy) r4
            defpackage.aqil.P(r10)
            r7 = r2
            r2 = r10
            r10 = r7
            goto L6d
        L45:
            defpackage.aqil.P(r10)
            arsb r10 = new arsb
            r10.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r5 = 0
            r2.<init>(r5)
            r10.a = r2
            wul r2 = r8.E()
            xks r6 = new xks
            r6.<init>(r8, r9, r10, r5)
            r0.a = r8
            r0.e = r10
            r0.b = r9
            r0.d = r4
            java.lang.Object r2 = r2.d(r6, r0)
            if (r2 == r1) goto L92
            r4 = r8
        L6d:
            xlc r2 = (defpackage.xlc) r2
            java.lang.Object r2 = r4.c
            xkq r4 = new xkq
            r4.<init>(r2, r9)
            r0.a = r10
            r9 = 0
            r0.e = r9
            r0.d = r3
            java.lang.Object r9 = defpackage.arrn.U(r4, r0)
            if (r9 != r1) goto L84
            goto L92
        L84:
            r9 = r10
        L85:
            java.lang.Object r9 = r9.a
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9
            boolean r9 = r9.get()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxy.D(boolean, arpe):java.lang.Object");
    }

    public final void a() {
        boolean z;
        int i;
        boolean isInMultiWindowMode;
        int b;
        int i2 = 90;
        int rotation = ((Activity) this.d).getWindowManager().getDefaultDisplay().getRotation() * 90;
        Object obj = this.d;
        int c = abbu.c((Context) obj);
        if (((Activity) obj).getResources().getConfiguration().getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (rotation == 90) {
                rotation = 90;
                i = c;
            }
            i = 0;
        } else {
            if (rotation == 270) {
                rotation = 270;
                i = c;
            }
            i = 0;
        }
        if (true == z) {
            i2 = 270;
        }
        if (rotation != i2) {
            c = 0;
        }
        if (z) {
            aabr.ak((Guideline) this.a, i);
        } else {
            aabr.aj((Guideline) this.a, i);
        }
        if (z) {
            aabr.aj((Guideline) this.c, c);
        } else {
            aabr.ak((Guideline) this.c, c);
        }
        aabr.aj((Guideline) this.e, abbu.d((Context) this.d));
        isInMultiWindowMode = ((Activity) this.d).isInMultiWindowMode();
        if (isInMultiWindowMode) {
            b = abbu.c((Context) this.d);
        } else {
            b = abbu.b((Context) this.d);
        }
        aabr.ak((Guideline) this.b, b);
    }

    public final void b(char c) {
        ((StringBuilder) this.c).append(c);
        ((SpannableStringBuilder) this.b).append(c);
    }

    public final void c(long j) {
        ((StringBuilder) this.c).append(j);
        ((SpannableStringBuilder) this.b).append((CharSequence) String.valueOf(j));
    }

    public final void d(String str) {
        ((StringBuilder) this.c).append(str);
        if (str == null) {
            str = "null";
        }
        ((SpannableStringBuilder) this.b).append((CharSequence) str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [msk, java.lang.Object] */
    public final void e(String str) {
        if (str != null) {
            ?? r0 = this.e;
            SpannableString a = ((xwr) this.d).a(r0.n(str));
            ((SpannableStringBuilder) this.b).append(a, a, 0);
            ((StringBuilder) this.c).append((CharSequence) a);
            return;
        }
        ((StringBuilder) this.c).append((String) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final void f(aabc aabcVar) {
        this.a.add(aabcVar);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Set, java.lang.Object] */
    public final void g(String str) {
        do {
        } while (((CopyOnWriteArrayList) this.d).remove(str));
        ((CopyOnWriteArrayList) this.d).add(0, str);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aabc) it.next()).K(this);
        }
        aktp.ah(new zom(this, 16), this.c).k(qiu.b(), andi.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final void h(aabc aabcVar) {
        this.a.remove(aabcVar);
    }

    public final long i() {
        return ((ykw) this.b).e(((Resources) this.c).getString(R.string.link_preview_tombstone_first_shown_millis_pref_key), -1L);
    }

    public final String j() {
        String f = ((ykw) this.b).f("provisioning_session_id", "");
        if (TextUtils.isEmpty(f)) {
            String uuid = UUID.randomUUID().toString();
            ((ykw) this.b).l("provisioning_session_id", uuid);
            return uuid;
        }
        return f;
    }

    public final void k(boolean z) {
        ((ykw) this.b).h("app_contains_verified_sms_data", z);
    }

    public final void l(long j) {
        ((ykw) this.b).k(((Resources) this.c).getString(R.string.link_preview_tombstone_first_shown_millis_pref_key), j);
    }

    public final boolean m() {
        return ((Resources) this.c).getBoolean(R.bool.link_preview_enabled_pref_default);
    }

    public final boolean n() {
        Resources resources = (Resources) this.c;
        return ((ykw) this.b).q(resources.getString(R.string.rich_cards_settings_enable_all_pref_key), resources.getBoolean(R.bool.rich_cards_settings_enable_all_pref_default));
    }

    public final boolean o() {
        return p(m());
    }

    public final boolean p(boolean z) {
        return ((ykw) this.b).q(((Resources) this.c).getString(R.string.link_preview_enabled_pref_key), z);
    }

    public final boolean q() {
        if (!yig.b()) {
            return false;
        }
        return ((ykw) this.b).q(((Resources) this.c).getString(R.string.mc_enabled_pref_key), ((Resources) this.c).getBoolean(R.bool.mc_enabled_pref_default));
    }

    public final boolean r() {
        Resources resources = (Resources) this.c;
        return ((ykw) this.b).q(resources.getString(R.string.link_preview_wifi_only_pref_key), resources.getBoolean(R.bool.link_preview_wifi_only_pref_default));
    }

    public final boolean s() {
        Resources resources = (Resources) this.c;
        return ((ykw) this.b).q(resources.getString(R.string.share_typing_status_rcs_pref_key), resources.getBoolean(R.bool.share_typing_status_rcs_pref_default));
    }

    public final boolean t() {
        if (!((Boolean) yig.C.e()).booleanValue()) {
            return false;
        }
        return ((ykw) this.b).q(((Resources) this.c).getString(R.string.smart_compose_enabled_pref_key), ((Resources) this.c).getBoolean(R.bool.smart_compose_enabled_pref_default));
    }

    public final boolean u() {
        Resources resources = (Resources) this.c;
        return ((ykw) this.b).q(resources.getString(R.string.p2p_conversation_suggestions_enabled_pref_key), resources.getBoolean(R.bool.p2p_conversation_suggestions_enabled_pref_default));
    }

    public final void v() {
        ((ykw) this.b).h(((Resources) this.c).getString(R.string.link_preview_tombstone_seen_pref_key), true);
    }

    public final int w() {
        int aG = akec.aG(((ykw) this.b).d("rcs_onboarding_progress", 0));
        if (aG == 0) {
            return 1;
        }
        return aG;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    public final ykw x(int i) {
        int a = ((yjy) this.e).h(i).a();
        ykv ykvVar = (ykv) vn.a((vm) this.c, a);
        if (ykvVar == null) {
            synchronized (this.d) {
                ykvVar = (ykv) vn.a((vm) this.c, a);
                if (ykvVar == null) {
                    Object obj = this.b;
                    Context context = (Context) ((yyt) obj).d.b();
                    context.getClass();
                    ykt yktVar = (ykt) ((yyt) obj).c.b();
                    yktVar.getClass();
                    yjy yjyVar = (yjy) ((yyt) obj).a.b();
                    yjyVar.getClass();
                    xbf xbfVar = (xbf) ((yyt) obj).b.b();
                    xbfVar.getClass();
                    ykv ykvVar2 = new ykv(context, yktVar, yjyVar, xbfVar, a, this);
                    ((vm) this.c).f(a, ykvVar2);
                    ((Optional) this.a).ifPresent(new ybf(ykvVar2, 18));
                    ykvVar = ykvVar2;
                }
            }
        }
        return ykvVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    public final Optional y(Optional optional) {
        String str;
        if (((Boolean) this.c.b()).booleanValue()) {
            str = (String) this.e.b();
        } else if (((Boolean) this.b.b()).booleanValue()) {
            str = "https://rcs-copper-dynamic.sandbox.googleapis.com";
        } else {
            str = null;
        }
        if (str != null) {
            return Optional.of(str);
        }
        qei qeiVar = (qei) optional.orElseThrow();
        return ((adje) this.a.b()).j(((adae) this.d).d(qeiVar.d)).map(new xos(10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    public final xpz z() {
        if (((xtj) this.d.b()).d() != amuk.TRANSPORT_TACHYGRAM && !((Boolean) ((utz) pyl.a.get()).e()).booleanValue()) {
            return (xpz) this.b.b();
        }
        return (xpz) this.a.b();
    }

    public zxy(Activity activity, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4) {
        this.d = activity;
        this.a = guideline;
        this.e = guideline2;
        this.c = guideline3;
        this.b = guideline4;
    }

    public zxy(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, adae adaeVar) {
        this.a = armfVar;
        this.d = adaeVar;
        this.c = armfVar2;
        this.e = armfVar3;
        this.b = armfVar4;
    }

    public zxy(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr, byte[] bArr2) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.e = armfVar4;
        this.d = armfVar5;
    }

    public zxy(yyt yytVar, wpp wppVar, yyt yytVar2, znj znjVar, znj znjVar2) {
        this.a = yytVar;
        this.d = wppVar;
        this.e = yytVar2;
        this.b = znjVar;
        this.c = znjVar2;
    }

    public zxy(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
    }

    public zxy(armf armfVar, xnv xnvVar, arwe arweVar) {
        armfVar.getClass();
        xnvVar.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.d = xnvVar;
        this.b = arweVar;
        this.e = armd.a(new vnq(this, 9));
        asai e = E().e();
        int i = ascp.a;
        this.c = arrn.S(e, arweVar, asco.b, 1);
    }

    public zxy(yyt yytVar, yjy yjyVar, Optional optional) {
        this.c = new vm();
        this.d = new Object();
        this.b = yytVar;
        this.e = yjyVar;
        this.a = optional;
    }

    public zxy(ykw ykwVar, Context context, xnv xnvVar, wfh wfhVar, anen anenVar) {
        this.b = ykwVar;
        this.c = context.getResources();
        this.e = xnvVar;
        this.a = wfhVar;
        this.d = anenVar;
    }

    public zxy(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.e = armfVar4;
        cg cgVar = (cg) armfVar2.b();
        arml b = armd.b(3, new zni(new zni(cgVar, 13), 14));
        int i = arsc.a;
        this.d = new eot(new arrh(ConversationDetailsViewModel.class), new zni(b, 15), new zwj(cgVar, b, 2, null), new zni(b, 16));
    }

    public zxy(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
    }

    public zxy(arwe arweVar, asai asaiVar, asai asaiVar2, asai asaiVar3, armf armfVar) {
        arweVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        armfVar.getClass();
        this.b = arweVar;
        this.c = asaiVar;
        this.a = asaiVar2;
        this.d = asaiVar3;
        this.e = armfVar;
    }

    public zxy(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.c = arweVar;
        this.a = armfVar;
        this.b = armfVar2;
        this.e = armfVar3;
        this.d = armfVar4;
    }

    public zxy(arwe arweVar, armf armfVar) {
        arweVar.getClass();
        armfVar.getClass();
        this.a = arweVar;
        this.e = armfVar;
        this.c = ascy.a(null);
        this.b = ascy.a(zzk.a);
        this.d = ascy.a(new dre(0L));
    }

    public zxy(Executor executor, ykw ykwVar) {
        this.d = new CopyOnWriteArrayList();
        this.a = new LinkedHashSet();
        this.c = new anew(executor);
        this.b = ykwVar;
        this.e = "recent_emoji";
        new aabb(this).e(new Void[0]);
    }

    public zxy(xwr xwrVar, msk mskVar, MessageIdType messageIdType) {
        this.d = xwrVar;
        this.e = mskVar;
        this.a = messageIdType;
        this.c = new StringBuilder();
        this.b = new SpannableStringBuilder();
    }
}
