package defpackage;

import android.net.Uri;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gs {
    public static final byte[] a = "from-data".getBytes();
    public static final byte[] b = "attachment".getBytes();
    public static final byte[] c = "inline".getBytes();
    public Uri e = null;
    public aozb f = null;
    public final SparseArray d = new SparseArray();

    public final int a() {
        Integer num = (Integer) this.d.get(129);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final Uri b() {
        return this.e;
    }

    public final aozb c() {
        return this.f;
    }

    public final void d(int i) {
        this.d.put(129, Integer.valueOf(i));
    }

    public final void e(byte[] bArr) {
        if (bArr != null) {
            this.d.put(197, bArr);
            return;
        }
        throw new NullPointerException("null content-disposition");
    }

    public final void f(byte[] bArr) {
        int length;
        if (bArr != null && (length = bArr.length) != 0) {
            if (length > 1 && ((char) bArr[0]) == '<' && ((char) bArr[length - 1]) == '>') {
                this.d.put(192, bArr);
                return;
            }
            byte[] bArr2 = new byte[length + 2];
            bArr2[0] = 60;
            bArr2[length + 1] = 62;
            System.arraycopy(bArr, 0, bArr2, 1, length);
            this.d.put(192, bArr2);
            return;
        }
        throw new IllegalArgumentException("Content-Id may not be null or empty.");
    }

    public final void g(byte[] bArr) {
        if (bArr != null) {
            this.d.put(142, bArr);
            return;
        }
        throw new NullPointerException("null content-location");
    }

    public final void h(byte[] bArr) {
        if (bArr != null) {
            this.d.put(145, bArr);
            return;
        }
        throw new NullPointerException("null content-type");
    }

    public final void i(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.f = aozb.w(bArr);
    }

    public final void j(byte[] bArr) {
        if (bArr != null) {
            this.d.put(152, bArr);
            return;
        }
        throw new NullPointerException("null content-id");
    }

    public final void k(byte[] bArr) {
        if (bArr != null) {
            this.d.put(151, bArr);
            return;
        }
        throw new NullPointerException("null content-id");
    }

    public final byte[] l() {
        return (byte[]) this.d.get(192);
    }

    public final byte[] m() {
        return (byte[]) this.d.get(142);
    }

    public final byte[] n() {
        return (byte[]) this.d.get(145);
    }

    public final byte[] o() {
        return (byte[]) this.d.get(152);
    }

    public final byte[] p() {
        return (byte[]) this.d.get(151);
    }
}
