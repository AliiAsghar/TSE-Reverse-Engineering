package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class anoy implements antt {
    private final /* synthetic */ int a;

    public /* synthetic */ anoy(int i) {
        this.a = i;
    }

    @Override // defpackage.antt
    public final anuf a(anme anmeVar) {
        switch (this.a) {
            case 0:
                anox anoxVar = (anox) anmeVar;
                antv antvVar = anpc.a;
                aozy createBuilder = anxg.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((anxg) createBuilder.b).b = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
                aozb byteString = anpc.b(anoxVar).toByteString();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((anxg) createBuilder.b).c = byteString;
                anxp c = anpc.c(anoxVar.e);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((anxg) createBuilder.b).d = c.a();
                return anub.b((anxg) createBuilder.s());
            case 1:
                anos anosVar = (anos) anmeVar;
                antv antvVar2 = anot.a;
                aozy createBuilder2 = anxg.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((anxg) createBuilder2.b).b = "type.googleapis.com/google.crypto.tink.KmsAeadKey";
                aozy createBuilder3 = anxm.a.createBuilder();
                String str = anosVar.e;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                anxm anxmVar = (anxm) createBuilder3.b;
                str.getClass();
                anxmVar.b = str;
                aozb byteString2 = ((anxm) createBuilder3.s()).toByteString();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((anxg) createBuilder2.b).c = byteString2;
                anxp b = anot.b(anosVar.f);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((anxg) createBuilder2.b).d = b.a();
                return anub.b((anxg) createBuilder2.s());
            case 2:
                annu annuVar = (annu) anmeVar;
                antv antvVar3 = anpn.a;
                aozy createBuilder4 = anxg.a.createBuilder();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ((anxg) createBuilder4.b).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
                aozy createBuilder5 = anvj.a.createBuilder();
                aozy createBuilder6 = anvo.a.createBuilder();
                aozy createBuilder7 = anvp.a.createBuilder();
                int i = annuVar.g;
                if (!createBuilder7.b.isMutable()) {
                    createBuilder7.u();
                }
                ((anvp) createBuilder7.b).b = i;
                anvp anvpVar = (anvp) createBuilder7.s();
                if (!createBuilder6.b.isMutable()) {
                    createBuilder6.u();
                }
                apag apagVar = createBuilder6.b;
                anvo anvoVar = (anvo) apagVar;
                anvpVar.getClass();
                anvoVar.c = anvpVar;
                anvoVar.b |= 1;
                int i2 = annuVar.e;
                if (!apagVar.isMutable()) {
                    createBuilder6.u();
                }
                ((anvo) createBuilder6.b).d = i2;
                anvo anvoVar2 = (anvo) createBuilder6.s();
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                anvj anvjVar = (anvj) createBuilder5.b;
                anvoVar2.getClass();
                anvjVar.c = anvoVar2;
                anvjVar.b |= 1;
                aozy createBuilder8 = anww.a.createBuilder();
                anwx c2 = anpn.c(annuVar);
                if (!createBuilder8.b.isMutable()) {
                    createBuilder8.u();
                }
                apag apagVar2 = createBuilder8.b;
                anww anwwVar = (anww) apagVar2;
                c2.getClass();
                anwwVar.c = c2;
                anwwVar.b |= 1;
                int i3 = annuVar.f;
                if (!apagVar2.isMutable()) {
                    createBuilder8.u();
                }
                ((anww) createBuilder8.b).d = i3;
                anww anwwVar2 = (anww) createBuilder8.s();
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                anvj anvjVar2 = (anvj) createBuilder5.b;
                anwwVar2.getClass();
                anvjVar2.d = anwwVar2;
                anvjVar2.b |= 2;
                aozb byteString3 = ((anvj) createBuilder5.s()).toByteString();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ((anxg) createBuilder4.b).c = byteString3;
                anxp d = anpn.d(annuVar.i);
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                ((anxg) createBuilder4.b).d = d.a();
                return anub.b((anxg) createBuilder4.s());
            case 3:
                annz annzVar = (annz) anmeVar;
                antv antvVar4 = anpo.a;
                aozy createBuilder9 = anxg.a.createBuilder();
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                ((anxg) createBuilder9.b).b = "type.googleapis.com/google.crypto.tink.AesEaxKey";
                aozy createBuilder10 = anvr.a.createBuilder();
                anvs b2 = anpo.b(annzVar);
                if (!createBuilder10.b.isMutable()) {
                    createBuilder10.u();
                }
                apag apagVar3 = createBuilder10.b;
                anvr anvrVar = (anvr) apagVar3;
                b2.getClass();
                anvrVar.c = b2;
                anvrVar.b |= 1;
                int i4 = annzVar.e;
                if (!apagVar3.isMutable()) {
                    createBuilder10.u();
                }
                ((anvr) createBuilder10.b).d = i4;
                aozb byteString4 = ((anvr) createBuilder10.s()).toByteString();
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                ((anxg) createBuilder9.b).c = byteString4;
                anxp c3 = anpo.c(annzVar.h);
                if (!createBuilder9.b.isMutable()) {
                    createBuilder9.u();
                }
                ((anxg) createBuilder9.b).d = c3.a();
                return anub.b((anxg) createBuilder9.s());
            case 4:
                anoe anoeVar = (anoe) anmeVar;
                anpr.c(anoeVar);
                aozy createBuilder11 = anxg.a.createBuilder();
                if (!createBuilder11.b.isMutable()) {
                    createBuilder11.u();
                }
                ((anxg) createBuilder11.b).b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
                aozy createBuilder12 = anvx.a.createBuilder();
                int i5 = anoeVar.e;
                if (!createBuilder12.b.isMutable()) {
                    createBuilder12.u();
                }
                ((anvx) createBuilder12.b).b = i5;
                aozb byteString5 = ((anvx) createBuilder12.s()).toByteString();
                if (!createBuilder11.b.isMutable()) {
                    createBuilder11.u();
                }
                ((anxg) createBuilder11.b).c = byteString5;
                anxp b3 = anpr.b(anoeVar.h);
                if (!createBuilder11.b.isMutable()) {
                    createBuilder11.u();
                }
                ((anxg) createBuilder11.b).d = b3.a();
                return anub.b((anxg) createBuilder11.s());
            case 5:
                anoi anoiVar = (anoi) anmeVar;
                antv antvVar5 = anps.a;
                aozy createBuilder13 = anxg.a.createBuilder();
                if (!createBuilder13.b.isMutable()) {
                    createBuilder13.u();
                }
                ((anxg) createBuilder13.b).b = "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
                aozy createBuilder14 = anvz.a.createBuilder();
                int i6 = anoiVar.e;
                if (!createBuilder14.b.isMutable()) {
                    createBuilder14.u();
                }
                ((anvz) createBuilder14.b).b = i6;
                aozb byteString6 = ((anvz) createBuilder14.s()).toByteString();
                if (!createBuilder13.b.isMutable()) {
                    createBuilder13.u();
                }
                ((anxg) createBuilder13.b).c = byteString6;
                anxp b4 = anps.b(anoiVar.f);
                if (!createBuilder13.b.isMutable()) {
                    createBuilder13.u();
                }
                ((anxg) createBuilder13.b).d = b4.a();
                return anub.b((anxg) createBuilder13.s());
            case 6:
                anom anomVar = (anom) anmeVar;
                antv antvVar6 = anpv.a;
                aozy createBuilder15 = anxg.a.createBuilder();
                if (!createBuilder15.b.isMutable()) {
                    createBuilder15.u();
                }
                ((anxg) createBuilder15.b).b = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
                aozb byteString7 = anwd.a.toByteString();
                if (!createBuilder15.b.isMutable()) {
                    createBuilder15.u();
                }
                ((anxg) createBuilder15.b).c = byteString7;
                anxp b5 = anpv.b(anomVar.e);
                if (!createBuilder15.b.isMutable()) {
                    createBuilder15.u();
                }
                ((anxg) createBuilder15.b).d = b5.a();
                return anub.b((anxg) createBuilder15.s());
            case 7:
                anpi anpiVar = (anpi) anmeVar;
                antv antvVar7 = anqe.a;
                aozy createBuilder16 = anxg.a.createBuilder();
                if (!createBuilder16.b.isMutable()) {
                    createBuilder16.u();
                }
                ((anxg) createBuilder16.b).b = "type.googleapis.com/google.crypto.tink.XAesGcmKey";
                aozy createBuilder17 = anya.a.createBuilder();
                aozy createBuilder18 = anyb.a.createBuilder();
                int i7 = anpiVar.f;
                if (!createBuilder18.b.isMutable()) {
                    createBuilder18.u();
                }
                ((anyb) createBuilder18.b).b = i7;
                anyb anybVar = (anyb) createBuilder18.s();
                if (!createBuilder17.b.isMutable()) {
                    createBuilder17.u();
                }
                anya anyaVar = (anya) createBuilder17.b;
                anybVar.getClass();
                anyaVar.d = anybVar;
                anyaVar.b |= 1;
                aozb byteString8 = ((anya) createBuilder17.s()).toByteString();
                if (!createBuilder16.b.isMutable()) {
                    createBuilder16.u();
                }
                ((anxg) createBuilder16.b).c = byteString8;
                anxp b6 = anqe.b(anpiVar.e);
                if (!createBuilder16.b.isMutable()) {
                    createBuilder16.u();
                }
                ((anxg) createBuilder16.b).d = b6.a();
                return anub.b((anxg) createBuilder16.s());
            case 8:
                anpm anpmVar = (anpm) anmeVar;
                antv antvVar8 = anqf.a;
                aozy createBuilder19 = anxg.a.createBuilder();
                if (!createBuilder19.b.isMutable()) {
                    createBuilder19.u();
                }
                ((anxg) createBuilder19.b).b = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
                aozb byteString9 = anyd.a.toByteString();
                if (!createBuilder19.b.isMutable()) {
                    createBuilder19.u();
                }
                ((anxg) createBuilder19.b).c = byteString9;
                anxp b7 = anqf.b(anpmVar.e);
                if (!createBuilder19.b.isMutable()) {
                    createBuilder19.u();
                }
                ((anxg) createBuilder19.b).d = b7.a();
                return anub.b((anxg) createBuilder19.s());
            case 9:
                anqm anqmVar = (anqm) anmeVar;
                antv antvVar9 = anqq.a;
                aozy createBuilder20 = anxg.a.createBuilder();
                if (!createBuilder20.b.isMutable()) {
                    createBuilder20.u();
                }
                ((anxg) createBuilder20.b).b = "type.googleapis.com/google.crypto.tink.AesSivKey";
                aozy createBuilder21 = anwb.a.createBuilder();
                int i8 = anqmVar.e;
                if (!createBuilder21.b.isMutable()) {
                    createBuilder21.u();
                }
                ((anwb) createBuilder21.b).b = i8;
                aozb byteString10 = ((anwb) createBuilder21.s()).toByteString();
                if (!createBuilder20.b.isMutable()) {
                    createBuilder20.u();
                }
                ((anxg) createBuilder20.b).c = byteString10;
                anxp b8 = anqq.b(anqmVar.f);
                if (!createBuilder20.b.isMutable()) {
                    createBuilder20.u();
                }
                ((anxg) createBuilder20.b).d = b8.a();
                return anub.b((anxg) createBuilder20.s());
            case 10:
                anrf anrfVar = (anrf) anmeVar;
                ansy ansyVar = anrh.a;
                aozy createBuilder22 = anxg.a.createBuilder();
                if (!createBuilder22.b.isMutable()) {
                    createBuilder22.u();
                }
                ((anxg) createBuilder22.b).b = "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
                aozy createBuilder23 = anxb.a.createBuilder();
                anxc b9 = anrh.b(anrfVar);
                if (!createBuilder23.b.isMutable()) {
                    createBuilder23.u();
                }
                anxb anxbVar = (anxb) createBuilder23.b;
                b9.getClass();
                anxbVar.c = b9;
                anxbVar.b |= 1;
                aozb byteString11 = ((anxb) createBuilder23.s()).toByteString();
                if (!createBuilder22.b.isMutable()) {
                    createBuilder22.u();
                }
                ((anxg) createBuilder22.b).c = byteString11;
                anxp anxpVar = (anxp) anrh.a.a(anrfVar.h);
                if (!createBuilder22.b.isMutable()) {
                    createBuilder22.u();
                }
                ((anxg) createBuilder22.b).d = anxpVar.a();
                return anub.b((anxg) createBuilder22.s());
            case 11:
                anqx anqxVar = (anqx) anmeVar;
                ansy ansyVar2 = anrx.a;
                aozy createBuilder24 = anxg.a.createBuilder();
                if (!createBuilder24.b.isMutable()) {
                    createBuilder24.u();
                }
                ((anxg) createBuilder24.b).b = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
                aozy createBuilder25 = anwk.a.createBuilder();
                anwl c4 = anrx.c(anqxVar);
                if (!createBuilder25.b.isMutable()) {
                    createBuilder25.u();
                }
                anwk anwkVar = (anwk) createBuilder25.b;
                c4.getClass();
                anwkVar.c = c4;
                anwkVar.b |= 1;
                aozb byteString12 = ((anwk) createBuilder25.s()).toByteString();
                if (!createBuilder24.b.isMutable()) {
                    createBuilder24.u();
                }
                ((anxg) createBuilder24.b).c = byteString12;
                anxp anxpVar2 = (anxp) anrx.a.a(anqxVar.i);
                if (!createBuilder24.b.isMutable()) {
                    createBuilder24.u();
                }
                ((anxg) createBuilder24.b).d = anxpVar2.a();
                return anub.b((anxg) createBuilder24.s());
            case 12:
                anuo anuoVar = (anuo) anmeVar;
                antv antvVar10 = anva.a;
                aozy createBuilder26 = anxg.a.createBuilder();
                if (!createBuilder26.b.isMutable()) {
                    createBuilder26.u();
                }
                ((anxg) createBuilder26.b).b = "type.googleapis.com/google.crypto.tink.AesCmacKey";
                aozy createBuilder27 = anvg.a.createBuilder();
                anvh b10 = anva.b(anuoVar);
                if (!createBuilder27.b.isMutable()) {
                    createBuilder27.u();
                }
                apag apagVar4 = createBuilder27.b;
                anvg anvgVar = (anvg) apagVar4;
                b10.getClass();
                anvgVar.d = b10;
                anvgVar.b |= 1;
                int i9 = anuoVar.e;
                if (!apagVar4.isMutable()) {
                    createBuilder27.u();
                }
                ((anvg) createBuilder27.b).c = i9;
                aozb byteString13 = ((anvg) createBuilder27.s()).toByteString();
                if (!createBuilder26.b.isMutable()) {
                    createBuilder26.u();
                }
                ((anxg) createBuilder26.b).c = byteString13;
                anxp c5 = anva.c(anuoVar.g);
                if (!createBuilder26.b.isMutable()) {
                    createBuilder26.u();
                }
                ((anxg) createBuilder26.b).d = c5.a();
                return anub.b((anxg) createBuilder26.s());
            case 13:
                anuv anuvVar = (anuv) anmeVar;
                ansy ansyVar3 = anvc.a;
                aozy createBuilder28 = anxg.a.createBuilder();
                if (!createBuilder28.b.isMutable()) {
                    createBuilder28.u();
                }
                ((anxg) createBuilder28.b).b = "type.googleapis.com/google.crypto.tink.HmacKey";
                aozy createBuilder29 = anww.a.createBuilder();
                anwx a = anvc.a(anuvVar);
                if (!createBuilder29.b.isMutable()) {
                    createBuilder29.u();
                }
                apag apagVar5 = createBuilder29.b;
                anww anwwVar3 = (anww) apagVar5;
                a.getClass();
                anwwVar3.c = a;
                anwwVar3.b |= 1;
                int i10 = anuvVar.e;
                if (!apagVar5.isMutable()) {
                    createBuilder29.u();
                }
                ((anww) createBuilder29.b).d = i10;
                aozb byteString14 = ((anww) createBuilder29.s()).toByteString();
                if (!createBuilder28.b.isMutable()) {
                    createBuilder28.u();
                }
                ((anxg) createBuilder28.b).c = byteString14;
                anxp anxpVar3 = (anxp) anvc.a.a(anuvVar.g);
                if (!createBuilder28.b.isMutable()) {
                    createBuilder28.u();
                }
                ((anxg) createBuilder28.b).d = anxpVar3.a();
                return anub.b((anxg) createBuilder28.s());
            case 14:
                anyi anyiVar = (anyi) anmeVar;
                antv antvVar11 = anzo.a;
                aozy createBuilder30 = anxg.a.createBuilder();
                if (!createBuilder30.b.isMutable()) {
                    createBuilder30.u();
                }
                ((anxg) createBuilder30.b).b = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
                aozy createBuilder31 = anwf.a.createBuilder();
                anwg b11 = anzo.b(anyiVar);
                if (!createBuilder31.b.isMutable()) {
                    createBuilder31.u();
                }
                anwf anwfVar = (anwf) createBuilder31.b;
                b11.getClass();
                anwfVar.c = b11;
                anwfVar.b |= 1;
                aozb byteString15 = ((anwf) createBuilder31.s()).toByteString();
                if (!createBuilder30.b.isMutable()) {
                    createBuilder30.u();
                }
                ((anxg) createBuilder30.b).c = byteString15;
                anxp d2 = anzo.d(anyiVar.h);
                if (!createBuilder30.b.isMutable()) {
                    createBuilder30.u();
                }
                ((anxg) createBuilder30.b).d = d2.a();
                return anub.b((anxg) createBuilder30.s());
            case 15:
                anyn anynVar = (anyn) anmeVar;
                ansy ansyVar4 = anzp.a;
                aozy createBuilder32 = anxg.a.createBuilder();
                if (!createBuilder32.b.isMutable()) {
                    createBuilder32.u();
                }
                ((anxg) createBuilder32.b).b = "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
                aozb byteString16 = anwp.a.toByteString();
                if (!createBuilder32.b.isMutable()) {
                    createBuilder32.u();
                }
                ((anxg) createBuilder32.b).c = byteString16;
                anxp anxpVar4 = (anxp) anzp.a.a(anynVar.e);
                if (!createBuilder32.b.isMutable()) {
                    createBuilder32.u();
                }
                ((anxg) createBuilder32.b).d = anxpVar4.a();
                return anub.b((anxg) createBuilder32.s());
            case 16:
                anyz anyzVar = (anyz) anmeVar;
                ansy ansyVar5 = anzs.a;
                aozy createBuilder33 = anxg.a.createBuilder();
                if (!createBuilder33.b.isMutable()) {
                    createBuilder33.u();
                }
                ((anxg) createBuilder33.b).b = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
                aozy createBuilder34 = anxr.a.createBuilder();
                anxs a2 = anzs.a(anyzVar);
                if (!createBuilder34.b.isMutable()) {
                    createBuilder34.u();
                }
                apag apagVar6 = createBuilder34.b;
                anxr anxrVar = (anxr) apagVar6;
                a2.getClass();
                anxrVar.c = a2;
                anxrVar.b |= 1;
                int i11 = anyzVar.f;
                if (!apagVar6.isMutable()) {
                    createBuilder34.u();
                }
                ((anxr) createBuilder34.b).d = i11;
                aozb c6 = anzs.c(anyzVar.g);
                if (!createBuilder34.b.isMutable()) {
                    createBuilder34.u();
                }
                ((anxr) createBuilder34.b).e = c6;
                aozb byteString17 = ((anxr) createBuilder34.s()).toByteString();
                if (!createBuilder33.b.isMutable()) {
                    createBuilder33.u();
                }
                ((anxg) createBuilder33.b).c = byteString17;
                anxp anxpVar5 = (anxp) anzs.a.a(anyzVar.h);
                if (!createBuilder33.b.isMutable()) {
                    createBuilder33.u();
                }
                ((anxg) createBuilder33.b).d = anxpVar5.a();
                return anub.b((anxg) createBuilder33.s());
            case 17:
                anzg anzgVar = (anzg) anmeVar;
                ansy ansyVar6 = anzv.a;
                aozy createBuilder35 = anxg.a.createBuilder();
                if (!createBuilder35.b.isMutable()) {
                    createBuilder35.u();
                }
                ((anxg) createBuilder35.b).b = "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
                aozy createBuilder36 = anxv.a.createBuilder();
                anxw a3 = anzv.a(anzgVar);
                if (!createBuilder36.b.isMutable()) {
                    createBuilder36.u();
                }
                apag apagVar7 = createBuilder36.b;
                anxv anxvVar = (anxv) apagVar7;
                a3.getClass();
                anxvVar.c = a3;
                anxvVar.b |= 1;
                int i12 = anzgVar.f;
                if (!apagVar7.isMutable()) {
                    createBuilder36.u();
                }
                ((anxv) createBuilder36.b).d = i12;
                aozb c7 = anzv.c(anzgVar.g);
                if (!createBuilder36.b.isMutable()) {
                    createBuilder36.u();
                }
                ((anxv) createBuilder36.b).e = c7;
                aozb byteString18 = ((anxv) createBuilder36.s()).toByteString();
                if (!createBuilder35.b.isMutable()) {
                    createBuilder35.u();
                }
                ((anxg) createBuilder35.b).c = byteString18;
                anxp anxpVar6 = (anxp) anzv.a.a(anzgVar.h);
                if (!createBuilder35.b.isMutable()) {
                    createBuilder35.u();
                }
                ((anxg) createBuilder35.b).d = anxpVar6.a();
                return anub.b((anxg) createBuilder35.s());
            case 18:
                aoaa aoaaVar = (aoaa) anmeVar;
                antv antvVar12 = aoal.a;
                aozy createBuilder37 = anxg.a.createBuilder();
                if (!createBuilder37.b.isMutable()) {
                    createBuilder37.u();
                }
                ((anxg) createBuilder37.b).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
                aozy createBuilder38 = anvl.a.createBuilder();
                int I = aoaaVar.I();
                if (!createBuilder38.b.isMutable()) {
                    createBuilder38.u();
                }
                ((anvl) createBuilder38.b).d = I;
                anvm a4 = aoal.a(aoaaVar);
                if (!createBuilder38.b.isMutable()) {
                    createBuilder38.u();
                }
                anvl anvlVar = (anvl) createBuilder38.b;
                a4.getClass();
                anvlVar.c = a4;
                anvlVar.b |= 1;
                aozb byteString19 = ((anvl) createBuilder38.s()).toByteString();
                if (!createBuilder37.b.isMutable()) {
                    createBuilder37.u();
                }
                apag apagVar8 = createBuilder37.b;
                ((anxg) apagVar8).c = byteString19;
                anxp anxpVar7 = anxp.RAW;
                if (!apagVar8.isMutable()) {
                    createBuilder37.u();
                }
                ((anxg) createBuilder37.b).d = anxpVar7.a();
                return anub.b((anxg) createBuilder37.s());
            default:
                aoaf aoafVar = (aoaf) anmeVar;
                antv antvVar13 = aoam.a;
                aozy createBuilder39 = anxg.a.createBuilder();
                if (!createBuilder39.b.isMutable()) {
                    createBuilder39.u();
                }
                ((anxg) createBuilder39.b).b = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
                aozy createBuilder40 = anvu.a.createBuilder();
                int H = aoafVar.H();
                if (!createBuilder40.b.isMutable()) {
                    createBuilder40.u();
                }
                ((anvu) createBuilder40.b).e = H;
                anvv a5 = aoam.a(aoafVar);
                if (!createBuilder40.b.isMutable()) {
                    createBuilder40.u();
                }
                anvu anvuVar = (anvu) createBuilder40.b;
                a5.getClass();
                anvuVar.d = a5;
                anvuVar.b |= 1;
                aozb byteString20 = ((anvu) createBuilder40.s()).toByteString();
                if (!createBuilder39.b.isMutable()) {
                    createBuilder39.u();
                }
                apag apagVar9 = createBuilder39.b;
                ((anxg) apagVar9).c = byteString20;
                anxp anxpVar8 = anxp.RAW;
                if (!apagVar9.isMutable()) {
                    createBuilder39.u();
                }
                ((anxg) createBuilder39.b).d = anxpVar8.a();
                return anub.b((anxg) createBuilder39.s());
        }
    }
}
