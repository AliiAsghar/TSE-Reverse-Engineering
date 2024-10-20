package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erl {
    private static final ArrayList a = new ArrayList();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str, String str2) {
        char c;
        fsq k;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (k = k(str2)) == null) {
                    return 0;
                }
                return k.a();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case '\b':
                return 8;
            case '\t':
                return 30;
            case '\n':
                return 14;
            case 11:
                return 20;
            default:
                return 0;
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (g(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str)) {
            return 3;
        }
        if (h(str)) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            if (!"application/x-camera-motion".equals(str)) {
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    apuv apuvVar = (apuv) a.get(i);
                    Object obj = apuvVar.c;
                    if (str.equals(null)) {
                        int i2 = apuvVar.a;
                        return 0;
                    }
                }
                return -1;
            }
            return 6;
        }
        return 5;
    }

    public static String c(String str) {
        fsq k;
        String str2 = null;
        if (str != null) {
            String ap = albo.ap(str.trim());
            if (!ap.startsWith("avc1") && !ap.startsWith("avc3")) {
                if (!ap.startsWith("hev1") && !ap.startsWith("hvc1")) {
                    if (!ap.startsWith("dvav") && !ap.startsWith("dva1") && !ap.startsWith("dvhe") && !ap.startsWith("dvh1")) {
                        if (ap.startsWith("av01")) {
                            return "video/av01";
                        }
                        if (!ap.startsWith("vp9") && !ap.startsWith("vp09")) {
                            if (!ap.startsWith("vp8") && !ap.startsWith("vp08")) {
                                if (ap.startsWith("mp4a")) {
                                    if (ap.startsWith("mp4a.") && (k = k(ap)) != null) {
                                        str2 = d(k.a);
                                    }
                                    if (str2 == null) {
                                        return "audio/mp4a-latm";
                                    }
                                    return str2;
                                }
                                if (ap.startsWith("mha1")) {
                                    return "audio/mha1";
                                }
                                if (ap.startsWith("mhm1")) {
                                    return "audio/mhm1";
                                }
                                if (!ap.startsWith("ac-3") && !ap.startsWith("dac3")) {
                                    if (!ap.startsWith("ec-3") && !ap.startsWith("dec3")) {
                                        if (ap.startsWith("ec+3")) {
                                            return "audio/eac3-joc";
                                        }
                                        if (!ap.startsWith("ac-4") && !ap.startsWith("dac4")) {
                                            if (ap.startsWith("dtsc")) {
                                                return "audio/vnd.dts";
                                            }
                                            if (ap.startsWith("dtse")) {
                                                return "audio/vnd.dts.hd;profile=lbr";
                                            }
                                            if (!ap.startsWith("dtsh") && !ap.startsWith("dtsl")) {
                                                if (ap.startsWith("dtsx")) {
                                                    return "audio/vnd.dts.uhd;profile=p2";
                                                }
                                                if (ap.startsWith("opus")) {
                                                    return "audio/opus";
                                                }
                                                if (ap.startsWith("vorbis")) {
                                                    return "audio/vorbis";
                                                }
                                                if (ap.startsWith("flac")) {
                                                    return "audio/flac";
                                                }
                                                if (ap.startsWith("stpp")) {
                                                    return "application/ttml+xml";
                                                }
                                                if (ap.startsWith("wvtt")) {
                                                    return "text/vtt";
                                                }
                                                if (ap.contains("cea708")) {
                                                    return "application/cea-708";
                                                }
                                                if (!ap.contains("eia608") && !ap.contains("cea608")) {
                                                    int size = a.size();
                                                    int i = 0;
                                                    while (true) {
                                                        if (i >= size) {
                                                            break;
                                                        }
                                                        apuv apuvVar = (apuv) a.get(i);
                                                        Object obj = apuvVar.b;
                                                        if (ap.startsWith(null)) {
                                                            Object obj2 = apuvVar.c;
                                                            break;
                                                        }
                                                        i++;
                                                    }
                                                } else {
                                                    return "application/cea-608";
                                                }
                                            } else {
                                                return "audio/vnd.dts.hd";
                                            }
                                        } else {
                                            return "audio/ac4";
                                        }
                                    } else {
                                        return "audio/eac3";
                                    }
                                } else {
                                    return "audio/ac3";
                                }
                            } else {
                                return "video/x-vnd.on2.vp8";
                            }
                        } else {
                            return "video/x-vnd.on2.vp9";
                        }
                    } else {
                        return "video/dolby-vision";
                    }
                } else {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return null;
    }

    public static String d(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 221) {
                                    if (i != 165) {
                                        if (i != 166) {
                                            switch (i) {
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case VCardConstants.DEFAULT_PREF /* 100 */:
                                                case 101:
                                                    return "video/mpeg2";
                                                case 102:
                                                case 103:
                                                case 104:
                                                    return "audio/mp4a-latm";
                                                case 105:
                                                case 107:
                                                    return "audio/mpeg";
                                                case 106:
                                                    return "video/mpeg";
                                                case 108:
                                                    return "image/jpeg";
                                                default:
                                                    switch (i) {
                                                        case 169:
                                                        case 172:
                                                            return "audio/vnd.dts";
                                                        case 170:
                                                        case 171:
                                                            return "audio/vnd.dts.hd";
                                                        case 173:
                                                            return "audio/opus";
                                                        case 174:
                                                            return "audio/ac4";
                                                        default:
                                                            return null;
                                                    }
                                            }
                                        }
                                        return "audio/eac3";
                                    }
                                    return "audio/ac3";
                                }
                                return "audio/vorbis";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String e(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String ap = albo.ap(str);
        switch (ap.hashCode()) {
            case -1007807498:
                if (ap.equals("audio/x-flac")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -979095690:
                if (ap.equals("application/x-mpegurl")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -586683234:
                if (ap.equals("audio/x-wav")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -432836268:
                if (ap.equals("audio/mpeg-l1")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -432836267:
                if (ap.equals("audio/mpeg-l2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 187090231:
                if (ap.equals("audio/mp3")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                return ap;
                            }
                            return "audio/mpeg-L2";
                        }
                        return "audio/mpeg-L1";
                    }
                    return "application/x-mpegURL";
                }
                return "audio/wav";
            }
            return "audio/mpeg";
        }
        return "audio/flac";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean f(String str, String str2) {
        char c;
        fsq k;
        int a2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                if (str2 == null || (k = k(str2)) == null || (a2 = k.a()) == 0 || a2 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static boolean g(String str) {
        return "audio".equals(l(str));
    }

    public static boolean h(String str) {
        if (!"image".equals(l(str)) && !"application/x-image-uri".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean i(String str) {
        if (!ConversationSuggestion.SUGGESTION_PROPERTY_TEXT.equals(l(str)) && !"application/x-media3-cues".equals(str) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean j(String str) {
        return "video".equals(l(str));
    }

    static fsq k(String str) {
        int i;
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            dzg.g(group);
            String group2 = matcher.group(2);
            try {
                int parseInt = Integer.parseInt(group, 16);
                if (group2 != null) {
                    i = Integer.parseInt(group2);
                } else {
                    i = 0;
                }
                return new fsq(parseInt, i);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    private static String l(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf(47)) != -1) {
            return str.substring(0, indexOf);
        }
        return null;
    }
}
