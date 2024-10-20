package defpackage;

import android.graphics.Shader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpl {
    public static final void a(XmlPullParser xmlPullParser) {
        int next = xmlPullParser.next();
        while (next != 2) {
            if (next != 1) {
                next = xmlPullParser.next();
            } else {
                throw new XmlPullParserException("No start tag found");
            }
        }
    }

    public static final cko b(arrt arrtVar) {
        if (arrtVar.p()) {
            Object obj = arrtVar.b;
            if (obj != null) {
                return new ckp((Shader) obj);
            }
            return new cmd(ckw.c(arrtVar.a));
        }
        return null;
    }
}
