package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.f3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class EnumC0138f3 {
    public static final EnumC0138f3 OP;
    public static final EnumC0138f3 SPLITERATOR;
    public static final EnumC0138f3 STREAM;
    public static final EnumC0138f3 TERMINAL_OP;
    public static final EnumC0138f3 UPSTREAM_TERMINAL_OP;
    private static final /* synthetic */ EnumC0138f3[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, j$.util.stream.f3] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.util.stream.f3] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.util.stream.f3] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, j$.util.stream.f3] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, j$.util.stream.f3] */
    static {
        ?? r5 = new Enum("SPLITERATOR", 0);
        SPLITERATOR = r5;
        ?? r6 = new Enum("STREAM", 1);
        STREAM = r6;
        ?? r7 = new Enum("OP", 2);
        OP = r7;
        ?? r8 = new Enum("TERMINAL_OP", 3);
        TERMINAL_OP = r8;
        ?? r9 = new Enum("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = r9;
        a = new EnumC0138f3[]{r5, r6, r7, r8, r9};
    }

    public static EnumC0138f3 valueOf(String str) {
        return (EnumC0138f3) Enum.valueOf(EnumC0138f3.class, str);
    }

    public static EnumC0138f3[] values() {
        return (EnumC0138f3[]) a.clone();
    }
}
