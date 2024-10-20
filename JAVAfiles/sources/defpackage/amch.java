package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amch {
    private static final alpt a = alpt.t("http", "https", "mailto", "ftp");
    private static final alpt b = alpt.v("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska", "font/ttf");
    private static final alpt c = altg.a;

    public static amcg a(String str) {
        char charAt;
        int i;
        char charAt2;
        char charAt3;
        amcg amcgVar = amcg.a;
        alpt alptVar = c;
        String ap = albo.ap(str);
        aluq listIterator = a.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                if (ap.startsWith(String.valueOf((String) listIterator.next()).concat(":"))) {
                    break;
                }
            } else {
                if (ap.startsWith("data:")) {
                    String ap2 = albo.ap(str);
                    if (ap2.startsWith("data:") && ap2.length() > 5) {
                        int i2 = 5;
                        while (i2 < ap2.length() && (charAt3 = ap2.charAt(i2)) != ';' && charAt3 != ',') {
                            i2++;
                        }
                        if (b.contains(ap2.substring(5, i2)) && ap2.startsWith(";base64,", i2) && (i = i2 + 8) < ap2.length()) {
                            while (i < ap2.length() && (charAt2 = ap2.charAt(i)) != '=') {
                                if ((charAt2 < 'a' || charAt2 > 'z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '/')) {
                                    break;
                                }
                                i++;
                            }
                            while (i < ap2.length()) {
                                if (ap2.charAt(i) == '=') {
                                    i++;
                                }
                            }
                        }
                    }
                    return amcgVar;
                }
                aluq listIterator2 = ((altg) alptVar).listIterator();
                while (true) {
                    if (listIterator2.hasNext()) {
                        if (ap.startsWith(String.valueOf(albo.ap(((amcd) listIterator2.next()).name()).replace('_', '-')).concat(":"))) {
                            break;
                        }
                    } else {
                        for (int i3 = 0; i3 < str.length() && (charAt = str.charAt(i3)) != '#' && charAt != '/'; i3++) {
                            if (charAt != ':') {
                                if (charAt == '?') {
                                    break;
                                }
                            }
                        }
                    }
                }
                return amcgVar;
            }
        }
        return new amcg(str);
    }
}
