package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eul {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final int[] g;
    private static final Pattern h;
    private static HashMap i;
    private static final String[] j;
    private static final String[] k;
    private static final int[] l;
    private static final int[] m;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        e = str + ", " + str3 + ", " + str2 + ", " + i2;
        f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        m = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        g = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, BasePaymentResult.ERROR_REQUEST_TIMEOUT, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, BasePaymentResult.ERROR_REQUEST_FAILED, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Drawable A(Context context, Resources resources, int i2) {
        return resources.getDrawable(i2, context.getTheme());
    }

    public static AudioFormat B(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static Handler C() {
        Looper myLooper = Looper.myLooper();
        dzg.h(myLooper);
        return new Handler(myLooper, null);
    }

    public static Handler D() {
        return new Handler(E(), null);
    }

    public static Looper E() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    public static eqn F(int i2, int i3, int i4) {
        eqm eqmVar = new eqm();
        eqmVar.b("audio/raw");
        eqmVar.B = i3;
        eqmVar.C = i4;
        eqmVar.D = i2;
        return new eqn(eqmVar);
    }

    public static String G(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String H(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String I(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, StandardCharsets.UTF_8);
    }

    public static String J(StringBuilder sb, Formatter formatter, long j2) {
        String str;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        long abs = Math.abs(j2) + 500;
        sb.setLength(0);
        if (j2 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long j3 = abs / 1000;
        long j4 = j3 / 3600;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 % 60;
        if (j4 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j6)).toString();
    }

    public static String K(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            eub.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String L(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return ConversationSuggestion.SUGGESTION_PROPERTY_TEXT;
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String M(int i2) {
        return Integer.toString(i2, 36);
    }

    public static String N(Context context, String str) {
        Throwable th;
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            String H = H(amcp.b(inputStream));
            R(inputStream);
            return H;
        } catch (Throwable th3) {
            th = th3;
            R(inputStream);
            throw th;
        }
    }

    public static String O(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String ap = albo.ap(str);
        int i2 = 0;
        String str2 = af(ap, "-")[0];
        if (i == null) {
            i = ap();
        }
        String str3 = (String) i.get(str2);
        if (str3 != null) {
            ap = str3.concat(String.valueOf(ap.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return ap;
        }
        while (true) {
            String[] strArr = k;
            int length = strArr.length;
            if (i2 < 18) {
                if (ap.startsWith(strArr[i2])) {
                    return String.valueOf(strArr[i2 + 1]).concat(String.valueOf(ap.substring(strArr[i2].length())));
                }
                i2 += 2;
            } else {
                return ap;
            }
        }
    }

    public static ExecutorService P(String str) {
        return Executors.newSingleThreadExecutor(new euk(str, 0));
    }

    public static ScheduledExecutorService Q(String str) {
        return Executors.newSingleThreadScheduledExecutor(new euk(str, 2));
    }

    public static void R(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean S(SparseArray sparseArray, int i2) {
        if (sparseArray.indexOfKey(i2) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        r4.I(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean T(defpackage.euf r3, defpackage.euf r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.b()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.c()
            int r2 = r3.b()
            if (r0 >= r2) goto L1a
            int r0 = r3.b()
            int r0 = r0 + r0
            r4.D(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.a
            int r2 = r3.b
            int r3 = r3.b()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L2d:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r2 = r4.c()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 == 0) goto L44
            r4.I(r3)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            r1 = 1
            goto L65
        L44:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 != 0) goto L65
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r0 == 0) goto L51
            goto L65
        L51:
            int r0 = r4.c()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r3 != r0) goto L2d
            int r0 = r4.c()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r0 = r0 + r0
            r4.D(r0)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            goto L2d
        L60:
            r3 = move-exception
            r5.reset()
            throw r3
        L65:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eul.T(euf, euf, java.util.zip.Inflater):boolean");
    }

    public static boolean U(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean V(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1487656890:
                if (str.equals("image/avif")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464693:
                if (str.equals("image/heic")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464690:
                if (str.equals("image/heif")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1487018032:
                if (str.equals("image/webp")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -879272239:
                if (str.equals("image/bmp")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
                if (a < 34) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static boolean W(int i2) {
        if (i2 != 3 && i2 != 2 && i2 != 268435456 && i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736 && i2 != 4) {
            return false;
        }
        return true;
    }

    public static boolean X(Context context) {
        int i2 = a;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30) {
            String str = d;
            if (albo.ar(str, "moto g(20)") || albo.ar(str, "rmx3231")) {
                return true;
            }
        }
        if (i2 == 34 && albo.ar(d, "sm-x200")) {
            return true;
        }
        return false;
    }

    public static boolean Y(int i2) {
        if (i2 != 10 && i2 != 13) {
            return false;
        }
        return true;
    }

    public static boolean Z() {
        String ap = albo.ap(b);
        if (!ap.contains("emulator") && !ap.contains("emu64a") && !ap.contains("emu64x") && !ap.contains("generic")) {
            return false;
        }
        return true;
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static boolean aa(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static boolean ab(ert ertVar, boolean z) {
        if (ertVar == null || !ertVar.P() || ertVar.w() == 1 || ertVar.w() == 4) {
            return true;
        }
        if (z && ertVar.x() != 0) {
            return true;
        }
        return false;
    }

    public static byte[] ac(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static Object[] ad(Object[] objArr, int i2) {
        boolean z;
        if (i2 <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return Arrays.copyOf(objArr, i2);
    }

    public static String[] ae(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] af(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] ag(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return ae(str.trim(), "(\\s*,\\s*)");
    }

    public static int ah(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i2 = binarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            binarySearch = i2;
        }
        if (!z) {
            return i2;
        }
        return binarySearch;
    }

    public static int ai(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        if (z) {
            return Math.max(0, i2);
        }
        return i2;
    }

    public static void aj(ert ertVar, boolean z) {
        if (ab(ertVar, z)) {
            an(ertVar);
        } else {
            am(ertVar);
        }
    }

    public static void ak(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void al(long[] jArr, long j2) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long cN = albo.cN(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = albo.cN(jArr[i2], cN, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long cN2 = albo.cN(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = albo.cP(jArr[i2], cN2);
                i2++;
            }
            return;
        }
        for (int i3 = 0; i3 < jArr.length; i3++) {
            long j3 = jArr[i3];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i3] = albo.cN(1000000L, albo.cN(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 < j3 && j3 % j2 == 0) {
                    jArr[i3] = albo.cP(1000000L, albo.cN(j3, j2, RoundingMode.UNNECESSARY));
                } else {
                    jArr[i3] = ao(j3, 1000000L, j2, roundingMode);
                }
            }
        }
    }

    public static void am(ert ertVar) {
        if (ertVar.l(1)) {
            ertVar.d();
        }
    }

    public static void an(ert ertVar) {
        int w = ertVar.w();
        if (w == 1) {
            if (ertVar.l(2)) {
                ertVar.L();
            }
        } else if (w == 4 && ertVar.l(4)) {
            eqb eqbVar = (eqb) ertVar;
            eqbVar.r(eqbVar.u());
        }
        if (ertVar.l(1)) {
            ertVar.e();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (java.lang.Math.abs(r9 - r4) == 0.5d) goto L57;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0081. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long ao(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eul.ao(long, long, long, java.math.RoundingMode):long");
    }

    private static HashMap ap() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = j.length;
        HashMap hashMap = new HashMap(length + 88);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = j;
            int length3 = strArr.length;
            if (i2 < 88) {
                hashMap.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            } else {
                return hashMap;
            }
        }
    }

    public static int b(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                i3 = binarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                binarySearch = i3;
            }
            if (z) {
                i4 = binarySearch;
            } else {
                i4 = i3;
            }
        }
        if (z2) {
            return Math.max(0, i4);
        }
        return i4;
    }

    public static int c(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int d(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int e(int i2, int i3) {
        return (char) (m[i2 ^ (i3 >> 12)] ^ ((char) (i3 << 4)));
    }

    public static int f(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = l[(i4 >>> 24) ^ (bArr[i2] & 255)] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static int g(int i2) {
        if (i2 == 20) {
            return 30;
        }
        if (i2 != 22) {
            if (i2 != 30) {
                switch (i2) {
                    case 2:
                    case 3:
                        return 3;
                    case 4:
                    case 5:
                    case 6:
                        return 21;
                    case 7:
                    case 8:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return 28;
                    default:
                        switch (i2) {
                            case 14:
                                return 25;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                                return 28;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
            }
            return 34;
        }
        return 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = defpackage.eul.a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eul.h(int):int");
    }

    public static int i(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i3;
        }
        return Integer.reverseBytes(i3);
    }

    public static int j(int i2) {
        if (i2 != 2 && i2 != 4) {
            if (i2 != 10) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        switch (i2) {
                            case 15:
                                return 6003;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i2) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static int k(String str) {
        String[] ae;
        int length;
        boolean z;
        int i2 = 0;
        if (str == null || (length = (ae = ae(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = ae[length - 1];
        if (length >= 3 && "neg".equals(ae[length - 2])) {
            z = true;
        } else {
            z = false;
        }
        try {
            dzg.g(str2);
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static int l(Context context) {
        if (X(context)) {
            return 1;
        }
        return 5;
    }

    public static int m(int i2) {
        if (i2 != 8) {
            if (i2 != 16) {
                if (i2 != 24) {
                    if (i2 != 32) {
                        return 0;
                    }
                    return 22;
                }
                return 21;
            }
            return 2;
        }
        return 3;
    }

    public static int n(int i2, int i3) {
        int i4 = 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 21) {
                        if (i2 != 22) {
                            if (i2 != 268435456) {
                                if (i2 != 1342177280) {
                                    if (i2 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    i4 = 3;
                }
                i4 = 4;
            } else {
                i4 = 1;
            }
        }
        return i4 * i3;
    }

    public static int o(Uri uri, String str) {
        int i2;
        char c2 = 65535;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme != null && albo.ar("rtsp", scheme)) {
                return 3;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String ap = albo.ap(lastPathSegment.substring(lastIndexOf + 1));
                switch (ap.hashCode()) {
                    case 104579:
                        if (ap.equals("ism")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 108321:
                        if (ap.equals("mpd")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3242057:
                        if (ap.equals("isml")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 3299913:
                        if (ap.equals("m3u8")) {
                            c2 = 1;
                            break;
                        }
                        break;
                }
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 != 2 && c2 != 3) {
                            i2 = 4;
                        } else {
                            i2 = 1;
                        }
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 0;
                }
                if (i2 != 4) {
                    return i2;
                }
            }
            Pattern pattern = h;
            String path = uri.getPath();
            dzg.g(path);
            Matcher matcher = pattern.matcher(path);
            if (!matcher.matches()) {
                return 4;
            }
            String group = matcher.group(2);
            if (group != null) {
                if (group.contains("format=mpd-time-csf")) {
                    return 0;
                }
                if (group.contains("format=m3u8-aapl")) {
                    return 2;
                }
            }
            return 1;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c2 = 1;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c2 = 2;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return 0;
        }
        if (c2 == 1) {
            return 2;
        }
        if (c2 == 2) {
            return 1;
        }
        if (c2 != 3) {
            return 4;
        }
        return 3;
    }

    public static int p(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static long q(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long r(long j2, int i2) {
        return x(j2, i2, 1000000L, RoundingMode.CEILING);
    }

    public static long s(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 * f2);
    }

    public static long t(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 / f2);
    }

    public static long u(long j2) {
        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
            return j2 * 1000;
        }
        return j2;
    }

    public static long v(long j2, int i2) {
        return x(j2, 1000000L, i2, RoundingMode.FLOOR);
    }

    public static long w(long j2, long j3, long j4) {
        return x(j2, j3, j4, RoundingMode.FLOOR);
    }

    public static long x(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        if (j4 >= j3 && j4 % j3 == 0) {
            return albo.cN(j2, albo.cN(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return albo.cP(j2, albo.cN(j3, j4, RoundingMode.UNNECESSARY));
        }
        if (j4 >= j2 && j4 % j2 == 0) {
            return albo.cN(j3, albo.cN(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j4 < j2 && j2 % j4 == 0) {
            return albo.cP(j3, albo.cN(j2, j4, RoundingMode.UNNECESSARY));
        }
        return ao(j2, j3, j4, roundingMode);
    }

    public static long y(int i2) {
        return i2 & 4294967295L;
    }

    public static long z(long j2) {
        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
            return j2 / 1000;
        }
        return j2;
    }
}
