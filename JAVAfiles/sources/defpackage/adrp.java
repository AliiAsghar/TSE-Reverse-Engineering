package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrp extends DefaultHandler {
    private static final alor a;
    private final XmlPullParser b = XmlPullParserFactory.newInstance().newPullParser();

    static {
        alok alokVar = new alok();
        final int i = 1;
        alokVar.h("state", new adro() { // from class: adrn
            @Override // defpackage.adro
            public final void a(adrk adrkVar, String str) {
                int i2 = i;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            adrkVar.a(str);
                            return;
                        }
                        return;
                    }
                    adrkVar.a = str.equalsIgnoreCase("active");
                    return;
                }
                adrkVar.b = Long.parseLong(str);
            }
        });
        final int i2 = 0;
        alokVar.h("refresh", new adro() { // from class: adrn
            @Override // defpackage.adro
            public final void a(adrk adrkVar, String str) {
                int i22 = i2;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            adrkVar.a(str);
                            return;
                        }
                        return;
                    }
                    adrkVar.a = str.equalsIgnoreCase("active");
                    return;
                }
                adrkVar.b = Long.parseLong(str);
            }
        });
        final int i3 = 2;
        alokVar.h("contenttype", new adro() { // from class: adrn
            @Override // defpackage.adro
            public final void a(adrk adrkVar, String str) {
                int i22 = i3;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            adrkVar.a(str);
                            return;
                        }
                        return;
                    }
                    adrkVar.a = str.equalsIgnoreCase("active");
                    return;
                }
                adrkVar.b = Long.parseLong(str);
            }
        });
        final int i4 = 3;
        alokVar.h("lastactive", new adro() { // from class: adrn
            @Override // defpackage.adro
            public final void a(adrk adrkVar, String str) {
                int i22 = i4;
                if (i22 != 0) {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            adrkVar.a(str);
                            return;
                        }
                        return;
                    }
                    adrkVar.a = str.equalsIgnoreCase("active");
                    return;
                }
                adrkVar.b = Long.parseLong(str);
            }
        });
        a = alokVar.b();
    }

    public final adrk a(InputStream inputStream) {
        adrk adrkVar = new adrk();
        try {
            this.b.setInput(inputStream, "utf-8");
            this.b.nextTag();
            this.b.require(2, null, "isComposing");
            while (this.b.nextTag() == 2) {
                adro adroVar = (adro) a.get(this.b.getName());
                if (adroVar != null) {
                    adroVar.a(adrkVar, this.b.nextText());
                } else {
                    int i = 1;
                    while (i > 0) {
                        int next = this.b.next();
                        if (next == 3) {
                            i--;
                        } else if (next == 2) {
                            i++;
                        }
                    }
                }
            }
            this.b.require(3, null, "isComposing");
            return adrkVar;
        } catch (XmlPullParserException e) {
            throw new IOException("Error while parsing notification message.", e);
        }
    }
}
