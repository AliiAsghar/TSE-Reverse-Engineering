package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysu {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil");

    public static Boolean a(String str) {
        List c = anna.e(':').c(str);
        if ((((String) c.get(0)).equals("sip") || ((String) c.get(0)).equals("proto")) && c.size() >= 2 && !((String) c.get(1)).equals("sip") && !((String) c.get(1)).equals("proto")) {
            return true;
        }
        return false;
    }

    public static String b(String str, boolean z) {
        vqd vqdVar;
        if (str == null) {
            return null;
        }
        if (a(str).booleanValue()) {
            return str;
        }
        if (z) {
            alvg alvgVar = (alvg) a.i();
            alvgVar.Z(alwk.MEDIUM);
            ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil", "extractConferenceUriFromSerializedTransactionId", 44, "ConferenceUriFilterUtil.java")).t("Attempting to reformat invalid conferenceUri: %s", c(str));
        }
        List c = anna.e(':').c(str);
        int i = 0;
        while (i < c.size() && (((String) c.get(i)).contains("sip") || ((String) c.get(i)).contains("proto"))) {
            i++;
        }
        List subList = c.subList(i, c.size());
        StringBuilder sb = new StringBuilder();
        Iterator it = subList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ":");
            }
        }
        try {
            vre b = vrf.b(sb.toString(), true);
            if (b == null) {
                if (z) {
                    alvg alvgVar2 = (alvg) a.i();
                    alvgVar2.Z(alwk.MEDIUM);
                    ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil", "extractConferenceUriFromSerializedTransactionId", 68, "ConferenceUriFilterUtil.java")).t("Failed to format invalid RCS conferenceUri - metadata is empty: %s", c(str));
                }
                return null;
            }
            Object obj = b.c.get();
            if (((vqe) obj).c == 2) {
                vqdVar = (vqd) ((vqe) obj).d;
            } else {
                vqdVar = vqd.a;
            }
            String str2 = vqdVar.f;
            if (true == a(str2).booleanValue()) {
                return str2;
            }
            return str;
        } catch (IllegalArgumentException | NoSuchElementException e) {
            if (z) {
                alvg alvgVar3 = (alvg) a.i();
                alvgVar3.Z(alwk.MEDIUM);
                ((alvg) ((alvg) alvgVar3.g(e)).h("com/google/android/apps/messaging/shared/util/text/ConferenceUriFilterUtil", "extractConferenceUriFromSerializedTransactionId", 83, "ConferenceUriFilterUtil.java")).t("Failed to format invalid RCS conferenceUri, returning original uri: %s", c(str));
                return str;
            }
            return str;
        }
    }

    private static aomj c(String str) {
        if (str.length() > 20) {
            return new aomj(aomi.SERVER_KNOWN_USER_DATA, str.substring(0, 20));
        }
        return new aomj(aomi.SERVER_KNOWN_USER_DATA, str);
    }
}
