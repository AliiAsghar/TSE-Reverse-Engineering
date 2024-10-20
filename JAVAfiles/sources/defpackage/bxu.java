package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxu {
    public static final bxu a;
    public static final bxu b;
    public static final bxu c;
    public static final bxu d;
    private static final /* synthetic */ bxu[] e;

    static {
        bxu bxuVar = new bxu("IGNORED", 0);
        a = bxuVar;
        bxu bxuVar2 = new bxu("SCHEDULED", 1);
        b = bxuVar2;
        bxu bxuVar3 = new bxu("DEFERRED", 2);
        c = bxuVar3;
        bxu bxuVar4 = new bxu("IMMINENT", 3);
        d = bxuVar4;
        bxu[] bxuVarArr = {bxuVar, bxuVar2, bxuVar3, bxuVar4};
        e = bxuVarArr;
        arhi.f(bxuVarArr);
    }

    private bxu(String str, int i) {
    }

    public static bxu[] values() {
        return (bxu[]) e.clone();
    }
}
