package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wnq {
    public static final xze a = xze.g("Bugle", "OtpUtils");
    public final alog b;
    public final anen c;
    private final anen d;

    public wnq(uub uubVar, Set set, anen anenVar, anen anenVar2) {
        uubVar.a();
        this.b = alog.n(set);
        this.d = anenVar;
        this.c = anenVar2;
    }

    public final akul a(String str, int i, int i2) {
        akul i3;
        akrh e = aktp.e("OtpUtils.processIfOtp");
        try {
            if (i2 >= this.b.size()) {
                i3 = aktp.ag(false);
            } else {
                wnp wnpVar = (wnp) this.b.get(i2);
                i3 = aktp.ai(new vze(wnpVar, str, 9), this.c).i(new wno(this, wnpVar, str, i, i2, 0), this.d);
            }
            e.close();
            return i3;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
