package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjl extends atgc {
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final atjj i;

    private atjl(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, atjj atjjVar) {
        super(str);
        this.e = jArr;
        this.f = iArr;
        this.g = iArr2;
        this.h = strArr;
        this.i = atjjVar;
    }

    public static atjl n(DataInput dataInput, String str) {
        atjj atjjVar;
        int readUnsignedByte;
        int readUnsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        int[] iArr = new int[readInt];
        int[] iArr2 = new int[readInt];
        String[] strArr2 = new String[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = atow.m(dataInput);
            iArr[i2] = (int) atow.m(dataInput);
            iArr2[i2] = (int) atow.m(dataInput);
            if (readUnsignedShort < 256) {
                try {
                    readUnsignedByte = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IOException("Invalid encoding");
                }
            } else {
                readUnsignedByte = dataInput.readUnsignedShort();
            }
            strArr2[i2] = strArr[readUnsignedByte];
        }
        if (dataInput.readBoolean()) {
            atjjVar = new atjj(str, (int) atow.m(dataInput), atjm.c(dataInput), atjm.c(dataInput));
        } else {
            atjjVar = null;
        }
        return new atjl(str, jArr, iArr, iArr2, strArr2, atjjVar);
    }

    @Override // defpackage.atgc
    public final int a(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.f[binarySearch];
        }
        int i = ~binarySearch;
        if (i < jArr.length) {
            if (i > 0) {
                return this.f[i - 1];
            }
            return 0;
        }
        atjj atjjVar = this.i;
        if (atjjVar == null) {
            return this.f[i - 1];
        }
        return atjjVar.a(j);
    }

    @Override // defpackage.atgc
    public final int c(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.g[binarySearch];
        }
        int i = ~binarySearch;
        if (i < jArr.length) {
            if (i > 0) {
                return this.g[i - 1];
            }
            return 0;
        }
        atjj atjjVar = this.i;
        if (atjjVar == null) {
            return this.g[i - 1];
        }
        return atjjVar.e;
    }

    @Override // defpackage.atgc
    public final long e(long j) {
        int i;
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            i = binarySearch + 1;
        } else {
            i = ~binarySearch;
        }
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        atjj atjjVar = this.i;
        if (atjjVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return atjjVar.e(j);
    }

    @Override // defpackage.atgc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof atjl) {
            atjl atjlVar = (atjl) obj;
            if (this.c.equals(atjlVar.c) && Arrays.equals(this.e, atjlVar.e) && Arrays.equals(this.h, atjlVar.h) && Arrays.equals(this.f, atjlVar.f) && Arrays.equals(this.g, atjlVar.g)) {
                atjj atjjVar = this.i;
                atjj atjjVar2 = atjlVar.i;
                if (atjjVar != null ? atjjVar.equals(atjjVar2) : atjjVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.atgc
    public final long f(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            if (j <= Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return j - 1;
        }
        int i = ~binarySearch;
        if (i < jArr.length) {
            if (i > 0) {
                long j2 = jArr[i - 1];
                if (j2 > Long.MIN_VALUE) {
                    return j2 - 1;
                }
            }
            return j;
        }
        atjj atjjVar = this.i;
        if (atjjVar != null) {
            long f = atjjVar.f(j);
            if (f < j) {
                return f;
            }
        }
        long j3 = jArr[i - 1];
        if (j3 > Long.MIN_VALUE) {
            return j3 - 1;
        }
        return j;
    }

    @Override // defpackage.atgc
    public final String g(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.h[binarySearch];
        }
        int i = ~binarySearch;
        if (i < jArr.length) {
            if (i > 0) {
                return this.h[i - 1];
            }
            return "UTC";
        }
        atjj atjjVar = this.i;
        if (atjjVar == null) {
            return this.h[i - 1];
        }
        return atjjVar.g(j);
    }

    @Override // defpackage.atgc
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.atgc
    public final boolean k() {
        return false;
    }
}
