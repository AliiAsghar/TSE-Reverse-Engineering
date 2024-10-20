package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anyx {
    public static final anyx a = new anyx("SHA256");
    public static final anyx b = new anyx("SHA384");
    public static final anyx c = new anyx("SHA512");
    private final String d;

    private anyx(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
