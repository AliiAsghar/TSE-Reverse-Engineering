package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.adxb;
import defpackage.albo;
import defpackage.d;
import j$.util.Optional;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SubjectGroupManagementRequest extends GroupManagementRequest {
    public static final GroupManagementRequest.Target TARGET = GroupManagementRequest.Target.SUBJECT;
    private final GroupManagementRequest.Action action;
    private final Optional<String> subject;

    private SubjectGroupManagementRequest(GroupManagementRequest.Action action) {
        this.action = action;
        this.subject = Optional.empty();
    }

    public static SubjectGroupManagementRequest createSubjectDeleteData() {
        return new SubjectGroupManagementRequest(GroupManagementRequest.Action.DELETE);
    }

    public static SubjectGroupManagementRequest createSubjectSetData(String str) {
        boolean z;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        return new SubjectGroupManagementRequest(GroupManagementRequest.Action.SET, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SubjectGroupManagementRequest deserializeRequest(XmlPullParser xmlPullParser) {
        boolean z;
        int nextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        GroupManagementRequest.Action action = null;
        String str = null;
        while (true) {
            if (nextTag == 3 && name.equals(GroupManagementRequest.XML_TAG)) {
                break;
            }
            if (CpmGroupManagement.NAMESPACE.equals(namespace)) {
                if (name.equals(GroupManagementRequest.ACTION_TAG)) {
                    action = GroupManagementRequest.Action.fromString(xmlPullParser.nextText());
                } else if (name.equals(GroupManagementRequest.DATA_TAG)) {
                    int nextTag2 = xmlPullParser.nextTag();
                    String namespace2 = xmlPullParser.getNamespace();
                    String name2 = xmlPullParser.getName();
                    if (nextTag2 != 3 && CpmGroupManagement.NAMESPACE.equals(namespace2) && name2.equals(TARGET.getElementTag())) {
                        str = xmlPullParser.nextText();
                    }
                    xmlPullParser.nextTag();
                }
            }
            if (xmlPullParser.getEventType() == 2) {
                adxb.e(xmlPullParser);
            }
            nextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name = xmlPullParser.getName();
        }
        if (action != null && action.equals(GroupManagementRequest.Action.SET) && str != null) {
            return new SubjectGroupManagementRequest(action, str);
        }
        if (action != null && action.equals(GroupManagementRequest.Action.DELETE)) {
            return new SubjectGroupManagementRequest(action);
        }
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        throw new IllegalArgumentException(String.format("Unsupported subject request; action: %s, subject present: %b", action, Boolean.valueOf(z)));
    }

    @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest
    public GroupManagementRequest.Action getAction() {
        return this.action;
    }

    public Optional<String> getSubject() {
        return this.subject;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest
    public GroupManagementRequest.Target getTarget() {
        return TARGET;
    }

    @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest
    public void serializeData(XmlSerializer xmlSerializer) {
        albo.U(shouldSerializeData(), "Call to serializeData(XmlSerializer) when shouldSerializeData() returns false!");
        xmlSerializer.text(this.subject.get());
    }

    @Override // com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest
    public boolean shouldSerializeData() {
        if (!GroupManagementRequest.Action.DELETE.equals(this.action)) {
            return true;
        }
        return false;
    }

    private SubjectGroupManagementRequest(GroupManagementRequest.Action action, String str) {
        this.action = action;
        this.subject = Optional.of(str);
    }
}
