package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aair {
    public final armf a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public aair(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.f = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.g = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
        armfVar6.getClass();
        this.d = armfVar6;
        armfVar7.getClass();
        this.b = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
    }

    public static final slu e(ConversationIdType conversationIdType) {
        Object apply;
        sxy ap = yyb.ap(conversationIdType);
        slv a = sly.a();
        a.w("createRbmSuggestionsQuery");
        apply = new yur(ap, 13).apply(new slx());
        a.k(new agpw((slx) apply));
        return a.b();
    }

    public static final String f(ConversationIdType conversationIdType) {
        Objects.toString(conversationIdType);
        return "pending_suggestion".concat(conversationIdType.toString());
    }

    public final cj a() {
        return ((aaip) this.b).F();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [armf, java.lang.Object] */
    public final void b() {
        if (((Optional) this.d.b()).isPresent()) {
            MessageCoreData a = ((rvq) this.e.b()).a(a().getIntent());
            if (a != null) {
                ((ghw) ((Optional) this.d.b()).get()).t(a(), null, a, amwf.SHARE_INTENT);
                a().finish();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        aaik aP = aaik.aP();
        Bundle bundle = new Bundle(1);
        bundle.putInt("intent_source", amwf.SHARE_INTENT.e);
        aP.ak(bundle);
        aP.q(((aaip) this.b).G(), "ShareIntentFragment");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r18, defpackage.arpe r19) {
        /*
            r17 = this;
            r0 = r19
            boolean r1 = r0 instanceof defpackage.zfa
            if (r1 == 0) goto L17
            r1 = r0
            zfa r1 = (defpackage.zfa) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.b = r2
            r2 = r17
            goto L1e
        L17:
            zfa r1 = new zfa
            r2 = r17
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.a
            arpl r3 = defpackage.arpl.a
            int r4 = r1.b
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            defpackage.aqil.P(r0)
            goto L4b
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            defpackage.aqil.P(r0)
            slu r0 = e(r18)
            akul r0 = r0.s()
            r0.getClass()
            r1.b = r5
            java.lang.Object r0 = defpackage.arro.F(r0, r1)
            if (r0 == r3) goto Le4
        L4b:
            alog r0 = (defpackage.alog) r0
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L59:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Ldf
            java.lang.Object r3 = r0.next()
            sln r3 = (defpackage.sln) r3
            r3.getClass()
            alhr r4 = com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData.a
            java.lang.Object r4 = r4.get()
            utz r4 = (defpackage.utz) r4
            java.lang.Object r4 = r4.e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L85
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r4 = r3.h()
            boolean r4 = r4.b()
            goto L8d
        L85:
            rve r4 = r3.k()
            boolean r4 = r4.i()
        L8d:
            if (r4 == 0) goto L91
            r3 = 0
            goto Ld8
        L91:
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData r10 = new com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData
            r4 = 2
            java.lang.String r5 = "conversation_suggestion_type"
            r3.ao(r4, r5)
            int r11 = r3.c
            r4 = 3
            java.lang.String r5 = "properties"
            r3.ao(r4, r5)
            java.lang.String r12 = r3.d
            r4 = 4
            java.lang.String r5 = "post_back_data"
            r3.ao(r4, r5)
            java.lang.String r13 = r3.e
            r4 = 5
            java.lang.String r5 = "post_back_encoding"
            r3.ao(r4, r5)
            java.lang.String r14 = r3.f
            r4 = 6
            java.lang.String r5 = "rcs_message_id"
            r3.ao(r4, r5)
            rve r4 = r3.g
            java.lang.String r15 = r4.b
            rve r4 = r3.k()
            java.lang.String r4 = r4.b
            r16 = r4
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r5 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.createRbmConversationSuggestion(r11, r12, r13, r14, r15, r16)
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6 = r3.h()
            r6.getClass()
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r3 = r10
        Ld8:
            if (r3 == 0) goto L59
            r1.add(r3)
            goto L59
        Ldf:
            alog r0 = defpackage.alzz.aZ(r1)
            return r0
        Le4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aair.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.zfb
            if (r0 == 0) goto L13
            r0 = r8
            zfb r0 = (defpackage.zfb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            zfb r0 = new zfb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L32
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.aqil.P(r8)
            goto L83
        L36:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r0.c
            aair r2 = r0.e
            defpackage.aqil.P(r8)
            goto L57
        L3e:
            defpackage.aqil.P(r8)
            r0.e = r6
            r0.c = r7
            r0.b = r5
            tay r8 = defpackage.hwr.s(r7)
            com.google.common.util.concurrent.ListenableFuture r8 = r8.v()
            java.lang.Object r8 = defpackage.arro.F(r8, r0)
            if (r8 != r1) goto L56
            goto L82
        L56:
            r2 = r6
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r5 = 0
            if (r8 == 0) goto L6e
            r0.e = r5
            r0.c = r5
            r0.b = r4
            java.lang.Object r7 = r2.c(r7, r0)
            if (r7 != r1) goto L6d
            goto L82
        L6d:
            return r7
        L6e:
            r0.e = r5
            r0.c = r5
            r0.b = r3
            armf r8 = r2.a
            java.lang.Object r8 = r8.b()
            yyt r8 = (defpackage.yyt) r8
            java.lang.Object r7 = r8.g(r7, r0)
            if (r7 != r1) goto L84
        L82:
            r8 = r1
        L83:
            return r8
        L84:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aair.d(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r13, java.lang.Integer r14, defpackage.arpe r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.yov
            if (r0 == 0) goto L13
            r0 = r15
            yov r0 = (defpackage.yov) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yov r0 = new yov
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akrh r13 = r0.c
            defpackage.aqil.P(r15)     // Catch: java.lang.Throwable -> L29
            goto L5f
        L29:
            r14 = move-exception
            goto L68
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            defpackage.aqil.P(r15)
            java.lang.String r15 = "IncomingMessageSpamCheckParamsFactory.createParams"
            akrh r15 = defpackage.aktp.e(r15)
            java.lang.Object r2 = r12.b     // Catch: java.lang.Throwable -> L65
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L65
            r2.getClass()     // Catch: java.lang.Throwable -> L65
            arpi r2 = (defpackage.arpi) r2     // Catch: java.lang.Throwable -> L65
            akbx r10 = new akbx     // Catch: java.lang.Throwable -> L65
            r8 = 0
            r9 = 1
            r4 = r10
            r5 = r13
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L65
            r0.c = r15     // Catch: java.lang.Throwable -> L65
            r0.b = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r13 = defpackage.arro.q(r2, r10, r0)     // Catch: java.lang.Throwable -> L65
            if (r13 == r1) goto L64
            r11 = r15
            r15 = r13
            r13 = r11
        L5f:
            r14 = 0
            defpackage.armd.i(r13, r14)
            return r15
        L64:
            return r1
        L65:
            r13 = move-exception
            r14 = r13
            r13 = r15
        L68:
            throw r14     // Catch: java.lang.Throwable -> L69
        L69:
            r15 = move-exception
            defpackage.armd.i(r13, r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aair.g(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Integer, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v3, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.arwl r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yox
            if (r0 == 0) goto L13
            r0 = r6
            yox r0 = (defpackage.yox) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yox r0 = new yox
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aair r5 = r0.d
            defpackage.aqil.P(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            r0.d = r4
            r0.b = r3
            java.lang.Object r6 = r5.n(r0)
            if (r6 == r1) goto L66
            r5 = r4
        L3f:
            msh r6 = (defpackage.msh) r6
            if (r6 != 0) goto L45
            r5 = 0
            return r5
        L45:
            java.lang.Object r5 = r5.c
            java.lang.Object r5 = r5.b()
            lfl r5 = (defpackage.lfl) r5
            alog r6 = defpackage.alog.r(r6)
            alog r5 = r5.o(r6)
            r5.getClass()
            java.lang.Object r5 = defpackage.aqjn.ag(r5)
            amgg r5 = (defpackage.amgg) r5
            r5.getClass()
            amzr r5 = defpackage.yyb.O(r5)
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aair.h(arwl, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v3, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.arwl r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yoy
            if (r0 == 0) goto L13
            r0 = r6
            yoy r0 = (defpackage.yoy) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yoy r0 = new yoy
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aair r5 = r0.d
            defpackage.aqil.P(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            r0.d = r4
            r0.b = r3
            java.lang.Object r6 = r5.n(r0)
            if (r6 == r1) goto L52
            r5 = r4
        L3f:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r6 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r6
            if (r6 != 0) goto L45
            r5 = 0
            return r5
        L45:
            java.lang.Object r5 = r5.e
            java.lang.Object r5 = r5.b()
            msk r5 = (defpackage.msk) r5
            msh r5 = r5.q(r6)
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aair.i(arwl, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.yow
            if (r0 == 0) goto L13
            r0 = r10
            yow r0 = (defpackage.yow) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yow r0 = new yow
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            akrh r9 = r0.c
            defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L2a
            goto L5c
        L2a:
            r10 = move-exception
            goto L65
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r10)
            java.lang.String r10 = "IncomingMessageSpamCheckParamsFactory.createParams-messageId"
            akrh r10 = defpackage.aktp.e(r10)
            java.lang.Object r2 = r8.b     // Catch: java.lang.Throwable -> L61
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L61
            r2.getClass()     // Catch: java.lang.Throwable -> L61
            arpi r2 = (defpackage.arpi) r2     // Catch: java.lang.Throwable -> L61
            xgk r5 = new xgk     // Catch: java.lang.Throwable -> L61
            r6 = 20
            r5.<init>(r8, r9, r3, r6)     // Catch: java.lang.Throwable -> L61
            r0.c = r10     // Catch: java.lang.Throwable -> L61
            r0.b = r4     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = defpackage.arro.q(r2, r5, r0)     // Catch: java.lang.Throwable -> L61
            if (r9 == r1) goto L60
            r7 = r10
            r10 = r9
            r9 = r7
        L5c:
            defpackage.armd.i(r9, r3)
            return r10
        L60:
            return r1
        L61:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            throw r10     // Catch: java.lang.Throwable -> L66
        L66:
            r0 = move-exception
            defpackage.armd.i(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aair.j(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, arpe):java.lang.Object");
    }

    public aair(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        this.a = armfVar;
        this.d = armfVar2;
        this.h = armfVar3;
        this.g = armfVar4;
        this.e = armfVar5;
        this.f = armfVar6;
        this.c = armfVar7;
        this.b = armfVar8;
    }

    public aair(ansy ansyVar, arpi arpiVar, arwe arweVar, armf armfVar, ahiy ahiyVar, xnv xnvVar, armf armfVar2) {
        ansyVar.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        armfVar.getClass();
        ahiyVar.getClass();
        xnvVar.getClass();
        armfVar2.getClass();
        this.b = ansyVar;
        this.e = arpiVar;
        this.d = arweVar;
        this.f = armfVar;
        this.h = ahiyVar;
        this.a = armfVar2;
        this.c = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
    }

    public aair(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, byte[] bArr) {
        armfVar.getClass();
        this.g = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.h = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.d = armfVar6;
        armfVar7.getClass();
        this.c = armfVar7;
        armfVar8.getClass();
        this.f = armfVar8;
    }

    public aair(@org armf armfVar, anen anenVar, arwe arweVar, ansy ansyVar, armf armfVar2, yjy yjyVar, uac uacVar, ndi ndiVar) {
        armfVar.getClass();
        anenVar.getClass();
        arweVar.getClass();
        ansyVar.getClass();
        armfVar2.getClass();
        yjyVar.getClass();
        uacVar.getClass();
        ndiVar.getClass();
        this.g = armfVar;
        this.c = anenVar;
        this.f = arweVar;
        this.h = ansyVar;
        this.a = armfVar2;
        this.b = yjyVar;
        this.e = uacVar;
        this.d = ndiVar;
    }

    public aair(Context context, arwe arweVar, asai asaiVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        context.getClass();
        arweVar.getClass();
        asaiVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.d = context;
        this.g = arweVar;
        this.f = asaiVar;
        this.a = armfVar;
        this.h = armfVar2;
        this.c = armfVar3;
        this.e = armfVar4;
        this.b = armfVar5;
    }

    public aair(arwe arweVar, asai asaiVar, asai asaiVar2, @oqd armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        arweVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.e = arweVar;
        this.d = asaiVar;
        this.f = asaiVar2;
        this.a = armfVar;
        this.h = armfVar2;
        this.b = armfVar3;
        this.c = armfVar4;
        this.g = armfVar5;
    }

    public aair(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.g = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.f = armfVar5;
        armfVar6.getClass();
        this.h = armfVar6;
        armfVar7.getClass();
        this.c = armfVar7;
        armfVar8.getClass();
        this.b = armfVar8;
    }

    public aair(aaip aaipVar, armf armfVar, apwt apwtVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        apwtVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.b = aaipVar;
        this.a = armfVar;
        this.c = apwtVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = new akgh<kpe>() { // from class: aair.1
            @Override // defpackage.akgh
            public final void a(Throwable th) {
                th.getClass();
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [apwt, java.lang.Object] */
            @Override // defpackage.akgh
            public final /* bridge */ /* synthetic */ void c(Object obj) {
                kpe kpeVar = (kpe) obj;
                kpeVar.getClass();
                if (kpeVar == kpe.REMOTE) {
                    aair aairVar = aair.this;
                    ((Optional) aairVar.c.b()).ifPresent(new aagi(new aaji(aairVar, 1), 6));
                    aairVar.a().finish();
                    return;
                }
                aair.this.b();
            }

            @Override // defpackage.akgh
            public final /* synthetic */ void b() {
            }
        };
    }
}
