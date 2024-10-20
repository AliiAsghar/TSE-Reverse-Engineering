package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Duration;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpm implements jpq {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/ConversationDraftPersistence");
    public final ConversationId b;
    public final arpi c;
    public final arpi d;
    public final Set e;
    public final uie f;

    public jpm(ConversationId conversationId, arpi arpiVar, arpi arpiVar2, uie uieVar, Set set) {
        conversationId.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        uieVar.getClass();
        set.getClass();
        this.b = conversationId;
        this.c = arpiVar;
        this.d = arpiVar2;
        this.f = uieVar;
        this.e = set;
    }

    public final spa a(arqr arqrVar) {
        ConversationId conversationId = this.b;
        spb a2 = spj.a();
        a2.c(ruy.b(conversationId.b()));
        arqrVar.a(a2);
        return a2.a();
    }

    @Override // defpackage.jpq
    public final Object b(arpe arpeVar) {
        return arro.q(this.c, new ikp(this, (arpe) null, 3), arpeVar);
    }

    @Override // defpackage.jpq
    public final Object c(arpe arpeVar) {
        Object q = arro.q(this.d, new gau(this, (arpe) null, 20, (byte[]) null), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    @Override // defpackage.jpq
    public final Object d(jhc jhcVar, arpe arpeVar) {
        Object q = arro.q(this.c, new jec(this, jhcVar, (arpe) null, 12), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.spa r20, defpackage.arpe r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof defpackage.jpl
            if (r2 == 0) goto L17
            r2 = r1
            jpl r2 = (defpackage.jpl) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            jpl r2 = new jpl
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.b
            arpl r3 = defpackage.arpl.a
            int r4 = r2.d
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r4 = r2.a
            jhb r6 = r2.f
            spa r7 = r2.e
            defpackage.aqil.P(r1)
            goto L49
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            defpackage.aqil.P(r1)
            jhb r6 = new jhb
            r6.<init>()
            java.util.Set r1 = r0.e
            java.util.Iterator r4 = r1.iterator()
            r7 = r20
        L49:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r4.next()
            jpv r1 = (defpackage.jpv) r1
            r2.e = r7
            r2.f = r6
            r2.a = r4
            r2.d = r5
            java.lang.Object r1 = r1.a(r6, r7, r2)
            if (r1 != r3) goto L49
            return r3
        L64:
            r1 = 3
            r6.h = r1
            short r1 = r6.g
            r1 = r1 | 256(0x100, float:3.59E-43)
            short r2 = (short) r1
            r6.g = r2
            java.lang.String r8 = r6.a
            java.util.List r9 = r6.b
            java.lang.String r10 = r6.c
            boolean r11 = r6.d
            com.google.android.apps.messaging.shared.api.messaging.MessageId r12 = r6.e
            boolean r15 = r6.f
            int r1 = ~r1
            jhc r2 = new jhc
            r1 = r1 & 1023(0x3ff, float:1.434E-42)
            r13 = 0
            r14 = 0
            r16 = 3
            r17 = 0
            r7 = r2
            r18 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpm.e(spa, arpe):java.lang.Object");
    }

    @Override // defpackage.jpq
    public final Object f(arwe arweVar, asai asaiVar, Duration duration) {
        return qjh.l(arweVar, this.c, new gvr(this, duration, asaiVar, (arpe) null, 17), 2);
    }
}
