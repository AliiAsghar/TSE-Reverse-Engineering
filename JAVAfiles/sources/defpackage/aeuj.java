package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuj {
    public static final aeuj a;
    public static final aeuj b;
    private static final /* synthetic */ aeuj[] c;

    static {
        aeuj aeujVar = new aeuj("DOUBLE_TAP_ORIGIN_TOUCH_GESTURE", 0);
        a = aeujVar;
        aeuj aeujVar2 = new aeuj("DOUBLE_TAP_ORIGIN_ACCESSIBILITY_ACTION", 1);
        b = aeujVar2;
        aeuj[] aeujVarArr = {aeujVar, aeujVar2};
        c = aeujVarArr;
        arhi.f(aeujVarArr);
    }

    private aeuj(String str, int i) {
    }

    public static aeuj[] values() {
        return (aeuj[]) c.clone();
    }
}
