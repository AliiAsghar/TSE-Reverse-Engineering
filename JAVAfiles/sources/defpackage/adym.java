package defpackage;

import j$.util.Objects;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adym extends adcx implements adye, adxx {
    private adyk a;
    private String b;

    public adym() {
        super(null, null);
    }

    @Override // defpackage.adxx
    public final void a(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "base");
        c(xmlSerializer);
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "base");
    }

    @Override // defpackage.adxx
    public final void b(XmlPullParser xmlPullParser) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] split;
        this.b = xmlPullParser.getAttributeValue("", "srsName");
        int nextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        while (true) {
            if (nextTag == 3) {
                z = true;
            } else {
                z = false;
            }
            if (!(z & name.equalsIgnoreCase("Polygon"))) {
                if ("http://www.opengis.net/gml".equals(namespace) && name.equalsIgnoreCase("exterior")) {
                    int nextTag2 = xmlPullParser.nextTag();
                    String name2 = xmlPullParser.getName();
                    xmlPullParser.getNamespace();
                    while (true) {
                        if (nextTag2 == 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!(z2 & name2.equalsIgnoreCase("exterior"))) {
                            adyk adykVar = new adyk();
                            this.a = adykVar;
                            int nextTag3 = xmlPullParser.nextTag();
                            String name3 = xmlPullParser.getName();
                            String namespace2 = xmlPullParser.getNamespace();
                            while (true) {
                                if (nextTag3 == 3) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!(z3 & name3.equalsIgnoreCase("LinearRing"))) {
                                    if ("http://www.opengis.net/gml".equals(namespace2)) {
                                        if (name3.equalsIgnoreCase("pos")) {
                                            adyn adynVar = new adyn();
                                            adynVar.cz(xmlPullParser);
                                            adykVar.cw().add(adynVar);
                                        }
                                        if (name3.equalsIgnoreCase("posList")) {
                                            adykVar.b = new adyo();
                                            adyo adyoVar = adykVar.b;
                                            String[] split2 = xmlPullParser.nextText().trim().split("\r\n|\n");
                                            for (int i = 0; i < split2.length; i++) {
                                                if (split2[i].length() != 0) {
                                                    if (split2[i].contains(",")) {
                                                        split = split2[i].split(",");
                                                    } else {
                                                        split = split2[i].split("\\s");
                                                    }
                                                    adyn adynVar2 = new adyn(Double.valueOf(split[0]), Double.valueOf(split[1]));
                                                    if (split.length == 3) {
                                                        adynVar2.a = Double.valueOf(split[2]);
                                                    }
                                                    adyoVar.cw().add(adynVar2);
                                                }
                                            }
                                        }
                                    }
                                    nextTag3 = xmlPullParser.nextTag();
                                    name3 = xmlPullParser.getName();
                                    namespace2 = xmlPullParser.getNamespace();
                                }
                            }
                            nextTag2 = xmlPullParser.nextTag();
                            name2 = xmlPullParser.getName();
                            xmlPullParser.getNamespace();
                        }
                    }
                }
                nextTag = xmlPullParser.nextTag();
                name = xmlPullParser.getName();
                namespace = xmlPullParser.getNamespace();
            } else {
                return;
            }
        }
    }

    @Override // defpackage.adye, defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("http://www.opengis.net/gml", "Polygon");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        if (this.a != null) {
            xmlSerializer.startTag("http://www.opengis.net/gml", "exterior");
            this.a.c(xmlSerializer);
            xmlSerializer.endTag("http://www.opengis.net/gml", "exterior");
        }
        xmlSerializer.endTag("http://www.opengis.net/gml", "Polygon");
    }

    @Override // defpackage.adxx
    public final boolean equals(Object obj) {
        adyo adyoVar;
        if (!(obj instanceof adym)) {
            return false;
        }
        adym adymVar = (adym) obj;
        adyk adykVar = this.a;
        adyk adykVar2 = adymVar.a;
        adyo adyoVar2 = adykVar.b;
        if (adyoVar2 == null || ((adyoVar = adykVar2.b) != null && adyoVar.equals(adyoVar2))) {
            if (adykVar.a != null && adykVar2.cw() != null) {
                if (adykVar.a.size() == adykVar2.a.size()) {
                    for (int i = 0; i < adykVar.a.size(); i++) {
                        if (!((adyn) adykVar.a.get(i)).equals(adykVar2.a.get(i))) {
                            break;
                        }
                    }
                }
            }
            List list = adykVar.a;
            if ((list == null || adykVar2.a != null) && (list != null || adykVar2.a == null)) {
                String str = this.b;
                if (str != null) {
                    if (!str.equals(adymVar.b)) {
                        return false;
                    }
                    return true;
                }
                if (adymVar.b != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
