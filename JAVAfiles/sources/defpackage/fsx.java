package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsx {
    public static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final euf c = new euf();
    public final StringBuilder d = new StringBuilder();

    public static String a(euf eufVar, StringBuilder sb) {
        sb.setLength(0);
        int i = eufVar.b;
        int i2 = eufVar.c;
        loop0: while (true) {
            for (boolean z = false; i < i2 && !z; z = true) {
                char c = (char) eufVar.a[i];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    i++;
                }
            }
        }
        eufVar.K(i - eufVar.b);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(euf eufVar, StringBuilder sb) {
        c(eufVar);
        if (eufVar.b() == 0) {
            return null;
        }
        String a2 = a(eufVar, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        char j = (char) eufVar.j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(euf eufVar) {
        while (true) {
            for (boolean z = true; eufVar.b() > 0 && z; z = false) {
                int i = eufVar.b;
                byte[] bArr = eufVar.a;
                byte b2 = bArr[i];
                char c = (char) b2;
                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                    int i2 = eufVar.c;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b2 == 47) {
                            int i4 = i + 2;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i4 + 2;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                eufVar.K(i2 - eufVar.b);
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    eufVar.K(1);
                }
            }
            return;
        }
    }
}
