package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahay {
    public static Object a(String str, Object obj) {
        try {
            return Class.forName("com.google.android.libraries.inputmethod.staticflag.AllFlags").getDeclaredField(str).get(null);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return obj;
        }
    }
}
