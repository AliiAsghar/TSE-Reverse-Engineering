package defpackage;

import android.util.Base64;
import android.util.Log;
import com.android.vcard.VCardConstants;
import com.android.vcard.VCardEntryCommitter;
import com.android.vcard.VCardParser_V40;
import com.android.vcard.VCardProperty;
import java.util.ArrayList;
import java.util.Set;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjd extends hjc {
    public hjd() {
    }

    @Override // defpackage.hjc, com.android.vcard.VCardParserImpl_V21
    protected final int a() {
        return 2;
    }

    @Override // defpackage.hjc, com.android.vcard.VCardParserImpl_V21
    protected final String e() {
        return VCardConstants.VERSION_V40;
    }

    @Override // defpackage.hjc, com.android.vcard.VCardParserImpl_V21
    protected final String f(String str) {
        return hix.a(str);
    }

    @Override // defpackage.hjc, com.android.vcard.VCardParserImpl_V21
    protected final Set h() {
        return VCardParser_V40.sKnownPropertyNameSet;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    public final void p(VCardProperty vCardProperty, String str) {
        Matcher matcher;
        String rawValue = vCardProperty.getRawValue();
        if ((str.equals(VCardConstants.PROPERTY_PHOTO) || str.equals(VCardConstants.PROPERTY_LOGO)) && rawValue.startsWith("data:")) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(hix.a(rawValue));
            vCardProperty.setValues(arrayList);
            try {
                matcher = hjf.a.matcher(rawValue);
            } catch (hjn e) {
                throw new hjk("Data uri has an invalid format", e);
            } catch (OutOfMemoryError unused) {
                Log.e(VCardEntryCommitter.LOG_TAG, "OutOfMemoryError happened during parsing BASE64 data!");
            }
            if (matcher.matches()) {
                String group = matcher.group(2);
                String group2 = matcher.group(4);
                try {
                    vCardProperty.setDataUri(new hjf(group, Base64.decode(group2, 0)));
                    k(vCardProperty);
                    return;
                } catch (IllegalArgumentException e2) {
                    throw new hjn("Decode error on base64 photo: ".concat(String.valueOf(group2)), e2);
                }
            }
            throw new hjn("[" + rawValue + "] is not a valid data uri");
        }
        super.p(vCardProperty, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hjc
    public final void v(VCardProperty vCardProperty, String str, String str2) {
        int length;
        StringBuilder sb = new StringBuilder(str2);
        if (VCardParser_V40.valueListParameters.contains(albo.aq(str)) && (length = str2.length()) > 1) {
            char charAt = sb.charAt(0);
            int i = length - 1;
            char charAt2 = sb.charAt(i);
            if (charAt == '\"' && charAt2 == '\"') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(0);
            }
        }
        super.v(vCardProperty, str, sb.toString());
    }

    public hjd(byte[] bArr) {
        super(null);
    }
}
