package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htm implements ImageHeaderParser {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final int e(htk htkVar, hqh hqhVar) {
        int i;
        ByteOrder byteOrder;
        short e;
        try {
            int a2 = htkVar.a();
            if ((a2 & 65496) != 65496 && a2 != 19789 && a2 != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.bV(a2, "Parser doesn't handle magic number: "));
                }
                return -1;
            }
            while (true) {
                short d = htkVar.d();
                if (d != 255) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", a.bV(d, "Unknown segmentId="));
                    }
                } else {
                    short d2 = htkVar.d();
                    if (d2 == 218) {
                        break;
                    }
                    if (d2 == 217) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                        }
                    } else {
                        i = htkVar.a() - 2;
                        if (d2 == 225) {
                            break;
                        }
                        long j = i;
                        long c = htkVar.c(j);
                        if (c != j) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) d2) + ", wanted to skip: " + i + ", but actually skipped: " + c);
                            }
                        }
                    }
                }
            }
            i = -1;
            if (i == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) hqhVar.a(i, byte[].class);
            try {
                int b2 = htkVar.b(bArr, i);
                if (b2 != i) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", a.bU(b2, i, "Unable to read exif segment data, length: ", ", actually read: "));
                    }
                } else {
                    if (i > a.length) {
                        int i2 = 0;
                        while (true) {
                            byte[] bArr2 = a;
                            if (i2 < bArr2.length) {
                                if (bArr[i2] != bArr2[i2]) {
                                    break;
                                }
                                i2++;
                            } else {
                                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                                short e2 = hld.e(6, byteBuffer);
                                if (e2 != 18761) {
                                    if (e2 != 19789) {
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", a.bV(e2, "Unknown endianness = "));
                                        }
                                        byteOrder = ByteOrder.BIG_ENDIAN;
                                    } else {
                                        byteOrder = ByteOrder.BIG_ENDIAN;
                                    }
                                } else {
                                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                                }
                                byteBuffer.order(byteOrder);
                                int d3 = hld.d(10, byteBuffer);
                                short e3 = hld.e(d3 + 6, byteBuffer);
                                for (int i3 = 0; i3 < e3; i3++) {
                                    int i4 = d3 + 8 + (i3 * 12);
                                    if (hld.e(i4, byteBuffer) == 274) {
                                        short e4 = hld.e(i4 + 2, byteBuffer);
                                        if (e4 > 0 && e4 <= 12) {
                                            int d4 = hld.d(i4 + 4, byteBuffer);
                                            if (d4 < 0) {
                                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                    Log.d("DfltImageHeaderParser", "Negative tiff component count");
                                                }
                                            } else {
                                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                    Log.d("DfltImageHeaderParser", "Got tagIndex=" + i3 + " tagType=274 formatCode=" + ((int) e4) + " componentCount=" + d4);
                                                }
                                                int i5 = d4 + b[e4];
                                                if (i5 > 4) {
                                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                        Log.d("DfltImageHeaderParser", a.bV(e4, "Got byte count > 4, not orientation, continuing, formatCode="));
                                                    }
                                                } else {
                                                    int i6 = i4 + 8;
                                                    if (i6 >= 0 && i6 <= byteBuffer.remaining()) {
                                                        if (i5 >= 0 && i5 + i6 <= byteBuffer.remaining()) {
                                                            e = hld.e(i6, byteBuffer);
                                                            break;
                                                        }
                                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                            Log.d("DfltImageHeaderParser", a.bV(274, "Illegal number of bytes for TI tag data tagType="));
                                                        }
                                                    }
                                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                        Log.d("DfltImageHeaderParser", a.bU(274, i6, "Illegal tagValueOffset=", " tagType="));
                                                    }
                                                }
                                            }
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", a.bV(e4, "Got invalid format code = "));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                    }
                }
                e = -1;
                return e;
            } finally {
                hqhVar.c(bArr);
            }
        } catch (htj unused) {
            return -1;
        }
    }

    private static final ImageHeaderParser.ImageType f(htk htkVar) {
        boolean z;
        boolean z2;
        ImageHeaderParser.ImageType imageType;
        try {
            int a2 = htkVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int d = (a2 << 8) | htkVar.d();
            if (d == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int d2 = (d << 8) | htkVar.d();
            if (d2 == -1991225785) {
                htkVar.c(21L);
                try {
                    if (htkVar.d() >= 3) {
                        imageType = ImageHeaderParser.ImageType.PNG_A;
                    } else {
                        imageType = ImageHeaderParser.ImageType.PNG;
                    }
                    return imageType;
                } catch (htj unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (d2 == 1380533830) {
                htkVar.c(4L);
                if (((htkVar.a() << 16) | htkVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a3 = (htkVar.a() << 16) | htkVar.a();
                if ((a3 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = a3 & 255;
                if (i == 88) {
                    htkVar.c(4L);
                    short d3 = htkVar.d();
                    if ((d3 & 2) != 0) {
                        return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                    }
                    if ((d3 & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                }
                if (i == 76) {
                    htkVar.c(4L);
                    if ((htkVar.d() & 8) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            if (((htkVar.a() << 16) | htkVar.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a4 = (htkVar.a() << 16) | htkVar.a();
            if (a4 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            if (a4 == 1635150182) {
                z = true;
            } else {
                z = false;
            }
            htkVar.c(4L);
            int i2 = d2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int a5 = (htkVar.a() << 16) | htkVar.a();
                    if (a5 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (a5 == 1635150182) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z |= !z2;
                    i2 -= 4;
                }
            }
            if (z) {
                return ImageHeaderParser.ImageType.AVIF;
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        } catch (htj unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(InputStream inputStream) {
        hwr.i(inputStream);
        return f(new htl(inputStream, 0));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) {
        hwr.i(byteBuffer);
        return f(new htl(byteBuffer, 1));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(InputStream inputStream, hqh hqhVar) {
        hwr.i(inputStream);
        htl htlVar = new htl(inputStream, 0);
        hwr.i(hqhVar);
        return e(htlVar, hqhVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(ByteBuffer byteBuffer, hqh hqhVar) {
        hwr.i(byteBuffer);
        htl htlVar = new htl(byteBuffer, 1);
        hwr.i(hqhVar);
        return e(htlVar, hqhVar);
    }
}
