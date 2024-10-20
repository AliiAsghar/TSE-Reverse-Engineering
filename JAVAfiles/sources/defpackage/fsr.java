package defpackage;

import android.text.Layout;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsr implements frl {
    private final XmlPullParserFactory i;
    private static final Pattern c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern a = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern b = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern g = Pattern.compile("^(\\d+) (\\d+)$");
    private static final fsp h = new fsp(30.0f, 1, 1);

    public fsr() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.i = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
    
        if (r0.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long d(java.lang.String r18, defpackage.fsp r19) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsr.d(java.lang.String, fsp):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment e(String str) {
        char c2;
        String ap = albo.ap(str);
        switch (ap.hashCode()) {
            case -1364013995:
                if (ap.equals("center")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (ap.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3317767:
                if (ap.equals("left")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 108511772:
                if (ap.equals("right")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (ap.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0 && c2 != 1) {
            if (c2 != 2 && c2 != 3) {
                if (c2 != 4) {
                    return null;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private static fst f(fst fstVar) {
        if (fstVar == null) {
            return new fst();
        }
        return fstVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0265, code lost:
    
        r0 = f(r0);
        r0.g = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x026d, code lost:
    
        r0 = f(r0);
        r0.f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0275, code lost:
    
        r0 = f(r0);
        r0.f = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02fc, code lost:
    
        if (r11 == 0) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02fe, code lost:
    
        if (r11 == 1) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0301, code lost:
    
        if (r11 == 2) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0303, code lost:
    
        r5 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0304, code lost:
    
        if (r11 == 3) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0307, code lost:
    
        if (r11 == 4) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030a, code lost:
    
        if (r11 == 5) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030e, code lost:
    
        r0 = f(r0);
        r0.m = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0316, code lost:
    
        r0 = f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0320, code lost:
    
        r0.m = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031b, code lost:
    
        r0 = f(r0);
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0324, code lost:
    
        r0 = f(r0);
        r0.m = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0251, code lost:
    
        if (r11 == 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0253, code lost:
    
        if (r11 == 1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0256, code lost:
    
        if (r11 == 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0259, code lost:
    
        if (r11 == 3) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025d, code lost:
    
        r0 = f(r0);
        r0.g = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.fst g(org.xmlpull.v1.XmlPullParser r16, defpackage.fst r17) {
        /*
            Method dump skipped, instructions count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsr.g(org.xmlpull.v1.XmlPullParser, fst):fst");
    }

    private static String[] h(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        return eul.ae(trim, "\\s+");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ab, code lost:
    
        r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02b4, code lost:
    
        if (defpackage.dzh.e(r5, "image") == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02b6, code lost:
    
        r2 = defpackage.dzh.c(r5, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ba, code lost:
    
        if (r2 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02bc, code lost:
    
        r8.put(r2, r5.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02c7, code lost:
    
        if (defpackage.dzh.d(r5, r3) == false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x05f1, code lost:
    
        if (r12 != (-9223372036854775807L)) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02a9, code lost:
    
        if (defpackage.dzh.e(r5, r3) != false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04d0 A[Catch: IOException -> 0x06e6, XmlPullParserException -> 0x06f0, TryCatch #17 {IOException -> 0x06e6, XmlPullParserException -> 0x06f0, blocks: (B:3:0x0008, B:6:0x0063, B:8:0x006d, B:11:0x007a, B:14:0x0082, B:16:0x008a, B:17:0x0091, B:19:0x0099, B:22:0x00a8, B:23:0x00c7, B:25:0x00d5, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x015d, B:37:0x01b8, B:40:0x01c6, B:42:0x01cc, B:44:0x01d4, B:46:0x01dc, B:48:0x01e4, B:50:0x01ec, B:52:0x01f4, B:54:0x01fa, B:56:0x0202, B:58:0x020a, B:60:0x0210, B:62:0x0216, B:64:0x021e, B:66:0x0226, B:69:0x022f, B:71:0x06cd, B:72:0x0257, B:74:0x025d, B:76:0x0266, B:78:0x0275, B:80:0x027f, B:82:0x0293, B:84:0x0297, B:86:0x04d5, B:95:0x029b, B:98:0x02a5, B:100:0x02ab, B:102:0x02b6, B:104:0x02bc, B:105:0x02c3, B:109:0x02d1, B:114:0x04d0, B:115:0x02e0, B:117:0x02e8, B:122:0x0301, B:124:0x0362, B:126:0x036a, B:130:0x0379, B:132:0x03dd, B:134:0x03e5, B:147:0x042d, B:149:0x0435, B:165:0x047e, B:182:0x0399, B:183:0x03a4, B:186:0x03ac, B:189:0x03b8, B:192:0x048a, B:194:0x0496, B:195:0x04a2, B:197:0x031f, B:198:0x0329, B:201:0x0333, B:204:0x033e, B:207:0x04aa, B:208:0x04b6, B:209:0x04c2, B:212:0x04ee, B:215:0x04f3, B:219:0x050b, B:238:0x05ab, B:247:0x0567, B:251:0x0570, B:244:0x062d, B:258:0x0578, B:261:0x0582, B:266:0x0597, B:268:0x059c, B:270:0x05a4, B:294:0x05bf, B:298:0x05c9, B:301:0x05d2, B:307:0x05e6, B:309:0x05f9, B:312:0x060e, B:314:0x0613, B:322:0x05ed, B:337:0x0168, B:339:0x0174, B:342:0x017f, B:345:0x019e, B:346:0x0107, B:348:0x0113, B:351:0x011e, B:356:0x0147, B:359:0x0153, B:372:0x064e, B:378:0x0690, B:380:0x069a, B:381:0x06af, B:386:0x06c3, B:389:0x06c9, B:391:0x06e0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0435 A[Catch: IOException -> 0x06e6, XmlPullParserException -> 0x06f0, TRY_LEAVE, TryCatch #17 {IOException -> 0x06e6, XmlPullParserException -> 0x06f0, blocks: (B:3:0x0008, B:6:0x0063, B:8:0x006d, B:11:0x007a, B:14:0x0082, B:16:0x008a, B:17:0x0091, B:19:0x0099, B:22:0x00a8, B:23:0x00c7, B:25:0x00d5, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x015d, B:37:0x01b8, B:40:0x01c6, B:42:0x01cc, B:44:0x01d4, B:46:0x01dc, B:48:0x01e4, B:50:0x01ec, B:52:0x01f4, B:54:0x01fa, B:56:0x0202, B:58:0x020a, B:60:0x0210, B:62:0x0216, B:64:0x021e, B:66:0x0226, B:69:0x022f, B:71:0x06cd, B:72:0x0257, B:74:0x025d, B:76:0x0266, B:78:0x0275, B:80:0x027f, B:82:0x0293, B:84:0x0297, B:86:0x04d5, B:95:0x029b, B:98:0x02a5, B:100:0x02ab, B:102:0x02b6, B:104:0x02bc, B:105:0x02c3, B:109:0x02d1, B:114:0x04d0, B:115:0x02e0, B:117:0x02e8, B:122:0x0301, B:124:0x0362, B:126:0x036a, B:130:0x0379, B:132:0x03dd, B:134:0x03e5, B:147:0x042d, B:149:0x0435, B:165:0x047e, B:182:0x0399, B:183:0x03a4, B:186:0x03ac, B:189:0x03b8, B:192:0x048a, B:194:0x0496, B:195:0x04a2, B:197:0x031f, B:198:0x0329, B:201:0x0333, B:204:0x033e, B:207:0x04aa, B:208:0x04b6, B:209:0x04c2, B:212:0x04ee, B:215:0x04f3, B:219:0x050b, B:238:0x05ab, B:247:0x0567, B:251:0x0570, B:244:0x062d, B:258:0x0578, B:261:0x0582, B:266:0x0597, B:268:0x059c, B:270:0x05a4, B:294:0x05bf, B:298:0x05c9, B:301:0x05d2, B:307:0x05e6, B:309:0x05f9, B:312:0x060e, B:314:0x0613, B:322:0x05ed, B:337:0x0168, B:339:0x0174, B:342:0x017f, B:345:0x019e, B:346:0x0107, B:348:0x0113, B:351:0x011e, B:356:0x0147, B:359:0x0153, B:372:0x064e, B:378:0x0690, B:380:0x069a, B:381:0x06af, B:386:0x06c3, B:389:0x06c9, B:391:0x06e0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0168 A[Catch: IOException -> 0x06e6, XmlPullParserException -> 0x06f0, TryCatch #17 {IOException -> 0x06e6, XmlPullParserException -> 0x06f0, blocks: (B:3:0x0008, B:6:0x0063, B:8:0x006d, B:11:0x007a, B:14:0x0082, B:16:0x008a, B:17:0x0091, B:19:0x0099, B:22:0x00a8, B:23:0x00c7, B:25:0x00d5, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x015d, B:37:0x01b8, B:40:0x01c6, B:42:0x01cc, B:44:0x01d4, B:46:0x01dc, B:48:0x01e4, B:50:0x01ec, B:52:0x01f4, B:54:0x01fa, B:56:0x0202, B:58:0x020a, B:60:0x0210, B:62:0x0216, B:64:0x021e, B:66:0x0226, B:69:0x022f, B:71:0x06cd, B:72:0x0257, B:74:0x025d, B:76:0x0266, B:78:0x0275, B:80:0x027f, B:82:0x0293, B:84:0x0297, B:86:0x04d5, B:95:0x029b, B:98:0x02a5, B:100:0x02ab, B:102:0x02b6, B:104:0x02bc, B:105:0x02c3, B:109:0x02d1, B:114:0x04d0, B:115:0x02e0, B:117:0x02e8, B:122:0x0301, B:124:0x0362, B:126:0x036a, B:130:0x0379, B:132:0x03dd, B:134:0x03e5, B:147:0x042d, B:149:0x0435, B:165:0x047e, B:182:0x0399, B:183:0x03a4, B:186:0x03ac, B:189:0x03b8, B:192:0x048a, B:194:0x0496, B:195:0x04a2, B:197:0x031f, B:198:0x0329, B:201:0x0333, B:204:0x033e, B:207:0x04aa, B:208:0x04b6, B:209:0x04c2, B:212:0x04ee, B:215:0x04f3, B:219:0x050b, B:238:0x05ab, B:247:0x0567, B:251:0x0570, B:244:0x062d, B:258:0x0578, B:261:0x0582, B:266:0x0597, B:268:0x059c, B:270:0x05a4, B:294:0x05bf, B:298:0x05c9, B:301:0x05d2, B:307:0x05e6, B:309:0x05f9, B:312:0x060e, B:314:0x0613, B:322:0x05ed, B:337:0x0168, B:339:0x0174, B:342:0x017f, B:345:0x019e, B:346:0x0107, B:348:0x0113, B:351:0x011e, B:356:0x0147, B:359:0x0153, B:372:0x064e, B:378:0x0690, B:380:0x069a, B:381:0x06af, B:386:0x06c3, B:389:0x06c9, B:391:0x06e0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025d A[Catch: IOException -> 0x06e6, XmlPullParserException -> 0x06f0, LOOP:1: B:74:0x025d->B:88:0x04e2, LOOP_START, PHI: r3 r6 r12
  0x025d: PHI (r3v17 java.lang.String) = (r3v9 java.lang.String), (r3v53 java.lang.String) binds: [B:73:0x025b, B:88:0x04e2] A[DONT_GENERATE, DONT_INLINE]
  0x025d: PHI (r6v8 java.util.HashMap) = (r6v1 java.util.HashMap), (r6v33 java.util.HashMap) binds: [B:73:0x025b, B:88:0x04e2] A[DONT_GENERATE, DONT_INLINE]
  0x025d: PHI (r12v15 fsp) = (r12v5 fsp), (r12v32 fsp) binds: [B:73:0x025b, B:88:0x04e2] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x06e6, XmlPullParserException -> 0x06f0, blocks: (B:3:0x0008, B:6:0x0063, B:8:0x006d, B:11:0x007a, B:14:0x0082, B:16:0x008a, B:17:0x0091, B:19:0x0099, B:22:0x00a8, B:23:0x00c7, B:25:0x00d5, B:26:0x00dc, B:28:0x00e8, B:29:0x00f3, B:33:0x015d, B:37:0x01b8, B:40:0x01c6, B:42:0x01cc, B:44:0x01d4, B:46:0x01dc, B:48:0x01e4, B:50:0x01ec, B:52:0x01f4, B:54:0x01fa, B:56:0x0202, B:58:0x020a, B:60:0x0210, B:62:0x0216, B:64:0x021e, B:66:0x0226, B:69:0x022f, B:71:0x06cd, B:72:0x0257, B:74:0x025d, B:76:0x0266, B:78:0x0275, B:80:0x027f, B:82:0x0293, B:84:0x0297, B:86:0x04d5, B:95:0x029b, B:98:0x02a5, B:100:0x02ab, B:102:0x02b6, B:104:0x02bc, B:105:0x02c3, B:109:0x02d1, B:114:0x04d0, B:115:0x02e0, B:117:0x02e8, B:122:0x0301, B:124:0x0362, B:126:0x036a, B:130:0x0379, B:132:0x03dd, B:134:0x03e5, B:147:0x042d, B:149:0x0435, B:165:0x047e, B:182:0x0399, B:183:0x03a4, B:186:0x03ac, B:189:0x03b8, B:192:0x048a, B:194:0x0496, B:195:0x04a2, B:197:0x031f, B:198:0x0329, B:201:0x0333, B:204:0x033e, B:207:0x04aa, B:208:0x04b6, B:209:0x04c2, B:212:0x04ee, B:215:0x04f3, B:219:0x050b, B:238:0x05ab, B:247:0x0567, B:251:0x0570, B:244:0x062d, B:258:0x0578, B:261:0x0582, B:266:0x0597, B:268:0x059c, B:270:0x05a4, B:294:0x05bf, B:298:0x05c9, B:301:0x05d2, B:307:0x05e6, B:309:0x05f9, B:312:0x060e, B:314:0x0613, B:322:0x05ed, B:337:0x0168, B:339:0x0174, B:342:0x017f, B:345:0x019e, B:346:0x0107, B:348:0x0113, B:351:0x011e, B:356:0x0147, B:359:0x0153, B:372:0x064e, B:378:0x0690, B:380:0x069a, B:381:0x06af, B:386:0x06c3, B:389:0x06c9, B:391:0x06e0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04e2 A[LOOP:1: B:74:0x025d->B:88:0x04e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04db A[SYNTHETIC] */
    @Override // defpackage.frl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.frc a(byte[] r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsr.a(byte[], int, int):frc");
    }

    @Override // defpackage.frl
    public final void b(byte[] bArr, int i, int i2, frk frkVar, etm etmVar) {
        fsm.c(a(bArr, i, i2), frkVar, etmVar);
    }

    @Override // defpackage.frl
    public final /* synthetic */ void c() {
    }
}
