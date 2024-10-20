package defpackage;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aopy extends aoon {
    private final aoqb a;

    public aopy(aoqb aoqbVar) {
        this.a = aoqbVar;
    }

    @Override // defpackage.aoon
    public final Object a(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        Object c = c();
        Map map = this.a.b;
        try {
            aoroVar.m();
            while (aoroVar.r()) {
                aopz aopzVar = (aopz) map.get(aoroVar.h());
                if (aopzVar == null) {
                    aoroVar.q();
                } else {
                    f(c, aoroVar, aopzVar);
                }
            }
            aoroVar.o();
            return e(c);
        } catch (IllegalAccessException e) {
            throw aorl.b(e);
        } catch (IllegalStateException e2) {
            throw new aook(e2);
        }
    }

    @Override // defpackage.aoon
    public final void b(aorp aorpVar, Object obj) {
        Object obj2;
        if (obj == null) {
            aorpVar.j();
            return;
        }
        aorpVar.f();
        try {
            for (aopz aopzVar : this.a.c) {
                if (aopzVar.d) {
                    Method method = aopzVar.e;
                    if (method == null) {
                        ReflectiveTypeAdapterFactory.b(obj, aopzVar.b);
                    } else {
                        ReflectiveTypeAdapterFactory.b(obj, method);
                    }
                }
                Method method2 = aopzVar.e;
                if (method2 != null) {
                    try {
                        obj2 = method2.invoke(obj, null);
                    } catch (InvocationTargetException e) {
                        throw new aooe(a.bW(aorl.e(aopzVar.e, false), "Accessor ", " threw exception"), e.getCause());
                    }
                } else {
                    obj2 = aopzVar.b.get(obj);
                }
                if (obj2 != obj) {
                    aorpVar.i(aopzVar.a);
                    aopzVar.f.b(aorpVar, obj2);
                }
            }
            aorpVar.h();
        } catch (IllegalAccessException e2) {
            throw aorl.b(e2);
        }
    }

    public abstract Object c();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, aoro aoroVar, aopz aopzVar);
}
