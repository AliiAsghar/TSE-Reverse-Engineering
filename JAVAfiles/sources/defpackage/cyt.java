package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyt {
    public static final cyt a;
    public static final cyt b;
    private static final /* synthetic */ cyt[] c;

    static {
        cyt cytVar = new cyt("Width", 0);
        a = cytVar;
        cyt cytVar2 = new cyt("Height", 1);
        b = cytVar2;
        cyt[] cytVarArr = {cytVar, cytVar2};
        c = cytVarArr;
        arhi.f(cytVarArr);
    }

    private cyt(String str, int i) {
    }

    public static cyt[] values() {
        return (cyt[]) c.clone();
    }
}
