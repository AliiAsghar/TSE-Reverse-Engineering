package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m implements p, CopyOption {
    public static final m NOFOLLOW_LINKS;
    private static final /* synthetic */ m[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.nio.file.m] */
    static {
        ?? r1 = new Enum("NOFOLLOW_LINKS", 0);
        NOFOLLOW_LINKS = r1;
        a = new m[]{r1};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) a.clone();
    }
}
