package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhn {
    public static final bhn a;
    public static final bhn b;
    public static final bhn c;
    private static final /* synthetic */ bhn[] d;

    static {
        bhn bhnVar = new bhn("Short", 0);
        a = bhnVar;
        bhn bhnVar2 = new bhn("Long", 1);
        b = bhnVar2;
        bhn bhnVar3 = new bhn("Indefinite", 2);
        c = bhnVar3;
        bhn[] bhnVarArr = {bhnVar, bhnVar2, bhnVar3};
        d = bhnVarArr;
        arhi.f(bhnVarArr);
    }

    private bhn(String str, int i) {
    }

    public static bhn[] values() {
        return (bhn[]) d.clone();
    }
}
