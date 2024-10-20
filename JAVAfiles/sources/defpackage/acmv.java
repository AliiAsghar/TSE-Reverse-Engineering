package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.ims.businessinfo.json.BusinessInfoJsonParser;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acmv extends acmw {
    private volatile String a;
    private final BusinessInfoDatabase e;
    private final boolean f;
    private final yjr g;

    public acmv(String str, Context context, BusinessInfoDatabase businessInfoDatabase, boolean z, yjr yjrVar) {
        super(str, context, acmz.AVAILABILITY_UNKNOWN);
        acmz acmzVar;
        this.e = businessInfoDatabase;
        this.f = z;
        this.g = yjrVar;
        algw<String> businessInfoVersion = businessInfoDatabase.getBusinessInfoVersion(str);
        if (businessInfoVersion.f()) {
            this.a = (String) businessInfoVersion.b();
        }
        if (businessInfoDatabase.isMetadataLocallyAvailable(str)) {
            acmzVar = acmz.INFO_LOCALLY_AVAILABLE;
        } else {
            acmzVar = acmz.AVAILABILITY_UNKNOWN;
        }
        this.d = acmzVar;
    }

    private final void g(BusinessInfoDatabase businessInfoDatabase, HttpsURLConnection httpsURLConnection) {
        String headerField = httpsURLConnection.getHeaderField("ETag");
        this.a = headerField;
        String headerField2 = httpsURLConnection.getHeaderField("Cache-Control");
        long j = 0;
        if (headerField2 != null) {
            String[] split = TextUtils.split(headerField2, ",");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String trim = split[i].trim();
                if (trim.startsWith("max-age=")) {
                    try {
                        j = TimeUnit.SECONDS.toMillis(Long.parseLong(trim.substring(8))) + agkx.W().longValue();
                        break;
                    } catch (Exception e) {
                        advr.i(e, "Failed to parse the cache-control header: %s", headerField2);
                    }
                }
                i++;
            }
        }
        businessInfoDatabase.insertOrUpdateBusinessInfoMetadata(this.b, headerField, j);
    }

    @Override // defpackage.acmw
    protected final acmz a(HttpsURLConnection httpsURLConnection) {
        BusinessInfoData legacyParse;
        acmz acmzVar;
        URL url = httpsURLConnection.getURL();
        advr.k("Fetching business info metadata from %s...", advr.a(url));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
        try {
            boolean z = this.f;
            String str = this.b;
            if (z) {
                legacyParse = BusinessInfoJsonParser.parse(str, bufferedReader, this.g);
            } else {
                legacyParse = BusinessInfoJsonParser.legacyParse(str, bufferedReader, this.g);
            }
            if (legacyParse != null) {
                String rbmBotId = legacyParse.getRbmBotId();
                String name = legacyParse.getName();
                advr.k("Saving bot info metadata for botId: %s name: %s...", advr.a(rbmBotId), advr.a(name));
                g(this.e, httpsURLConnection);
                if (this.e.insertOrUpdateBusinessInfoData(legacyParse)) {
                    advr.k("Saved bot business info metadata for botId %s name: %s.", advr.a(rbmBotId), advr.a(name));
                    acmzVar = acmz.INFO_LOCALLY_AVAILABLE;
                } else {
                    advr.g("Error saving bot business info metadata for botId %s name: %s.", advr.a(rbmBotId), advr.a(name));
                    acmzVar = acmz.CLIENT_ERROR;
                }
            } else {
                advr.g("Business info data model object is null for botId %s.", advr.a(str));
                advr.g("Unable to save business info for %s / %s.", advr.a(str), advr.a(url));
                acmzVar = acmz.CLIENT_ERROR;
            }
            bufferedReader.close();
            return acmzVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acmw
    public final String b() {
        return this.b + "_" + this.f;
    }

    @Override // defpackage.acmw
    public final String c() {
        String str;
        String str2 = this.b;
        String str3 = null;
        if (str2 == null) {
            advr.g("Cannot build bot info metadata server url with null rbmBotId.", new Object[0]);
            return null;
        }
        String str4 = (String) ((acza) acyu.a().b.a).a();
        if (TextUtils.isEmpty(str4)) {
            str4 = adom.q(str2);
            if (TextUtils.isEmpty(str4)) {
                advr.g("Cannot build bot info metadata server url with invalid rbmBotId %s", advr.a(str2));
                return null;
            }
        }
        Context context = this.c;
        String m = adwt.g(context).m();
        if (!TextUtils.isEmpty(m) && m.length() >= 5) {
            if (m.length() != 6) {
                str3 = String.format(Locale.US, "%d%03d", Integer.valueOf(Integer.parseInt(m.substring(0, 3))), Integer.valueOf(Integer.parseInt(m.substring(3))));
            } else {
                str3 = m;
            }
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority(str4).path("bot").appendQueryParameter("id", "sip:".concat(str2));
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("ho", str3);
        }
        if (((Boolean) acyu.a.a()).booleanValue()) {
            try {
                str = dzf.c(context.getResources().getConfiguration()).f(0).getLanguage();
            } catch (NullPointerException e) {
                advr.i(e, "Error finding language code on device for rbmBotId %s", advr.a(str2));
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                advr.k("Defaulting to English locale for business info retrieval", new Object[0]);
                str = "en";
            }
            appendQueryParameter.appendQueryParameter("hl", str);
        } else {
            try {
                appendQueryParameter.appendQueryParameter("hl", dzf.c(context.getResources().getConfiguration()).f(0).getLanguage());
            } catch (NullPointerException e2) {
                advr.i(e2, "Error finding language code on device for rbmBotId %s", advr.a(str2));
            }
        }
        boolean z = this.f;
        String str5 = (String) ((acza) acyu.a().b.e).a();
        if (z && !TextUtils.isEmpty(str5)) {
            appendQueryParameter.appendQueryParameter("v", String.format("%s", str5));
        }
        String uri = appendQueryParameter.build().toString();
        advr.k("Built bot info server url %s for rbmBotId %s", advr.a(uri), advr.a(str2));
        return uri;
    }

    @Override // defpackage.acmw
    protected final void d(HttpsURLConnection httpsURLConnection) {
        g(this.e, httpsURLConnection);
    }

    @Override // defpackage.acmw
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.acmw
    public final HttpsURLConnection f(String str) {
        HttpsURLConnection f = super.f(str);
        String str2 = this.a;
        boolean isEmpty = TextUtils.isEmpty(str2);
        String str3 = this.b;
        if (!isEmpty) {
            advr.k("Creating connection with bot info version: %s for botId: %s", str2, advr.a(str3));
            f.setRequestProperty("If-None-Match", str2);
        } else {
            advr.k("Creating connection with missing bot info version for botId: %s", advr.a(str3));
        }
        return f;
    }
}
