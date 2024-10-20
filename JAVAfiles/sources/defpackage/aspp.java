package defpackage;

import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspp {
    private static aspp c;
    public int a;
    public final Object b;

    public aspp() {
        this.b = new int[10];
    }

    public static synchronized aspp t() {
        aspp asppVar;
        synchronized (aspp.class) {
            if (c == null) {
                c = new aspp((byte[]) null);
            }
            asppVar = c;
        }
        return asppVar;
    }

    public final int a(int i) {
        return ((int[]) this.b)[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 128) != 0) {
            return ((int[]) this.b)[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.a & 16) != 0) {
            return ((int[]) this.b)[4];
        }
        return Integer.MAX_VALUE;
    }

    public final void e(aspp asppVar) {
        asppVar.getClass();
        for (int i = 0; i < 10; i++) {
            if (asppVar.f(i)) {
                g(i, asppVar.a(i));
            }
        }
    }

    public final boolean f(int i) {
        if (((1 << i) & this.a) != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i, int i2) {
        if (i >= 0 && i < 10) {
            this.a = (1 << i) | this.a;
            ((int[]) this.b)[i] = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence, java.lang.Object] */
    public final int h() {
        int i = this.a;
        if (i >= 0 && i < this.b.length()) {
            char charAt = this.b.charAt(this.a);
            if (charAt >= '0' && charAt <= '9') {
                this.a++;
                return charAt - '0';
            }
            throw new IllegalArgumentException("non-digit character '" + charAt + "' [" + ((int) charAt) + "] at index " + this.a + " in: " + String.valueOf(this.b));
        }
        throw new IndexOutOfBoundsException("index '" + this.a + "' out of bounds for input: " + String.valueOf(this.b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final boolean i() {
        if (this.a < this.b.length()) {
            return true;
        }
        return false;
    }

    public final char j() {
        albo.T(m());
        Object obj = this.b;
        obj.getClass();
        return ((String) obj).charAt(this.a);
    }

    public final String k(algc algcVar) {
        boolean z;
        albo.T(m());
        int i = this.a;
        String l = l(algcVar);
        if (this.a != i) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        return l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final String l(algc algcVar) {
        ?? r0 = this.b;
        r0.getClass();
        int i = this.a;
        this.a = algcVar.f().e(r0, i);
        if (m()) {
            return ((String) this.b).substring(i, this.a);
        }
        return ((String) this.b).substring(i);
    }

    public final boolean m() {
        Object obj = this.b;
        obj.getClass();
        int i = this.a;
        if (i >= 0 && i < ((String) obj).length()) {
            return true;
        }
        return false;
    }

    public final void n(char c2) {
        boolean z;
        albo.T(m());
        if (j() == c2) {
            z = true;
        } else {
            z = false;
        }
        albo.T(z);
        this.a++;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map, java.lang.Object] */
    public final synchronized BatchedLogErrorParcelable o() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.b.values());
        int i = this.a;
        if (i > 0) {
            arrayList.add(new LogErrorParcelable("UNKNOWN", 1002, i));
            this.a = 0;
        }
        this.b.clear();
        return new BatchedLogErrorParcelable(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    public final synchronized void p(LogErrorParcelable logErrorParcelable) {
        ece eceVar = new ece(logErrorParcelable.a, Integer.valueOf(logErrorParcelable.b));
        LogErrorParcelable logErrorParcelable2 = (LogErrorParcelable) this.b.get(eceVar);
        if (logErrorParcelable2 != null) {
            logErrorParcelable2.c = albo.cS(logErrorParcelable2.c, logErrorParcelable.c);
            return;
        }
        ?? r1 = this.b;
        if (((vl) r1).d >= 100) {
            this.a = albo.cS(this.a, logErrorParcelable.c);
        } else {
            r1.put(eceVar, logErrorParcelable);
        }
    }

    public final long q(flv flvVar) {
        int i;
        int i2 = 0;
        flvVar.j(((euf) this.b).a, 0, 1);
        int i3 = ((euf) this.b).a[0] & 255;
        if (i3 != 0) {
            int i4 = 128;
            int i5 = 0;
            while (true) {
                i = i5 + 1;
                if ((i3 & i4) != 0) {
                    break;
                }
                i4 >>= 1;
                i5 = i;
            }
            int i6 = i3 & (~i4);
            flvVar.j(((euf) this.b).a, 1, i5);
            while (i2 < i5) {
                i2++;
                i6 = (((euf) this.b).a[i2] & 255) + (i6 << 8);
            }
            this.a += i;
            return i6;
        }
        return Long.MIN_VALUE;
    }

    public final Object r() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void s(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public aspp(CharSequence charSequence) {
        this.a = 0;
        this.b = charSequence;
    }

    public aspp(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new Object[256];
    }

    public aspp(char[] cArr) {
        this.b = new euf(8);
    }

    public aspp(byte[] bArr, byte[] bArr2) {
        this.b = new ReentrantLock();
    }

    private aspp(byte[] bArr) {
        this.a = 0;
        this.b = new tm();
    }
}
