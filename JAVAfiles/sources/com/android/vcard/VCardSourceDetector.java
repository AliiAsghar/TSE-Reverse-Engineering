package com.android.vcard;

import android.text.TextUtils;
import android.util.Log;
import defpackage.albo;
import defpackage.alpt;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardSourceDetector implements VCardInterpreter {
    private static final String LOG_TAG = "vCard";
    private static final int PARSE_TYPE_APPLE = 1;
    private static final int PARSE_TYPE_DOCOMO_FOMA = 3;
    private static final int PARSE_TYPE_MOBILE_PHONE_JP = 2;
    public static final int PARSE_TYPE_UNKNOWN = 0;
    private static final int PARSE_TYPE_WINDOWS_MOBILE_V65_JP = 4;
    private static final String TYPE_FOMA_CHARSET_SIGN = "X-SD-CHAR_CODE";
    private String mSpecifiedCharset;
    private static final alpt<String> APPLE_SIGNS = alpt.o(Arrays.asList(VCardConstants.PROPERTY_X_PHONETIC_FIRST_NAME, VCardConstants.PROPERTY_X_PHONETIC_MIDDLE_NAME, VCardConstants.PROPERTY_X_PHONETIC_LAST_NAME, "X-ABADR", "X-ABUID"));
    private static final alpt<String> JAPANESE_MOBILE_PHONE_SIGNS = alpt.o(Arrays.asList("X-GNO", "X-GN", VCardConstants.PROPERTY_X_REDUCTION));
    private static final alpt<String> WINDOWS_MOBILE_PHONE_SIGNS = alpt.o(Arrays.asList("X-MICROSOFT-ASST_TEL", "X-MICROSOFT-ASSISTANT", "X-MICROSOFT-OFFICELOC"));
    private static final alpt<String> FOMA_SIGNS = alpt.o(Arrays.asList("X-SD-VERN", "X-SD-FORMAT_VER", "X-SD-CATEGORIES", "X-SD-CLASS", "X-SD-DCREATED", "X-SD-DESCRIPTION"));
    private int mParseType = 0;
    private int mVersion = -1;

    public String getEstimatedCharset() {
        if (TextUtils.isEmpty(this.mSpecifiedCharset)) {
            return this.mSpecifiedCharset;
        }
        int i = this.mParseType;
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                return null;
            }
            return "SHIFT_JIS";
        }
        return "UTF-8";
    }

    public int getEstimatedType() {
        int i = this.mParseType;
        if (i != 2) {
            if (i != 3) {
                int i2 = this.mVersion;
                if (i2 == 0) {
                    return -1073741824;
                }
                if (i2 == 1) {
                    return VCardConfig.VCARD_TYPE_V30_GENERIC;
                }
                if (i2 == 2) {
                    return VCardConfig.VCARD_TYPE_V40_GENERIC;
                }
                return 0;
            }
            return VCardConfig.VCARD_TYPE_DOCOMO;
        }
        return VCardConfig.VCARD_TYPE_V21_JAPANESE_MOBILE;
    }

    @Override // com.android.vcard.VCardInterpreter
    public void onPropertyCreated(VCardProperty vCardProperty) {
        String name = vCardProperty.getName();
        List<String> valueList = vCardProperty.getValueList();
        if (albo.ar(name, VCardConstants.PROPERTY_VERSION) && !valueList.isEmpty()) {
            String str = valueList.get(0);
            if (str.equals(VCardConstants.VERSION_V21)) {
                this.mVersion = 0;
            } else if (str.equals(VCardConstants.VERSION_V30)) {
                this.mVersion = 1;
            } else if (str.equals(VCardConstants.VERSION_V40)) {
                this.mVersion = 2;
            } else {
                Log.w("vCard", "Invalid version string: ".concat(String.valueOf(str)));
            }
        } else if (albo.ar(name, TYPE_FOMA_CHARSET_SIGN)) {
            this.mParseType = 3;
            if (!valueList.isEmpty()) {
                this.mSpecifiedCharset = valueList.get(0);
            }
        }
        if (this.mParseType == 0) {
            if (WINDOWS_MOBILE_PHONE_SIGNS.contains(name)) {
                this.mParseType = 4;
                return;
            }
            if (FOMA_SIGNS.contains(name)) {
                this.mParseType = 3;
            } else if (JAPANESE_MOBILE_PHONE_SIGNS.contains(name)) {
                this.mParseType = 2;
            } else if (APPLE_SIGNS.contains(name)) {
                this.mParseType = 1;
            }
        }
    }

    @Override // com.android.vcard.VCardInterpreter
    public void onEntryEnded() {
    }

    @Override // com.android.vcard.VCardInterpreter
    public void onEntryStarted() {
    }

    @Override // com.android.vcard.VCardInterpreter
    public void onVCardEnded() {
    }

    @Override // com.android.vcard.VCardInterpreter
    public void onVCardStarted() {
    }
}
