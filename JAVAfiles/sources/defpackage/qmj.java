package defpackage;

import android.content.Context;
import j$.time.Instant;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qmj implements qls {
    public static final String[] a = {"_id"};
    public static final String[] b = {"_id"};
    public static final String[] c = {"_id", "contact_id", "lookup", "sort_key", "phonebook_label", "phonebook_bucket", "display_name", "data1", "data4", "data2", "data3", "photo_uri", "photo_thumb_uri", "photo_file_id", "contact_last_updated_timestamp"};
    public static final String[] d = {"_id", "contact_id", "lookup", "sort_key", "phonebook_label", "phonebook_bucket", "display_name", "data1", "data4", "data2", "data3", "photo_uri", "photo_thumb_uri", "contact_last_updated_timestamp"};
    public static final String[] e = {"_id", "contact_id", "lookup", "sort_key", "phonebook_label", "phonebook_bucket", "data4", "data1", "data2", "data3", "photo_uri", "photo_thumb_uri", "photo_file_id", "contact_last_updated_timestamp"};
    private static final String[] k = {"contact_id", "data1", "data2", "data3"};
    private static final String[] l = {"contact_id", "data2", "data1"};
    private static final String[] m = {"_id", "contact_id", "mimetype"};
    private static final List n = arnv.a;
    public final Executor f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final atsg j;
    private final arpi o;

    public qmj(Context context, arpi arpiVar, Executor executor, atsg atsgVar, armf armfVar, @obb armf armfVar2, armf armfVar3) {
        context.getClass();
        arpiVar.getClass();
        executor.getClass();
        atsgVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.o = arpiVar;
        this.f = executor;
        this.j = atsgVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
    }

    public static final akmy A(List list, int i) {
        akmy r = r();
        s(r, "_id", list);
        r.d(" AND ");
        t(r, i);
        return r.i();
    }

    public static final akmy r() {
        akmy akmyVar = new akmy();
        akmyVar.d("(account_type NOT IN (\"com.whatsapp\", \"com.google.android.apps.tachyon\") OR ");
        akmyVar.d("account_type IS NULL) AND ");
        return akmyVar;
    }

    public static final void s(akmy akmyVar, String str, List list) {
        int i = 0;
        if (list.size() == 1) {
            akmyVar.d(str);
            akmyVar.d(" = ?");
            akmyVar.e(list.get(0).toString());
            return;
        }
        akmyVar.d(str);
        akmyVar.d(" IN (");
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                aqjn.G();
            }
            akmyVar.d("?");
            if (i < list.size() - 1) {
                akmyVar.d(",");
            }
            akmyVar.e(obj.toString());
            i = i2;
        }
        akmyVar.d(")");
    }

    public static final void t(akmy akmyVar, int i) {
        if (i - 1 != 0) {
            akmyVar.d("data1 IS NOT NULL");
        } else {
            akmyVar.d("data1 IS NOT NULL");
        }
    }

    @Override // defpackage.qls
    public final Object a(arpe arpeVar) {
        return arro.q(this.o, new ikp(this, (arpe) null, 7), arpeVar);
    }

    @Override // defpackage.qls
    public final Object b(arpe arpeVar) {
        return arro.q(this.o, new ikp(this, (arpe) null, 8, (byte[]) null), arpeVar);
    }

    @Override // defpackage.qls
    public final Object c(arpe arpeVar) {
        return arro.q(this.o, new ikp(this, (arpe) null, 9, (char[]) null), arpeVar);
    }

    @Override // defpackage.qls
    public final Object d(Instant instant, arpe arpeVar) {
        return arro.q(this.o, new qly(this, instant, null), arpeVar);
    }

    @Override // defpackage.qls
    public final Object e(Instant instant, arpe arpeVar) {
        return arro.q(this.o, new iqi(instant, this, (arpe) null, 9), arpeVar);
    }

    @Override // defpackage.qls
    public final Object f(Instant instant, arpe arpeVar) {
        return arro.q(this.o, new iqi(instant, this, (arpe) null, 10, (byte[]) null), arpeVar);
    }

    @Override // defpackage.qls
    public final Object g(List list, arpe arpeVar) {
        return arro.q(this.o, new gbz(list, this, (arpe) null, 8), arpeVar);
    }

    @Override // defpackage.qls
    public final Object h(List list, arpe arpeVar) {
        return arro.q(this.o, new jvy(this, list, (arpe) null, 2), arpeVar);
    }

    @Override // defpackage.qls
    public final Object i(Instant instant, arpe arpeVar) {
        return arro.q(this.o, new iqi(instant, this, (arpe) null, 11, (char[]) null), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.qls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(j$.time.Instant r11, defpackage.arpe r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.qmg
            if (r0 == 0) goto L13
            r0 = r12
            qmg r0 = (defpackage.qmg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qmg r0 = new qmg
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r12)
            goto L49
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.aqil.P(r12)
            arpi r12 = r10.o
            iqi r2 = new iqi
            r8 = 12
            r9 = 0
            r7 = 0
            r4 = r2
            r5 = r11
            r6 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r12 = defpackage.arro.q(r12, r2, r0)
            if (r12 != r1) goto L49
            return r1
        L49:
            r12.getClass()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmj.j(j$.time.Instant, arpe):java.lang.Object");
    }

    @Override // defpackage.qls
    public final Object k(Instant instant, arpe arpeVar) {
        return arro.q(this.o, new iqi(instant, this, (arpe) null, 13, (int[]) null), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(j$.time.Instant r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.qlx
            if (r0 == 0) goto L13
            r0 = r10
            qlx r0 = (defpackage.qlx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qlx r0 = new qlx
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            akrh r9 = r6.d
            defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L2a
            goto L72
        L2a:
            r10 = move-exception
            goto L7e
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r10)
            java.lang.String r10 = "Cp2DataService#queryChangedContactIds"
            akrh r10 = defpackage.aktp.e(r10)
            akmy r1 = new akmy     // Catch: java.lang.Throwable -> L7a
            r1.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "contact_last_updated_timestamp > ?"
            r1.d(r3)     // Catch: java.lang.Throwable -> L7a
            long r3 = r9.toEpochMilli()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r9 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L7a
            r1.e(r9)     // Catch: java.lang.Throwable -> L7a
            akmy r4 = r1.i()     // Catch: java.lang.Throwable -> L7a
            android.net.Uri r9 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch: java.lang.Throwable -> L7a
            r9.getClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "_id"
            java.lang.String[] r3 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L7a
            mqd r5 = defpackage.mqd.j     // Catch: java.lang.Throwable -> L7a
            r6.d = r10     // Catch: java.lang.Throwable -> L7a
            r6.c = r2     // Catch: java.lang.Throwable -> L7a
            r1 = r8
            r2 = r9
            java.lang.Object r9 = r1.u(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7a
            if (r9 == r0) goto L79
            r7 = r10
            r10 = r9
            r9 = r7
        L72:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            defpackage.armd.i(r9, r0)
            return r10
        L79:
            return r0
        L7a:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L7e:
            throw r10     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            defpackage.armd.i(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmj.l(j$.time.Instant, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x007b, B:13:0x0086, B:15:0x008c, B:17:0x009f, B:19:0x00a7, B:22:0x00ad, B:23:0x00be, B:25:0x00c5, B:26:0x00df, B:28:0x00e5, B:32:0x00f3, B:34:0x00f7, B:35:0x00fb, B:36:0x00ff, B:38:0x0105, B:42:0x0112, B:44:0x0116, B:46:0x0118, B:56:0x012a), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x007b, B:13:0x0086, B:15:0x008c, B:17:0x009f, B:19:0x00a7, B:22:0x00ad, B:23:0x00be, B:25:0x00c5, B:26:0x00df, B:28:0x00e5, B:32:0x00f3, B:34:0x00f7, B:35:0x00fb, B:36:0x00ff, B:38:0x0105, B:42:0x0112, B:44:0x0116, B:46:0x0118, B:56:0x012a), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.util.List r12, defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmj.m(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[Catch: all -> 0x002a, LOOP:0: B:13:0x0085->B:15:0x008b, LOOP_END, TryCatch #1 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0074, B:13:0x0085, B:15:0x008b, B:17:0x00a0), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.util.List r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.qma
            if (r0 == 0) goto L13
            r0 = r10
            qma r0 = (defpackage.qma) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qma r0 = new qma
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            akrh r9 = r6.d
            defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L2a
            goto L74
        L2a:
            r10 = move-exception
            goto Lae
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.aqil.P(r10)
            java.lang.String r10 = "Cp2DataService#queryContactNames"
            akrh r10 = defpackage.aktp.e(r10)
            android.net.Uri r3 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch: java.lang.Throwable -> Laa
            r3.getClass()     // Catch: java.lang.Throwable -> Laa
            java.lang.String[] r4 = defpackage.qmj.k     // Catch: java.lang.Throwable -> Laa
            akmy r1 = r()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r5 = "contact_id"
            s(r1, r5, r9)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r9 = "AND mimetype = ?"
            r1.d(r9)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r9 = "vnd.android.cursor.item/name"
            r1.e(r9)     // Catch: java.lang.Throwable -> Laa
            akmy r9 = r1.i()     // Catch: java.lang.Throwable -> Laa
            mqd r5 = new mqd     // Catch: java.lang.Throwable -> Laa
            r1 = 13
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Laa
            r6.d = r10     // Catch: java.lang.Throwable -> Laa
            r6.c = r2     // Catch: java.lang.Throwable -> Laa
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r9
            java.lang.Object r9 = r1.u(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Laa
            if (r9 == r0) goto La9
            r7 = r10
            r10 = r9
            r9 = r7
        L74:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L2a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r1 = 10
            int r1 = defpackage.aqjn.J(r10, r1)     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L2a
        L85:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto La0
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L2a
            qlw r1 = (defpackage.qlw) r1     // Catch: java.lang.Throwable -> L2a
            long r2 = r1.a     // Catch: java.lang.Throwable -> L2a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L2a
            armo r3 = new armo     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L2a
            r0.add(r3)     // Catch: java.lang.Throwable -> L2a
            goto L85
        La0:
            java.util.Map r10 = defpackage.aqjn.q(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            defpackage.armd.i(r9, r0)
            return r10
        La9:
            return r0
        Laa:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        Lae:
            throw r10     // Catch: java.lang.Throwable -> Laf
        Laf:
            r0 = move-exception
            defpackage.armd.i(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmj.n(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(java.util.List r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.qmc
            if (r0 == 0) goto L13
            r0 = r10
            qmc r0 = (defpackage.qmc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qmc r0 = new qmc
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            akrh r9 = r6.d
            defpackage.aqil.P(r10)     // Catch: java.lang.Throwable -> L2a
            goto L76
        L2a:
            r10 = move-exception
            goto L80
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r10)
            java.lang.String r10 = "Cp2DataService#queryContactThirdPartyServices"
            akrh r10 = defpackage.aktp.e(r10)
            android.net.Uri r3 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch: java.lang.Throwable -> L7c
            r3.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.String[] r4 = defpackage.qmj.m     // Catch: java.lang.Throwable -> L7c
            akmy r1 = new akmy     // Catch: java.lang.Throwable -> L7c
            r1.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r5 = "contact_id"
            s(r1, r5, r9)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r9 = " AND "
            r1.d(r9)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r9 = "mimetype"
            java.util.List r5 = defpackage.qmj.n     // Catch: java.lang.Throwable -> L7c
            s(r1, r9, r5)     // Catch: java.lang.Throwable -> L7c
            akmy r9 = r1.i()     // Catch: java.lang.Throwable -> L7c
            mqd r5 = new mqd     // Catch: java.lang.Throwable -> L7c
            r1 = 15
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L7c
            r6.d = r10     // Catch: java.lang.Throwable -> L7c
            r6.c = r2     // Catch: java.lang.Throwable -> L7c
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r9
            java.lang.Object r9 = r1.u(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7c
            if (r9 == r0) goto L7b
            r7 = r10
            r10 = r9
            r9 = r7
        L76:
            r0 = 0
            defpackage.armd.i(r9, r0)
            return r10
        L7b:
            return r0
        L7c:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L80:
            throw r10     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            defpackage.armd.i(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmj.o(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qlu p(android.database.Cursor r31, int r32) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmj.p(android.database.Cursor, int):qlu");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.util.List r9, int r10, defpackage.arpe r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.qmh
            if (r0 == 0) goto L13
            r0 = r11
            qmh r0 = (defpackage.qmh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qmh r0 = new qmh
            r0.<init>(r8, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            akrh r9 = r6.d
            defpackage.aqil.P(r11)     // Catch: java.lang.Throwable -> L2a
            goto L78
        L2a:
            r10 = move-exception
            goto L81
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r11)
            java.lang.String r11 = "Cp2DataService#queryRawContacts"
            akrh r11 = defpackage.aktp.e(r11)
            android.net.Uri r3 = defpackage.qno.e(r10)     // Catch: java.lang.Throwable -> L7e
            armf r1 = r8.i     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L7e
            r1.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L7e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L7e
            java.lang.String[] r4 = defpackage.qno.f(r10, r1)     // Catch: java.lang.Throwable -> L7e
            akmy r1 = r()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = "_id"
            s(r1, r5, r9)     // Catch: java.lang.Throwable -> L7e
            akmy r9 = r1.i()     // Catch: java.lang.Throwable -> L7e
            mgc r5 = new mgc     // Catch: java.lang.Throwable -> L7e
            r1 = 4
            r5.<init>(r8, r10, r1)     // Catch: java.lang.Throwable -> L7e
            r6.d = r11     // Catch: java.lang.Throwable -> L7e
            r6.c = r2     // Catch: java.lang.Throwable -> L7e
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r9
            java.lang.Object r9 = r1.u(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7e
            if (r9 == r0) goto L7d
            r7 = r11
            r11 = r9
            r9 = r7
        L78:
            r10 = 0
            defpackage.armd.i(r9, r10)
            return r11
        L7d:
            return r0
        L7e:
            r9 = move-exception
            r10 = r9
            r9 = r11
        L81:
            throw r10     // Catch: java.lang.Throwable -> L82
        L82:
            r11 = move-exception
            defpackage.armd.i(r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmj.q(java.util.List, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(android.net.Uri r5, java.lang.String[] r6, defpackage.akmy r7, defpackage.arqr r8, defpackage.arpe r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.qmf
            if (r0 == 0) goto L13
            r0 = r9
            qmf r0 = (defpackage.qmf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qmf r0 = new qmf
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r9)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r9)
            atsg r9 = r4.j
            andc r5 = r9.u(r5, r6, r7)
            lfw r6 = new lfw
            r7 = 11
            r6.<init>(r8, r7)
            lpx r7 = new lpx
            r8 = 3
            r7.<init>(r6, r8)
            java.util.concurrent.Executor r6 = r4.f
            andc r5 = r5.d(r7, r6)
            anee r5 = r5.l()
            r5.getClass()
            r0.c = r3
            java.lang.Object r9 = defpackage.arro.F(r5, r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmj.u(android.net.Uri, java.lang.String[], akmy, arqr, arpe):java.lang.Object");
    }

    public final akmy v(int i) {
        akmy r = r();
        t(r, i);
        return r.i();
    }

    public final akmy w(List list, int i) {
        akmy r = r();
        s(r, "contact_id", list);
        r.d(" AND ");
        t(r, i);
        return r.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(defpackage.akmy r10, int r11, defpackage.arpe r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.qmb
            if (r0 == 0) goto L13
            r0 = r12
            qmb r0 = (defpackage.qmb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qmb r0 = new qmb
            r0.<init>(r9, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            akrh r10 = r6.d
            defpackage.aqil.P(r12)     // Catch: java.lang.Throwable -> L2b
            goto L63
        L2b:
            r11 = move-exception
            goto L6c
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.aqil.P(r12)
            java.lang.String r12 = "Cp2DataService#queryContactRowIds"
            akrh r12 = defpackage.aktp.e(r12)
            android.net.Uri r3 = defpackage.qno.e(r11)     // Catch: java.lang.Throwable -> L69
            int r1 = r11 + (-1)
            if (r11 == 0) goto L68
            if (r1 == 0) goto L4e
            if (r1 != r2) goto L4d
            java.lang.String[] r11 = defpackage.qmj.b     // Catch: java.lang.Throwable -> L69
            goto L50
        L4d:
            throw r7     // Catch: java.lang.Throwable -> L69
        L4e:
            java.lang.String[] r11 = defpackage.qmj.a     // Catch: java.lang.Throwable -> L69
        L50:
            mqd r5 = defpackage.mqd.m     // Catch: java.lang.Throwable -> L69
            r6.d = r12     // Catch: java.lang.Throwable -> L69
            r6.c = r2     // Catch: java.lang.Throwable -> L69
            r1 = r9
            r2 = r3
            r3 = r11
            r4 = r10
            java.lang.Object r10 = r1.u(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L69
            if (r10 == r0) goto L67
            r8 = r12
            r12 = r10
            r10 = r8
        L63:
            defpackage.armd.i(r10, r7)
            return r12
        L67:
            return r0
        L68:
            throw r7     // Catch: java.lang.Throwable -> L69
        L69:
            r10 = move-exception
            r11 = r10
            r10 = r12
        L6c:
            throw r11     // Catch: java.lang.Throwable -> L6d
        L6d:
            r12 = move-exception
            defpackage.armd.i(r10, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmj.x(akmy, int, arpe):java.lang.Object");
    }

    public final Object y(akmy akmyVar, int i, arpe arpeVar) {
        return arwi.d(new qmd(this, akmyVar, i, null), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(defpackage.akmy r9, int r10, defpackage.arpe r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.qmi
            if (r0 == 0) goto L13
            r0 = r11
            qmi r0 = (defpackage.qmi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qmi r0 = new qmi
            r0.<init>(r8, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.a
            arpl r0 = defpackage.arpl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            akrh r9 = r6.d
            defpackage.aqil.P(r11)     // Catch: java.lang.Throwable -> L2a
            goto L6b
        L2a:
            r10 = move-exception
            goto L74
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r11)
            java.lang.String r11 = "Cp2DataService#queryRawContacts"
            akrh r11 = defpackage.aktp.e(r11)
            android.net.Uri r3 = defpackage.qno.e(r10)     // Catch: java.lang.Throwable -> L71
            armf r1 = r8.i     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L71
            r1.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L71
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L71
            java.lang.String[] r4 = defpackage.qno.f(r10, r1)     // Catch: java.lang.Throwable -> L71
            mgc r5 = new mgc     // Catch: java.lang.Throwable -> L71
            r1 = 5
            r5.<init>(r8, r10, r1)     // Catch: java.lang.Throwable -> L71
            r6.d = r11     // Catch: java.lang.Throwable -> L71
            r6.c = r2     // Catch: java.lang.Throwable -> L71
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r9
            java.lang.Object r9 = r1.u(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L71
            if (r9 == r0) goto L70
            r7 = r11
            r11 = r9
            r9 = r7
        L6b:
            r10 = 0
            defpackage.armd.i(r9, r10)
            return r11
        L70:
            return r0
        L71:
            r9 = move-exception
            r10 = r9
            r9 = r11
        L74:
            throw r10     // Catch: java.lang.Throwable -> L75
        L75:
            r11 = move-exception
            defpackage.armd.i(r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmj.z(akmy, int, arpe):java.lang.Object");
    }
}
