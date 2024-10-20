package defpackage;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoqc extends aopy {
    static final Map a;
    private final Constructor b;
    private final Object[] c;
    private final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(brg.a));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, false);
        a = hashMap;
    }

    public aoqc(Class cls, aoqb aoqbVar, boolean z) {
        super(aoqbVar);
        this.d = new HashMap();
        Constructor a2 = aorl.a.a(cls);
        this.b = a2;
        if (z) {
            ReflectiveTypeAdapterFactory.b(null, a2);
        } else {
            aorl.g(a2);
        }
        String[] d = aorl.a.d(cls);
        for (int i = 0; i < d.length; i++) {
            this.d.put(d[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = a.get(parameterTypes[i2]);
        }
    }

    @Override // defpackage.aopy
    public final /* bridge */ /* synthetic */ Object c() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.aopy
    public final /* bridge */ /* synthetic */ void f(Object obj, aoro aoroVar, aopz aopzVar) {
        Object[] objArr = (Object[]) obj;
        Integer num = (Integer) this.d.get(aopzVar.c);
        if (num != null) {
            aoon aoonVar = aopzVar.g;
            int intValue = num.intValue();
            Object a2 = aoonVar.a(aoroVar);
            if (a2 == null && aopzVar.h) {
                throw new aooh("null is not allowed as value for record component '" + aopzVar.c + "' of primitive type; at path " + aoroVar.e());
            }
            objArr[intValue] = a2;
            return;
        }
        Constructor constructor = this.b;
        String str = aopzVar.c;
        throw new IllegalStateException("Could not find the index in the constructor '" + aorl.c(constructor) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.aopy
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object e(Object[] objArr) {
        try {
            return this.b.newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw aorl.b(e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + aorl.c(this.b) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + aorl.c(this.b) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + aorl.c(this.b) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }
}
