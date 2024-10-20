package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class anzu implements antb {
    private final /* synthetic */ int a;

    public /* synthetic */ anzu(int i) {
        this.a = i;
    }

    @Override // defpackage.antb
    public final anme a(anuf anufVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        antv antvVar = aoam.a;
                        if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
                            try {
                                aozb aozbVar = ((anua) anufVar).c;
                                aozs aozsVar = aozs.a;
                                apcc apccVar = apcc.a;
                                anvt anvtVar = (anvt) apag.parseFrom(anvt.a, aozbVar, aozs.a);
                                if (anvtVar.c == 0) {
                                    anvv anvvVar = anvtVar.d;
                                    if (anvvVar == null) {
                                        anvvVar = anvv.a;
                                    }
                                    return aoab.F(aoam.b(anvvVar, anvtVar.e.d()), aojh.A(anvtVar.e.H()));
                                }
                                throw new GeneralSecurityException("Only version 0 keys are accepted");
                            } catch (apba unused) {
                                throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingKey failed");
                            }
                        }
                        throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters");
                    }
                    antv antvVar2 = aoal.a;
                    if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                        try {
                            aozb aozbVar2 = ((anua) anufVar).c;
                            aozs aozsVar2 = aozs.a;
                            apcc apccVar2 = apcc.a;
                            anvk anvkVar = (anvk) apag.parseFrom(anvk.a, aozbVar2, aozs.a);
                            if (anvkVar.c == 0) {
                                anvm anvmVar = anvkVar.d;
                                if (anvmVar == null) {
                                    anvmVar = anvm.a;
                                }
                                return anzx.F(aoal.b(anvmVar, anvkVar.e.d()), aojh.A(anvkVar.e.H()));
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        } catch (apba unused2) {
                            throw new GeneralSecurityException("Parsing AesCtrHmacStreamingKey failed");
                        }
                    }
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters");
                }
                ansy ansyVar = anzv.a;
                anua anuaVar = (anua) anufVar;
                if (anuaVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    try {
                        aozb aozbVar3 = ((anua) anufVar).c;
                        aozs aozsVar3 = aozs.a;
                        apcc apccVar3 = apcc.a;
                        anxx anxxVar = (anxx) apag.parseFrom(anxx.a, aozbVar3, aozs.a);
                        if (anxxVar.c == 0) {
                            anxy anxyVar = anxxVar.d;
                            if (anxyVar == null) {
                                anxyVar = anxy.a;
                            }
                            if (anxyVar.c == 0) {
                                BigInteger d = anzv.d(anxyVar.e);
                                int bitLength = d.bitLength();
                                BigInteger d2 = anzv.d(anxyVar.f);
                                BigInteger bigInteger = anzg.e;
                                anzd anzdVar = new anzd();
                                ansy ansyVar2 = anzv.b;
                                anxw anxwVar = anxyVar.d;
                                if (anxwVar == null) {
                                    anxwVar = anxw.a;
                                }
                                anwu b = anwu.b(anxwVar.b);
                                if (b == null) {
                                    b = anwu.UNRECOGNIZED;
                                }
                                anzdVar.b = (anze) ansyVar2.b(b);
                                ansy ansyVar3 = anzv.b;
                                anxw anxwVar2 = anxyVar.d;
                                if (anxwVar2 == null) {
                                    anxwVar2 = anxw.a;
                                }
                                anwu b2 = anwu.b(anxwVar2.c);
                                if (b2 == null) {
                                    b2 = anwu.UNRECOGNIZED;
                                }
                                anzdVar.c = (anze) ansyVar3.b(b2);
                                anzdVar.a = d2;
                                anzdVar.b(bitLength);
                                anxw anxwVar3 = anxyVar.d;
                                if (anxwVar3 == null) {
                                    anxwVar3 = anxw.a;
                                }
                                anzdVar.c(anxwVar3.d);
                                anzdVar.d = (anzf) anzv.a.b(((anua) anufVar).d);
                                anzj R = aode.R(anzdVar.a(), d, ((anua) anufVar).e);
                                anzh anzhVar = new anzh();
                                anzhVar.g = R;
                                anzhVar.F(anzv.e(anxxVar.f), anzv.e(anxxVar.g));
                                anzhVar.a = anzv.e(anxxVar.e);
                                anzhVar.E(anzv.e(anxxVar.h), anzv.e(anxxVar.i));
                                anzhVar.f = anzv.e(anxxVar.j);
                                return anzhVar.a();
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba | IllegalArgumentException unused3) {
                        throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(anuaVar.a)));
            }
            ansy ansyVar4 = anzs.a;
            anua anuaVar2 = (anua) anufVar;
            if (anuaVar2.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                try {
                    aozb aozbVar4 = ((anua) anufVar).c;
                    aozs aozsVar4 = aozs.a;
                    apcc apccVar4 = apcc.a;
                    anxt anxtVar = (anxt) apag.parseFrom(anxt.a, aozbVar4, aozs.a);
                    if (anxtVar.c == 0) {
                        anxu anxuVar = anxtVar.d;
                        if (anxuVar == null) {
                            anxuVar = anxu.a;
                        }
                        if (anxuVar.c == 0) {
                            BigInteger d3 = anzs.d(anxuVar.e);
                            int bitLength2 = d3.bitLength();
                            BigInteger d4 = anzs.d(anxuVar.f);
                            BigInteger bigInteger2 = anyz.e;
                            anyw anywVar = new anyw();
                            ansy ansyVar5 = anzs.b;
                            anxs anxsVar = anxuVar.d;
                            if (anxsVar == null) {
                                anxsVar = anxs.a;
                            }
                            anwu b3 = anwu.b(anxsVar.b);
                            if (b3 == null) {
                                b3 = anwu.UNRECOGNIZED;
                            }
                            anywVar.b = (anyx) ansyVar5.b(b3);
                            anywVar.a = d4;
                            anywVar.b(bitLength2);
                            anywVar.c = (anyy) anzs.a.b(((anua) anufVar).d);
                            anzb S = aode.S(anywVar.a(), d3, ((anua) anufVar).e);
                            anzh anzhVar2 = new anzh();
                            anzhVar2.g = S;
                            anzhVar2.H(anzs.e(anxtVar.f), anzs.e(anxtVar.g));
                            anzhVar2.a = anzs.e(anxtVar.e);
                            anzhVar2.G(anzs.e(anxtVar.h), anzs.e(anxtVar.i));
                            anzhVar2.f = anzs.e(anxtVar.j);
                            return anzhVar2.b();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (apba | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(anuaVar2.a)));
        }
        ansy ansyVar6 = anzv.a;
        anua anuaVar3 = (anua) anufVar;
        if (anuaVar3.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            try {
                aozb aozbVar5 = ((anua) anufVar).c;
                aozs aozsVar5 = aozs.a;
                apcc apccVar5 = apcc.a;
                anxy anxyVar2 = (anxy) apag.parseFrom(anxy.a, aozbVar5, aozs.a);
                if (anxyVar2.c == 0) {
                    BigInteger d5 = anzv.d(anxyVar2.e);
                    int bitLength3 = d5.bitLength();
                    BigInteger bigInteger3 = anzg.e;
                    anzd anzdVar2 = new anzd();
                    ansy ansyVar7 = anzv.b;
                    anxw anxwVar4 = anxyVar2.d;
                    if (anxwVar4 == null) {
                        anxwVar4 = anxw.a;
                    }
                    anwu b4 = anwu.b(anxwVar4.b);
                    if (b4 == null) {
                        b4 = anwu.UNRECOGNIZED;
                    }
                    anzdVar2.b = (anze) ansyVar7.b(b4);
                    ansy ansyVar8 = anzv.b;
                    anxw anxwVar5 = anxyVar2.d;
                    if (anxwVar5 == null) {
                        anxwVar5 = anxw.a;
                    }
                    anwu b5 = anwu.b(anxwVar5.c);
                    if (b5 == null) {
                        b5 = anwu.UNRECOGNIZED;
                    }
                    anzdVar2.c = (anze) ansyVar8.b(b5);
                    anzdVar2.a = anzv.d(anxyVar2.f);
                    anzdVar2.b(bitLength3);
                    anxw anxwVar6 = anxyVar2.d;
                    if (anxwVar6 == null) {
                        anxwVar6 = anxw.a;
                    }
                    anzdVar2.c(anxwVar6.d);
                    anzdVar2.d = (anzf) anzv.a.b(((anua) anufVar).d);
                    return aode.R(anzdVar2.a(), d5, ((anua) anufVar).e);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (apba | IllegalArgumentException unused5) {
                throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(anuaVar3.a)));
    }
}
