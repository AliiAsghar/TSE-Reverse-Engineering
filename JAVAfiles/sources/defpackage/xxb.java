package defpackage;

import android.net.Uri;
import android.provider.BlockedNumberContract;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxb {
    public static final /* synthetic */ int c = 0;
    private static final Uri d;
    private static final String[] e;
    public final armf a;
    public volatile boolean b;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final arwe r;
    private volatile Set s;
    private final ahlp t;

    static {
        Uri uri;
        uri = BlockedNumberContract.BlockedNumbers.CONTENT_URI;
        d = uri;
        e = new String[]{"e164_number", "original_number"};
    }

    public xxb(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar12.getClass();
        armfVar13.getClass();
        arweVar.getClass();
        this.f = armfVar;
        this.a = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.j = armfVar6;
        this.k = armfVar7;
        this.l = armfVar8;
        this.m = armfVar9;
        this.n = armfVar10;
        this.o = armfVar11;
        this.p = armfVar12;
        this.q = armfVar13;
        this.r = arweVar;
        this.t = new ahlp(null, null, null, null);
        this.s = arnx.a;
    }

    private final void f(Set set, boolean z) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e((String) it.next(), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: all -> 0x002c, TryCatch #3 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0073, B:13:0x007e, B:15:0x0084, B:18:0x0094, B:23:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v4, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.xwy
            if (r0 == 0) goto L13
            r0 = r13
            xwy r0 = (defpackage.xwy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xwy r0 = new xwy
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            akrh r1 = r0.e
            xxb r0 = r0.d
            defpackage.aqil.P(r13)     // Catch: java.lang.Throwable -> L2c
            goto L73
        L2c:
            r13 = move-exception
            goto La5
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L37:
            defpackage.aqil.P(r13)
            java.lang.String r13 = "BlockListResolver#getUpdatedList#querySystem"
            akrh r13 = defpackage.aktp.e(r13)
            armf r2 = r12.n     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> La1
            r6 = r2
            ahiy r6 = (defpackage.ahiy) r6     // Catch: java.lang.Throwable -> La1
            android.net.Uri r7 = defpackage.xxb.d     // Catch: java.lang.Throwable -> La1
            r7.getClass()     // Catch: java.lang.Throwable -> La1
            java.lang.String[] r8 = defpackage.xxb.e     // Catch: java.lang.Throwable -> La1
            android.os.Bundle r9 = new android.os.Bundle     // Catch: java.lang.Throwable -> La1
            r9.<init>()     // Catch: java.lang.Throwable -> La1
            ncd r10 = new ncd     // Catch: java.lang.Throwable -> La1
            r2 = 5
            r10.<init>(r12, r2, r4)     // Catch: java.lang.Throwable -> La1
            r0.d = r12     // Catch: java.lang.Throwable -> La1
            r0.e = r13     // Catch: java.lang.Throwable -> La1
            r0.c = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r2 = r6.b     // Catch: java.lang.Throwable -> La1
            jpb r3 = new jpb     // Catch: java.lang.Throwable -> La1
            r11 = 4
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = defpackage.akec.e(r2, r3, r0)     // Catch: java.lang.Throwable -> La1
            if (r0 == r1) goto La0
            r1 = r13
            r13 = r0
            r0 = r12
        L73:
            alog r13 = (defpackage.alog) r13     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L2c
        L7e:
            boolean r3 = r13.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L98
            java.lang.Object r3 = r13.next()     // Catch: java.lang.Throwable -> L2c
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2c
            r5.getClass()     // Catch: java.lang.Throwable -> L2c
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L2c
            if (r5 <= 0) goto L7e
            r2.add(r3)     // Catch: java.lang.Throwable -> L2c
            goto L7e
        L98:
            java.util.Set r13 = defpackage.aqjn.aE(r2)     // Catch: java.lang.Throwable -> L2c
            defpackage.armd.i(r1, r4)
            return r13
        La0:
            return r1
        La1:
            r0 = move-exception
            r1 = r13
            r13 = r0
            r0 = r12
        La5:
            armf r0 = r0.m     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> Lb8
            uvi r0 = (defpackage.uvi) r0     // Catch: java.lang.Throwable -> Lb8
            akul r13 = r0.b(r13)     // Catch: java.lang.Throwable -> Lb8
            defpackage.qiu.h(r13)     // Catch: java.lang.Throwable -> Lb8
            defpackage.armd.i(r1, r4)
            return r4
        Lb8:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> Lba
        Lba:
            r0 = move-exception
            defpackage.armd.i(r1, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxb.a(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[Catch: all -> 0x0045, TryCatch #2 {all -> 0x0045, blocks: (B:29:0x0041, B:30:0x00a8, B:32:0x00b0, B:33:0x00bb), top: B:28:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxb.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xxa
            if (r0 == 0) goto L13
            r0 = r6
            xxa r0 = (defpackage.xxa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xxa r0 = new xxa
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xxb r0 = r0.d
            defpackage.aqil.P(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.aqil.P(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r5.a(r0)
            if (r6 == r1) goto L71
            r0 = r5
        L3f:
            java.util.Set r6 = (java.util.Set) r6
            if (r6 != 0) goto L46
            arnb r6 = defpackage.arnb.a
            return r6
        L46:
            java.lang.String r1 = "BlockListResolver#resolve#transformNewBlockList"
            akrh r1 = defpackage.aktp.e(r1)
            java.util.Set r2 = r0.s     // Catch: java.lang.Throwable -> L6a
            r0.s = r6     // Catch: java.lang.Throwable -> L6a
            java.util.Set r6 = r0.s     // Catch: java.lang.Throwable -> L6a
            java.util.Set r6 = defpackage.aqjn.aC(r6, r2)     // Catch: java.lang.Throwable -> L6a
            java.util.Set r4 = r0.s     // Catch: java.lang.Throwable -> L6a
            java.util.Set r2 = defpackage.aqjn.aC(r2, r4)     // Catch: java.lang.Throwable -> L6a
            r0.f(r6, r3)     // Catch: java.lang.Throwable -> L6a
            r6 = 0
            r0.f(r2, r6)     // Catch: java.lang.Throwable -> L6a
            r6 = 0
            defpackage.armd.i(r1, r6)
            arnb r6 = defpackage.arnb.a
            return r6
        L6a:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = move-exception
            defpackage.armd.i(r1, r6)
            throw r0
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxb.c(arpe):java.lang.Object");
    }

    public final void d() {
        qiu.h(qjh.a(albo.ax(this.r, this.t, new xjs(this, (arpe) null, 10))));
    }

    public final void e(String str, boolean z) {
        ConversationIdType k;
        ParticipantsTable.BindData c2 = ((rxq) this.k.b()).c(str);
        if (((Boolean) ((utz) xxh.b.get()).e()).booleanValue()) {
            k = (ConversationIdType) ((qpj) this.j.b()).m(str).orElseGet(new wso(20));
        } else {
            k = ((uie) this.i.b()).k(str);
        }
        ConversationIdType conversationIdType = k;
        yni n = ((aiqj) this.p.b()).n(c2, ((rtz) this.q.b()).r(conversationIdType));
        str.getClass();
        ((xxh) this.f.b()).b(yyb.br(z, str, true, true, n, 3, 8, 2));
        if (!z && c2 != null && c2.T() && yyb.G(c2.m()).c()) {
            if (conversationIdType != null && !conversationIdType.b()) {
                ((ymh) this.h.b()).b(yyb.ae(false, conversationIdType, c2.M(), ypi.b, true, true, amfe.CONVERSATION_FROM_UNBLOCK_ACTION, n, null, 3, 8, 2));
                return;
            }
            ((ypr) this.l.b()).b(c2.M(), ypi.b, false);
        }
    }
}
