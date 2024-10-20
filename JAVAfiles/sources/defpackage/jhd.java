package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhd {
    public static final jhd a;
    public static final jhd b;
    public static final jhd c;
    public static final jhd d;
    private static final /* synthetic */ jhd[] e;

    static {
        jhd jhdVar = new jhd("EMOJI", 0);
        a = jhdVar;
        jhd jhdVar2 = new jhd("GIFS", 1);
        b = jhdVar2;
        jhd jhdVar3 = new jhd("STICKERS", 2);
        c = jhdVar3;
        jhd jhdVar4 = new jhd("EMOTIFY", 3);
        d = jhdVar4;
        jhd[] jhdVarArr = {jhdVar, jhdVar2, jhdVar3, jhdVar4};
        e = jhdVarArr;
        arhi.f(jhdVarArr);
    }

    private jhd(String str, int i) {
    }

    public static jhd[] values() {
        return (jhd[]) e.clone();
    }
}
