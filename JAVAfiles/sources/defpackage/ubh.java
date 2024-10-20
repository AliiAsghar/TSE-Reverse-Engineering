package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.webkit.MimeTypeMap;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ubh {
    public static String a(aour aourVar) {
        char c;
        int Z = a.Z(aourVar.c);
        if (Z == 0) {
            Z = 1;
        }
        int i = Z - 2;
        if (i == 2) {
            return "image/png";
        }
        if (i == 3) {
            return "image/gif";
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(aourVar.b);
        int hashCode = fileExtensionFromUrl.hashCode();
        if (hashCode != 102340) {
            if (hashCode == 111145 && fileExtensionFromUrl.equals("png")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (fileExtensionFromUrl.equals("gif")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return "image/png";
        }
        if (c == 1) {
            return "image/gif";
        }
        return "image/*";
    }

    public static final String b(Context context) {
        String string = context.getString(R.string.how_it_works);
        string.getClass();
        return new arus("\\s").a(string, " ");
    }

    public static final void c(SpannableStringBuilder spannableStringBuilder, Context context, String str, final String str2, final Runnable runnable) {
        str.getClass();
        str2.getClass();
        URLSpan uRLSpan = new URLSpan(str2) { // from class: com.google.android.apps.messaging.shared.datamodel.etouffee.util.LinkTextUtil$constructWithStyledUrlLink$urlSpan$1
            @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
            public final void onClick(View view) {
                view.getClass();
                super.onClick(view);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.getClass();
            }
        };
        int ai = arsd.ai(spannableStringBuilder.toString(), str);
        int length = str.length() + ai;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(yyb.bw(context, android.R.attr.textColorLink)), ai, length, 17);
        spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), ai, length, 17);
        spannableStringBuilder.setSpan(uRLSpan, ai, length, 17);
    }

    public static tvf d(pwh pwhVar) {
        pwhVar.getClass();
        return new tsv(pwhVar);
    }

    public static agmh[] e() {
        return ParticipantsTable.c.T;
    }
}
