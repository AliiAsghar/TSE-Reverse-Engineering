package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anuj extends RuntimeException {
    public anuj(String str) {
        super(str);
    }

    public static Object a(anui anuiVar) {
        try {
            return anuiVar.a();
        } catch (Exception e) {
            throw new anuj(e);
        }
    }

    public anuj(String str, Throwable th) {
        super(str, th);
    }

    public anuj(Throwable th) {
        super(th);
    }
}
