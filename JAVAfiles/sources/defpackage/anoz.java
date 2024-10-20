package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class anoz implements ants {
    private final /* synthetic */ int a;

    public /* synthetic */ anoz(int i) {
        this.a = i;
    }

    @Override // defpackage.ants
    public final anme a(anuf anufVar) {
        switch (this.a) {
            case 0:
                antv antvVar = anpc.a;
                anub anubVar = (anub) anufVar;
                if (anubVar.b.b.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    try {
                        aozb aozbVar = ((anub) anufVar).b.c;
                        aozs aozsVar = aozs.a;
                        apcc apccVar = apcc.a;
                        anxo anxoVar = (anxo) apag.parseFrom(anxo.a, aozbVar, aozs.a);
                        anxp b = anxp.b(anubVar.b.d);
                        if (b == null) {
                            b = anxp.UNRECOGNIZED;
                        }
                        return anpc.a(anxoVar, b);
                    } catch (apba e) {
                        throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar.b.b)));
            case 1:
                antv antvVar2 = anot.a;
                anub anubVar2 = (anub) anufVar;
                if (anubVar2.b.b.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    try {
                        aozb aozbVar2 = ((anub) anufVar).b.c;
                        aozs aozsVar2 = aozs.a;
                        apcc apccVar2 = apcc.a;
                        String str = ((anxm) apag.parseFrom(anxm.a, aozbVar2, aozs.a)).b;
                        anxp b2 = anxp.b(anubVar2.b.d);
                        if (b2 == null) {
                            b2 = anxp.UNRECOGNIZED;
                        }
                        return new anos(str, anot.a(b2));
                    } catch (apba e2) {
                        throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar2.b.b)));
            case 2:
                antv antvVar3 = anpn.a;
                anub anubVar3 = (anub) anufVar;
                if (anubVar3.b.b.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        aozb aozbVar3 = ((anub) anufVar).b.c;
                        aozs aozsVar3 = aozs.a;
                        apcc apccVar3 = apcc.a;
                        anvj anvjVar = (anvj) apag.parseFrom(anvj.a, aozbVar3, aozs.a);
                        anww anwwVar = anvjVar.d;
                        if (anwwVar == null) {
                            anwwVar = anww.a;
                        }
                        if (anwwVar.e == 0) {
                            aqxc aqxcVar = new aqxc(null, null, null);
                            anvo anvoVar = anvjVar.c;
                            if (anvoVar == null) {
                                anvoVar = anvo.a;
                            }
                            aqxcVar.g(anvoVar.d);
                            anww anwwVar2 = anvjVar.d;
                            if (anwwVar2 == null) {
                                anwwVar2 = anww.a;
                            }
                            aqxcVar.h(anwwVar2.d);
                            anvo anvoVar2 = anvjVar.c;
                            if (anvoVar2 == null) {
                                anvoVar2 = anvo.a;
                            }
                            anvp anvpVar = anvoVar2.c;
                            if (anvpVar == null) {
                                anvpVar = anvp.a;
                            }
                            aqxcVar.i(anvpVar.b);
                            anww anwwVar3 = anvjVar.d;
                            if (anwwVar3 == null) {
                                anwwVar3 = anww.a;
                            }
                            anwx anwxVar = anwwVar3.c;
                            if (anwxVar == null) {
                                anwxVar = anwx.a;
                            }
                            aqxcVar.j(anwxVar.c);
                            anww anwwVar4 = anvjVar.d;
                            if (anwwVar4 == null) {
                                anwwVar4 = anww.a;
                            }
                            anwx anwxVar2 = anwwVar4.c;
                            if (anwxVar2 == null) {
                                anwxVar2 = anwx.a;
                            }
                            anwu b3 = anwu.b(anwxVar2.b);
                            if (b3 == null) {
                                b3 = anwu.UNRECOGNIZED;
                            }
                            aqxcVar.c = anpn.a(b3);
                            anxp b4 = anxp.b(anubVar3.b.d);
                            if (b4 == null) {
                                b4 = anxp.UNRECOGNIZED;
                            }
                            aqxcVar.f = anpn.b(b4);
                            return aqxcVar.f();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba e3) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e3);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar3.b.b)));
            case 3:
                antv antvVar4 = anpo.a;
                anub anubVar4 = (anub) anufVar;
                if (anubVar4.b.b.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        aozb aozbVar4 = ((anub) anufVar).b.c;
                        aozs aozsVar4 = aozs.a;
                        apcc apccVar4 = apcc.a;
                        anvr anvrVar = (anvr) apag.parseFrom(anvr.a, aozbVar4, aozs.a);
                        aoad aoadVar = new aoad((byte[]) null, (byte[]) null);
                        aoadVar.n(anvrVar.d);
                        anvs anvsVar = anvrVar.c;
                        if (anvsVar == null) {
                            anvsVar = anvs.a;
                        }
                        aoadVar.m(anvsVar.b);
                        aoadVar.o();
                        anxp b5 = anxp.b(anubVar4.b.d);
                        if (b5 == null) {
                            b5 = anxp.UNRECOGNIZED;
                        }
                        aoadVar.a = anpo.a(b5);
                        return aoadVar.l();
                    } catch (apba e4) {
                        throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e4);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar4.b.b)));
            case 4:
                antv antvVar5 = anpr.a;
                anub anubVar5 = (anub) anufVar;
                if (anubVar5.b.b.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        aozb aozbVar5 = ((anub) anufVar).b.c;
                        aozs aozsVar5 = aozs.a;
                        apcc apccVar5 = apcc.a;
                        anvx anvxVar = (anvx) apag.parseFrom(anvx.a, aozbVar5, aozs.a);
                        if (anvxVar.c == 0) {
                            aoad aoadVar2 = new aoad((char[]) null);
                            aoadVar2.j(anvxVar.b);
                            aoadVar2.i();
                            aoadVar2.k();
                            anxp b6 = anxp.b(anubVar5.b.d);
                            if (b6 == null) {
                                b6 = anxp.UNRECOGNIZED;
                            }
                            aoadVar2.a = anpr.a(b6);
                            return aoadVar2.h();
                        }
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    } catch (apba e5) {
                        throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e5);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar5.b.b)));
            case 5:
                antv antvVar6 = anps.a;
                anub anubVar6 = (anub) anufVar;
                if (anubVar6.b.b.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        aozb aozbVar6 = ((anub) anufVar).b.c;
                        aozs aozsVar6 = aozs.a;
                        apcc apccVar6 = apcc.a;
                        anvz anvzVar = (anvz) apag.parseFrom(anvz.a, aozbVar6, aozs.a);
                        if (anvzVar.c == 0) {
                            aqrk aqrkVar = new aqrk((char[]) null);
                            aqrkVar.i(anvzVar.b);
                            anxp b7 = anxp.b(anubVar6.b.d);
                            if (b7 == null) {
                                b7 = anxp.UNRECOGNIZED;
                            }
                            aqrkVar.b = anps.a(b7);
                            return aqrkVar.h();
                        }
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    } catch (apba e6) {
                        throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e6);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar6.b.b)));
            case 6:
                antv antvVar7 = anpv.a;
                anub anubVar7 = (anub) anufVar;
                if (anubVar7.b.b.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        aozb aozbVar7 = ((anub) anufVar).b.c;
                        aozs aozsVar7 = aozs.a;
                        apcc apccVar7 = apcc.a;
                        anxp b8 = anxp.b(anubVar7.b.d);
                        if (b8 == null) {
                            b8 = anxp.UNRECOGNIZED;
                        }
                        return new anom(anpv.a(b8));
                    } catch (apba e7) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar7.b.b)));
            case 7:
                antv antvVar8 = anqe.a;
                anub anubVar8 = (anub) anufVar;
                if (anubVar8.b.b.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    try {
                        aozb aozbVar8 = ((anub) anufVar).b.c;
                        aozs aozsVar8 = aozs.a;
                        apcc apccVar8 = apcc.a;
                        anya anyaVar = (anya) apag.parseFrom(anya.a, aozbVar8, aozs.a);
                        if (anyaVar.c == 0) {
                            anxp b9 = anxp.b(anubVar8.b.d);
                            if (b9 == null) {
                                b9 = anxp.UNRECOGNIZED;
                            }
                            anph a = anqe.a(b9);
                            anyb anybVar = anyaVar.d;
                            if (anybVar == null) {
                                anybVar = anyb.a;
                            }
                            return anpi.F(a, anybVar.b);
                        }
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    } catch (apba e8) {
                        throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e8);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar8.b.b)));
            case 8:
                antv antvVar9 = anqf.a;
                anub anubVar9 = (anub) anufVar;
                if (anubVar9.b.b.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        aozb aozbVar9 = ((anub) anufVar).b.c;
                        aozs aozsVar9 = aozs.a;
                        apcc apccVar9 = apcc.a;
                        if (((anyd) apag.parseFrom(anyd.a, aozbVar9, aozs.a)).b == 0) {
                            anxp b10 = anxp.b(anubVar9.b.d);
                            if (b10 == null) {
                                b10 = anxp.UNRECOGNIZED;
                            }
                            return new anpm(anqf.a(b10));
                        }
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    } catch (apba e9) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e9);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar9.b.b)));
            case 9:
                antv antvVar10 = anqq.a;
                anub anubVar10 = (anub) anufVar;
                if (anubVar10.b.b.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    try {
                        aozb aozbVar10 = ((anub) anufVar).b.c;
                        aozs aozsVar10 = aozs.a;
                        apcc apccVar10 = apcc.a;
                        anwb anwbVar = (anwb) apag.parseFrom(anwb.a, aozbVar10, aozs.a);
                        if (anwbVar.c == 0) {
                            aqrk aqrkVar2 = new aqrk(null, null);
                            aqrkVar2.f(anwbVar.b);
                            anxp b11 = anxp.b(anubVar10.b.d);
                            if (b11 == null) {
                                b11 = anxp.UNRECOGNIZED;
                            }
                            aqrkVar2.b = anqq.a(b11);
                            return aqrkVar2.e();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba e10) {
                        throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: ".concat(String.valueOf(anubVar10.b.b)));
            case 10:
                ansy ansyVar = anrh.a;
                anub anubVar11 = (anub) anufVar;
                if (anubVar11.b.b.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    try {
                        aozb aozbVar11 = ((anub) anufVar).b.c;
                        aozs aozsVar11 = aozs.a;
                        apcc apccVar11 = apcc.a;
                        anxb anxbVar = (anxb) apag.parseFrom(anxb.a, aozbVar11, aozs.a);
                        anxp b12 = anxp.b(anubVar11.b.d);
                        if (b12 == null) {
                            b12 = anxp.UNRECOGNIZED;
                        }
                        anxc anxcVar = anxbVar.c;
                        if (anxcVar == null) {
                            anxcVar = anxc.a;
                        }
                        return anrh.a(b12, anxcVar);
                    } catch (apba e11) {
                        throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e11);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar11.b.b)));
            case 11:
                ansy ansyVar2 = anrx.a;
                anub anubVar12 = (anub) anufVar;
                if (anubVar12.b.b.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    try {
                        aozb aozbVar12 = ((anub) anufVar).b.c;
                        aozs aozsVar12 = aozs.a;
                        apcc apccVar12 = apcc.a;
                        anwk anwkVar = (anwk) apag.parseFrom(anwk.a, aozbVar12, aozs.a);
                        anxp b13 = anxp.b(anubVar12.b.d);
                        if (b13 == null) {
                            b13 = anxp.UNRECOGNIZED;
                        }
                        anwl anwlVar = anwkVar.c;
                        if (anwlVar == null) {
                            anwlVar = anwl.a;
                        }
                        return anrx.b(b13, anwlVar);
                    } catch (apba e12) {
                        throw new GeneralSecurityException("Parsing EciesParameters failed: ", e12);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar12.b.b)));
            case 12:
                antv antvVar11 = anva.a;
                anub anubVar13 = (anub) anufVar;
                if (anubVar13.b.b.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        aozb aozbVar13 = ((anub) anufVar).b.c;
                        aozs aozsVar13 = aozs.a;
                        apcc apccVar13 = apcc.a;
                        anvg anvgVar = (anvg) apag.parseFrom(anvg.a, aozbVar13, aozs.a);
                        arbj arbjVar = new arbj((char[]) null);
                        arbjVar.e(anvgVar.c);
                        anvh anvhVar = anvgVar.d;
                        if (anvhVar == null) {
                            anvhVar = anvh.a;
                        }
                        arbjVar.f(anvhVar.b);
                        anxp b14 = anxp.b(anubVar13.b.d);
                        if (b14 == null) {
                            b14 = anxp.UNRECOGNIZED;
                        }
                        arbjVar.a = anva.a(b14);
                        return arbjVar.d();
                    } catch (apba e13) {
                        throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e13);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar13.b.b)));
            case 13:
                ansy ansyVar3 = anvc.a;
                anub anubVar14 = (anub) anufVar;
                if (anubVar14.b.b.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        aozb aozbVar14 = ((anub) anufVar).b.c;
                        aozs aozsVar14 = aozs.a;
                        apcc apccVar14 = apcc.a;
                        anww anwwVar5 = (anww) apag.parseFrom(anww.a, aozbVar14, aozs.a);
                        if (anwwVar5.e == 0) {
                            aoad aoadVar3 = new aoad((byte[]) null);
                            aoadVar3.f(anwwVar5.d);
                            anwx anwxVar3 = anwwVar5.c;
                            if (anwxVar3 == null) {
                                anwxVar3 = anwx.a;
                            }
                            aoadVar3.g(anwxVar3.c);
                            ansy ansyVar4 = anvc.b;
                            anwx anwxVar4 = anwwVar5.c;
                            if (anwxVar4 == null) {
                                anwxVar4 = anwx.a;
                            }
                            anwu b15 = anwu.b(anwxVar4.b);
                            if (b15 == null) {
                                b15 = anwu.UNRECOGNIZED;
                            }
                            aoadVar3.a = (anut) ansyVar4.b(b15);
                            ansy ansyVar5 = anvc.a;
                            anxp b16 = anxp.b(anubVar14.b.d);
                            if (b16 == null) {
                                b16 = anxp.UNRECOGNIZED;
                            }
                            aoadVar3.b = (anuu) ansyVar5.b(b16);
                            return aoadVar3.e();
                        }
                        throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + anwwVar5.e);
                    } catch (apba e14) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: ", e14);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar14.b.b)));
            case 14:
                antv antvVar12 = anzo.a;
                anub anubVar15 = (anub) anufVar;
                if (anubVar15.b.b.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    try {
                        aozb aozbVar15 = ((anub) anufVar).b.c;
                        aozs aozsVar15 = aozs.a;
                        apcc apccVar15 = apcc.a;
                        anwf anwfVar = (anwf) apag.parseFrom(anwf.a, aozbVar15, aozs.a);
                        anwg anwgVar = anwfVar.c;
                        if (anwgVar == null) {
                            anwgVar = anwg.a;
                        }
                        anwu b17 = anwu.b(anwgVar.b);
                        if (b17 == null) {
                            b17 = anwu.UNRECOGNIZED;
                        }
                        anyf f = anzo.f(b17);
                        anwg anwgVar2 = anwfVar.c;
                        if (anwgVar2 == null) {
                            anwgVar2 = anwg.a;
                        }
                        int aT = a.aT(anwgVar2.d);
                        if (aT == 0) {
                            aT = 1;
                        }
                        anyg h = anzo.h(aT);
                        anwg anwgVar3 = anwfVar.c;
                        if (anwgVar3 == null) {
                            anwgVar3 = anwg.a;
                        }
                        anws b18 = anws.b(anwgVar3.c);
                        if (b18 == null) {
                            b18 = anws.UNRECOGNIZED;
                        }
                        anye e15 = anzo.e(b18);
                        anxp b19 = anxp.b(anubVar15.b.d);
                        if (b19 == null) {
                            b19 = anxp.UNRECOGNIZED;
                        }
                        return anme.q(h, e15, f, anzo.g(b19));
                    } catch (apba e16) {
                        throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e16);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar15.b.b)));
            case 15:
                ansy ansyVar6 = anzp.a;
                anub anubVar16 = (anub) anufVar;
                if (anubVar16.b.b.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    try {
                        aozb aozbVar16 = ((anub) anufVar).b.c;
                        aozs aozsVar16 = aozs.a;
                        apcc apccVar16 = apcc.a;
                        if (((anwp) apag.parseFrom(anwp.a, aozbVar16, aozs.a)).b == 0) {
                            ansy ansyVar7 = anzp.a;
                            anxp b20 = anxp.b(anubVar16.b.d);
                            if (b20 == null) {
                                b20 = anxp.UNRECOGNIZED;
                            }
                            return new anyn((anym) ansyVar7.b(b20));
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba e17) {
                        throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e17);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar16.b.b)));
            case 16:
                ansy ansyVar8 = anzs.a;
                anub anubVar17 = (anub) anufVar;
                if (anubVar17.b.b.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    try {
                        aozb aozbVar17 = ((anub) anufVar).b.c;
                        aozs aozsVar17 = aozs.a;
                        apcc apccVar17 = apcc.a;
                        anxr anxrVar = (anxr) apag.parseFrom(anxr.a, aozbVar17, aozs.a);
                        BigInteger bigInteger = anyz.e;
                        anyw anywVar = new anyw();
                        ansy ansyVar9 = anzs.b;
                        anxs anxsVar = anxrVar.c;
                        if (anxsVar == null) {
                            anxsVar = anxs.a;
                        }
                        anwu b21 = anwu.b(anxsVar.b);
                        if (b21 == null) {
                            b21 = anwu.UNRECOGNIZED;
                        }
                        anywVar.b = (anyx) ansyVar9.b(b21);
                        anywVar.a = anzs.d(anxrVar.e);
                        anywVar.b(anxrVar.d);
                        ansy ansyVar10 = anzs.a;
                        anxp b22 = anxp.b(anubVar17.b.d);
                        if (b22 == null) {
                            b22 = anxp.UNRECOGNIZED;
                        }
                        anywVar.c = (anyy) ansyVar10.b(b22);
                        return anywVar.a();
                    } catch (apba e18) {
                        throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e18);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar17.b.b)));
            case 17:
                ansy ansyVar11 = anzv.a;
                anub anubVar18 = (anub) anufVar;
                if (anubVar18.b.b.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    try {
                        aozb aozbVar18 = ((anub) anufVar).b.c;
                        aozs aozsVar18 = aozs.a;
                        apcc apccVar18 = apcc.a;
                        anxv anxvVar = (anxv) apag.parseFrom(anxv.a, aozbVar18, aozs.a);
                        BigInteger bigInteger2 = anzg.e;
                        anzd anzdVar = new anzd();
                        ansy ansyVar12 = anzv.b;
                        anxw anxwVar = anxvVar.c;
                        if (anxwVar == null) {
                            anxwVar = anxw.a;
                        }
                        anwu b23 = anwu.b(anxwVar.b);
                        if (b23 == null) {
                            b23 = anwu.UNRECOGNIZED;
                        }
                        anzdVar.b = (anze) ansyVar12.b(b23);
                        ansy ansyVar13 = anzv.b;
                        anxw anxwVar2 = anxvVar.c;
                        if (anxwVar2 == null) {
                            anxwVar2 = anxw.a;
                        }
                        anwu b24 = anwu.b(anxwVar2.c);
                        if (b24 == null) {
                            b24 = anwu.UNRECOGNIZED;
                        }
                        anzdVar.c = (anze) ansyVar13.b(b24);
                        anzdVar.a = anzv.d(anxvVar.e);
                        anzdVar.b(anxvVar.d);
                        anxw anxwVar3 = anxvVar.c;
                        if (anxwVar3 == null) {
                            anxwVar3 = anxw.a;
                        }
                        anzdVar.c(anxwVar3.d);
                        ansy ansyVar14 = anzv.a;
                        anxp b25 = anxp.b(anubVar18.b.d);
                        if (b25 == null) {
                            b25 = anxp.UNRECOGNIZED;
                        }
                        anzdVar.d = (anzf) ansyVar14.b(b25);
                        return anzdVar.a();
                    } catch (apba e19) {
                        throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e19);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(anubVar18.b.b)));
            case 18:
                antv antvVar13 = aoal.a;
                anub anubVar19 = (anub) anufVar;
                if (anubVar19.b.b.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                    try {
                        aozb aozbVar19 = ((anub) anufVar).b.c;
                        aozs aozsVar19 = aozs.a;
                        apcc apccVar19 = apcc.a;
                        anvl anvlVar = (anvl) apag.parseFrom(anvl.a, aozbVar19, aozs.a);
                        anvm anvmVar = anvlVar.c;
                        if (anvmVar == null) {
                            anvmVar = anvm.a;
                        }
                        return aoal.b(anvmVar, anvlVar.d);
                    } catch (apba e20) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacStreamingParameters failed: ", e20);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters: ".concat(String.valueOf(anubVar19.b.b)));
            default:
                antv antvVar14 = aoam.a;
                anub anubVar20 = (anub) anufVar;
                if (anubVar20.b.b.equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
                    try {
                        aozb aozbVar20 = ((anub) anufVar).b.c;
                        aozs aozsVar20 = aozs.a;
                        apcc apccVar20 = apcc.a;
                        anvu anvuVar = (anvu) apag.parseFrom(anvu.a, aozbVar20, aozs.a);
                        if (anvuVar.c == 0) {
                            anvv anvvVar = anvuVar.d;
                            if (anvvVar == null) {
                                anvvVar = anvv.a;
                            }
                            return aoam.b(anvvVar, anvuVar.e);
                        }
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    } catch (apba e21) {
                        throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingParameters failed: ", e21);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters: ".concat(String.valueOf(anubVar20.b.b)));
        }
    }
}
