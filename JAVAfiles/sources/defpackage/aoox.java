package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoox implements aopj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aoox(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [aonz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [aonz, java.lang.Object] */
    @Override // defpackage.aopj
    public final Object a() {
        switch (this.b) {
            case 0:
                return this.a.a();
            case 1:
                try {
                    return aopr.c.a((Class) this.a);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to create instance of " + String.valueOf(this.a) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
                }
            case 2:
                return this.a.a();
            case 3:
                throw new aooe((String) this.a);
            case 4:
                throw new aooe((String) this.a);
            case 5:
                Object obj = this.a;
                if (obj instanceof ParameterizedType) {
                    Type type = ((ParameterizedType) obj).getActualTypeArguments()[0];
                    if (type instanceof Class) {
                        return EnumSet.noneOf((Class) type);
                    }
                    throw new aooe("Invalid EnumSet type: ".concat(String.valueOf(this.a.toString())));
                }
                throw new aooe("Invalid EnumSet type: ".concat(String.valueOf(obj.toString())));
            case 6:
                Object obj2 = this.a;
                if (obj2 instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) obj2).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return new EnumMap((Class) type2);
                    }
                    throw new aooe("Invalid EnumMap type: ".concat(String.valueOf(this.a.toString())));
                }
                throw new aooe("Invalid EnumMap type: ".concat(String.valueOf(obj2.toString())));
            case 7:
                throw new aooe((String) this.a);
            case 8:
                throw new aooe((String) this.a);
            default:
                try {
                    return ((Constructor) this.a).newInstance(null);
                } catch (IllegalAccessException e2) {
                    throw aorl.b(e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException(a.bW(aorl.c((Constructor) this.a), "Failed to invoke constructor '", "' with no args"), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(a.bW(aorl.c((Constructor) this.a), "Failed to invoke constructor '", "' with no args"), e4.getCause());
                }
        }
    }
}
