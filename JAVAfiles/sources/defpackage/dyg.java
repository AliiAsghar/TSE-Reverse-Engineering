package defpackage;

import android.app.Notification;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dyg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Notification.Action action) {
        int semanticAction;
        semanticAction = action.getSemanticAction();
        return semanticAction;
    }

    public static void b(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    public static boolean e(MotionEvent motionEvent, int i) {
        if ((motionEvent.getSource() & i) == i) {
            return true;
        }
        return false;
    }

    public static asai f(asai asaiVar, arwe arweVar) {
        asaiVar.getClass();
        akee akeeVar = new akee(new akee((arqv) new fzs(null, 0), (asai) new fzr(gai.a(gai.b(asaiVar, new kea((arpe) null, arweVar, 1)), new jcw((arpe) null, 1, (byte[]) null)), 0), 4), new hei(null, 1, null), 3);
        int i = ascp.a;
        return arrn.S(akeeVar, arweVar, asco.b, 1);
    }

    public static float g(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        } else {
            f2 = i3;
        }
        return f * f2;
    }

    public static void h(esy esyVar) {
        esyVar.d(-3.4028235E38f, Integer.MIN_VALUE);
        CharSequence charSequence = esyVar.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                esyVar.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = esyVar.a;
            dzg.g(charSequence2);
            i((Spannable) charSequence2, new evp(3));
        }
    }

    public static void i(Spannable spannable, algy algyVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (algyVar.a(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public void c() {
    }

    public void d() {
    }
}
