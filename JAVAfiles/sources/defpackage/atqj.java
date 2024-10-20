package defpackage;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class atqj {
    public static final atqj a;
    public final Constructor b;

    static {
        atqj atqjVar;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            atqjVar = new atqi();
        } else {
            atqjVar = new atqj();
        }
        a = atqjVar;
    }

    public atqj() {
        Constructor constructor = null;
        try {
            constructor = bl$$ExternalSyntheticApiModelOutline0.m112m$2().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.b = constructor;
    }

    public Executor a() {
        return null;
    }
}
