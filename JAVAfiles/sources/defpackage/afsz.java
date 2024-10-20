package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsz {
    public static final afsz a;
    public static final afsz b;
    public static final afsz c;
    public static final afsz d;
    private static final /* synthetic */ afsz[] e;

    static {
        afsz afszVar = new afsz("VERY_LOW", 0);
        a = afszVar;
        afsz afszVar2 = new afsz("LOW", 1);
        b = afszVar2;
        afsz afszVar3 = new afsz("HIGH", 2);
        c = afszVar3;
        afsz afszVar4 = new afsz("ORIGINAL", 3);
        d = afszVar4;
        afsz[] afszVarArr = {afszVar, afszVar2, afszVar3, afszVar4};
        e = afszVarArr;
        arhi.f(afszVarArr);
    }

    private afsz(String str, int i) {
    }

    public static afsz[] values() {
        return (afsz[]) e.clone();
    }
}
