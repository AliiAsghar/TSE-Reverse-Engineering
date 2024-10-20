package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsg {
    public static final acyz a = aczd.a(189147358);
    public static final String b = c("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session");
    public static final String c = c("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg");
    public static final String d = c("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg");
    public static final String e = b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
    public static final String f = b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
    public static final String g = c("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.filetransfer");
    public static final String h = b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");

    public static String a() {
        if (true != ((Boolean) a.a()).booleanValue()) {
            return "urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session.group";
        }
        return "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session.group";
    }

    private static String b(String str) {
        return d("+g.3gpp.iari-ref", str);
    }

    private static String c(String str) {
        return d("+g.3gpp.icsi-ref", str);
    }

    private static String d(String str, String str2) {
        return String.format(Locale.US, "%s=\"%s\"", str, str2);
    }
}
