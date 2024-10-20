package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class chy {
    public static final chy a;
    public static final chy b;
    public static final chy c;
    public static final chy d;
    private static final /* synthetic */ chy[] e;

    static {
        chy chyVar = new chy("None", 0);
        a = chyVar;
        chy chyVar2 = new chy("Cancelled", 1);
        b = chyVar2;
        chy chyVar3 = new chy("Redirected", 2);
        c = chyVar3;
        chy chyVar4 = new chy("RedirectCancelled", 3);
        d = chyVar4;
        chy[] chyVarArr = {chyVar, chyVar2, chyVar3, chyVar4};
        e = chyVarArr;
        arhi.f(chyVarArr);
    }

    private chy(String str, int i) {
    }

    public static chy[] values() {
        return (chy[]) e.clone();
    }
}
