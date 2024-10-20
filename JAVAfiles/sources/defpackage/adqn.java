package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adqn {
    public String f;
    protected final LinkedHashMap g;
    protected final LinkedHashMap h;

    public adqn(InputStream inputStream) {
        this();
        adqi adqiVar = adqi.OK;
        a(inputStream);
    }

    private final void a(InputStream inputStream) {
        String attributeValue;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(inputStream, "utf-8");
            newPullParser.nextTag();
            String attributeValue2 = newPullParser.getAttributeValue("", "id");
            if (attributeValue2 != null) {
                this.f = attributeValue2;
                String attributeValue3 = newPullParser.getAttributeValue("", "status");
                if (attributeValue3 != null && attributeValue3.equals("ok")) {
                    adqi adqiVar = adqi.OK;
                } else {
                    adqi adqiVar2 = adqi.OK;
                }
                int nextTag = newPullParser.nextTag();
                for (String name = newPullParser.getName(); nextTag != 3 && !name.equals("EndUserConfirmationAck"); name = newPullParser.getName()) {
                    if (name.equals("Subject")) {
                        String attributeValue4 = newPullParser.getAttributeValue("", "lang");
                        if (attributeValue4 != null) {
                            this.g.put(attributeValue4, newPullParser.nextText());
                        }
                    } else if (name.equals("Text") && (attributeValue = newPullParser.getAttributeValue("", "lang")) != null) {
                        this.h.put(attributeValue, newPullParser.nextText());
                    }
                    nextTag = newPullParser.nextTag();
                }
                return;
            }
            throw new IOException("Parsing Request id failed");
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static final String d(LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashMap.keySet().iterator();
        if (it.hasNext()) {
            return (String) linkedHashMap.get((String) it.next());
        }
        return "";
    }

    public final String b() {
        return d(this.g);
    }

    public final String c() {
        return d(this.h);
    }

    public adqn() {
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
    }
}
