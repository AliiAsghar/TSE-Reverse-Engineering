package com.google.android.ims.filetransfer.http.message;

import android.util.Base64;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import defpackage.advq;
import defpackage.advr;
import defpackage.albo;
import defpackage.aozb;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HttpFileTransferPushMessage implements Serializable {
    private static final long serialVersionUID = -4553689766953957948L;
    public aozb mEncryptedData;
    public String mFileId;
    public FileInfo mFileInfo;
    public String mRemoteInstance;
    public String mSender;
    public FileInfo mThumbnailInfo;

    private HttpFileTransferPushMessage() {
    }

    public static HttpFileTransferPushMessage a(byte[] bArr) {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(new ByteArrayInputStream(bArr), "utf-8");
            newPullParser.nextTag();
            if (newPullParser.getName().equalsIgnoreCase("file")) {
                HttpFileTransferPushMessage httpFileTransferPushMessage = new HttpFileTransferPushMessage();
                while (newPullParser.getEventType() != 1) {
                    newPullParser.next();
                    if (FileInfo.e(newPullParser)) {
                        FileInfo a = FileInfo.a(newPullParser);
                        if (a.mType == FileInfo.Type.THUMBNAIL) {
                            httpFileTransferPushMessage.mThumbnailInfo = a;
                        } else if (a.mType == FileInfo.Type.FILE) {
                            httpFileTransferPushMessage.mFileInfo = a;
                        }
                    } else if (newPullParser.getEventType() == 2 && albo.ar("encrypted-data", newPullParser.getName())) {
                        httpFileTransferPushMessage.mEncryptedData = aozb.w(Base64.decode(newPullParser.nextText(), 0));
                    }
                }
                if (httpFileTransferPushMessage.mFileInfo != null) {
                    return httpFileTransferPushMessage;
                }
                throw new IOException("Invalid HTTP file transfer push message. Does not contain file information!");
            }
            throw new IOException("Malformed XML or not a push message for HTTP file transfer. First tag is " + newPullParser.getName());
        } catch (RuntimeException e) {
            advr.g("RuntimeException: %s", e.getMessage());
            throw new IOException("Unable to parse HTTP file transfer push message", e);
        } catch (XmlPullParserException e2) {
            advr.g("XmlPullParserException: %s", e2.getMessage());
            throw new IOException("Unable to parse HTTP file transfer push message", e2);
        }
    }

    public final boolean b() {
        if (this.mThumbnailInfo != null) {
            return true;
        }
        return false;
    }

    public final byte[] c() {
        boolean z;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(byteArrayOutputStream, "utf-8");
            newSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:fthttp");
            if (this.mFileInfo.d()) {
                newSerializer.setPrefix("am", "urn:gsma:params:xml:ns:rcs:rcs:rram");
            }
            if (this.mEncryptedData != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                newSerializer.setPrefix("enc", "urn:google:am-ftpush-xml-encryption");
            }
            newSerializer.startDocument("utf-8", false);
            newSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
            FileInfo fileInfo = this.mThumbnailInfo;
            if (fileInfo != null) {
                fileInfo.b(newSerializer);
            }
            this.mFileInfo.b(newSerializer);
            if (z) {
                newSerializer.startTag("urn:google:am-ftpush-xml-encryption", "encrypted-data");
                albo.C(this.mEncryptedData);
                newSerializer.text(Base64.encodeToString(this.mEncryptedData.H(), 0));
                newSerializer.endTag("urn:google:am-ftpush-xml-encryption", "encrypted-data");
            }
            newSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
            newSerializer.endDocument();
            newSerializer.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IllegalArgumentException | XmlPullParserException e) {
            throw new IOException(e);
        }
    }

    public final String toString() {
        String str;
        String c = advq.USER_ID.c(this.mSender);
        String str2 = this.mRemoteInstance;
        String str3 = this.mFileId;
        String c2 = advq.GENERIC.c(this.mThumbnailInfo);
        String c3 = advq.GENERIC.c(this.mFileInfo);
        aozb aozbVar = this.mEncryptedData;
        StringBuilder sb = new StringBuilder("Sender: ");
        sb.append(c);
        sb.append("\nRemote Instance: ");
        sb.append(str2);
        sb.append("\nFile ID: ");
        sb.append(str3);
        sb.append("\nThumbnail: ");
        sb.append(c2);
        sb.append("\nFile: ");
        sb.append(c3);
        sb.append("\n");
        if (aozbVar == null) {
            str = "No encrypted data";
        } else {
            str = "Has encrypted data";
        }
        sb.append(str);
        return sb.toString();
    }
}
