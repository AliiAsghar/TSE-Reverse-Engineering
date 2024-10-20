package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynr {
    public static final utz a = uuh.e(uuh.b, "spam_logging_ids_user_id_lifetime_days", 14);
    private static final utz d = uuh.e(uuh.b, "spam_logging_ids_conversation_and_message_id_lifetime_days", 7);
    public final xnv b;
    public final arwe c;
    private final agnq e;
    private final aiwu f;

    public ynr(aiwu aiwuVar, xnv xnvVar, agnq agnqVar, arwe arweVar) {
        aiwuVar.getClass();
        xnvVar.getClass();
        agnqVar.getClass();
        arweVar.getClass();
        this.f = aiwuVar;
        this.b = xnvVar;
        this.e = agnqVar;
        this.c = arweVar;
    }

    public static final ynt c(ConversationIdType conversationIdType, MessageIdType messageIdType, ynr ynrVar) {
        agnw d2;
        agnw d3;
        String h;
        yob yobVar = new yob();
        yobVar.b(conversationIdType);
        yobVar.d();
        yobVar.c();
        int i = 5;
        if (messageIdType == null) {
            yobVar.U(new agmg("spam_logging_ids_table.message_id", 5));
            yobVar.U(new agmg("spam_logging_ids_table.message_logging_id", 5));
        } else {
            yobVar.U(new agmd("spam_logging_ids_table.message_id", 1, Long.valueOf(rvc.a(messageIdType))));
            yobVar.U(new agmd("spam_logging_ids_table.message_logging_id", 2, ""));
            yobVar.U(new agmg("spam_logging_ids_table.message_logging_id", 6));
        }
        yoa yoaVar = new yoa(yoc.a);
        yoaVar.w("SpamLoggingIds#getConversationAndMessageLoggingIds#both");
        yoaVar.k(new agpw(yobVar));
        alog t = yoaVar.b().t();
        t.getClass();
        ynt yntVar = (ynt) aqjn.Z(t);
        if (yntVar == null) {
            yoa yoaVar2 = new yoa(yoc.a);
            yoaVar2.w("SpamLoggingIds#getConversationAndMessageLoggingIds#conversation");
            yoaVar2.c(new yec(conversationIdType, 15));
            alog t2 = yoaVar2.b().t();
            t2.getClass();
            ynt yntVar2 = (ynt) aqjn.Z(t2);
            int i2 = yaa.a;
            ynu ynuVar = new ynu();
            ynuVar.b(conversationIdType);
            ynuVar.d(ynrVar.b.f().toEpochMilli());
            if (yntVar2 != null && (h = yntVar2.h()) != null && h.length() != 0) {
                ynuVar.c(yntVar2.h());
            } else {
                ynuVar.c(UUID.randomUUID().toString());
            }
            if (messageIdType != null) {
                ynuVar.e(messageIdType);
                ynuVar.f(UUID.randomUUID().toString());
            }
            try {
                ynt a2 = ynuVar.a(new yaa(11));
                d2 = agnc.d("$primary");
                d3 = agnc.d("$primary");
                agnc.a(d3, "spam_logging_ids_table", a2, new yec(d2, 16), new xyh(i));
                return a2;
            } catch (SQLiteConstraintException unused) {
                return null;
            }
        }
        return yntVar;
    }

    private final void i() {
        Object apply;
        long a2 = a();
        yny ynyVar = new yny();
        ynyVar.f("SpamLoggingIds#deleteExpiredTableRows");
        apply = new rum(a2, 9).apply(new yob());
        ynyVar.a = new agpw((yob) apply);
        ynyVar.d();
    }

    public final long a() {
        long days = TimeUnit.MILLISECONDS.toDays(this.b.f().toEpochMilli());
        utz utzVar = d;
        Object e = utzVar.e();
        e.getClass();
        long longValue = days / ((Number) e).longValue();
        TimeUnit timeUnit = TimeUnit.DAYS;
        Object e2 = utzVar.e();
        e2.getClass();
        return timeUnit.toMillis(longValue * ((Number) e2).longValue());
    }

    public final ynt b(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        aiut.b();
        i();
        return (ynt) this.e.c("SpamLoggingIds#getConversationAndMessageLoggingIds", new tdw(conversationIdType, messageIdType, this, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ynm
            if (r0 == 0) goto L13
            r0 = r6
            ynm r0 = (defpackage.ynm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ynm r0 = new ynm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ynr r0 = r0.d
            defpackage.aqil.P(r6)     // Catch: java.lang.Exception -> L48
            goto L48
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.aqil.P(r6)
            aiwu r6 = r5.f     // Catch: java.lang.Exception -> L47
            ynn r2 = new ynn     // Catch: java.lang.Exception -> L47
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.lang.Exception -> L47
            r0.d = r5     // Catch: java.lang.Exception -> L47
            r0.c = r3     // Catch: java.lang.Exception -> L47
            java.lang.Object r6 = defpackage.yyb.al(r6, r2, r0)     // Catch: java.lang.Exception -> L47
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r5
        L48:
            r0.i()
            arnb r6 = defpackage.arnb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynr.d(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yno
            if (r0 == 0) goto L13
            r0 = r5
            yno r0 = (defpackage.yno) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yno r0 = new yno
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            r0.c = r3
            java.lang.Object r5 = r4.g(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            ynl r5 = (defpackage.ynl) r5
            java.lang.String r5 = r5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynr.e(arpe):java.lang.Object");
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
            boolean r0 = r5 instanceof defpackage.ynp
            if (r0 == 0) goto L13
            r0 = r5
            ynp r0 = (defpackage.ynp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ynp r0 = new ynp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            r0.c = r3
            java.lang.Object r5 = r4.g(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            ynl r5 = (defpackage.ynl) r5
            java.lang.String r5 = r5.b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynr.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:11:0x0025, B:12:0x004d, B:14:0x0051, B:17:0x0058, B:22:0x0039), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: Exception -> 0x005c, TRY_LEAVE, TryCatch #0 {Exception -> 0x005c, blocks: (B:11:0x0025, B:12:0x004d, B:14:0x0051, B:17:0x0058, B:22:0x0039), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ynq
            if (r0 == 0) goto L13
            r0 = r7
            ynq r0 = (defpackage.ynq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ynq r0 = new ynq
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            arsb r0 = r0.d
            defpackage.aqil.P(r7)     // Catch: java.lang.Exception -> L5c
            goto L4d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.aqil.P(r7)
            arsb r7 = new arsb
            r7.<init>()
            aiwu r2 = r6.f     // Catch: java.lang.Exception -> L5c
            wup r4 = new wup     // Catch: java.lang.Exception -> L5c
            r5 = 8
            r4.<init>(r6, r7, r5)     // Catch: java.lang.Exception -> L5c
            r0.d = r7     // Catch: java.lang.Exception -> L5c
            r0.c = r3     // Catch: java.lang.Exception -> L5c
            java.lang.Object r0 = defpackage.yyb.al(r2, r4, r0)     // Catch: java.lang.Exception -> L5c
            if (r0 == r1) goto L5b
            r0 = r7
        L4d:
            java.lang.Object r7 = r0.a     // Catch: java.lang.Exception -> L5c
            if (r7 != 0) goto L58
            java.lang.String r7 = "userIds"
            defpackage.arro.b(r7)     // Catch: java.lang.Exception -> L5c
            r7 = 0
            goto L5a
        L58:
            ynl r7 = (defpackage.ynl) r7     // Catch: java.lang.Exception -> L5c
        L5a:
            return r7
        L5b:
            return r1
        L5c:
            ynl r7 = new ynl
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r7.<init>(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynr.g(arpe):java.lang.Object");
    }

    public final boolean h(aozy aozyVar) {
        long days = TimeUnit.MILLISECONDS.toDays(((yns) aozyVar.b).d);
        utz utzVar = a;
        Object e = utzVar.e();
        e.getClass();
        long longValue = days / ((Number) e).longValue();
        long days2 = TimeUnit.MILLISECONDS.toDays(this.b.f().toEpochMilli());
        Object e2 = utzVar.e();
        e2.getClass();
        if (longValue != days2 / ((Number) e2).longValue()) {
            return true;
        }
        return false;
    }
}
