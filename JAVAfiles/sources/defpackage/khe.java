package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class khe {
    public static final khe a;
    public static final khe b;
    public static final khe c;
    private static final /* synthetic */ khe[] d;

    static {
        khe kheVar = new khe("NONE", 0);
        a = kheVar;
        khe kheVar2 = new khe("SINGLE_SELECT", 1);
        b = kheVar2;
        khe kheVar3 = new khe("MULTI_SELECT", 2);
        c = kheVar3;
        khe[] kheVarArr = {kheVar, kheVar2, kheVar3};
        d = kheVarArr;
        arhi.f(kheVarArr);
    }

    private khe(String str, int i) {
    }

    public static khe[] values() {
        return (khe[]) d.clone();
    }
}
