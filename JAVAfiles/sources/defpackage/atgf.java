package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atgf implements Serializable {
    public static final atgf a = new atge("eras", (byte) 1);
    public static final atgf b = new atge("centuries", (byte) 2);
    public static final atgf c = new atge("weekyears", (byte) 3);
    public static final atgf d = new atge("years", (byte) 4);
    public static final atgf e = new atge("months", (byte) 5);
    public static final atgf f = new atge("weeks", (byte) 6);
    public static final atgf g = new atge("days", (byte) 7);
    public static final atgf h = new atge("halfdays", (byte) 8);
    public static final atgf i = new atge("hours", (byte) 9);
    public static final atgf j = new atge("minutes", (byte) 10);
    public static final atgf k = new atge("seconds", (byte) 11);
    public static final atgf l = new atge("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    public final String m;

    /* JADX INFO: Access modifiers changed from: protected */
    public atgf(String str) {
        this.m = str;
    }

    public abstract atgd a(atfu atfuVar);

    public final String toString() {
        return this.m;
    }
}
