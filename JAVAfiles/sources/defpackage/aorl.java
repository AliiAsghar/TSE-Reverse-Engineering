package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aorl {
    public static final aori a;

    static {
        aori aorjVar;
        try {
            aorjVar = new aork();
        } catch (ReflectiveOperationException unused) {
            aorjVar = new aorj();
        }
        a = aorjVar;
    }

    public static RuntimeException a(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException b(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String c(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        i(constructor, sb);
        return sb.toString();
    }

    public static String d(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String e(AccessibleObject accessibleObject, boolean z) {
        String concat;
        if (accessibleObject instanceof Field) {
            concat = "field '" + d((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            i(method, sb);
            String sb2 = sb.toString();
            concat = "method '" + method.getDeclaringClass().getName() + "#" + sb2 + "'";
        } else if (accessibleObject instanceof Constructor) {
            concat = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            concat = "<unknown AccessibleObject> ".concat(String.valueOf(accessibleObject.toString()));
        }
        if (z && Character.isLowerCase(concat.charAt(0))) {
            return Character.toUpperCase(concat.charAt(0)) + concat.substring(1);
        }
        return concat;
    }

    public static String f(Exception exc) {
        String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            return "\nSee ".concat(aotl.q(str));
        }
        return "";
    }

    public static void g(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new aooe("Failed making " + e(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + f(e), e);
        }
    }

    public static boolean h(Class cls) {
        if (Modifier.isStatic(cls.getModifiers())) {
            return false;
        }
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            return false;
        }
        return true;
    }

    private static void i(AccessibleObject accessibleObject, StringBuilder sb) {
        Class<?>[] parameterTypes;
        sb.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }
}
