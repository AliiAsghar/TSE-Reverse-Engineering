package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aijk {
    public static final aijk a;
    private static final /* synthetic */ aijk[] b;
    private final String c = "IN";

    static {
        aijk aijkVar = new aijk();
        a = aijkVar;
        b = new aijk[]{aijkVar};
    }

    private aijk() {
    }

    public static aijk[] values() {
        return (aijk[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
