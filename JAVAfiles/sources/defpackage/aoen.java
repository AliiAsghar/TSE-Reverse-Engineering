package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoen<T> {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final aoep f;
    public final Set g;

    public aoen(String str, Set set, Set set2, int i, int i2, aoep aoepVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = aoepVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static aoem a(aofg aofgVar) {
        return new aoem(aofgVar, new aofg[0]);
    }

    public static aoem b(Class cls) {
        return new aoem(cls, new Class[0]);
    }

    public static aoem c(Class cls) {
        aoem b = b(cls);
        b.b = 1;
        return b;
    }

    public static aoen d(Object obj, Class cls) {
        aoem c = c(cls);
        c.c = new aoel(obj, 1);
        return c.a();
    }

    @SafeVarargs
    public static aoen e(Object obj, Class cls, Class... clsArr) {
        aoem aoemVar = new aoem(cls, clsArr);
        aoemVar.c = new aoel(obj, 0);
        return aoemVar.a();
    }

    public final boolean f() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
