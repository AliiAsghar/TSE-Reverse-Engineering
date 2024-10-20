package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.util.Optional;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxq {
    public Object a;
    public Object b;

    public adxq() {
    }

    public final void a(XmlSerializer xmlSerializer, String str) {
        xmlSerializer.startTag(str, "note");
        Object obj = this.a;
        if (obj != null) {
            xmlSerializer.attribute("http://www.w3.org/XML/1998/namespace", "lang", (String) obj);
        }
        xmlSerializer.text((String) this.b);
        xmlSerializer.endTag(str, "note");
    }

    public final void b(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser.getAttributeValue("http://www.w3.org/XML/1998/namespace", "lang");
        this.b = xmlPullParser.nextText();
    }

    public final FileDownloadRequest c() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null && (obj = this.a) != null) {
            return new adsl((PendingIntent) obj2, (FileInformation) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" intent");
        }
        if (this.a == null) {
            sb.append(" fileInformation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(FileInformation fileInformation) {
        if (fileInformation != null) {
            this.a = fileInformation;
            return;
        }
        throw new NullPointerException("Null fileInformation");
    }

    public final void e(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.b = pendingIntent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    public final adcc f() {
        return new adcc((Optional) this.b, (Optional) this.a);
    }

    public final void g(adqu adquVar) {
        this.b = Optional.of(adquVar);
    }

    public final void h(adrc adrcVar) {
        this.a = Optional.of(adrcVar);
    }

    public final IdTokenRequest i() {
        if (this.a == null) {
            this.a = "";
        }
        if (this.b == null) {
            this.b = "";
        }
        return new IdTokenRequest((String) this.a, (String) this.b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [abth, java.lang.Object] */
    public final abrb j() {
        if (this.b == null) {
            this.b = new aodm(1);
        }
        if (this.a == null) {
            this.a = Looper.getMainLooper();
        }
        return new abrb(this.b, (Looper) this.a);
    }

    public adxq(String str) {
        if (str == null) {
            throw new IllegalArgumentException("value MUST NOT be null");
        }
        this.b = str;
    }

    public adxq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = Optional.empty();
        this.a = Optional.empty();
    }
}
