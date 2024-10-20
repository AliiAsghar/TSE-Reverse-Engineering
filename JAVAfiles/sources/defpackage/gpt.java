package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpt {
    public static final gpt a = new gpt(gpp.b, gps.b, gps.b);
    public final gpp b;
    public final gps c;
    public final gps d;

    static {
        new gpt(gpp.b, gps.b, gps.c);
        new gpt(gpp.a, gps.c, gps.b);
        new gpt(gpp.d, gps.b, gps.c);
        new gpt(gpp.c, gps.c, gps.b);
    }

    public gpt(gpp gppVar, gps gpsVar, gps gpsVar2) {
        gppVar.getClass();
        gpsVar.getClass();
        gpsVar2.getClass();
        this.b = gppVar;
        this.c = gpsVar;
        this.d = gpsVar2;
    }

    public static final gqt c(gqz gqzVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : gqzVar.a) {
            if (obj instanceof gqt) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (gqt) arrayList.get(0);
        }
        return null;
    }

    public final boolean a(gqz gqzVar) {
        if (!d.F(this.d, gps.c)) {
            return false;
        }
        gqt c = c(gqzVar);
        if (c != null && d.F(c.b(), gqq.b) && !aqjn.B(gpp.a, gpp.c).contains(this.b)) {
            return false;
        }
        return true;
    }

    public final boolean b(gqz gqzVar) {
        if (!d.F(this.c, gps.c)) {
            return false;
        }
        gqt c = c(gqzVar);
        if (c != null && d.F(c.b(), gqq.a) && !aqjn.B(gpp.b, gpp.d).contains(this.b)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpt)) {
            return false;
        }
        gpt gptVar = (gpt) obj;
        if (d.F(this.b, gptVar.b) && d.F(this.c, gptVar.c) && d.F(this.d, gptVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.e * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Bounds:{alignment=" + this.b + ", width=" + this.c + ", height=" + this.d + '}';
    }
}
