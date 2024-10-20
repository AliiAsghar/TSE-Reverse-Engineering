package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vn {
    public static final Object a = new Object();

    public static final Object a(vm vmVar, int i) {
        Object obj;
        int a2 = vp.a(vmVar.b, vmVar.d, i);
        if (a2 >= 0 && (obj = vmVar.c[a2]) != a) {
            return obj;
        }
        return null;
    }

    public static final void b(vm vmVar) {
        int i = vmVar.d;
        int[] iArr = vmVar.b;
        Object[] objArr = vmVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        vmVar.a = false;
        vmVar.d = i2;
    }
}
