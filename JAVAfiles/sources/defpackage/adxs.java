package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxs {
    public final Object a;

    public adxs(Context context, byte[] bArr) {
        this.a = context;
    }

    public static void b(adxr adxrVar, OutputStream outputStream) {
        k(adxrVar, new ahjj(outputStream));
    }

    public static /* synthetic */ void e(acit acitVar, hkl hklVar) {
        abra y;
        try {
            hka hkaVar = hklVar.a;
            if (hkaVar != null) {
                int i = hkaVar.a;
                if (i != 400) {
                    if (i == 403) {
                        y = new abra(new Status(9011, "The provided API key is invalid."));
                    }
                } else {
                    y = new abra(new Status(9012, "The provided parameters are invalid (did you include a max width or height?)."));
                }
                acitVar.c(y);
            }
            y = ahmc.y(hklVar);
            acitVar.c(y);
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }

    public static /* synthetic */ void i(aodz aodzVar, acit acitVar, Bitmap bitmap) {
        boolean z;
        try {
            aodzVar.a = bitmap;
            if (aodzVar.a != null) {
                z = true;
            } else {
                z = false;
            }
            albo.U(z, "Photo must be set to non-null value.");
            acitVar.d(new ahyc((Bitmap) aodzVar.a));
        } catch (Error | RuntimeException e) {
            aico.b(e);
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    private final adxr j(ahjj ahjjVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        String str8 = "urn:ietf:params:xml:ns:pidf";
        String str9 = "";
        try {
            Document c = adxb.c();
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput((InputStream) ahjjVar.a, "utf-8");
            newPullParser.next();
            adxr adxrVar = (adxr) this.a.b();
            adxrVar.a = newPullParser.getAttributeValue("", "entity");
            String name = newPullParser.getName();
            int nextTag = newPullParser.nextTag();
            String namespace = newPullParser.getNamespace();
            String name2 = newPullParser.getName();
            while (true) {
                int i2 = 3;
                if (nextTag == 3) {
                    if (name2.equals(name)) {
                        return adxrVar;
                    }
                }
                if (str8.equals(namespace)) {
                    if (name2.equals("tuple")) {
                        adxu adxuVar = (adxu) adxrVar.e.b();
                        adxrVar.b().add(adxuVar);
                        adxuVar.a = newPullParser.getAttributeValue(str9, "id");
                        String name3 = newPullParser.getName();
                        int nextTag2 = newPullParser.nextTag();
                        String name4 = newPullParser.getName();
                        String namespace2 = newPullParser.getNamespace();
                        while (true) {
                            if (nextTag2 == i2 && name4.equals(name3)) {
                                break;
                            }
                            if (str8.equals(namespace2)) {
                                if (name4.equals("contact")) {
                                    adxuVar.d = new adxp();
                                    adxp adxpVar = adxuVar.d;
                                    String attributeValue = newPullParser.getAttributeValue(str9, "priority");
                                    if (attributeValue != null) {
                                        adxpVar.a = Double.valueOf(Double.parseDouble(attributeValue));
                                    }
                                    adxpVar.b = newPullParser.nextText();
                                    str4 = str8;
                                    str5 = str9;
                                    str6 = name;
                                } else if (name4.equals("status")) {
                                    adxuVar.b = (adxt) adxuVar.h.b();
                                    adxt adxtVar = adxuVar.b;
                                    String name5 = newPullParser.getName();
                                    int nextTag3 = newPullParser.nextTag();
                                    String name6 = newPullParser.getName();
                                    str6 = name;
                                    String namespace3 = newPullParser.getNamespace();
                                    str5 = str9;
                                    String str10 = name6;
                                    while (true) {
                                        if (nextTag3 == i2 && str10.equals(name5)) {
                                            break;
                                        }
                                        if (str8.equals(namespace3) && str10.equals("basic")) {
                                            String trim = newPullParser.nextText().trim();
                                            if (!Objects.isNull(trim)) {
                                                adxtVar.a = adxo.a(trim);
                                            }
                                            str7 = str8;
                                        } else {
                                            if (adxtVar.b == null) {
                                                adxtVar.b = new ArrayList();
                                            }
                                            str7 = str8;
                                            adxtVar.b.add(((aday) adxtVar.c.b()).I(c, new QName(namespace3, str10), newPullParser));
                                        }
                                        nextTag3 = newPullParser.nextTag();
                                        str10 = newPullParser.getName();
                                        namespace3 = newPullParser.getNamespace();
                                        str8 = str7;
                                        i2 = 3;
                                    }
                                    str4 = str8;
                                } else {
                                    str4 = str8;
                                    str5 = str9;
                                    str6 = name;
                                    if (name4.equals("note")) {
                                        adxq adxqVar = new adxq();
                                        adxqVar.b(newPullParser);
                                        if (adxuVar.e == null) {
                                            adxuVar.e = new ArrayList();
                                        }
                                        adxuVar.e.add(adxqVar);
                                    } else if (name4.equals("timestamp")) {
                                        adxuVar.f = advi.b(newPullParser.nextText());
                                    } else {
                                        adxuVar.a().add(((aday) adxuVar.i.b()).I(c, new QName(namespace2, name4), newPullParser));
                                    }
                                    i = 3;
                                }
                                i = i2;
                            } else {
                                str4 = str8;
                                str5 = str9;
                                str6 = name;
                                if ("urn:oma:xml:prs:pidf:oma-pres".equals(namespace2)) {
                                    if (name4.equals("service-description")) {
                                        adxuVar.c = adxuVar.j.j(null, null, null);
                                        adxn adxnVar = adxuVar.c;
                                        int nextTag4 = newPullParser.nextTag();
                                        String name7 = newPullParser.getName();
                                        String namespace4 = newPullParser.getNamespace();
                                        i = 3;
                                        while (true) {
                                            if (nextTag4 != 3 || !name7.equals("service-description")) {
                                                if (name7.equals(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION) && "urn:oma:xml:prs:pidf:oma-pres".equals(namespace4)) {
                                                    adxnVar.c = newPullParser.nextText();
                                                } else if (name7.equals("description") && "urn:oma:xml:prs:pidf:oma-pres".equals(namespace4)) {
                                                    adxnVar.d = newPullParser.nextText();
                                                } else if (name7.equals("service-id") && "urn:oma:xml:prs:pidf:oma-pres".equals(namespace4)) {
                                                    adxnVar.b = newPullParser.nextText();
                                                } else {
                                                    Object I = adxnVar.e.I(c, new QName(namespace4, name7), newPullParser);
                                                    if (adxnVar.a == null) {
                                                        adxnVar.a = new ArrayList();
                                                    }
                                                    adxnVar.a.add(I);
                                                }
                                                nextTag4 = newPullParser.nextTag();
                                                name7 = newPullParser.getName();
                                                namespace4 = newPullParser.getNamespace();
                                            }
                                        }
                                    }
                                    i = 3;
                                } else {
                                    i = 3;
                                    adxuVar.a().add(((aday) adxuVar.i.b()).I(c, new QName(namespace2, name4), newPullParser));
                                }
                            }
                            int nextTag5 = newPullParser.nextTag();
                            name4 = newPullParser.getName();
                            namespace2 = newPullParser.getNamespace();
                            name = str6;
                            i2 = i;
                            str9 = str5;
                            nextTag2 = nextTag5;
                            str8 = str4;
                        }
                        str = str8;
                        str2 = str9;
                        str3 = name;
                    } else {
                        str = str8;
                        str2 = str9;
                        str3 = name;
                        if ("note".equals(name2)) {
                            adxq adxqVar2 = new adxq();
                            adxqVar2.b(newPullParser);
                            if (adxrVar.c == null) {
                                adxrVar.c = new ArrayList();
                            }
                            adxrVar.c.add(adxqVar2);
                        } else {
                            adxrVar.a().add(((aday) adxrVar.d.b()).I(c, new QName(namespace, name2), newPullParser));
                        }
                    }
                } else {
                    str = str8;
                    str2 = str9;
                    str3 = name;
                    adxrVar.a().add(((aday) adxrVar.d.b()).I(c, new QName(namespace, name2), newPullParser));
                }
                nextTag = newPullParser.nextTag();
                namespace = newPullParser.getNamespace();
                name2 = newPullParser.getName();
                name = str3;
                str9 = str2;
                str8 = str;
            }
        } catch (IllegalArgumentException | ParserConfigurationException | XmlPullParserException e) {
            throw new IOException(e);
        }
    }

    private static void k(adxr adxrVar, ahjj ahjjVar) {
        try {
            XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput((OutputStream) ahjjVar.a, "utf-8");
            newSerializer.setPrefix("", "urn:ietf:params:xml:ns:pidf");
            newSerializer.setPrefix("rpid", "urn:ietf:params:xml:ns:pidf:rpid");
            newSerializer.setPrefix("cipid", "urn:ietf:params:xml:ns:pidf:cipid");
            newSerializer.setPrefix("pde", "urn:oma:xml:pde:pidf:ext");
            newSerializer.setPrefix("op", "urn:oma:xml:prs:pidf:oma-pres");
            newSerializer.setPrefix("caps", "urn:ietf:params:xml:ns:pidf:caps");
            newSerializer.startDocument("utf-8", true);
            adxrVar.c(newSerializer);
            newSerializer.endDocument();
            newSerializer.flush();
        } catch (IllegalArgumentException | XmlPullParserException e) {
            throw new IOException(e);
        }
    }

    public final adxr a(InputStream inputStream) {
        return j(new ahjj(inputStream));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(final int r6, final android.os.ParcelFileDescriptor r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.aeex
            if (r0 == 0) goto L13
            r0 = r8
            aeex r0 = (defpackage.aeex) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aeex r0 = new aeex
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r8)
            goto L6c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.aqil.P(r8)
            java.lang.Object r8 = r5.a
            r7.getClass()
            ajxp r2 = new ajxp
            r4 = 0
            r2.<init>(r4)
            aeez r4 = new aeez
            r4.<init>()
            r2.c = r4
            abtl r6 = r2.b()
            abrc r8 = (defpackage.abrc) r8
            acir r6 = r8.g(r6)
            r0.b = r3
            arvp r7 = new arvp
            arpe r8 = defpackage.arhi.i(r0)
            r7.<init>(r8, r3)
            r7.A()
            uyb r8 = new uyb
            r0 = 8
            r8.<init>(r7, r0)
            r6.q(r8)
            java.lang.Object r8 = r7.l()
            if (r8 == r1) goto L8a
        L6c:
            aeey r8 = (defpackage.aeey) r8
            java.lang.Integer r6 = r8.a
            if (r6 == 0) goto L7f
            int r6 = r6.intValue()
            r7 = 2
            if (r6 == r3) goto L7e
            if (r6 == r7) goto L7c
            goto L7f
        L7c:
            r3 = 3
            goto L7f
        L7e:
            r3 = r7
        L7f:
            aeev r6 = new aeev
            aeew r7 = new aeew
            r7.<init>(r3)
            r6.<init>(r7)
            return r6
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adxs.c(int, android.os.ParcelFileDescriptor, arpe):java.lang.Object");
    }

    public final aqut d(String str, String str2) {
        aqut aqutVar = new aqut();
        if (!str.isEmpty()) {
            aqutVar.h(new aquj("X-Goog-FieldMask", aqut.c), str);
        }
        aqutVar.h(new aquj("X-Goog-Api-Key", aqut.c), str2);
        Context context = (Context) this.a;
        String e = ahop.e(context.getPackageManager(), context.getPackageName());
        if (!TextUtils.isEmpty(e)) {
            aqutVar.h(new aquj("X-Android-Package", aqut.c), ((Context) this.a).getPackageName());
            aqutVar.h(new aquj("X-Places-Android-Sdk", aqut.c), "4.1.0");
            aqutVar.h(new aquj("X-Android-Cert", aqut.c), e);
        }
        return aqutVar;
    }

    public final Pattern f(String str) {
        Pattern pattern = (Pattern) ((adxs) this.a).g(str);
        if (pattern == null) {
            Pattern compile = Pattern.compile(str);
            ((adxs) this.a).h(str, compile);
            return compile;
        }
        return pattern;
    }

    public final synchronized Object g(Object obj) {
        return ((LinkedHashMap) this.a).get(obj);
    }

    public final synchronized void h(Object obj, Object obj2) {
        ((LinkedHashMap) this.a).put(obj, obj2);
    }

    public adxs(Object obj) {
        this.a = obj;
    }

    public adxs(Context context) {
        context.getClass();
        this.a = new abrc(context, aefb.a, abqy.q, abrb.a);
    }

    public adxs(byte[] bArr) {
        this.a = new ahwg();
    }

    public adxs() {
        this.a = new adxs((byte[]) null);
    }
}
