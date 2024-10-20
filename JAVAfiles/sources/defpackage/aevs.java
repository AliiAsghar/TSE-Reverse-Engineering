package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevs {
    public static final aevs a;
    public static final aevs b;
    private static final /* synthetic */ aevs[] c;

    static {
        aevs aevsVar = new aevs("NONE", 0);
        a = aevsVar;
        aevs aevsVar2 = new aevs("VERIFIED", 1);
        b = aevsVar2;
        aevs[] aevsVarArr = {aevsVar, aevsVar2};
        c = aevsVarArr;
        arhi.f(aevsVarArr);
    }

    private aevs(String str, int i) {
    }

    public static aevs[] values() {
        return (aevs[]) c.clone();
    }
}
