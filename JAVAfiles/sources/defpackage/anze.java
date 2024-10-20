package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anze {
    public static final anze a = new anze("SHA256");
    public static final anze b = new anze("SHA384");
    public static final anze c = new anze("SHA512");
    private final String d;

    private anze(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
