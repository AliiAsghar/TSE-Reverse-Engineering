package defpackage;

import j$.util.Optional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvq implements xvu {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy MM dd HH:mm:ss.SSS", Locale.US);
    private final ykw b;
    private final adtn c;

    public xvq(ykw ykwVar, adtn adtnVar) {
        this.b = ykwVar;
        this.c = adtnVar;
    }

    private final void g() {
        ykw ykwVar = this.b;
        String l = this.c.l();
        if (!l.equals(ykwVar.f("UPSELL_PROMPT_SIM_ID", ""))) {
            this.b.n("PROMPT_COUNT");
            this.b.n("LAST_UPSELL_PROMPT_TIME");
            this.b.n("USER_ACCEPTED_UPSELL");
            this.b.l("UPSELL_PROMPT_SIM_ID", l);
        }
    }

    @Override // defpackage.xvu
    public final int a() {
        g();
        return this.b.d("PROMPT_COUNT", 0);
    }

    @Override // defpackage.xvu
    public final Optional b() {
        g();
        if (!this.b.p("LAST_UPSELL_PROMPT_TIME")) {
            return Optional.empty();
        }
        try {
            return Optional.of(a.parse(this.b.f("LAST_UPSELL_PROMPT_TIME", "")));
        } catch (ParseException unused) {
            return Optional.empty();
        }
    }

    @Override // defpackage.xvu
    public final void c() {
        g();
        this.b.j("PROMPT_COUNT", a() + 1);
    }

    @Override // defpackage.xvu
    public final void d(Date date) {
        g();
        this.b.l("LAST_UPSELL_PROMPT_TIME", a.format(date));
    }

    @Override // defpackage.xvu
    public final void e(boolean z) {
        g();
        this.b.h("USER_ACCEPTED_UPSELL", z);
    }

    @Override // defpackage.xvu
    public final boolean f() {
        g();
        return this.b.q("USER_ACCEPTED_UPSELL", false);
    }
}
