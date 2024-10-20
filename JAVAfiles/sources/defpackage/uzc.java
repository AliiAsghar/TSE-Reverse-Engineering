package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.util.Linkify;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uzc {
    public static final /* synthetic */ int a = 0;
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/linkify/LinkifyTextUtil");
    private static final String[] c = {"http://", "https://", "rtsp://"};

    public static Optional a(CharSequence charSequence) {
        if (charSequence == null) {
            return Optional.empty();
        }
        List c2 = c(charSequence);
        if (c2.size() != 1) {
            return Optional.empty();
        }
        return Optional.of((String) c2.get(0));
    }

    public static String b(String str) {
        boolean z;
        String[] strArr = c;
        int i = 0;
        while (true) {
            if (i < 3) {
                String str2 = strArr[i];
                if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                    z = true;
                    if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                        str = String.valueOf(str2).concat(String.valueOf(str.substring(str2.length())));
                    }
                } else {
                    i++;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return String.valueOf(c[0]).concat(String.valueOf(str));
        }
        return str;
    }

    public static List c(CharSequence charSequence) {
        return (List) Collection.EL.stream(d(charSequence)).map(new uvo(7)).collect(Collectors.toCollection(new uzg(1)));
    }

    public static List d(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            Linkify.addLinks(valueOf, 1);
            for (ClickableSpan clickableSpan : (ClickableSpan[]) valueOf.getSpans(0, valueOf.length(), ClickableSpan.class)) {
                try {
                    uzb uzbVar = new uzb();
                    uzbVar.a = valueOf.subSequence(valueOf.getSpanStart(clickableSpan), valueOf.getSpanEnd(clickableSpan)).toString();
                    uzbVar.b = valueOf.getSpanStart(clickableSpan);
                    uzbVar.c = valueOf.getSpanEnd(clickableSpan);
                    arrayList.add(uzbVar);
                } catch (IndexOutOfBoundsException e) {
                    alvw i = b.i();
                    i.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/linkify/LinkifyTextUtil", "extractWebUrlsWithPosition", 75, "LinkifyTextUtil.java")).t("TextUtil: Failed to extract url: %s", e);
                }
            }
        }
        return arrayList;
    }
}
