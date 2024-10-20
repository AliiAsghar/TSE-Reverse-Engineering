package com.google.android.ims.rcsservice.chatsession.message.groupmanagement;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GroupManagementSerializer {
    private GroupManagementSerializer() {
    }

    static byte[] convertEventToByteArray(CpmGroupManagement cpmGroupManagement) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(byteArrayOutputStream, "utf-8");
            newSerializer.startDocument("utf-8", true);
            cpmGroupManagement.serialize(newSerializer);
            newSerializer.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (XmlPullParserException e) {
            throw new IOException("XmlPullParserException during write(): ".concat(String.valueOf(e.getMessage())));
        }
    }

    public static byte[] createGroupSubjectChangeXml(String str, String str2) {
        if (str2 != null) {
            return convertEventToByteArray(new CpmGroupManagement(str, new GroupData(SubjectGroupManagementRequest.createSubjectSetData(str2))));
        }
        throw new UnsupportedOperationException("Cannot create group subject change XML with null subject.");
    }

    public static byte[] createGroupSubjectDeleteXml(String str) {
        return convertEventToByteArray(new CpmGroupManagement(str, new GroupData(SubjectGroupManagementRequest.createSubjectDeleteData())));
    }
}
