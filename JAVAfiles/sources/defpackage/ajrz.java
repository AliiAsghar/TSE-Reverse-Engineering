package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import j$.time.Instant;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajrz implements ajsi {
    public static final ContentType a = ajru.c;

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0154, code lost:
    
        throw new defpackage.ajrw("Incomplete XML for:" + com.google.android.rcs.client.messaging.data.LocationInformation.class.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02be, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01af, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.rcs.client.messaging.data.LocationInformation c(java.io.InputStream r22) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajrz.c(java.io.InputStream):com.google.android.rcs.client.messaging.data.LocationInformation");
    }

    private static String d(LocationInformation locationInformation) {
        return locationInformation.a() + " " + locationInformation.b();
    }

    private static String e(LocationInformation locationInformation) {
        StringWriter stringWriter;
        XmlSerializer newSerializer;
        try {
            StringWriter stringWriter2 = new StringWriter();
            try {
                newSerializer = XmlPullParserFactory.newInstance().newSerializer();
                newSerializer.setOutput(stringWriter2);
                newSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:geolocation");
                stringWriter = stringWriter2;
            } catch (Throwable th) {
                th = th;
                stringWriter = stringWriter2;
            }
            try {
                newSerializer.setPrefix("rpid", "urn:ietf:params:xml:ns:pidf:rpid");
                newSerializer.setPrefix("gml", "http://www.opengis.net/gml");
                newSerializer.setPrefix("gp", "urn:ietf:params:xml:ns:pidf:geopriv10");
                newSerializer.setPrefix("gs", "http://www.opengis.net/pidflo/1.0");
                newSerializer.startDocument("UTF-8", true);
                newSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
                if (locationInformation.c().isPresent()) {
                    newSerializer.attribute("", "entity", (String) locationInformation.c().get());
                }
                newSerializer.startTag("", "rcspushlocation");
                newSerializer.attribute("", "id", locationInformation.i());
                if (locationInformation.e().isPresent()) {
                    newSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, (String) locationInformation.e().get());
                }
                newSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
                newSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
                if (locationInformation.g().isPresent()) {
                    newSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Circle");
                    newSerializer.attribute("", "srsName", "urn:ogc:def:crs:EPSG::4326");
                    ajgk.y(newSerializer, "http://www.opengis.net/gml", "pos", d(locationInformation));
                    newSerializer.startTag("http://www.opengis.net/pidflo/1.0", "radius");
                    newSerializer.attribute("", "uom", "urn:ogc:def:uom:EPSG::9001");
                    newSerializer.text(locationInformation.g().get().toString());
                    newSerializer.endTag("http://www.opengis.net/pidflo/1.0", "radius");
                    newSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Circle");
                } else {
                    newSerializer.startTag("http://www.opengis.net/gml", "Point");
                    newSerializer.attribute("", "srsName", "urn:ogc:def:crs:EPSG::4326");
                    ajgk.y(newSerializer, "http://www.opengis.net/gml", "pos", d(locationInformation));
                    newSerializer.endTag("http://www.opengis.net/gml", "Point");
                }
                newSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
                newSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "usage-rules");
                if (locationInformation.d().isPresent()) {
                    ajgk.y(newSerializer, "urn:ietf:params:xml:ns:pidf:geopriv10", "retention-expiry", ((Instant) locationInformation.d().get()).toString());
                }
                newSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "usage-rules");
                newSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
                if (locationInformation.h().isPresent()) {
                    ajgk.y(newSerializer, "", "timestamp", ((Instant) locationInformation.h().get()).toString());
                }
                newSerializer.endTag("", "rcspushlocation");
                newSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
                newSerializer.endDocument();
                String stringWriter3 = stringWriter.toString();
                stringWriter.close();
                return stringWriter3;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    stringWriter.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException | XmlPullParserException e) {
            throw new ajsh("Error serializing LocationInformation", e);
        }
    }

    private static void f(ajqm ajqmVar, String str) {
        String[] split;
        try {
            if (str.contains(",")) {
                split = str.split(",");
            } else {
                split = str.split("\\s");
            }
            if (split.length >= 2) {
                ajqmVar.f(Double.parseDouble(split[0]));
                ajqmVar.g(Double.parseDouble(split[1]));
            }
        } catch (NumberFormatException e) {
            throw new ajrx("pos", e);
        }
    }

    @Override // defpackage.ajsi
    public final /* synthetic */ ajqz a(ajrt ajrtVar) {
        ContentType contentType = a;
        if (contentType.e(ajrtVar.b)) {
            try {
                InputStream m = ajrtVar.a.m();
                try {
                    LocationInformation c = c(m);
                    m.close();
                    return c;
                } finally {
                }
            } catch (IOException e) {
                throw new ajsh("Error deserializing LocationInformation", e);
            }
        }
        throw new ajsk(ajrtVar.b, "Supported type for this serializer is: ".concat(String.valueOf(String.valueOf(contentType))));
    }

    @Override // defpackage.ajsi
    public final /* synthetic */ ajrt b(ajqz ajqzVar) {
        String e = e((LocationInformation) ajqzVar);
        ajur ajurVar = new ajur(null);
        ajurVar.g(a);
        ajurVar.f(aozb.z(e));
        return ajurVar.e();
    }
}
