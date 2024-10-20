package defpackage;

import android.util.Pair;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpj {
    public byte[] O;
    public fmr U;
    public boolean V;
    public fmq Y;
    public int Z;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public fmp j;
    public byte[] k;
    public eqj l;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = 0;
    public int s = -1;
    public float t = brg.a;
    public float u = brg.a;
    public float v = brg.a;
    public byte[] w = null;
    public int x = -1;
    public boolean y = false;
    public int z = -1;
    public int A = -1;
    public int B = -1;
    public int C = 1000;
    public int D = BasePaymentResult.ERROR_REQUEST_FAILED;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public float N = -1.0f;
    public int P = 1;
    public int Q = -1;
    public int R = 8000;
    public long S = 0;
    public long T = 0;
    public boolean W = true;
    public String X = "eng";

    public static Pair a(euf eufVar) {
        try {
            eufVar.K(16);
            long p = eufVar.p();
            if (p == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (p == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (p == 826496599) {
                int i = eufVar.b + 20;
                byte[] bArr = eufVar.a;
                while (true) {
                    int length = bArr.length;
                    if (i < length - 4) {
                        int i2 = i + 1;
                        if (bArr[i] == 0 && bArr[i2] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i, length)));
                        }
                        i = i2;
                    } else {
                        throw new erm("Failed to find FourCC VC1 initialization data", null, true, 1);
                    }
                }
            } else {
                eub.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new erm("Error parsing FourCC private data", null, true, 1);
        }
    }

    public static List b(byte[] bArr) {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    int i5 = bArr[i4];
                    i4++;
                    i = i5 & 255;
                    if (i != 255) {
                        break;
                    }
                    i3 += 255;
                }
                int i6 = i3 + i;
                int i7 = 0;
                while (true) {
                    int i8 = bArr[i4];
                    i4++;
                    i2 = i8 & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i7 += 255;
                }
                int i9 = i7 + i2;
                if (bArr[i4] == 1) {
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, i4, bArr2, 0, i6);
                    int i10 = i4 + i6;
                    if (bArr[i10] == 3) {
                        int i11 = i10 + i9;
                        if (bArr[i11] == 5) {
                            int length = bArr.length - i11;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i11, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new erm("Error parsing vorbis codec private", null, true, 1);
                    }
                    throw new erm("Error parsing vorbis codec private", null, true, 1);
                }
                throw new erm("Error parsing vorbis codec private", null, true, 1);
            }
            throw new erm("Error parsing vorbis codec private", null, true, 1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new erm("Error parsing vorbis codec private", null, true, 1);
        }
    }

    public static boolean d(euf eufVar) {
        try {
            int h = eufVar.h();
            if (h == 1) {
                return true;
            }
            if (h == 65534) {
                eufVar.J(24);
                if (eufVar.q() == fpk.b.getMostSignificantBits()) {
                    if (eufVar.q() == fpk.b.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new erm("Error parsing MS/ACM codec private", null, true, 1);
        }
    }

    public final void c() {
        dzg.g(this.Y);
    }

    public final byte[] e(String str) {
        byte[] bArr = this.k;
        if (bArr != null) {
            return bArr;
        }
        throw new erm("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null, true, 1);
    }
}
