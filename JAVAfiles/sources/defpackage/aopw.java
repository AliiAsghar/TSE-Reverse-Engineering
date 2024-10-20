package defpackage;

import com.google.gson.internal.bind.ObjectTypeAdapter$1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aopw extends aoon {
    public static final aooo a = new ObjectTypeAdapter$1(1);
    private final aonx b;
    private final int c;

    public aopw(aonx aonxVar, int i) {
        this.b = aonxVar;
        this.c = i;
    }

    private final Object c(aoro aoroVar, int i) {
        int i2 = i - 1;
        if (i2 != 5) {
            if (i2 != 6) {
                if (i2 != 7) {
                    if (i2 == 8) {
                        aoroVar.p();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(d.C(i)));
                }
                return Boolean.valueOf(aoroVar.s());
            }
            return aotl.y(this.c, aoroVar);
        }
        return aoroVar.j();
    }

    private static final Object e(aoro aoroVar, int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                return null;
            }
            aoroVar.m();
            return new aopi();
        }
        aoroVar.l();
        return new ArrayList();
    }

    @Override // defpackage.aoon
    public final Object a(aoro aoroVar) {
        String str;
        Object obj;
        int t = aoroVar.t();
        Object e = e(aoroVar, t);
        if (e == null) {
            return c(aoroVar, t);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aoroVar.r()) {
                if (e instanceof Map) {
                    str = aoroVar.h();
                } else {
                    str = null;
                }
                int t2 = aoroVar.t();
                Object e2 = e(aoroVar, t2);
                if (e2 == null) {
                    obj = c(aoroVar, t2);
                } else {
                    obj = e2;
                }
                if (e instanceof List) {
                    ((List) e).add(obj);
                } else {
                    ((Map) e).put(str, obj);
                }
                if (e2 != null) {
                    arrayDeque.addLast(e);
                    e = obj;
                }
            } else {
                if (e instanceof List) {
                    aoroVar.n();
                } else {
                    aoroVar.o();
                }
                if (arrayDeque.isEmpty()) {
                    return e;
                }
                e = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.aoon
    public final void b(aorp aorpVar, Object obj) {
        if (obj == null) {
            aorpVar.j();
            return;
        }
        aoon b = this.b.b(obj.getClass());
        if (b instanceof aopw) {
            aorpVar.f();
            aorpVar.h();
        } else {
            b.b(aorpVar, obj);
        }
    }
}
