package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import j$.time.Duration;
import j$.time.Instant;
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
public final class ajry implements ajsi {
    public static final ContentType a = ajru.a;
    private static final ContentType b;

    static {
        aoad g = ContentType.g();
        g.C(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        g.B("plain");
        b = g.y();
    }

    public static final IsComposingMessage c(ajrt ajrtVar) {
        ajqk ajqkVar;
        ContentType contentType = a;
        if (contentType.e(ajrtVar.b)) {
            try {
                InputStream m = ajrtVar.a.m();
                try {
                    XmlPullParser x = ajgk.x();
                    x.setInput(m, "UTF-8");
                    int t = ajgk.t(x);
                    String name = x.getName();
                    if ("isComposing".equals(name)) {
                        arbj arbjVar = new arbj((byte[]) null, (short[]) null);
                        while (true) {
                            if (t == 3) {
                                if (!"isComposing".equals(name)) {
                                    t = 3;
                                } else {
                                    IsComposingMessage u = arbjVar.u();
                                    m.close();
                                    return u;
                                }
                            }
                            if (t != 1) {
                                if (t == 2) {
                                    if ("refresh".equals(name)) {
                                        long parseLong = Long.parseLong(ajgk.w(x));
                                        if (parseLong >= 0) {
                                            arbjVar.v(Duration.ofSeconds(parseLong));
                                        } else {
                                            throw new ajrx("refresh");
                                        }
                                    } else if ("lastactive".equals(name)) {
                                        arbjVar.x(ajgk.v("lastactive", ajgk.w(x)));
                                    } else if ("state".equals(name)) {
                                        if (albo.ar(ajgk.w(x), "active")) {
                                            ajqkVar = ajqk.START;
                                        } else {
                                            ajqkVar = ajqk.STOP;
                                        }
                                        arbjVar.w(ajqkVar);
                                    }
                                }
                                t = ajgk.t(x);
                                name = x.getName();
                            } else {
                                throw new ajrw("Incomplete XML for:".concat(String.valueOf(IsComposingMessage.class.getName())));
                            }
                        }
                    } else {
                        throw new ajrw("Invalid start tag for XML:".concat(String.valueOf(IsComposingMessage.class.getName())));
                    }
                } catch (Throwable th) {
                    try {
                        m.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | IllegalStateException | NumberFormatException | XmlPullParserException e) {
                throw new ajsh("Error deserializing IsComposingMessage", e);
            }
        } else {
            throw new ajsk(ajrtVar.b, "Supported type for this serializer is: ".concat(String.valueOf(String.valueOf(contentType))));
        }
    }

    public static final ajrt d(IsComposingMessage isComposingMessage) {
        String str;
        try {
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            StringWriter stringWriter = new StringWriter();
            try {
                newSerializer.setOutput(stringWriter);
                newSerializer.setPrefix("", "urn:ietf:params:xml:ns:im-iscomposing");
                newSerializer.startDocument("UTF-8", true);
                newSerializer.startTag("urn:ietf:params:xml:ns:im-iscomposing", "isComposing");
                ajqk a2 = isComposingMessage.a();
                if (ajqk.START.equals(a2)) {
                    str = "active";
                } else if (ajqk.STOP.equals(a2)) {
                    str = "idle";
                } else {
                    throw new ajrx("state");
                }
                ajgk.y(newSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "state", str);
                ajgk.y(newSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "contenttype", b.toString());
                Optional c = isComposingMessage.c();
                if (c.isPresent()) {
                    ajgk.y(newSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "lastactive", advj.c(((Instant) c.get()).toEpochMilli()));
                }
                Optional b2 = isComposingMessage.b();
                if (b2.isPresent()) {
                    ajgk.y(newSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "refresh", String.valueOf(((Duration) b2.get()).getSeconds()));
                }
                newSerializer.endTag("urn:ietf:params:xml:ns:im-iscomposing", "isComposing");
                newSerializer.endDocument();
                String stringWriter2 = stringWriter.toString();
                stringWriter.close();
                ajur ajurVar = new ajur(null);
                ajurVar.g(a);
                ajurVar.f(aozb.z(stringWriter2));
                return ajurVar.e();
            } finally {
            }
        } catch (IOException | XmlPullParserException e) {
            throw new ajsh("Error serializing IsComposingMessage.", e);
        }
    }

    @Override // defpackage.ajsi
    public final /* bridge */ /* synthetic */ ajqz a(ajrt ajrtVar) {
        return c(ajrtVar);
    }

    @Override // defpackage.ajsi
    public final /* bridge */ /* synthetic */ ajrt b(ajqz ajqzVar) {
        return d((IsComposingMessage) ajqzVar);
    }
}
