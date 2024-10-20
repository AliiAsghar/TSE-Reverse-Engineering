package defpackage;

import com.android.vcard.VCardConstants;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etj {
    public static final byte[] a = {0, 0, 0, 1};
    private static final String[] b = {"", "A", VCardConstants.PARAM_ENCODING_B, "C"};
    private static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:109:0x0254. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair a(defpackage.eqn r19) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etj.a(eqn):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00be, code lost:
    
        if (r11.equals("L123") != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(java.lang.String r10, java.lang.String[] r11, defpackage.eqd r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etj.b(java.lang.String, java.lang.String[], eqd):android.util.Pair");
    }

    public static String c(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String d(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        char c2;
        String str = b[i];
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        if (true != z) {
            c2 = 'L';
        } else {
            c2 = 'H';
        }
        StringBuilder sb = new StringBuilder(eul.G("hvc1.%s%d.%X.%c%d", str, valueOf, valueOf2, Character.valueOf(c2), Integer.valueOf(i4)));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }
}
