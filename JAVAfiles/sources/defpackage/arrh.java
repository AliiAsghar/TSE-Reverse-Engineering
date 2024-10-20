package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arrh implements artf, arrg {
    public static final Map a;
    public static final HashMap b;
    public static final Map c;
    private static final HashMap d;
    private static final HashMap e;
    private final Class f;

    static {
        int i = 0;
        List B = aqjn.B(arqg.class, arqr.class, arqv.class, arqw.class, arqx.class, arqy.class, arqz.class, arra.class, arrb.class, arrc.class, arqh.class, arqi.class, arqj.class, arqk.class, arql.class, arqm.class, arqn.class, arqo.class, arqp.class, arqq.class, arqs.class, arqt.class, arqu.class);
        ArrayList arrayList = new ArrayList(aqjn.J(B, 10));
        for (Object obj : B) {
            int i2 = i + 1;
            if (i < 0) {
                aqjn.G();
            }
            arrayList.add(new armo((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = aqjn.q(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG, "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        values.getClass();
        for (String str : values) {
            str.getClass();
            armo armoVar = new armo("kotlin.jvm.internal." + arsd.ae(str) + "CompanionObject", str.concat(".Companion"));
            hashMap3.put(armoVar.a, armoVar.b);
        }
        for (Map.Entry entry : a.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        b = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aqjn.i(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), arsd.ae((String) entry2.getValue()));
        }
        c = linkedHashMap;
    }

    public arrh(Class cls) {
        cls.getClass();
        this.f = cls;
    }

    @Override // defpackage.arrg
    public final Class a() {
        return this.f;
    }

    @Override // defpackage.artf
    public final String b() {
        String str;
        Class cls = this.f;
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) b.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "kotlin.Array";
            }
            return str2;
        }
        String str3 = (String) b.get(cls.getName());
        if (str3 == null) {
            return cls.getCanonicalName();
        }
        return str3;
    }

    @Override // defpackage.artf
    public final String c() {
        String str;
        Class cls = this.f;
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                simpleName.getClass();
                return arsd.J(simpleName, String.valueOf(enclosingMethod.getName()).concat("$"), simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                simpleName.getClass();
                return arsd.J(simpleName, String.valueOf(enclosingConstructor.getName()).concat("$"), simpleName);
            }
            simpleName.getClass();
            return arsd.I(simpleName, '$', simpleName);
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) c.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) c.get(cls.getName());
        if (str3 == null) {
            return cls.getSimpleName();
        }
        return str3;
    }

    @Override // defpackage.artf
    public final boolean d(Object obj) {
        Map map = a;
        map.getClass();
        Class cls = this.f;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return arsd.d(obj, num.intValue());
        }
        if (cls.isPrimitive()) {
            cls = armd.e(armd.f(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof arrh) && d.F(armd.e(this), armd.e((artf) obj))) {
            return true;
        }
        return false;
    }

    @Override // defpackage.artf
    public final int hashCode() {
        return armd.e(this).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f.toString()).concat(" (Kotlin reflection is not available)");
    }
}
