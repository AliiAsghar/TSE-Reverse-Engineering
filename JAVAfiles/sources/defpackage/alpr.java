package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alpr extends alns {
    Object[] d;
    private int e;

    public alpr() {
        super(4);
    }

    public alpt g() {
        alpt j;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (this.d != null && alpt.d(i) == this.d.length) {
                    int i2 = this.b;
                    Object[] objArr = this.a;
                    if (alpt.w(i2, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i2);
                    }
                    j = new altg(objArr, this.e, this.d, r6.length - 1, this.b);
                } else {
                    j = alpt.j(this.b, this.a);
                    this.b = j.size();
                }
                this.c = true;
                this.d = null;
                return j;
            }
            Object obj = this.a[0];
            obj.getClass();
            return new altx(obj);
        }
        return altg.a;
    }

    @Override // defpackage.alns, defpackage.alnt
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int d = alpt.d(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (d <= length) {
                objArr.getClass();
                int hashCode = obj.hashCode();
                int bf = alzz.bf(hashCode);
                while (true) {
                    Object[] objArr2 = this.d;
                    int i = bf & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += hashCode;
                        super.b(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        bf = i + 1;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void i(Object... objArr) {
        if (this.d != null) {
            for (Object obj : objArr) {
                c(obj);
            }
            return;
        }
        super.d(objArr);
    }

    public final void j(Iterable iterable) {
        iterable.getClass();
        if (this.d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            return;
        }
        super.e(iterable);
    }

    public final void k(alpr alprVar) {
        if (this.d != null) {
            for (int i = 0; i < alprVar.b; i++) {
                Object obj = alprVar.a[i];
                obj.getClass();
                c(obj);
            }
            return;
        }
        a(alprVar.a, alprVar.b);
    }

    public alpr(int i) {
        super(i);
        this.d = new Object[alpt.d(i)];
    }
}
