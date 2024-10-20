package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qrk implements qrh {
    public static final /* synthetic */ int a = 0;
    private static final utz b = uuh.k(uuh.b, "phone_number_min_match_guesser_max_length", 15);
    private final anen c;
    private final agnq d;

    public qrk(anen anenVar, agnq agnqVar) {
        this.c = anenVar;
        this.d = agnqVar;
    }

    @Override // defpackage.qrh
    public final akul a() {
        return aktp.ai(new mig(this, 19), this.c);
    }

    @Override // defpackage.qrh
    public final Optional b() {
        return (Optional) this.d.c("guessPhoneNumber", new fep(((Integer) b.e()).intValue(), 2));
    }
}
