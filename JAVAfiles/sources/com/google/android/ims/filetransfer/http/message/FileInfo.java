package com.google.android.ims.filetransfer.http.message;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.a;
import defpackage.acyz;
import defpackage.aczd;
import defpackage.advr;
import j$.util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FileInfo implements Serializable {
    static final acyz a = aczd.a(174969655);
    private static final String[] b = {"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS", "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mmZ", "yyyy-MM-dd'T'HH:mm"};
    private static final long serialVersionUID = 1648833636990854950L;
    public long mAudioDuration;
    public final String mBrandedUrl;
    public final String mContentType;
    public final String mFileName;
    public final long mSize;
    public final Type mType;
    public final String mUrl;
    public final Date mValidity;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum Type {
        THUMBNAIL,
        FILE
    }

    private FileInfo(Type type, String str, long j, String str2, String str3, String str4, Date date, long j2) {
        this.mType = type;
        this.mFileName = str;
        this.mSize = j;
        this.mUrl = str2;
        this.mBrandedUrl = str3;
        this.mContentType = str4;
        this.mValidity = date;
        this.mAudioDuration = j2;
    }

    public static FileInfo a(XmlPullParser xmlPullParser) {
        Type type;
        Date date;
        try {
        } catch (XmlPullParserException e) {
            throw new IOException("Unable to parse file info", e);
        }
        if (e(xmlPullParser)) {
            String attributeValue = xmlPullParser.getAttributeValue(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
            if (!TextUtils.isEmpty(attributeValue)) {
                Type type2 = Type.THUMBNAIL;
                if ("thumbnail".equalsIgnoreCase(attributeValue)) {
                    type = Type.THUMBNAIL;
                } else if ("file".equalsIgnoreCase(attributeValue)) {
                    type = Type.FILE;
                } else {
                    throw new IOException("Unknown type: ".concat(String.valueOf(attributeValue)));
                }
                Type type3 = type;
                long j = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Date date2 = null;
                long j2 = 0;
                long j3 = 0;
                while (true) {
                    if (xmlPullParser.getEventType() == 3 && "file-info".equalsIgnoreCase(xmlPullParser.getName())) {
                        if (j2 > j) {
                            if (!TextUtils.isEmpty(str)) {
                                if (!TextUtils.isEmpty(str4)) {
                                    return new FileInfo(type3, str2, j2, str, str3, str4, date2, j3);
                                }
                                throw new IOException("Illegal content type: ".concat(String.valueOf(str4)));
                            }
                            throw new IOException("Illegal URL: ".concat(String.valueOf(str)));
                        }
                        throw new IOException(a.ck(j2, "Illegal size: "));
                    }
                    if (f(xmlPullParser) != 3) {
                        if ("file-size".equalsIgnoreCase(xmlPullParser.getName())) {
                            try {
                                j2 = Long.parseLong(g(xmlPullParser, "File size is invalid"));
                            } catch (NumberFormatException e2) {
                                throw new IOException("File size is invalid", e2);
                            }
                        } else if ("file-name".equalsIgnoreCase(xmlPullParser.getName())) {
                            if (((Boolean) a.a()).booleanValue()) {
                                str2 = h(xmlPullParser);
                            } else {
                                str2 = g(xmlPullParser, "File name is empty");
                            }
                        } else if ("content-type".equalsIgnoreCase(xmlPullParser.getName())) {
                            str4 = g(xmlPullParser, "Content type is empty");
                        } else {
                            int i = 0;
                            if (GroupManagementRequest.DATA_TAG.equalsIgnoreCase(xmlPullParser.getName())) {
                                String attributeValue2 = xmlPullParser.getAttributeValue(null, "url");
                                String attributeValue3 = xmlPullParser.getAttributeValue(null, "until");
                                if (!TextUtils.isEmpty(attributeValue3)) {
                                    String replace = attributeValue3.replace("Z", "+0000");
                                    int indexOf = replace.indexOf(58, 19);
                                    if (indexOf >= 0) {
                                        replace = String.valueOf(replace.substring(0, indexOf)).concat(String.valueOf(replace.substring(indexOf + 1)));
                                    }
                                    String str5 = replace;
                                    String[] strArr = b;
                                    while (true) {
                                        int length = strArr.length;
                                        if (i < 6) {
                                            try {
                                                date = new SimpleDateFormat(strArr[i], Locale.US).parse(str5);
                                                break;
                                            } catch (Exception e3) {
                                                int length2 = strArr.length;
                                                if (i == 5) {
                                                    e3.printStackTrace();
                                                    i = 5;
                                                }
                                                i++;
                                            }
                                        } else {
                                            date = null;
                                            break;
                                        }
                                    }
                                    j = 0;
                                    date2 = date;
                                    str = attributeValue2;
                                } else {
                                    throw new IOException("Validity attribute not found");
                                }
                            } else if ("branded-url".equalsIgnoreCase(xmlPullParser.getName())) {
                                str3 = g(xmlPullParser, "Branded url is empty");
                            } else if ("playing-length".equalsIgnoreCase(xmlPullParser.getName())) {
                                try {
                                    j3 = Integer.parseInt(g(xmlPullParser, "Audio duration is invalid"));
                                } catch (NumberFormatException e4) {
                                    throw new IOException("Audio duration is invalid", e4);
                                }
                            } else {
                                advr.q("Ignoring unknown tag: %s", xmlPullParser.getName());
                                xmlPullParser.next();
                            }
                            throw new IOException("Unable to parse file info", e);
                        }
                    }
                    j = 0;
                }
            } else {
                throw new IOException("Type attribute not found");
            }
        } else {
            throw new IOException("Parser not pointing to file info start tag. Expected file-info, but found " + xmlPullParser.getName());
        }
    }

    public static boolean e(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2 && "file-info".equalsIgnoreCase(xmlPullParser.getName())) {
            return true;
        }
        return false;
    }

    private static int f(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (RuntimeException | XmlPullParserException unused) {
            throw new IOException("Invalid XML tag");
        }
    }

    private static String g(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.next() == 4) {
            return xmlPullParser.getText();
        }
        throw new IOException(str);
    }

    private static String h(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextText();
        } catch (RuntimeException | XmlPullParserException e) {
            throw new IOException("Error parsing file name.", e);
        }
    }

    public final void b(XmlSerializer xmlSerializer) {
        String str;
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-info");
        if (this.mType == Type.THUMBNAIL) {
            str = "thumbnail";
        } else {
            str = "file";
        }
        xmlSerializer.attribute("", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, str);
        if (d()) {
            xmlSerializer.attribute("", "file-disposition", "render");
        }
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-size");
        xmlSerializer.text(Long.toString(this.mSize));
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-size");
        if (!Objects.isNull(this.mFileName)) {
            xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-name");
            xmlSerializer.text(this.mFileName);
            xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-name");
        }
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "content-type");
        xmlSerializer.text(this.mContentType);
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "content-type");
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", GroupManagementRequest.DATA_TAG);
        xmlSerializer.attribute("", "url", this.mUrl);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(b[3], Locale.US);
        if (!Objects.isNull(this.mValidity)) {
            xmlSerializer.attribute("", "until", simpleDateFormat.format(this.mValidity));
        }
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", GroupManagementRequest.DATA_TAG);
        if (d() && this.mAudioDuration > 0) {
            xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:rram", "playing-length");
            xmlSerializer.text(Long.toString(this.mAudioDuration));
            xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:rram", "playing-length");
        }
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file-info");
    }

    public final boolean c() {
        Date date = this.mValidity;
        if (date == null || date.after(new Date())) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        return this.mContentType.contains("audio");
    }

    public final String toString() {
        Date date = this.mValidity;
        return " Type: " + String.valueOf(this.mType) + "\n File name: " + this.mFileName + "\n Size: " + this.mSize + "\n Content type: " + this.mContentType + "\n Url: " + this.mUrl + "\n Branded Url: " + this.mBrandedUrl + "\n Validity: " + String.valueOf(date) + "\n audio duration: " + this.mAudioDuration;
    }
}
