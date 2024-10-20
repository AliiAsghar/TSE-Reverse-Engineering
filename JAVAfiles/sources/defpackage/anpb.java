package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class anpb implements antb {
    private final /* synthetic */ int a;

    public /* synthetic */ anpb(int i) {
        this.a = i;
    }

    @Override // defpackage.antb
    public final anme a(anuf anufVar) {
        switch (this.a) {
            case 0:
                antv antvVar = anpc.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    try {
                        aozb aozbVar = ((anua) anufVar).c;
                        aozs aozsVar = aozs.a;
                        apcc apccVar = apcc.a;
                        anxn anxnVar = (anxn) apag.parseFrom(anxn.a, aozbVar, aozs.a);
                        if (anxnVar.c == 0) {
                            anxo anxoVar = anxnVar.d;
                            if (anxoVar == null) {
                                anxoVar = anxo.a;
                            }
                            return anou.F(anpc.a(anxoVar, ((anua) anufVar).d), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(anxnVar));
                    } catch (apba e) {
                        throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
            case 1:
                antv antvVar2 = anot.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    try {
                        aozb aozbVar2 = ((anua) anufVar).c;
                        aozs aozsVar2 = aozs.a;
                        apcc apccVar2 = apcc.a;
                        anxl anxlVar = (anxl) apag.parseFrom(anxl.a, aozbVar2, aozs.a);
                        if (anxlVar.c == 0) {
                            anxm anxmVar = anxlVar.d;
                            if (anxmVar == null) {
                                anxmVar = anxm.a;
                            }
                            return anoq.F(new anos(anxmVar.b, anot.a(((anua) anufVar).d)), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(anxlVar));
                    } catch (apba e2) {
                        throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
            case 2:
                antv antvVar3 = anpn.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        aozb aozbVar3 = ((anua) anufVar).c;
                        aozs aozsVar3 = aozs.a;
                        apcc apccVar3 = apcc.a;
                        anvi anviVar = (anvi) apag.parseFrom(anvi.a, aozbVar3, aozs.a);
                        if (anviVar.c == 0) {
                            anvn anvnVar = anviVar.d;
                            if (anvnVar == null) {
                                anvnVar = anvn.a;
                            }
                            if (anvnVar.c == 0) {
                                anwv anwvVar = anviVar.e;
                                if (anwvVar == null) {
                                    anwvVar = anwv.a;
                                }
                                if (anwvVar.c == 0) {
                                    aqxc aqxcVar = new aqxc(null, null, null);
                                    anvn anvnVar2 = anviVar.d;
                                    if (anvnVar2 == null) {
                                        anvnVar2 = anvn.a;
                                    }
                                    aqxcVar.g(anvnVar2.e.d());
                                    anwv anwvVar2 = anviVar.e;
                                    if (anwvVar2 == null) {
                                        anwvVar2 = anwv.a;
                                    }
                                    aqxcVar.h(anwvVar2.e.d());
                                    anvn anvnVar3 = anviVar.d;
                                    if (anvnVar3 == null) {
                                        anvnVar3 = anvn.a;
                                    }
                                    anvp anvpVar = anvnVar3.d;
                                    if (anvpVar == null) {
                                        anvpVar = anvp.a;
                                    }
                                    aqxcVar.i(anvpVar.b);
                                    anwv anwvVar3 = anviVar.e;
                                    if (anwvVar3 == null) {
                                        anwvVar3 = anwv.a;
                                    }
                                    anwx anwxVar = anwvVar3.d;
                                    if (anwxVar == null) {
                                        anwxVar = anwx.a;
                                    }
                                    aqxcVar.j(anwxVar.c);
                                    anwv anwvVar4 = anviVar.e;
                                    if (anwvVar4 == null) {
                                        anwvVar4 = anwv.a;
                                    }
                                    anwx anwxVar2 = anwvVar4.d;
                                    if (anwxVar2 == null) {
                                        anwxVar2 = anwx.a;
                                    }
                                    anwu b = anwu.b(anwxVar2.b);
                                    if (b == null) {
                                        b = anwu.UNRECOGNIZED;
                                    }
                                    aqxcVar.c = anpn.a(b);
                                    aqxcVar.f = anpn.b(((anua) anufVar).d);
                                    annu f = aqxcVar.f();
                                    anvn anvnVar4 = anviVar.d;
                                    if (anvnVar4 == null) {
                                        anvnVar4 = anvn.a;
                                    }
                                    aojh A = aojh.A(anvnVar4.e.H());
                                    anwv anwvVar5 = anviVar.e;
                                    if (anwvVar5 == null) {
                                        anwvVar5 = anwv.a;
                                    }
                                    return anme.n(f, A, aojh.A(anwvVar5.e.H()), ((anua) anufVar).e);
                                }
                                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                            }
                            throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
            case 3:
                antv antvVar4 = anpo.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        aozb aozbVar4 = ((anua) anufVar).c;
                        aozs aozsVar4 = aozs.a;
                        apcc apccVar4 = apcc.a;
                        anvq anvqVar = (anvq) apag.parseFrom(anvq.a, aozbVar4, aozs.a);
                        if (anvqVar.c == 0) {
                            aoad aoadVar = new aoad((byte[]) null, (byte[]) null);
                            aoadVar.n(anvqVar.e.d());
                            anvs anvsVar = anvqVar.d;
                            if (anvsVar == null) {
                                anvsVar = anvs.a;
                            }
                            aoadVar.m(anvsVar.b);
                            aoadVar.o();
                            aoadVar.a = anpo.a(((anua) anufVar).d);
                            return anme.m(aoadVar.l(), aojh.A(anvqVar.e.H()), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused2) {
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
            case 4:
                antv antvVar5 = anpr.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        aozb aozbVar5 = ((anua) anufVar).c;
                        aozs aozsVar5 = aozs.a;
                        apcc apccVar5 = apcc.a;
                        anvw anvwVar = (anvw) apag.parseFrom(anvw.a, aozbVar5, aozs.a);
                        if (anvwVar.b == 0) {
                            aoad aoadVar2 = new aoad((char[]) null);
                            aoadVar2.j(anvwVar.c.d());
                            aoadVar2.i();
                            aoadVar2.k();
                            aoadVar2.a = anpr.a(((anua) anufVar).d);
                            return anme.l(aoadVar2.h(), aojh.A(anvwVar.c.H()), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused3) {
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
            case 5:
                antv antvVar6 = anps.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        aozb aozbVar6 = ((anua) anufVar).c;
                        aozs aozsVar6 = aozs.a;
                        apcc apccVar6 = apcc.a;
                        anvy anvyVar = (anvy) apag.parseFrom(anvy.a, aozbVar6, aozs.a);
                        if (anvyVar.b == 0) {
                            aqrk aqrkVar = new aqrk((char[]) null);
                            aqrkVar.i(anvyVar.c.d());
                            aqrkVar.b = anps.a(((anua) anufVar).d);
                            return anme.k(aqrkVar.h(), aojh.A(anvyVar.c.H()), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused4) {
                        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
            case 6:
                antv antvVar7 = anpv.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        aozb aozbVar7 = ((anua) anufVar).c;
                        aozs aozsVar7 = aozs.a;
                        apcc apccVar7 = apcc.a;
                        anwc anwcVar = (anwc) apag.parseFrom(anwc.a, aozbVar7, aozs.a);
                        if (anwcVar.b == 0) {
                            return anoj.F(anpv.a(((anua) anufVar).d), aojh.A(anwcVar.c.H()), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused5) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
            case 7:
                antv antvVar8 = anqe.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    try {
                        aozb aozbVar8 = ((anua) anufVar).c;
                        aozs aozsVar8 = aozs.a;
                        apcc apccVar8 = apcc.a;
                        anxz anxzVar = (anxz) apag.parseFrom(anxz.a, aozbVar8, aozs.a);
                        if (anxzVar.c == 0) {
                            if (anxzVar.e.d() == 32) {
                                anph a = anqe.a(((anua) anufVar).d);
                                anyb anybVar = anxzVar.d;
                                if (anybVar == null) {
                                    anybVar = anyb.a;
                                }
                                return anpf.F(anpi.F(a, anybVar.b), aojh.A(anxzVar.e.H()), ((anua) anufVar).e);
                            }
                            throw new GeneralSecurityException("Only 32 byte key size is accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused6) {
                        throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
            case 8:
                antv antvVar9 = anqf.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        aozb aozbVar9 = ((anua) anufVar).c;
                        aozs aozsVar9 = aozs.a;
                        apcc apccVar9 = apcc.a;
                        anyc anycVar = (anyc) apag.parseFrom(anyc.a, aozbVar9, aozs.a);
                        if (anycVar.b == 0) {
                            return anpj.F(anqf.a(((anua) anufVar).d), aojh.A(anycVar.c.H()), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused7) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
            case 9:
                antv antvVar10 = anqq.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    try {
                        aozb aozbVar10 = ((anua) anufVar).c;
                        aozs aozsVar10 = aozs.a;
                        apcc apccVar10 = apcc.a;
                        anwa anwaVar = (anwa) apag.parseFrom(anwa.a, aozbVar10, aozs.a);
                        if (anwaVar.b == 0) {
                            aqrk aqrkVar2 = new aqrk(null, null);
                            aqrkVar2.f(anwaVar.c.d());
                            aqrkVar2.b = anqq.a(((anua) anufVar).d);
                            return anme.B(aqrkVar2.e(), aojh.A(anwaVar.c.H()), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused8) {
                        throw new GeneralSecurityException("Parsing AesSivKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
            case 10:
                ansy ansyVar = anrh.a;
                anua anuaVar = (anua) anufVar;
                if (anuaVar.a.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    try {
                        aozb aozbVar11 = ((anua) anufVar).c;
                        aozs aozsVar11 = aozs.a;
                        apcc apccVar11 = apcc.a;
                        anxe anxeVar = (anxe) apag.parseFrom(anxe.a, aozbVar11, aozs.a);
                        if (anxeVar.c == 0) {
                            anxp anxpVar = ((anua) anufVar).d;
                            anxc anxcVar = anxeVar.d;
                            if (anxcVar == null) {
                                anxcVar = anxc.a;
                            }
                            anrf a2 = anrh.a(anxpVar, anxcVar);
                            return anri.F(a2, anrh.d(a2.e, anxeVar.e.H()), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused9) {
                        throw new GeneralSecurityException("Parsing HpkePublicKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ".concat(String.valueOf(anuaVar.a)));
            case 11:
                ansy ansyVar2 = anrh.a;
                anua anuaVar2 = (anua) anufVar;
                if (anuaVar2.a.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    try {
                        aozb aozbVar12 = ((anua) anufVar).c;
                        aozs aozsVar12 = aozs.a;
                        apcc apccVar12 = apcc.a;
                        anxd anxdVar = (anxd) apag.parseFrom(anxd.a, aozbVar12, aozs.a);
                        if (anxdVar.c == 0) {
                            anxe anxeVar2 = anxdVar.d;
                            if (anxeVar2 == null) {
                                anxeVar2 = anxe.a;
                            }
                            if (anxeVar2.c == 0) {
                                anxp anxpVar2 = ((anua) anufVar).d;
                                anxc anxcVar2 = anxeVar2.d;
                                if (anxcVar2 == null) {
                                    anxcVar2 = anxc.a;
                                }
                                anrf a3 = anrh.a(anxpVar2, anxcVar2);
                                return anrg.H(anri.F(a3, anrh.d(a3.e, anxeVar2.e.H()), ((anua) anufVar).e), aojh.A(anme.x(new BigInteger(1, anxdVar.e.H()), ansf.a(a3.e))));
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused10) {
                        throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ".concat(String.valueOf(anuaVar2.a)));
            case 12:
                ansy ansyVar3 = anrx.a;
                anua anuaVar3 = (anua) anufVar;
                if (anuaVar3.a.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    try {
                        aozb aozbVar13 = ((anua) anufVar).c;
                        aozs aozsVar13 = aozs.a;
                        apcc apccVar13 = apcc.a;
                        anwn anwnVar = (anwn) apag.parseFrom(anwn.a, aozbVar13, aozs.a);
                        if (anwnVar.c == 0) {
                            anxp anxpVar3 = ((anua) anufVar).d;
                            anwl anwlVar = anwnVar.d;
                            if (anwlVar == null) {
                                anwlVar = anwl.a;
                            }
                            anqx b2 = anrx.b(anxpVar3, anwlVar);
                            if (b2.f.equals(anqt.d)) {
                                if (anwnVar.f.G()) {
                                    return anqz.F(b2, aocj.b(anwnVar.e.H()), ((anua) anufVar).e);
                                }
                                throw new GeneralSecurityException("Y must be empty for X25519 points");
                            }
                            return anqz.G(b2, new ECPoint(new BigInteger(1, anwnVar.e.H()), new BigInteger(1, anwnVar.f.H())), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba | IllegalArgumentException unused11) {
                        throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ".concat(String.valueOf(anuaVar3.a)));
            case 13:
                ansy ansyVar4 = anrx.a;
                anua anuaVar4 = (anua) anufVar;
                if (anuaVar4.a.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    try {
                        aozb aozbVar14 = ((anua) anufVar).c;
                        aozs aozsVar14 = aozs.a;
                        apcc apccVar14 = apcc.a;
                        anwm anwmVar = (anwm) apag.parseFrom(anwm.a, aozbVar14, aozs.a);
                        if (anwmVar.c == 0) {
                            anwn anwnVar2 = anwmVar.d;
                            if (anwnVar2 == null) {
                                anwnVar2 = anwn.a;
                            }
                            if (anwnVar2.c == 0) {
                                anxp anxpVar4 = ((anua) anufVar).d;
                                anwl anwlVar2 = anwnVar2.d;
                                if (anwlVar2 == null) {
                                    anwlVar2 = anwl.a;
                                }
                                anqx b3 = anrx.b(anxpVar4, anwlVar2);
                                if (b3.f.equals(anqt.d)) {
                                    anqz F = anqz.F(b3, aocj.b(anwnVar2.e.H()), ((anua) anufVar).e);
                                    aojh A2 = aojh.A(anwmVar.e.H());
                                    if (F.g != null) {
                                        byte[] y = A2.y();
                                        byte[] c = F.g.c();
                                        if (y.length == 32) {
                                            if (Arrays.equals(aode.e(y), c)) {
                                                return new anqy(F, null, A2);
                                            }
                                            throw new GeneralSecurityException("Invalid private key for public key.");
                                        }
                                        throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
                                    }
                                    throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
                                }
                                return anqy.H(anqz.G(b3, new ECPoint(new BigInteger(1, anwnVar2.e.H()), new BigInteger(1, anwnVar2.f.H())), ((anua) anufVar).e), new ahmn(new BigInteger(1, anwmVar.e.H()), null));
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba | IllegalArgumentException unused12) {
                        throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ".concat(String.valueOf(anuaVar4.a)));
            case 14:
                antv antvVar11 = anva.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        aozb aozbVar15 = ((anua) anufVar).c;
                        aozs aozsVar15 = aozs.a;
                        apcc apccVar15 = apcc.a;
                        anvf anvfVar = (anvf) apag.parseFrom(anvf.a, aozbVar15, aozs.a);
                        if (anvfVar.c == 0) {
                            arbj arbjVar = new arbj((char[]) null);
                            arbjVar.e(anvfVar.d.d());
                            anvh anvhVar = anvfVar.e;
                            if (anvhVar == null) {
                                anvhVar = anvh.a;
                            }
                            arbjVar.f(anvhVar.b);
                            arbjVar.a = anva.a(((anua) anufVar).d);
                            return anme.A(arbjVar.d(), aojh.A(anvfVar.d.H()), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba | IllegalArgumentException unused13) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
            case 15:
                ansy ansyVar5 = anvc.a;
                if (((anua) anufVar).a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        aozb aozbVar16 = ((anua) anufVar).c;
                        aozs aozsVar16 = aozs.a;
                        apcc apccVar16 = apcc.a;
                        anwv anwvVar6 = (anwv) apag.parseFrom(anwv.a, aozbVar16, aozs.a);
                        if (anwvVar6.c == 0) {
                            aoad aoadVar3 = new aoad((byte[]) null);
                            aoadVar3.f(anwvVar6.e.d());
                            anwx anwxVar3 = anwvVar6.d;
                            if (anwxVar3 == null) {
                                anwxVar3 = anwx.a;
                            }
                            aoadVar3.g(anwxVar3.c);
                            ansy ansyVar6 = anvc.b;
                            anwx anwxVar4 = anwvVar6.d;
                            if (anwxVar4 == null) {
                                anwxVar4 = anwx.a;
                            }
                            anwu b4 = anwu.b(anwxVar4.b);
                            if (b4 == null) {
                                b4 = anwu.UNRECOGNIZED;
                            }
                            aoadVar3.a = (anut) ansyVar6.b(b4);
                            aoadVar3.b = (anuu) anvc.a.b(((anua) anufVar).d);
                            return anme.t(aoadVar3.e(), aojh.A(anwvVar6.e.H()), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba | IllegalArgumentException unused14) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
            case 16:
                antv antvVar12 = anzo.a;
                anua anuaVar5 = (anua) anufVar;
                if (anuaVar5.a.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    try {
                        aozb aozbVar17 = ((anua) anufVar).c;
                        aozs aozsVar17 = aozs.a;
                        apcc apccVar17 = apcc.a;
                        anwi anwiVar = (anwi) apag.parseFrom(anwi.a, aozbVar17, aozs.a);
                        if (anwiVar.c == 0) {
                            anwg anwgVar = anwiVar.d;
                            if (anwgVar == null) {
                                anwgVar = anwg.a;
                            }
                            anwu b5 = anwu.b(anwgVar.b);
                            if (b5 == null) {
                                b5 = anwu.UNRECOGNIZED;
                            }
                            anyf f2 = anzo.f(b5);
                            anwg anwgVar2 = anwiVar.d;
                            if (anwgVar2 == null) {
                                anwgVar2 = anwg.a;
                            }
                            int aT = a.aT(anwgVar2.d);
                            if (aT == 0) {
                                aT = 1;
                            }
                            anyg h = anzo.h(aT);
                            anwg anwgVar3 = anwiVar.d;
                            if (anwgVar3 == null) {
                                anwgVar3 = anwg.a;
                            }
                            anws b6 = anws.b(anwgVar3.c);
                            if (b6 == null) {
                                b6 = anws.UNRECOGNIZED;
                            }
                            return aode.T(anme.q(h, anzo.e(b6), f2, anzo.g(((anua) anufVar).d)), new ECPoint(new BigInteger(1, anwiVar.e.H()), new BigInteger(1, anwiVar.f.H())), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba | IllegalArgumentException unused15) {
                        throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(anuaVar5.a)));
            case 17:
                antv antvVar13 = anzo.a;
                anua anuaVar6 = (anua) anufVar;
                if (anuaVar6.a.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    try {
                        aozb aozbVar18 = ((anua) anufVar).c;
                        aozs aozsVar18 = aozs.a;
                        apcc apccVar18 = apcc.a;
                        anwh anwhVar = (anwh) apag.parseFrom(anwh.a, aozbVar18, aozs.a);
                        if (anwhVar.c == 0) {
                            anwi anwiVar2 = anwhVar.d;
                            if (anwiVar2 == null) {
                                anwiVar2 = anwi.a;
                            }
                            if (anwiVar2.c == 0) {
                                anwg anwgVar4 = anwiVar2.d;
                                if (anwgVar4 == null) {
                                    anwgVar4 = anwg.a;
                                }
                                anwu b7 = anwu.b(anwgVar4.b);
                                if (b7 == null) {
                                    b7 = anwu.UNRECOGNIZED;
                                }
                                anyf f3 = anzo.f(b7);
                                anwg anwgVar5 = anwiVar2.d;
                                if (anwgVar5 == null) {
                                    anwgVar5 = anwg.a;
                                }
                                int aT2 = a.aT(anwgVar5.d);
                                if (aT2 == 0) {
                                    aT2 = 1;
                                }
                                anyg h2 = anzo.h(aT2);
                                anwg anwgVar6 = anwiVar2.d;
                                if (anwgVar6 == null) {
                                    anwgVar6 = anwg.a;
                                }
                                anws b8 = anws.b(anwgVar6.c);
                                if (b8 == null) {
                                    b8 = anws.UNRECOGNIZED;
                                }
                                return anme.D(aode.T(anme.q(h2, anzo.e(b8), f3, anzo.g(((anua) anufVar).d)), new ECPoint(new BigInteger(1, anwiVar2.e.H()), new BigInteger(1, anwiVar2.f.H())), ((anua) anufVar).e), new ahmn(new BigInteger(1, anwhVar.e.H()), null));
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba | IllegalArgumentException unused16) {
                        throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(anuaVar6.a)));
            case 18:
                ansy ansyVar7 = anzp.a;
                anua anuaVar7 = (anua) anufVar;
                if (anuaVar7.a.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    try {
                        aozb aozbVar19 = ((anua) anufVar).c;
                        aozs aozsVar19 = aozs.a;
                        apcc apccVar19 = apcc.a;
                        anwr anwrVar = (anwr) apag.parseFrom(anwr.a, aozbVar19, aozs.a);
                        if (anwrVar.b == 0) {
                            return anyq.G((anym) anzp.a.b(((anua) anufVar).d), aocj.b(anwrVar.c.H()), ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused17) {
                        throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(anuaVar7.a)));
            case 19:
                ansy ansyVar8 = anzp.a;
                anua anuaVar8 = (anua) anufVar;
                if (anuaVar8.a.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    try {
                        aozb aozbVar20 = ((anua) anufVar).c;
                        aozs aozsVar20 = aozs.a;
                        apcc apccVar20 = apcc.a;
                        anwq anwqVar = (anwq) apag.parseFrom(anwq.a, aozbVar20, aozs.a);
                        if (anwqVar.c == 0) {
                            anwr anwrVar2 = anwqVar.e;
                            if (anwrVar2 == null) {
                                anwrVar2 = anwr.a;
                            }
                            if (anwrVar2.b == 0) {
                                return anyo.H(anyq.G((anym) anzp.a.b(((anua) anufVar).d), aocj.b(anwrVar2.c.H()), ((anua) anufVar).e), aojh.A(anwqVar.d.H()));
                            }
                            throw new GeneralSecurityException("Only version 0 keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba unused18) {
                        throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(anuaVar8.a)));
            default:
                ansy ansyVar9 = anzs.a;
                anua anuaVar9 = (anua) anufVar;
                if (anuaVar9.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    try {
                        aozb aozbVar21 = ((anua) anufVar).c;
                        aozs aozsVar21 = aozs.a;
                        apcc apccVar21 = apcc.a;
                        anxu anxuVar = (anxu) apag.parseFrom(anxu.a, aozbVar21, aozs.a);
                        if (anxuVar.c == 0) {
                            BigInteger d = anzs.d(anxuVar.e);
                            int bitLength = d.bitLength();
                            BigInteger bigInteger = anyz.e;
                            anyw anywVar = new anyw();
                            ansy ansyVar10 = anzs.b;
                            anxs anxsVar = anxuVar.d;
                            if (anxsVar == null) {
                                anxsVar = anxs.a;
                            }
                            anwu b9 = anwu.b(anxsVar.b);
                            if (b9 == null) {
                                b9 = anwu.UNRECOGNIZED;
                            }
                            anywVar.b = (anyx) ansyVar10.b(b9);
                            anywVar.a = anzs.d(anxuVar.f);
                            anywVar.b(bitLength);
                            anywVar.c = (anyy) anzs.a.b(((anua) anufVar).d);
                            return aode.S(anywVar.a(), d, ((anua) anufVar).e);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (apba | IllegalArgumentException unused19) {
                        throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(anuaVar9.a)));
        }
    }
}
