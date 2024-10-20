package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequestOrResponse;
import defpackage.advr;
import defpackage.adxb;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GroupData {
    public static final String XML_TAG = "group-data";
    private final GroupManagementRequestOrResponse requestOrResponse;

    public GroupData(GroupManagementRequest groupManagementRequest) {
        this.requestOrResponse = GroupManagementRequestOrResponse.ofRequest(groupManagementRequest);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GroupData deserialize(XmlPullParser xmlPullParser) {
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        GroupManagementRequest groupManagementRequest = null;
        GroupManagementResponse groupManagementResponse = null;
        while (true) {
            if (nextTag == 3 && name.equals(XML_TAG)) {
                break;
            }
            if (CpmGroupManagement.NAMESPACE.equals(namespace)) {
                if (name.equals(GroupManagementRequest.XML_TAG)) {
                    groupManagementRequest = GroupManagementRequest.deserialize(xmlPullParser);
                } else if (name.equals(GroupManagementResponse.XML_TAG)) {
                    groupManagementResponse = GroupManagementResponse.deserialize(xmlPullParser);
                }
            }
            if (xmlPullParser.getEventType() == 2) {
                adxb.e(xmlPullParser);
            }
            nextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name = xmlPullParser.getName();
        }
        if (groupManagementRequest != null && groupManagementResponse != null) {
            throw new IllegalArgumentException("group-data has both request and response element");
        }
        if (groupManagementRequest != null) {
            return new GroupData(groupManagementRequest);
        }
        if (groupManagementResponse != null) {
            return new GroupData(groupManagementResponse);
        }
        advr.q("group-data has neither request or response element", new Object[0]);
        return null;
    }

    public GroupManagementRequestOrResponse getRequestOrResponse() {
        return this.requestOrResponse;
    }

    public void serialize(XmlSerializer xmlSerializer) {
        xmlSerializer.startTag(CpmGroupManagement.NAMESPACE, XML_TAG);
        if (this.requestOrResponse.getKind() == GroupManagementRequestOrResponse.Kind.REQUEST) {
            this.requestOrResponse.request().serialize(xmlSerializer);
        } else if (this.requestOrResponse.getKind() == GroupManagementRequestOrResponse.Kind.RESPONSE) {
            this.requestOrResponse.response().serialize(xmlSerializer);
        }
        xmlSerializer.endTag(CpmGroupManagement.NAMESPACE, XML_TAG);
    }

    public GroupData(GroupManagementResponse groupManagementResponse) {
        this.requestOrResponse = GroupManagementRequestOrResponse.ofResponse(groupManagementResponse);
    }
}
