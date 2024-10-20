package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.util.Log;
import defpackage.aglz;
import defpackage.agmh;
import defpackage.agmq;
import defpackage.agoz;
import defpackage.agpc;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agmp<C extends agmq<C, Q, B, D, CR>, Q extends agoz<C, Q, B, D, CR>, B extends agpc<C, Q, B, D, CR>, D extends aglz<C, Q, B, D, CR>, CR extends agmh<CR>> extends CursorWrapper {
    static final anna h = anna.e('|');
    public static final /* synthetic */ int j = 0;
    private static final alog k;
    private static final int[] l;
    private static final long[] m;
    private static final boolean[] n;
    private static final float[] o;
    private static final double[] p;
    private static final byte[][] q;
    private static final long[] r;
    public final agoz a;
    public final agnw b;
    protected Map c;
    public String[] d;
    public agpj[] e;
    public final Map f;
    protected final int[] g;
    public final akkw i;
    private final AtomicLong s;
    private final AtomicInteger t;

    static {
        int i = alog.d;
        k = alsx.a;
        l = new int[0];
        m = new long[0];
        n = new boolean[0];
        o = new float[0];
        p = new double[0];
        q = new byte[0];
        r = new long[]{-1};
    }

    public agmp(agnw agnwVar, Cursor cursor, String[] strArr, agpj[] agpjVarArr, String[] strArr2, agox agoxVar, akkw akkwVar, agoz agozVar) {
        super(cursor);
        boolean z;
        String str;
        this.s = new AtomicLong(Thread.currentThread().getId());
        this.f = new HashMap();
        this.t = new AtomicInteger();
        if (cursor instanceof agmp) {
            ((agmp) cursor).da();
        }
        da();
        this.a = agozVar;
        int i = 0;
        if (agozVar == null) {
            z = false;
        } else {
            z = agozVar.e.w;
        }
        if (this.c == null) {
            this.c = new HashMap();
            int length = strArr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                this.c.put(agoxVar.apply(strArr2[i2]), Integer.valueOf(i3));
                i2++;
                i3++;
            }
        }
        this.b = agnwVar;
        this.d = strArr;
        this.e = agpjVarArr;
        this.g = new int[strArr2.length];
        this.i = akkwVar;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.c.entrySet()) {
            if (z) {
                str = agnc.f((String) entry.getKey());
            } else {
                str = (String) entry.getKey();
            }
            hashMap.put(str, (Integer) entry.getValue());
        }
        Arrays.fill(this.g, -1);
        if (z) {
            while (i < strArr.length) {
                int intValue = ((Integer) Map.EL.getOrDefault(hashMap, agnc.f(strArr[i]), -1)).intValue();
                if (intValue >= 0) {
                    this.g[intValue] = i;
                }
                i++;
            }
            return;
        }
        while (i < strArr.length) {
            String str2 = strArr[i];
            if (hashMap.containsKey(str2)) {
                this.g[((Integer) hashMap.get(str2)).intValue()] = i;
            }
            i++;
        }
    }

    private final void a() {
        Supplier supplier = agnc.c.e;
        a.by().booleanValue();
        if (this.t.get() <= 0) {
        } else {
            throw new ConcurrentModificationException("unable to set cursor position while binding");
        }
    }

    private final void c() {
        Object obj;
        obj = agnc.c.b.get();
        if (!((Boolean) obj).booleanValue() || this.s.get() == Thread.currentThread().getId()) {
        } else {
            throw new IllegalStateException("multi-threaded access to cursor");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final List cY(String str) {
        if (str != null && str.length() != 0) {
            return h.c(str);
        }
        return k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final double[] di(String str) {
        List<String> cY = cY(str);
        if (cY.isEmpty()) {
            return p;
        }
        double[] dArr = new double[cY.size()];
        int i = 0;
        for (String str2 : cY) {
            double d = 0.0d;
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    d = Double.parseDouble(str2);
                } catch (NumberFormatException unused) {
                    d = Double.NaN;
                }
            }
            dArr[i] = d;
            i++;
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final float[] dj(String str) {
        List<String> cY = cY(str);
        if (cY.isEmpty()) {
            return o;
        }
        float[] fArr = new float[cY.size()];
        int i = 0;
        for (String str2 : cY) {
            float f = brg.a;
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    f = Float.parseFloat(str2);
                } catch (NumberFormatException unused) {
                    f = Float.NaN;
                }
            }
            fArr[i] = f;
            i++;
        }
        return fArr;
    }

    public static final int[] dk(String str) {
        int i;
        List<String> cY = cY(str);
        if (cY.isEmpty()) {
            return l;
        }
        int[] iArr = new int[cY.size()];
        int i2 = 0;
        for (String str2 : cY) {
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    i = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                }
                iArr[i2] = i;
                i2++;
            }
            i = 0;
            iArr[i2] = i;
            i2++;
        }
        return iArr;
    }

    public static final long[] dl(String str) {
        List<String> cY = cY(str);
        if (cY.isEmpty()) {
            return m;
        }
        long[] jArr = new long[cY.size()];
        int i = 0;
        for (String str2 : cY) {
            long j2 = 0;
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    j2 = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                }
            }
            jArr[i] = j2;
            i++;
        }
        return jArr;
    }

    public static final String[] dm(String str) {
        boolean z;
        char charAt;
        char c;
        String[] strArr = agpg.a;
        if (str != null && str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            try {
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                int i = -1;
                while (true) {
                    boolean z2 = true;
                    i++;
                    if (i < length) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 == '\'') {
                            while (true) {
                                int i2 = i + 1;
                                if (i2 < length) {
                                    char charAt3 = str.charAt(i2);
                                    if (charAt3 == '\'') {
                                        if (i2 < length - 1) {
                                            c = str.charAt(i + 2);
                                        } else {
                                            c = 0;
                                        }
                                        if (c == '\'') {
                                            i2 = i + 2;
                                            charAt3 = '\'';
                                        } else {
                                            if (c != '|' && c != 0) {
                                                Log.w("DatabaseAnnotationProcessor", "Failed to parse quoted string {REDACTED STRING } at position " + i2 + "; expected a divider character(|), end of string but found (" + c + ")");
                                                throw new IllegalArgumentException("malformed string; expected quote character");
                                            }
                                            agpg.a(arrayList, sb);
                                            sb.setLength(0);
                                            i += 2;
                                        }
                                    }
                                    sb.append(charAt3);
                                    i = i2;
                                } else {
                                    i = i2;
                                    break;
                                }
                            }
                        } else {
                            aluq listIterator = agpg.b.entrySet().listIterator();
                            while (true) {
                                if (listIterator.hasNext()) {
                                    Map.Entry entry = (Map.Entry) listIterator.next();
                                    String str2 = (String) entry.getKey();
                                    if (str.substring(i, Math.min(str.length(), i + str2.length())).equals(str2)) {
                                        String str3 = (String) entry.getValue();
                                        if (true == str3.equals("@null")) {
                                            str3 = null;
                                        }
                                        arrayList.add(str3);
                                        i += str2.length();
                                        z = true;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            if (!z && "-0123456789.".indexOf(charAt2) >= 0) {
                                sb.append(charAt2);
                                while (true) {
                                    i++;
                                    if (i >= length || (charAt = str.charAt(i)) == '|') {
                                        break;
                                    }
                                    sb.append(charAt);
                                }
                                agpg.a(arrayList, sb);
                                sb.setLength(0);
                            } else {
                                z2 = z;
                            }
                            if (!z2) {
                                Log.w("DatabaseAnnotationProcessor", "Failed to parse quoted string {REDACTED STRING } at position " + i + "; expected a quote char('), but found (" + charAt2 + ")");
                                throw new IllegalArgumentException("malformed string; expected quote character");
                            }
                        }
                    } else {
                        return (String[]) arrayList.toArray(new String[arrayList.size()]);
                    }
                }
            } catch (IllegalArgumentException unused) {
                return agpg.a;
            }
        } else {
            return agpg.a;
        }
    }

    public static final boolean[] dn(String str) {
        boolean z;
        List<String> cY = cY(str);
        if (cY.isEmpty()) {
            return n;
        }
        boolean[] zArr = new boolean[cY.size()];
        int i = 0;
        for (String str2 : cY) {
            if (str2 != null && !str2.equals("NULL")) {
                z = str2.equals("1");
            } else {
                z = false;
            }
            zArr[i] = z;
            i++;
        }
        return zArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: do, reason: not valid java name */
    public static final void m44do(int i, double[] dArr, alhr alhrVar) {
        if (dArr != null) {
            agnc.n(i, dArr.length, alhrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void dp(int i, float[] fArr, alhr alhrVar) {
        if (fArr != null) {
            agnc.n(i, fArr.length, alhrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void dq(int i, int[] iArr, alhr alhrVar) {
        if (iArr != null) {
            agnc.n(i, iArr.length, alhrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void dr(int i, long[] jArr, alhr alhrVar) {
        if (jArr != null) {
            agnc.n(i, jArr.length, alhrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void ds(int i, Object[] objArr, alhr alhrVar) {
        if (objArr != null) {
            agnc.n(i, objArr.length, alhrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void dt(int i, boolean[] zArr, alhr alhrVar) {
        if (zArr != null) {
            agnc.n(i, zArr.length, alhrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final long[] du(String str) {
        if (str == null) {
            return r;
        }
        return dl(str);
    }

    public static final byte[][] dv(String str) {
        byte[] bArr;
        List<String> cY = cY(str);
        if (cY.isEmpty()) {
            return q;
        }
        byte[][] bArr2 = new byte[cY.size()];
        int i = 0;
        for (String str2 : cY) {
            int i2 = i + 1;
            if (str2.equals("NULL")) {
                bArr = null;
            } else {
                int length = str2.length();
                if (length >= 3 && str2.charAt(0) == 'X' && str2.charAt(1) == '\'' && str2.charAt(length - 1) == '\'') {
                    int i3 = length - 3;
                    if ((i3 & 1) == 0) {
                        int i4 = i3 >> 1;
                        byte[] bArr3 = new byte[i4];
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = i5 + i5;
                            bArr3[i5] = (byte) Short.parseShort(str2.substring(i6 + 2, i6 + 4), 16);
                        }
                        bArr = bArr3;
                    }
                }
                throw new IllegalArgumentException("invalid blob string: ".concat(String.valueOf(str2)));
            }
            bArr2[i] = bArr;
            i = i2;
        }
        return bArr2;
    }

    public abstract aglz b();

    public final int cI(int i, String[] strArr) {
        int i2 = this.g[i];
        if (i2 != -1) {
            return i2;
        }
        throw new IllegalArgumentException("column " + strArr[i] + " is not part of the projection.");
    }

    public final int cJ() {
        return super.getCount();
    }

    public final aglz cK() {
        return cL(new adpp(this, 3));
    }

    public final aglz cL(Supplier supplier) {
        return (aglz) cW(new udz(this, supplier, 16));
    }

    public final aglz cM() {
        return cN(new adpp(this, 3));
    }

    public final aglz cN(Supplier supplier) {
        if (!moveToNext()) {
            return null;
        }
        return cL(supplier);
    }

    public final aglz cO() {
        aglz aglzVar;
        try {
            if (getCount() <= 1) {
                if (moveToFirst()) {
                    aglzVar = cL(new adpp(this, 3));
                } else {
                    aglzVar = null;
                }
                close();
                return aglzVar;
            }
            throw new IllegalStateException("query found " + getCount() + " rows");
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final aglz cP() {
        try {
            boolean moveToFirst = moveToFirst();
            if (getCount() == 1 && moveToFirst) {
                aglz cL = cL(new adpp(this, 3));
                close();
                return cL;
            }
            throw new IllegalStateException("query found " + getCount() + " rows");
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final agmq cQ(String str) {
        return (agmq) this.f.get(str);
    }

    public final alog cR() {
        alog g;
        adpp adppVar = new adpp(this, 3);
        try {
            da();
            if (!moveToFirst()) {
                int i = alog.d;
                g = alsx.a;
            } else {
                alob alobVar = new alob();
                do {
                    alobVar.h(cL(adppVar));
                } while (moveToNext());
                c();
                g = alobVar.g();
            }
            close();
            return g;
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alog cS(agmo agmoVar) {
        alog g;
        try {
            da();
            if (!moveToFirst()) {
                int i = alog.d;
                g = alsx.a;
            } else {
                alob alobVar = new alob();
                do {
                    alobVar.h(cU(agmoVar));
                } while (moveToNext());
                c();
                g = alobVar.g();
            }
            close();
            return g;
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Stream cT() {
        Object obj;
        obj = agnc.c.c.get();
        if (((Boolean) obj).booleanValue()) {
            final agmm agmmVar = new agmm(0);
            da();
            Object cV = cV(agmmVar);
            if (cV == null) {
                close();
                return Stream.CC.empty();
            }
            final boolean[] zArr = {false};
            return Stream.CC.iterate(cV, new adru(6), new UnaryOperator() { // from class: agmn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo416andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    boolean[] zArr2 = zArr;
                    agmp agmpVar = agmp.this;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        agmpVar.da();
                    }
                    Object cV2 = agmpVar.cV(agmmVar);
                    if (cV2 == null) {
                        agmpVar.close();
                    }
                    return cV2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).onClose(new aefw(this, 18));
        }
        da();
        return Stream.CC.generate(new adpp(this, 2)).limit(getCount()).onClose(new aefw(this, 17));
    }

    public final Object cU(agmo agmoVar) {
        return cW(new udz(this, agmoVar, 17, null));
    }

    public final Object cV(agmo agmoVar) {
        if (!moveToNext()) {
            return null;
        }
        return cU(agmoVar);
    }

    public final Object cW(Supplier supplier) {
        Object obj;
        try {
            this.t.incrementAndGet();
            obj = supplier.get();
            return obj;
        } finally {
            this.t.decrementAndGet();
        }
    }

    public final String cX(String str) {
        agpj[] agpjVarArr = this.e;
        if (agpjVarArr != null) {
            int i = 0;
            for (agpj agpjVar : agpjVarArr) {
                if ((agpjVar instanceof agly) && ((agly) agpjVar).a.equals(str)) {
                    return getWrappedCursor().getString(this.d.length + i);
                }
                i++;
            }
        }
        throw new IllegalArgumentException("unknown as expression: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void cZ(alog alogVar, aglz aglzVar) {
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            agoa agoaVar = (agoa) alogVar.get(i);
            agmp agmpVar = (agmp) ((agmq) this).cQ(agoaVar.e);
            alog fr = agmpVar.fr(agoaVar);
            alob alobVar = new alob();
            alobVar.h(agmpVar.b());
            alobVar.j(fr);
            aglzVar.cG.put(agoaVar.e, alobVar.g());
            aglzVar.cH.put(agoaVar.e, agoaVar);
            cZ(agoaVar.a.n.i(), aglzVar);
        }
    }

    public final void da() {
        this.s.set(Thread.currentThread().getId());
    }

    public final boolean db(int i) {
        if (this.g[i] != -1) {
            return true;
        }
        return false;
    }

    public final boolean dc(String str) {
        agpj[] agpjVarArr = this.e;
        if (agpjVarArr != null) {
            for (agpj agpjVar : agpjVarArr) {
                if ((agpjVar instanceof agly) && ((agly) agpjVar).a.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean dd() {
        a();
        return super.moveToFirst();
    }

    public final boolean de() {
        a();
        return super.moveToLast();
    }

    public final boolean df() {
        a();
        return super.moveToNext();
    }

    public final boolean dg(int i) {
        a();
        return super.moveToPosition(i);
    }

    public final boolean dh() {
        a();
        return super.moveToPrevious();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dw(akkw akkwVar, alog alogVar, boolean z) {
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            ((agoa) alogVar.get(i)).b(this.b, this, akkwVar, z);
        }
    }

    public final aday dx() {
        ArrayList arrayList = new ArrayList();
        int columnCount = getWrappedCursor().getColumnCount() - this.d.length;
        for (int i = 0; i < columnCount; i++) {
            int length = this.d.length + i;
            if (length < getWrappedCursor().getColumnCount()) {
                arrayList.add(getWrappedCursor().getString(length));
            } else {
                throw new IllegalArgumentException("offset out of range");
            }
        }
        HashMap hashMap = new HashMap();
        agpj[] agpjVarArr = this.e;
        if (agpjVarArr != null) {
            int i2 = 0;
            for (agpj agpjVar : agpjVarArr) {
                if (agpjVar instanceof agly) {
                    hashMap.put(((agly) agpjVar).a, Integer.valueOf(i2));
                    i2++;
                }
            }
        }
        return new aday(arrayList, hashMap);
    }

    public alog fr(agoa agoaVar) {
        throw new IllegalStateException("shouldn't get here");
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        agnw agnwVar = this.b;
        if (agnwVar == null) {
            return super.getCount();
        }
        return agnwVar.d(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        a();
        c();
        agnw agnwVar = this.b;
        if (agnwVar == null) {
            return dd();
        }
        return agnwVar.H(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        a();
        c();
        agnw agnwVar = this.b;
        if (agnwVar == null) {
            return de();
        }
        return agnwVar.I(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        a();
        c();
        agnw agnwVar = this.b;
        if (agnwVar == null) {
            return df();
        }
        return agnwVar.J(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        a();
        c();
        agnw agnwVar = this.b;
        if (agnwVar == null) {
            return dg(i);
        }
        return agnwVar.K(this, i);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        a();
        c();
        agnw agnwVar = this.b;
        if (agnwVar == null) {
            return dh();
        }
        return agnwVar.L(this);
    }
}
