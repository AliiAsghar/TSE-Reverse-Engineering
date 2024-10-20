package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.google.android.gms.common.Feature;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.ImsiRequest;
import com.google.android.gms.constellation.PhoneNumberVerification;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adln extends adll {
    public final /* synthetic */ adlw a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adln(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
        this.b = 0;
    }

    public static final int w(int i) {
        switch (i) {
            case 2:
                return 8;
            case 3:
                return 9;
            case 4:
                return 10;
            case 5:
                return 14;
            case 6:
                return 12;
            case 7:
                return 11;
            case 8:
                return 13;
            default:
                return 7;
        }
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "VerifyMsisdnState";
    }

    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, vau] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, acwl] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, vau] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, vau] */
    @Override // defpackage.adll, defpackage.acyh
    public final void b() {
        acir r;
        boolean O;
        String v;
        boolean D;
        VerifyPhoneNumberRequest a;
        Feature[] featureArr;
        super.b();
        this.a.D(apjx.VERIFY_MSISDN_STAGE);
        this.a.D.a("UPI - calling verifyPhoneNumber API", new Object[0]);
        this.a.aD(54);
        this.b++;
        adlw adlwVar = this.a;
        String str = adlwVar.r;
        String r2 = r();
        String u = adlwVar.u();
        String q = q();
        int d = aczv.d();
        int a2 = adlwVar.z.a(adlwVar.n);
        adiw adiwVar = new adiw(this.a.n);
        aozy createBuilder = apke.a.createBuilder();
        apkg apkgVar = apkg.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apke apkeVar = (apke) apagVar;
        apkgVar.getClass();
        apkeVar.d = apkgVar;
        apkeVar.c = 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apke apkeVar2 = (apke) apagVar2;
        r2.getClass();
        apkeVar2.b |= 1;
        apkeVar2.e = r2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        apke apkeVar3 = (apke) apagVar3;
        u.getClass();
        apkeVar3.b |= 2;
        apkeVar3.f = u;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        apke apkeVar4 = (apke) apagVar4;
        q.getClass();
        apkeVar4.b |= 4;
        apkeVar4.g = q;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apag apagVar5 = createBuilder.b;
        apke apkeVar5 = (apke) apagVar5;
        apkeVar5.b |= 8;
        apkeVar5.h = d;
        if (!apagVar5.isMutable()) {
            createBuilder.u();
        }
        apke apkeVar6 = (apke) createBuilder.b;
        apkeVar6.b |= 16;
        apkeVar6.i = a2;
        apke apkeVar7 = (apke) createBuilder.s();
        aozy createBuilder2 = apjl.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        Context context = adlwVar.s;
        acnz acnzVar = adlwVar.aE;
        apjl apjlVar = (apjl) createBuilder2.b;
        apkeVar7.getClass();
        apjlVar.v = apkeVar7;
        apjlVar.b |= 262144;
        acnzVar.z(context, acnzVar.p(createBuilder2, adiwVar), str);
        adlw adlwVar2 = this.a;
        String ag = albo.ag(adlwVar2.r);
        String ag2 = albo.ag(adlwVar2.z.n(adlwVar2.n));
        adlw adlwVar3 = this.a;
        boolean d2 = adlwVar3.F.d(adlwVar3.n);
        String str2 = this.a.n;
        adea adeaVar = adlwVar2.aI;
        abqb abqbVar = (abqb) adeaVar.e;
        Context context2 = adlwVar2.s;
        if (abqbVar.h(context2, 204390000) == 0) {
            Optional c = adea.c(context2);
            if (c.isEmpty()) {
                r = actx.r(new admb());
            } else {
                String str3 = adlwVar2.p;
                abvt abvtVar = new abvt(context2);
                Object obj = c.get();
                Object obj2 = adeaVar.d;
                adxq adxqVar = new adxq();
                adxqVar.a = obj;
                int i = ambp.a;
                adxqVar.b = ambn.a.c(a.co(str3, ag, "."), StandardCharsets.UTF_8).toString();
                IdTokenRequest i2 = adxqVar.i();
                Bundle bundle = new Bundle();
                bundle.putString("session_id", ag);
                bundle.putString("required_consumer_consent", "RCS");
                int T = a.T(adeaVar.b.c(str2).F);
                if (T == 0) {
                    T = 1;
                }
                if (T == 6) {
                    bundle.putString("one_time_verification", "True");
                }
                if (aczv.x() && aczv.W()) {
                    if (T != 5) {
                        O = false;
                    } else {
                        O = true;
                    }
                    v = adeaVar.b.d(str2).b;
                } else {
                    O = aczv.O();
                    v = aczv.v();
                }
                if (adeaVar.c.a() && adww.d(context2)) {
                    bundle.putString("consent_type", "RCS_DEFAULT_ON_LEGAL_FYI_IN_SETTINGS");
                } else {
                    if (aczv.x() && aczv.X()) {
                        D = ((vjs) adeaVar.a).B(str2);
                    } else {
                        D = aczv.D();
                    }
                    if (D) {
                        int a3 = ((adkd) obj2).a().a();
                        if (a3 != 1) {
                            if (a3 == 2) {
                                bundle.putString("consent_type", "RCS_DEFAULT_ON_OUT_OF_BOX");
                            }
                        } else {
                            bundle.putString("consent_type", "RCS_DEFAULT_ON_LEGAL_FYI");
                        }
                    }
                }
                if (O) {
                    if (str3 != null) {
                        List singletonList = Collections.singletonList(new ImsiRequest(str3, ag2));
                        if (d2) {
                            bundle.putString("force_provisioning", "true");
                        }
                        abvv abvvVar = new abvv();
                        abvvVar.a = v;
                        abvvVar.b = i2;
                        abvvVar.c = bundle;
                        abvvVar.d = singletonList;
                        abvvVar.b();
                        a = abvvVar.a();
                    } else {
                        throw new IllegalStateException("IMSI is required");
                    }
                } else {
                    bundle.putString("IMSI", str3);
                    if (adeaVar.b.c(str2).G) {
                        abvv abvvVar2 = new abvv();
                        abvvVar2.a = v;
                        abvvVar2.b = i2;
                        abvvVar2.c = bundle;
                        abvvVar2.b();
                        a = abvvVar2.a();
                    } else {
                        abvv abvvVar3 = new abvv();
                        abvvVar3.a = v;
                        abvvVar3.b = i2;
                        abvvVar3.c = bundle;
                        a = abvvVar3.a();
                    }
                }
                ajxp ajxpVar = new ajxp(null);
                ajxpVar.c = new abkk(a, 3);
                if (a.g == 3) {
                    featureArr = new Feature[]{abvu.d, abvu.g};
                } else {
                    featureArr = new Feature[]{abvu.d};
                }
                ajxpVar.d = featureArr;
                ajxpVar.b = 11901;
                r = abvtVar.g(ajxpVar.b());
            }
        } else {
            r = actx.r(new adma());
        }
        r.p(this.a.B, new acim() { // from class: adlm
            @Override // defpackage.acim
            public final void e(Object obj3) {
                Optional empty;
                int i3;
                int i4;
                VerifyPhoneNumberResponse verifyPhoneNumberResponse = (VerifyPhoneNumberResponse) obj3;
                boolean booleanValue = ((Boolean) adkh.a.a()).booleanValue();
                adln adlnVar = adln.this;
                if (booleanValue) {
                    empty = Optional.of(((aday) adlnVar.a.O.b()).k(adlnVar.a.n));
                } else {
                    empty = Optional.empty();
                }
                PhoneNumberVerification[] phoneNumberVerificationArr = verifyPhoneNumberResponse.a;
                int length = phoneNumberVerificationArr.length;
                if (length != 1) {
                    adlnVar.a.D.e("UPI - expected 1 verification, instead verified %d numbers", Integer.valueOf(length));
                    if (length == 0) {
                        i4 = 4;
                    } else {
                        i4 = 5;
                    }
                    adlw adlwVar4 = adlnVar.a;
                    String str4 = adlwVar4.r;
                    String r3 = adlnVar.r();
                    String u2 = adlnVar.a.u();
                    String q2 = adlnVar.q();
                    adlw adlwVar5 = adlnVar.a;
                    adlwVar4.aE.o(adlwVar4.s, str4, r3, u2, q2, i4, false, Optional.empty(), aczv.d(), adlwVar5.z.a(adlwVar5.n), new adiw(adlnVar.a.n), Optional.empty(), empty);
                    adlnVar.s(false);
                    return;
                }
                PhoneNumberVerification phoneNumberVerification = phoneNumberVerificationArr[0];
                if (((Boolean) aczv.s().a.aw.a()).booleanValue()) {
                    int i5 = phoneNumberVerification.g;
                    adlnVar.a.D.a("UPI - verification timestampMillis = %d, verificationMethod = %d, verificationStatus = %d, retryAfterSeconds = %d", Long.valueOf(phoneNumberVerification.b), Integer.valueOf(phoneNumberVerification.c), Integer.valueOf(i5), Long.valueOf(phoneNumberVerification.h));
                    switch (i5) {
                        case 1:
                            if (((Boolean) adkh.a.a()).booleanValue()) {
                                ((aday) adlnVar.a.O.b()).u(adlnVar.a.n, anhz.ELIGIBLE);
                                empty = Optional.of(anhz.ELIGIBLE);
                            }
                            adlnVar.v(phoneNumberVerification.e, empty);
                            return;
                        case 2:
                        case 3:
                        case 4:
                            adlw adlwVar6 = adlnVar.a;
                            String str5 = adlwVar6.r;
                            String r4 = adlnVar.r();
                            String u3 = adlnVar.a.u();
                            String q3 = adlnVar.q();
                            int w = adln.w(i5);
                            adlw adlwVar7 = adlnVar.a;
                            adlwVar6.aE.o(adlwVar6.s, str5, r4, u3, q3, w, true, Optional.empty(), aczv.d(), adlwVar7.z.a(adlwVar7.n), new adiw(adlnVar.a.n), Optional.of(Integer.valueOf((int) phoneNumberVerification.h)), empty);
                            if (((Boolean) adlw.h.a()).booleanValue()) {
                                long j = phoneNumberVerification.h;
                                if (j <= 0) {
                                    if (j == 0) {
                                        adlnVar.n(adlnVar.a.af, apkn.RCS_PROVISIONING_ENABLED_STATE);
                                        return;
                                    } else {
                                        adlnVar.t();
                                        return;
                                    }
                                }
                                adlnVar.u(j);
                                return;
                            }
                            adlnVar.t();
                            return;
                        case 5:
                        case 6:
                            i3 = 1;
                            if (((acwo) adlnVar.a.Y.b()).a()) {
                                adlw adlwVar8 = adlnVar.a;
                                String str6 = adlwVar8.r;
                                String r5 = adlnVar.r();
                                String u4 = adlnVar.a.u();
                                String q4 = adlnVar.q();
                                int w2 = adln.w(i5);
                                adlw adlwVar9 = adlnVar.a;
                                adlwVar8.aE.o(adlwVar8.s, str6, r5, u4, q4, w2, true, Optional.empty(), aczv.d(), adlwVar9.z.a(adlwVar9.n), new adiw(adlnVar.a.n), Optional.of(Integer.valueOf((int) phoneNumberVerification.h)), empty);
                                if (((Boolean) adlw.h.a()).booleanValue()) {
                                    long j2 = phoneNumberVerification.h;
                                    if (j2 <= 0) {
                                        if (j2 == 0) {
                                            adlnVar.n(adlnVar.a.af, apkn.RCS_PROVISIONING_ENABLED_STATE);
                                            return;
                                        } else {
                                            adlnVar.t();
                                            return;
                                        }
                                    }
                                    adlnVar.u(j2);
                                    return;
                                }
                                adlnVar.t();
                                return;
                            }
                            break;
                        case 7:
                            adlw adlwVar10 = adlnVar.a;
                            String str7 = adlwVar10.r;
                            String r6 = adlnVar.r();
                            String u5 = adlnVar.a.u();
                            String q5 = adlnVar.q();
                            int w3 = adln.w(i5);
                            adlw adlwVar11 = adlnVar.a;
                            adlwVar10.aE.o(adlwVar10.s, str7, r6, u5, q5, w3, false, Optional.empty(), aczv.d(), adlwVar11.z.a(adlwVar11.n), new adiw(adlnVar.a.n), Optional.of(Integer.valueOf((int) phoneNumberVerification.h)), empty);
                            adlnVar.s(true);
                            return;
                        case 8:
                            if (((Boolean) adkh.a.a()).booleanValue()) {
                                ((aday) adlnVar.a.O.b()).u(adlnVar.a.n, anhz.INELIGIBLE);
                                empty = Optional.of(anhz.INELIGIBLE);
                            }
                            adlnVar.v(phoneNumberVerification.e, empty);
                            return;
                        default:
                            i3 = 1;
                            break;
                    }
                    adkm adkmVar = adlnVar.a.D;
                    Object[] objArr = new Object[i3];
                    objArr[0] = Integer.valueOf(phoneNumberVerification.g);
                    adkmVar.a("UPI - Unrecognized VerificationStatus from calling verifyPhoneNumber: %d", objArr);
                    adlw adlwVar12 = adlnVar.a;
                    String str8 = adlwVar12.r;
                    String r7 = adlnVar.r();
                    String u6 = adlnVar.a.u();
                    String q6 = adlnVar.q();
                    int w4 = adln.w(i5);
                    adlw adlwVar13 = adlnVar.a;
                    adlwVar12.aE.o(adlwVar12.s, str8, r7, u6, q6, w4, true, Optional.empty(), aczv.d(), adlwVar13.z.a(adlwVar13.n), new adiw(adlnVar.a.n), Optional.of(Integer.valueOf((int) phoneNumberVerification.h)), empty);
                    return;
                }
                adlnVar.a.D.a("UPI - verification timestampMillis = %d, verificationMethod = %d", Long.valueOf(phoneNumberVerification.b), Integer.valueOf(phoneNumberVerification.c));
                adlnVar.v(phoneNumberVerification.e, empty);
            }
        });
        r.o(this.a.B, new ktn(this, 11));
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_VERIFY_MSISDN;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_VERIFY_MSISDN_STATE;
    }

    @Override // defpackage.adll
    public final boolean h() {
        return true;
    }

    @Override // defpackage.adll
    public final boolean i() {
        return false;
    }

    @Override // defpackage.adll
    public final boolean j() {
        return true;
    }

    @Override // defpackage.admi
    public final boolean k(Message message, adjj adjjVar) {
        return super.o(message, adjjVar);
    }

    public final String q() {
        String str = this.a.p;
        return str.substring(0, Math.min(str.length(), 6));
    }

    public final String r() {
        return String.format(Locale.US, "%s-%d", this.a.r, Integer.valueOf(this.b));
    }

    public final void s(boolean z) {
        this.a.aD(56);
        if (this.a.at()) {
            if (z) {
                this.a.D.d("UPI - Transitioning into WaitingForManualMsisdnEntryState", new Object[0]);
                n(this.a.aA, apkn.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE);
                return;
            } else {
                this.a.D.d("UPI - non-retryable verifyPhoneNumber failure, falling back to non-UPI is removed", new Object[0]);
                n(this.a.an, apkn.RCS_PROVISIONING_RETRY_STATE);
                return;
            }
        }
        if (aczv.z()) {
            this.a.D.d("UPI - non-retryable verifyPhoneNumber failure, fallback to non-UPI is disabled", new Object[0]);
            n(this.a.an, apkn.RCS_PROVISIONING_RETRY_STATE);
        } else {
            this.a.D.d("UPI - non-retryable verifyPhoneNumber failure, falling back to non-UPI", new Object[0]);
            adll l = this.a.l();
            n(l, l.g());
        }
    }

    public final void t() {
        this.a.D.d("UPI - retryable verifyPhoneNumber failure", new Object[0]);
        this.a.aD(56);
        n(this.a.ao, apkn.RCS_PROVISIONING_REPLAY_REQUEST_STATE);
    }

    public final void u(long j) {
        this.a.D.d("UPI - retryable verifyPhoneNumber failure with retry after seconds %d", Long.valueOf(j));
        this.a.aD(56);
        if (((acxv) this.a.N.b()).a()) {
            aday adayVar = (aday) this.a.O.b();
            adlw adlwVar = this.a;
            adayVar.j(adlwVar.n).edit().putLong("retry_time", adlwVar.M.f().plusSeconds(j).getEpochSecond()).commit();
        } else {
            adnu.a();
            adlw adlwVar2 = this.a;
            adnu.e(adlwVar2.s, adlwVar2.n).edit().putLong("retry_time", adlwVar2.M.f().plusSeconds(j).getEpochSecond()).commit();
        }
        n(this.a.an, apkn.RCS_PROVISIONING_RETRY_STATE);
    }

    public final void v(String str, Optional optional) {
        apke apkeVar;
        this.a.D.a("UPI - successfully verified phone number", new Object[0]);
        this.a.aD(55);
        adlw adlwVar = this.a;
        adnk adnkVar = adlwVar.z;
        String str2 = adlwVar.r;
        String r = r();
        String u = adlwVar.u();
        String q = q();
        int d = aczv.d();
        int a = adnkVar.a(adlwVar.n);
        adiw adiwVar = new adiw(this.a.n);
        if (optional.isPresent()) {
            aozy createBuilder = apke.a.createBuilder();
            aozy createBuilder2 = apkh.a.createBuilder();
            apki apkiVar = apki.a;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apkh apkhVar = (apkh) createBuilder2.b;
            apkiVar.getClass();
            apkhVar.c = apkiVar;
            apkhVar.b = 1;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apke apkeVar2 = (apke) createBuilder.b;
            apkh apkhVar2 = (apkh) createBuilder2.s();
            apkhVar2.getClass();
            apkeVar2.d = apkhVar2;
            apkeVar2.c = 2;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            apke apkeVar3 = (apke) apagVar;
            r.getClass();
            apkeVar3.b = 1 | apkeVar3.b;
            apkeVar3.e = r;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apag apagVar2 = createBuilder.b;
            apke apkeVar4 = (apke) apagVar2;
            u.getClass();
            apkeVar4.b = 2 | apkeVar4.b;
            apkeVar4.f = u;
            if (!apagVar2.isMutable()) {
                createBuilder.u();
            }
            apag apagVar3 = createBuilder.b;
            apke apkeVar5 = (apke) apagVar3;
            q.getClass();
            apkeVar5.b |= 4;
            apkeVar5.g = q;
            if (!apagVar3.isMutable()) {
                createBuilder.u();
            }
            apag apagVar4 = createBuilder.b;
            apke apkeVar6 = (apke) apagVar4;
            apkeVar6.b |= 8;
            apkeVar6.h = d;
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            apke apkeVar7 = (apke) createBuilder.b;
            apkeVar7.b |= 16;
            apkeVar7.i = a;
            Object obj = optional.get();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apke apkeVar8 = (apke) createBuilder.b;
            apkeVar8.j = ((anhz) obj).a();
            apkeVar8.b |= 32;
            apkeVar = (apke) createBuilder.s();
        } else {
            aozy createBuilder3 = apke.a.createBuilder();
            aozy createBuilder4 = apkh.a.createBuilder();
            apki apkiVar2 = apki.a;
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            apkh apkhVar3 = (apkh) createBuilder4.b;
            apkiVar2.getClass();
            apkhVar3.c = apkiVar2;
            apkhVar3.b = 1;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apke apkeVar9 = (apke) createBuilder3.b;
            apkh apkhVar4 = (apkh) createBuilder4.s();
            apkhVar4.getClass();
            apkeVar9.d = apkhVar4;
            apkeVar9.c = 2;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar5 = createBuilder3.b;
            apke apkeVar10 = (apke) apagVar5;
            r.getClass();
            apkeVar10.b = 1 | apkeVar10.b;
            apkeVar10.e = r;
            if (!apagVar5.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar6 = createBuilder3.b;
            apke apkeVar11 = (apke) apagVar6;
            u.getClass();
            apkeVar11.b = 2 | apkeVar11.b;
            apkeVar11.f = u;
            if (!apagVar6.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar7 = createBuilder3.b;
            apke apkeVar12 = (apke) apagVar7;
            q.getClass();
            apkeVar12.b |= 4;
            apkeVar12.g = q;
            if (!apagVar7.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar8 = createBuilder3.b;
            apke apkeVar13 = (apke) apagVar8;
            apkeVar13.b |= 8;
            apkeVar13.h = d;
            if (!apagVar8.isMutable()) {
                createBuilder3.u();
            }
            apke apkeVar14 = (apke) createBuilder3.b;
            apkeVar14.b |= 16;
            apkeVar14.i = a;
            apkeVar = (apke) createBuilder3.s();
        }
        aozy createBuilder5 = apjl.a.createBuilder();
        if (!createBuilder5.b.isMutable()) {
            createBuilder5.u();
        }
        Context context = adlwVar.s;
        acnz acnzVar = adlwVar.aE;
        apjl apjlVar = (apjl) createBuilder5.b;
        apkeVar.getClass();
        apjlVar.v = apkeVar;
        apjlVar.b |= 262144;
        acnzVar.z(context, acnzVar.p(createBuilder5, adiwVar), str2);
        adlw adlwVar2 = this.a;
        try {
            adlwVar2.z.b.k("msisdn_token_for_sim_".concat(String.valueOf(adlwVar2.n)), str, "bugle");
        } catch (adux e) {
            advr.j(e, adnk.a, "Error while putting MSISDN token into bugle storage", new Object[0]);
        }
        n(this.a.al, apkn.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE);
        this.a.V(adjj.MSG_VERIFY_NUMBER_SUCCESS, str);
    }
}
