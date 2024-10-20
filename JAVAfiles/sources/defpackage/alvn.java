package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alvn extends alxa {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(alvz alvzVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(alvzVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.alxa
    public final int b() {
        return this.b;
    }

    @Override // defpackage.alxa
    public final alvz c(int i) {
        if (i < this.b) {
            return (alvz) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.alxa
    public final Object d(alvz alvzVar) {
        int a = a(alvzVar);
        if (a != -1) {
            return alvzVar.c(this.a[a + a + 1]);
        }
        return null;
    }

    @Override // defpackage.alxa
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(alvz alvzVar, Object obj) {
        int a;
        if (!alvzVar.b && (a = a(alvzVar)) != -1) {
            obj.getClass();
            this.a[a + a + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i + i > length) {
            this.a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 + i2;
        alvzVar.getClass();
        objArr2[i3] = alvzVar;
        obj.getClass();
        objArr2[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
