package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class algn implements algk {
    public static final algn a;
    private static final /* synthetic */ algn[] b;

    static {
        algn algnVar = new algn();
        a = algnVar;
        b = new algn[]{algnVar};
    }

    private algn() {
    }

    public static algn[] values() {
        return (algn[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        return obj;
    }
}
