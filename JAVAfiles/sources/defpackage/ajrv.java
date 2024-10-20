package defpackage;

import android.util.Base64;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import j$.time.DateTimeException;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajrv implements ajsi {
    public static final ContentType a = ajru.b;

    public static final FileTransferInformation c(ajrt ajrtVar) {
        ContentType contentType = a;
        if (contentType.e(ajrtVar.b)) {
            return f(ajrtVar);
        }
        throw new ajsk(ajrtVar.b, "Supported type for this serializer is: ".concat(String.valueOf(String.valueOf(contentType))));
    }

    public static final ajrt d(FileTransferInformation fileTransferInformation) {
        String g = g(fileTransferInformation);
        ajur ajurVar = new ajur(null);
        ajurVar.g(a);
        ajurVar.f(aozb.z(g));
        return ajurVar.e();
    }

    private static FileInformation e(XmlPullParser xmlPullParser, ajqd ajqdVar) {
        int t = ajgk.t(xmlPullParser);
        String name = xmlPullParser.getName();
        String str = null;
        ajqc ajqcVar = new ajqc((byte[]) null);
        ajqcVar.e(ajqdVar);
        String str2 = null;
        while (true) {
            if (t == 3) {
                if (!"file-info".equals(name)) {
                    t = 3;
                } else {
                    return ajqcVar.a();
                }
            }
            if (t != 1) {
                if (t == 2) {
                    if ("file-size".equals(name)) {
                        ajqcVar.g(Integer.parseInt(ajgk.w(xmlPullParser)));
                    }
                    if (str != null) {
                        ajgk.z("url", str);
                        ajqcVar.h(str);
                    }
                    if ("content-type".equals(name)) {
                        String w = ajgk.w(xmlPullParser);
                        ajgk.z("content-type", w);
                        try {
                            ajqcVar.d(ContentType.d(w));
                        } catch (IllegalArgumentException e) {
                            throw new ajsh("Invalid content type for FileTransferInformation", e);
                        }
                    }
                    if ("file-name".equals(name)) {
                        ajqcVar.f(ajgk.w(xmlPullParser));
                    }
                    if (str2 != null) {
                        ajgk.z("until", str2);
                        ajqcVar.i(ajgk.v("until", str2));
                    }
                }
                t = ajgk.t(xmlPullParser);
                name = xmlPullParser.getName();
                str = xmlPullParser.getAttributeValue("", "url");
                str2 = xmlPullParser.getAttributeValue("", "until");
            } else {
                throw new ajrw("Incomplete XML for:".concat(String.valueOf(FileInformation.class.getName())));
            }
        }
    }

    private static FileTransferInformation f(ajrt ajrtVar) {
        try {
            InputStream m = ajrtVar.a.m();
            try {
                XmlPullParser x = ajgk.x();
                x.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                x.setInput(m, "UTF-8");
                int t = ajgk.t(x);
                String name = x.getName();
                if ("file".equals(name)) {
                    arbj arbjVar = new arbj((byte[]) null, (char[]) null, (char[]) null);
                    while (true) {
                        if (t == 3) {
                            if (!"file".equals(name)) {
                                t = 3;
                            } else {
                                FileTransferInformation C = arbjVar.C();
                                m.close();
                                return C;
                            }
                        }
                        if (t != 1) {
                            if (t == 2) {
                                if ("file-info".equals(name)) {
                                    String attributeValue = x.getAttributeValue("", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                                    if ("thumbnail".equals(attributeValue)) {
                                        arbjVar.F(e(x, ajqd.THUMBNAIL));
                                    } else if ("file".equals(attributeValue)) {
                                        arbjVar.E(e(x, ajqd.FILE));
                                    }
                                } else if ("encrypted-data".equals(name)) {
                                    String w = ajgk.w(x);
                                    ajgk.z("encrypted-data", w);
                                    arbjVar.D(aozb.w(Base64.decode(w, 0)));
                                }
                            }
                            t = ajgk.t(x);
                            name = x.getName();
                        } else {
                            throw new ajrw("Incomplete XML for:" + FileTransferInformation.class.getName());
                        }
                    }
                } else {
                    throw new ajrw("Invalid start tag for XML:" + FileTransferInformation.class.getName());
                }
            } catch (Throwable th) {
                try {
                    m.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (DateTimeException | IOException | IllegalStateException | NumberFormatException | XmlPullParserException e) {
            throw new ajsh("Error deserializing FileTransferInformation", e);
        }
    }

    private static String g(FileTransferInformation fileTransferInformation) {
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
                newSerializer.setOutput(stringWriter);
                newSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:fthttp");
                boolean isPresent = fileTransferInformation.b().isPresent();
                if (isPresent) {
                    newSerializer.setPrefix("enc", "urn:google:am-ftpush-xml-encryption");
                }
                if (fileTransferInformation.a().e().isPresent()) {
                    newSerializer.setPrefix("am", "urn:gsma:params:xml:ns:rcs:rcs:rram");
                }
                newSerializer.startDocument("UTF-8", true);
                newSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
                Optional c = fileTransferInformation.c();
                if (c.isPresent()) {
                    h((FileInformation) c.get(), newSerializer, "thumbnail");
                }
                h(fileTransferInformation.a(), newSerializer, "file");
                if (isPresent) {
                    ajgk.y(newSerializer, "urn:google:am-ftpush-xml-encryption", "encrypted-data", Base64.encodeToString(((aozb) fileTransferInformation.b().get()).H(), 2));
                }
                newSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
                newSerializer.endDocument();
                String stringWriter2 = stringWriter.toString();
                stringWriter.close();
                return stringWriter2;
            } finally {
            }
        } catch (IOException | XmlPullParserException e) {
            throw new ajsh("Error serializing message.", e);
        }
    }

    private static void h(FileInformation fileInformation, XmlSerializer xmlSerializer, String str) {
        boolean isPresent = fileInformation.e().isPresent();
        xmlSerializer.startTag(null, "file-info");
        xmlSerializer.attribute(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, str);
        if (isPresent) {
            xmlSerializer.attribute(null, "file-disposition", "render");
        }
        ajgk.y(xmlSerializer, null, "file-size", String.valueOf(fileInformation.a()));
        Optional h = fileInformation.h();
        if (h.isPresent()) {
            ajgk.y(xmlSerializer, null, "file-name", (String) h.get());
        }
        ajgk.y(xmlSerializer, null, "content-type", fileInformation.b().toString());
        if (isPresent) {
            ajgk.y(xmlSerializer, "urn:gsma:params:xml:ns:rcs:rcs:rram", "playing-length", Long.toString(((Duration) fileInformation.e().get()).toSeconds()));
        }
        xmlSerializer.startTag(null, GroupManagementRequest.DATA_TAG);
        xmlSerializer.attribute(null, "url", fileInformation.i());
        xmlSerializer.attribute(null, "until", fileInformation.d().toString());
        xmlSerializer.endTag(null, GroupManagementRequest.DATA_TAG);
        xmlSerializer.endTag(null, "file-info");
    }

    @Override // defpackage.ajsi
    public final /* bridge */ /* synthetic */ ajqz a(ajrt ajrtVar) {
        return c(ajrtVar);
    }

    @Override // defpackage.ajsi
    public final /* bridge */ /* synthetic */ ajrt b(ajqz ajqzVar) {
        return d((FileTransferInformation) ajqzVar);
    }
}
