package defpackage;

import android.content.res.AssetManager;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elx {
    private static final byte[] A;
    private static final HashMap[] B;
    private static final HashMap[] C;
    private static final Set D;
    private static final HashMap E;
    private static final byte[] F;
    private static final akro[] R;
    private static final akro[] S;
    private static final akro[] T;
    private static final akro[] U;
    private static final akro[] V;
    private static final akro W;
    private static final akro[] X;
    private static final akro[] Y;
    private static final akro[] Z;
    public static final int[] a;
    private static final akro[] aa;
    private static final akro[] ab;
    public static final int[] b;
    static final byte[] c;
    public static SimpleDateFormat d;
    public static SimpleDateFormat e;
    static final String[] f;
    static final int[] g;
    static final byte[] h;
    static final Charset i;
    static final byte[] j;
    public static final Pattern k;
    static final akro[][] l;
    private static final boolean m = Log.isLoggable("ExifInterface", 3);
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static final int v;
    private static final int w;
    private static final int x;
    private static final byte[] y;
    private static final byte[] z;
    private FileDescriptor G;
    private AssetManager.AssetInputStream H;
    private int I;
    private final HashMap[] J;
    private final Set K;
    private ByteOrder L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private int Q;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        n = new byte[]{102, 116, 121, 112};
        o = new byte[]{109, 105, 102, 49};
        p = new byte[]{104, 101, 105, 99};
        q = new byte[]{97, 118, 105, 102};
        r = new byte[]{97, 118, 105, 115};
        s = new byte[]{79, 76, 89, 77, 80, 0};
        t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        v = d(101, 88, 73, 102);
        w = d(73, 72, 68, 82);
        x = d(73, 69, 78, 68);
        y = new byte[]{82, 73, 70, 70};
        z = new byte[]{87, 69, 66, 80};
        A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        g = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        h = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        akro[] akroVarArr = {new akro("NewSubfileType", 254, 4), new akro("SubfileType", 255, 4), new akro("ImageWidth", 256, 3, 4), new akro("ImageLength", 257, 3, 4), new akro("BitsPerSample", 258, 3), new akro("Compression", 259, 3), new akro("PhotometricInterpretation", 262, 3), new akro("ImageDescription", 270, 2), new akro("Make", 271, 2), new akro("Model", 272, 2), new akro("StripOffsets", 273, 3, 4), new akro("Orientation", 274, 3), new akro("SamplesPerPixel", 277, 3), new akro("RowsPerStrip", 278, 3, 4), new akro("StripByteCounts", 279, 3, 4), new akro("XResolution", 282, 5), new akro("YResolution", 283, 5), new akro("PlanarConfiguration", 284, 3), new akro("ResolutionUnit", 296, 3), new akro("TransferFunction", 301, 3), new akro("Software", 305, 2), new akro("DateTime", 306, 2), new akro("Artist", 315, 2), new akro("WhitePoint", 318, 5), new akro("PrimaryChromaticities", 319, 5), new akro("SubIFDPointer", 330, 4), new akro("JPEGInterchangeFormat", 513, 4), new akro("JPEGInterchangeFormatLength", 514, 4), new akro("YCbCrCoefficients", 529, 5), new akro("YCbCrSubSampling", 530, 3), new akro("YCbCrPositioning", 531, 3), new akro("ReferenceBlackWhite", 532, 5), new akro("Copyright", 33432, 2), new akro("ExifIFDPointer", 34665, 4), new akro("GPSInfoIFDPointer", 34853, 4), new akro("SensorTopBorder", 4, 4), new akro("SensorLeftBorder", 5, 4), new akro("SensorBottomBorder", 6, 4), new akro("SensorRightBorder", 7, 4), new akro("ISO", 23, 3), new akro("JpgFromRaw", 46, 7), new akro("Xmp", 700, 1)};
        R = akroVarArr;
        akro[] akroVarArr2 = {new akro("ExposureTime", 33434, 5), new akro("FNumber", 33437, 5), new akro("ExposureProgram", 34850, 3), new akro("SpectralSensitivity", 34852, 2), new akro("PhotographicSensitivity", 34855, 3), new akro("OECF", 34856, 7), new akro("SensitivityType", 34864, 3), new akro("StandardOutputSensitivity", 34865, 4), new akro("RecommendedExposureIndex", 34866, 4), new akro("ISOSpeed", 34867, 4), new akro("ISOSpeedLatitudeyyy", 34868, 4), new akro("ISOSpeedLatitudezzz", 34869, 4), new akro("ExifVersion", 36864, 2), new akro("DateTimeOriginal", 36867, 2), new akro("DateTimeDigitized", 36868, 2), new akro("OffsetTime", 36880, 2), new akro("OffsetTimeOriginal", 36881, 2), new akro("OffsetTimeDigitized", 36882, 2), new akro("ComponentsConfiguration", 37121, 7), new akro("CompressedBitsPerPixel", 37122, 5), new akro("ShutterSpeedValue", 37377, 10), new akro("ApertureValue", 37378, 5), new akro("BrightnessValue", 37379, 10), new akro("ExposureBiasValue", 37380, 10), new akro("MaxApertureValue", 37381, 5), new akro("SubjectDistance", 37382, 5), new akro("MeteringMode", 37383, 3), new akro("LightSource", 37384, 3), new akro("Flash", 37385, 3), new akro("FocalLength", 37386, 5), new akro("SubjectArea", 37396, 3), new akro("MakerNote", 37500, 7), new akro("UserComment", 37510, 7), new akro("SubSecTime", 37520, 2), new akro("SubSecTimeOriginal", 37521, 2), new akro("SubSecTimeDigitized", 37522, 2), new akro("FlashpixVersion", 40960, 7), new akro("ColorSpace", 40961, 3), new akro("PixelXDimension", 40962, 3, 4), new akro("PixelYDimension", 40963, 3, 4), new akro("RelatedSoundFile", 40964, 2), new akro("InteroperabilityIFDPointer", 40965, 4), new akro("FlashEnergy", 41483, 5), new akro("SpatialFrequencyResponse", 41484, 7), new akro("FocalPlaneXResolution", 41486, 5), new akro("FocalPlaneYResolution", 41487, 5), new akro("FocalPlaneResolutionUnit", 41488, 3), new akro("SubjectLocation", 41492, 3), new akro("ExposureIndex", 41493, 5), new akro("SensingMethod", 41495, 3), new akro("FileSource", 41728, 7), new akro("SceneType", 41729, 7), new akro("CFAPattern", 41730, 7), new akro("CustomRendered", 41985, 3), new akro("ExposureMode", 41986, 3), new akro("WhiteBalance", 41987, 3), new akro("DigitalZoomRatio", 41988, 5), new akro("FocalLengthIn35mmFilm", 41989, 3), new akro("SceneCaptureType", 41990, 3), new akro("GainControl", 41991, 3), new akro("Contrast", 41992, 3), new akro("Saturation", 41993, 3), new akro("Sharpness", 41994, 3), new akro("DeviceSettingDescription", 41995, 7), new akro("SubjectDistanceRange", 41996, 3), new akro("ImageUniqueID", 42016, 2), new akro("CameraOwnerName", 42032, 2), new akro("BodySerialNumber", 42033, 2), new akro("LensSpecification", 42034, 5), new akro("LensMake", 42035, 2), new akro("LensModel", 42036, 2), new akro("Gamma", 42240, 5), new akro("DNGVersion", 50706, 1), new akro("DefaultCropSize", 50720, 3, 4)};
        S = akroVarArr2;
        akro[] akroVarArr3 = {new akro("GPSVersionID", 0, 1), new akro("GPSLatitudeRef", 1, 2), new akro("GPSLatitude", 2, 5, 10), new akro("GPSLongitudeRef", 3, 2), new akro("GPSLongitude", 4, 5, 10), new akro("GPSAltitudeRef", 5, 1), new akro("GPSAltitude", 6, 5), new akro("GPSTimeStamp", 7, 5), new akro("GPSSatellites", 8, 2), new akro("GPSStatus", 9, 2), new akro("GPSMeasureMode", 10, 2), new akro("GPSDOP", 11, 5), new akro("GPSSpeedRef", 12, 2), new akro("GPSSpeed", 13, 5), new akro("GPSTrackRef", 14, 2), new akro("GPSTrack", 15, 5), new akro("GPSImgDirectionRef", 16, 2), new akro("GPSImgDirection", 17, 5), new akro("GPSMapDatum", 18, 2), new akro("GPSDestLatitudeRef", 19, 2), new akro("GPSDestLatitude", 20, 5), new akro("GPSDestLongitudeRef", 21, 2), new akro("GPSDestLongitude", 22, 5), new akro("GPSDestBearingRef", 23, 2), new akro("GPSDestBearing", 24, 5), new akro("GPSDestDistanceRef", 25, 2), new akro("GPSDestDistance", 26, 5), new akro("GPSProcessingMethod", 27, 7), new akro("GPSAreaInformation", 28, 7), new akro("GPSDateStamp", 29, 2), new akro("GPSDifferential", 30, 3), new akro("GPSHPositioningError", 31, 5)};
        T = akroVarArr3;
        akro[] akroVarArr4 = {new akro("InteroperabilityIndex", 1, 2)};
        U = akroVarArr4;
        akro[] akroVarArr5 = {new akro("NewSubfileType", 254, 4), new akro("SubfileType", 255, 4), new akro("ThumbnailImageWidth", 256, 3, 4), new akro("ThumbnailImageLength", 257, 3, 4), new akro("BitsPerSample", 258, 3), new akro("Compression", 259, 3), new akro("PhotometricInterpretation", 262, 3), new akro("ImageDescription", 270, 2), new akro("Make", 271, 2), new akro("Model", 272, 2), new akro("StripOffsets", 273, 3, 4), new akro("ThumbnailOrientation", 274, 3), new akro("SamplesPerPixel", 277, 3), new akro("RowsPerStrip", 278, 3, 4), new akro("StripByteCounts", 279, 3, 4), new akro("XResolution", 282, 5), new akro("YResolution", 283, 5), new akro("PlanarConfiguration", 284, 3), new akro("ResolutionUnit", 296, 3), new akro("TransferFunction", 301, 3), new akro("Software", 305, 2), new akro("DateTime", 306, 2), new akro("Artist", 315, 2), new akro("WhitePoint", 318, 5), new akro("PrimaryChromaticities", 319, 5), new akro("SubIFDPointer", 330, 4), new akro("JPEGInterchangeFormat", 513, 4), new akro("JPEGInterchangeFormatLength", 514, 4), new akro("YCbCrCoefficients", 529, 5), new akro("YCbCrSubSampling", 530, 3), new akro("YCbCrPositioning", 531, 3), new akro("ReferenceBlackWhite", 532, 5), new akro("Copyright", 33432, 2), new akro("ExifIFDPointer", 34665, 4), new akro("GPSInfoIFDPointer", 34853, 4), new akro("DNGVersion", 50706, 1), new akro("DefaultCropSize", 50720, 3, 4)};
        V = akroVarArr5;
        W = new akro("StripOffsets", 273, 3);
        akro[] akroVarArr6 = {new akro("ThumbnailImage", 256, 7), new akro("CameraSettingsIFDPointer", 8224, 4), new akro("ImageProcessingIFDPointer", 8256, 4)};
        X = akroVarArr6;
        akro[] akroVarArr7 = {new akro("PreviewImageStart", 257, 4), new akro("PreviewImageLength", 258, 4)};
        Y = akroVarArr7;
        akro[] akroVarArr8 = {new akro("AspectFrame", 4371, 3)};
        Z = akroVarArr8;
        akro[] akroVarArr9 = {new akro("ColorSpace", 55, 3)};
        aa = akroVarArr9;
        l = new akro[][]{akroVarArr, akroVarArr2, akroVarArr3, akroVarArr4, akroVarArr5, akroVarArr, akroVarArr6, akroVarArr7, akroVarArr8, akroVarArr9};
        ab = new akro[]{new akro("SubIFDPointer", 330, 4), new akro("ExifIFDPointer", 34665, 4), new akro("GPSInfoIFDPointer", 34853, 4), new akro("InteroperabilityIFDPointer", 40965, 4), new akro("CameraSettingsIFDPointer", 8224, 1), new akro("ImageProcessingIFDPointer", 8256, 1)};
        B = new HashMap[10];
        C = new HashMap[10];
        D = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        E = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        i = forName;
        j = "Exif\u0000\u0000".getBytes(forName);
        F = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        d = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        e = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            akro[][] akroVarArr10 = l;
            int length = akroVarArr10.length;
            if (i2 < 10) {
                B[i2] = new HashMap();
                C[i2] = new HashMap();
                for (akro akroVar : akroVarArr10[i2]) {
                    B[i2].put(Integer.valueOf(akroVar.b), akroVar);
                    C[i2].put(akroVar.d, akroVar);
                }
                i2++;
            } else {
                akro[] akroVarArr11 = ab;
                Integer valueOf = Integer.valueOf(akroVarArr11[0].b);
                HashMap hashMap = E;
                hashMap.put(valueOf, 5);
                hashMap.put(Integer.valueOf(akroVarArr11[1].b), 1);
                hashMap.put(Integer.valueOf(akroVarArr11[2].b), 2);
                hashMap.put(Integer.valueOf(akroVarArr11[3].b), 3);
                hashMap.put(Integer.valueOf(akroVarArr11[4].b), 7);
                hashMap.put(Integer.valueOf(akroVarArr11[5].b), 8);
                k = Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public elx(InputStream inputStream) {
        int length = l.length;
        this.J = new HashMap[10];
        this.K = new HashSet(10);
        this.L = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.H = (AssetManager.AssetInputStream) inputStream;
                this.G = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.H = null;
                        this.G = fileInputStream.getFD();
                    } catch (Exception unused) {
                        if (m) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                    }
                }
                this.H = null;
                this.G = null;
            }
            l(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    private static int d(int i2, int i3, int i4, int i5) {
        return ((i2 & 255) << 24) | ((i3 & 255) << 16) | ((i4 & 255) << 8) | (i5 & 255);
    }

    private final elv e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        int i2 = 0;
        while (true) {
            int length = l.length;
            if (i2 < 10) {
                elv elvVar = (elv) this.J[i2].get(str);
                if (elvVar != null) {
                    return elvVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    private final void f() {
        String b2 = b("DateTimeOriginal");
        if (b2 != null && b("DateTime") == null) {
            this.J[0].put("DateTime", elv.b(b2));
        }
        if (b("ImageWidth") == null) {
            this.J[0].put("ImageWidth", elv.c(0L, this.L));
        }
        if (b("ImageLength") == null) {
            this.J[0].put("ImageLength", elv.c(0L, this.L));
        }
        if (b("Orientation") == null) {
            this.J[0].put("Orientation", elv.c(0L, this.L));
        }
        if (b("LightSource") == null) {
            this.J[1].put("LightSource", elv.c(0L, this.L));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0177, code lost:
    
        r21.c = r20.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017b, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0098. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x009b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x009e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0164 A[LOOP:0: B:9:0x0032->B:32:0x0164, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(defpackage.elu r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elx.g(elu, int, int):void");
    }

    private final void h(elu eluVar) {
        if (m) {
            Objects.toString(eluVar);
            Log.d("ExifInterface", "getPngAttributes starting with: ".concat(eluVar.toString()));
        }
        eluVar.c = ByteOrder.BIG_ENDIAN;
        int i2 = eluVar.b;
        int length = u.length;
        eluVar.b(8);
        while (true) {
            try {
                int readInt = eluVar.readInt();
                int readInt2 = eluVar.readInt();
                int i3 = eluVar.b - i2;
                if (i3 == 16) {
                    if (readInt2 == w) {
                        i3 = 16;
                    } else {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                }
                if (readInt2 == x) {
                    return;
                }
                if (readInt2 == v) {
                    this.N = i3;
                    byte[] bArr = new byte[readInt];
                    eluVar.readFully(bArr);
                    int readInt3 = eluVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) == readInt3) {
                        o(bArr, 0);
                        s();
                        q(new elu(bArr));
                        return;
                    } else {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                }
                eluVar.b(readInt + 4);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    private final void i(elu eluVar) {
        if (m) {
            Objects.toString(eluVar);
            Log.d("ExifInterface", "getWebpAttributes starting with: ".concat(eluVar.toString()));
        }
        eluVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = y.length;
        eluVar.b(4);
        int readInt = eluVar.readInt() + 8;
        byte[] bArr = z;
        int length2 = bArr.length;
        eluVar.b(4);
        int length3 = bArr.length;
        int i2 = 12;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                eluVar.readFully(bArr2);
                int readInt2 = eluVar.readInt();
                int i3 = i2 + 8;
                if (Arrays.equals(A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    eluVar.readFully(bArr3);
                    byte[] bArr4 = j;
                    if (dyt.e(bArr3, bArr4)) {
                        int length4 = bArr4.length;
                        bArr3 = Arrays.copyOfRange(bArr3, length4, readInt2 - length4);
                    }
                    this.N = i3;
                    o(bArr3, 0);
                    q(new elu(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                i2 = i3 + readInt2;
                if (i2 == readInt) {
                    return;
                }
                if (i2 <= readInt) {
                    eluVar.b(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void j(elu eluVar, HashMap hashMap) {
        elv elvVar = (elv) hashMap.get("JPEGInterchangeFormat");
        elv elvVar2 = (elv) hashMap.get("JPEGInterchangeFormatLength");
        if (elvVar != null && elvVar2 != null) {
            int a2 = elvVar.a(this.L);
            int a3 = elvVar2.a(this.L);
            if (this.I == 7) {
                a2 += this.O;
            }
            if (a2 > 0 && a3 > 0 && this.H == null && this.G == null) {
                eluVar.b(a2);
                eluVar.readFully(new byte[a3]);
            }
            if (m) {
                Log.d("ExifInterface", a.bU(a3, a2, "Setting thumbnail attributes with offset: ", ", length: "));
            }
        }
    }

    private final void k(elu eluVar, HashMap hashMap) {
        int length;
        int length2;
        byte[] bArr;
        elv elvVar = (elv) hashMap.get("StripOffsets");
        elv elvVar2 = (elv) hashMap.get("StripByteCounts");
        if (elvVar != null && elvVar2 != null) {
            long[] f2 = dyt.f(elvVar.f(this.L));
            long[] f3 = dyt.f(elvVar2.f(this.L));
            if (f2 != null && (length = f2.length) != 0) {
                if (f3 != null && (length2 = f3.length) != 0) {
                    if (length == length2) {
                        long j2 = 0;
                        for (long j3 : f3) {
                            j2 += j3;
                        }
                        byte[] bArr2 = new byte[(int) j2];
                        this.M = true;
                        int i2 = 0;
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int length3 = f2.length;
                            if (i2 < length3) {
                                int i5 = (int) f2[i2];
                                int i6 = (int) f3[i2];
                                if (i2 < length3 - 1) {
                                    bArr = bArr2;
                                    if (i5 + i6 != f2[i2 + 1]) {
                                        this.M = false;
                                    }
                                } else {
                                    bArr = bArr2;
                                }
                                int i7 = i5 - i3;
                                if (i7 < 0) {
                                    Log.d("ExifInterface", "Invalid strip offset value");
                                    return;
                                }
                                try {
                                    eluVar.b(i7);
                                    int i8 = i3 + i7;
                                    byte[] bArr3 = new byte[i6];
                                    try {
                                        eluVar.readFully(bArr3);
                                        i2++;
                                        i3 = i8 + i6;
                                        System.arraycopy(bArr3, 0, bArr, i4, i6);
                                        i4 += i6;
                                        bArr2 = bArr;
                                    } catch (EOFException unused) {
                                        Log.d("ExifInterface", a.cb(i6, "Failed to read ", " bytes."));
                                        return;
                                    }
                                } catch (EOFException unused2) {
                                    Log.d("ExifInterface", a.cb(i7, "Failed to skip ", " bytes."));
                                    return;
                                }
                            } else {
                                if (this.M) {
                                    long j4 = f2[0];
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    }
                } else {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                }
            } else {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:181|182)|(6:183|184|185|(1:242)(1:189)|190|(1:192))|193|194|195|196|197|(1:199)|200|(2:201|(2:203|(4:206|207|(2:208|(2:210|(1:213)(1:212))(3:215|216|(2:217|(2:219|(2:222|223)(1:221))(2:224|225))))|214)(1:205))(2:226|227))) */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x00c5, code lost:
    
        if (r10 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x00c7, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x00b7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x00b8, code lost:
    
        r2 = r0;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x00be, code lost:
    
        if (r8 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x00c0, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x00c3, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:?, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x00c4, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x00bb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x00bc, code lost:
    
        r2 = r0;
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x041a A[Catch: all -> 0x04ea, UnsupportedOperationException -> 0x04ed, IOException -> 0x04ef, TryCatch #2 {IOException -> 0x04ef, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x001e, B:8:0x0033, B:10:0x0042, B:14:0x0048, B:15:0x0053, B:17:0x0056, B:21:0x005c, B:190:0x0080, B:197:0x00ac, B:201:0x00cb, B:203:0x00d0, B:208:0x00d7, B:210:0x00dc, B:212:0x00e4, B:217:0x00e8, B:219:0x00ed, B:221:0x00f9, B:205:0x00ff, B:235:0x00c0, B:236:0x00c3, B:231:0x00c7, B:250:0x0091, B:251:0x0094, B:246:0x0098, B:23:0x0111, B:30:0x0124, B:35:0x0138, B:37:0x0149, B:39:0x0172, B:40:0x0183, B:43:0x01a3, B:44:0x01b5, B:46:0x01c3, B:48:0x01cd, B:51:0x01d1, B:53:0x01d9, B:55:0x01e0, B:57:0x01e8, B:58:0x01ec, B:59:0x0209, B:60:0x0178, B:62:0x017e, B:63:0x03ed, B:72:0x0220, B:73:0x0225, B:75:0x0229, B:76:0x0239, B:78:0x024b, B:79:0x0258, B:82:0x0273, B:83:0x027c, B:87:0x0288, B:90:0x028d, B:91:0x0294, B:92:0x0295, B:145:0x0408, B:153:0x0409, B:154:0x0410, B:155:0x0411, B:157:0x041a, B:159:0x0422, B:163:0x042d, B:164:0x0432, B:166:0x0436, B:167:0x0446, B:169:0x0496, B:172:0x04a2, B:177:0x04b0, B:179:0x04d7, B:174:0x04e3, B:19:0x0104, B:12:0x010a), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00d0 A[Catch: all -> 0x04ea, UnsupportedOperationException -> 0x04ed, IOException -> 0x04ef, TryCatch #2 {IOException -> 0x04ef, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x001e, B:8:0x0033, B:10:0x0042, B:14:0x0048, B:15:0x0053, B:17:0x0056, B:21:0x005c, B:190:0x0080, B:197:0x00ac, B:201:0x00cb, B:203:0x00d0, B:208:0x00d7, B:210:0x00dc, B:212:0x00e4, B:217:0x00e8, B:219:0x00ed, B:221:0x00f9, B:205:0x00ff, B:235:0x00c0, B:236:0x00c3, B:231:0x00c7, B:250:0x0091, B:251:0x0094, B:246:0x0098, B:23:0x0111, B:30:0x0124, B:35:0x0138, B:37:0x0149, B:39:0x0172, B:40:0x0183, B:43:0x01a3, B:44:0x01b5, B:46:0x01c3, B:48:0x01cd, B:51:0x01d1, B:53:0x01d9, B:55:0x01e0, B:57:0x01e8, B:58:0x01ec, B:59:0x0209, B:60:0x0178, B:62:0x017e, B:63:0x03ed, B:72:0x0220, B:73:0x0225, B:75:0x0229, B:76:0x0239, B:78:0x024b, B:79:0x0258, B:82:0x0273, B:83:0x027c, B:87:0x0288, B:90:0x028d, B:91:0x0294, B:92:0x0295, B:145:0x0408, B:153:0x0409, B:154:0x0410, B:155:0x0411, B:157:0x041a, B:159:0x0422, B:163:0x042d, B:164:0x0432, B:166:0x0436, B:167:0x0446, B:169:0x0496, B:172:0x04a2, B:177:0x04b0, B:179:0x04d7, B:174:0x04e3, B:19:0x0104, B:12:0x010a), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04f5 A[Catch: all -> 0x04ea, TRY_LEAVE, TryCatch #3 {all -> 0x04ea, blocks: (B:3:0x000b, B:5:0x0012, B:7:0x001e, B:8:0x0033, B:10:0x0042, B:14:0x0048, B:15:0x0053, B:17:0x0056, B:21:0x005c, B:190:0x0080, B:197:0x00ac, B:201:0x00cb, B:203:0x00d0, B:208:0x00d7, B:210:0x00dc, B:212:0x00e4, B:217:0x00e8, B:219:0x00ed, B:221:0x00f9, B:205:0x00ff, B:235:0x00c0, B:236:0x00c3, B:231:0x00c7, B:250:0x0091, B:251:0x0094, B:246:0x0098, B:23:0x0111, B:30:0x0124, B:35:0x0138, B:37:0x0149, B:39:0x0172, B:40:0x0183, B:43:0x01a3, B:44:0x01b5, B:46:0x01c3, B:48:0x01cd, B:51:0x01d1, B:53:0x01d9, B:55:0x01e0, B:57:0x01e8, B:58:0x01ec, B:59:0x0209, B:60:0x0178, B:62:0x017e, B:63:0x03ed, B:72:0x0220, B:73:0x0225, B:75:0x0229, B:76:0x0239, B:78:0x024b, B:79:0x0258, B:82:0x0273, B:83:0x027c, B:87:0x0288, B:90:0x028d, B:91:0x0294, B:92:0x0295, B:134:0x03ea, B:144:0x0405, B:145:0x0408, B:153:0x0409, B:154:0x0410, B:155:0x0411, B:157:0x041a, B:159:0x0422, B:163:0x042d, B:164:0x0432, B:166:0x0436, B:167:0x0446, B:169:0x0496, B:172:0x04a2, B:177:0x04b0, B:179:0x04d7, B:174:0x04e3, B:19:0x0104, B:12:0x010a, B:263:0x04f1, B:265:0x04f5), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(java.io.InputStream r24) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elx.l(java.io.InputStream):void");
    }

    private final void m(elu eluVar) {
        ByteOrder y2 = y(eluVar);
        this.L = y2;
        eluVar.c = y2;
        int readUnsignedShort = eluVar.readUnsignedShort();
        int i2 = this.I;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(readUnsignedShort))));
        }
        int readInt = eluVar.readInt();
        if (readInt >= 8) {
            int i3 = readInt - 8;
            if (i3 > 0) {
                eluVar.b(i3);
                return;
            }
            return;
        }
        throw new IOException(a.bV(readInt, "Invalid first Ifd offset: "));
    }

    private final void n() {
        for (int i2 = 0; i2 < 10; i2++) {
            Log.d("ExifInterface", "The size of tag group[" + i2 + "]: " + this.J[i2].size());
            for (Map.Entry entry : this.J[i2].entrySet()) {
                elv elvVar = (elv) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + elvVar.toString() + ", tagValue: '" + elvVar.g(this.L) + "'");
            }
        }
    }

    private final void o(byte[] bArr, int i2) {
        elu eluVar = new elu(bArr, (byte[]) null);
        m(eluVar);
        v(eluVar, i2);
    }

    private final void p(int i2, String str, String str2) {
        if (!this.J[i2].isEmpty() && this.J[i2].get(str) != null) {
            HashMap hashMap = this.J[i2];
            hashMap.put(str2, (elv) hashMap.get(str));
            this.J[i2].remove(str);
        }
    }

    private final void q(elu eluVar) {
        elv elvVar;
        int a2;
        HashMap hashMap = this.J[4];
        elv elvVar2 = (elv) hashMap.get("Compression");
        if (elvVar2 != null) {
            int a3 = elvVar2.a(this.L);
            if (a3 != 1) {
                if (a3 != 6) {
                    if (a3 != 7) {
                        return;
                    }
                } else {
                    j(eluVar, hashMap);
                    return;
                }
            }
            elv elvVar3 = (elv) hashMap.get("BitsPerSample");
            if (elvVar3 != null) {
                int[] iArr = (int[]) elvVar3.f(this.L);
                int[] iArr2 = a;
                if (Arrays.equals(iArr2, iArr) || (this.I == 3 && (elvVar = (elv) hashMap.get("PhotometricInterpretation")) != null && ((a2 = elvVar.a(this.L)) != 1 ? !(a2 != 6 || !Arrays.equals(iArr, iArr2)) : Arrays.equals(iArr, b)))) {
                    k(eluVar, hashMap);
                    return;
                }
            }
            if (m) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        j(eluVar, hashMap);
    }

    private final void r(int i2, int i3) {
        if (!this.J[i2].isEmpty() && !this.J[i3].isEmpty()) {
            elv elvVar = (elv) this.J[i2].get("ImageLength");
            elv elvVar2 = (elv) this.J[i2].get("ImageWidth");
            elv elvVar3 = (elv) this.J[i3].get("ImageLength");
            elv elvVar4 = (elv) this.J[i3].get("ImageWidth");
            if (elvVar != null && elvVar2 != null) {
                if (elvVar3 != null && elvVar4 != null) {
                    int a2 = elvVar.a(this.L);
                    int a3 = elvVar2.a(this.L);
                    int a4 = elvVar3.a(this.L);
                    int a5 = elvVar4.a(this.L);
                    if (a2 < a4 && a3 < a5) {
                        HashMap[] hashMapArr = this.J;
                        HashMap hashMap = hashMapArr[i2];
                        hashMapArr[i2] = hashMapArr[i3];
                        hashMapArr[i3] = hashMap;
                        return;
                    }
                    return;
                }
                if (m) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (m) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (m) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private final void s() {
        r(0, 5);
        r(0, 4);
        r(5, 4);
        elv elvVar = (elv) this.J[1].get("PixelXDimension");
        elv elvVar2 = (elv) this.J[1].get("PixelYDimension");
        if (elvVar != null && elvVar2 != null) {
            this.J[0].put("ImageWidth", elvVar);
            this.J[0].put("ImageLength", elvVar2);
        }
        if (this.J[4].isEmpty() && t(this.J[5])) {
            HashMap[] hashMapArr = this.J;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!t(this.J[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        p(0, "ThumbnailOrientation", "Orientation");
        p(0, "ThumbnailImageLength", "ImageLength");
        p(0, "ThumbnailImageWidth", "ImageWidth");
        p(5, "ThumbnailOrientation", "Orientation");
        p(5, "ThumbnailImageLength", "ImageLength");
        p(5, "ThumbnailImageWidth", "ImageWidth");
        p(4, "Orientation", "ThumbnailOrientation");
        p(4, "ImageLength", "ThumbnailImageLength");
        p(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean t(HashMap hashMap) {
        elv elvVar = (elv) hashMap.get("ImageLength");
        elv elvVar2 = (elv) hashMap.get("ImageWidth");
        if (elvVar != null && elvVar2 != null) {
            int a2 = elvVar.a(this.L);
            int a3 = elvVar2.a(this.L);
            if (a2 <= 512 && a3 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final void u(elu eluVar) {
        elv elvVar;
        m(eluVar);
        v(eluVar, 0);
        w(eluVar, 0);
        w(eluVar, 5);
        w(eluVar, 4);
        s();
        if (this.I == 8 && (elvVar = (elv) this.J[1].get("MakerNote")) != null) {
            elu eluVar2 = new elu(elvVar.d, (byte[]) null);
            eluVar2.c = this.L;
            eluVar2.b(6);
            v(eluVar2, 9);
            elv elvVar2 = (elv) this.J[9].get("ColorSpace");
            if (elvVar2 != null) {
                this.J[1].put("ColorSpace", elvVar2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x00ac, code lost:
    
        if (r13 != 3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v(defpackage.elu r31, int r32) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elx.v(elu, int):void");
    }

    private final void w(elu eluVar, int i2) {
        elv e2;
        elv e3;
        elv elvVar = (elv) this.J[i2].get("DefaultCropSize");
        elv elvVar2 = (elv) this.J[i2].get("SensorTopBorder");
        elv elvVar3 = (elv) this.J[i2].get("SensorLeftBorder");
        elv elvVar4 = (elv) this.J[i2].get("SensorBottomBorder");
        elv elvVar5 = (elv) this.J[i2].get("SensorRightBorder");
        if (elvVar != null) {
            if (elvVar.a == 5) {
                elw[] elwVarArr = (elw[]) elvVar.f(this.L);
                if (elwVarArr != null && elwVarArr.length == 2) {
                    e2 = elv.d(elwVarArr[0], this.L);
                    e3 = elv.d(elwVarArr[1], this.L);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(elwVarArr))));
                    return;
                }
            } else {
                int[] iArr = (int[]) elvVar.f(this.L);
                if (iArr != null && iArr.length == 2) {
                    e2 = elv.e(iArr[0], this.L);
                    e3 = elv.e(iArr[1], this.L);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                }
            }
            this.J[i2].put("ImageWidth", e2);
            this.J[i2].put("ImageLength", e3);
            return;
        }
        if (elvVar2 != null && elvVar3 != null && elvVar4 != null && elvVar5 != null) {
            int a2 = elvVar2.a(this.L);
            int a3 = elvVar4.a(this.L);
            int a4 = elvVar5.a(this.L);
            int a5 = elvVar3.a(this.L);
            if (a3 > a2 && a4 > a5) {
                elv e4 = elv.e(a3 - a2, this.L);
                elv e5 = elv.e(a4 - a5, this.L);
                this.J[i2].put("ImageLength", e4);
                this.J[i2].put("ImageWidth", e5);
                return;
            }
            return;
        }
        elv elvVar6 = (elv) this.J[i2].get("ImageLength");
        elv elvVar7 = (elv) this.J[i2].get("ImageWidth");
        if (elvVar6 == null || elvVar7 == null) {
            elv elvVar8 = (elv) this.J[i2].get("JPEGInterchangeFormat");
            elv elvVar9 = (elv) this.J[i2].get("JPEGInterchangeFormatLength");
            if (elvVar8 != null && elvVar9 != null) {
                int a6 = elvVar8.a(this.L);
                int a7 = elvVar8.a(this.L);
                eluVar.c(a6);
                byte[] bArr = new byte[a7];
                eluVar.readFully(bArr);
                g(new elu(bArr), a6, i2);
            }
        }
    }

    private static final int x(byte[] bArr) {
        elu eluVar;
        long readInt;
        byte[] bArr2;
        long j2;
        elu eluVar2 = null;
        try {
            try {
                eluVar = new elu(bArr);
                try {
                    readInt = eluVar.readInt();
                    bArr2 = new byte[4];
                    eluVar.readFully(bArr2);
                } catch (Exception e2) {
                    e = e2;
                    eluVar2 = eluVar;
                    if (m) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (eluVar2 != null) {
                        eluVar2.close();
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    eluVar2 = eluVar;
                    if (eluVar2 != null) {
                        eluVar2.close();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
            if (!Arrays.equals(bArr2, n)) {
                eluVar.close();
                return 0;
            }
            if (readInt == 1) {
                readInt = eluVar.readLong();
                j2 = 16;
                if (readInt < 16) {
                    eluVar.close();
                    return 0;
                }
            } else {
                j2 = 8;
            }
            if (readInt > 5000) {
                readInt = 5000;
            }
            long j3 = readInt - j2;
            if (j3 < 8) {
                eluVar.close();
                return 0;
            }
            byte[] bArr3 = new byte[4];
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (long j4 = 0; j4 < (j3 >> 2); j4++) {
                try {
                    eluVar.readFully(bArr3);
                    if (j4 != 1) {
                        if (Arrays.equals(bArr3, o)) {
                            z2 = true;
                        } else if (Arrays.equals(bArr3, p)) {
                            z3 = true;
                        } else if (Arrays.equals(bArr3, q) || Arrays.equals(bArr3, r)) {
                            z4 = true;
                        }
                        if (!z2) {
                            continue;
                        } else {
                            if (z3) {
                                eluVar.close();
                                return 12;
                            }
                            if (z4) {
                                eluVar.close();
                                return 15;
                            }
                        }
                    }
                } catch (EOFException unused) {
                    eluVar.close();
                    return 0;
                }
            }
            eluVar.close();
            return 0;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static final ByteOrder y(elu eluVar) {
        short readShort = eluVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (m) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(readShort))));
        }
        if (m) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final int a(String str, int i2) {
        elv e2 = e(str);
        if (e2 == null) {
            return i2;
        }
        try {
            return e2.a(this.L);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public final String b(String str) {
        double d2;
        elv e2 = e(str);
        if (e2 == null) {
            return null;
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = e2.a;
            if (i2 != 5 && i2 != 10) {
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + e2.a);
                return null;
            }
            elw[] elwVarArr = (elw[]) e2.f(this.L);
            if (elwVarArr != null && elwVarArr.length == 3) {
                elw elwVar = elwVarArr[0];
                Integer valueOf = Integer.valueOf((int) (((float) elwVar.a) / ((float) elwVar.b)));
                elw elwVar2 = elwVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (((float) elwVar2.a) / ((float) elwVar2.b)));
                elw elwVar3 = elwVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) elwVar3.a) / ((float) elwVar3.b))));
            }
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(elwVarArr))));
            return null;
        }
        if (D.contains(str)) {
            try {
                Object f2 = e2.f(this.L);
                if (f2 != null) {
                    if (f2 instanceof String) {
                        d2 = Double.parseDouble((String) f2);
                    } else if (f2 instanceof long[]) {
                        long[] jArr = (long[]) f2;
                        if (jArr.length == 1) {
                            d2 = jArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (f2 instanceof int[]) {
                        int[] iArr = (int[]) f2;
                        if (iArr.length == 1) {
                            d2 = iArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (f2 instanceof double[]) {
                        double[] dArr = (double[]) f2;
                        if (dArr.length == 1) {
                            d2 = dArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (f2 instanceof elw[]) {
                        elw[] elwVarArr2 = (elw[]) f2;
                        if (elwVarArr2.length == 1) {
                            elw elwVar4 = elwVarArr2[0];
                            d2 = elwVar4.a / elwVar4.b;
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else {
                        throw new NumberFormatException("Couldn't find a double value");
                    }
                    return Double.toString(d2);
                }
                throw new NumberFormatException("NULL can't be converted to a double value");
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return e2.g(this.L);
    }

    public final byte[] c() {
        elv e2 = e("Xmp");
        if (e2 != null) {
            return e2.d;
        }
        return null;
    }
}
