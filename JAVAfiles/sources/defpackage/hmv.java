package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmv {
    public static final hmv a;
    public static final hmv b;
    public static final hmv c;
    public static final hmv d;
    private static final /* synthetic */ hmv[] e;

    static {
        hmv hmvVar = new hmv("CLEARED", 0);
        a = hmvVar;
        hmv hmvVar2 = new hmv("RUNNING", 1);
        b = hmvVar2;
        hmv hmvVar3 = new hmv("SUCCEEDED", 2);
        c = hmvVar3;
        hmv hmvVar4 = new hmv("FAILED", 3);
        d = hmvVar4;
        hmv[] hmvVarArr = {hmvVar, hmvVar2, hmvVar3, hmvVar4};
        e = hmvVarArr;
        arhi.f(hmvVarArr);
    }

    private hmv(String str, int i) {
    }

    public static hmv[] values() {
        return (hmv[]) e.clone();
    }
}
