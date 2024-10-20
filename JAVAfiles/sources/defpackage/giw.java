package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giw {
    public static final /* synthetic */ int e = 0;
    private static final String[] f = {"INSERT", "UPDATE", "DELETE"};
    public final gid a;
    public final akju c;
    public final ghw d;
    private final Map g;
    private final Map h;
    private final arqr i;
    private final String[] k;
    private final arvb l = new arvb(false, arvf.a);
    public arqg b = ry.f;
    private final Map j = new LinkedHashMap();

    public giw(gid gidVar, Map map, Map map2, String[] strArr, arqr arqrVar) {
        this.a = gidVar;
        this.g = map;
        this.h = map2;
        this.i = arqrVar;
        int i = 0;
        String[] strArr2 = new String[7];
        while (true) {
            String str = null;
            if (i >= 7) {
                break;
            }
            String lowerCase = strArr[i].toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.j.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.g.get(strArr[i]);
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ROOT);
                str.getClass();
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
            i++;
        }
        this.k = strArr2;
        for (Map.Entry entry : this.g.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (this.j.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                Map map3 = this.j;
                map3.put(lowerCase3, aqjn.l(map3, lowerCase2));
            }
        }
        this.c = new akju((byte[]) null);
        this.d = new ghw((byte[]) null, (char[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.gia r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.gin
            if (r0 == 0) goto L13
            r0 = r7
            gin r0 = (defpackage.gin) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gin r0 = new gin
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.a
            java.util.Set r6 = (java.util.Set) r6
            defpackage.aqil.P(r7)
            goto L66
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.a
            gia r6 = (defpackage.gia) r6
            defpackage.aqil.P(r7)
            goto L4f
        L3e:
            defpackage.aqil.P(r7)
            rp r7 = defpackage.rp.n
            r0.a = r6
            r0.d = r4
            java.lang.String r2 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r7 = r6.a(r2, r7, r0)
            if (r7 == r1) goto L67
        L4f:
            java.util.Set r7 = (java.util.Set) r7
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L65
            r0.a = r7
            r0.d = r3
            java.lang.String r2 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r6 = defpackage.gvf.bG(r6, r2, r0)
            if (r6 == r1) goto L64
            goto L65
        L64:
            return r1
        L65:
            r6 = r7
        L66:
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giw.a(gia, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x007e, B:14:0x0086, B:17:0x00bc, B:19:0x0092, B:20:0x0094, B:22:0x00a1, B:24:0x00ab, B:26:0x00b1, B:27:0x00af, B:30:0x00b6), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, ascd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giw.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00be -> B:11:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.gia r12, int r13, defpackage.arpe r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.gis
            if (r0 == 0) goto L13
            r0 = r14
            gis r0 = (defpackage.gis) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            gis r0 = new gis
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f
            arpl r1 = defpackage.arpl.a
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            int r12 = r0.e
            int r13 = r0.d
            int r2 = r0.c
            java.lang.String[] r5 = r0.i
            java.lang.Object r6 = r0.b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.a
            gia r7 = (defpackage.gia) r7
            defpackage.aqil.P(r14)
            goto Lc1
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            int r13 = r0.c
            java.lang.Object r12 = r0.b
            gia r12 = (defpackage.gia) r12
            java.lang.Object r2 = r0.a
            giw r2 = (defpackage.giw) r2
            defpackage.aqil.P(r14)
            goto L6b
        L51:
            defpackage.aqil.P(r14)
            java.lang.String r14 = "INSERT OR IGNORE INTO room_table_modification_log VALUES("
            java.lang.String r2 = ", 0)"
            java.lang.String r14 = defpackage.a.cb(r13, r14, r2)
            r0.a = r11
            r0.b = r12
            r0.c = r13
            r0.h = r4
            java.lang.Object r14 = defpackage.gvf.bG(r12, r14, r0)
            if (r14 == r1) goto Lc6
            r2 = r11
        L6b:
            java.lang.String[] r14 = r2.k
            r14 = r14[r13]
            java.lang.String[] r2 = defpackage.giw.f
            r5 = 3
            r6 = 0
            r7 = r12
            r12 = r5
            r5 = r2
            r2 = r13
            r13 = r6
            r6 = r14
        L79:
            if (r13 >= r12) goto Lc3
            r14 = r5[r13]
            java.lang.String r8 = defpackage.gvf.bF(r6, r14)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "CREATE TEMP TRIGGER IF NOT EXISTS `"
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = "` AFTER "
            r9.append(r8)
            r9.append(r14)
            java.lang.String r14 = " ON `"
            r9.append(r14)
            r9.append(r6)
            java.lang.String r14 = "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "
            r9.append(r14)
            r9.append(r2)
            java.lang.String r14 = " AND invalidated = 0; END"
            r9.append(r14)
            java.lang.String r14 = r9.toString()
            r0.a = r7
            r0.b = r6
            r0.i = r5
            r0.c = r2
            r0.d = r13
            r0.e = r12
            r0.h = r3
            java.lang.Object r14 = defpackage.gvf.bG(r7, r14, r0)
            if (r14 != r1) goto Lc1
            return r1
        Lc1:
            int r13 = r13 + r4
            goto L79
        Lc3:
            arnb r12 = defpackage.arnb.a
            return r12
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giw.c(gia, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007b -> B:10:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.gia r10, int r11, defpackage.arpe r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.git
            if (r0 == 0) goto L13
            r0 = r12
            git r0 = (defpackage.git) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            git r0 = new git
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r10 = r0.b
            int r11 = r0.a
            java.lang.String[] r2 = r0.g
            java.lang.String r4 = r0.f
            gjf r5 = r0.h
            defpackage.aqil.P(r12)
            r12 = r4
            goto L7d
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            defpackage.aqil.P(r12)
            java.lang.String[] r12 = r9.k
            r11 = r12[r11]
            java.lang.String[] r12 = defpackage.giw.f
            r2 = 3
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L4a:
            if (r4 >= r10) goto L81
            r5 = r2[r4]
            java.lang.String r5 = defpackage.gvf.bF(r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.<init>(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = r11
            gjf r6 = (defpackage.gjf) r6
            r0.h = r6
            r0.f = r12
            r0.g = r2
            r0.a = r4
            r0.b = r10
            r0.e = r3
            java.lang.Object r5 = defpackage.gvf.bG(r11, r5, r0)
            if (r5 != r1) goto L7b
            return r1
        L7b:
            r5 = r11
            r11 = r4
        L7d:
            int r4 = r11 + 1
            r11 = r5
            goto L4a
        L81:
            arnb r10 = defpackage.arnb.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giw.d(gia, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.giu
            if (r0 == 0) goto L13
            r0 = r9
            giu r0 = (defpackage.giu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            giu r0 = new giu
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ico r0 = r0.d
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r9 = move-exception
            goto L5e
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            defpackage.aqil.P(r9)
            gid r9 = r8.a
            ico r9 = r9.i
            boolean r2 = r9.z()
            if (r2 == 0) goto L62
            gid r2 = r8.a     // Catch: java.lang.Throwable -> L5a
            eig r4 = new eig     // Catch: java.lang.Throwable -> L5a
            r5 = 8
            r6 = 0
            r4.<init>(r8, r6, r5, r6)     // Catch: java.lang.Throwable -> L5a
            r0.d = r9     // Catch: java.lang.Throwable -> L5a
            r0.c = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r0 = r2.t(r4, r0)     // Catch: java.lang.Throwable -> L5a
            if (r0 == r1) goto L59
            r0 = r9
        L55:
            r0.y()
            goto L62
        L59:
            return r1
        L5a:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L5e:
            r0.y()
            throw r9
        L62:
            arnb r9 = defpackage.arnb.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giw.e(arpe):java.lang.Object");
    }

    public final armo f(String[] strArr) {
        aroy aroyVar = new aroy();
        for (String str : strArr) {
            Map map = this.h;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                aroyVar.addAll(set);
            } else {
                aroyVar.add(str);
            }
        }
        String[] strArr2 = (String[]) aqjn.d(aroyVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Map map2 = this.j;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) map2.get(lowerCase2);
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str2)));
            }
        }
        return new armo(strArr2, iArr);
    }

    public final void g(arqg arqgVar, arqg arqgVar2) {
        arqgVar.getClass();
        arqgVar2.getClass();
        if (this.l.a(false, true)) {
            arrn.J(this.a.i(), new arwd("Room Invalidation Tracker Refresh"), null, new gbv(this, arqgVar2, (arpe) null, 7), 2);
        }
    }
}
