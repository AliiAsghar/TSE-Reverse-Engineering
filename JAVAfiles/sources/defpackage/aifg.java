package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aifg extends aifd {
    private String d;
    private aiff e;
    private String f;

    public aifg() {
        super("message/imdn+xml", "utf-8");
        o("imdn", "urn:ietf:params:imdn");
        n("urn:ietf:params:imdn", "Message-ID", aikx.a());
    }

    public static void u(aifg aifgVar, OutputStream outputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(byteArrayOutputStream, "utf-8");
            newSerializer.setPrefix("", "urn:ietf:params:xml:ns:imdn");
            newSerializer.startDocument("utf-8", null);
            newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "imdn");
            newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "message-id");
            newSerializer.text(aifgVar.d);
            newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "message-id");
            newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "datetime");
            newSerializer.text(new advi(0L).toString());
            newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "datetime");
            switch (aifgVar.e) {
                case DELIVERED:
                case DELIVERY_FAILED:
                case DELIVERY_FORBIDDEN:
                case DELIVERY_ERROR:
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", aifgVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", aifgVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                    break;
                case DISPLAYED:
                case DISPLAY_ERROR:
                case DISPLAY_FORBIDDEN:
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", aifgVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", aifgVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                    break;
                case PROCESSED:
                case STORED:
                case PROCESSING_ERROR:
                case PROCESSING_FORBIDDEN:
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.startTag("urn:ietf:params:xml:ns:imdn", aifgVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", aifgVar.e.o);
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                    newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
                    break;
                case INTERWORKING_SMS:
                case INTERWORKING_MMS:
                case INTERWORKING_ERROR:
                    newSerializer.setPrefix("cpmimdn", "urn:oma:xml:cpm:imdn-extensions:1.0");
                    newSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", "interworking-notification");
                    newSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", "status");
                    newSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", aifgVar.e.o);
                    newSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", aifgVar.e.o);
                    newSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", "status");
                    newSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", "interworking-notification");
                    break;
            }
            newSerializer.endTag("urn:ietf:params:xml:ns:imdn", "imdn");
            newSerializer.endDocument();
            newSerializer.flush();
            aifgVar.k(assi.c, "notification");
            aifgVar.j(byteArrayOutputStream.toByteArray());
            aifgVar.q(outputStream);
        } catch (XmlPullParserException e) {
            throw new IOException("Error while writing document: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.aifd
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof aifg)) {
            aifg aifgVar = (aifg) obj;
            if (TextUtils.equals(this.d, aifgVar.d) && TextUtils.equals(this.f, aifgVar.f) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(null, (String) aifgVar.b.get("Subject")) && this.e == aifgVar.e && Objects.equals(null, null)) {
                return super.equals(obj);
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.aifd
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, this.d, this.f, null, null, null, this.e, null});
    }

    @Override // defpackage.aifd
    public final String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            u(this, byteArrayOutputStream);
            return new String(byteArrayOutputStream.toByteArray(), "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public aifg(String str, String str2, String str3, String str4, aiff aiffVar) {
        super("message/imdn+xml", "utf-8");
        o("imdn", "urn:ietf:params:imdn");
        l(str2);
        p(str3);
        this.e = aiffVar;
        this.f = str;
        this.d = str4;
        n("urn:ietf:params:imdn", "Message-ID", str);
        m("DateTime", new advi(SystemClock.currentThreadTimeMillis()).toString());
    }
}
