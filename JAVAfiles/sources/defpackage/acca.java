package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.phenotype.ExperimentTokens;
import io.grpc.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acca implements acig {
    private final /* synthetic */ int a;

    public /* synthetic */ acca(int i) {
        this.a = i;
    }

    @Override // defpackage.acig
    public final Object a(acir acirVar) {
        abra abraVar;
        alog alogVar;
        alog alogVar2 = null;
        int i = 0;
        switch (this.a) {
            case 0:
                acce.n.g("Re-registration completed");
                return arnb.a;
            case 1:
                Executor executor = abpn.a;
                if (acirVar.l()) {
                    return (Bundle) acirVar.h();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(String.valueOf(acirVar.g()))));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", acirVar.g());
            case 2:
                aaoc aaocVar = acdo.a;
                return null;
            case 3:
                ExperimentTokens experimentTokens = (ExperimentTokens) acirVar.h();
                aozy createBuilder = ahtv.a.createBuilder();
                String str = experimentTokens.b;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ahtv ahtvVar = (ahtv) createBuilder.b;
                str.getClass();
                ahtvVar.b |= 1;
                ahtvVar.c = str;
                byte[] bArr = experimentTokens.c;
                if (bArr != null) {
                    createBuilder.as(aozb.w(bArr));
                }
                byte[][] bArr2 = experimentTokens.i;
                if (bArr2 != null) {
                    for (byte[] bArr3 : bArr2) {
                        if (bArr3 != null) {
                            createBuilder.as(aozb.w(bArr3));
                        }
                    }
                }
                byte[][] bArr4 = experimentTokens.d;
                if (bArr4 != null) {
                    for (byte[] bArr5 : bArr4) {
                        aozb w = aozb.w(bArr5);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ahtv ahtvVar2 = (ahtv) createBuilder.b;
                        apax apaxVar = ahtvVar2.e;
                        if (!apaxVar.c()) {
                            ahtvVar2.e = apag.mutableCopy(apaxVar);
                        }
                        ahtvVar2.e.add(w);
                    }
                }
                byte[][] bArr6 = experimentTokens.e;
                if (bArr6 != null) {
                    for (byte[] bArr7 : bArr6) {
                        aozb w2 = aozb.w(bArr7);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ahtv ahtvVar3 = (ahtv) createBuilder.b;
                        apax apaxVar2 = ahtvVar3.f;
                        if (!apaxVar2.c()) {
                            ahtvVar3.f = apag.mutableCopy(apaxVar2);
                        }
                        ahtvVar3.f.add(w2);
                    }
                }
                byte[][] bArr8 = experimentTokens.f;
                if (bArr8 != null) {
                    for (byte[] bArr9 : bArr8) {
                        aozb w3 = aozb.w(bArr9);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ahtv ahtvVar4 = (ahtv) createBuilder.b;
                        apax apaxVar3 = ahtvVar4.g;
                        if (!apaxVar3.c()) {
                            ahtvVar4.g = apag.mutableCopy(apaxVar3);
                        }
                        ahtvVar4.g.add(w3);
                    }
                }
                byte[][] bArr10 = experimentTokens.g;
                if (bArr10 != null) {
                    for (byte[] bArr11 : bArr10) {
                        aozb w4 = aozb.w(bArr11);
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ahtv ahtvVar5 = (ahtv) createBuilder.b;
                        apax apaxVar4 = ahtvVar5.h;
                        if (!apaxVar4.c()) {
                            ahtvVar5.h = apag.mutableCopy(apaxVar4);
                        }
                        ahtvVar5.h.add(w4);
                    }
                }
                int[] iArr = experimentTokens.h;
                if (iArr != null) {
                    while (i < iArr.length) {
                        int i2 = iArr[i];
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        ahtv ahtvVar6 = (ahtv) createBuilder.b;
                        apao apaoVar = ahtvVar6.i;
                        if (!apaoVar.c()) {
                            ahtvVar6.i = apag.mutableCopy(apaoVar);
                        }
                        ahtvVar6.i.g(i2);
                        i++;
                    }
                }
                return (ahtv) createBuilder.s();
            case 4:
                Exception g = acirVar.g();
                if (g != null) {
                    if (g instanceof abra) {
                        abraVar = (abra) g;
                    } else if (g instanceof aqwb) {
                        Status c = Status.c((aqwb) g);
                        Status.Code code = Status.Code.OK;
                        int ordinal = c.getCode().ordinal();
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    if (ordinal != 7) {
                                        if (ordinal != 13) {
                                            if (ordinal != 14) {
                                                abraVar = new abra(new com.google.android.gms.common.api.Status(13, c.getDescription()));
                                            } else {
                                                abraVar = new abra(new com.google.android.gms.common.api.Status(7, c.getDescription()));
                                            }
                                        } else {
                                            abraVar = new abra(new com.google.android.gms.common.api.Status(8, c.getDescription()));
                                        }
                                    } else {
                                        abraVar = new abra(new com.google.android.gms.common.api.Status(9011, c.getDescription()));
                                    }
                                } else {
                                    abraVar = new abra(new com.google.android.gms.common.api.Status(9013, c.getDescription()));
                                }
                            } else {
                                abraVar = new abra(new com.google.android.gms.common.api.Status(15, c.getDescription()));
                            }
                        } else {
                            abraVar = new abra(new com.google.android.gms.common.api.Status(9012, c.getDescription()));
                        }
                    } else {
                        abraVar = new abra(new com.google.android.gms.common.api.Status(13, g.toString()));
                    }
                    return actx.r(abraVar);
                }
                return acirVar;
            case 5:
                return new aibk(((ahyc) acirVar.h()).a);
            case 6:
                ahyg ahygVar = (ahyg) acirVar.h();
                String str2 = ahygVar.status;
                int f = ahop.f(str2);
                if (!abgj.g(f)) {
                    ArrayList arrayList = new ArrayList();
                    ahyl[] ahylVarArr = ahygVar.predictions;
                    if (ahylVarArr != null) {
                        while (i < ahylVarArr.length) {
                            ahyl ahylVar = ahylVarArr[i];
                            ahym ahymVar = ahylVar.place;
                            if (ahymVar != null) {
                                Double d = ahylVar.likelihood;
                                if (d != null) {
                                    String[] strArr = ahygVar.htmlAttributions;
                                    if (strArr != null) {
                                        alogVar = alog.p(strArr);
                                    } else {
                                        alogVar = null;
                                    }
                                    aiba d2 = ahyk.d(ahymVar, alogVar);
                                    double doubleValue = d.doubleValue();
                                    Double valueOf = Double.valueOf(0.0d);
                                    Double valueOf2 = Double.valueOf(1.0d);
                                    albo.R(alst.d(valueOf, valueOf2).a(d), "Likelihood must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, d);
                                    arrayList.add(new ahzs(d2, doubleValue));
                                    i++;
                                } else {
                                    throw new abra(new com.google.android.gms.common.api.Status(8, "Unexpected server error: PlaceLikelihood returned without a likelihood value"));
                                }
                            } else {
                                throw new abra(new com.google.android.gms.common.api.Status(8, "Unexpected server error: PlaceLikelihood returned without a Place value"));
                            }
                        }
                    }
                    return new aibt(alog.n(arrayList));
                }
                throw new abra(new com.google.android.gms.common.api.Status(f, ahop.g(str2, ahygVar.errorMessage)));
            case 7:
                ahye ahyeVar = (ahye) acirVar.h();
                String str3 = ahyeVar.status;
                int f2 = ahop.f(str3);
                if (!abgj.g(f2)) {
                    ahym ahymVar2 = ahyeVar.result;
                    String[] strArr2 = ahyeVar.htmlAttributions;
                    if (strArr2 != null) {
                        alogVar2 = alog.p(strArr2);
                    }
                    return new aibm(ahyk.d(ahymVar2, alogVar2));
                }
                throw new abra(new com.google.android.gms.common.api.Status(f2, ahop.g(str3, ahyeVar.errorMessage)));
            case 8:
                Bundle bundle = (Bundle) acirVar.i(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if (!"RST".equals(string2)) {
                        if (string2 != null) {
                            throw new IOException(string2);
                        }
                        Log.w("FirebaseInstanceId", "Unexpected response: ".concat(bundle.toString()), new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    throw new IOException("INSTANCE_ID_RESET");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case 9:
                return ((aojh) acirVar.h()).a;
            case 10:
                return -1;
            case 11:
                return 403;
            default:
                Bundle bundle2 = (Bundle) acirVar.i(IOException.class);
                if (bundle2 != null) {
                    String string3 = bundle2.getString("registration_id");
                    if (string3 != null || (string3 = bundle2.getString("unregistered")) != null) {
                        return string3;
                    }
                    String string4 = bundle2.getString("error");
                    if (!"RST".equals(string4)) {
                        if (string4 != null) {
                            throw new IOException(string4);
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle2.toString()), new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    throw new IOException("INSTANCE_ID_RESET");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
