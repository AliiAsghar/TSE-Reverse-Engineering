package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ujv implements ujr, ujq {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter");
    public static final long b = TimeUnit.MINUTES.toMillis(1);
    private static final uuf m = uuh.r(178601090, "enable_immutable_list_in_add_user_references");
    public final armf c;
    public final armf d;
    public final xnv e;
    public final armf f;
    public final qya g;
    public final agnq h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final anen l;
    private final armf n;
    private final armf o;
    private final xbi p;
    private final mbl q;
    private final uhj r;
    private final rys s;
    private final tqx t;
    private final Optional u;
    private final armf v;
    private final armf w;

    public ujv(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, xbi xbiVar, xnv xnvVar, mbl mblVar, armf armfVar5, uhj uhjVar, qya qyaVar, rys rysVar, agnq agnqVar, tqx tqxVar, Optional optional, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, anen anenVar, armf armfVar10) {
        this.n = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.o = armfVar4;
        this.p = xbiVar;
        this.e = xnvVar;
        this.q = mblVar;
        this.f = armfVar5;
        this.r = uhjVar;
        this.g = qyaVar;
        this.s = rysVar;
        this.h = agnqVar;
        this.t = tqxVar;
        this.u = optional;
        this.v = armfVar6;
        this.i = armfVar7;
        this.j = armfVar8;
        this.k = armfVar9;
        this.l = anenVar;
        this.w = armfVar10;
    }

    public static void i(MessageIdType messageIdType, String str, long j) {
        agnw d;
        agnw d2;
        akrh e = aktp.e("TombstoneInserter#addToUserReferences");
        try {
            String[] strArr = tom.a;
            int i = toe.a;
            tof tofVar = new tof();
            tofVar.b(messageIdType);
            tofVar.c(Long.parseLong(str));
            tofVar.d(j);
            tod a2 = tofVar.a();
            d = agnc.d("$primary");
            d2 = agnc.d("$primary");
            Long.valueOf(agnc.a(d2, "user_references", a2, new tkg(d, 5), new ter(a2, 9))).getClass();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void l(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, String str) {
        ParticipantsTable.BindData a2;
        alog alogVar;
        ParticipantsTable.BindData a3;
        alog alogVar2;
        qwm d = ((ryg) this.f.b()).d();
        long f = ((rtz) this.c.b()).f(conversationIdType);
        ParticipantsTable.BindData bindData2 = null;
        if (((ogt) this.w.b()).a()) {
            Optional empty = Optional.empty();
            if (bindData != null) {
                bindData2 = bindData;
                a3 = bindData2;
            } else {
                a3 = d.a();
            }
            if (bindData2 != null) {
                alogVar2 = alog.r(bindData2);
            } else {
                int i = alog.d;
                alogVar2 = alsx.a;
            }
            f(empty, conversationIdType, d, a3, alogVar2, 245, this.e.f().toEpochMilli(), f, str);
            return;
        }
        Optional empty2 = Optional.empty();
        if (bindData != null) {
            bindData2 = bindData;
            a2 = bindData2;
        } else {
            a2 = d.a();
        }
        if (bindData2 != null) {
            alogVar = alog.r(bindData2);
        } else {
            int i2 = alog.d;
            alogVar = alsx.a;
        }
        h(empty2, conversationIdType, d, a2, alogVar, 245, this.e.f().toEpochMilli(), f);
    }

    @Override // defpackage.ujq
    public final void a(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, String str) {
        l(conversationIdType, bindData, str);
    }

    @Override // defpackage.ujq
    public final void b(ConversationIdType conversationIdType, String str) {
        l(conversationIdType, null, str);
    }

    @Override // defpackage.ujr
    public final void c(ConversationIdType conversationIdType, String str) {
        this.h.e("TombstoneInserter#insertLocalGroupRenameTombstone", new uju(this, conversationIdType, ((ryg) this.f.b()).d(), str, 0));
    }

    @Override // defpackage.ujr
    public final void d(ConversationIdType conversationIdType, String str) {
        ((ryg) this.f.b()).d();
        SelfIdentityId h = ((rtz) this.c.b()).h(conversationIdType);
        if (h == null) {
            alvw i = a.i();
            i.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) i;
            alvgVar.X(ydl.p, conversationIdType);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertRcsGroupRenameTombstoneFromSelf", 638, "TombstoneInserter.java")).q("Conversation no longer exists, skipping insertRcsGroupRenameTombstoneFromSelf");
            return;
        }
        qwm e = ((ryg) this.f.b()).e(h);
        e.getClass();
        j(conversationIdType, str, null, e);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(boolean r6, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7, boolean r8, boolean r9, int r10, int r11) {
        /*
            r5 = this;
            defpackage.xyl.h()
            r0 = 204(0xcc, float:2.86E-43)
            r1 = 205(0xcd, float:2.87E-43)
            r2 = 1
            if (r6 == 0) goto L40
            if (r8 == 0) goto L31
            if (r10 > r2) goto L2e
            armf r6 = r5.n
            java.lang.Object r6 = r6.b()
            uac r6 = (defpackage.uac) r6
            rto r6 = r6.z(r7)
            if (r6 == 0) goto L26
            boolean r6 = r6.R()
            if (r6 != 0) goto L23
            goto L26
        L23:
            r6 = 241(0xf1, float:3.38E-43)
            return r6
        L26:
            if (r9 == 0) goto L2b
            r6 = 242(0xf2, float:3.39E-43)
            return r6
        L2b:
            r6 = 207(0xcf, float:2.9E-43)
            return r6
        L2e:
            r6 = 203(0xcb, float:2.84E-43)
            return r6
        L31:
            if (r10 <= r2) goto L3d
            xbi r6 = r5.p
            boolean r6 = r6.d(r11)
            if (r6 == 0) goto L3c
            return r0
        L3c:
            return r1
        L3d:
            r6 = 206(0xce, float:2.89E-43)
            return r6
        L40:
            r6 = 0
            if (r8 != 0) goto Lb0
            if (r10 <= r2) goto Lb0
            xbi r8 = r5.p
            boolean r8 = r8.d(r11)
            armf r9 = r5.d
            java.lang.Object r9 = r9.b()
            rwd r9 = (defpackage.rwd) r9
            java.lang.String r10 = "MessageDatabaseOperations#getLatestOutgoingOrTombstoneMessageForConversation"
            akrh r10 = defpackage.aktp.e(r10)
            syc r11 = new syc     // Catch: java.lang.Throwable -> La6
            r11.<init>()     // Catch: java.lang.Throwable -> La6
            r11.f(r7)     // Catch: java.lang.Throwable -> La6
            r7 = 2
            java.util.function.Function[] r3 = new java.util.function.Function[r7]     // Catch: java.lang.Throwable -> La6
            rvy r4 = new rvy     // Catch: java.lang.Throwable -> La6
            r4.<init>(r7)     // Catch: java.lang.Throwable -> La6
            r3[r6] = r4     // Catch: java.lang.Throwable -> La6
            rvy r7 = new rvy     // Catch: java.lang.Throwable -> La6
            r4 = 3
            r7.<init>(r4)     // Catch: java.lang.Throwable -> La6
            r3[r2] = r7     // Catch: java.lang.Throwable -> La6
            r11.b(r3)     // Catch: java.lang.Throwable -> La6
            syb r7 = new syb     // Catch: java.lang.Throwable -> La6
            r7.<init>(r11)     // Catch: java.lang.Throwable -> La6
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r7 = r9.j(r7)     // Catch: java.lang.Throwable -> La6
            r10.close()
            if (r7 != 0) goto L88
            if (r8 != 0) goto L87
            goto Lb1
        L87:
            return r0
        L88:
            int r9 = r7.d()
            if (r9 != r2) goto L95
            if (r8 != 0) goto L93
            r8 = 209(0xd1, float:2.93E-43)
            goto L9e
        L93:
            r8 = r2
            goto L96
        L95:
            r2 = r9
        L96:
            if (r2 != 0) goto L9d
            if (r8 == 0) goto L9d
            r8 = 208(0xd0, float:2.91E-43)
            goto L9e
        L9d:
            r8 = r6
        L9e:
            int r7 = r7.j()
            if (r7 != r8) goto La5
            goto Lb0
        La5:
            return r8
        La6:
            r6 = move-exception
            r10.close()     // Catch: java.lang.Throwable -> Lab
            goto Laf
        Lab:
            r7 = move-exception
            r6.addSuppressed(r7)
        Laf:
            throw r6
        Lb0:
            r1 = r6
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujv.e(boolean, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, boolean, boolean, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x03dd, code lost:
    
        if (r15.isEmpty() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x01ae, code lost:
    
        if (r30.M().equals(r3.aw()) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x030e, code lost:
    
        if (r2 == r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03e2, code lost:
    
        r1 = ((defpackage.rtz) r26.c.b()).r(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x03f0, code lost:
    
        if (r1 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03f2, code lost:
    
        r1 = defpackage.tqc.UNARCHIVED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x03f4, code lost:
    
        r5 = r1;
        r1 = r14.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x03fd, code lost:
    
        if (defpackage.rvx.e(r1) != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0401, code lost:
    
        if (r1 == 234) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0405, code lost:
    
        if (r1 == 233) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0409, code lost:
    
        if (r1 != 252) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x040e, code lost:
    
        if (r1 == 210) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0412, code lost:
    
        if (r1 == 208) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0416, code lost:
    
        if (r1 == 245) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0418, code lost:
    
        r1 = (defpackage.ruq) r26.o.b();
        r3 = r14.B();
        r4 = java.lang.Long.valueOf(r14.n());
        defpackage.xyl.h();
        r1.g(r28, r3, r4, r5, null, true, r35, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x043a, code lost:
    
        r26.s.b(r28, r30, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0457, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03e0, code lost:
    
        if (r20 == 0) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0440, code lost:
    
        r1 = r14.am();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0448, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x044a, code lost:
    
        r2 = r26.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0452, code lost:
    
        if (defpackage.xwr.h(r2.a) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0454, code lost:
    
        r2.e(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData f(j$.util.Optional r27, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r28, defpackage.qwm r29, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r30, java.util.List r31, int r32, long r33, long r35, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujv.f(j$.util.Optional, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, qwm, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, java.util.List, int, long, long, java.lang.String):com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData");
    }

    public final void g(qwm qwmVar, long j, ConversationIdType conversationIdType, long j2, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(qwmVar.a());
        h(Optional.empty(), conversationIdType, qwmVar, qwmVar.a(), arrayList, i, j, j2);
    }

    public final void h(final Optional optional, final ConversationIdType conversationIdType, final qwm qwmVar, final ParticipantsTable.BindData bindData, final List list, final int i, final long j, final long j2) {
        xyl.h();
        alvw g = a.g();
        g.X(alwp.a, "Bugle");
        alvg alvgVar = (alvg) g;
        alvgVar.X(ydl.p, conversationIdType);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/tombstones/TombstoneInserter", "insertTombstone", 250, "TombstoneInserter.java")).r("Inserting tombstone with type: %d", i);
        this.h.e("TombstoneInserter#insertTombstone", new Runnable() { // from class: ujt
            @Override // java.lang.Runnable
            public final void run() {
                ujv.this.f(optional, conversationIdType, qwmVar, bindData, list, i, j, j2, null);
            }
        });
    }

    public final void j(ConversationIdType conversationIdType, String str, ParticipantsTable.BindData bindData, qwm qwmVar) {
        this.h.e("TombstoneInserter#insertRcsGroupRenameTombstone", new rgr(this, conversationIdType, qwmVar, bindData, str, 3));
    }

    public final void k(Optional optional, ConversationIdType conversationIdType, List list, int i, long j) {
        qwm d = ((ryg) this.f.b()).d();
        h(optional, conversationIdType, d, d.a(), list, i, j, -1L);
    }
}
