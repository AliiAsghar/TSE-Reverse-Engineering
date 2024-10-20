package defpackage;

import com.android.vcard.VCardBuilder;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adzb implements adxa {
    private ArrayList a;
    private ArrayList b;

    public static adzb a(Reader reader) {
        boolean z;
        adzb adzbVar = new adzb();
        try {
            Document c = adxb.c();
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(reader);
            int nextTag = newPullParser.nextTag();
            String namespace = newPullParser.getNamespace();
            String name = newPullParser.getName();
            while (true) {
                if (nextTag == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(z & name.equals("resource-lists"))) {
                    if ("urn:ietf:params:xml:ns:resource-lists".equals(namespace)) {
                        if (name.equals("list")) {
                            adza adzaVar = new adza();
                            adzaVar.a(c, newPullParser);
                            adzbVar.b().add(adzaVar);
                        }
                    } else {
                        Element d = adxb.d(c, newPullParser);
                        if (adzbVar.b == null) {
                            adzbVar.b = new ArrayList(1);
                        }
                        adzbVar.b.add(d);
                    }
                    nextTag = newPullParser.nextTag();
                    namespace = newPullParser.getNamespace();
                    name = newPullParser.getName();
                } else {
                    return adzbVar;
                }
            }
        } catch (ParserConfigurationException e) {
            throw new IOException(e.getMessage());
        } catch (XmlPullParserException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static void d(adzb adzbVar, OutputStream outputStream) {
        try {
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(outputStream, "utf-8");
            newSerializer.setPrefix("", "urn:ietf:params:xml:ns:resource-lists");
            newSerializer.setPrefix("cc", "urn:ietf:params:xml:ns:copycontrol");
            newSerializer.startDocument("utf-8", false);
            newSerializer.flush();
            outputStream.write(VCardBuilder.VCARD_END_OF_LINE.getBytes());
            outputStream.flush();
            adzbVar.c(newSerializer);
            newSerializer.endDocument();
            newSerializer.flush();
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static byte[] e(adzb adzbVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(BasePaymentResult.ERROR_REQUEST_FAILED);
        d(adzbVar, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final List b() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    @Override // defpackage.adxa
    public final void c(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "resource-lists");
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                adza adzaVar = (adza) arrayList.get(i);
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "list");
                adzaVar.b(xmlSerializer);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "list");
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "resource-lists");
    }
}
