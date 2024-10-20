package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alyr extends alxt {
    public static final alxt a = new alyr();

    private alyr() {
    }

    @Override // defpackage.alxt
    public final alvr a(Class<?> cls, int i) {
        StackTraceElement a2 = alzv.a(cls, i + 1);
        if (a2 != null) {
            return new alwj(a2);
        }
        return alvr.a;
    }

    @Override // defpackage.alxt
    public final String b(Class<? extends aluw<?>> cls) {
        StackTraceElement a2 = alzv.a(cls, 1);
        if (a2 != null) {
            return a2.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
