package defpackage;

import android.content.Context;
import android.text.Annotation;
import android.text.Spanned;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jky {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/disabled/DisabledComposeRowUiAdapterImpl");
    public final Context b;
    public final arwe c;
    public final armf d;
    public final orj e;
    public final armf f;
    public final ascv g;
    public final lre h;
    public final jwb i;

    public jky(Context context, arwe arweVar, lre lreVar, armf armfVar, asai asaiVar, ascg ascgVar, asai asaiVar2, jwb jwbVar, orj orjVar, armf armfVar2) {
        context.getClass();
        arweVar.getClass();
        lreVar.getClass();
        armfVar.getClass();
        asaiVar.getClass();
        ascgVar.getClass();
        asaiVar2.getClass();
        jwbVar.getClass();
        orjVar.getClass();
        armfVar2.getClass();
        this.b = context;
        this.c = arweVar;
        this.h = lreVar;
        this.d = armfVar;
        this.i = jwbVar;
        this.e = orjVar;
        this.f = armfVar2;
        asai a2 = asar.a(new jjv(new jjv(ascgVar, 6), 7));
        eif eifVar = eif.c;
        arqr arqrVar = asar.a;
        arsd.g(eifVar, 2);
        asai P = arrn.P(a2, asar.b(asaiVar2, arqrVar, eifVar), asar.a(new jjv(asaiVar, 8)), new liy(this, 1, (byte[]) null));
        int i = ascp.a;
        this.g = arrn.T(P, arweVar, asco.b, null);
    }

    public final jkz a(int i) {
        String string = this.b.getString(i);
        string.getClass();
        return new jkz(new aeiq(string, null, 14));
    }

    public final jkz b(String str, int i, arqg arqgVar) {
        int spanStart;
        boolean z;
        CharSequence text = this.b.getText(i);
        text.getClass();
        Spanned spanned = (Spanned) text;
        Iterator a2 = arrj.a(spanned.getSpans(0, spanned.length(), Annotation.class));
        Annotation annotation = null;
        Annotation annotation2 = null;
        while (a2.hasNext()) {
            Annotation annotation3 = (Annotation) a2.next();
            String value = annotation3.getValue();
            if (d.F(value, "conversationName")) {
                annotation2 = annotation3;
            } else if (d.F(value, "link")) {
                annotation = annotation3;
            }
        }
        if (annotation != null) {
            int spanStart2 = spanned.getSpanStart(annotation);
            int spanEnd = spanned.getSpanEnd(annotation);
            if (annotation2 == null) {
                spanStart = spanned.length();
            } else {
                spanStart = spanned.getSpanStart(annotation2);
            }
            if (str != null) {
                if (annotation2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                dye.f(z, "supplied resource had no annotation with id=-\"conversationName\"");
                if (spanStart < spanStart2) {
                    int length = str.length();
                    spanEnd += str.length();
                    spanStart2 += length;
                }
            } else if (annotation2 != null) {
                throw new IllegalStateException("no value to fill for annotation with id=\"conversationName\"");
            }
            int i2 = spanStart2;
            int i3 = spanEnd;
            StringBuilder sb = new StringBuilder();
            sb.append(spanned.subSequence(0, spanStart));
            if (str != null) {
                sb.append(str);
            }
            sb.append(spanned.subSequence(spanStart, spanned.length()));
            String sb2 = sb.toString();
            aein aeinVar = aein.h;
            String substring = sb2.substring(i2, i3);
            substring.getClass();
            return new jkz(new aeiq(sb2, aqjn.y(new aeie(aeinVar, i2, i3, substring, new ipk(arqgVar, 13))), 12));
        }
        throw new IllegalStateException("supplied resource had no annotation with id=\"link\"");
    }
}
