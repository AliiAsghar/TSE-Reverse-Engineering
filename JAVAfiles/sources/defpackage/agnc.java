package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agnc {
    public static Context b;
    public static agmt c;
    private static String g;
    public static final Object a = new Object();
    public static final Object d = new Object();
    public static final SettableFuture e = SettableFuture.create();
    private static final Object f = new Object();
    private static final AtomicReference h = new AtomicReference(false);
    private static final Pattern i = Pattern.compile("SCAN TABLE ([a-zA-Z0-9_]+)$");

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        Map Lc();

        Map Ld();

        rdc QU();

        agmu hl();
    }

    public static boolean[] A(long[] jArr, boolean[] zArr) {
        long j;
        HashSet hashSet = new HashSet();
        boolean[] zArr2 = new boolean[zArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < zArr.length; i3++) {
            if (jArr == null) {
                j = 0;
            } else {
                j = jArr[i3];
            }
            if (jArr == null || (j != 0 && !hashSet.contains(Long.valueOf(j)))) {
                hashSet.add(Long.valueOf(j));
                zArr2[i2] = zArr[i3];
                i2++;
            }
        }
        return Arrays.copyOf(zArr2, i2);
    }

    public static byte[][] B(long[] jArr, byte[][] bArr) {
        long j;
        HashSet hashSet = new HashSet();
        byte[][] bArr2 = new byte[bArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (jArr == null) {
                j = 0;
            } else {
                j = jArr[i3];
            }
            if (jArr == null || (j != 0 && !hashSet.contains(Long.valueOf(j)))) {
                hashSet.add(Long.valueOf(j));
                bArr2[i2] = bArr[i3];
                i2++;
            }
        }
        return (byte[][]) Arrays.copyOf(bArr2, i2);
    }

    public static double[] C(double[] dArr) {
        HashSet hashSet = new HashSet();
        double[] dArr2 = new double[dArr.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < dArr.length) {
            hashSet.add(-1L);
            dArr2[i3] = dArr[i2];
            i2++;
            i3++;
        }
        return Arrays.copyOf(dArr2, i3);
    }

    public static float[] D(float[] fArr) {
        HashSet hashSet = new HashSet();
        float[] fArr2 = new float[fArr.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < fArr.length) {
            hashSet.add(0L);
            fArr2[i3] = fArr[i2];
            i2++;
            i3++;
        }
        return Arrays.copyOf(fArr2, i3);
    }

    public static void E(agnw agnwVar, String str) {
        agnwVar.z("DROP TABLE ".concat(str));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(15:(2:5|(31:(1:8)|9|10|(1:12)|13|14|(2:(4:114|115|111|112)|116)|(1:17)|18|19|20|21|22|(3:26|23|24)|27|(1:29)|30|31|32|(1:38)|(1:41)|42|(3:44|(1:46)|47)|48|(2:51|49)|52|53|(3:57|54|55)|58|59|(3:(1:62)|63|64)(2:66|67)))|31|32|(3:34|36|38)|(0)|42|(0)|48|(1:49)|52|53|(2:54|55)|58|59|(0)(0))|19|20|21|22|(2:23|24)|27|(0)|30) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d1, code lost:
    
        android.util.Log.v("d26r", defpackage.a.cg(r9, r20, "unable to recreate table ", " with columns "), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x006e A[EXC_TOP_SPLITTER, LOOP:5: B:111:0x006e->B:115:0x007b, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[Catch: all -> 0x01c2, LOOP:1: B:23:0x00ba->B:26:0x00c0, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x01c2, blocks: (B:24:0x00ba, B:26:0x00c0), top: B:23:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[Catch: SQLiteException -> 0x01d0, all -> 0x01e0, TRY_ENTER, TryCatch #6 {SQLiteException -> 0x01d0, blocks: (B:22:0x00ab, B:29:0x00ca, B:30:0x00cd, B:41:0x010d, B:42:0x0110, B:44:0x0126, B:46:0x012a, B:48:0x0132, B:49:0x0136, B:51:0x013c, B:53:0x0146, B:62:0x0199, B:79:0x01b3, B:78:0x01b0, B:91:0x01c1, B:90:0x01be, B:104:0x01cf, B:103:0x01cc), top: B:21:0x00ab, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d A[Catch: SQLiteException -> 0x01d0, all -> 0x01e0, TRY_ENTER, TryCatch #6 {SQLiteException -> 0x01d0, blocks: (B:22:0x00ab, B:29:0x00ca, B:30:0x00cd, B:41:0x010d, B:42:0x0110, B:44:0x0126, B:46:0x012a, B:48:0x0132, B:49:0x0136, B:51:0x013c, B:53:0x0146, B:62:0x0199, B:79:0x01b3, B:78:0x01b0, B:91:0x01c1, B:90:0x01be, B:104:0x01cf, B:103:0x01cc), top: B:21:0x00ab, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126 A[Catch: SQLiteException -> 0x01d0, all -> 0x01e0, TryCatch #6 {SQLiteException -> 0x01d0, blocks: (B:22:0x00ab, B:29:0x00ca, B:30:0x00cd, B:41:0x010d, B:42:0x0110, B:44:0x0126, B:46:0x012a, B:48:0x0132, B:49:0x0136, B:51:0x013c, B:53:0x0146, B:62:0x0199, B:79:0x01b3, B:78:0x01b0, B:91:0x01c1, B:90:0x01be, B:104:0x01cf, B:103:0x01cc), top: B:21:0x00ab, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c A[Catch: SQLiteException -> 0x01d0, all -> 0x01e0, LOOP:3: B:49:0x0136->B:51:0x013c, LOOP_END, TryCatch #6 {SQLiteException -> 0x01d0, blocks: (B:22:0x00ab, B:29:0x00ca, B:30:0x00cd, B:41:0x010d, B:42:0x0110, B:44:0x0126, B:46:0x012a, B:48:0x0132, B:49:0x0136, B:51:0x013c, B:53:0x0146, B:62:0x0199, B:79:0x01b3, B:78:0x01b0, B:91:0x01c1, B:90:0x01be, B:104:0x01cf, B:103:0x01cc), top: B:21:0x00ab, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157 A[Catch: all -> 0x01a6, LOOP:4: B:54:0x0151->B:57:0x0157, LOOP_END, TryCatch #5 {all -> 0x01a6, blocks: (B:55:0x0151, B:57:0x0157, B:59:0x0191, B:66:0x019d, B:67:0x01a5), top: B:54:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #5 {all -> 0x01a6, blocks: (B:55:0x0151, B:57:0x0157, B:59:0x0191, B:66:0x019d, B:67:0x01a5), top: B:54:0x0151 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void F(defpackage.agnw r19, java.lang.String r20, java.lang.String r21, java.lang.String[] r22, java.lang.String[] r23) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agnc.F(agnw, java.lang.String, java.lang.String, java.lang.String[], java.lang.String[]):void");
    }

    public static rdc G() {
        return ((a) akec.w(b, a.class)).QU();
    }

    @Deprecated
    public static long a(agnw agnwVar, String str, aglz aglzVar, Function function, Consumer consumer) {
        Object apply;
        ContentValues contentValues = new ContentValues();
        aglzVar.b(contentValues);
        adwp u = aglo.u();
        Integer a2 = agnb.a(str);
        if (a2 != null) {
            Log.i("D26R", "INSERT " + str + " " + aglzVar.a());
            adwp.l(a2.intValue());
        }
        ContentValues contentValues2 = new ContentValues();
        aglzVar.b(contentValues2);
        boolean z = false;
        aoij q = u.q(agnwVar, new agok(u, str, contentValues2, 0 == true ? 1 : 0), new agoo(aglzVar));
        apply = function.apply(contentValues);
        Long l = (Long) apply;
        long longValue = l.longValue();
        consumer.accept(l);
        if (longValue != -1) {
            z = true;
        }
        q.a(z);
        return longValue;
    }

    public static aglz b(agoz agozVar) {
        agmq n = agozVar.n();
        try {
            if (n.getCount() <= 1) {
                aglz cM = n.cM();
                n.close();
                return cM;
            }
            throw new IllegalStateException("queried for more than 1 row on unique column: " + n.getCount() + " rows; " + agozVar.y(agpo.b()));
        } catch (Throwable th) {
            try {
                n.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static agnj c(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, Set set) {
        String replace = str.replace(" IN ()", " IN ('x', 'y', 'z')");
        agnj agnjVar = new agnj();
        Cursor rawQuery = sQLiteDatabase.rawQuery("EXPLAIN QUERY PLAN ".concat(String.valueOf(replace)), strArr);
        try {
            int columnIndex = rawQuery.getColumnIndex("detail");
            StringBuilder sb = new StringBuilder();
            String str2 = null;
            while (rawQuery.moveToNext()) {
                String string = rawQuery.getString(columnIndex);
                sb.append(string);
                Matcher matcher = i.matcher(string);
                if (matcher.matches()) {
                    if (matcher.groupCount() > 0) {
                        str2 = matcher.group(1);
                    }
                    sb.append(" <<<<<<<<<< QUERY PLAN WARNING");
                    if (set.contains(str2)) {
                        sb.append(" (exempted)");
                    } else {
                        agnjVar.b = true;
                    }
                }
                sb.append("\n");
            }
            agnjVar.a = sb.toString();
            if (rawQuery != null) {
                rawQuery.close();
            }
            return agnjVar;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static agnw d(String str) {
        agnw agnwVar;
        albo.U(c.l, "not primary process");
        a aVar = (a) akec.w(b, a.class);
        if (u() && (agnwVar = (agnw) aVar.hl().a.get(str)) != null) {
            return agnwVar;
        }
        return (agnw) aVar.Lc().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alog e(agmh[] agmhVarArr) {
        alob alobVar = new alob();
        for (agmh agmhVar : agmhVarArr) {
            alobVar.h(agmhVar.toString());
        }
        return alobVar.g();
    }

    public static String f(String str) {
        int indexOf = str.indexOf(" AS ");
        if (indexOf >= 0) {
            return str.substring(indexOf + 4);
        }
        return str;
    }

    public static String g(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return "OR REPLACE";
                    }
                    return "OR IGNORE";
                }
                return "OR FAIL";
            }
            return "OR ABORT";
        }
        return "OR ROLLBACK";
    }

    public static String h(ContentValues contentValues, Map map, agpo agpoVar) {
        String sqlEscapeString;
        StringBuilder sb = new StringBuilder();
        for (String str : contentValues.keySet()) {
            Object obj = contentValues.get(str);
            if (obj == null) {
                sqlEscapeString = "null";
            } else if (obj instanceof Boolean) {
                sqlEscapeString = String.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            } else if (obj instanceof Number) {
                sqlEscapeString = obj.toString();
            } else if (obj instanceof byte[]) {
                StringBuilder sb2 = new StringBuilder("X'");
                StringBuilder sb3 = new StringBuilder();
                for (byte b2 : (byte[]) obj) {
                    sb3.append(String.format("%02X", Byte.valueOf(b2)));
                }
                sb2.append((CharSequence) sb3);
                sb2.append("'");
                sqlEscapeString = sb2.toString();
            } else {
                sqlEscapeString = DatabaseUtils.sqlEscapeString(obj.toString());
            }
            sb.append(str);
            sb.append("=");
            sb.append(sqlEscapeString);
            sb.append(",");
        }
        if (map != null) {
            for (String str2 : map.keySet()) {
                sb.append(str2);
                sb.append("=");
                sb.append(((agpj) map.get(str2)).ad(agpoVar));
                sb.append(",");
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static String i(SQLiteDatabase sQLiteDatabase) {
        String str;
        synchronized (f) {
            if (g == null) {
                if (sQLiteDatabase != null) {
                    try {
                        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT sqlite_version()", null);
                        try {
                            rawQuery.moveToFirst();
                            g = rawQuery.getString(0);
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        g = hht.c(th, "error: ");
                    }
                } else {
                    g = "not open";
                }
            }
            str = g;
        }
        return str;
    }

    public static String j(String[] strArr) {
        return new algs(",").e(strArr);
    }

    public static String k(String str) {
        if (str.contains("group_concat") && !str.contains(" AS ")) {
            int abs = Math.abs(str.hashCode());
            if (abs < 0) {
                abs = 0;
            }
            return str + " AS gen_as_" + abs;
        }
        return str;
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.", 2);
        if (split.length == 2) {
            return split[1];
        }
        throw new IllegalArgumentException("malformed qualified column:".concat(str));
    }

    public static List m(Object obj, Class cls) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < Array.getLength(obj); i2++) {
            arrayList.add(cls.cast(Array.get(obj, i2)));
        }
        return arrayList;
    }

    public static void n(int i2, int i3, alhr alhrVar) {
        Supplier supplier = c.d;
        defpackage.a.by().booleanValue();
        if (i3 == i2) {
        } else {
            throw new IllegalStateException(String.format("unexpected array size %s; expected %s; raw column value: %s", Integer.valueOf(i3), Integer.valueOf(i2), alhrVar.get()));
        }
    }

    public static void o(agnw agnwVar, String str) {
        Cursor query = agnwVar.j().query("sqlite_master", new String[]{"sql"}, "type = 'table' AND name = ?", new String[]{str}, null, null, null);
        try {
            int count = query.getCount();
            if (query != null) {
                query.close();
            }
            if (count != 0) {
                agnwVar.z("DELETE FROM ".concat(str));
            }
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void p(boolean z) {
        h.set(Boolean.valueOf(z));
    }

    public static void q(ContentValues contentValues, String str, long j) {
        if (j != 0) {
            contentValues.put(str, Long.valueOf(j));
        } else {
            contentValues.putNull(str);
        }
    }

    public static void r(ContentValues contentValues, String str, String str2) {
        if (str2 == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    public static void s(agnw agnwVar, String str, String str2) {
        agnwVar.z("DROP INDEX IF EXISTS ".concat(str));
        agnwVar.z(str2);
    }

    public static void t(String str, int i2) {
        throw new IllegalStateException(String.format(Locale.US, defpackage.a.bW(str, "column ", " is not available in schema version %d"), Integer.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u() {
        Object obj;
        if (((Boolean) h.get()).booleanValue()) {
            return true;
        }
        obj = c.h.get();
        if (!((Boolean) obj).booleanValue()) {
            return false;
        }
        return true;
    }

    public static byte[] v(String str) {
        if (str == null || str.equals("NULL")) {
            return null;
        }
        if (str.startsWith("X'") && str.endsWith("'")) {
            String substring = str.substring(2, str.length() - 1);
            int length = substring.length();
            if (length % 2 == 0) {
                int i2 = length / 2;
                byte[] bArr = new byte[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = i3 + i3;
                    bArr[i3] = (byte) Integer.parseInt(substring.substring(i4, i4 + 2), 16);
                }
                return bArr;
            }
            throw new IllegalArgumentException("invalid blob");
        }
        throw new IllegalArgumentException("invalid blob");
    }

    public static int[] w(long[] jArr, int[] iArr) {
        long j;
        HashSet hashSet = new HashSet();
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (jArr == null) {
                j = 0;
            } else {
                j = jArr[i3];
            }
            if (jArr == null || (j != 0 && !hashSet.contains(Long.valueOf(j)))) {
                hashSet.add(Long.valueOf(j));
                iArr2[i2] = iArr[i3];
                i2++;
            }
        }
        return Arrays.copyOf(iArr2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] x(final agnw agnwVar, int i2, final boolean z, final BiConsumer biConsumer, final aglz... aglzVarArr) {
        String concat;
        if (aglzVarArr.length == 0) {
            return new long[0];
        }
        Object[] objArr = aglzVarArr[0];
        if (objArr instanceof agma) {
            final agma agmaVar = (agma) objArr;
            final String i3 = agmaVar.i();
            String g2 = g(i2);
            if (g2 == null) {
                concat = "";
            } else {
                concat = g2.concat(" ");
            }
            final String str = "INSERT " + concat + agmaVar.f();
            return (long[]) agnwVar.t(new agni("bulkInsertImpl-", i3), new alhr() { // from class: agmv
                /* JADX WARN: Code restructure failed: missing block: B:100:0x0170, code lost:
                
                    r1 = r8.g();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:101:0x0174, code lost:
                
                    if (r1 == null) goto L106;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:102:0x0176, code lost:
                
                    r5 = new long[r14];
                    r11 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:103:0x0193, code lost:
                
                    r7 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:104:0x0194, code lost:
                
                    r1 = r0.g(java.lang.String.format(java.util.Locale.US, "/*EXEMPT-FROM-QUERY-PLAN-CHECK*\/SELECT %s FROM %s ORDER BY %s DESC LIMIT %d", r1, r2, r1, java.lang.Integer.valueOf(r14)), null);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:106:0x0198, code lost:
                
                    r0 = r1.getCount();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:107:0x019c, code lost:
                
                    r0 = r0 - 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x01a2, code lost:
                
                    if (r1.moveToNext() == false) goto L155;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:109:0x01a4, code lost:
                
                    r5[r0] = r1.getLong(0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:111:0x01ac, code lost:
                
                    r2 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:112:0x01ad, code lost:
                
                    if (r1 == null) goto L87;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:113:0x01af, code lost:
                
                    r1.close();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:115:0x01b8, code lost:
                
                    if (defpackage.agnc.c.a() == false) goto L111;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:117:0x01bb, code lost:
                
                    if (r14 != r4.length) goto L92;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:118:0x01bd, code lost:
                
                    r0 = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:119:0x01c0, code lost:
                
                    defpackage.albo.T(r0);
                    r0 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:120:0x01c4, code lost:
                
                    if (r0 >= r14) goto L156;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:121:0x01c6, code lost:
                
                    r6.accept(r4[r0], java.lang.Long.valueOf(r5[r0]));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:122:0x01d1, code lost:
                
                    r0 = r0 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:124:0x01bf, code lost:
                
                    r0 = false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:125:0x0205, code lost:
                
                    if (r12 <= 0) goto L113;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:126:0x0207, code lost:
                
                    r9 = r11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:127:0x020a, code lost:
                
                    r3.a(r9);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
                
                    return r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:130:0x0209, code lost:
                
                    r9 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:132:0x01d4, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:145:0x01fe, code lost:
                
                    throw new java.lang.IllegalStateException("table " + r2 + " does not have an integer primary key autoincrement");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:146:0x0201, code lost:
                
                    r2 = false;
                    r11 = true;
                    r5 = null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x016e, code lost:
                
                    if (r5 == false) goto L110;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[Catch: all -> 0x020f, TryCatch #3 {all -> 0x020f, blocks: (B:14:0x004f, B:16:0x0052, B:17:0x0060, B:21:0x0068, B:23:0x0087, B:25:0x0090, B:28:0x0099, B:29:0x009c, B:31:0x00a2, B:33:0x00ae, B:35:0x00b4, B:36:0x00ce, B:38:0x00d4, B:81:0x00de, B:41:0x00e4, B:78:0x00e8, B:44:0x00ee, B:46:0x00f2, B:48:0x00f6, B:50:0x00fa, B:72:0x0101, B:60:0x0105, B:62:0x0109, B:66:0x010e, B:67:0x0125, B:69:0x0126, B:54:0x0130, B:84:0x013a, B:88:0x0147, B:89:0x0165, B:91:0x0166, B:92:0x016d, B:100:0x0170, B:102:0x0176), top: B:13:0x004f }] */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0166 A[SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r5v12, types: [java.util.Collection, java.lang.Object] */
                @Override // defpackage.alhr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object get() {
                    /*
                        Method dump skipped, instructions count: 563
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.agmv.get():java.lang.Object");
                }
            }, agnv.a().c());
        }
        throw new IllegalArgumentException("not insertable");
    }

    public static long[] y(long[] jArr, long[] jArr2) {
        long j;
        HashSet hashSet = new HashSet();
        long[] jArr3 = new long[jArr2.length];
        int i2 = 0;
        for (int i3 = 0; i3 < jArr2.length; i3++) {
            if (jArr == null) {
                j = 0;
            } else {
                j = jArr[i3];
            }
            if (jArr == null || (j != 0 && !hashSet.contains(Long.valueOf(j)))) {
                hashSet.add(Long.valueOf(j));
                jArr3[i2] = jArr2[i3];
                i2++;
            }
        }
        return Arrays.copyOf(jArr3, i2);
    }

    public static Object[] z(long[] jArr, Object[] objArr, Object[] objArr2) {
        if (jArr == null) {
            return objArr;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                Long valueOf = Long.valueOf(j);
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(valueOf);
                    arrayList.add(objArr[i2]);
                }
            }
        }
        return arrayList.toArray(objArr2);
    }
}
