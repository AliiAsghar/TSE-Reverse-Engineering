package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqf {
    public static final bqf a;
    public static final bqf b;
    public static final bqf c;
    private static final /* synthetic */ bqf[] d;

    static {
        bqf bqfVar = new bqf("Short", 0);
        a = bqfVar;
        bqf bqfVar2 = new bqf("Long", 1);
        b = bqfVar2;
        bqf bqfVar3 = new bqf("Indefinite", 2);
        c = bqfVar3;
        bqf[] bqfVarArr = {bqfVar, bqfVar2, bqfVar3};
        d = bqfVarArr;
        arhi.f(bqfVarArr);
    }

    private bqf(String str, int i) {
    }

    public static bqf[] values() {
        return (bqf[]) d.clone();
    }
}
