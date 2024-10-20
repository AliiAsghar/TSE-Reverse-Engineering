package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afdy {
    public static final afdy a;
    public static final afdy b;
    private static final /* synthetic */ afdy[] c;

    static {
        afdy afdyVar = new afdy("MINIMUM", 0);
        a = afdyVar;
        afdy afdyVar2 = new afdy("MAXIMUM", 1);
        b = afdyVar2;
        afdy[] afdyVarArr = {afdyVar, afdyVar2};
        c = afdyVarArr;
        arhi.f(afdyVarArr);
    }

    private afdy(String str, int i) {
    }

    public static afdy[] values() {
        return (afdy[]) c.clone();
    }
}
