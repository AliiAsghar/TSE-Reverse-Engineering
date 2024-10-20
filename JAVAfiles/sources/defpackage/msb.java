package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msb implements mre {
    public static final alwo a = alwo.o("Bugle");
    public final Context b;
    public final apwt c;
    public final apwt d;
    public final apwt e;
    public final apwt f;
    public final apwt g;
    private final apwt h;
    private final apwt i;
    private final apwt j;

    public msb(Context context, apwt apwtVar, apwt apwtVar2, apwt apwtVar3, apwt apwtVar4, apwt apwtVar5, apwt apwtVar6, apwt apwtVar7, apwt apwtVar8) {
        this.b = context;
        this.h = apwtVar;
        this.c = apwtVar2;
        this.d = apwtVar3;
        this.e = apwtVar4;
        this.i = apwtVar5;
        this.f = apwtVar6;
        this.g = apwtVar7;
        this.j = apwtVar8;
    }

    public static aomj o(qqq qqqVar, yjt yjtVar) {
        String str;
        if (yjtVar != null) {
            str = yjtVar.toString();
        } else {
            str = null;
        }
        return new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, s(qqqVar, str));
    }

    public static aomj p(qqq qqqVar, alog alogVar) {
        Stream map = Collection.EL.stream(alogVar).map(new moh(qqqVar, 15));
        int i = alog.d;
        return new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, ((alog) map.collect(alls.a)).toString());
    }

    public static aomj q(qqq qqqVar, String str) {
        return new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, qqqVar.a(String.valueOf(str)).c);
    }

    public static aomj r(qqq qqqVar, String str) {
        return new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, s(qqqVar, str));
    }

    public static String s(qqq qqqVar, String str) {
        if (str == null) {
            return "null";
        }
        if (yyb.an(str)) {
            return "AUTO";
        }
        return qqqVar.b(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh a(String str) {
        return l(this.h.b().a(str), new mrl(this, str, 15));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh b(qei qeiVar) {
        return l(this.h.b().b(qeiVar), new mrl(this, qeiVar, 13));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh c(String str, alhr alhrVar) {
        return l(this.h.b().c(str, alhrVar), new mri(this, str, alhrVar, 12, null));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh d(adit aditVar) {
        return l(this.h.b().d(aditVar), new mrl(this, aditVar, 14));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh e(final String str, final String str2, final String str3, final boolean z, final String str4, final alhr alhrVar) {
        return l(this.h.b().e(str, str2, str3, z, str4, alhrVar), new alhr() { // from class: mrz
            /* JADX WARN: Type inference failed for: r1v0, types: [mre, java.lang.Object] */
            @Override // defpackage.alhr
            public final Object get() {
                return msb.this.c.b().e(str, str2, str3, z, str4, alhrVar);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh f() {
        return l(this.h.b().f(), new mrt(this, 13));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh g(msh mshVar, alhr alhrVar) {
        return l(this.h.b().g(mshVar, alhrVar), new mri(this, mshVar, alhrVar, 10));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh h(msh mshVar, String str) {
        return l(this.h.b().h(mshVar, str), new mri(this, mshVar, str, 11));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh i(msh mshVar, boolean z) {
        return l(this.h.b().i(mshVar, z), new mry(this, mshVar, z, 0));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh j(msh mshVar, int i) {
        return l(this.h.b().j(mshVar, i), new mrm(this, mshVar, i, 2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mre, java.lang.Object] */
    @Override // defpackage.mre
    public final msh k(msh mshVar) {
        return l(this.h.b().k(mshVar), new mrl(this, mshVar, 12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final msh l(msh mshVar, alhr alhrVar) {
        alhr D = albo.D(alhrVar);
        msa msaVar = new msa();
        return ((lxe) this.j.b()).j(n("local", new mqm(3), mshVar, D, msaVar), n("raw", new mqm(4), mshVar, D, msaVar), n("international", new mqm(5), mshVar, D, msaVar), n("legacy_normalized", new mqm(6), mshVar, D, msaVar), n("comparable", new mqm(7), mshVar, D, msaVar), n("rcsIdentifier", new mqm(8), mshVar, D, msaVar), n("display", new mqm(9), mshVar, D, msaVar), n(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new mqm(10), mshVar, D, msaVar), n("callCode", new mqm(11), mshVar, D, msaVar), n("regionCode", new mqm(12), mshVar, D, msaVar));
    }

    public final yjt m(String str) {
        if (str != null && str.length() == 2) {
            return new yjt(((anhn) this.i.b()).a(str.toUpperCase(Locale.US)));
        }
        return new yjt(0);
    }

    final alhr n(final String str, final Function function, final msh mshVar, final alhr alhrVar, final Throwable th) {
        return albo.D(new alhr() { // from class: mrx
            @Override // defpackage.alhr
            public final Object get() {
                Object apply;
                Object apply2;
                String str2;
                Function function2 = function;
                msh mshVar2 = mshVar;
                apply = function2.apply(mshVar2);
                Double d = (Double) aczf.o().a.af.a();
                double doubleValue = d.doubleValue();
                if (doubleValue < 1.0d) {
                    if (doubleValue <= 0.0d) {
                        ((alwl) msb.a.n().h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "shouldDoShadowAnalysis", 267, "CsMessagingIdentityFactoryV2ShadowImpl.java")).q("CsMessagingIdentityFactoryV2ShadowImpl not logging because ratio=0%");
                    } else if (ThreadLocalRandom.current().nextDouble() >= doubleValue) {
                        ((alwl) msb.a.n().h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "shouldDoShadowAnalysis", 274, "CsMessagingIdentityFactoryV2ShadowImpl.java")).t("CsMessagingIdentityFactoryV2ShadowImpl not logging (ratio=%s%%)", d);
                    }
                    return apply;
                }
                msh mshVar3 = (msh) alhrVar.get();
                apply2 = function2.apply(mshVar3);
                if (!Objects.equals(apply, apply2)) {
                    msb msbVar = msb.this;
                    String valueOf = String.valueOf(apply);
                    String valueOf2 = String.valueOf(apply2);
                    qqq b = ((qxr) msbVar.d.b()).b();
                    List l = ((yjy) msbVar.e.b()).l();
                    Stream map = Collection.EL.stream(l).map(new moh(msbVar, 16));
                    int i = alog.d;
                    alog alogVar = (alog) map.collect(alls.a);
                    alog alogVar2 = (alog) Collection.EL.stream(l).map(new moh(msbVar, 17)).collect(alls.a);
                    Locale b2 = yhx.b(msbVar.b);
                    if (b2 != null) {
                        str2 = b2.getCountry().toUpperCase(b2);
                    } else {
                        str2 = "";
                    }
                    Throwable th2 = th;
                    String str3 = str;
                    String a2 = ((yjs) msbVar.f.b()).a();
                    yjt m = msbVar.m(((yjr) msbVar.g.b()).m());
                    alwl alwlVar = (alwl) msb.a.i();
                    alwlVar.V(2, TimeUnit.SECONDS);
                    alwl alwlVar2 = (alwl) alwlVar.g(th2);
                    alwlVar2.Z(alwk.SMALL);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "logMiDifference", 311, "CsMessagingIdentityFactoryV2ShadowImpl.java")).P("MessagingIdentityV2#%s has different result than MessagingIdentityV1: v2{getter=[%s], raw=[%s], local=[%s], country=[%s], type=[%s]}.  v1{getter=[%s], raw=[%s], local=[%s], country=[%s], type=[%s]}.  localeCountryCode=[%s], networkCountryCodeDeprecated=[%s], simCountryCodes=[%s], networkCountryCodes=[%s], settingsCountryCode=[%s]", new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, str3), msb.q(b, valueOf2), msb.q(b, mshVar3.m()), msb.q(b, mshVar3.i()), msb.o(b, (yjt) mshVar3.b().orElse(null)), new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, mshVar3.a().name()), msb.q(b, valueOf), msb.q(b, mshVar2.m()), msb.q(b, mshVar2.i()), msb.o(b, (yjt) mshVar2.b().orElse(null)), new aomj(aomi.CONFIRMED_UPLOAD_SAFE_USER_DATA, mshVar2.a().name()), msb.r(b, str2), msb.r(b, a2), msb.p(b, alogVar2), msb.p(b, alogVar), msb.o(b, m));
                    return apply;
                }
                ((alwl) msb.a.n().h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryV2ShadowImpl", "shadowGet", 251, "CsMessagingIdentityFactoryV2ShadowImpl.java")).t("CsMessagingIdentityFactoryV2ShadowImpl not logging because both returned %s", apply);
                return apply;
            }
        });
    }
}
