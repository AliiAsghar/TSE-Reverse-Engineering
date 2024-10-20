package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cm {
    public static final /* synthetic */ int a = 0;
    private static final vl b = new vl();

    public static Class a(ClassLoader classLoader, String str) {
        vl vlVar = b;
        vl vlVar2 = (vl) vlVar.get(classLoader);
        if (vlVar2 == null) {
            vlVar2 = new vl();
            vlVar.put(classLoader, vlVar2);
        }
        Class cls = (Class) vlVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            vlVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public cg b(String str) {
        throw null;
    }
}
