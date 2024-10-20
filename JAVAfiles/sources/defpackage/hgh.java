package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum hgh {
    JSON(".json"),
    ZIP(".zip");

    public final String c;

    hgh(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
