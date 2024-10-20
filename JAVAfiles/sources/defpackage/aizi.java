package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizi {
    protected final Context a;
    public final String b;
    protected final String c;
    protected final String d;
    public aoij e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private aquc g;
    private String h;
    private final asqc i;

    public aizi(Context context, String str, String str2, String str3, asqc asqcVar) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.i = asqcVar;
    }

    static aquo f() {
        return new aquj("Cookie", aqut.c);
    }

    public final void a(int i) {
        if (this.e != null) {
            this.f.post(new ebm(this, i, 18));
        } else {
            Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
        }
    }

    public final aizc b(apqf apqfVar) {
        String str = apqfVar.g;
        apri apriVar = apqfVar.d;
        if (apriVar == null) {
            apriVar = apri.a;
        }
        apri apriVar2 = apriVar;
        String str2 = this.b;
        if (!TextUtils.isEmpty(str2)) {
            if (apriVar2 != null) {
                aprx aprxVar = apqfVar.c;
                if (aprxVar == null) {
                    aprxVar = aprx.a;
                }
                aprx aprxVar2 = aprxVar;
                String str3 = apqfVar.e;
                long currentTimeMillis = System.currentTimeMillis();
                alog n = alog.n(apqfVar.f);
                if (currentTimeMillis != 0) {
                    return new aizc(str2, str, currentTimeMillis, aprxVar2, apriVar2, str3, n);
                }
                throw new IllegalStateException("Trigger time is not set");
            }
            throw new IllegalArgumentException("Payload is null.");
        }
        throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.alce c() {
        /*
            r7 = this;
            android.content.Context r0 = r7.a
            java.lang.String r1 = r7.c
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "GoogleAuthProviderImpl"
            r4 = 0
            if (r2 == 0) goto L14
            java.lang.String r0 = "Account was not set."
            android.util.Log.w(r3, r0)
        L12:
            r0 = r4
            goto L48
        L14:
            albx r2 = new albx     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            android.accounts.Account r5 = new android.accounts.Account     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            java.lang.String r6 = "com.google"
            r5.<init>(r1, r6)     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            r1.<init>()     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            java.lang.String r6 = "oauth2:https://www.googleapis.com/auth/supportcontent"
            defpackage.abkw.e(r5)     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            com.google.android.gms.auth.TokenData r0 = defpackage.abkw.a(r0, r5, r6, r1)     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            java.lang.String r0 = r0.b     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            r2.<init>(r0, r4)     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            aiyu r0 = new aiyu     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            alce r1 = defpackage.alce.d(r2)     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            r0.<init>(r1)     // Catch: java.lang.Exception -> L3a com.google.android.gms.auth.UserRecoverableAuthException -> L41
            goto L48
        L3a:
            r0 = move-exception
            java.lang.String r1 = "Exception occurred while getting auth credentials"
            android.util.Log.e(r3, r1, r0)
            goto L12
        L41:
            r0 = move-exception
            java.lang.String r1 = "User recoverable exception happened while getting authentication token. You need to allowlist your application."
            android.util.Log.e(r3, r1, r0)
            goto L12
        L48:
            boolean r1 = r0 instanceof defpackage.aiyu
            if (r1 == 0) goto L4f
            alce r0 = r0.a
            return r0
        L4f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizi.c():alce");
    }

    public final aqrs d(alce alceVar) {
        String str;
        ahmn ahmnVar;
        try {
            long j = aizr.a;
            if (TextUtils.isEmpty(this.h) && (ahmnVar = aiyw.a.c) != null) {
                this.h = ahmnVar.d();
            }
            this.g = aqyv.j(aiyw.a.a(), 443, (CronetEngine) this.i.a).a();
            String str2 = this.h;
            aqut aqutVar = new aqut();
            ahnz ahnzVar = aizp.c;
            if (aizp.b(aqqi.a.get().b(aizp.b))) {
                if (alceVar == null && !TextUtils.isEmpty(str2)) {
                    aqutVar.h(f(), str2);
                }
            } else {
                aqutVar.h(f(), str2);
            }
            if (!TextUtils.isEmpty(this.d)) {
                aqutVar.h(new aquj("X-Goog-Api-Key", aqut.c), this.d);
            }
            Context context = this.a;
            try {
                str = aizr.d(context.getPackageManager().getPackageInfo(context.getPackageName(), 64));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("SurveyUtils", "Package not found.", e);
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                aqutVar.h(new aquj("X-Android-Cert", aqut.c), str);
            }
            String packageName = this.a.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                aqutVar.h(new aquj("X-Android-Package", aqut.c), packageName);
            }
            aqutVar.h(new aquj("Authority", aqut.c), aiyw.a.a());
            return apsd.r(this.g, new arll(aqutVar, 0));
        } catch (Exception e2) {
            Log.e("NetworkCallerGrpc", "Could not get managed channel.", e2);
            e();
            return null;
        }
    }

    public final void e() {
        aquc aqucVar = this.g;
        if (aqucVar != null) {
            aqucVar.d();
        }
    }

    public final void g(apqe apqeVar, apqf apqfVar, asgf asgfVar) {
        Runnable maaVar;
        if (apqfVar == null) {
            Log.e("SurveyNetworkConnection", "Survey trigger response was null for trigger id: ".concat(String.valueOf(this.b)));
            a(2);
            return;
        }
        apri apriVar = apqfVar.d;
        if (apriVar == null) {
            apriVar = apri.a;
        }
        if (apriVar.g.size() == 0) {
            a(3);
            return;
        }
        long j = aizr.a;
        if (this.e != null) {
            apri apriVar2 = apqfVar.d;
            if (apriVar2 == null) {
                apriVar2 = apri.a;
            }
            apqs apqsVar = apriVar2.e;
            if (apqsVar == null) {
                apqsVar = apqs.b;
            }
            apqq apqqVar = apqsVar.d;
            if (apqqVar == null) {
                apqqVar = apqq.a;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aozn aoznVar = apqqVar.b;
            if (aoznVar == null) {
                aoznVar = aozn.a;
            }
            long millis = timeUnit.toMillis(aoznVar.b);
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            aozn aoznVar2 = apqqVar.b;
            if (aoznVar2 == null) {
                aoznVar2 = aozn.a;
            }
            long millis2 = millis + timeUnit2.toMillis(aoznVar2.c);
            Handler handler = this.f;
            String str = null;
            if (millis2 < 100) {
                maaVar = new ahnu(this, apqfVar, 17, null);
            } else {
                maaVar = new maa(this, millis2, apqfVar, 10);
            }
            handler.post(maaVar);
            Context context = this.a;
            if (!TextUtils.isEmpty(this.c)) {
                str = this.c;
            }
            ahnz.I(apqeVar, apqfVar, asgfVar, context, str);
            return;
        }
        Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void h(defpackage.apqe r10, defpackage.asgf r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizi.h(apqe, asgf):void");
    }

    public final void i(apqc apqcVar, asgf asgfVar) {
        String str;
        int i;
        apra apraVar;
        apqt apqtVar;
        apqz apqzVar;
        apqy apqyVar;
        apqu apquVar;
        apqw apqwVar;
        apqv apqvVar;
        long j = aizr.a;
        if (TextUtils.isEmpty(this.c)) {
            str = null;
        } else {
            str = this.c;
        }
        ahnz ahnzVar = aizp.c;
        if (!aizp.c(aqpe.b(aizp.b))) {
            return;
        }
        aozy createBuilder = appa.a.createBuilder();
        if ((apqcVar.b & 1) != 0) {
            aprd aprdVar = apqcVar.c;
            if (aprdVar == null) {
                aprdVar = aprd.a;
            }
            aozy createBuilder2 = apoa.a.createBuilder();
            if ((aprdVar.b & 1) != 0) {
                aozn aoznVar = aprdVar.e;
                if (aoznVar == null) {
                    aoznVar = aozn.a;
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apoa apoaVar = (apoa) createBuilder2.b;
                aoznVar.getClass();
                apoaVar.e = aoznVar;
                apoaVar.b |= 1;
            }
            int i2 = aprdVar.c;
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (i2 != 6) {
                                    i = 0;
                                } else {
                                    i = 5;
                                }
                            } else {
                                i = 4;
                            }
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
            } else {
                i = 6;
            }
            if (i != 0) {
                int i3 = i - 1;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    apny apnyVar = apny.a;
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    apoa apoaVar2 = (apoa) createBuilder2.b;
                                    apnyVar.getClass();
                                    apoaVar2.d = apnyVar;
                                    apoaVar2.c = 6;
                                }
                            } else {
                                if (i2 == 5) {
                                    apqzVar = (apqz) aprdVar.d;
                                } else {
                                    apqzVar = apqz.a;
                                }
                                aozy createBuilder3 = apnw.a.createBuilder();
                                int i4 = apqzVar.d;
                                if (!createBuilder3.b.isMutable()) {
                                    createBuilder3.u();
                                }
                                ((apnw) createBuilder3.b).d = i4;
                                int i5 = apqzVar.b;
                                int g = aove.g(i5);
                                int i6 = g - 1;
                                if (g != 0) {
                                    if (i6 != 0) {
                                        if (i6 != 1) {
                                            if (i6 != 2) {
                                                if (i6 == 3) {
                                                    aozy createBuilder4 = apns.a.createBuilder();
                                                    if (apqzVar.b == 5) {
                                                        apqvVar = (apqv) apqzVar.c;
                                                    } else {
                                                        apqvVar = apqv.a;
                                                    }
                                                    String str2 = apqvVar.b;
                                                    if (!createBuilder4.b.isMutable()) {
                                                        createBuilder4.u();
                                                    }
                                                    apns apnsVar = (apns) createBuilder4.b;
                                                    str2.getClass();
                                                    apnsVar.b = str2;
                                                    if (!createBuilder3.b.isMutable()) {
                                                        createBuilder3.u();
                                                    }
                                                    apnw apnwVar = (apnw) createBuilder3.b;
                                                    apns apnsVar2 = (apns) createBuilder4.s();
                                                    apnsVar2.getClass();
                                                    apnwVar.c = apnsVar2;
                                                    apnwVar.b = 5;
                                                }
                                            } else {
                                                if (i5 == 4) {
                                                    apqwVar = (apqw) apqzVar.c;
                                                } else {
                                                    apqwVar = apqw.a;
                                                }
                                                aozy createBuilder5 = apnt.a.createBuilder();
                                                if ((apqwVar.b & 1) != 0) {
                                                    apqx apqxVar = apqwVar.c;
                                                    if (apqxVar == null) {
                                                        apqxVar = apqx.a;
                                                    }
                                                    apnu H = ahnz.H(apqxVar);
                                                    if (!createBuilder5.b.isMutable()) {
                                                        createBuilder5.u();
                                                    }
                                                    apnt apntVar = (apnt) createBuilder5.b;
                                                    H.getClass();
                                                    apntVar.c = H;
                                                    apntVar.b |= 1;
                                                }
                                                if (!createBuilder3.b.isMutable()) {
                                                    createBuilder3.u();
                                                }
                                                apnw apnwVar2 = (apnw) createBuilder3.b;
                                                apnt apntVar2 = (apnt) createBuilder5.s();
                                                apntVar2.getClass();
                                                apnwVar2.c = apntVar2;
                                                apnwVar2.b = 4;
                                            }
                                        } else {
                                            if (i5 == 3) {
                                                apquVar = (apqu) apqzVar.c;
                                            } else {
                                                apquVar = apqu.a;
                                            }
                                            aozy createBuilder6 = apnr.a.createBuilder();
                                            if (apquVar.b.size() > 0) {
                                                Iterator<E> it = apquVar.b.iterator();
                                                while (it.hasNext()) {
                                                    apnu H2 = ahnz.H((apqx) it.next());
                                                    if (!createBuilder6.b.isMutable()) {
                                                        createBuilder6.u();
                                                    }
                                                    apnr apnrVar = (apnr) createBuilder6.b;
                                                    H2.getClass();
                                                    apax apaxVar = apnrVar.b;
                                                    if (!apaxVar.c()) {
                                                        apnrVar.b = apag.mutableCopy(apaxVar);
                                                    }
                                                    apnrVar.b.add(H2);
                                                }
                                            }
                                            if (!createBuilder3.b.isMutable()) {
                                                createBuilder3.u();
                                            }
                                            apnw apnwVar3 = (apnw) createBuilder3.b;
                                            apnr apnrVar2 = (apnr) createBuilder6.s();
                                            apnrVar2.getClass();
                                            apnwVar3.c = apnrVar2;
                                            apnwVar3.b = 3;
                                        }
                                    } else {
                                        if (i5 == 2) {
                                            apqyVar = (apqy) apqzVar.c;
                                        } else {
                                            apqyVar = apqy.a;
                                        }
                                        aozy createBuilder7 = apnv.a.createBuilder();
                                        if ((apqyVar.b & 1) != 0) {
                                            apqx apqxVar2 = apqyVar.c;
                                            if (apqxVar2 == null) {
                                                apqxVar2 = apqx.a;
                                            }
                                            apnu H3 = ahnz.H(apqxVar2);
                                            if (!createBuilder7.b.isMutable()) {
                                                createBuilder7.u();
                                            }
                                            apnv apnvVar = (apnv) createBuilder7.b;
                                            H3.getClass();
                                            apnvVar.c = H3;
                                            apnvVar.b |= 1;
                                        }
                                        if (!createBuilder3.b.isMutable()) {
                                            createBuilder3.u();
                                        }
                                        apnw apnwVar4 = (apnw) createBuilder3.b;
                                        apnv apnvVar2 = (apnv) createBuilder7.s();
                                        apnvVar2.getClass();
                                        apnwVar4.c = apnvVar2;
                                        apnwVar4.b = 2;
                                    }
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    apoa apoaVar3 = (apoa) createBuilder2.b;
                                    apnw apnwVar5 = (apnw) createBuilder3.s();
                                    apnwVar5.getClass();
                                    apoaVar3.d = apnwVar5;
                                    apoaVar3.c = 5;
                                } else {
                                    throw null;
                                }
                            }
                        } else {
                            aozy createBuilder8 = apnq.a.createBuilder();
                            if (aprdVar.c == 4) {
                                apqtVar = (apqt) aprdVar.d;
                            } else {
                                apqtVar = apqt.a;
                            }
                            boolean z = apqtVar.b;
                            if (!createBuilder8.b.isMutable()) {
                                createBuilder8.u();
                            }
                            ((apnq) createBuilder8.b).b = z;
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            apoa apoaVar4 = (apoa) createBuilder2.b;
                            apnq apnqVar = (apnq) createBuilder8.s();
                            apnqVar.getClass();
                            apoaVar4.d = apnqVar;
                            apoaVar4.c = 4;
                        }
                    } else {
                        if (i2 == 3) {
                            apraVar = (apra) aprdVar.d;
                        } else {
                            apraVar = apra.a;
                        }
                        aozy createBuilder9 = apnx.a.createBuilder();
                        if ((apraVar.b & 2) != 0) {
                            aprm aprmVar = apraVar.c;
                            if (aprmVar == null) {
                                aprmVar = aprm.a;
                            }
                            aozy createBuilder10 = apop.a.createBuilder();
                            String str3 = aprmVar.d;
                            if (!createBuilder10.b.isMutable()) {
                                createBuilder10.u();
                            }
                            apop apopVar = (apop) createBuilder10.b;
                            str3.getClass();
                            apopVar.d = str3;
                            if ((aprmVar.b & 1) != 0) {
                                aozy createBuilder11 = apoo.a.createBuilder();
                                aprl aprlVar = aprmVar.c;
                                if (aprlVar == null) {
                                    aprlVar = aprl.a;
                                }
                                apax apaxVar2 = aprlVar.c;
                                if (!createBuilder11.b.isMutable()) {
                                    createBuilder11.u();
                                }
                                apoo apooVar = (apoo) createBuilder11.b;
                                apax apaxVar3 = apooVar.b;
                                if (!apaxVar3.c()) {
                                    apooVar.b = apag.mutableCopy(apaxVar3);
                                }
                                aoyj.addAll(apaxVar2, apooVar.b);
                                if (!createBuilder10.b.isMutable()) {
                                    createBuilder10.u();
                                }
                                apop apopVar2 = (apop) createBuilder10.b;
                                apoo apooVar2 = (apoo) createBuilder11.s();
                                apooVar2.getClass();
                                apopVar2.c = apooVar2;
                                apopVar2.b |= 1;
                            }
                            if (!createBuilder9.b.isMutable()) {
                                createBuilder9.u();
                            }
                            apnx apnxVar = (apnx) createBuilder9.b;
                            apop apopVar3 = (apop) createBuilder10.s();
                            apopVar3.getClass();
                            apnxVar.c = apopVar3;
                            apnxVar.b |= 1;
                        }
                        if ((apraVar.b & 4) != 0) {
                            aprw aprwVar = apraVar.d;
                            if (aprwVar == null) {
                                aprwVar = aprw.a;
                            }
                            aozy createBuilder12 = apox.a.createBuilder();
                            if ((aprwVar.b & 1) != 0) {
                                aprv aprvVar = aprwVar.c;
                                if (aprvVar == null) {
                                    aprvVar = aprv.a;
                                }
                                aozy createBuilder13 = apow.a.createBuilder();
                                if ((aprvVar.b & 2) != 0) {
                                    apru apruVar = aprvVar.c;
                                    if (apruVar == null) {
                                        apruVar = apru.a;
                                    }
                                    aozy createBuilder14 = apov.a.createBuilder();
                                    if ((apruVar.b & 1) != 0) {
                                        aprt aprtVar = apruVar.c;
                                        if (aprtVar == null) {
                                            aprtVar = aprt.a;
                                        }
                                        aozy createBuilder15 = apou.a.createBuilder();
                                        String str4 = aprtVar.b;
                                        if (!createBuilder15.b.isMutable()) {
                                            createBuilder15.u();
                                        }
                                        apag apagVar = createBuilder15.b;
                                        str4.getClass();
                                        ((apou) apagVar).b = str4;
                                        String str5 = aprtVar.c;
                                        if (!apagVar.isMutable()) {
                                            createBuilder15.u();
                                        }
                                        apag apagVar2 = createBuilder15.b;
                                        str5.getClass();
                                        ((apou) apagVar2).c = str5;
                                        String str6 = aprtVar.d;
                                        if (!apagVar2.isMutable()) {
                                            createBuilder15.u();
                                        }
                                        apag apagVar3 = createBuilder15.b;
                                        str6.getClass();
                                        ((apou) apagVar3).d = str6;
                                        String str7 = aprtVar.e;
                                        if (!apagVar3.isMutable()) {
                                            createBuilder15.u();
                                        }
                                        apag apagVar4 = createBuilder15.b;
                                        str7.getClass();
                                        ((apou) apagVar4).e = str7;
                                        String str8 = aprtVar.f;
                                        if (!apagVar4.isMutable()) {
                                            createBuilder15.u();
                                        }
                                        apou apouVar = (apou) createBuilder15.b;
                                        str8.getClass();
                                        apouVar.f = str8;
                                        apou apouVar2 = (apou) createBuilder15.s();
                                        if (!createBuilder14.b.isMutable()) {
                                            createBuilder14.u();
                                        }
                                        apov apovVar = (apov) createBuilder14.b;
                                        apouVar2.getClass();
                                        apovVar.c = apouVar2;
                                        apovVar.b |= 1;
                                    }
                                    if ((apruVar.b & 2) != 0) {
                                        aprs aprsVar = apruVar.d;
                                        if (aprsVar == null) {
                                            aprsVar = aprs.a;
                                        }
                                        aozy createBuilder16 = apot.a.createBuilder();
                                        if (aprsVar.b.size() > 0) {
                                            for (aprr aprrVar : aprsVar.b) {
                                                aozy createBuilder17 = apos.a.createBuilder();
                                                String str9 = aprrVar.b;
                                                if (!createBuilder17.b.isMutable()) {
                                                    createBuilder17.u();
                                                }
                                                apag apagVar5 = createBuilder17.b;
                                                str9.getClass();
                                                ((apos) apagVar5).b = str9;
                                                String str10 = aprrVar.c;
                                                if (!apagVar5.isMutable()) {
                                                    createBuilder17.u();
                                                }
                                                apos aposVar = (apos) createBuilder17.b;
                                                str10.getClass();
                                                aposVar.c = str10;
                                                apos aposVar2 = (apos) createBuilder17.s();
                                                if (!createBuilder16.b.isMutable()) {
                                                    createBuilder16.u();
                                                }
                                                apot apotVar = (apot) createBuilder16.b;
                                                aposVar2.getClass();
                                                apax apaxVar4 = apotVar.b;
                                                if (!apaxVar4.c()) {
                                                    apotVar.b = apag.mutableCopy(apaxVar4);
                                                }
                                                apotVar.b.add(aposVar2);
                                            }
                                        }
                                        if (!createBuilder14.b.isMutable()) {
                                            createBuilder14.u();
                                        }
                                        apov apovVar2 = (apov) createBuilder14.b;
                                        apot apotVar2 = (apot) createBuilder16.s();
                                        apotVar2.getClass();
                                        apovVar2.d = apotVar2;
                                        apovVar2.b |= 2;
                                    }
                                    if (!createBuilder13.b.isMutable()) {
                                        createBuilder13.u();
                                    }
                                    apow apowVar = (apow) createBuilder13.b;
                                    apov apovVar3 = (apov) createBuilder14.s();
                                    apovVar3.getClass();
                                    apowVar.c = apovVar3;
                                    apowVar.b |= 2;
                                }
                                if (!createBuilder12.b.isMutable()) {
                                    createBuilder12.u();
                                }
                                apox apoxVar = (apox) createBuilder12.b;
                                apow apowVar2 = (apow) createBuilder13.s();
                                apowVar2.getClass();
                                apoxVar.c = apowVar2;
                                apoxVar.b |= 1;
                            }
                            if (!createBuilder9.b.isMutable()) {
                                createBuilder9.u();
                            }
                            apnx apnxVar2 = (apnx) createBuilder9.b;
                            apox apoxVar2 = (apox) createBuilder12.s();
                            apoxVar2.getClass();
                            apnxVar2.d = apoxVar2;
                            apnxVar2.b |= 2;
                        }
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apoa apoaVar5 = (apoa) createBuilder2.b;
                        apnx apnxVar3 = (apnx) createBuilder9.s();
                        apnxVar3.getClass();
                        apoaVar5.d = apnxVar3;
                        apoaVar5.c = 3;
                    }
                } else {
                    apnz apnzVar = apnz.a;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apoa apoaVar6 = (apoa) createBuilder2.b;
                    apnzVar.getClass();
                    apoaVar6.d = apnzVar;
                    apoaVar6.c = 2;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                appa appaVar = (appa) createBuilder.b;
                apoa apoaVar7 = (apoa) createBuilder2.s();
                apoaVar7.getClass();
                appaVar.c = apoaVar7;
                appaVar.b |= 1;
            } else {
                throw null;
            }
        }
        if ((apqcVar.b & 2) != 0) {
            aozy createBuilder18 = apoy.a.createBuilder();
            aprx aprxVar = apqcVar.d;
            if (aprxVar == null) {
                aprxVar = aprx.a;
            }
            String str11 = aprxVar.b;
            if (!createBuilder18.b.isMutable()) {
                createBuilder18.u();
            }
            apag apagVar6 = createBuilder18.b;
            str11.getClass();
            ((apoy) apagVar6).b = str11;
            aprx aprxVar2 = apqcVar.d;
            if (aprxVar2 == null) {
                aprxVar2 = aprx.a;
            }
            aozb aozbVar = aprxVar2.c;
            if (!apagVar6.isMutable()) {
                createBuilder18.u();
            }
            apoy apoyVar = (apoy) createBuilder18.b;
            aozbVar.getClass();
            apoyVar.c = aozbVar;
            apoy apoyVar2 = (apoy) createBuilder18.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            appa appaVar2 = (appa) createBuilder.b;
            apoyVar2.getClass();
            appaVar2.d = apoyVar2;
            appaVar2.b |= 2;
        }
        aizq a = aizq.a();
        aozy createBuilder19 = apob.a.createBuilder();
        if (!createBuilder19.b.isMutable()) {
            createBuilder19.u();
        }
        apob apobVar = (apob) createBuilder19.b;
        appa appaVar3 = (appa) createBuilder.s();
        appaVar3.getClass();
        apobVar.c = appaVar3;
        apobVar.b = 3;
        appb appbVar = appb.a;
        if (!createBuilder19.b.isMutable()) {
            createBuilder19.u();
        }
        Context context = this.a;
        apob apobVar2 = (apob) createBuilder19.b;
        appbVar.getClass();
        apobVar2.e = appbVar;
        apobVar2.d = 5;
        a.b((apob) createBuilder19.s(), asgfVar.b(), asgfVar.a(), context, str);
    }

    public final /* synthetic */ void j(aqjf aqjfVar, aoij aoijVar) {
        aqux aquxVar;
        try {
            alce c = c();
            aiyw aiywVar = aiyw.a;
            boolean z = aiywVar.b;
            aiywVar.b = true;
            aqrs d = d(c);
            aiyw.a.b = z;
            if (d == null) {
                Log.e("NetworkCallerGrpc", "Could not get channel for survey startup config.");
                aiyw.a.b = false;
                return;
            }
            aqjm a = aqjn.a(d);
            aqrs aqrsVar = a.a;
            aqux aquxVar2 = aqjn.e;
            if (aquxVar2 == null) {
                synchronized (aqjn.class) {
                    aquxVar = aqjn.e;
                    if (aquxVar == null) {
                        aquu a2 = aqux.a();
                        a2.e = aquw.UNARY;
                        a2.a = aqux.c("google.internal.feedback.v1.SurveyService", "GetSurveyStartupConfig");
                        a2.b();
                        aqjf aqjfVar2 = aqjf.a;
                        aozs aozsVar = arkx.a;
                        a2.c = new arkw(aqjfVar2);
                        a2.d = new arkw(aqjg.a);
                        aquxVar = a2.a();
                        aqjn.e = aquxVar;
                    }
                }
                aquxVar2 = aquxVar;
            }
            albo.bR(arlj.a(aqrsVar.a(aquxVar2, a.b), aqjfVar), new vbr(this, aoijVar, 15, null), aize.a());
        } catch (UnsupportedOperationException e) {
            Log.e("NetworkCallerGrpc", "The configured transport is not supported: ".concat(e.toString()));
            a(5);
        }
    }

    public final void k(final aoij aoijVar) {
        this.f.post(new Runnable() { // from class: aizg
            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                asgf asgfVar = new asgf();
                aoij aoijVar2 = aoij.this;
                Object obj = aoijVar2.b;
                Object obj2 = aoijVar2.c;
                Object obj3 = aoijVar2.a;
                synchronized (aiyx.b) {
                    if (TextUtils.isEmpty(((akkw) obj2).c)) {
                        Log.w("SurveyController", "No trigger ID set, ignoring show request.");
                        ((aoij) ((akkw) obj2).a).b((String) ((akkw) obj2).c, 4);
                        return;
                    }
                    ((aiyx) obj).g = ((aiyx) obj).h.f().toEpochMilli();
                    ((aiyx) obj).c.c.put(((akkw) obj2).c, Long.valueOf(((aiyx) obj).h.f().toEpochMilli()));
                    aozy createBuilder = apsb.a.createBuilder();
                    Object obj4 = ((akkw) obj2).c;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apsb apsbVar = (apsb) createBuilder.b;
                    obj4.getClass();
                    apsbVar.b = (String) obj4;
                    ahnz ahnzVar = aizp.c;
                    aizp.c(aqqx.a.get().c(aizp.b));
                    String language = Locale.getDefault().getLanguage();
                    ahnz ahnzVar2 = aizp.c;
                    if (aizp.b(aqql.b(aizp.b))) {
                        language = Locale.getDefault().toLanguageTag();
                    }
                    alog r = alog.r(language);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apsb apsbVar2 = (apsb) createBuilder.b;
                    apax apaxVar = apsbVar2.c;
                    if (!apaxVar.c()) {
                        apsbVar2.c = apag.mutableCopy(apaxVar);
                    }
                    aoyj.addAll(r, apsbVar2.c);
                    boolean z = ((akkw) obj2).b;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((apsb) createBuilder.b).d = z;
                    apsb apsbVar3 = (apsb) createBuilder.s();
                    apqn c = aizr.c((Context) ((akkw) obj2).d);
                    aozy createBuilder2 = apqe.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar = createBuilder2.b;
                    apqe apqeVar = (apqe) apagVar;
                    apsbVar3.getClass();
                    apqeVar.c = apsbVar3;
                    apqeVar.b |= 1;
                    if (!apagVar.isMutable()) {
                        createBuilder2.u();
                    }
                    apqe apqeVar2 = (apqe) createBuilder2.b;
                    c.getClass();
                    apqeVar2.d = c;
                    apqeVar2.b |= 2;
                    apqe apqeVar3 = (apqe) createBuilder2.s();
                    asgf asgfVar2 = new asgf();
                    if (apqeVar3 == null) {
                        Log.e("NetworkCallerGrpc", "Survey trigger request was null");
                    } else {
                        aize.a().execute(new adub(obj3, apqeVar3, asgfVar2, 7, (short[]) null));
                    }
                    aozy createBuilder3 = apoi.a.createBuilder();
                    Object obj5 = ((akkw) obj2).c;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar2 = createBuilder3.b;
                    obj5.getClass();
                    ((apoi) apagVar2).b = (String) obj5;
                    boolean z2 = ((akkw) obj2).b;
                    if (!apagVar2.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar3 = createBuilder3.b;
                    ((apoi) apagVar3).c = z2;
                    if (!apagVar3.isMutable()) {
                        createBuilder3.u();
                    }
                    ((apoi) createBuilder3.b).d = false;
                    apoi apoiVar = (apoi) createBuilder3.s();
                    Object obj6 = ((akkw) obj2).d;
                    ahnz ahnzVar3 = aizp.c;
                    if (aizp.c(aqpe.b(aizp.b))) {
                        aizq a = aizq.a();
                        aozy createBuilder4 = apoj.a.createBuilder();
                        if (!createBuilder4.b.isMutable()) {
                            createBuilder4.u();
                        }
                        apoj apojVar = (apoj) createBuilder4.b;
                        apoiVar.getClass();
                        apojVar.c = apoiVar;
                        apojVar.b = 3;
                        a.c((apoj) createBuilder4.s(), asgfVar.b(), asgfVar.a(), (Context) obj6, null);
                    }
                }
            }
        });
    }
}
