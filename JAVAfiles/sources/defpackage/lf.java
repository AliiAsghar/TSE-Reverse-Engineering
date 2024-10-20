package defpackage;

import android.graphics.Paint;
import android.widget.TextView;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lf {
    public static final ul a = new ul(30);
    public static Paint b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(TextView textView, String str) {
        String fontVariationSettings;
        fontVariationSettings = textView.getFontVariationSettings();
        if (Objects.equals(fontVariationSettings, str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}
