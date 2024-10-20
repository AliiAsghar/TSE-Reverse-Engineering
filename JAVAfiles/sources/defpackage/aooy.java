package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aooy {
    private final Map a;
    private final List b;

    public aooy(Map map, List list) {
        this.a = map;
        this.b = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(String.valueOf(cls.getName()));
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + aotl.q("r8-abstract-class");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.String, java.lang.Exception] */
    public final aopj a(aorn aornVar) {
        aoox aooxVar;
        aoox aooxVar2;
        String str;
        aoow aoowVar;
        Map map = this.a;
        Type type = aornVar.b;
        aonz aonzVar = (aonz) map.get(type);
        if (aonzVar != null) {
            return new aoox(aonzVar, 0);
        }
        Class cls = aornVar.a;
        aonz aonzVar2 = (aonz) this.a.get(cls);
        if (aonzVar2 == null) {
            if (EnumSet.class.isAssignableFrom(cls)) {
                aooxVar = new aoox(type, 5);
            } else if (cls == EnumMap.class) {
                aooxVar = new aoox(type, 6);
            } else {
                aooxVar = null;
            }
            if (aooxVar != null) {
                return aooxVar;
            }
            int u = aotl.u(this.b);
            if (Modifier.isAbstract(cls.getModifiers())) {
                aooxVar2 = null;
            } else {
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                    if (u != 1 && (!aotl.t(declaredConstructor, null) || (u == 4 && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                        aooxVar2 = new aoox(hht.b(cls, "Unable to invoke no-args constructor of ", "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."), 7);
                    } else {
                        if (u == 1) {
                            aori aoriVar = aorl.a;
                            try {
                                declaredConstructor.setAccessible(true);
                                str = null;
                            } catch (Exception e) {
                                ?? c = aorl.c(declaredConstructor);
                                str = "Failed making constructor '" + ((String) c) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + c.getMessage() + aorl.f(c);
                            }
                            if (str != null) {
                                aooxVar2 = new aoox(str, 8);
                            } else {
                                u = 1;
                            }
                        }
                        aooxVar2 = new aoox(declaredConstructor, 9);
                    }
                } catch (NoSuchMethodException unused) {
                    aooxVar2 = null;
                }
            }
            if (aooxVar2 == null) {
                if (Collection.class.isAssignableFrom(cls)) {
                    if (SortedSet.class.isAssignableFrom(cls)) {
                        aoowVar = new aoow(1);
                    } else if (Set.class.isAssignableFrom(cls)) {
                        aoowVar = new aoow(0);
                    } else if (Queue.class.isAssignableFrom(cls)) {
                        aoowVar = new aoow(2);
                    } else {
                        aoowVar = new aoow(3);
                    }
                } else if (Map.class.isAssignableFrom(cls)) {
                    if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                        aoowVar = new aoow(4);
                    } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                        aoowVar = new aoow(5);
                    } else if (SortedMap.class.isAssignableFrom(cls)) {
                        aoowVar = new aoow(6);
                    } else if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(new aorn(((ParameterizedType) type).getActualTypeArguments()[0]).a)) {
                        aoowVar = new aoow(7);
                    } else {
                        aoowVar = new aoow(8);
                    }
                } else {
                    aoowVar = null;
                }
                if (aoowVar != null) {
                    return aoowVar;
                }
                String b = b(cls);
                if (b != null) {
                    return new aoox(b, 3);
                }
                if (u == 1) {
                    return new aoox(cls, 1);
                }
                return new aoox(hht.b(cls, "Unable to create instance of ", "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."), 4);
            }
            return aooxVar2;
        }
        return new aoox(aonzVar2, 2);
    }

    public final String toString() {
        return this.a.toString();
    }
}
