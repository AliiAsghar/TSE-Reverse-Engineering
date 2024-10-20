package defpackage;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enn {
    public Object a;
    public Object b;

    public enn() {
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [enk, java.lang.Object] */
    public final void a(enm enmVar, enf enfVar) {
        eng a = enfVar.a();
        this.a = dyw.h((eng) this.a, a);
        this.b.dH(enmVar, enfVar);
        this.a = a;
    }

    public final void b() {
        Object obj = this.b;
        if (obj != null) {
            Arrays.fill((int[]) obj, -1);
        }
        this.a = null;
    }

    public final void c(int i) {
        Object obj = this.b;
        if (obj == null) {
            int[] iArr = new int[Math.max(i, 10) + 1];
            this.b = iArr;
            Arrays.fill(iArr, -1);
            return;
        }
        int[] iArr2 = (int[]) obj;
        int length = iArr2.length;
        if (i >= length) {
            while (length <= i) {
                length += length;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            int length2 = iArr2.length;
            System.arraycopy(obj, 0, iArr3, 0, length2);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    public final void d(int i, int i2) {
        Object obj = this.b;
        if (obj != null && i < ((int[]) obj).length) {
            int i3 = i + i2;
            c(i3);
            Object obj2 = this.b;
            System.arraycopy(obj2, i, obj2, i3, (((int[]) obj2).length - i) - i2);
            Arrays.fill((int[]) this.b, i, i3, -1);
            ?? r0 = this.a;
            if (r0 != 0) {
                for (int size = r0.size() - 1; size >= 0; size--) {
                    pl plVar = (pl) this.a.get(size);
                    int i4 = plVar.a;
                    if (i4 >= i) {
                        plVar.a = i4 + i2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List, java.lang.Object] */
    public final void e(int i, int i2) {
        Object obj = this.b;
        if (obj != null && i < ((int[]) obj).length) {
            int i3 = i + i2;
            c(i3);
            Object obj2 = this.b;
            System.arraycopy(obj2, i3, obj2, i, (((int[]) obj2).length - i) - i2);
            int[] iArr = (int[]) this.b;
            int length = iArr.length;
            Arrays.fill(iArr, length - i2, length, -1);
            ?? r1 = this.a;
            if (r1 != 0) {
                for (int size = r1.size() - 1; size >= 0; size--) {
                    pl plVar = (pl) this.a.get(size);
                    int i4 = plVar.a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.a.remove(size);
                        } else {
                            plVar.a = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public enn(enl enlVar, eng engVar) {
        Object eoaVar;
        engVar.getClass();
        enr enrVar = enr.a;
        boolean z = enlVar instanceof enk;
        boolean z2 = enlVar instanceof emx;
        if (z && z2) {
            eoaVar = new emy((emx) enlVar, (enk) enlVar);
        } else if (z2) {
            eoaVar = new emy((emx) enlVar, null);
        } else if (z) {
            eoaVar = (enk) enlVar;
        } else {
            Class<?> cls = enlVar.getClass();
            if (enr.a.a(cls) == 2) {
                Object obj = enr.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    eoaVar = new eoh(enr.b((Constructor) list.get(0), enlVar), 2);
                } else {
                    int size = list.size();
                    ena[] enaVarArr = new ena[size];
                    for (int i = 0; i < size; i++) {
                        enaVarArr[i] = enr.b((Constructor) list.get(i), enlVar);
                    }
                    eoaVar = new eoh(enaVarArr, 1);
                }
            } else {
                eoaVar = new eoa(enlVar);
            }
        }
        this.b = eoaVar;
        this.a = engVar;
    }
}
