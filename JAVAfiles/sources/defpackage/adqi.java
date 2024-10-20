package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum adqi {
    OK("ok"),
    ERROR("error");

    private final String d;

    adqi(String str) {
        this.d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
