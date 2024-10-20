package defpackage;

import android.os.Message;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adle extends adll {
    final /* synthetic */ adlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adle(adlw adlwVar) {
        super(adlwVar);
        this.a = adlwVar;
    }

    @Override // defpackage.admi, defpackage.acyh
    public final String a() {
        return "RequestWithImsiState";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:76|(1:78)(1:157)|79|(1:81)|82|83|(2:84|85)|(12:87|88|89|90|91|92|93|94|(5:96|97|98|99|(3:101|(1:103)|(2:105|(2:107|108)(2:109|110))(2:111|(2:128|129)(3:115|(2:126|127)|118)))(2:130|131))(1:144)|143|99|(0)(0))|150|89|90|91|92|93|94|(0)(0)|143|99|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0214, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0215, code lost:
    
        android.util.Log.w("InstanceID", "Never happens: can't find own package ".concat(r0.toString()));
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0290 A[Catch: IOException -> 0x0346, TRY_ENTER, TryCatch #6 {IOException -> 0x0346, blocks: (B:91:0x01e7, B:93:0x0204, B:94:0x0224, B:96:0x023e, B:98:0x0250, B:101:0x0290, B:103:0x0298, B:105:0x02a0, B:107:0x02a8, B:108:0x02ad, B:109:0x02ae, B:110:0x02c5, B:111:0x02c6, B:113:0x02ce, B:115:0x02d6, B:118:0x02f3, B:119:0x0331, B:124:0x02dd, B:126:0x0301, B:127:0x0313, B:128:0x0314, B:129:0x0326, B:130:0x0327, B:131:0x032c, B:135:0x025b, B:137:0x0261, B:138:0x026e, B:140:0x0276, B:142:0x0281, B:144:0x0286, B:147:0x0215, B:160:0x033a, B:161:0x0345), top: B:61:0x0133, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0327 A[Catch: IOException -> 0x0346, TryCatch #6 {IOException -> 0x0346, blocks: (B:91:0x01e7, B:93:0x0204, B:94:0x0224, B:96:0x023e, B:98:0x0250, B:101:0x0290, B:103:0x0298, B:105:0x02a0, B:107:0x02a8, B:108:0x02ad, B:109:0x02ae, B:110:0x02c5, B:111:0x02c6, B:113:0x02ce, B:115:0x02d6, B:118:0x02f3, B:119:0x0331, B:124:0x02dd, B:126:0x0301, B:127:0x0313, B:128:0x0314, B:129:0x0326, B:130:0x0327, B:131:0x032c, B:135:0x025b, B:137:0x0261, B:138:0x026e, B:140:0x0276, B:142:0x0281, B:144:0x0286, B:147:0x0215, B:160:0x033a, B:161:0x0345), top: B:61:0x0133, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0286 A[Catch: IOException -> 0x0346, TRY_LEAVE, TryCatch #6 {IOException -> 0x0346, blocks: (B:91:0x01e7, B:93:0x0204, B:94:0x0224, B:96:0x023e, B:98:0x0250, B:101:0x0290, B:103:0x0298, B:105:0x02a0, B:107:0x02a8, B:108:0x02ad, B:109:0x02ae, B:110:0x02c5, B:111:0x02c6, B:113:0x02ce, B:115:0x02d6, B:118:0x02f3, B:119:0x0331, B:124:0x02dd, B:126:0x0301, B:127:0x0313, B:128:0x0314, B:129:0x0326, B:130:0x0327, B:131:0x032c, B:135:0x025b, B:137:0x0261, B:138:0x026e, B:140:0x0276, B:142:0x0281, B:144:0x0286, B:147:0x0215, B:160:0x033a, B:161:0x0345), top: B:61:0x0133, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0364 A[Catch: MalformedURLException -> 0x0424, TryCatch #5 {MalformedURLException -> 0x0424, blocks: (B:36:0x035e, B:38:0x0364, B:39:0x0366, B:155:0x034d), top: B:154:0x034d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03a9 A[Catch: MalformedURLException -> 0x0428, TryCatch #1 {MalformedURLException -> 0x0428, blocks: (B:25:0x00a3, B:27:0x00cd, B:28:0x00de, B:31:0x00ea, B:33:0x00f0, B:41:0x037b, B:43:0x03a9, B:45:0x03d3, B:47:0x03e5, B:48:0x03ff, B:50:0x040d, B:51:0x0418, B:165:0x00fe, B:167:0x0112, B:169:0x00d6), top: B:24:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175 A[Catch: IOException -> 0x0348, TryCatch #3 {IOException -> 0x0348, blocks: (B:60:0x0127, B:63:0x0135, B:65:0x0142, B:68:0x014b, B:71:0x0158, B:74:0x0165, B:76:0x0175, B:79:0x0194, B:81:0x019c, B:82:0x01b0, B:157:0x0192), top: B:59:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023e A[Catch: IOException -> 0x0346, TRY_LEAVE, TryCatch #6 {IOException -> 0x0346, blocks: (B:91:0x01e7, B:93:0x0204, B:94:0x0224, B:96:0x023e, B:98:0x0250, B:101:0x0290, B:103:0x0298, B:105:0x02a0, B:107:0x02a8, B:108:0x02ad, B:109:0x02ae, B:110:0x02c5, B:111:0x02c6, B:113:0x02ce, B:115:0x02d6, B:118:0x02f3, B:119:0x0331, B:124:0x02dd, B:126:0x0301, B:127:0x0313, B:128:0x0314, B:129:0x0326, B:130:0x0327, B:131:0x032c, B:135:0x025b, B:137:0x0261, B:138:0x026e, B:140:0x0276, B:142:0x0281, B:144:0x0286, B:147:0x0215, B:160:0x033a, B:161:0x0345), top: B:61:0x0133, inners: #7 }] */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.lang.Object, vau] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, acyz] */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, vau] */
    @Override // defpackage.adll, defpackage.acyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adle.b():void");
    }

    @Override // defpackage.adll
    public final adjj f() {
        return adjj.MSG_TRANSITION_TO_REQUEST_WITH_IMSI;
    }

    @Override // defpackage.adll
    public final apkn g() {
        return apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE;
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
        this.a.J("RequestWithImsiState", message);
        int ordinal = adlw.av(message).ordinal();
        if (ordinal != 4) {
            if (ordinal != 7) {
                if (ordinal != 22) {
                    if (ordinal != 24) {
                        InputStream inputStream = null;
                        if (ordinal != 46) {
                            if (ordinal != 41) {
                                if (ordinal != 42) {
                                    return super.o(message, adjjVar);
                                }
                                this.a.D.d("Request with IMSI failed: IMSI lookup or header enrichment not successful", new Object[0]);
                                if (this.a.an()) {
                                    adlw adlwVar = this.a;
                                    adlwVar.ac(adlwVar.av);
                                } else {
                                    this.a.aH(apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, 403);
                                    adlw adlwVar2 = this.a;
                                    adlwVar2.ac(adlwVar2.an);
                                }
                                adlw adlwVar3 = this.a;
                                adlwVar3.u.a((HttpURLConnection) message.obj, null, "RequestWithImsiState");
                                return true;
                            }
                            HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
                            int i = message.arg2;
                            try {
                                try {
                                    try {
                                        inputStream = httpURLConnection.getInputStream();
                                        adlw adlwVar4 = this.a;
                                        adlwVar4.u.c(adlwVar4.s, adlwVar4.n, httpURLConnection);
                                        try {
                                            this.a.B(adjj.MSG_CONFIG_DOC, this.a.aK.x(inputStream));
                                            adlw adlwVar5 = this.a;
                                            adlwVar5.ac(adlwVar5.az);
                                        } catch (IOException | IllegalArgumentException unused) {
                                            adlw adlwVar6 = this.a;
                                            adlwVar6.ac(adlwVar6.ap);
                                        }
                                    } finally {
                                        this.a.u.a(httpURLConnection, inputStream, "RequestWithImsiState");
                                    }
                                } catch (adna e) {
                                    e = e;
                                    this.a.az(adjj.MSG_EXCEPTION_CAUGHT, i);
                                    this.a.aC(apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, 4);
                                    this.a.D.f(e, "Failed to parse configuration.", new Object[0]);
                                    this.a.K(apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE);
                                    return true;
                                }
                            } catch (IOException e2) {
                                e = e2;
                                this.a.az(adjj.MSG_EXCEPTION_CAUGHT, i);
                                this.a.aC(apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, 4);
                                this.a.D.f(e, "Failed to parse configuration.", new Object[0]);
                                this.a.K(apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE);
                                return true;
                            }
                            return true;
                        }
                        adlw adlwVar7 = this.a;
                        adlwVar7.u.a((HttpURLConnection) message.obj, null, "RequestWithImsiState");
                        this.a.aH(apkn.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, 401);
                        if (!aczv.V()) {
                            return false;
                        }
                        this.a.z.p(null);
                        adlw adlwVar8 = this.a;
                        adlwVar8.ac(adlwVar8.an);
                        return true;
                    }
                    this.a.aD(32);
                    return false;
                }
                this.a.aD(34);
                return false;
            }
            adlw adlwVar9 = this.a;
            adlwVar9.Q(adlwVar9.s, adlwVar9.n, adlw.s(message));
            this.a.C(adlw.av(message), message.arg1, message.arg2, message.obj);
            advh.i(this.a.s);
            return true;
        }
        this.a.aI(message.arg1);
        return false;
    }
}
