package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import defpackage.adxb;
import j$.util.Optional;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GroupManagementResponse {
    public static final String RESPONSE_CODE_TAG = "response-code";
    public static final String RESPONSE_TEXT_TAG = "response-text";
    public static final String XML_TAG = "response";
    private final int responseCode;
    private final Optional<String> responseText;

    public GroupManagementResponse(int i) {
        this.responseCode = i;
        this.responseText = Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GroupManagementResponse deserialize(XmlPullParser xmlPullParser) {
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        String str = null;
        int i = -1;
        while (true) {
            if (nextTag == 3 && name.equals(XML_TAG)) {
                break;
            }
            if (CpmGroupManagement.NAMESPACE.equals(namespace)) {
                if (name.equals(RESPONSE_CODE_TAG)) {
                    i = Integer.parseInt(xmlPullParser.nextText());
                } else if (name.equals(RESPONSE_TEXT_TAG)) {
                    str = xmlPullParser.nextText();
                }
            }
            if (xmlPullParser.getEventType() == 2) {
                adxb.e(xmlPullParser);
            }
            nextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name = xmlPullParser.getName();
        }
        if (i != -1) {
            if (str == null) {
                return new GroupManagementResponse(i);
            }
            return new GroupManagementResponse(i, str);
        }
        throw new IllegalArgumentException("No valid response code found");
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public Optional<String> getResponseText() {
        return this.responseText;
    }

    public void serialize(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(CpmGroupManagement.NAMESPACE, XML_TAG);
        xmlSerializer.startTag(CpmGroupManagement.NAMESPACE, RESPONSE_CODE_TAG);
        xmlSerializer.text(Integer.toString(this.responseCode));
        xmlSerializer.endTag(CpmGroupManagement.NAMESPACE, RESPONSE_CODE_TAG);
        if (this.responseText.isPresent()) {
            xmlSerializer.startTag(CpmGroupManagement.NAMESPACE, RESPONSE_TEXT_TAG);
            xmlSerializer.text(this.responseText.get());
            xmlSerializer.endTag(CpmGroupManagement.NAMESPACE, RESPONSE_TEXT_TAG);
        }
        xmlSerializer.endTag(CpmGroupManagement.NAMESPACE, XML_TAG);
    }

    public GroupManagementResponse(int i, String str) {
        this.responseCode = i;
        this.responseText = Optional.of(str);
    }
}
