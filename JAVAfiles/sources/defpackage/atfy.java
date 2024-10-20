package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atfy implements Serializable {
    public static final atfy b = new atfx("era", (byte) 1, atgf.a);
    public static final atfy c;
    public static final atfy d;
    public static final atfy e;
    public static final atfy f;
    public static final atfy g;
    public static final atfy h;
    public static final atfy i;
    public static final atfy j;
    public static final atfy k;
    public static final atfy l;
    public static final atfy m;
    public static final atfy n;
    public static final atfy o;
    public static final atfy p;
    public static final atfy q;
    public static final atfy r;
    public static final atfy s;
    private static final long serialVersionUID = -42615285973990L;
    public static final atfy t;
    public static final atfy u;
    public static final atfy v;
    public static final atfy w;
    public static final atfy x;
    public final String y;

    static {
        atgf atgfVar = atgf.d;
        c = new atfx("yearOfEra", (byte) 2, atgfVar);
        d = new atfx("centuryOfEra", (byte) 3, atgf.b);
        e = new atfx("yearOfCentury", (byte) 4, atgfVar);
        f = new atfx("year", (byte) 5, atgfVar);
        atgf atgfVar2 = atgf.g;
        g = new atfx("dayOfYear", (byte) 6, atgfVar2);
        h = new atfx("monthOfYear", (byte) 7, atgf.e);
        i = new atfx("dayOfMonth", (byte) 8, atgfVar2);
        atgf atgfVar3 = atgf.c;
        j = new atfx("weekyearOfCentury", (byte) 9, atgfVar3);
        k = new atfx("weekyear", (byte) 10, atgfVar3);
        l = new atfx("weekOfWeekyear", (byte) 11, atgf.f);
        m = new atfx("dayOfWeek", (byte) 12, atgfVar2);
        n = new atfx("halfdayOfDay", (byte) 13, atgf.h);
        atgf atgfVar4 = atgf.i;
        o = new atfx("hourOfHalfday", (byte) 14, atgfVar4);
        p = new atfx("clockhourOfHalfday", (byte) 15, atgfVar4);
        q = new atfx("clockhourOfDay", (byte) 16, atgfVar4);
        r = new atfx("hourOfDay", (byte) 17, atgfVar4);
        atgf atgfVar5 = atgf.j;
        s = new atfx("minuteOfDay", (byte) 18, atgfVar5);
        t = new atfx("minuteOfHour", (byte) 19, atgfVar5);
        atgf atgfVar6 = atgf.k;
        u = new atfx("secondOfDay", (byte) 20, atgfVar6);
        v = new atfx("secondOfMinute", (byte) 21, atgfVar6);
        atgf atgfVar7 = atgf.l;
        w = new atfx("millisOfDay", (byte) 22, atgfVar7);
        x = new atfx("millisOfSecond", (byte) 23, atgfVar7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public atfy(String str) {
        this.y = str;
    }

    public abstract atfw a(atfu atfuVar);

    public final String toString() {
        return this.y;
    }
}
