package com.android.vcard;

import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import defpackage.a;
import defpackage.albo;
import defpackage.gvf;
import defpackage.hiw;
import defpackage.hje;
import defpackage.hjk;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardUtils {
    private static final String LOG_TAG = "vCard";
    private static final int[] sEscapeIndicatorsV30;
    private static final int[] sEscapeIndicatorsV40;
    private static final Map<Integer, String> sKnownImPropNameMap_ItoS;
    private static final Map<String, Integer> sKnownPhoneTypeMap_StoI;
    private static final Map<Integer, String> sKnownPhoneTypesMap_ItoS;
    private static final Set<String> sMobilePhoneLabelSet;
    private static final Set<String> sPhoneTypesUnknownToContactsSet;
    private static final Set<Character> sUnAcceptableAsciiInV21WordSet;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class PhoneNumberUtilsPort {
        public static String formatNumber(String str, int i) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            PhoneNumberUtils.formatNumber(spannableStringBuilder, i);
            return spannableStringBuilder.toString();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class TextUtilsPort {
        public static boolean isPrintableAscii(char c) {
            if ((c < ' ' || c > '~') && c != '\r' && c != '\n') {
                return false;
            }
            return true;
        }

        public static boolean isPrintableAsciiOnly(CharSequence charSequence) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (!isPrintableAscii(charSequence.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        sKnownPhoneTypesMap_ItoS = hashMap;
        HashMap hashMap2 = new HashMap();
        sKnownPhoneTypeMap_StoI = hashMap2;
        hashMap.put(9, VCardConstants.PARAM_TYPE_CAR);
        hashMap2.put(VCardConstants.PARAM_TYPE_CAR, 9);
        hashMap.put(6, VCardConstants.PARAM_TYPE_PAGER);
        hashMap2.put(VCardConstants.PARAM_TYPE_PAGER, 6);
        hashMap.put(11, VCardConstants.PARAM_TYPE_ISDN);
        hashMap2.put(VCardConstants.PARAM_TYPE_ISDN, 11);
        hashMap2.put(VCardConstants.PARAM_TYPE_HOME, 1);
        hashMap2.put(VCardConstants.PARAM_TYPE_WORK, 3);
        hashMap2.put(VCardConstants.PARAM_TYPE_CELL, 2);
        hashMap2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER, 7);
        hashMap2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_CALLBACK, 8);
        hashMap2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_COMPANY_MAIN, 10);
        hashMap2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_RADIO, 14);
        hashMap2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_TTY_TDD, 16);
        hashMap2.put(VCardConstants.PARAM_PHONE_EXTRA_TYPE_ASSISTANT, 19);
        hashMap2.put(VCardConstants.PARAM_TYPE_VOICE, 7);
        HashSet hashSet = new HashSet();
        sPhoneTypesUnknownToContactsSet = hashSet;
        hashSet.add(VCardConstants.PARAM_TYPE_MODEM);
        hashSet.add(VCardConstants.PARAM_TYPE_MSG);
        hashSet.add(VCardConstants.PARAM_TYPE_BBS);
        hashSet.add(VCardConstants.PARAM_TYPE_VIDEO);
        HashMap hashMap3 = new HashMap();
        sKnownImPropNameMap_ItoS = hashMap3;
        hashMap3.put(0, VCardConstants.PROPERTY_X_AIM);
        hashMap3.put(1, VCardConstants.PROPERTY_X_MSN);
        hashMap3.put(2, VCardConstants.PROPERTY_X_YAHOO);
        hashMap3.put(3, VCardConstants.PROPERTY_X_SKYPE_USERNAME);
        hashMap3.put(5, VCardConstants.PROPERTY_X_GOOGLE_TALK);
        hashMap3.put(6, VCardConstants.PROPERTY_X_ICQ);
        hashMap3.put(7, VCardConstants.PROPERTY_X_JABBER);
        hashMap3.put(4, VCardConstants.PROPERTY_X_QQ);
        hashMap3.put(8, VCardConstants.PROPERTY_X_NETMEETING);
        sMobilePhoneLabelSet = new HashSet(Arrays.asList("MOBILE", "携帯電話", "携帯", "ケイタイ", "ｹｲﾀｲ"));
        sUnAcceptableAsciiInV21WordSet = new HashSet(Arrays.asList('[', ']', '=', ':', '.', ',', ' '));
        sEscapeIndicatorsV30 = new int[]{58, 59, 44, 32};
        sEscapeIndicatorsV40 = new int[]{59, 58};
    }

    private VCardUtils() {
    }

    public static boolean appearsLikeAndroidVCardQuotedPrintable(String str) {
        int length = str.length() % 3;
        if (str.length() < 2 || (length != 1 && length != 0)) {
            return false;
        }
        for (int i = 0; i < str.length(); i += 3) {
            if (str.charAt(i) != '=') {
                return false;
            }
        }
        return true;
    }

    public static boolean areAllEmpty(String... strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static List<String> constructListFromValue(String str, int i) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '\\') {
                if (i2 < length - 1) {
                    int i3 = i2 + 1;
                    char charAt2 = str.charAt(i3);
                    String str2 = "\n";
                    if (VCardConfig.isVersion40(i)) {
                        if (charAt2 != 'n' && charAt2 != 'N') {
                            str2 = String.valueOf(charAt2);
                        }
                    } else if (VCardConfig.isVersion30(i)) {
                        if (charAt2 != 'n' && charAt2 != 'N') {
                            str2 = String.valueOf(charAt2);
                        }
                    } else {
                        if (!VCardConfig.isVersion21(i)) {
                            Log.w("vCard", "Unknown vCard type");
                        }
                        if (charAt2 != '\\' && charAt2 != ';' && charAt2 != ':') {
                            if (charAt2 == ',') {
                                charAt2 = ',';
                            } else {
                                str2 = null;
                            }
                        }
                        str2 = String.valueOf(charAt2);
                    }
                    if (str2 != null) {
                        sb.append(str2);
                        i2 = i3;
                    } else {
                        sb.append('\\');
                    }
                    i2++;
                } else {
                    charAt = '\\';
                }
            }
            if (charAt == ';') {
                arrayList.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    public static String constructNameFromElements(int i, String str, String str2, String str3) {
        return constructNameFromElements(i, str, str2, str3, null, null);
    }

    public static boolean containsOnlyAlphaDigitHyphen(Collection<String> collection) {
        if (collection == null) {
            return true;
        }
        for (String str : collection) {
            if (!TextUtils.isEmpty(str)) {
                int length = str.length();
                for (int i = 0; i < length; i = str.offsetByCodePoints(i, 1)) {
                    int codePointAt = str.codePointAt(i);
                    if ((codePointAt < 97 || codePointAt >= 123) && ((codePointAt < 65 || codePointAt >= 91) && ((codePointAt < 48 || codePointAt >= 58) && codePointAt != 45))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean containsOnlyNonCrLfPrintableAscii(Collection<String> collection) {
        if (collection == null) {
            return true;
        }
        for (String str : collection) {
            if (!TextUtils.isEmpty(str)) {
                int length = str.length();
                for (int i = 0; i < length; i = str.offsetByCodePoints(i, 1)) {
                    int codePointAt = str.codePointAt(i);
                    if (codePointAt < 32 || codePointAt > 126) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean containsOnlyPrintableAscii(Collection<String> collection) {
        if (collection == null) {
            return true;
        }
        for (String str : collection) {
            if (!TextUtils.isEmpty(str) && !TextUtilsPort.isPrintableAsciiOnly(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyWhiteSpaces(Collection<String> collection) {
        if (collection == null) {
            return true;
        }
        for (String str : collection) {
            if (!TextUtils.isEmpty(str)) {
                int length = str.length();
                for (int i = 0; i < length; i = str.offsetByCodePoints(i, 1)) {
                    if (!Character.isWhitespace(str.codePointAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final String convertStringCharset(String str, String str2, String str3) {
        if (albo.ar(str2, str3)) {
            return str;
        }
        ByteBuffer encode = Charset.forName(str2).encode(str);
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        try {
            return new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            Log.e("vCard", "Failed to encode: charset=".concat(String.valueOf(str3)));
            return null;
        }
    }

    public static final VCardParser getAppropriateParser(int i) {
        if (VCardConfig.isVersion21(i)) {
            return new VCardParser_V21();
        }
        if (VCardConfig.isVersion30(i)) {
            return new VCardParser_V30();
        }
        if (VCardConfig.isVersion40(i)) {
            return new VCardParser_V40();
        }
        throw new hjk("Version is not specified");
    }

    public static int getPhoneNumberFormat(int i) {
        if (VCardConfig.isJapaneseDevice(i)) {
            return 2;
        }
        return 1;
    }

    public static Object getPhoneTypeFromStrings(Collection<String> collection, String str) {
        boolean z;
        String str2;
        String str3 = null;
        int i = -1;
        boolean z2 = false;
        if (collection != null) {
            Iterator<String> it = collection.iterator();
            int i2 = -1;
            boolean z3 = false;
            z = false;
            while (it.hasNext()) {
                String next = it.next();
                if (next != null) {
                    String aq = albo.aq(next);
                    if (aq.equals("PREF")) {
                        z3 = true;
                    } else if (aq.equals(VCardConstants.PARAM_TYPE_FAX)) {
                        z = true;
                    } else {
                        if (aq.startsWith("X-") && i2 < 0) {
                            next = next.substring(2);
                        }
                        if (next.length() != 0) {
                            Integer num = sKnownPhoneTypeMap_StoI.get(albo.aq(next));
                            if (num != null) {
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                int intValue = num.intValue();
                                int indexOf = str2.indexOf("@");
                                if ((intValue == 6 && indexOf > 0 && indexOf < str2.length() - 1) || i2 < 0 || i2 == 0 || i2 == 7) {
                                    i2 = num.intValue();
                                }
                            } else if (i2 < 0) {
                                i2 = 0;
                                str3 = next;
                            }
                        }
                    }
                }
            }
            i = i2;
            z2 = z3;
        } else {
            z = false;
        }
        if (i < 0) {
            if (z2) {
                i = 12;
            } else {
                i = 1;
            }
        }
        if (z) {
            if (i == 1) {
                i = 5;
            } else if (i == 3) {
                i = 4;
            } else if (i == 7) {
                i = 13;
            }
        }
        if (i == 0) {
            return str3;
        }
        return Integer.valueOf(i);
    }

    public static String getPhoneTypeString(Integer num) {
        return sKnownPhoneTypesMap_ItoS.get(num);
    }

    public static String getPropertyNameForIm(int i) {
        return sKnownImPropNameMap_ItoS.get(Integer.valueOf(i));
    }

    public static String guessImageType(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70) {
                return "GIF";
            }
            if (length >= 4 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71) {
                return "PNG";
            }
            if (length >= 2 && bArr[0] == -1 && bArr[1] == -40) {
                return "JPEG";
            }
            return null;
        }
        return null;
    }

    public static boolean isMobilePhoneLabel(String str) {
        if (!"_AUTO_CELL".equals(str) && !sMobilePhoneLabelSet.contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean isV21Word(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt > 126 || sUnAcceptableAsciiInV21WordSet.contains(Character.valueOf((char) codePointAt))) {
                return false;
            }
            i = str.offsetByCodePoints(i, 1);
        }
        return true;
    }

    public static boolean isValidInV21ButUnknownToContactsPhoteType(String str) {
        return sPhoneTypesUnknownToContactsSet.contains(str);
    }

    public static String parseQuotedPrintable(String str, boolean z, String str2, String str3) {
        String[] strArr;
        byte[] bytes;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '=') {
                if (i < length - 1) {
                    int i2 = i + 1;
                    char charAt2 = str.charAt(i2);
                    if (charAt2 != ' ') {
                        if (charAt2 == '\t') {
                            charAt2 = '\t';
                        }
                    }
                    sb.append(charAt2);
                    i = i2;
                    i++;
                }
                charAt = '=';
            }
            sb.append(charAt);
            i++;
        }
        String sb2 = sb.toString();
        if (z) {
            strArr = sb2.split(VCardBuilder.VCARD_END_OF_LINE);
        } else {
            StringBuilder sb3 = new StringBuilder();
            int length2 = sb2.length();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < length2) {
                char charAt3 = sb2.charAt(i3);
                if (charAt3 == '\n') {
                    arrayList.add(sb3.toString());
                    sb3 = new StringBuilder();
                } else if (charAt3 == '\r') {
                    arrayList.add(sb3.toString());
                    sb3 = new StringBuilder();
                    if (i3 < length2 - 1) {
                        int i4 = i3 + 1;
                        if (sb2.charAt(i4) == '\n') {
                            i3 = i4;
                        }
                    }
                } else {
                    sb3.append(charAt3);
                }
                i3++;
            }
            String sb4 = sb3.toString();
            if (sb4.length() > 0) {
                arrayList.add(sb4);
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        StringBuilder sb5 = new StringBuilder();
        for (String str4 : strArr) {
            if (str4.endsWith("=")) {
                str4 = str4.substring(0, str4.length() - 1);
            }
            sb5.append(str4);
        }
        String sb6 = sb5.toString();
        if (TextUtils.isEmpty(sb6)) {
            Log.w("vCard", "Given raw string is empty.");
        }
        try {
            bytes = sb6.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            Log.w("vCard", "Failed to decode: ".concat(String.valueOf(str2)));
            bytes = sb6.getBytes();
        }
        try {
            bytes = gvf.L(bytes);
        } catch (hje unused2) {
            Log.e("vCard", "DecoderException is thrown.");
        }
        try {
            return new String(bytes, str3);
        } catch (UnsupportedEncodingException unused3) {
            Log.e("vCard", "Failed to encode: charset=".concat(String.valueOf(str3)));
            return new String(bytes);
        }
    }

    public static String[] sortNameElements(int i, String str, String str2, String str3) {
        String[] strArr = new String[3];
        int nameOrderType = VCardConfig.getNameOrderType(i);
        if (nameOrderType != 4) {
            if (nameOrderType != 8) {
                strArr[0] = str3;
                strArr[1] = str2;
                strArr[2] = str;
            } else if (containsOnlyPrintableAscii(str) && containsOnlyPrintableAscii(str3)) {
                strArr[0] = str3;
                strArr[1] = str2;
                strArr[2] = str;
            } else {
                strArr[0] = str;
                strArr[1] = str2;
                strArr[2] = str3;
            }
        } else {
            strArr[0] = str2;
            strArr[1] = str3;
            strArr[2] = str;
        }
        return strArr;
    }

    public static String toHalfWidthString(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            Map map = hiw.a;
            Character valueOf = Character.valueOf(charAt);
            if (map.containsKey(valueOf)) {
                str2 = (String) hiw.a.get(valueOf);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                sb.append(str2);
            } else {
                sb.append(charAt);
            }
            i = str.offsetByCodePoints(i, 1);
        }
        return sb.toString();
    }

    private static String toStringAsParamValue(String str, int[] iArr) {
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i = str.offsetByCodePoints(i, 1)) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt != 34) {
                sb.appendCodePoint(codePointAt);
                int length2 = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    if (codePointAt == iArr[i2]) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty() || containsOnlyWhiteSpaces(sb2)) {
            return "";
        }
        if (z) {
            return a.bW(sb2, "\"", "\"");
        }
        return sb2;
    }

    public static String toStringAsV30ParamValue(String str) {
        return toStringAsParamValue(str, sEscapeIndicatorsV30);
    }

    public static String toStringAsV40ParamValue(String str) {
        return toStringAsParamValue(str, sEscapeIndicatorsV40);
    }

    public static String constructNameFromElements(int i, String str, String str2, String str3, String str4, String str5) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        String[] sortNameElements = sortNameElements(i, str, str2, str3);
        if (TextUtils.isEmpty(str4)) {
            z = true;
        } else {
            sb.append(str4);
            z = false;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            String str6 = sortNameElements[i2];
            if (!TextUtils.isEmpty(str6)) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append(str6);
                z = false;
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            if (!z) {
                sb.append(' ');
            }
            sb.append(str5);
        }
        return sb.toString();
    }

    public static boolean containsOnlyPrintableAscii(String... strArr) {
        if (strArr == null) {
            return true;
        }
        return containsOnlyPrintableAscii(Arrays.asList(strArr));
    }

    public static boolean containsOnlyAlphaDigitHyphen(String... strArr) {
        if (strArr == null) {
            return true;
        }
        return containsOnlyAlphaDigitHyphen(Arrays.asList(strArr));
    }

    public static boolean containsOnlyNonCrLfPrintableAscii(String... strArr) {
        if (strArr == null) {
            return true;
        }
        return containsOnlyNonCrLfPrintableAscii(Arrays.asList(strArr));
    }

    public static boolean containsOnlyWhiteSpaces(String... strArr) {
        if (strArr == null) {
            return true;
        }
        return containsOnlyWhiteSpaces(Arrays.asList(strArr));
    }
}
