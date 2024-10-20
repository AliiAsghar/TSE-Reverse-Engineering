package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bub {
    public static final bub a;
    public static final bub b;
    private static final /* synthetic */ bub[] c;

    static {
        bub bubVar = new bub("Filled", 0);
        a = bubVar;
        bub bubVar2 = new bub("Outlined", 1);
        b = bubVar2;
        bub[] bubVarArr = {bubVar, bubVar2};
        c = bubVarArr;
        arhi.f(bubVarArr);
    }

    private bub(String str, int i) {
    }

    public static bub[] values() {
        return (bub[]) c.clone();
    }
}
