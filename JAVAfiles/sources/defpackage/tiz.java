package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tiz {
    public static final tiz a;
    public static final tiz b;
    public static final tiz c;
    private static final /* synthetic */ tiz[] d;

    static {
        tiz tizVar = new tiz("COPIED", 0);
        a = tizVar;
        tiz tizVar2 = new tiz("RESTORED", 1);
        b = tizVar2;
        tiz tizVar3 = new tiz("FAILED", 2);
        c = tizVar3;
        tiz[] tizVarArr = {tizVar, tizVar2, tizVar3};
        d = tizVarArr;
        arhi.f(tizVarArr);
    }

    private tiz(String str, int i) {
    }

    public static tiz[] values() {
        return (tiz[]) d.clone();
    }
}
