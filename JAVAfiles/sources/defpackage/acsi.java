package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsi {
    public long a;
    public String b;
    private long c;

    private acsi() {
    }

    public static acsi a(byte[] bArr) {
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new ByteArrayInputStream(bArr), "utf-8");
            newPullParser.nextTag();
            if (newPullParser.getName().equalsIgnoreCase("file-resume-info")) {
                String str = null;
                long j = 0;
                long j2 = 0;
                while (newPullParser.getEventType() != 1) {
                    if (newPullParser.next() == 2) {
                        String name = newPullParser.getName();
                        if ("file-range".equalsIgnoreCase(name)) {
                            String b = b(newPullParser, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
                            if (!TextUtils.isEmpty(b)) {
                                long parseLong = Long.parseLong(b);
                                String b2 = b(newPullParser, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME);
                                if (!TextUtils.isEmpty(b2)) {
                                    j2 = Long.parseLong(b2);
                                    j = parseLong;
                                } else {
                                    throw new IOException("Unable to find end attribute in file range tag!");
                                }
                            } else {
                                throw new IOException("Unable to find start attribute in file range tag!");
                            }
                        } else if (GroupManagementRequest.DATA_TAG.equalsIgnoreCase(name)) {
                            str = b(newPullParser, "url");
                        }
                    }
                }
                if (!Objects.isNull(str)) {
                    return new acsi(j, j2, str);
                }
                throw new IOException("Unable to find url attribute!");
            }
            throw new IOException("Malformed XML or not a file resume info for HTTP file transfer. First tag is " + newPullParser.getName());
        } catch (XmlPullParserException e) {
            throw new IOException("Unable to parse file resume info", e);
        }
    }

    private static String b(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(null, str);
    }

    public final String toString() {
        return " Url: " + this.b + "\n start: " + this.c + "\n end: " + this.a;
    }

    private acsi(long j, long j2, String str) {
        this.c = j;
        this.a = j2;
        this.b = str;
    }
}
