package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tv {
    public int[] a;
    public int b;

    public tv() {
        this((byte[]) null);
    }

    public final int a(int i) {
        if (i < 0 || i >= this.b) {
            a.bJ("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final int b() {
        if (this.b == 0) {
            a.bK("IntList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final int c(int i) {
        if (i < 0 || i >= this.b) {
            a.bJ("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i2 = iArr[i];
        int i3 = this.b;
        if (i != i3 - 1) {
            aqil.x(iArr, iArr, i, i + 1, i3);
        }
        this.b--;
        return i2;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (length < i) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i, (length * 3) / 2));
            copyOf.getClass();
            this.a = copyOf;
        }
    }

    public final void e(int i) {
        d(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tv) {
            tv tvVar = (tv) obj;
            int i = tvVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = tvVar.a;
                artb B = arrn.B(0, i2);
                int i3 = B.a;
                int i4 = B.b;
                if (i3 <= i4) {
                    while (iArr[i3] == iArr2[i3]) {
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

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            a.bJ("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(i3);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }

    public tv(int i) {
        this.a = i == 0 ? ua.a : new int[i];
    }

    public /* synthetic */ tv(byte[] bArr) {
        this(16);
    }
}
