package org.bouncycastle.asn1;

import com.google.android.gms.common.internal.IGmsServiceBroker;
import defpackage.a;
import defpackage.ahby;
import defpackage.atow;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1InputStream extends FilterInputStream implements BERTags, InputStreamRetargetInterface {
    public final int a;
    private final boolean b;
    private final byte[][] c;

    public ASN1InputStream(InputStream inputStream) {
        this(inputStream, StreamUtil.a(inputStream));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (read == 128) {
            return -1;
        }
        if (read >= 0) {
            if (read != 255) {
                int i2 = read & 127;
                int i3 = 0;
                int i4 = 0;
                do {
                    int read2 = inputStream.read();
                    if (read2 >= 0) {
                        if ((i3 >>> 23) == 0) {
                            i3 = (i3 << 8) + read2;
                            i4++;
                        } else {
                            throw new IOException("long form definite-length more than 31 bits");
                        }
                    } else {
                        throw new EOFException("EOF found reading length");
                    }
                } while (i4 < i2);
                if (i3 >= i && !z) {
                    throw new IOException(a.bU(i, i3, "corrupted stream - out of bounds length found: ", " >= "));
                }
                return i3;
            }
            throw new IOException("invalid long form definite-length 0xFF");
        }
        throw new EOFException("EOF found when length expected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 == 31) {
            int read = inputStream.read();
            if (read < 31) {
                if (read < 0) {
                    throw new EOFException("EOF found inside tag value.");
                }
                throw new IOException("corrupted stream - high tag number < 31 found");
            }
            int i3 = read & 127;
            if (i3 != 0) {
                while ((read & 128) != 0) {
                    if ((i3 >>> 24) == 0) {
                        int i4 = i3 << 7;
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            i3 = i4 | (read2 & 127);
                            read = read2;
                        } else {
                            throw new EOFException("EOF found inside tag value.");
                        }
                    } else {
                        throw new IOException("Tag number more than 31 bits");
                    }
                }
                return i3;
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1Primitive e(int i, DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) {
        try {
            switch (i) {
                case 1:
                    return ASN1Boolean.e(g(definiteLengthInputStream, bArr));
                case 2:
                    return new ASN1Integer(definiteLengthInputStream.a());
                case 3:
                    return ASN1BitString.h(definiteLengthInputStream.a());
                case 4:
                    return new DEROctetString(definiteLengthInputStream.a());
                case 5:
                    if (definiteLengthInputStream.a().length == 0) {
                        return DERNull.a;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    return ASN1ObjectIdentifier.e(g(definiteLengthInputStream, bArr), true);
                case 7:
                    return new ASN1ObjectDescriptor(new DERGraphicString(definiteLengthInputStream.a()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                default:
                    throw new IOException(a.cb(i, "unknown tag ", " encountered"));
                case 10:
                    return ASN1Enumerated.f(g(definiteLengthInputStream, bArr), true);
                case 12:
                    return new DERUTF8String(definiteLengthInputStream.a());
                case 13:
                    return new ASN1RelativeOID(definiteLengthInputStream.a());
                case 14:
                case 31:
                case 32:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                    throw new IOException(a.cb(i, "unsupported tag ", " encountered"));
                case 18:
                    return new DERNumericString(definiteLengthInputStream.a());
                case 19:
                    return new DERPrintableString(definiteLengthInputStream.a());
                case 20:
                    return new DERT61String(definiteLengthInputStream.a());
                case 21:
                    return new DERVideotexString(definiteLengthInputStream.a());
                case 22:
                    return new DERIA5String(definiteLengthInputStream.a());
                case 23:
                    return new ASN1UTCTime(definiteLengthInputStream.a());
                case 24:
                    return new ASN1GeneralizedTime(definiteLengthInputStream.a());
                case 25:
                    return new DERGraphicString(definiteLengthInputStream.a());
                case 26:
                    return new DERVisibleString(definiteLengthInputStream.a());
                case 27:
                    return new DERGeneralString(definiteLengthInputStream.a());
                case 28:
                    return new DERUniversalString(definiteLengthInputStream.a());
                case 30:
                    int i2 = definiteLengthInputStream.b;
                    if ((i2 & 1) == 0) {
                        int i3 = i2 / 2;
                        char[] cArr = new char[i3];
                        byte[] bArr2 = new byte[8];
                        int i4 = 0;
                        int i5 = 0;
                        while (i2 >= 8) {
                            if (atow.B(definiteLengthInputStream, bArr2, 8) == 8) {
                                cArr[i5] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
                                cArr[i5 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
                                cArr[i5 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
                                cArr[i5 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
                                i2 -= 8;
                                i5 += 4;
                            } else {
                                throw new EOFException("EOF encountered in middle of BMPString");
                            }
                        }
                        if (i2 > 0) {
                            if (atow.B(definiteLengthInputStream, bArr2, i2) != i2) {
                                throw new EOFException("EOF encountered in middle of BMPString");
                            }
                            do {
                                int i6 = i4 + 1;
                                int i7 = bArr2[i4] << 8;
                                i4 += 2;
                                cArr[i5] = (char) ((bArr2[i6] & 255) | i7);
                                i5++;
                            } while (i4 < i2);
                        }
                        if (definiteLengthInputStream.b == 0 && i3 == i5) {
                            return new DERBMPString(cArr);
                        }
                        throw new IllegalStateException();
                    }
                    throw new IOException("malformed BMPString encoding encountered");
            }
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        } catch (IllegalStateException e2) {
            throw new ASN1Exception(e2.getMessage(), e2);
        }
    }

    private static byte[] g(DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) {
        int i = definiteLengthInputStream.b;
        int length = bArr.length;
        if (i >= 11) {
            return definiteLengthInputStream.a();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        int length2 = bArr2.length;
        if (i == length2) {
            if (i != 0) {
                int i2 = definiteLengthInputStream.d;
                if (i < i2) {
                    int B = i - atow.B(definiteLengthInputStream.c, bArr2, length2);
                    definiteLengthInputStream.b = B;
                    if (B == 0) {
                        definiteLengthInputStream.b();
                    } else {
                        throw new EOFException("DEF length " + definiteLengthInputStream.a + " object truncated by " + definiteLengthInputStream.b);
                    }
                } else {
                    throw new IOException(a.bU(i2, i, "corrupted stream - out of bounds length found: ", " >= "));
                }
            }
            return bArr2;
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ASN1EncodableVector c() {
        ASN1Primitive f = f();
        if (f == null) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            aSN1EncodableVector.b(f);
            f = f();
        } while (f != null);
        return aSN1EncodableVector;
    }

    final ASN1EncodableVector d(DefiniteLengthInputStream definiteLengthInputStream) {
        int i = definiteLengthInputStream.b;
        if (i <= 0) {
            return new ASN1EncodableVector(0);
        }
        return new ASN1InputStream(definiteLengthInputStream, i, this.b, this.c).c();
    }

    public final ASN1Primitive f() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int b = b(this, read);
        int i = 0;
        int a = a(this, this.a, false);
        if (a >= 0) {
            try {
                DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this, a, this.a);
                if ((read & 224) == 0) {
                    return e(b, definiteLengthInputStream, this.c);
                }
                int i2 = read & 192;
                if (i2 != 0) {
                    if ((read & 32) == 0) {
                        return ASN1TaggedObject.h(i2, b, definiteLengthInputStream.a());
                    }
                    return ASN1TaggedObject.g(i2, b, d(definiteLengthInputStream));
                }
                if (b != 3) {
                    if (b != 4) {
                        if (b != 8) {
                            if (b != 16) {
                                if (b == 17) {
                                    return DLFactory.b(d(definiteLengthInputStream));
                                }
                                throw new IOException(a.cb(b, "unknown tag ", " encountered"));
                            }
                            if (definiteLengthInputStream.b <= 0) {
                                return DLFactory.a;
                            }
                            if (this.b) {
                                return new LazyEncodedSequence(definiteLengthInputStream.a());
                            }
                            return DLFactory.a(d(definiteLengthInputStream));
                        }
                        return new DLExternal(DLFactory.a(d(definiteLengthInputStream)));
                    }
                    ASN1EncodableVector d = d(definiteLengthInputStream);
                    int i3 = d.c;
                    ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[i3];
                    while (i != i3) {
                        ASN1Encodable a2 = d.a(i);
                        if (a2 instanceof ASN1OctetString) {
                            aSN1OctetStringArr[i] = (ASN1OctetString) a2;
                            i++;
                        } else {
                            throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: ".concat(String.valueOf(String.valueOf(a2.getClass()))));
                        }
                    }
                    return new BEROctetString(aSN1OctetStringArr);
                }
                ASN1EncodableVector d2 = d(definiteLengthInputStream);
                int i4 = d2.c;
                ASN1BitString[] aSN1BitStringArr = new ASN1BitString[i4];
                while (i != i4) {
                    ASN1Encodable a3 = d2.a(i);
                    if (a3 instanceof ASN1BitString) {
                        aSN1BitStringArr[i] = (ASN1BitString) a3;
                        i++;
                    } else {
                        throw new ASN1Exception("unknown object encountered in constructed BIT STRING: ".concat(String.valueOf(String.valueOf(a3.getClass()))));
                    }
                }
                return new BERBitString(aSN1BitStringArr);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        }
        if ((read & 32) != 0) {
            int i5 = read & 192;
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this, this.a), this.a, this.c);
            if (i5 != 0) {
                return aSN1StreamParser.d(i5, b);
            }
            if (b != 3) {
                if (b != 4) {
                    if (b != 8) {
                        if (b != 16) {
                            if (b == 17) {
                                return BERSetParser.a(aSN1StreamParser);
                            }
                            throw new IOException("unknown BER object encountered");
                        }
                        return BERSequenceParser.a(aSN1StreamParser);
                    }
                    return DERExternalParser.a(aSN1StreamParser);
                }
                return BEROctetStringParser.a(aSN1StreamParser);
            }
            return BERBitStringParser.a(aSN1StreamParser);
        }
        throw new IOException("indefinite-length primitive encoding encountered");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public ASN1InputStream(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public ASN1InputStream(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11]);
    }

    private ASN1InputStream(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.a = i;
        this.b = z;
        this.c = bArr;
    }

    public ASN1InputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public ASN1InputStream(byte[] bArr, byte[] bArr2) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }
}
