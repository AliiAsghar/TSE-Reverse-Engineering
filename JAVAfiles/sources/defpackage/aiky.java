package defpackage;

import com.android.vcard.VCardConstants;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiky extends aile {
    protected static final Hashtable a = new Hashtable();
    protected static final Object b = new Object();
    protected static final Hashtable c = new Hashtable();
    protected Hashtable d;
    public ailg e;

    public aiky(String str, String str2) {
        n(str);
        this.f = str2;
        n(str);
    }

    public static String b(char c2) {
        return Character.valueOf(c2).toString();
    }

    public static final boolean j(char c2) {
        if (v(c2) || c2 == '!' || c2 == '%' || c2 == '\'' || c2 == '~' || c2 == '*' || c2 == '+' || c2 == '-' || c2 == '.' || c2 == '_' || c2 == '`') {
            return true;
        }
        return false;
    }

    public static String l(String str) {
        try {
            int indexOf = str.indexOf(":");
            if (indexOf <= 0) {
                return null;
            }
            return str.substring(0, indexOf);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static String m(String str) {
        try {
            return str.substring(str.indexOf(":") + 1);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0066. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0069. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x006c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0099. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x009c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x009f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ailg a(int r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiky.a(int):ailg");
    }

    public final String c() {
        if (this.g >= this.f.length()) {
            return null;
        }
        return this.f.substring(this.g);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        try {
            if (Character.isDigit(q(0))) {
                sb.append(q(0));
                s(1);
                while (true) {
                    char q = q(0);
                    if (Character.isDigit(q)) {
                        sb.append(q);
                        s(1);
                    } else {
                        return sb.toString();
                    }
                }
            } else {
                throw new ailb(this.f + ": Unexpected token at " + q(0));
            }
        } catch (ailb unused) {
            return sb.toString();
        }
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        if (q(0) != '\"') {
            return null;
        }
        s(1);
        while (true) {
            char p = p();
            if (p == '\"') {
                return sb.toString();
            }
            if (p == '\\') {
                sb.append('\\');
                sb.append(p());
            } else {
                sb.append(p);
            }
        }
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        while (t()) {
            try {
                char q = q(0);
                if (!j(q)) {
                    break;
                }
                s(1);
                sb.append(q);
            } catch (ailb unused) {
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public final Vector g(int i) {
        int i2 = this.g;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i; i3++) {
            ailg ailgVar = new ailg();
            if (k()) {
                String f = f();
                ailgVar.a = f;
                Integer num = (Integer) this.d.get(f.toUpperCase(Locale.US));
                if (num != null && this.d.containsKey(f.toUpperCase(Locale.US))) {
                    ailgVar.b = num.intValue();
                } else {
                    ailgVar.b = 4095;
                }
            } else {
                char p = p();
                StringBuilder sb = new StringBuilder();
                sb.append(p);
                ailgVar.a = sb.toString();
                if (u(p)) {
                    ailgVar.b = 4099;
                } else {
                    if (Character.isDigit(p)) {
                        p = 4098;
                    }
                    ailgVar.b = p;
                }
            }
            vector.addElement(ailgVar);
        }
        this.h = this.g;
        this.g = i2;
        return vector;
    }

    public final void h() {
        while (true) {
            try {
                if (q(0) != ' ' && q(0) != '\t') {
                    return;
                }
                s(1);
            } catch (ailb unused) {
                return;
            }
        }
    }

    protected final void i(String str, int i) {
        Integer valueOf = Integer.valueOf(i);
        this.d.put(str, valueOf);
        Hashtable hashtable = a;
        if (!hashtable.containsKey(valueOf)) {
            hashtable.put(valueOf, str);
        }
    }

    public final boolean k() {
        try {
            return j(q(0));
        } catch (ailb unused) {
            return false;
        }
    }

    public final void n(String str) {
        Object obj = b;
        synchronized (obj) {
            Hashtable hashtable = c;
            Hashtable hashtable2 = (Hashtable) hashtable.get(str);
            if (hashtable2 != null) {
                this.d = hashtable2;
            } else {
                synchronized (obj) {
                    Hashtable hashtable3 = (Hashtable) hashtable.get(str);
                    if (hashtable3 == null) {
                        Hashtable hashtable4 = new Hashtable();
                        this.d = hashtable4;
                        hashtable.put(str, hashtable4);
                    } else {
                        this.d = hashtable3;
                    }
                    if (str.equals("method_keywordLexer")) {
                        i("REGISTER".toUpperCase(Locale.US), 2052);
                        i("ACK".toUpperCase(Locale.US), 2054);
                        i("OPTIONS".toUpperCase(Locale.US), 2056);
                        i("BYE".toUpperCase(Locale.US), 2055);
                        i("INVITE".toUpperCase(Locale.US), 2053);
                        i("SIP".toUpperCase(Locale.US), 2051);
                        i("SUBSCRIBE".toUpperCase(Locale.US), 2101);
                        i("NOTIFY".toUpperCase(Locale.US), 2102);
                    } else if (str.equals("command_keywordLexer")) {
                        i("From".toUpperCase(Locale.US), 2062);
                        i("To".toUpperCase(Locale.US), 2063);
                        i("Via".toUpperCase(Locale.US), 2064);
                        i("Route".toUpperCase(Locale.US), 2070);
                        i("Max-Forwards".toUpperCase(Locale.US), 2079);
                        i("Authorization".toUpperCase(Locale.US), 2071);
                        i("Proxy-Authorization".toUpperCase(Locale.US), 2072);
                        i("Date".toUpperCase(Locale.US), 2080);
                        i("Content-Length".toUpperCase(Locale.US), 2084);
                        i(assi.a.toUpperCase(Locale.US), 2086);
                        i("Contact".toUpperCase(Locale.US), 2087);
                        i("Call-Id".toUpperCase(Locale.US), 2088);
                        i("Expires".toUpperCase(Locale.US), 2090);
                        i("Record-Route".toUpperCase(Locale.US), 2092);
                        i("CSeq".toUpperCase(Locale.US), 2094);
                        i("X-Pidgey-Conference-Params".toUpperCase(Locale.US), 2116);
                        i("X-Pidgey-Selected-Experiments".toUpperCase(Locale.US), 2118);
                        i("WWW-Authenticate".toUpperCase(Locale.US), 2096);
                        i("Proxy-Authenticate".toUpperCase(Locale.US), 2082);
                        i("Event".toUpperCase(Locale.US), 2111);
                        i("C".toUpperCase(Locale.US), 2086);
                        i("F".toUpperCase(Locale.US), 2062);
                        i("I".toUpperCase(Locale.US), 2088);
                        i("M".toUpperCase(Locale.US), 2087);
                        i("L".toUpperCase(Locale.US), 2084);
                        i("T".toUpperCase(Locale.US), 2063);
                        i("V".toUpperCase(Locale.US), 2064);
                        i("O".toUpperCase(Locale.US), 2111);
                        i("Session-Expires".toUpperCase(Locale.US), 2115);
                    } else if (str.equals("status_lineLexer")) {
                        i("SIP".toUpperCase(Locale.US), 2051);
                    } else if (str.equals("request_lineLexer")) {
                        i("SIP".toUpperCase(Locale.US), 2051);
                    } else if (str.equals("sip_urlLexer")) {
                        i(VCardConstants.PROPERTY_TEL.toUpperCase(Locale.US), 2105);
                        i("SIP".toUpperCase(Locale.US), 2051);
                    }
                    Hashtable hashtable5 = (Hashtable) hashtable.get(str);
                    hashtable5.getClass();
                    this.d = hashtable5;
                }
            }
        }
    }

    public final String o() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            try {
                sb.append(q(i));
            } catch (ailb unused) {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
