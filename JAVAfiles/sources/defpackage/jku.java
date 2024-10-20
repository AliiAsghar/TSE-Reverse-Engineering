package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jku {
    public static final jku a;
    public static final jku b;
    private static final /* synthetic */ jku[] c;

    static {
        jku jkuVar = new jku("OPTIMIZED", 0);
        a = jkuVar;
        jku jkuVar2 = new jku("ORIGINAL", 1);
        b = jkuVar2;
        jku[] jkuVarArr = {jkuVar, jkuVar2};
        c = jkuVarArr;
        arhi.f(jkuVarArr);
    }

    private jku(String str, int i) {
    }

    public static jku[] values() {
        return (jku[]) c.clone();
    }
}
