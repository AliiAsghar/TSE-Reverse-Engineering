package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeep implements aedw {
    private static final aiww a = new aiww(aedx.a);
    private final Context b;
    private final aegu c;
    private final Map d;
    private final atsg e;

    public aeep(Context context, aegu aeguVar, atsg atsgVar) {
        context.getClass();
        aeguVar.getClass();
        atsgVar.getClass();
        this.b = context;
        this.c = aeguVar;
        this.e = atsgVar;
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.aedw
    public final synchronized aday a(aecj aecjVar) {
        String cc;
        int i;
        String str;
        aptn aptnVar;
        apto aptoVar;
        aptq aptqVar;
        boolean z;
        aptl aptlVar;
        String str2;
        boolean z2;
        aecjVar.getClass();
        aday adayVar = (aday) this.d.get(aecjVar);
        if (adayVar != null) {
            return adayVar;
        }
        aiuz aiuzVar = new aiuz(this.b);
        aiuzVar.c("moirai");
        if (d.F(aecjVar.b, "")) {
            cc = "metadata.pb";
        } else {
            cc = a.cc(aecjVar, "metadata_{", ".role}.pb");
        }
        aiuzVar.d(cc);
        alob alobVar = aiuzVar.a;
        aptp aptpVar = aiwi.a;
        int i2 = aptpVar.b;
        switch (i2) {
            case 0:
                i = 7;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        if (i != 0) {
            int i3 = i - 1;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 5) {
                                    str = "defrag";
                                } else {
                                    throw new IllegalArgumentException("No transform specified");
                                }
                            } else {
                                if (i2 == 5) {
                                    aptlVar = (aptl) aptpVar.c;
                                } else {
                                    aptlVar = aptl.a;
                                }
                                if (aptlVar.c.size() > 0) {
                                    alob alobVar2 = new alob();
                                    for (aptk aptkVar : aptlVar.c) {
                                        if (1 != (aptkVar.b & 1)) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        d.s(z2);
                                        if ((aptkVar.b & 2) != 0) {
                                            alobVar2.h(aptkVar.c + "=" + aiwi.a(aptkVar.d));
                                        } else {
                                            alobVar2.h(aptkVar.c);
                                        }
                                    }
                                    str2 = "(" + new algs(",").d(alobVar2.g()) + ")";
                                } else {
                                    str2 = "";
                                }
                                str = String.valueOf(aptlVar.b).concat(str2);
                            }
                        } else {
                            if (i2 == 4) {
                                aptqVar = (aptq) aptpVar.c;
                            } else {
                                aptqVar = aptq.a;
                            }
                            if (1 != (aptqVar.b & 1)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            d.s(z);
                            str = "zip(target=" + aiwi.a(aptqVar.c) + ")";
                        }
                    } else {
                        if (i2 == 3) {
                            aptoVar = (apto) aptpVar.c;
                        } else {
                            aptoVar = apto.a;
                        }
                        if (aptoVar.b == 1) {
                            str = "integrity(sha256=" + aiwi.a((String) aptoVar.c) + ")";
                        } else {
                            str = "integrity";
                        }
                    }
                } else {
                    if (i2 == 2) {
                        aptnVar = (aptn) aptpVar.c;
                    } else {
                        aptnVar = aptn.a;
                    }
                    int i4 = aptnVar.b;
                    if (i4 == 1) {
                        str = "encrypt(aes_gcm_key=" + aiwi.a((String) aptnVar.c) + ")";
                    } else if (i4 == 2) {
                        str = "encrypt(aes_gcm_hkdf_key=" + aiwi.a((String) aptnVar.c) + ")";
                    } else {
                        str = "encrypt";
                    }
                }
            } else {
                str = "compress";
            }
            alobVar.h(str);
            Uri a2 = aiuzVar.a();
            a2.getClass();
            aiwl a3 = aiwm.a();
            a3.e(a2);
            a3.d(aedx.a);
            a3.c(a);
            aday adayVar2 = new aday(this.c, this.e.n(a3.a()), (byte[]) null);
            this.d.put(aecjVar, adayVar2);
            return adayVar2;
        }
        throw null;
    }
}
