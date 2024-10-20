package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ux {
    public Object[] a;
    public int b;

    public ux() {
        this((byte[]) null);
    }

    public final int a(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.a;
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Object b(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" must be in 0..");
            sb.append(this.b - 1);
            a.bJ(sb.toString());
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        int i2 = this.b;
        if (i != i2 - 1) {
            aqil.y(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void c() {
        aqil.d(this.a, null, 0, this.b);
        this.b = 0;
    }

    public final void d(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, (length * 3) / 2));
            copyOf.getClass();
            this.a = copyOf;
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ux) {
            ux uxVar = (ux) obj;
            int i = uxVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = uxVar.a;
                artb B = arrn.B(0, i2);
                int i3 = B.a;
                int i4 = B.b;
                if (i3 <= i4) {
                    while (d.F(objArr[i3], objArr2[i3])) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 += i * 31;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        rh rhVar = new rh(this, 3);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                Object obj = objArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) rhVar.a(obj));
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }

    public ux(int i) {
        this.a = new Object[i];
    }

    public /* synthetic */ ux(byte[] bArr) {
        this(16);
    }
}
