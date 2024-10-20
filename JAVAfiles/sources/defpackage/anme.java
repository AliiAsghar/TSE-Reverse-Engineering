package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class anme {
    public static volatile aqux a;
    public static volatile aqux b;
    public static volatile aqux c;
    public static volatile aqux d;

    private anme() {
    }

    public static anul A(anuo anuoVar, aojh aojhVar, Integer num) {
        aocj a2;
        if (anuoVar.e == aojhVar.x()) {
            if (anuoVar.j() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!anuoVar.j() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            anun anunVar = anuoVar.g;
            if (anunVar == anun.d) {
                a2 = antr.a;
            } else if (anunVar != anun.c && anunVar != anun.b) {
                if (anunVar == anun.a) {
                    a2 = antr.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(anunVar))));
                }
            } else {
                a2 = antr.a(num.intValue());
            }
            return new anul(anuoVar, aojhVar, a2, num);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    public static anqj B(anqm anqmVar, aojh aojhVar, Integer num) {
        aocj b2;
        if (anqmVar != null) {
            if (anqmVar.e == aojhVar.x()) {
                if (anqmVar.j() && num == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!anqmVar.j() && num != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                anql anqlVar = anqmVar.f;
                if (anqlVar == anql.c) {
                    b2 = antr.a;
                } else if (anqlVar == anql.b) {
                    b2 = antr.a(num.intValue());
                } else if (anqlVar == anql.a) {
                    b2 = antr.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(String.valueOf(anqlVar))));
                }
                return new anqj(anqmVar, aojhVar, b2, num);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new IllegalArgumentException("Cannot build without parameters and/or key material");
    }

    public static annb C(ahmn ahmnVar) {
        try {
            Object obj = ahmnVar.a;
            aozs aozsVar = aozs.a;
            apcc apccVar = apcc.a;
            anxi anxiVar = (anxi) apag.parseFrom(anxi.a, (InputStream) obj, aozs.a);
            ((InputStream) ahmnVar.a).close();
            return annb.b(anxiVar);
        } catch (Throwable th) {
            ((InputStream) ahmnVar.a).close();
            throw th;
        }
    }

    public static anyj D(anyk anykVar, ahmn ahmnVar) {
        Object obj = ahmnVar.a;
        anye anyeVar = anykVar.e.f;
        BigInteger order = anyeVar.e.getOrder();
        BigInteger bigInteger = (BigInteger) obj;
        if (bigInteger.signum() > 0 && bigInteger.compareTo(order) < 0) {
            if (ansx.e(bigInteger, anyeVar.e).equals(anykVar.f)) {
                return new anyj(anykVar, ahmnVar);
            }
            throw new GeneralSecurityException("Invalid private value");
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public static void E(atii atiiVar) {
        Integer num;
        anmx anmxVar;
        ArrayList arrayList = new ArrayList();
        anth anthVar = anth.a;
        Iterator it = atiiVar.f().iterator();
        while (it.hasNext()) {
            for (anty antyVar : (List) it.next()) {
                int i = antyVar.f - 2;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            anmxVar = anmx.c;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        anmxVar = anmx.b;
                    }
                } else {
                    anmxVar = anmx.a;
                }
                int i2 = antyVar.d;
                String str = antyVar.e;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                arrayList.add(new anti(anmxVar, i2, str, antyVar.c.name()));
            }
        }
        Object obj = atiiVar.d;
        if (obj != null) {
            num = Integer.valueOf(((anty) obj).d);
        } else {
            num = null;
        }
        if (num != null) {
            try {
                int intValue = num.intValue();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = ((anti) arrayList.get(i3)).a;
                    i3++;
                    if (i4 == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    private static long F(byte[] bArr, int i, int i2) {
        return (G(bArr, i) >> i2) & 67108863;
    }

    private static long G(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return (((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16)) & 4294967295L;
    }

    private static void H(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }

    public static aqdv K(aqgb aqgbVar, Iterable iterable) {
        aozy createBuilder = aqdv.a.createBuilder();
        createBuilder.getClass();
        aqgbVar.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aqdv aqdvVar = (aqdv) createBuilder.b;
        aqdvVar.c = aqgbVar;
        aqdvVar.b |= 1;
        DesugarCollections.unmodifiableList(aqdvVar.d).getClass();
        createBuilder.bK(iterable);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aqdv) createBuilder.b).e = true;
        apag s = createBuilder.s();
        s.getClass();
        return (aqdv) s;
    }

    public static anit c(aqwb aqwbVar, xdj xdjVar) {
        aqwbVar.getClass();
        Status status = aqwbVar.a;
        status.getClass();
        return d(status, aqwbVar.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r5 == null) goto L11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0061. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.anit d(io.grpc.Status r4, defpackage.aqut r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L17
            ankj r1 = new ankj
            r2 = 0
            r1.<init>(r2)
            aqul r2 = new aqul
            java.lang.String r3 = "google.internal.communications.instantmessaging.v1.tachyonerror-bin"
            r2.<init>(r3, r1)
            java.lang.Object r5 = r5.b(r2)
            aqgi r5 = (defpackage.aqgi) r5
            goto L18
        L17:
            r5 = r0
        L18:
            if (r5 == 0) goto L26
            int r5 = r5.b
            asky r5 = defpackage.asky.b(r5)
            if (r5 != 0) goto L24
            asky r5 = defpackage.asky.UNRECOGNIZED
        L24:
            if (r5 != 0) goto L28
        L26:
            asky r5 = defpackage.asky.UNKNOWN
        L28:
            anit r1 = new anit
            ankk r2 = defpackage.ankk.a
            io.grpc.Status$Code r3 = r4.getCode()
            anir r2 = r2.apply(r3)
            r2.getClass()
            io.grpc.Status$Code r4 = r4.getCode()
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L5a;
                case 1: goto L5a;
                case 2: goto L5a;
                case 3: goto L5a;
                case 4: goto L57;
                case 5: goto L57;
                case 6: goto L5a;
                case 7: goto L5a;
                case 8: goto L5a;
                case 9: goto L5a;
                case 10: goto L57;
                case 11: goto L5a;
                case 12: goto L5a;
                case 13: goto L5a;
                case 14: goto L5a;
                case 15: goto L5a;
                case 16: goto L5a;
                case 17: goto L5a;
                case 18: goto L5a;
                case 19: goto L5a;
                case 20: goto L5a;
                case 21: goto L5a;
                case 22: goto L5a;
                case 23: goto L5a;
                case 24: goto L5a;
                case 25: goto L5a;
                case 26: goto L5a;
                case 27: goto L5a;
                case 28: goto L5a;
                case 29: goto L5a;
                case 30: goto L5a;
                case 31: goto L54;
                case 32: goto L5a;
                case 33: goto L54;
                case 34: goto L51;
                case 35: goto L4e;
                case 36: goto L4b;
                case 37: goto L5a;
                case 38: goto L57;
                case 39: goto L48;
                case 40: goto L5a;
                case 41: goto L5a;
                case 42: goto L5a;
                case 43: goto L5a;
                default: goto L42;
            }
        L42:
            armm r4 = new armm
            r4.<init>()
            throw r4
        L48:
            anis r5 = defpackage.anis.g
            goto L5b
        L4b:
            anis r5 = defpackage.anis.a
            goto L5b
        L4e:
            anis r5 = defpackage.anis.f
            goto L5b
        L51:
            anis r5 = defpackage.anis.e
            goto L5b
        L54:
            anis r5 = defpackage.anis.d
            goto L5b
        L57:
            anis r5 = defpackage.anis.c
            goto L5b
        L5a:
            r5 = r0
        L5b:
            if (r5 != 0) goto L72
            int r4 = r4.ordinal()
            switch(r4) {
                case 0: goto L6c;
                case 1: goto L6a;
                case 2: goto L6a;
                case 3: goto L6c;
                case 4: goto L6a;
                case 5: goto L6c;
                case 6: goto L6c;
                case 7: goto L6c;
                case 8: goto L6a;
                case 9: goto L6c;
                case 10: goto L6a;
                case 11: goto L6c;
                case 12: goto L6c;
                case 13: goto L6a;
                case 14: goto L6a;
                case 15: goto L6c;
                case 16: goto L6c;
                default: goto L64;
            }
        L64:
            armm r4 = new armm
            r4.<init>()
            throw r4
        L6a:
            anis r0 = defpackage.anis.b
        L6c:
            if (r0 != 0) goto L71
            anis r5 = defpackage.anis.a
            goto L72
        L71:
            r5 = r0
        L72:
            r1.<init>(r2, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anme.d(io.grpc.Status, aqut):anit");
    }

    public static aptx e(Throwable th, apts aptsVar) {
        aptw r;
        aozy createBuilder = aptx.a.createBuilder();
        createBuilder.getClass();
        aozy createBuilder2 = aptt.a.createBuilder();
        createBuilder2.getClass();
        apsd.l(aptsVar, createBuilder2);
        apsd.n(4, createBuilder2);
        apsd.o(4, createBuilder2);
        if (th instanceof aniv) {
            r = xea.a(((aniv) th).a);
        } else {
            aozy createBuilder3 = aptw.a.createBuilder();
            createBuilder3.getClass();
            aptu aptuVar = aptu.TACHYGRAM_ERROR_UNSPECIFIED;
            aptuVar.getClass();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            ((aptw) createBuilder3.b).b = aptuVar.a();
            aptr aptrVar = aptr.ERROR_RECOVERY_TYPE_UNSPECIFIED;
            aptrVar.getClass();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            ((aptw) createBuilder3.b).c = aptrVar.a();
            r = aovn.r(createBuilder3);
        }
        apsd.m(r, createBuilder2);
        aovn.n(apsd.k(createBuilder2), createBuilder);
        return aovn.m(createBuilder);
    }

    public static ankn f(int i, String str) {
        return new ankn(i, "GroupMessage of type " + aqaw.a(i) + " does not have a " + str + " message.");
    }

    public static /* synthetic */ String g(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "EPHEMERAL";
                }
                return "CONTROL";
            }
            return "USER";
        }
        return "UNKNOWN";
    }

    public static byte[] h(byte[] bArr, byte[] bArr2) {
        long F = F(bArr, 0, 0);
        long F2 = F(bArr, 3, 2) & 67108611;
        long F3 = F(bArr, 6, 4) & 67092735;
        long F4 = F(bArr, 9, 6) & 66076671;
        long F5 = F(bArr, 12, 8) & 1048575;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 < length) {
                int min = Math.min(16, length - i2);
                System.arraycopy(bArr2, i2, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i, (byte) 0);
                }
                long j6 = F5 * 5;
                long j7 = F4 * 5;
                long j8 = F3 * 5;
                long F6 = j5 + F(bArr3, 0, 0);
                long F7 = j2 + F(bArr3, 3, 2);
                long F8 = j + F(bArr3, 6, 4);
                long F9 = j3 + F(bArr3, 9, 6);
                long F10 = j4 + (F(bArr3, 12, 8) | (bArr3[16] << 24));
                long j9 = F7 * F;
                long j10 = F7 * F2;
                long j11 = F7 * F3;
                long j12 = F9 * F;
                long j13 = F7 * F4;
                long j14 = F10 * F;
                long j15 = (F6 * F) + (F7 * j6) + (F8 * j7) + (F9 * j8) + (F2 * 5 * F10);
                long j16 = (F6 * F2) + j9 + (F8 * j6) + (F9 * j7) + (j8 * F10) + (j15 >> 26);
                long j17 = (F6 * F3) + j10 + (F8 * F) + (F9 * j6) + (j7 * F10) + (j16 >> 26);
                long j18 = (F6 * F4) + j11 + (F8 * F2) + j12 + (F10 * j6) + (j17 >> 26);
                long j19 = (F6 * F5) + j13 + (F8 * F3) + (F9 * F2) + j14 + (j18 >> 26);
                long j20 = (j15 & 67108863) + ((j19 >> 26) * 5);
                j2 = (j16 & 67108863) + (j20 >> 26);
                i2 += 16;
                j = j17 & 67108863;
                j3 = j18 & 67108863;
                j4 = j19 & 67108863;
                i = 17;
                j5 = j20 & 67108863;
            } else {
                long j21 = j + (j2 >> 26);
                long j22 = j21 & 67108863;
                long j23 = j3 + (j21 >> 26);
                long j24 = j23 & 67108863;
                long j25 = j4 + (j23 >> 26);
                long j26 = j25 & 67108863;
                long j27 = j5 + ((j25 >> 26) * 5);
                long j28 = j27 & 67108863;
                long j29 = j28 + 5;
                long j30 = (j2 & 67108863) + (j27 >> 26);
                long j31 = j30 + (j29 >> 26);
                long j32 = (j31 >> 26) + j22;
                long j33 = j24 + (j32 >> 26);
                long j34 = (j26 + (j33 >> 26)) - 67108864;
                long j35 = j34 >> 63;
                long j36 = ~j35;
                long j37 = (j30 & j35) | (j31 & 67108863 & j36);
                long j38 = (j22 & j35) | (j32 & 67108863 & j36);
                long j39 = (j24 & j35) | (j33 & 67108863 & j36);
                long j40 = (j26 & j35) | (j34 & j36);
                long G = (((j35 & j28) | (j29 & 67108863 & j36) | (j37 << 26)) & 4294967295L) + G(bArr, 16);
                long G2 = (((j37 >> 6) | (j38 << 20)) & 4294967295L) + G(bArr, 20);
                long G3 = (((j38 >> 12) | (j39 << 14)) & 4294967295L) + G(bArr, 24);
                long G4 = (((j39 >> 18) | (j40 << 8)) & 4294967295L) + G(bArr, 28);
                byte[] bArr4 = new byte[16];
                H(bArr4, G & 4294967295L, 0);
                long j41 = G2 + (G >> 32);
                H(bArr4, j41 & 4294967295L, 4);
                long j42 = G3 + (j41 >> 32);
                H(bArr4, j42 & 4294967295L, 8);
                H(bArr4, (G4 + (j42 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
        }
    }

    public static boolean i() {
        if (anpu.c() != null) {
            return true;
        }
        return false;
    }

    public static anof k(anoi anoiVar, aojh aojhVar, Integer num) {
        aocj b2;
        if (anoiVar.e == aojhVar.x()) {
            if (anoiVar.j() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!anoiVar.j() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            anoh anohVar = anoiVar.f;
            if (anohVar == anoh.c) {
                b2 = antr.a;
            } else if (anohVar == anoh.b) {
                b2 = antr.a(num.intValue());
            } else if (anohVar == anoh.a) {
                b2 = antr.b(num.intValue());
            } else {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(anohVar))));
            }
            return new anof(anoiVar, aojhVar, b2, num);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    public static anoa l(anoe anoeVar, aojh aojhVar, Integer num) {
        aocj b2;
        if (anoeVar.e == aojhVar.x()) {
            if (anoeVar.j() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!anoeVar.j() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            anod anodVar = anoeVar.h;
            if (anodVar == anod.c) {
                b2 = antr.a;
            } else if (anodVar == anod.b) {
                b2 = antr.a(num.intValue());
            } else if (anodVar == anod.a) {
                b2 = antr.b(num.intValue());
            } else {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(anodVar))));
            }
            return new anoa(anoeVar, aojhVar, b2, num);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    public static annv m(annz annzVar, aojh aojhVar, Integer num) {
        aocj b2;
        if (annzVar.e == aojhVar.x()) {
            if (annzVar.j() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!annzVar.j() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            anny annyVar = annzVar.h;
            if (annyVar == anny.c) {
                b2 = antr.a;
            } else if (annyVar == anny.b) {
                b2 = antr.a(num.intValue());
            } else if (annyVar == anny.a) {
                b2 = antr.b(num.intValue());
            } else {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(annyVar))));
            }
            return new annv(annzVar, aojhVar, b2, num);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    public static annp n(annu annuVar, aojh aojhVar, aojh aojhVar2, Integer num) {
        aocj b2;
        if (annuVar != null) {
            if (annuVar.e == aojhVar.x()) {
                if (annuVar.f == aojhVar2.x()) {
                    if (annuVar.j() && num == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!annuVar.j() && num != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    annt anntVar = annuVar.i;
                    if (anntVar == annt.c) {
                        b2 = antr.a;
                    } else if (anntVar == annt.b) {
                        b2 = antr.a(num.intValue());
                    } else if (anntVar == annt.a) {
                        b2 = antr.b(num.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(anntVar))));
                    }
                    return new annp(annuVar, aojhVar, aojhVar2, b2, num);
                }
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            throw new GeneralSecurityException("AES key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    public static anme o(byte[] bArr) {
        try {
            aozs aozsVar = aozs.a;
            apcc apccVar = apcc.a;
            anxg anxgVar = (anxg) apag.parseFrom(anxg.a, bArr, aozs.a);
            antq antqVar = antq.a;
            anub a2 = anub.a(anxgVar);
            atii atiiVar = (atii) antqVar.b.get();
            if (!atiiVar.a.containsKey(new anug(a2.getClass(), a2.a))) {
                return new antg(a2);
            }
            return antqVar.g(a2);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] p(anme anmeVar) {
        if (anmeVar instanceof antg) {
            return ((antg) anmeVar).e.b.toByteArray();
        }
        return ((anub) antq.a.h(anmeVar, anub.class)).b.toByteArray();
    }

    public static anyi q(anyg anygVar, anye anyeVar, anyf anyfVar, anyh anyhVar) {
        if (anyeVar != null) {
            if (anyeVar == anye.a && anyfVar != anyf.a) {
                throw new GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if (anyeVar == anye.b && anyfVar != anyf.b && anyfVar != anyf.c) {
                throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if (anyeVar == anye.c && anyfVar != anyf.c) {
                throw new GeneralSecurityException("NIST_P521 requires SHA512");
            }
            return new anyi(anygVar, anyeVar, anyfVar, anyhVar);
        }
        throw new GeneralSecurityException("EC curve type is not set");
    }

    public static byte[] r(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public static byte[] s(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            int i = 0;
            while (i < 16) {
                int i2 = i + 1;
                byte b2 = bArr[i];
                byte b3 = (byte) ((b2 + b2) & 254);
                bArr2[i] = b3;
                if (i < 15) {
                    bArr2[i] = (byte) (((bArr[i2] >> 7) & 1) | b3);
                }
                i = i2;
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static anur t(anuv anuvVar, aojh aojhVar, Integer num) {
        aocj a2;
        if (anuvVar.e == aojhVar.x()) {
            if (anuvVar.j() && num == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!anuvVar.j() && num != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            anuu anuuVar = anuvVar.g;
            if (anuuVar == anuu.d) {
                a2 = antr.a;
            } else if (anuuVar != anuu.c && anuuVar != anuu.b) {
                if (anuuVar == anuu.a) {
                    a2 = antr.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(anuuVar))));
                }
            } else {
                a2 = antr.a(num.intValue());
            }
            return new anur(anuvVar, aojhVar, a2, num);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    public static ansy u(Map map, Map map2) {
        return new ansy(DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
    }

    public static void v(Enum r0, Object obj, Map map, Map map2) {
        map.put(r0, obj);
        map2.put(obj, r0);
    }

    public static byte[] w(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] x(BigInteger bigInteger, int i) {
        if (bigInteger.signum() != -1) {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (length == i) {
                return byteArray;
            }
            int i2 = i + 1;
            if (length <= i2) {
                if (length == i2) {
                    if (byteArray[0] == 0) {
                        return Arrays.copyOfRange(byteArray, 1, length);
                    }
                    throw new GeneralSecurityException("integer too large");
                }
                byte[] bArr = new byte[i];
                System.arraycopy(byteArray, 0, bArr, i - length, length);
                return bArr;
            }
            throw new GeneralSecurityException("integer too large");
        }
        throw new IllegalArgumentException("integer must be nonnegative");
    }

    public static KeyStore y() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    public static boolean z(int i) {
        Boolean bool;
        if (i - 1 != 0) {
            if (anqi.a()) {
                try {
                    bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                } catch (Exception unused) {
                    anqi.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                    bool = false;
                }
                if (!bool.booleanValue()) {
                    return false;
                }
            }
            return true;
        }
        if (!anqi.a()) {
            return true;
        }
        return false;
    }

    public Integer a() {
        throw null;
    }

    public boolean j() {
        return false;
    }

    public anme(byte[] bArr) {
    }

    public anme(int[] iArr) {
        this((byte[]) null);
    }
}
