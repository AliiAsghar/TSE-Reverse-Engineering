package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.OptionalLong;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adta {
    public final Object a;

    public adta(Object obj) {
        this.a = obj;
    }

    public static void b(adsz adszVar, OutputStream outputStream) {
        try {
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(outputStream, "utf-8");
            newSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:geolocation");
            newSerializer.setPrefix("rpid", "urn:ietf:params:xml:ns:pidf:rpid");
            newSerializer.setPrefix("gml", "http://www.opengis.net/gml");
            newSerializer.setPrefix("gp", "urn:ietf:params:xml:ns:pidf:geopriv10");
            newSerializer.setPrefix("gs", "http://www.opengis.net/pidflo/1.0");
            newSerializer.startDocument("utf-8", null);
            adszVar.c(newSerializer);
            newSerializer.flush();
        } catch (XmlPullParserException e) {
            throw new IOException("XmlPullParserException during write(): ".concat(String.valueOf(e.getMessage())));
        }
    }

    public static ImsCapabilities f(ImsCapabilities imsCapabilities) {
        ImsCapabilities imsCapabilities2 = new ImsCapabilities(imsCapabilities);
        long currentTimeMillis = System.currentTimeMillis() + adpo.a;
        long j = imsCapabilities2.e;
        if (j <= 0) {
            imsCapabilities2.e = 1L;
        }
        imsCapabilities2.f = currentTimeMillis - j;
        return imsCapabilities2;
    }

    public static String g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("#=0.92");
        arrayList.add("#=1");
        if (acyu.d()) {
            arrayList.add("#=1.2");
        }
        return adpo.a(arrayList);
    }

    public static void h(aiom aiomVar, adpo adpoVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (adpoVar.y() && !z) {
            arrayList.add("+g.oma.sip-im");
        }
        if (adpoVar.v()) {
            arrayList.add("+g.3gpp.iari-ref=\"" + adpoVar.b() + "\"");
        }
        if (adpoVar.w(z)) {
            arrayList.add("+g.3gpp.icsi-ref=\"" + adpoVar.c(z) + "\"");
        }
        if (adpoVar.F()) {
            arrayList.add("video");
            arrayList.add("+g.gsma.rcs.ipcall");
            if (adpoVar.I()) {
                arrayList.add("+g.gsma.rcs.ipvideocallonly");
            }
        } else if (adpoVar.G()) {
            arrayList.add("+g.gsma.rcs.ipcall");
        }
        if (adpoVar.u()) {
            arrayList.add("+g.jibe.stickers");
        }
        if (aczn.d() && adpoVar.K()) {
            arrayList.add(g());
        }
        try {
            aiomVar.q(ahmc.X("Accept-Contact", a.bW(TextUtils.join(";", arrayList), "*;", ";explicit")));
        } catch (ailb e) {
            throw new IllegalArgumentException("Accept-Contact can't be set: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public static void i(ailx ailxVar, adpo adpoVar, boolean z) {
        if (ailxVar != null) {
            if (adpoVar.y() && !z) {
                ailxVar.j(new aikz("+g.oma.sip-im", null));
            }
            if (adpoVar.v()) {
                aikz aikzVar = new aikz("+g.3gpp.iari-ref", adpoVar.b());
                aikzVar.b();
                ailxVar.j(aikzVar);
            }
            if (adpoVar.w(z)) {
                aikz aikzVar2 = new aikz("+g.3gpp.icsi-ref", adpoVar.c(z));
                aikzVar2.b();
                ailxVar.j(aikzVar2);
            }
            if (adpoVar.u()) {
                ailxVar.j(new aikz("+g.jibe.stickers", null));
            }
            if (adpoVar.F()) {
                ailxVar.j(new aikz("+g.gsma.rcs.ipcall", null));
                if (adpoVar.I()) {
                    ailxVar.j(new aikz("+g.gsma.rcs.ipvideocallonly", null));
                }
                ailxVar.j(new aikz("video", null));
            } else if (adpoVar.G()) {
                ailxVar.j(new aikz("+g.gsma.rcs.ipcall", null));
            }
            if (aczn.d()) {
                ailxVar.j(new aikz(g(), null));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    public final adsz a(InputStream inputStream) {
        boolean z;
        try {
            Document c = adxb.c();
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(inputStream, "utf-8");
            boolean z2 = true;
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.nextTag();
            adsz adszVar = (adsz) this.a.b();
            adszVar.b = newPullParser.getAttributeValue("", "entity");
            int nextTag = newPullParser.nextTag();
            String namespace = newPullParser.getNamespace();
            String name = newPullParser.getName();
            while (true) {
                if (nextTag == 3) {
                    z = z2;
                } else {
                    z = false;
                }
                if (!(z & name.equals("rcsenvelope"))) {
                    if (!"urn:ietf:params:xml:ns:pidf".equals(namespace) && !"urn:gsma:params:xml:ns:rcs:rcs:geolocation".equals(namespace)) {
                        adszVar.b().add(((aday) adszVar.c.b()).I(c, new QName(namespace, name), newPullParser));
                        nextTag = newPullParser.nextTag();
                        namespace = newPullParser.getNamespace();
                        name = newPullParser.getName();
                        z2 = true;
                    }
                    if (name.equals("rcspushlocation")) {
                        adszVar.a = (adtb) adszVar.d.b();
                        adtb adtbVar = adszVar.a;
                        adtbVar.a = (String) Optional.ofNullable(newPullParser.getAttributeValue("", "id")).orElse("");
                        adtbVar.b = newPullParser.getAttributeValue("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                        int nextTag2 = newPullParser.nextTag();
                        String namespace2 = newPullParser.getNamespace();
                        String name2 = newPullParser.getName();
                        while (true) {
                            if (nextTag2 == 3 && name2.equals("rcspushlocation")) {
                                break;
                            }
                            if ("urn:ietf:params:xml:ns:pidf:rpid".equals(namespace2)) {
                                if (name2.equals("place-type")) {
                                    adyq adyqVar = (adyq) adtbVar.h.b();
                                    adyqVar.e(c, newPullParser);
                                    if (agkx.ae(adtbVar.b)) {
                                        adtbVar.b = adyqVar.a();
                                    }
                                } else if (name2.equals("time-offset")) {
                                    adtbVar.e = new adyt();
                                    adyt adytVar = adtbVar.e;
                                    adytVar.a = newPullParser.getAttributeValue("", "id");
                                    String attributeValue = newPullParser.getAttributeValue("urn:ietf:params:xml:ns:pidf:rpid", "until");
                                    if (Objects.isNull(attributeValue)) {
                                        advr.g("Invalid until value", new Object[0]);
                                    } else {
                                        adytVar.b = adxb.b(attributeValue);
                                    }
                                    try {
                                        adytVar.c = Long.parseLong(newPullParser.nextText());
                                    } catch (NumberFormatException e) {
                                        advr.i(e, "Invalid timeOffset value", new Object[0]);
                                    }
                                }
                            } else if ("urn:ietf:params:xml:ns:pidf:geopriv10".equals(namespace2)) {
                                if (name2.equals("geopriv")) {
                                    adtbVar.d = (adyb) adtbVar.i.b();
                                    adtbVar.d.b(c, newPullParser);
                                }
                            } else if ("urn:gsma:params:xml:ns:rcs:rcs:geolocation".equals(namespace2)) {
                                if (name2.equals("timestamp")) {
                                    adtbVar.c = adxb.b(newPullParser.nextText()).getTime();
                                }
                            } else {
                                if (adtbVar.f == null) {
                                    adtbVar.f = new ArrayList();
                                }
                                adtbVar.f.add(((aday) adtbVar.g.b()).I(c, new QName(namespace2, name2), newPullParser));
                            }
                            nextTag2 = newPullParser.nextTag();
                            namespace2 = newPullParser.getNamespace();
                            name2 = newPullParser.getName();
                        }
                    }
                    nextTag = newPullParser.nextTag();
                    namespace = newPullParser.getNamespace();
                    name = newPullParser.getName();
                    z2 = true;
                } else {
                    return adszVar;
                }
            }
        } catch (ParserConfigurationException e2) {
            throw new IOException("ParserConfigurationException during read(): ".concat(String.valueOf(e2.getMessage())));
        } catch (XmlPullParserException e3) {
            throw new IOException("XmlPullParserException during read(): ".concat(String.valueOf(e3.getMessage())));
        }
    }

    public final adpo c(String str, boolean z) {
        adpo b = ((adpu) this.a).b();
        if (str != null) {
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im")) {
                b.e(true);
                if (adaa.u() && z) {
                    b.q(str.contains(adsg.a()));
                } else {
                    b.q(true);
                }
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft")) {
                b.n(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb")) {
                b.f(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush")) {
                b.k(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopullft")) {
                b.j(true);
            }
            if (str.contains("+g.gsma.rcs.ipvideocallonly")) {
                b.o(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel") || str.contains("+g.gsma.rcs.ipcall")) {
                b.m(true);
            }
            if ((str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel") || str.contains("+g.gsma.rcs.ipcall")) && str.contains("video")) {
                b.Q();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg")) {
                b.h(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp")) {
                b.i(true);
            }
            if (str.contains("+g.jibe.stickers")) {
                b.s(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer")) {
                b.P();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered")) {
                b.R();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap")) {
                b.S();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch")) {
                b.T();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms")) {
                b.g(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms")) {
                b.l(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot")) {
                b.p(true);
                if (str.contains(adpo.d())) {
                    b.r(true);
                }
            }
        }
        return b;
    }

    public final adpo d(aiom aiomVar, boolean z) {
        OptionalLong empty;
        if (aiomVar != null) {
            adpo c = c(aiomVar.j("Contact"), z);
            String j = aiomVar.j("P-Last-Online");
            if (TextUtils.isEmpty(j)) {
                empty = OptionalLong.empty();
            } else {
                try {
                    empty = OptionalLong.of(Long.parseLong(j) * 1000);
                } catch (Exception unused) {
                    advr.q("Unable to parse last activity timestamp: %s", j);
                    empty = OptionalLong.empty();
                }
            }
            if (empty.isPresent()) {
                c.e = empty.getAsLong();
            }
            return c;
        }
        throw new IllegalArgumentException("SIP message must not be null");
    }

    public final adpo e(adxr adxrVar, long j) {
        adxo adxoVar;
        alog n;
        adpo adpoVar = new adpo(j);
        for (adxu adxuVar : adxrVar.b()) {
            adxt adxtVar = adxuVar.b;
            if (adxtVar != null && (adxoVar = adxtVar.a) != null && !adxoVar.equals(adxo.CLOSED)) {
                adxn adxnVar = adxuVar.c;
                if (((adxn) ((adaz) this.a).m).equals(adxnVar)) {
                    adpoVar.e(true);
                    adpoVar.q(true);
                }
                if (((adxn) ((adaz) this.a).d).equals(adxnVar)) {
                    adpoVar.i(true);
                }
                if (((adxn) ((adaz) this.a).c).equals(adxnVar)) {
                    adpoVar.n(true);
                }
                if (((adxn) ((adaz) this.a).i).equals(adxnVar)) {
                    adpoVar.f(true);
                }
                if (((adxn) ((adaz) this.a).l).equals(adxnVar)) {
                    adpoVar.g(true);
                }
                if (((adxn) ((adaz) this.a).e).equals(adxnVar)) {
                    adpoVar.k(true);
                }
                if (((adxn) ((adaz) this.a).j).equals(adxnVar)) {
                    adpoVar.l(true);
                }
                if (((adxn) ((adaz) this.a).a).equals(adxnVar)) {
                    adpoVar.P();
                }
                if (((adxn) ((adaz) this.a).g).equals(adxnVar)) {
                    adpoVar.R();
                }
                if (((adxn) ((adaz) this.a).b).equals(adxnVar)) {
                    adpoVar.T();
                }
                if (((adxn) ((adaz) this.a).n).equals(adxnVar)) {
                    adpoVar.S();
                }
                if (((adxn) ((adaz) this.a).h).equals(adxnVar)) {
                    adpoVar.p(true);
                }
                if (((adxn) ((adaz) this.a).f).equals(adxnVar)) {
                    adpoVar.m(true);
                    List list = adxuVar.g;
                    if (list == null) {
                        int i = alog.d;
                        n = alsx.a;
                    } else {
                        n = alog.n(list);
                    }
                    if (n.contains(adxi.VIDEO)) {
                        adpoVar.Q();
                    }
                }
            }
        }
        if (!adpoVar.C()) {
            adpoVar.q(false);
        }
        adpoVar.c = true;
        adpoVar.d = true;
        adpoVar.e = agkx.W().longValue();
        return adpoVar;
    }

    public adta(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adta(armf armfVar, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adta(armf armfVar, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adta(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
