package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_RcsDestinationId;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atkv {
    public int a;
    public Object b;

    public atkv() {
        this.b = new byte[32];
        this.a = 0;
    }

    private final void v(int i) {
        Object obj = this.b;
        int length = ((byte[]) obj).length;
        int i2 = this.a;
        if (length - i2 >= i) {
            return;
        }
        int i3 = length + length;
        int i4 = i + i2;
        if (i3 < i4) {
            i3 = i4;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(obj, 0, bArr, 0, i2);
        this.b = bArr;
    }

    private static final void w(long j, int i) {
        if (j >= 0 && j <= (1 << i)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(j);
        stringBuffer.append(" out of range for ");
        stringBuffer.append(i);
        stringBuffer.append(" bit value");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public final void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    public final void b(byte[] bArr, int i, int i2) {
        v(i2);
        System.arraycopy(bArr, i, this.b, this.a, i2);
        this.a += i2;
    }

    public final void c(byte[] bArr) {
        int length = bArr.length;
        if (length <= 255) {
            v(length + 1);
            Object obj = this.b;
            int i = this.a;
            this.a = i + 1;
            ((byte[]) obj)[i] = (byte) length;
            b(bArr, 0, length);
            return;
        }
        throw new IllegalArgumentException("Invalid counted string");
    }

    public final void d(int i) {
        w(i, 16);
        v(2);
        Object obj = this.b;
        int i2 = this.a;
        int i3 = i2 + 1;
        this.a = i3;
        byte[] bArr = (byte[]) obj;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        this.a = i2 + 2;
        bArr[i3] = (byte) (i & 255);
    }

    public final void e(int i, int i2) {
        w(i, 16);
        if (i2 <= this.a - 2) {
            byte[] bArr = (byte[]) this.b;
            bArr[i2] = (byte) ((i >>> 8) & 255);
            bArr[i2 + 1] = (byte) (i & 255);
            return;
        }
        throw new IllegalArgumentException("cannot write past end of data");
    }

    public final void f(long j) {
        w(j, 32);
        v(4);
        Object obj = this.b;
        int i = this.a;
        int i2 = i + 1;
        this.a = i2;
        byte[] bArr = (byte[]) obj;
        bArr[i] = (byte) ((j >>> 24) & 255);
        int i3 = i + 2;
        this.a = i3;
        bArr[i2] = (byte) ((j >>> 16) & 255);
        int i4 = i + 3;
        this.a = i4;
        bArr[i3] = (byte) ((j >>> 8) & 255);
        this.a = i + 4;
        bArr[i4] = (byte) (j & 255);
    }

    public final void g(int i) {
        w(i, 8);
        v(1);
        Object obj = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        ((byte[]) obj)[i2] = (byte) (i & 255);
    }

    public final byte[] h() {
        int i = this.a;
        byte[] bArr = new byte[i];
        System.arraycopy(this.b, 0, bArr, 0, i);
        return bArr;
    }

    public final RcsDestinationId i() {
        Object obj;
        int i = this.a;
        if (i != 0 && (obj = this.b) != null) {
            return new AutoValue_RcsDestinationId(i, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" id");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void k(int i) {
        if (i != 0) {
            this.a = i;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final ajpu l() {
        Object obj;
        int i = this.a;
        if (i != 0 && (obj = this.b) != null) {
            return new ajoz(i, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" id");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void m(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void n(int i) {
        if (i != 0) {
            this.a = i;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final addz o() {
        Object obj;
        int i = this.a;
        if (i != 0 && (obj = this.b) != null) {
            return new addz(i, (adrc) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" action");
        }
        if (this.b == null) {
            sb.append(" session");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void p(adrc adrcVar) {
        if (adrcVar != null) {
            this.b = adrcVar;
            return;
        }
        throw new NullPointerException("Null session");
    }

    public final mxw q() {
        Object obj;
        int i = this.a;
        if (i != 0 && (obj = this.b) != null) {
            return new mxw(i, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" text");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void r(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    public final long s(int i) {
        if (i >= 0 && i < this.a) {
            return ((long[]) this.b)[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
    }

    public final void t(long j) {
        int i = this.a;
        long[] jArr = (long[]) this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        Object obj = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        ((long[]) obj)[i2] = j;
    }

    public final void u(long[] jArr) {
        int i = this.a;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = (long[]) this.b;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i2));
        }
        System.arraycopy(jArr, 0, this.b, this.a, length);
        this.a = i2;
    }

    public atkv(byte[] bArr) {
    }

    public atkv(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(32);
    }

    public atkv(int i) {
        this.b = new long[i];
    }
}
