package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxc {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public aqxc(byte[] bArr) {
        this.b = null;
        this.e = null;
        this.f = null;
        this.c = null;
        this.d = null;
        this.a = null;
    }

    public final aoaa a() {
        int i;
        if (this.b != null) {
            Object obj = this.e;
            if (obj != null) {
                if (this.f != null) {
                    if (this.c != null) {
                        if (this.d != null) {
                            if (this.a != null) {
                                int i2 = 32;
                                if (((Integer) obj).intValue() != 16 && ((Integer) this.e).intValue() != 32) {
                                    Object obj2 = this.e;
                                    Objects.toString(obj2);
                                    throw new GeneralSecurityException("derivedKeySizeBytes needs to be 16 or 32, not ".concat(String.valueOf(obj2)));
                                }
                                if (((Integer) this.b).intValue() >= ((Integer) this.e).intValue()) {
                                    if (((Integer) this.a).intValue() > ((Integer) this.e).intValue() + ((Integer) this.d).intValue() + 8) {
                                        Object obj3 = this.c;
                                        if (obj3 == anzz.a) {
                                            i = 20;
                                        } else {
                                            i = 0;
                                        }
                                        if (obj3 != anzz.b) {
                                            i2 = i;
                                        }
                                        if (obj3 == anzz.c) {
                                            i2 = 64;
                                        }
                                        if (((Integer) this.d).intValue() >= 10 && ((Integer) this.d).intValue() <= i2) {
                                            Object obj4 = this.b;
                                            Object obj5 = this.e;
                                            Object obj6 = this.f;
                                            Object obj7 = this.c;
                                            return new aoaa((Integer) obj4, (Integer) obj5, (anzz) obj6, (anzz) obj7, (Integer) this.d, (Integer) this.a);
                                        }
                                        throw new GeneralSecurityException("hmacTagSize must be in range [10, " + i2 + "], but is " + this.d);
                                    }
                                    throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., " + (((Integer) this.e).intValue() + ((Integer) this.d).intValue() + 9));
                                }
                                Object obj8 = this.e;
                                Objects.toString(obj8);
                                throw new GeneralSecurityException("keySizeBytes needs to be at least derivedKeySizeBytes, i.e., ".concat(String.valueOf(obj8)));
                            }
                            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
                        }
                        throw new GeneralSecurityException("hmacTagSizeBytes needs to be set");
                    }
                    throw new GeneralSecurityException("hmacHashType needs to be set");
                }
                throw new GeneralSecurityException("hkdfHashType needs to be set");
            }
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be set");
        }
        throw new GeneralSecurityException("keySizeBytes needs to be set");
    }

    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.b = Integer.valueOf(i);
    }

    public final anqx e() {
        Object obj = this.f;
        if (obj != null) {
            if (this.a != null) {
                if (this.c != null) {
                    if (this.b != null) {
                        anqt anqtVar = anqt.d;
                        if (obj != anqtVar && this.e == null) {
                            throw new GeneralSecurityException("Point format is not set");
                        }
                        if (obj == anqtVar && this.e != null) {
                            throw new GeneralSecurityException("For Curve25519 point format must not be set");
                        }
                        Object obj2 = this.f;
                        Object obj3 = this.a;
                        Object obj4 = this.e;
                        Object obj5 = this.c;
                        Object obj6 = this.b;
                        anqw anqwVar = (anqw) obj6;
                        anqv anqvVar = (anqv) obj4;
                        return new anqx((anqt) obj2, (anqu) obj3, anqvVar, (anme) obj5, anqwVar, (aocj) this.d);
                    }
                    throw new GeneralSecurityException("Variant is not set");
                }
                throw new GeneralSecurityException("DEM parameters are not set");
            }
            throw new GeneralSecurityException("Hash type is not set");
        }
        throw new GeneralSecurityException("Elliptic curve type is not set");
    }

    public final annu f() {
        if (this.a != null) {
            if (this.e != null) {
                if (this.b != null) {
                    Object obj = this.d;
                    if (obj != null) {
                        if (this.c != null) {
                            if (this.f != null) {
                                Integer num = (Integer) obj;
                                int intValue = num.intValue();
                                Object obj2 = this.c;
                                if (obj2 == anns.a) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                    }
                                } else if (obj2 == anns.b) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                    }
                                } else if (obj2 == anns.c) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                    }
                                } else if (obj2 == anns.d) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                    }
                                } else if (obj2 == anns.e) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                }
                                return new annu(((Integer) this.a).intValue(), ((Integer) this.e).intValue(), ((Integer) this.b).intValue(), ((Integer) this.d).intValue(), (annt) this.f, (anns) this.c);
                            }
                            throw new GeneralSecurityException("variant is not set");
                        }
                        throw new GeneralSecurityException("hash type is not set");
                    }
                    throw new GeneralSecurityException("tag size is not set");
                }
                throw new GeneralSecurityException("iv size is not set");
            }
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        throw new GeneralSecurityException("AES key size is not set");
    }

    public final void g(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void h(int i) {
        if (i >= 16) {
            this.e = Integer.valueOf(i);
            return;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
    }

    public final void i(int i) {
        if (i >= 12 && i <= 16) {
            this.b = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
    }

    public final void j(int i) {
        if (i >= 10) {
            this.d = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
    }

    public final void k(anme anmeVar) {
        if (anqx.e.contains(anmeVar)) {
            this.c = anmeVar;
            return;
        }
        throw new GeneralSecurityException(a.bX(anmeVar, "Invalid DEM parameters ", "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
    }

    public aqxc(byte[] bArr, byte[] bArr2) {
        this.f = null;
        this.a = null;
        this.e = null;
        this.c = null;
        this.b = anqw.c;
        this.d = null;
    }

    public aqxc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = null;
        this.e = null;
        this.b = null;
        this.d = null;
        this.c = null;
        this.f = annt.c;
    }

    public aqxc() {
        this.d = new arhm(arcb.o, 0);
        this.f = new asmb(altc.a);
        this.e = aqwt.a;
    }
}
