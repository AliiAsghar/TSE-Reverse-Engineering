package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
final class I3 {
    public static final I3 MAYBE_MORE;
    public static final I3 NO_MORE;
    public static final I3 UNLIMITED;
    private static final /* synthetic */ I3[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.util.stream.I3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j$.util.stream.I3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.util.stream.I3] */
    static {
        ?? r3 = new Enum("NO_MORE", 0);
        NO_MORE = r3;
        ?? r4 = new Enum("MAYBE_MORE", 1);
        MAYBE_MORE = r4;
        ?? r5 = new Enum("UNLIMITED", 2);
        UNLIMITED = r5;
        a = new I3[]{r3, r4, r5};
    }

    public static I3 valueOf(String str) {
        return (I3) Enum.valueOf(I3.class, str);
    }

    public static I3[] values() {
        return (I3[]) a.clone();
    }
}
