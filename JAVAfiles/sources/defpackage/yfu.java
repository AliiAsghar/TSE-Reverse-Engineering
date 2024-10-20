package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfu {
    public static final utz a = uuh.h(uuh.b, "google_global_privacy_policy", "https://www.google.com/policies/privacy/");
    public static final utz b = uuh.h(uuh.b, "google_regional_privacy_policy_pattern", "https://www.google.com/intl/%1$s_%2$s/policies/privacy/");
    public final Context c;

    public yfu(Context context) {
        this.c = context;
    }

    public final String a() {
        Locale b2 = yhx.b(this.c);
        String country = b2.getCountry();
        String language = b2.getLanguage();
        if (Locale.US.getCountry().equals(country)) {
            return (String) a.e();
        }
        return String.format(Locale.US, (String) b.e(), language, country);
    }

    public final String b() {
        Locale b2 = yhx.b(this.c);
        String country = b2.getCountry();
        String language = b2.getLanguage();
        if (Locale.US.getCountry().equals(country)) {
            return "https://www.google.com/policies/terms/";
        }
        return String.format(Locale.US, "https://www.google.com/intl/%1$s_%2$s/policies/terms/regional.html", language, country);
    }
}
