package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import java.io.ByteArrayInputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GroupManagementDeserializer {
    private GroupManagementDeserializer() {
    }

    public static CpmGroupManagement parseCpmGroupManagement(byte[] bArr) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new ByteArrayInputStream(bArr), "utf-8");
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        int nextTag = newPullParser.nextTag();
        String namespace = newPullParser.getNamespace();
        String name = newPullParser.getName();
        if (nextTag == 2 && CpmGroupManagement.NAMESPACE.equals(namespace) && CpmGroupManagement.XML_TAG.equals(name)) {
            return CpmGroupManagement.deserialize(newPullParser);
        }
        throw new IllegalArgumentException("Attempting to parse content that is not a cpm-group-management message with proper namespace.");
    }
}
