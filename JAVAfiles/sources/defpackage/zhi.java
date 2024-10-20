package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhi {
    public final Object a;
    public final Object b;
    public final Object c;

    public zhi(armf armfVar, armf armfVar2, armf armfVar3, char[] cArr) {
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    private final ajyk f() {
        return new zlb(this, this.c, 1);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [armf, java.lang.Object] */
    public final boolean a(rry rryVar) {
        if (yyb.d()) {
            if (((Boolean) ((utz) ymd.j.get()).e()).booleanValue() && rryVar.au() && TextUtils.isEmpty(rryVar.I()) && !rryVar.z().a() && !rryVar.aK() && ((yyp) this.a.b()).e) {
                return true;
            }
            return false;
        }
        if (((Boolean) ((utz) ymd.j.get()).e()).booleanValue() && rryVar.au() && TextUtils.isEmpty(rryVar.I()) && !rryVar.z().a() && ((yyp) this.a.b()).e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public final void b(ParticipantsTable.BindData bindData, int i, long j) {
        snf e = sni.e();
        e.c(sni.c.a);
        e.h(new yug(9));
        sla a = sld.a();
        a.f(new yur(bindData, 4));
        alog f = ((snf) e.j(agoh.b(a.b(), (agmh) sld.e.d, sni.c.a))).b().f();
        if (((alsx) f).c == 1) {
            ujv ujvVar = (ujv) this.a.b();
            Optional empty = Optional.empty();
            f.getClass();
            ujvVar.h(empty, (ConversationIdType) aqjn.ag(f), ((ryg) this.b).d(), bindData, alog.r(bindData), i, j, -1L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7 A[Catch: abra -> 0x00b9, TryCatch #0 {abra -> 0x00b9, blocks: (B:11:0x0028, B:12:0x0098, B:14:0x00a7, B:17:0x00af, B:21:0x00b3, B:28:0x0055, B:30:0x005d, B:33:0x009d, B:34:0x00a4), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[Catch: abra -> 0x00b9, TRY_LEAVE, TryCatch #0 {abra -> 0x00b9, blocks: (B:11:0x0028, B:12:0x0098, B:14:0x00a7, B:17:0x00af, B:21:0x00b3, B:28:0x0055, B:30:0x005d, B:33:0x009d, B:34:0x00a4), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: abra -> 0x00b9, TRY_ENTER, TryCatch #0 {abra -> 0x00b9, blocks: (B:11:0x0028, B:12:0x0098, B:14:0x00a7, B:17:0x00af, B:21:0x00b3, B:28:0x0055, B:30:0x005d, B:33:0x009d, B:34:0x00a4), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.ajwt r12, defpackage.arpe r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.yru
            if (r0 == 0) goto L13
            r0 = r13
            yru r0 = (defpackage.yru) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yru r0 = new yru
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3a
            if (r2 == r6) goto L34
            if (r2 != r5) goto L2c
            defpackage.aqil.P(r13)     // Catch: defpackage.abra -> Lb9
            goto L98
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            zhi r12 = r0.d
            defpackage.aqil.P(r13)
            goto L50
        L3a:
            defpackage.aqil.P(r13)
            java.lang.Object r13 = r11.a
            agxw r13 = (defpackage.agxw) r13
            com.google.common.util.concurrent.ListenableFuture r12 = r13.m(r12)
            r0.d = r11
            r0.b = r6
            java.lang.Object r13 = defpackage.arro.F(r12, r0)
            if (r13 == r1) goto Lbf
            r12 = r11
        L50:
            java.lang.String r13 = (java.lang.String) r13
            r2 = 0
            if (r13 == 0) goto La5
            java.lang.Object r7 = r12.c     // Catch: defpackage.abra -> Lb9
            int r8 = r13.length()     // Catch: defpackage.abra -> Lb9
            if (r8 <= 0) goto L9d
            abve r8 = defpackage.acib.a     // Catch: defpackage.abra -> Lb9
            alvw r8 = r8.g()     // Catch: defpackage.abra -> Lb9
            alwl r8 = (defpackage.alwl) r8     // Catch: defpackage.abra -> Lb9
            java.lang.String r9 = "GetSpatulaPreference: %s"
            r8.t(r9, r13)     // Catch: defpackage.abra -> Lb9
            ajxp r8 = new ajxp     // Catch: defpackage.abra -> Lb9
            r8.<init>(r2)     // Catch: defpackage.abra -> Lb9
            com.google.android.gms.common.Feature[] r9 = new com.google.android.gms.common.Feature[r6]     // Catch: defpackage.abra -> Lb9
            com.google.android.gms.common.Feature r10 = defpackage.acid.a     // Catch: defpackage.abra -> Lb9
            r9[r4] = r10     // Catch: defpackage.abra -> Lb9
            r8.d = r9     // Catch: defpackage.abra -> Lb9
            acdk r9 = new acdk     // Catch: defpackage.abra -> Lb9
            r10 = 7
            r9.<init>(r7, r13, r10, r2)     // Catch: defpackage.abra -> Lb9
            r8.c = r9     // Catch: defpackage.abra -> Lb9
            r13 = 34501(0x86c5, float:4.8346E-41)
            r8.b = r13     // Catch: defpackage.abra -> Lb9
            abtl r13 = r8.b()     // Catch: defpackage.abra -> Lb9
            abrc r7 = (defpackage.abrc) r7     // Catch: defpackage.abra -> Lb9
            acir r13 = r7.g(r13)     // Catch: defpackage.abra -> Lb9
            r0.d = r12     // Catch: defpackage.abra -> Lb9
            r0.b = r5     // Catch: defpackage.abra -> Lb9
            java.lang.Object r13 = defpackage.arsd.au(r13, r0)     // Catch: defpackage.abra -> Lb9
            if (r13 == r1) goto L9c
        L98:
            r2 = r13
            com.google.android.gms.spatula.settings.SpatulaSettingPreference r2 = (com.google.android.gms.spatula.settings.SpatulaSettingPreference) r2     // Catch: defpackage.abra -> Lb9
            goto La5
        L9c:
            return r1
        L9d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch: defpackage.abra -> Lb9
            java.lang.String r13 = "Failed requirement."
            r12.<init>(r13)     // Catch: defpackage.abra -> Lb9
            throw r12     // Catch: defpackage.abra -> Lb9
        La5:
            if (r2 == 0) goto Lb3
            yrs r12 = new yrs     // Catch: defpackage.abra -> Lb9
            int r13 = r2.a     // Catch: defpackage.abra -> Lb9
            if (r13 != r5) goto Lae
            goto Laf
        Lae:
            r6 = r4
        Laf:
            r12.<init>(r6, r5)     // Catch: defpackage.abra -> Lb9
            goto Lbe
        Lb3:
            yrs r12 = new yrs     // Catch: defpackage.abra -> Lb9
            r12.<init>(r4, r3)     // Catch: defpackage.abra -> Lb9
            goto Lbe
        Lb9:
            yrs r12 = new yrs
            r12.<init>(r4, r3)
        Lbe:
            return r12
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhi.c(ajwt, arpe):java.lang.Object");
    }

    public final Object d(ajwt ajwtVar, arpe arpeVar) {
        return ((qrq) this.b).a(ajwtVar, new yqs(this, ajwtVar, (arpe) null, 6), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.yrt
            if (r0 == 0) goto L13
            r0 = r6
            yrt r0 = (defpackage.yrt) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yrt r0 = new yrt
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            ajwt r1 = r0.c
            zhi r0 = r0.e
            defpackage.aqil.P(r6)
            goto L67
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            zhi r2 = r0.e
            defpackage.aqil.P(r6)
            goto L53
        L3c:
            defpackage.aqil.P(r6)
            ajzn r6 = new ajzn
            r6.<init>()
            com.google.common.util.concurrent.ListenableFuture r6 = defpackage.albo.bH(r6)
            r0.e = r5
            r0.b = r4
            java.lang.Object r6 = defpackage.arro.F(r6, r0)
            if (r6 == r1) goto L76
            r2 = r5
        L53:
            ajwt r6 = (defpackage.ajwt) r6
            r6.getClass()
            r0.e = r2
            r0.c = r6
            r0.b = r3
            java.lang.Object r0 = r2.c(r6, r0)
            if (r0 == r1) goto L76
            r1 = r6
            r6 = r0
            r0 = r2
        L67:
            yrs r6 = (defpackage.yrs) r6
            java.lang.Object r0 = r0.b
            r1.getClass()
            qrq r0 = (defpackage.qrq) r0
            r0.b(r1, r6)
            arnb r6 = defpackage.arnb.a
            return r6
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhi.e(arpe):java.lang.Object");
    }

    public zhi(agxw agxwVar, achz achzVar, qrq qrqVar, arpi arpiVar, arwe arweVar) {
        agxwVar.getClass();
        qrqVar.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        this.a = agxwVar;
        this.c = achzVar;
        this.b = qrqVar;
    }

    public zhi(arpi arpiVar, psh pshVar, hgj hgjVar) {
        arpiVar.getClass();
        pshVar.getClass();
        hgjVar.getClass();
        this.a = arpiVar;
        this.b = pshVar;
        this.c = hgjVar;
    }

    public zhi(ApplicationSettingsActivity applicationSettingsActivity, mbl mblVar, armf armfVar, armf armfVar2, armf armfVar3, Optional optional) {
        this.b = applicationSettingsActivity;
        this.a = mblVar;
        this.c = armfVar3;
        if (kpt.a()) {
            ajxd ajxdVar = (ajxd) armfVar.b();
            ajyt b = ajyu.b(applicationSettingsActivity);
            b.b(akag.class);
            ajxdVar.c(new akaf((akag) armfVar2.b(), 0));
            b.b(akaa.class);
            ajxdVar.d(b.a());
            ajxdVar.c(f());
            return;
        }
        ajxd ajxdVar2 = (ajxd) armfVar.b();
        ajyt b2 = ajyu.b(applicationSettingsActivity);
        b2.b(ibc.class);
        ajxdVar2.c(f());
        ajxdVar2.d(b2.a());
        optional.ifPresent(new xyh(7));
    }

    public zhi(ryg rygVar, xnv xnvVar, armf armfVar) {
        rygVar.getClass();
        xnvVar.getClass();
        armfVar.getClass();
        this.b = rygVar;
        this.c = xnvVar;
        this.a = armfVar;
    }

    public zhi(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
    }

    public zhi(Optional optional, ConversationMessageView conversationMessageView) {
        iit iitVar = iit.REACTION_BADGE;
        iit iitVar2 = iit.CUSTOM_REACTION_BADGE;
        iit iitVar3 = iit.STAR_BADGE;
        iit iitVar4 = iit.CALENDAR_BADGE;
        iit iitVar5 = iit.SCHEDULED_SEND_BADGE;
        iit iitVar6 = iit.REMINDER_BADGE;
        albo.v(iitVar, this);
        albo.v(iitVar2, this);
        albo.v(iitVar3, this);
        albo.v(iitVar4, this);
        albo.v(iitVar5, this);
        albo.v(iitVar6, this);
        this.a = altc.a(6, new Object[]{iitVar, this, iitVar2, this, iitVar3, this, iitVar4, this, iitVar5, this, iitVar6, this});
        this.c = optional;
        this.b = conversationMessageView;
    }

    public zhi(armf armfVar, armf armfVar2, armf armfVar3, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
    }
}
