package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum adxo {
    OPEN("open"),
    CLOSED("closed");

    public final String c;

    adxo(String str) {
        this.c = str;
    }

    public static adxo a(String str) {
        adxo[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].c.equalsIgnoreCase(str)) {
                return values[i];
            }
        }
        return null;
    }
}
