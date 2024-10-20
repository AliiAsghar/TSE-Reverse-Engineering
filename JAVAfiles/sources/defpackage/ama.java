package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ama {
    public static final ama a;
    public static final ama b;
    private static final /* synthetic */ ama[] c;

    static {
        ama amaVar = new ama("Horizontal", 0);
        a = amaVar;
        ama amaVar2 = new ama("Vertical", 1);
        b = amaVar2;
        ama[] amaVarArr = {amaVar, amaVar2};
        c = amaVarArr;
        arhi.f(amaVarArr);
    }

    private ama(String str, int i) {
    }

    public static ama[] values() {
        return (ama[]) c.clone();
    }
}
