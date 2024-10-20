package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yby {
    public static final xze a = xze.g("Bugle", "VerifiedSmsConstellationClient");
    public final ybz b;

    public yby(ybz ybzVar) {
        this.b = ybzVar;
    }

    public final akul a() {
        boolean z;
        boolean booleanValue;
        ybz ybzVar = this.b;
        Boolean bool = ybzVar.d;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (ybzVar.c.h(ybzVar.b, 12200000) == 0) {
                z = true;
            } else {
                z = false;
            }
            ybzVar.d = Boolean.valueOf(z);
            xyo a2 = ybz.a.a();
            a2.H("Google Play Service for C11N");
            a2.z("available", ybzVar.d);
            a2.q();
            booleanValue = ybzVar.d.booleanValue();
        }
        if (!booleanValue) {
            a.q("Google Play Service is not available, couldn't get Constellation phone number(s).");
            int i = alog.d;
            return aktp.ag(alsx.a);
        }
        a.l("Requesting all phone numbers from Constellation...");
        return akul.g(d.m(new uqe(this, 6)));
    }
}
