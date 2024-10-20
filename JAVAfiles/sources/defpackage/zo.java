package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class zo {
    public static final zo a;
    public static final zo b;
    private static final /* synthetic */ zo[] c;

    static {
        zo zoVar = new zo("BoundReached", 0);
        a = zoVar;
        zo zoVar2 = new zo("Finished", 1);
        b = zoVar2;
        zo[] zoVarArr = {zoVar, zoVar2};
        c = zoVarArr;
        arhi.f(zoVarArr);
    }

    private zo(String str, int i) {
    }

    public static zo[] values() {
        return (zo[]) c.clone();
    }
}
