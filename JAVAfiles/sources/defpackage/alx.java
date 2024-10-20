package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alx {
    public static final alx a;
    public static final alx b;
    private static final /* synthetic */ alx[] c;

    static {
        alx alxVar = new alx("Min", 0);
        a = alxVar;
        alx alxVar2 = new alx("Max", 1);
        b = alxVar2;
        alx[] alxVarArr = {alxVar, alxVar2};
        c = alxVarArr;
        arhi.f(alxVarArr);
    }

    private alx(String str, int i) {
    }

    public static alx[] values() {
        return (alx[]) c.clone();
    }
}
