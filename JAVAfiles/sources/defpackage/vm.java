package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vm implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public vm() {
        this(null);
    }

    public final int a(int i) {
        if (this.a) {
            vn.b(this);
        }
        return vp.a(this.b, this.d, i);
    }

    public final int b(int i) {
        if (this.a) {
            vn.b(this);
        }
        return this.b[i];
    }

    public final int c() {
        if (this.a) {
            vn.b(this);
        }
        return this.d;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final vm clone() {
        Object clone = super.clone();
        clone.getClass();
        vm vmVar = (vm) clone;
        vmVar.b = (int[]) this.b.clone();
        vmVar.c = (Object[]) this.c.clone();
        return vmVar;
    }

    public final Object e(int i) {
        if (this.a) {
            vn.b(this);
        }
        return this.c[i];
    }

    public final void f(int i, Object obj) {
        int a = vp.a(this.b, this.d, i);
        if (a >= 0) {
            this.c[a] = obj;
            return;
        }
        int i2 = ~a;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == vn.a) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            vn.b(this);
            i2 = ~vp.a(this.b, this.d, i);
        }
        int i4 = this.d;
        int[] iArr = this.b;
        if (i4 >= iArr.length) {
            int d = vp.d(i4 + 1);
            int[] copyOf = Arrays.copyOf(iArr, d);
            copyOf.getClass();
            this.b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c, d);
            copyOf2.getClass();
            this.c = copyOf2;
        }
        int i5 = this.d;
        if (i5 - i2 != 0) {
            int[] iArr2 = this.b;
            int i6 = i2 + 1;
            aqil.x(iArr2, iArr2, i6, i2, i5);
            Object[] objArr2 = this.c;
            aqil.y(objArr2, objArr2, i6, i2, this.d);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object e = e(i2);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ vm(byte[] bArr) {
        int d = vp.d(10);
        this.b = new int[d];
        this.c = new Object[d];
    }
}
