package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ded {
    public static final ded a;
    public static final ded b;
    private static final /* synthetic */ ded[] c;

    static {
        ded dedVar = new ded("Shown", 0);
        a = dedVar;
        ded dedVar2 = new ded("Hidden", 1);
        b = dedVar2;
        ded[] dedVarArr = {dedVar, dedVar2};
        c = dedVarArr;
        arhi.f(dedVarArr);
    }

    private ded(String str, int i) {
    }

    public static ded[] values() {
        return (ded[]) c.clone();
    }
}
