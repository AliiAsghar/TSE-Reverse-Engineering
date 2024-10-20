package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqj extends adqn {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public int e = 1;
    public int c = 0;
    public boolean d = false;

    private adqj() {
    }

    public static adqj a(int i, InputStream inputStream) {
        String attributeValue;
        adqj adqjVar = new adqj();
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(inputStream, "utf-8");
            newPullParser.nextTag();
            String attributeValue2 = newPullParser.getAttributeValue(null, "id");
            attributeValue2.getClass();
            adqjVar.f = attributeValue2;
            String attributeValue3 = newPullParser.getAttributeValue(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
            if (attributeValue3 != null && !attributeValue3.equals("volatile")) {
                adqjVar.e = 2;
            }
            if (adqjVar.e == 1) {
                adqjVar.c = i;
                String attributeValue4 = newPullParser.getAttributeValue(null, "timeout");
                if (attributeValue4 != null) {
                    try {
                        adqjVar.c = Integer.parseInt(attributeValue4);
                    } catch (NumberFormatException unused) {
                        advr.q("Invalid number format for timeout %s failling back to default value", attributeValue4);
                    }
                }
            }
            String attributeValue5 = newPullParser.getAttributeValue(null, "pin");
            if (attributeValue5 != null && attributeValue5.equals("true")) {
                adqjVar.d = true;
            }
            String attributeValue6 = newPullParser.getAttributeValue(null, "externalEUCR");
            if (attributeValue6 != null) {
                attributeValue6.equals("true");
            }
            int nextTag = newPullParser.nextTag();
            String name = newPullParser.getName();
            while (nextTag != 3) {
                if (name.equals("EndUserConfirmationRequest")) {
                    break;
                }
                if (name.equals("Subject")) {
                    String attributeValue7 = newPullParser.getAttributeValue(null, "lang");
                    if (attributeValue7 != null) {
                        adqjVar.g.put(attributeValue7, newPullParser.nextText());
                    }
                } else if (name.equals("Text")) {
                    String attributeValue8 = newPullParser.getAttributeValue(null, "lang");
                    if (attributeValue8 != null) {
                        adqjVar.h.put(attributeValue8, newPullParser.nextText());
                    }
                } else if (name.equals("ButtonAccept")) {
                    String attributeValue9 = newPullParser.getAttributeValue(null, "lang");
                    if (attributeValue9 != null) {
                        adqjVar.a.put(attributeValue9, newPullParser.nextText());
                    }
                } else if (name.equals("ButtonReject") && (attributeValue = newPullParser.getAttributeValue(null, "lang")) != null) {
                    adqjVar.b.put(attributeValue, newPullParser.nextText());
                }
                nextTag = newPullParser.nextTag();
                name = newPullParser.getName();
            }
            return adqjVar;
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }
}
