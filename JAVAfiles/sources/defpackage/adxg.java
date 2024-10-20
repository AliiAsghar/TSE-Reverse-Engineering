package defpackage;

import j$.util.Objects;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxg implements adwz {
    private static final alpt a = new altx(new QName("urn:jibe:rcs:location-sharing", "preview"));
    private static final alpt b = new altx(adxh.class);

    @Override // defpackage.adwz
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        adxh adxhVar = new adxh();
        if ("urn:jibe:rcs:location-sharing".equals(qName.getNamespaceURI()) && "preview".equals(qName.getLocalPart())) {
            if (!Objects.isNull(xmlPullParser.getAttributeValue("", "content-type"))) {
                String nextText = xmlPullParser.nextText();
                char[] cArr = advk.a;
                int length = nextText.length();
                int i4 = 0;
                if (length == 0) {
                    bArr = new byte[0];
                } else {
                    int i5 = length - 1;
                    int i6 = 0;
                    while (i6 < i5 && advk.b[nextText.charAt(i6) & 255] < 0) {
                        i6++;
                    }
                    while (i5 > 0 && advk.b[nextText.charAt(i5) & 255] < 0) {
                        i5--;
                    }
                    if (nextText.charAt(i5) == '=') {
                        if (nextText.charAt(i5 - 1) == '=') {
                            i = 2;
                        } else {
                            i = 1;
                        }
                    } else {
                        i = 0;
                    }
                    int i7 = (i5 - i6) + 1;
                    if (length > 76) {
                        if (nextText.charAt(76) == '\r') {
                            i3 = i7 / 78;
                        } else {
                            i3 = 0;
                        }
                        i2 = i3 + i3;
                    } else {
                        i2 = 0;
                    }
                    int i8 = (((i7 - i2) * 6) >> 3) - i;
                    byte[] bArr2 = new byte[i8];
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < (i8 / 3) * 3) {
                        int i11 = i6 + 4;
                        int i12 = (advk.b[nextText.charAt(i6 + 1)] << 12) | (advk.b[nextText.charAt(i6)] << 18) | (advk.b[nextText.charAt(i6 + 2)] << 6) | advk.b[nextText.charAt(i6 + 3)];
                        bArr2[i9] = (byte) (i12 >> 16);
                        int i13 = i9 + 2;
                        bArr2[i9 + 1] = (byte) (i12 >> 8);
                        i9 += 3;
                        bArr2[i13] = (byte) i12;
                        if (i2 > 0 && (i10 = i10 + 1) == 19) {
                            i6 += 6;
                            i10 = 0;
                        } else {
                            i6 = i11;
                        }
                    }
                    if (i9 < i8) {
                        int i14 = 0;
                        while (i6 <= i5 - i) {
                            i4 |= advk.b[nextText.charAt(i6)] << (18 - (i14 * 6));
                            i14++;
                            i6++;
                        }
                        int i15 = 16;
                        while (i9 < i8) {
                            bArr2[i9] = (byte) (i4 >> i15);
                            i15 -= 8;
                            i9++;
                        }
                    }
                    bArr = bArr2;
                }
                adxhVar.a = bArr;
            } else {
                throw new XmlPullParserException("Preview is missing required content-type");
            }
        }
        return adxhVar;
    }

    @Override // defpackage.adwz
    public final Set b() {
        return a;
    }

    @Override // defpackage.adwz
    public final Set c() {
        return b;
    }

    @Override // defpackage.adwz
    public final void d(Object obj, XmlSerializer xmlSerializer) {
        if (obj instanceof adxh) {
            xmlSerializer.startTag("urn:jibe:rcs:location-sharing", "preview");
            ((adxh) obj).c(xmlSerializer);
            xmlSerializer.endTag("urn:jibe:rcs:location-sharing", "preview");
        }
    }
}
