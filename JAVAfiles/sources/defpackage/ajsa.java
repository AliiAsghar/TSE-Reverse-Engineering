package defpackage;

import android.util.Base64;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajsa implements ajsi {
    public static final ContentType a = ajru.d;

    public static final MessageReceipt c(ajrt ajrtVar) {
        boolean z;
        try {
            asmg asmgVar = new asmg((byte[]) null, (byte[]) null);
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(ajrtVar.a.m(), StandardCharsets.UTF_8.name());
            ajgk.u(newPullParser);
            while (ajgk.u(newPullParser) == 2) {
                String name = newPullParser.getName();
                if ("message-id".equals(name)) {
                    asmgVar.q(ajgk.w(newPullParser));
                } else if ("datetime".equals(name)) {
                    asmgVar.s(Instant.ofEpochMilli(advi.c(ajgk.w(newPullParser)).a));
                } else if ("delivery-notification".equals(name)) {
                    asmgVar.t(ajqu.DELIVERY);
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                    asmgVar.r(newPullParser.getName());
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                } else if ("display-notification".equals(name)) {
                    asmgVar.t(ajqu.DISPLAY);
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                    asmgVar.r(newPullParser.getName());
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                } else if ("interworking-notification".equals(name)) {
                    asmgVar.t(ajqu.INTERWORKING);
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                    asmgVar.r(newPullParser.getName());
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                } else if ("processing-notification".equals(name)) {
                    asmgVar.t(ajqu.PROCESSING);
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                    asmgVar.r(newPullParser.getName());
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                    ajgk.u(newPullParser);
                } else if ("google".equals(name)) {
                    ajgk.u(newPullParser);
                    byte[] decode = Base64.decode(ajgk.w(newPullParser), 2);
                    if (decode != null) {
                        asmgVar.p(aozb.w(decode));
                        ajgk.u(newPullParser);
                    } else {
                        throw new ajsh("Encounter a null encrypted data");
                    }
                } else {
                    advr.c("Skipping unknown elements with name=%s", name);
                    String namespace = newPullParser.getNamespace();
                    newPullParser.require(2, namespace, name);
                    int i = 1;
                    while (true) {
                        newPullParser.next();
                        int eventType = newPullParser.getEventType();
                        if (eventType != 2) {
                            if (eventType == 3) {
                                i--;
                                if (i >= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                d.t(z, "Encounter more END_TAG than START_TAG while parsing unknown elements");
                            }
                        } else {
                            i++;
                        }
                        if (newPullParser.getEventType() == 3 && newPullParser.getName().equals(name) && i == 0) {
                            break;
                        }
                    }
                    newPullParser.require(3, namespace, name);
                }
            }
            return asmgVar.m();
        } catch (IOException | IllegalArgumentException | IllegalStateException | XmlPullParserException e) {
            throw new ajsh("Error: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, acyz] */
    public static final ajrt d(MessageReceipt messageReceipt) {
        boolean z;
        boolean z2 = false;
        if (messageReceipt.a() != ajqu.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
            newSerializer.setPrefix("", "urn:ietf:params:xml:ns:imdn");
            newSerializer.setPrefix("cpm", "urn:oma:xml:cpm:imdn-extensions:1.0");
            if ((ajqu.DELIVERY.equals(messageReceipt.a()) || (((Boolean) aczh.a().a.a.a()).booleanValue() && ajqu.DISPLAY.equals(messageReceipt.a()))) && messageReceipt.c().isPresent()) {
                z2 = true;
            }
            if (z2) {
                newSerializer.setPrefix("enc", "urn:google:am-imdn-xml-encryption");
            }
            newSerializer.startDocument(StandardCharsets.UTF_8.name(), null);
            newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "imdn");
            ajgk.y(newSerializer, "urn:ietf:params:xml:ns:imdn", "message-id", messageReceipt.d());
            ajgk.y(newSerializer, "urn:ietf:params:xml:ns:imdn", "datetime", messageReceipt.b().toString());
            int ordinal = messageReceipt.a().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "interworking-notification");
                            newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                            newSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", messageReceipt.e());
                            newSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", messageReceipt.e());
                            newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                            newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "interworking-notification");
                        } else {
                            throw new IllegalArgumentException("Receipt type: " + messageReceipt.a().toString() + " not supported.");
                        }
                    } else {
                        newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
                        newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                        newSerializer.startTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                        newSerializer.endTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                        newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                        newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
                    }
                } else {
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                    if (z2) {
                        newSerializer.startTag("urn:google:am-imdn-xml-encryption", "google");
                        newSerializer.startTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                        newSerializer.text(Base64.encodeToString(((aozb) messageReceipt.c().get()).H(), 2));
                        newSerializer.endTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                        newSerializer.endTag("urn:google:am-imdn-xml-encryption", "google");
                    }
                }
            } else {
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                newSerializer.startTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", messageReceipt.e());
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                if (z2) {
                    newSerializer.startTag("urn:google:am-imdn-xml-encryption", "google");
                    newSerializer.startTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                    newSerializer.text(Base64.encodeToString(((aozb) messageReceipt.c().get()).H(), 2));
                    newSerializer.endTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                    newSerializer.endTag("urn:google:am-imdn-xml-encryption", "google");
                }
            }
            newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "imdn");
            newSerializer.endDocument();
            newSerializer.flush();
            ajur ajurVar = new ajur(null);
            ajurVar.f(aozb.w(byteArrayOutputStream.toByteArray()));
            ajurVar.g(a);
            return ajurVar.e();
        } catch (IOException | XmlPullParserException e) {
            throw new ajsh("Error: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // defpackage.ajsi
    public final /* bridge */ /* synthetic */ ajqz a(ajrt ajrtVar) {
        return c(ajrtVar);
    }

    @Override // defpackage.ajsi
    public final /* bridge */ /* synthetic */ ajrt b(ajqz ajqzVar) {
        return d((MessageReceipt) ajqzVar);
    }
}
