package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyn extends adcx {
    public Double a;
    private String b;
    private String c;

    public adyn() {
        super(null, null);
    }

    public final Double cw() {
        String str = this.c;
        if (str != null) {
            return Double.valueOf(str);
        }
        return null;
    }

    public final Double cx() {
        String str = this.b;
        if (str != null) {
            return Double.valueOf(str);
        }
        return null;
    }

    public final void cy(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/gml", "pos");
        String str = this.c;
        String str2 = "";
        if (str != null) {
            str2 = "".concat(str);
        }
        String str3 = this.b;
        if (str3 != null) {
            str2 = a.co(str3, str2, " ");
        }
        Double d = this.a;
        if (d != null) {
            str2 = str2 + " " + d;
        }
        xmlSerializer.text(str2);
        xmlSerializer.endTag("http://www.opengis.net/gml", "pos");
    }

    public final void cz(XmlPullParser xmlPullParser) {
        String[] split;
        String nextText = xmlPullParser.nextText();
        if (nextText.contains(",")) {
            split = nextText.split(",");
        } else {
            split = nextText.split("\\s");
        }
        int length = split.length;
        if (length >= 2) {
            this.c = split[0];
            this.b = split[1];
            if (length == 3) {
                this.a = Double.valueOf(split[2]);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adyn)) {
            return false;
        }
        adyn adynVar = (adyn) obj;
        Double cx = cx();
        Double cw = cw();
        Double cw2 = adynVar.cw();
        Double cx2 = adynVar.cx();
        Double d = adynVar.a;
        if (cw == null && adynVar.cw() != null) {
            return false;
        }
        if (cw != null && (Objects.isNull(cw2) || !anbe.b(cw.doubleValue(), cw2.doubleValue(), 1.0E-5d))) {
            return false;
        }
        if (cx == null && adynVar.cx() != null) {
            return false;
        }
        if (cx != null && (Objects.isNull(cx2) || !anbe.b(cx.doubleValue(), cx2.doubleValue(), 1.0E-5d))) {
            return false;
        }
        Double d2 = this.a;
        if (d2 == null && d == null) {
            return true;
        }
        if (d2 == null || d == null || !anbe.b(d2.doubleValue(), d.doubleValue(), 1.0E-5d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a});
    }

    public adyn(Double d, Double d2) {
        super(null, null);
        this.b = d2.toString();
        this.c = d.toString();
    }
}
