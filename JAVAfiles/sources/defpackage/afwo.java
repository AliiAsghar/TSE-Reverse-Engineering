package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwo {
    public static final afwo a;
    public static final afwo b;
    private static final /* synthetic */ afwo[] c;

    static {
        afwo afwoVar = new afwo("SEARCH", 0);
        a = afwoVar;
        afwo afwoVar2 = new afwo("BACK", 1);
        b = afwoVar2;
        afwo[] afwoVarArr = {afwoVar, afwoVar2};
        c = afwoVarArr;
        arhi.f(afwoVarArr);
    }

    private afwo(String str, int i) {
    }

    public static afwo[] values() {
        return (afwo[]) c.clone();
    }
}
