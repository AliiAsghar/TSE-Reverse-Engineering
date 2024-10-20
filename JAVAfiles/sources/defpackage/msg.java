package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msg implements msh {
    private static final alvi g = alvi.m("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity");
    public final alhr a;
    public final alhr b;
    public final alhr c;
    public final alhr d;
    public final alhr e;
    final Throwable f;
    private final apwt h;
    private final alhr i;
    private final alhr j;
    private final alhr k;
    private final alhr l;
    private final alhr m;
    private final alhr n;
    private boolean o;

    public msg(apwt apwtVar, armf armfVar, msh mshVar, alhr alhrVar) {
        this.o = false;
        this.h = apwtVar;
        if (mshVar instanceof msg) {
            msg msgVar = (msg) mshVar;
            this.a = msgVar.a;
            this.c = msgVar.c;
            this.d = msgVar.d;
            this.i = msgVar.i;
            this.j = msgVar.j;
            this.e = msgVar.e;
            this.k = msgVar.k;
            this.l = msgVar.l;
            this.m = msgVar.m;
            this.b = alhrVar;
            this.f = msgVar.f;
        } else {
            this.a = new mrt(mshVar, 14);
            this.c = new mse(mshVar, 0);
            this.d = new mse(mshVar, 6);
            this.i = new mse(mshVar, 7);
            this.j = new mse(mshVar, 8);
            this.e = new mse(mshVar, 9);
            this.k = new mse(mshVar, 10);
            this.l = new mse(mshVar, 11);
            this.m = new mse(mshVar, 12);
            this.b = alhrVar;
            this.f = new RuntimeException();
        }
        this.n = new mrl(this, armfVar, 18);
    }

    private final void I(String str, alhr alhrVar, alhr alhrVar2) {
        J(str, alhrVar, alhrVar2, Function$CC.identity());
    }

    private final void J(String str, alhr alhrVar, alhr alhrVar2, Function function) {
        Object apply;
        Object apply2;
        String str2;
        if (((Boolean) aczf.o().a.ag.a()).booleanValue() && !this.o) {
            Double d = (Double) aczf.o().a.ah.a();
            double doubleValue = d.doubleValue();
            if (doubleValue <= 0.0d) {
                alvw f = g.f();
                f.X(alwp.a, "Bugle");
                ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity", "uploadShadowMetricsIfDifferent", 580, "LazyMessagingIdentity.java")).t("LazyMessagingIdentity not logging because ratio=%s%%", d);
                return;
            }
            if (doubleValue < 1.0d && ThreadLocalRandom.current().nextDouble() <= doubleValue) {
                alvw f2 = g.f();
                f2.X(alwp.a, "Bugle");
                ((alvg) ((alvg) f2).h("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity", "uploadShadowMetricsIfDifferent", 583, "LazyMessagingIdentity.java")).t("LazyMessagingIdentity not logging (ratio=%s%%)", d);
                return;
            }
            String str3 = (String) alhrVar.get();
            String str4 = (String) alhrVar2.get();
            apply = function.apply(str3);
            apply2 = function.apply(str4);
            if (Objects.equals(apply, apply2)) {
                alvw f3 = g.f();
                f3.X(alwp.a, "Bugle");
                ((alvg) ((alvg) f3).h("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity", "uploadShadowMetricsIfDifferent", 590, "LazyMessagingIdentity.java")).t("LazyMessagingIdentity not logging because both returned %s", str3);
                return;
            }
            this.o = true;
            msj msjVar = (msj) this.h.b();
            qqq b = ((qxr) msjVar.c.b()).b();
            List l = ((yjy) msjVar.d.b()).l();
            Stream map = Collection.EL.stream(l).map(new moh(msjVar, 18));
            int i = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            alog alogVar2 = (alog) Collection.EL.stream(l).map(new moh(msjVar, 19)).collect(alls.a);
            Locale b2 = yhx.b(msjVar.b);
            if (b2 != null) {
                str2 = b2.getCountry().toUpperCase(b2);
            } else {
                str2 = "";
            }
            String a = ((yjs) msjVar.e.b()).a();
            yjt a2 = msjVar.a(((yjr) msjVar.f.b()).m());
            alvw i2 = msj.a.i();
            i2.X(alwp.a, "Bugle");
            alvg alvgVar = (alvg) ((alvg) i2).g(this.f);
            alvgVar.Z(alwk.SMALL);
            alvg alvgVar2 = (alvg) alvgVar.h("com/google/android/apps/messaging/shared/api/messaging/identity/MessagingIdentityDifferenceReporter", "logDifference", 112, "MessagingIdentityDifferenceReporter.java");
            aomj aomjVar = new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, str);
            aomj b3 = msj.b(b, str3);
            aomj b4 = msj.b(b, str4);
            aomj b5 = msj.b(b, m());
            aomj aomjVar2 = new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, (String) b().map(new mqm(16)).orElse(null));
            String name = a().name();
            aomi aomiVar = aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA;
            alvgVar2.P("LazyMessagingIdentity#%s has different with flag on than flag off: off=[%s], on=[%s], raw=[%s], country=[%s], type=[%s],  localeCountryCode=[%s], networkCountryCodeDeprecated=[%s], simCallCodes=[%s], networkCallCodes=[%s], settingsCallCodeCode=[%s]", aomjVar, b3, b4, b5, aomjVar2, new aomj(aomiVar, name), new aomj(aomiVar, str2), new aomj(aomiVar, a), new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, String.valueOf(alogVar2)), new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, String.valueOf(alogVar)), new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, a2.toString()));
        }
    }

    @Override // defpackage.msh
    public final boolean A() {
        return msy.BOT.equals(a());
    }

    @Override // defpackage.msh
    public final boolean B() {
        return a().equals(msy.SATELLITE_ESP);
    }

    @Override // defpackage.msh
    public final boolean C() {
        msy a = a();
        if (!msy.PHONE_SHORT_WITH_COUNTRY.equals(a) && !msy.PHONE_SHORT_NO_COUNTRY.equals(a)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.msh
    public final boolean D() {
        if (!a().equals(msy.UNKNOWN_SENDER) && !w()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.msh
    public final boolean E() {
        msy a = a();
        if (!msy.UNKNOWN_SENDER.equals(a) && !msy.UNKNOWN_DESTINATION_TYPE.equals(a) && !w()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.msh
    @Deprecated
    public final msf F() {
        return (msf) this.c.get();
    }

    @Override // defpackage.msh
    public final msf G(boolean z) {
        I("getDisplayDestination", this.b, new mse(this, 4));
        if (z) {
            return (msf) this.c.get();
        }
        return new msf((String) this.b.get());
    }

    @Override // defpackage.msh
    public final void H() {
        i();
        m();
        F();
        c();
        n();
        e();
        a();
        b();
        f();
    }

    @Override // defpackage.msh
    public final msy a() {
        return (msy) this.k.get();
    }

    @Override // defpackage.msh
    public final Optional b() {
        return (Optional) this.l.get();
    }

    @Override // defpackage.msh
    @Deprecated
    public final Optional c() {
        return (Optional) this.d.get();
    }

    @Override // defpackage.msh
    public final Optional d(boolean z) {
        I("getInternationalDestination", this.b, new mse(this, 3));
        if (z) {
            return (Optional) this.d.get();
        }
        return Optional.ofNullable((String) this.b.get());
    }

    @Override // defpackage.msh
    public final Optional e() {
        return (Optional) this.e.get();
    }

    @Override // defpackage.msh
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msh)) {
            return false;
        }
        return Objects.equals(n(), ((msh) obj).n());
    }

    @Override // defpackage.msh
    public final Optional f() {
        return (Optional) this.m.get();
    }

    @Override // defpackage.msh
    @Deprecated
    public final String g() {
        I("getLegacyFallbackRcsDestination", this.b, new mse(this, 5));
        Optional optional = (Optional) this.e.get();
        if (optional.isPresent()) {
            return ((qei) optional.get()).d;
        }
        return (String) this.b.get();
    }

    @Override // defpackage.msh
    public final String h(boolean z) {
        if (z) {
            return g();
        }
        I("getLegacyFallbackRcsDestination", this.b, new mse(this, 2));
        return (String) this.b.get();
    }

    @Override // defpackage.msh
    public final int hashCode() {
        return n().hashCode();
    }

    @Override // defpackage.msh
    @Deprecated
    public final String i() {
        return (String) this.a.get();
    }

    @Override // defpackage.msh
    public final String j(boolean z) {
        alhr alhrVar;
        I("getLocalDestination", this.b, this.a);
        if (z) {
            alhrVar = this.a;
        } else {
            alhrVar = this.b;
        }
        return (String) alhrVar.get();
    }

    @Override // defpackage.msh
    public final String k() {
        I("getNormalizedDestination", this.b, this.i);
        return (String) this.i.get();
    }

    @Override // defpackage.msh
    public final String l(boolean z) {
        I("getNormalizedDestination", this.b, this.i);
        if (z) {
            return (String) this.i.get();
        }
        return (String) this.b.get();
    }

    @Override // defpackage.msh
    public final String m() {
        return (String) this.b.get();
    }

    @Override // defpackage.msh
    @Deprecated
    public final String n() {
        String str = (String) this.j.get();
        if (str == null) {
            return albo.ag((String) this.b.get());
        }
        return str;
    }

    @Override // defpackage.msh
    public final String o(boolean z) {
        I("getSerializationContextFormat", this.b, this.j);
        if (!z) {
            return (String) this.b.get();
        }
        return n();
    }

    @Override // defpackage.msh
    public final boolean p() {
        msy a = a();
        switch (a) {
            case UNKNOWN_DESTINATION_TYPE:
            case EMAIL:
            case BOT:
            case UNKNOWN_SENDER:
            case SATELLITE_ESP:
            case PENPAL_BOT:
            case ALPHA_SHORT_NO_COUNTRY:
            case ALPHA_SHORT_WITH_COUNTRY:
            case UNRECOGNIZED:
                return false;
            case PHONE_E164:
            case PHONE_SHORT_NO_COUNTRY:
            case PHONE_SHORT_WITH_COUNTRY:
            case PHONE_EMERGENCY:
            case PHONE_LOCAL_WITH_COUNTRY:
            case PHONE_LOCAL_NO_COUNTRY:
            case PHONE_NATIONAL:
                return true;
            default:
                throw new IllegalArgumentException("unknown destination type ".concat(String.valueOf(a.name())));
        }
    }

    @Override // defpackage.msh
    public final boolean q() {
        msy a = a();
        switch (a) {
            case UNKNOWN_DESTINATION_TYPE:
            case EMAIL:
            case BOT:
            case UNKNOWN_SENDER:
            case PHONE_SHORT_NO_COUNTRY:
            case PHONE_SHORT_WITH_COUNTRY:
            case PHONE_EMERGENCY:
            case PHONE_LOCAL_WITH_COUNTRY:
            case PHONE_LOCAL_NO_COUNTRY:
            case SATELLITE_ESP:
            case ALPHA_SHORT_NO_COUNTRY:
            case ALPHA_SHORT_WITH_COUNTRY:
            case UNRECOGNIZED:
                return false;
            case PHONE_E164:
            case PHONE_NATIONAL:
            case PENPAL_BOT:
                return true;
            default:
                throw new IllegalArgumentException("unknown destination type ".concat(String.valueOf(a.name())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.msh
    public final boolean r(Object obj, boolean z) {
        I("comparable", this.b, this.j);
        if (this == obj) {
            return true;
        }
        return Objects.equals(o(z), obj.o(z));
    }

    @Override // defpackage.msh
    public final boolean s() {
        msy a = a();
        switch (a) {
            case UNKNOWN_DESTINATION_TYPE:
            case UNKNOWN_SENDER:
            case PHONE_SHORT_NO_COUNTRY:
            case PHONE_SHORT_WITH_COUNTRY:
            case PHONE_EMERGENCY:
            case PHONE_LOCAL_NO_COUNTRY:
            case PHONE_NATIONAL:
            case ALPHA_SHORT_NO_COUNTRY:
            case ALPHA_SHORT_WITH_COUNTRY:
            case UNRECOGNIZED:
                return true;
            case PHONE_E164:
            case EMAIL:
            case BOT:
            case PHONE_LOCAL_WITH_COUNTRY:
            case SATELLITE_ESP:
            case PENPAL_BOT:
                return false;
            default:
                throw new IllegalArgumentException("unknown destination type ".concat(String.valueOf(a.name())));
        }
    }

    @Override // defpackage.msh
    public final boolean t() {
        msy a = a();
        if (!a.equals(msy.ALPHA_SHORT_WITH_COUNTRY) && !a.equals(msy.ALPHA_SHORT_NO_COUNTRY)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.msh
    public final String toString() {
        return n();
    }

    @Override // defpackage.msh
    public final boolean u() {
        return msy.EMAIL.equals(a());
    }

    @Override // defpackage.msh
    public final boolean v() {
        return ((Boolean) this.n.get()).booleanValue();
    }

    @Override // defpackage.msh
    @Deprecated
    public final boolean w() {
        return TextUtils.isEmpty((CharSequence) this.a.get());
    }

    @Override // defpackage.msh
    public final boolean x(boolean z) {
        J("isEmpty", this.b, this.a, new mqm(14));
        if (z) {
            return TextUtils.isEmpty((CharSequence) this.a.get());
        }
        return TextUtils.isEmpty((CharSequence) this.b.get());
    }

    @Override // defpackage.msh
    public final boolean y() {
        return msy.PHONE_E164.equals(a());
    }

    @Override // defpackage.msh
    public final boolean z() {
        return msy.PENPAL_BOT.equals(a());
    }

    @Deprecated
    public msg(apwt apwtVar, armf armfVar, msh mshVar, String str) {
        this.o = false;
        this.h = apwtVar;
        int i = 16;
        if (mshVar instanceof msg) {
            msg msgVar = (msg) mshVar;
            this.a = msgVar.a;
            this.c = msgVar.c;
            this.d = msgVar.d;
            this.i = msgVar.i;
            this.j = msgVar.j;
            this.e = msgVar.e;
            this.k = msgVar.k;
            this.l = msgVar.l;
            this.m = msgVar.m;
            this.b = new mrt(str, 15);
            this.f = msgVar.f;
        } else {
            this.a = new mrt(mshVar, 17);
            this.c = new mrt(mshVar, 18);
            this.d = new mrt(mshVar, 19);
            this.i = new mrt(mshVar, 20);
            this.j = new mse(mshVar, 1);
            this.e = new mse(mshVar, 9);
            this.k = new mse(mshVar, 10);
            this.l = new mse(mshVar, 11);
            this.m = new mse(mshVar, 12);
            this.b = new mrt(str, 16);
            this.f = new RuntimeException();
        }
        this.n = new mrl(this, armfVar, i);
    }

    public msg(apwt apwtVar, armf armfVar, alhr alhrVar, alhr alhrVar2, alhr alhrVar3, alhr alhrVar4, alhr alhrVar5, alhr alhrVar6, alhr alhrVar7, alhr alhrVar8, alhr alhrVar9, alhr alhrVar10) {
        this.o = false;
        this.h = apwtVar;
        this.a = alhrVar;
        this.b = alhrVar2;
        this.c = alhrVar7;
        this.d = alhrVar3;
        this.i = alhrVar4;
        this.j = alhrVar5;
        this.e = alhrVar6;
        this.k = alhrVar8;
        this.l = alhrVar9;
        this.m = alhrVar10;
        this.n = new mrl(armfVar, alhrVar, 17, null);
        this.f = new RuntimeException();
    }
}
