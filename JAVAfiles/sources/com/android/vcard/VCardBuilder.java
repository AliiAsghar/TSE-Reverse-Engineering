package com.android.vcard;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.a;
import defpackage.albo;
import defpackage.hix;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardBuilder {
    public static final int DEFAULT_EMAIL_TYPE = 3;
    public static final int DEFAULT_PHONE_TYPE = 1;
    public static final int DEFAULT_POSTAL_TYPE = 1;
    private static final String LOG_TAG = "vCard";
    private static final String SHIFT_JIS = "SHIFT_JIS";
    private static final String VCARD_DATA_PUBLIC = "PUBLIC";
    private static final String VCARD_DATA_SEPARATOR = ":";
    private static final String VCARD_DATA_VCARD = "VCARD";
    public static final String VCARD_END_OF_LINE = "\r\n";
    private static final String VCARD_ITEM_SEPARATOR = ";";
    private static final String VCARD_PARAM_ENCODING_BASE64_AS_B = "ENCODING=B";
    private static final String VCARD_PARAM_ENCODING_BASE64_V21 = "ENCODING=BASE64";
    private static final String VCARD_PARAM_ENCODING_QP = "ENCODING=QUOTED-PRINTABLE";
    private static final String VCARD_PARAM_EQUAL = "=";
    private static final String VCARD_PARAM_SEPARATOR = ";";
    private static final String VCARD_WS = " ";
    private static final Set<String> sAllowedAndroidPropertySet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("vnd.android.cursor.item/nickname", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/relation")));
    private static final Map<Integer, Integer> sPostalTypePriorityMap;
    private final boolean mAppendTypeParamName;
    private StringBuilder mBuilder;
    private final String mCharset;
    private boolean mEndAppended;
    private final boolean mIsDoCoMo;
    private final boolean mIsJapaneseMobilePhone;
    private final boolean mIsV30OrV40;
    private final boolean mNeedsToConvertPhoneticString;
    private final boolean mOnlyOneNoteFieldIsAvailable;
    private final boolean mRefrainsQPToNameProperties;
    private final boolean mShouldAppendCharsetParam;
    private final boolean mShouldUseQuotedPrintable;
    private final boolean mUsesAndroidProperty;
    private final boolean mUsesDefactProperty;
    private final String mVCardCharsetParameter;
    private final int mVCardType;

    static {
        HashMap hashMap = new HashMap();
        sPostalTypePriorityMap = hashMap;
        hashMap.put(1, 0);
        hashMap.put(2, 1);
        hashMap.put(3, 2);
        hashMap.put(0, 3);
    }

    public VCardBuilder(int i) {
        this(i, null);
    }

    private VCardBuilder appendNamePropertiesV40(List<ContentValues> list) {
        String str;
        if (this.mIsDoCoMo || this.mNeedsToConvertPhoneticString) {
            Log.w("vCard", "Invalid flag is used in vCard 4.0 construction. Ignored.");
        }
        if (list != null && !list.isEmpty()) {
            ContentValues primaryContentValueWithStructuredName = getPrimaryContentValueWithStructuredName(list);
            String asString = primaryContentValueWithStructuredName.getAsString("data3");
            String asString2 = primaryContentValueWithStructuredName.getAsString("data5");
            String asString3 = primaryContentValueWithStructuredName.getAsString("data2");
            String asString4 = primaryContentValueWithStructuredName.getAsString("data4");
            String asString5 = primaryContentValueWithStructuredName.getAsString("data6");
            String asString6 = primaryContentValueWithStructuredName.getAsString("data1");
            if (TextUtils.isEmpty(asString) && TextUtils.isEmpty(asString3) && TextUtils.isEmpty(asString2) && TextUtils.isEmpty(asString4) && TextUtils.isEmpty(asString5)) {
                if (!TextUtils.isEmpty(asString6)) {
                    str = asString6;
                } else {
                    appendLine(VCardConstants.PROPERTY_FN, "");
                    return this;
                }
            } else {
                str = asString;
            }
            String asString7 = primaryContentValueWithStructuredName.getAsString("data9");
            String asString8 = primaryContentValueWithStructuredName.getAsString("data8");
            String asString9 = primaryContentValueWithStructuredName.getAsString("data7");
            String escapeCharacters = escapeCharacters(str);
            String escapeCharacters2 = escapeCharacters(asString3);
            String escapeCharacters3 = escapeCharacters(asString2);
            String escapeCharacters4 = escapeCharacters(asString4);
            String escapeCharacters5 = escapeCharacters(asString5);
            this.mBuilder.append(VCardConstants.PROPERTY_N);
            if (!TextUtils.isEmpty(asString7) || !TextUtils.isEmpty(asString8) || !TextUtils.isEmpty(asString9)) {
                this.mBuilder.append(";");
                String str2 = escapeCharacters(asString7) + ";" + escapeCharacters(asString9) + ";" + escapeCharacters(asString8);
                StringBuilder sb = this.mBuilder;
                sb.append("SORT-AS=");
                sb.append(VCardUtils.toStringAsV40ParamValue(str2));
            }
            this.mBuilder.append(VCARD_DATA_SEPARATOR);
            this.mBuilder.append(escapeCharacters);
            this.mBuilder.append(";");
            this.mBuilder.append(escapeCharacters2);
            this.mBuilder.append(";");
            this.mBuilder.append(escapeCharacters3);
            this.mBuilder.append(";");
            this.mBuilder.append(escapeCharacters4);
            this.mBuilder.append(";");
            this.mBuilder.append(escapeCharacters5);
            this.mBuilder.append(VCARD_END_OF_LINE);
            if (TextUtils.isEmpty(asString6)) {
                Log.w("vCard", "DISPLAY_NAME is empty.");
                appendLine(VCardConstants.PROPERTY_FN, escapeCharacters(VCardUtils.constructNameFromElements(VCardConfig.getNameOrderType(this.mVCardType), str, asString2, asString3, asString4, asString5)));
            } else {
                String escapeCharacters6 = escapeCharacters(asString6);
                this.mBuilder.append(VCardConstants.PROPERTY_FN);
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(escapeCharacters6);
                this.mBuilder.append(VCARD_END_OF_LINE);
            }
            appendPhoneticNameFields(primaryContentValueWithStructuredName);
            return this;
        }
        appendLine(VCardConstants.PROPERTY_FN, "");
        return this;
    }

    private void appendPhoneticNameFields(ContentValues contentValues) {
        String escapeCharacters;
        boolean z;
        String escapeCharacters2;
        boolean z2;
        String escapeCharacters3;
        String escapeCharacters4;
        String escapeCharacters5;
        String escapeCharacters6;
        boolean z3;
        boolean z4 = this.mNeedsToConvertPhoneticString;
        String asString = contentValues.getAsString("data9");
        String asString2 = contentValues.getAsString("data8");
        String asString3 = contentValues.getAsString("data7");
        if (z4) {
            asString = VCardUtils.toHalfWidthString(asString);
            asString2 = VCardUtils.toHalfWidthString(asString2);
            asString3 = VCardUtils.toHalfWidthString(asString3);
        }
        if (TextUtils.isEmpty(asString) && TextUtils.isEmpty(asString2) && TextUtils.isEmpty(asString3)) {
            if (this.mIsDoCoMo) {
                this.mBuilder.append(VCardConstants.PROPERTY_SOUND);
                this.mBuilder.append(";");
                this.mBuilder.append("X-IRMC-N");
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(VCARD_END_OF_LINE);
                return;
            }
            return;
        }
        boolean z5 = true;
        if (!VCardConfig.isVersion40(this.mVCardType)) {
            int i = this.mVCardType;
            if (VCardConfig.isVersion30(i)) {
                String constructNameFromElements = VCardUtils.constructNameFromElements(i, asString, asString2, asString3);
                this.mBuilder.append(VCardConstants.PROPERTY_SORT_STRING);
                if (VCardConfig.isVersion30(this.mVCardType) && shouldAppendCharsetParam(constructNameFromElements)) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(escapeCharacters(constructNameFromElements));
                this.mBuilder.append(VCARD_END_OF_LINE);
            } else if (this.mIsJapaneseMobilePhone) {
                this.mBuilder.append(VCardConstants.PROPERTY_SOUND);
                this.mBuilder.append(";");
                this.mBuilder.append("X-IRMC-N");
                if (!this.mRefrainsQPToNameProperties && (!VCardUtils.containsOnlyNonCrLfPrintableAscii(asString) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString2) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString3))) {
                    escapeCharacters4 = encodeQuotedPrintable(asString);
                    escapeCharacters5 = encodeQuotedPrintable(asString2);
                    escapeCharacters6 = encodeQuotedPrintable(asString3);
                } else {
                    escapeCharacters4 = escapeCharacters(asString);
                    escapeCharacters5 = escapeCharacters(asString2);
                    escapeCharacters6 = escapeCharacters(asString3);
                }
                if (shouldAppendCharsetParam(escapeCharacters4, escapeCharacters5, escapeCharacters6)) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                if (!TextUtils.isEmpty(escapeCharacters4)) {
                    this.mBuilder.append(escapeCharacters4);
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!TextUtils.isEmpty(escapeCharacters5)) {
                    if (!z3) {
                        this.mBuilder.append(' ');
                    }
                    this.mBuilder.append(escapeCharacters5);
                    z3 = false;
                }
                if (!TextUtils.isEmpty(escapeCharacters6)) {
                    if (!z3) {
                        this.mBuilder.append(' ');
                    }
                    this.mBuilder.append(escapeCharacters6);
                }
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(VCARD_END_OF_LINE);
            }
        }
        if (this.mUsesDefactProperty) {
            if (!TextUtils.isEmpty(asString3)) {
                if (this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString3)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    escapeCharacters3 = encodeQuotedPrintable(asString3);
                } else {
                    escapeCharacters3 = escapeCharacters(asString3);
                }
                this.mBuilder.append(VCardConstants.PROPERTY_X_PHONETIC_FIRST_NAME);
                if (shouldAppendCharsetParam(asString3)) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                if (z2) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(escapeCharacters3);
                this.mBuilder.append(VCARD_END_OF_LINE);
            }
            if (!TextUtils.isEmpty(asString2)) {
                if (this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    escapeCharacters2 = encodeQuotedPrintable(asString2);
                } else {
                    escapeCharacters2 = escapeCharacters(asString2);
                }
                this.mBuilder.append(VCardConstants.PROPERTY_X_PHONETIC_MIDDLE_NAME);
                if (shouldAppendCharsetParam(asString2)) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                if (z) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(escapeCharacters2);
                this.mBuilder.append(VCARD_END_OF_LINE);
            }
            if (!TextUtils.isEmpty(asString)) {
                if (!this.mShouldUseQuotedPrintable || VCardUtils.containsOnlyNonCrLfPrintableAscii(asString)) {
                    z5 = false;
                }
                if (z5) {
                    escapeCharacters = encodeQuotedPrintable(asString);
                } else {
                    escapeCharacters = escapeCharacters(asString);
                }
                this.mBuilder.append(VCardConstants.PROPERTY_X_PHONETIC_LAST_NAME);
                if (shouldAppendCharsetParam(asString)) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                if (z5) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(escapeCharacters);
                this.mBuilder.append(VCARD_END_OF_LINE);
            }
        }
    }

    private void appendPostalsForDoCoMo(List<ContentValues> list) {
        ContentValues contentValues;
        int i;
        int i2;
        Iterator<ContentValues> it = list.iterator();
        ContentValues contentValues2 = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        while (true) {
            if (it.hasNext()) {
                ContentValues next = it.next();
                if (next != null) {
                    Integer asInteger = next.getAsInteger("data2");
                    Integer num = sPostalTypePriorityMap.get(asInteger);
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i2 < i3) {
                        i4 = asInteger.intValue();
                        if (i2 == 0) {
                            i = i4;
                            contentValues = next;
                            break;
                        } else {
                            contentValues2 = next;
                            i3 = i2;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                contentValues = contentValues2;
                i = i4;
                break;
            }
        }
        if (contentValues == null) {
            Log.w("vCard", "Should not come here. Must have at least one postal data.");
        } else {
            appendPostalLine(i, contentValues.getAsString("data3"), contentValues, false, true);
        }
    }

    private void appendPostalsForGeneric(List<ContentValues> list) {
        int i;
        for (ContentValues contentValues : list) {
            if (contentValues != null) {
                Integer asInteger = contentValues.getAsInteger("data2");
                if (asInteger != null) {
                    i = asInteger.intValue();
                } else {
                    i = 1;
                }
                String asString = contentValues.getAsString("data3");
                Integer asInteger2 = contentValues.getAsInteger("is_primary");
                boolean z = false;
                if (asInteger2 != null && asInteger2.intValue() > 0) {
                    z = true;
                }
                appendPostalLine(i, asString, contentValues, z, false);
            }
        }
    }

    private void appendTypeParameter(String str) {
        appendTypeParameter(this.mBuilder, str);
    }

    private void appendTypeParameters(List<String> list) {
        String stringAsV30ParamValue;
        boolean z = true;
        for (String str : list) {
            if (!VCardConfig.isVersion30(this.mVCardType) && !VCardConfig.isVersion40(this.mVCardType)) {
                if (VCardUtils.isV21Word(str)) {
                    if (!z) {
                        this.mBuilder.append(";");
                    }
                    appendTypeParameter(str);
                    z = false;
                }
            } else {
                if (VCardConfig.isVersion40(this.mVCardType)) {
                    stringAsV30ParamValue = VCardUtils.toStringAsV40ParamValue(str);
                } else {
                    stringAsV30ParamValue = VCardUtils.toStringAsV30ParamValue(str);
                }
                if (!TextUtils.isEmpty(stringAsV30ParamValue)) {
                    if (!z) {
                        this.mBuilder.append(";");
                    }
                    appendTypeParameter(stringAsV30ParamValue);
                    z = false;
                }
            }
        }
    }

    private void appendUncommonPhoneType(StringBuilder sb, Integer num) {
        if (this.mIsDoCoMo) {
            sb.append(VCardConstants.PARAM_TYPE_VOICE);
            return;
        }
        String phoneTypeString = VCardUtils.getPhoneTypeString(num);
        if (phoneTypeString != null) {
            appendTypeParameter(phoneTypeString);
        } else {
            Objects.toString(num);
            Log.e("vCard", "Unknown or unsupported (by vCard) Phone type: ".concat(String.valueOf(num)));
        }
    }

    private void buildSinglePartNameField(String str, String str2) {
        String escapeCharacters;
        boolean z = false;
        if (!this.mRefrainsQPToNameProperties && !VCardUtils.containsOnlyNonCrLfPrintableAscii(str2)) {
            z = true;
        }
        if (z) {
            escapeCharacters = encodeQuotedPrintable(str2);
        } else {
            escapeCharacters = escapeCharacters(str2);
        }
        this.mBuilder.append(str);
        if (shouldAppendCharsetParam(str2)) {
            this.mBuilder.append(";");
            this.mBuilder.append(this.mVCardCharsetParameter);
        }
        if (z) {
            this.mBuilder.append(";");
            this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
        }
        this.mBuilder.append(VCARD_DATA_SEPARATOR);
        this.mBuilder.append(escapeCharacters);
    }

    private boolean containsNonEmptyName(ContentValues contentValues) {
        String asString = contentValues.getAsString("data3");
        String asString2 = contentValues.getAsString("data5");
        String asString3 = contentValues.getAsString("data2");
        String asString4 = contentValues.getAsString("data4");
        String asString5 = contentValues.getAsString("data6");
        String asString6 = contentValues.getAsString("data9");
        String asString7 = contentValues.getAsString("data8");
        String asString8 = contentValues.getAsString("data7");
        String asString9 = contentValues.getAsString("data1");
        if (TextUtils.isEmpty(asString) && TextUtils.isEmpty(asString2) && TextUtils.isEmpty(asString3) && TextUtils.isEmpty(asString4) && TextUtils.isEmpty(asString5) && TextUtils.isEmpty(asString6) && TextUtils.isEmpty(asString7) && TextUtils.isEmpty(asString8) && TextUtils.isEmpty(asString9)) {
            return false;
        }
        return true;
    }

    private String encodeQuotedPrintable(String str) {
        byte[] bytes;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            bytes = str.getBytes(this.mCharset);
        } catch (UnsupportedEncodingException unused) {
            Log.e("vCard", "Charset " + this.mCharset + " cannot be used. Try default charset");
            bytes = str.getBytes();
        }
        int i = 0;
        int i2 = 0;
        while (i < bytes.length) {
            sb.append(String.format("=%02X", Byte.valueOf(bytes[i])));
            i++;
            i2 += 3;
            if (i2 >= 67) {
                sb.append("=\r\n");
                i2 = 0;
            }
        }
        return sb.toString();
    }

    private String escapeCharacters(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != '\n') {
                if (charAt != '\r') {
                    if (charAt != ',') {
                        if (charAt != '>') {
                            if (charAt != '\\') {
                                if (charAt != ';') {
                                    if (charAt != '<') {
                                        sb.append(charAt);
                                    }
                                } else {
                                    sb.append("\\;");
                                }
                            } else if (this.mIsV30OrV40) {
                                sb.append("\\\\");
                            }
                        }
                        if (this.mIsDoCoMo) {
                            sb.append('\\');
                            sb.append(charAt);
                        } else {
                            sb.append(charAt);
                        }
                    } else if (this.mIsV30OrV40) {
                        sb.append("\\,");
                    } else {
                        sb.append(charAt);
                    }
                } else if (i2 < length && str.charAt(i) == '\n') {
                }
                i = i2;
            }
            sb.append("\\n");
            i = i2;
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        if (containsNonEmptyName(r2) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0044, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.content.ContentValues getPrimaryContentValueWithStructuredName(java.util.List<android.content.ContentValues> r5) {
        /*
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r5.next()
            android.content.ContentValues r2 = (android.content.ContentValues) r2
            if (r2 == 0) goto L6
            java.lang.String r3 = "is_super_primary"
            java.lang.Integer r3 = r2.getAsInteger(r3)
            if (r3 == 0) goto L24
            int r3 = r3.intValue()
            if (r3 <= 0) goto L24
            r0 = r2
            goto L46
        L24:
            if (r0 != 0) goto L6
            java.lang.String r3 = "is_primary"
            java.lang.Integer r3 = r2.getAsInteger(r3)
            if (r3 == 0) goto L3c
            int r3 = r3.intValue()
            if (r3 <= 0) goto L3c
            boolean r3 = r4.containsNonEmptyName(r2)
            if (r3 == 0) goto L3c
            r0 = r2
            goto L6
        L3c:
            if (r1 != 0) goto L6
            boolean r3 = r4.containsNonEmptyName(r2)
            if (r3 == 0) goto L6
            r1 = r2
            goto L6
        L46:
            if (r0 != 0) goto L51
            if (r1 == 0) goto L4b
            goto L52
        L4b:
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            return r5
        L51:
            r1 = r0
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardBuilder.getPrimaryContentValueWithStructuredName(java.util.List):android.content.ContentValues");
    }

    private boolean shouldAppendCharsetParam(String... strArr) {
        if (!this.mShouldAppendCharsetParam) {
            return false;
        }
        for (String str : strArr) {
            if (!VCardUtils.containsOnlyPrintableAscii(str)) {
                return true;
            }
        }
        return false;
    }

    private List<String> splitPhoneNumbers(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb = new StringBuilder();
                } else {
                    charAt = '\n';
                }
            }
            sb.append(charAt);
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    private hix tryConstructPostalStruct(ContentValues contentValues) {
        String escapeCharacters;
        String escapeCharacters2;
        String escapeCharacters3;
        String escapeCharacters4;
        String escapeCharacters5;
        String escapeCharacters6;
        String escapeCharacters7;
        String asString = contentValues.getAsString("data5");
        String asString2 = contentValues.getAsString("data6");
        String asString3 = contentValues.getAsString("data4");
        String asString4 = contentValues.getAsString("data7");
        String asString5 = contentValues.getAsString("data8");
        String asString6 = contentValues.getAsString("data9");
        String asString7 = contentValues.getAsString("data10");
        String[] strArr = {asString, asString2, asString3, asString4, asString5, asString6, asString7};
        boolean z = false;
        if (!VCardUtils.areAllEmpty(strArr)) {
            if (this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(strArr)) {
                z = true;
            }
            boolean z2 = !VCardUtils.containsOnlyPrintableAscii(strArr);
            if (TextUtils.isEmpty(asString4)) {
                if (TextUtils.isEmpty(asString2)) {
                    asString2 = "";
                }
            } else if (TextUtils.isEmpty(asString2)) {
                asString2 = asString4;
            } else {
                asString2 = a.co(asString2, asString4, VCARD_WS);
            }
            if (z) {
                escapeCharacters2 = encodeQuotedPrintable(asString);
                escapeCharacters3 = encodeQuotedPrintable(asString3);
                escapeCharacters4 = encodeQuotedPrintable(asString2);
                escapeCharacters5 = encodeQuotedPrintable(asString5);
                escapeCharacters6 = encodeQuotedPrintable(asString6);
                escapeCharacters7 = encodeQuotedPrintable(asString7);
            } else {
                escapeCharacters2 = escapeCharacters(asString);
                escapeCharacters3 = escapeCharacters(asString3);
                escapeCharacters4 = escapeCharacters(asString2);
                escapeCharacters5 = escapeCharacters(asString5);
                escapeCharacters6 = escapeCharacters(asString6);
                escapeCharacters7 = escapeCharacters(asString7);
            }
            return new hix(z, z2, escapeCharacters2 + ";;" + escapeCharacters3 + ";" + escapeCharacters4 + ";" + escapeCharacters5 + ";" + escapeCharacters6 + ";" + escapeCharacters7);
        }
        String asString8 = contentValues.getAsString("data1");
        if (TextUtils.isEmpty(asString8)) {
            return null;
        }
        if (this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString8)) {
            z = true;
        }
        boolean z3 = !VCardUtils.containsOnlyPrintableAscii(asString8);
        if (z) {
            escapeCharacters = encodeQuotedPrintable(asString8);
        } else {
            escapeCharacters = escapeCharacters(asString8);
        }
        return new hix(z, z3, ";" + escapeCharacters + ";;;;;");
    }

    public void appendAndroidSpecificProperty(String str, ContentValues contentValues) {
        boolean z;
        String escapeCharacters;
        if (!sAllowedAndroidPropertySet.contains(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (int i = 1; i <= 15; i++) {
            String asString = contentValues.getAsString(a.bV(i, GroupManagementRequest.DATA_TAG));
            if (asString == null) {
                asString = "";
            }
            arrayList.add(asString);
        }
        if (this.mShouldAppendCharsetParam && !VCardUtils.containsOnlyNonCrLfPrintableAscii(arrayList)) {
            z = true;
        } else {
            z = false;
        }
        if (!this.mShouldUseQuotedPrintable || VCardUtils.containsOnlyNonCrLfPrintableAscii(arrayList)) {
            z2 = false;
        }
        this.mBuilder.append(VCardConstants.PROPERTY_X_ANDROID_CUSTOM);
        if (z) {
            this.mBuilder.append(";");
            this.mBuilder.append(this.mVCardCharsetParameter);
        }
        if (z2) {
            this.mBuilder.append(";");
            this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
        }
        this.mBuilder.append(VCARD_DATA_SEPARATOR);
        this.mBuilder.append(str);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList.get(i2);
            if (z2) {
                escapeCharacters = encodeQuotedPrintable(str2);
            } else {
                escapeCharacters = escapeCharacters(str2);
            }
            this.mBuilder.append(";");
            this.mBuilder.append(escapeCharacters);
        }
        this.mBuilder.append(VCARD_END_OF_LINE);
    }

    public void appendEmailLine(int i, String str, String str2, boolean z) {
        String str3 = VCardConstants.PARAM_TYPE_CELL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            Log.e("vCard", a.bV(i, "Unknown Email type: "));
                        }
                    }
                    str3 = null;
                } else {
                    str3 = VCardConstants.PARAM_TYPE_WORK;
                }
            } else {
                str3 = VCardConstants.PARAM_TYPE_HOME;
            }
        } else if (!VCardUtils.isMobilePhoneLabel(str)) {
            if (!TextUtils.isEmpty(str) && VCardUtils.containsOnlyAlphaDigitHyphen(str)) {
                str3 = "X-".concat(String.valueOf(str));
            }
            str3 = null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("PREF");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3);
        }
        appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_EMAIL, arrayList, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r3 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.android.vcard.VCardBuilder appendEmails(java.util.List<android.content.ContentValues> r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L5e
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
            r3 = r1
        Le:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r9.next()
            android.content.ContentValues r4 = (android.content.ContentValues) r4
            java.lang.String r5 = "data1"
            java.lang.String r5 = r4.getAsString(r5)
            if (r5 == 0) goto L26
            java.lang.String r5 = r5.trim()
        L26:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto Le
            java.lang.String r3 = "data2"
            java.lang.Integer r3 = r4.getAsInteger(r3)
            if (r3 == 0) goto L39
            int r3 = r3.intValue()
            goto L3a
        L39:
            r3 = 3
        L3a:
            java.lang.String r6 = "data3"
            java.lang.String r6 = r4.getAsString(r6)
            java.lang.String r7 = "is_primary"
            java.lang.Integer r4 = r4.getAsInteger(r7)
            if (r4 == 0) goto L50
            int r4 = r4.intValue()
            if (r4 <= 0) goto L50
            r4 = r0
            goto L51
        L50:
            r4 = r1
        L51:
            boolean r7 = r2.add(r5)
            if (r7 == 0) goto L5a
            r8.appendEmailLine(r3, r6, r5, r4)
        L5a:
            r3 = r0
            goto Le
        L5c:
            if (r3 != 0) goto L67
        L5e:
            boolean r9 = r8.mIsDoCoMo
            if (r9 == 0) goto L67
            java.lang.String r9 = ""
            r8.appendEmailLine(r0, r9, r9, r1)
        L67:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardBuilder.appendEmails(java.util.List):com.android.vcard.VCardBuilder");
    }

    public VCardBuilder appendEvents(List<ContentValues> list) {
        if (list != null) {
            Iterator<ContentValues> it = list.iterator();
            String str = null;
            String str2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ContentValues next = it.next();
                if (next != null) {
                    Integer asInteger = next.getAsInteger("data2");
                    if (asInteger != null && asInteger.intValue() == 3) {
                        String asString = next.getAsString("data1");
                        if (asString != null) {
                            Integer asInteger2 = next.getAsInteger("is_super_primary");
                            if (asInteger2 != null && asInteger2.intValue() > 0) {
                                str = asString;
                                break;
                            }
                            Integer asInteger3 = next.getAsInteger("is_primary");
                            if (asInteger3 != null && asInteger3.intValue() > 0) {
                                str = asString;
                            } else if (str2 == null) {
                                str2 = asString;
                            }
                        } else {
                            continue;
                        }
                    } else if (this.mUsesAndroidProperty) {
                        appendAndroidSpecificProperty("vnd.android.cursor.item/contact_event", next);
                    }
                }
            }
            if (str != null) {
                appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_BDAY, str.trim());
            } else if (str2 != null) {
                appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_BDAY, str2.trim());
            }
        }
        return this;
    }

    public VCardBuilder appendIms(List<ContentValues> list) {
        String propertyNameForIm;
        if (list != null) {
            for (ContentValues contentValues : list) {
                Integer asInteger = contentValues.getAsInteger("data5");
                if (asInteger != null && (propertyNameForIm = VCardUtils.getPropertyNameForIm(asInteger.intValue())) != null) {
                    String asString = contentValues.getAsString("data1");
                    if (asString != null) {
                        asString = asString.trim();
                    }
                    if (!TextUtils.isEmpty(asString)) {
                        Integer asInteger2 = contentValues.getAsInteger("data2");
                        String str = null;
                        if (asInteger2 != null) {
                            int intValue = asInteger2.intValue();
                            if (intValue != 0) {
                                if (intValue != 1) {
                                    if (intValue == 2) {
                                        str = VCardConstants.PARAM_TYPE_WORK;
                                    }
                                } else {
                                    str = VCardConstants.PARAM_TYPE_HOME;
                                }
                            } else {
                                String asString2 = contentValues.getAsString("data3");
                                if (asString2 != null) {
                                    str = "X-".concat(asString2);
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(str)) {
                            arrayList.add(str);
                        }
                        Integer asInteger3 = contentValues.getAsInteger("is_primary");
                        if (asInteger3 != null && asInteger3.intValue() > 0) {
                            arrayList.add("PREF");
                        }
                        appendLineWithCharsetAndQPDetection(propertyNameForIm, arrayList, asString);
                    }
                }
            }
        }
        return this;
    }

    public void appendLine(String str, String str2) {
        appendLine(str, str2, false, false);
    }

    public void appendLineWithCharsetAndQPDetection(String str, String str2) {
        appendLineWithCharsetAndQPDetection(str, (List<String>) null, str2);
    }

    public VCardBuilder appendNameProperties(List<ContentValues> list) {
        boolean z;
        String str;
        ContentValues contentValues;
        String str2;
        String str3;
        String escapeCharacters;
        String escapeCharacters2;
        String escapeCharacters3;
        String escapeCharacters4;
        String escapeCharacters5;
        String escapeCharacters6;
        ContentValues contentValues2;
        if (VCardConfig.isVersion40(this.mVCardType)) {
            appendNamePropertiesV40(list);
            return this;
        }
        if (list != null && !list.isEmpty()) {
            ContentValues primaryContentValueWithStructuredName = getPrimaryContentValueWithStructuredName(list);
            String asString = primaryContentValueWithStructuredName.getAsString("data3");
            String asString2 = primaryContentValueWithStructuredName.getAsString("data5");
            String asString3 = primaryContentValueWithStructuredName.getAsString("data2");
            String asString4 = primaryContentValueWithStructuredName.getAsString("data4");
            String asString5 = primaryContentValueWithStructuredName.getAsString("data6");
            String asString6 = primaryContentValueWithStructuredName.getAsString("data1");
            if (TextUtils.isEmpty(asString) && TextUtils.isEmpty(asString3)) {
                if (!TextUtils.isEmpty(asString6)) {
                    buildSinglePartNameField(VCardConstants.PROPERTY_N, asString6);
                    this.mBuilder.append(";");
                    this.mBuilder.append(";");
                    this.mBuilder.append(";");
                    this.mBuilder.append(";");
                    this.mBuilder.append(VCARD_END_OF_LINE);
                    buildSinglePartNameField(VCardConstants.PROPERTY_FN, asString6);
                    this.mBuilder.append(VCARD_END_OF_LINE);
                } else if (VCardConfig.isVersion30(this.mVCardType)) {
                    appendLine(VCardConstants.PROPERTY_N, "");
                    appendLine(VCardConstants.PROPERTY_FN, "");
                } else if (this.mIsDoCoMo) {
                    appendLine(VCardConstants.PROPERTY_N, "");
                }
                contentValues2 = primaryContentValueWithStructuredName;
            } else {
                boolean shouldAppendCharsetParam = shouldAppendCharsetParam(asString, asString3, asString2, asString4, asString5);
                boolean z2 = false;
                if (!this.mRefrainsQPToNameProperties && (!VCardUtils.containsOnlyNonCrLfPrintableAscii(asString) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString3) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString2) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString4) || !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString5))) {
                    z = true;
                } else {
                    z = false;
                }
                if (TextUtils.isEmpty(asString6)) {
                    int nameOrderType = VCardConfig.getNameOrderType(this.mVCardType);
                    contentValues = primaryContentValueWithStructuredName;
                    str2 = ";";
                    str = VCardConstants.PROPERTY_FN;
                    str3 = VCARD_END_OF_LINE;
                    asString6 = VCardUtils.constructNameFromElements(nameOrderType, asString, asString2, asString3, asString4, asString5);
                } else {
                    str = VCardConstants.PROPERTY_FN;
                    contentValues = primaryContentValueWithStructuredName;
                    str2 = ";";
                    str3 = VCARD_END_OF_LINE;
                }
                boolean shouldAppendCharsetParam2 = shouldAppendCharsetParam(asString6);
                if (!this.mRefrainsQPToNameProperties && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString6)) {
                    z2 = true;
                }
                if (z) {
                    escapeCharacters = encodeQuotedPrintable(asString);
                    escapeCharacters2 = encodeQuotedPrintable(asString3);
                    escapeCharacters3 = encodeQuotedPrintable(asString2);
                    escapeCharacters4 = encodeQuotedPrintable(asString4);
                    escapeCharacters5 = encodeQuotedPrintable(asString5);
                } else {
                    escapeCharacters = escapeCharacters(asString);
                    escapeCharacters2 = escapeCharacters(asString3);
                    escapeCharacters3 = escapeCharacters(asString2);
                    escapeCharacters4 = escapeCharacters(asString4);
                    escapeCharacters5 = escapeCharacters(asString5);
                }
                if (z2) {
                    escapeCharacters6 = encodeQuotedPrintable(asString6);
                } else {
                    escapeCharacters6 = escapeCharacters(asString6);
                }
                this.mBuilder.append(VCardConstants.PROPERTY_N);
                if (this.mIsDoCoMo) {
                    if (shouldAppendCharsetParam) {
                        this.mBuilder.append(str2);
                        this.mBuilder.append(this.mVCardCharsetParameter);
                    }
                    if (z) {
                        this.mBuilder.append(str2);
                        this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
                    }
                    this.mBuilder.append(VCARD_DATA_SEPARATOR);
                    this.mBuilder.append(asString6);
                    this.mBuilder.append(str2);
                    this.mBuilder.append(str2);
                    this.mBuilder.append(str2);
                    this.mBuilder.append(str2);
                } else {
                    if (shouldAppendCharsetParam) {
                        this.mBuilder.append(str2);
                        this.mBuilder.append(this.mVCardCharsetParameter);
                    }
                    if (z) {
                        this.mBuilder.append(str2);
                        this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
                    }
                    this.mBuilder.append(VCARD_DATA_SEPARATOR);
                    this.mBuilder.append(escapeCharacters);
                    this.mBuilder.append(str2);
                    this.mBuilder.append(escapeCharacters2);
                    this.mBuilder.append(str2);
                    this.mBuilder.append(escapeCharacters3);
                    this.mBuilder.append(str2);
                    this.mBuilder.append(escapeCharacters4);
                    this.mBuilder.append(str2);
                    this.mBuilder.append(escapeCharacters5);
                }
                this.mBuilder.append(str3);
                this.mBuilder.append(str);
                if (shouldAppendCharsetParam2) {
                    this.mBuilder.append(str2);
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                if (z2) {
                    this.mBuilder.append(str2);
                    this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(escapeCharacters6);
                this.mBuilder.append(str3);
                contentValues2 = contentValues;
            }
            appendPhoneticNameFields(contentValues2);
            return this;
        }
        if (VCardConfig.isVersion30(this.mVCardType)) {
            appendLine(VCardConstants.PROPERTY_N, "");
            appendLine(VCardConstants.PROPERTY_FN, "");
        } else if (this.mIsDoCoMo) {
            appendLine(VCardConstants.PROPERTY_N, "");
        }
        return this;
    }

    public VCardBuilder appendNickNames(List<ContentValues> list) {
        boolean z;
        if (this.mIsV30OrV40) {
            z = false;
        } else {
            if (this.mUsesAndroidProperty) {
                z = true;
            }
            return this;
        }
        if (list != null) {
            for (ContentValues contentValues : list) {
                String asString = contentValues.getAsString("data1");
                if (!TextUtils.isEmpty(asString)) {
                    if (z) {
                        appendAndroidSpecificProperty("vnd.android.cursor.item/nickname", contentValues);
                    } else {
                        appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_NICKNAME, asString);
                    }
                }
            }
        }
        return this;
    }

    public VCardBuilder appendNotes(List<ContentValues> list) {
        boolean z;
        if (list != null) {
            boolean z2 = false;
            if (this.mOnlyOneNoteFieldIsAvailable) {
                StringBuilder sb = new StringBuilder();
                Iterator<ContentValues> it = list.iterator();
                boolean z3 = true;
                while (it.hasNext()) {
                    String asString = it.next().getAsString("data1");
                    if (asString == null) {
                        asString = "";
                    }
                    if (asString.length() > 0) {
                        if (!z3) {
                            sb.append('\n');
                        }
                        sb.append(asString);
                        z3 = false;
                    }
                }
                String sb2 = sb.toString();
                boolean z4 = !VCardUtils.containsOnlyPrintableAscii(sb2);
                if (this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(sb2)) {
                    z2 = true;
                }
                appendLine(VCardConstants.PROPERTY_NOTE, sb2, z4, z2);
            } else {
                Iterator<ContentValues> it2 = list.iterator();
                while (it2.hasNext()) {
                    String asString2 = it2.next().getAsString("data1");
                    if (!TextUtils.isEmpty(asString2)) {
                        boolean z5 = !VCardUtils.containsOnlyPrintableAscii(asString2);
                        if (this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        appendLine(VCardConstants.PROPERTY_NOTE, asString2, z5, z);
                    }
                }
            }
        }
        return this;
    }

    public VCardBuilder appendOrganizations(List<ContentValues> list) {
        boolean z;
        if (list != null) {
            for (ContentValues contentValues : list) {
                String asString = contentValues.getAsString("data1");
                if (asString != null) {
                    asString = asString.trim();
                }
                String asString2 = contentValues.getAsString("data5");
                if (asString2 != null) {
                    asString2 = asString2.trim();
                }
                String asString3 = contentValues.getAsString("data4");
                if (asString3 != null) {
                    asString3 = asString3.trim();
                }
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(asString)) {
                    arrayList.add(asString);
                }
                if (!TextUtils.isEmpty(asString2)) {
                    if (arrayList.isEmpty()) {
                        arrayList.add("");
                    }
                    arrayList.add(asString2);
                }
                boolean z2 = true;
                boolean z3 = !VCardUtils.containsOnlyPrintableAscii(arrayList);
                if (this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(arrayList)) {
                    z = true;
                } else {
                    z = false;
                }
                appendLine(VCardConstants.PROPERTY_ORG, arrayList, z3, z);
                if (!TextUtils.isEmpty(asString3)) {
                    boolean z4 = !VCardUtils.containsOnlyPrintableAscii(asString3);
                    if (!this.mShouldUseQuotedPrintable || VCardUtils.containsOnlyNonCrLfPrintableAscii(asString3)) {
                        z2 = false;
                    }
                    appendLine(VCardConstants.PROPERTY_TITLE, asString3, z4, z2);
                }
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0110, code lost:
    
        if (r3 == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.android.vcard.VCardBuilder appendPhones(java.util.List<android.content.ContentValues> r14, com.android.vcard.VCardPhoneNumberTranslationCallback r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardBuilder.appendPhones(java.util.List, com.android.vcard.VCardPhoneNumberTranslationCallback):com.android.vcard.VCardBuilder");
    }

    public void appendPhotoLine(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("PHOTO;");
        if (this.mIsV30OrV40) {
            sb.append(VCARD_PARAM_ENCODING_BASE64_AS_B);
        } else {
            sb.append(VCARD_PARAM_ENCODING_BASE64_V21);
        }
        sb.append(";");
        appendTypeParameter(sb, str2);
        sb.append(VCARD_DATA_SEPARATOR);
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        int length = sb2.length();
        int i = 73;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            sb3.append(sb2.charAt(i3));
            i2++;
            if (i2 > i) {
                sb3.append("\r\n ");
                i = 72;
                i2 = 0;
            }
        }
        this.mBuilder.append((CharSequence) sb3);
        this.mBuilder.append(VCARD_END_OF_LINE);
        this.mBuilder.append(VCARD_END_OF_LINE);
    }

    public VCardBuilder appendPhotos(List<ContentValues> list) {
        byte[] asByteArray;
        if (list != null) {
            for (ContentValues contentValues : list) {
                if (contentValues != null && (asByteArray = contentValues.getAsByteArray("data15")) != null) {
                    String guessImageType = VCardUtils.guessImageType(asByteArray);
                    if (guessImageType == null) {
                        Log.d("vCard", "Unknown photo type. Ignored.");
                    } else {
                        String str = new String(Base64.encode(asByteArray, 2));
                        if (!TextUtils.isEmpty(str)) {
                            appendPhotoLine(str, guessImageType);
                        }
                    }
                }
            }
        }
        return this;
    }

    public void appendPostalLine(int i, String str, ContentValues contentValues, boolean z, boolean z2) {
        boolean z3;
        String str2;
        boolean z4;
        hix tryConstructPostalStruct = tryConstructPostalStruct(contentValues);
        if (tryConstructPostalStruct == null) {
            if (z2) {
                z4 = false;
                str2 = "";
                z3 = false;
            } else {
                return;
            }
        } else {
            boolean z5 = tryConstructPostalStruct.a;
            z3 = tryConstructPostalStruct.b;
            str2 = tryConstructPostalStruct.c;
            z4 = z5;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("PREF");
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Log.e("vCard", a.bV(i, "Unknown StructuredPostal type: "));
                    }
                } else {
                    arrayList.add(VCardConstants.PARAM_TYPE_WORK);
                }
            } else {
                arrayList.add(VCardConstants.PARAM_TYPE_HOME);
            }
        } else if (!TextUtils.isEmpty(str) && VCardUtils.containsOnlyAlphaDigitHyphen(str)) {
            arrayList.add("X-".concat(String.valueOf(str)));
        }
        this.mBuilder.append(VCardConstants.PROPERTY_ADR);
        if (!arrayList.isEmpty()) {
            this.mBuilder.append(";");
            appendTypeParameters(arrayList);
        }
        if (z3) {
            this.mBuilder.append(";");
            this.mBuilder.append(this.mVCardCharsetParameter);
        }
        if (z4) {
            this.mBuilder.append(";");
            this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
        }
        this.mBuilder.append(VCARD_DATA_SEPARATOR);
        this.mBuilder.append(str2);
        this.mBuilder.append(VCARD_END_OF_LINE);
    }

    public VCardBuilder appendPostals(List<ContentValues> list) {
        if (list != null && !list.isEmpty()) {
            if (this.mIsDoCoMo) {
                appendPostalsForDoCoMo(list);
            } else {
                appendPostalsForGeneric(list);
            }
        } else if (this.mIsDoCoMo) {
            this.mBuilder.append(VCardConstants.PROPERTY_ADR);
            this.mBuilder.append(";");
            this.mBuilder.append(VCardConstants.PARAM_TYPE_HOME);
            this.mBuilder.append(VCARD_DATA_SEPARATOR);
            this.mBuilder.append(VCARD_END_OF_LINE);
        }
        return this;
    }

    public VCardBuilder appendRelation(List<ContentValues> list) {
        if (this.mUsesAndroidProperty && list != null) {
            for (ContentValues contentValues : list) {
                if (contentValues != null) {
                    appendAndroidSpecificProperty("vnd.android.cursor.item/relation", contentValues);
                }
            }
        }
        return this;
    }

    public VCardBuilder appendSipAddresses(List<ContentValues> list) {
        boolean z;
        String str;
        if (this.mIsV30OrV40) {
            z = false;
        } else {
            if (this.mUsesDefactProperty) {
                z = true;
            }
            return this;
        }
        if (list != null) {
            Iterator<ContentValues> it = list.iterator();
            while (it.hasNext()) {
                String asString = it.next().getAsString("data1");
                if (!TextUtils.isEmpty(asString)) {
                    if (z) {
                        if (asString.startsWith("sip:")) {
                            if (asString.length() != 4) {
                                asString = asString.substring(4);
                            }
                        }
                        appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_X_SIP, asString);
                    } else {
                        if (!asString.startsWith("sip:")) {
                            asString = "sip:".concat(String.valueOf(asString));
                        }
                        if (true != VCardConfig.isVersion40(this.mVCardType)) {
                            str = VCardConstants.PROPERTY_IMPP;
                        } else {
                            str = VCardConstants.PROPERTY_TEL;
                        }
                        appendLineWithCharsetAndQPDetection(str, asString);
                    }
                }
            }
        }
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
    
        if (r11 == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void appendTelLine(java.lang.Integer r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardBuilder.appendTelLine(java.lang.Integer, java.lang.String, java.lang.String, boolean):void");
    }

    public VCardBuilder appendWebsites(List<ContentValues> list) {
        if (list != null) {
            Iterator<ContentValues> it = list.iterator();
            while (it.hasNext()) {
                String asString = it.next().getAsString("data1");
                if (asString != null) {
                    asString = asString.trim();
                }
                if (!TextUtils.isEmpty(asString)) {
                    appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_URL, asString);
                }
            }
        }
        return this;
    }

    public void clear() {
        this.mBuilder = new StringBuilder();
        this.mEndAppended = false;
        appendLine(VCardConstants.PROPERTY_BEGIN, VCARD_DATA_VCARD);
        if (VCardConfig.isVersion40(this.mVCardType)) {
            appendLine(VCardConstants.PROPERTY_VERSION, VCardConstants.VERSION_V40);
            return;
        }
        int i = this.mVCardType;
        if (VCardConfig.isVersion30(i)) {
            appendLine(VCardConstants.PROPERTY_VERSION, VCardConstants.VERSION_V30);
            return;
        }
        if (!VCardConfig.isVersion21(i)) {
            Log.w("vCard", "Unknown vCard version detected.");
        }
        appendLine(VCardConstants.PROPERTY_VERSION, VCardConstants.VERSION_V21);
    }

    public String toString() {
        if (!this.mEndAppended) {
            if (this.mIsDoCoMo) {
                appendLine(VCardConstants.PROPERTY_X_CLASS, VCARD_DATA_PUBLIC);
                appendLine(VCardConstants.PROPERTY_X_REDUCTION, "");
                appendLine(VCardConstants.PROPERTY_X_NO, "");
                appendLine(VCardConstants.PROPERTY_X_DCM_HMN_MODE, "");
            }
            appendLine(VCardConstants.PROPERTY_END, VCARD_DATA_VCARD);
            this.mEndAppended = true;
        }
        return this.mBuilder.toString();
    }

    public VCardBuilder(int i, String str) {
        String concat;
        this.mVCardType = i;
        if (VCardConfig.isVersion40(i)) {
            Log.w("vCard", "Should not use vCard 4.0 when building vCard. It is not officially published yet.");
        }
        this.mIsV30OrV40 = VCardConfig.isVersion30(i) || VCardConfig.isVersion40(i);
        this.mShouldUseQuotedPrintable = VCardConfig.shouldUseQuotedPrintable(i);
        this.mIsDoCoMo = VCardConfig.isDoCoMo(i);
        this.mIsJapaneseMobilePhone = VCardConfig.needsToConvertPhoneticString(i);
        this.mOnlyOneNoteFieldIsAvailable = VCardConfig.onlyOneNoteFieldIsAvailable(i);
        this.mUsesAndroidProperty = VCardConfig.usesAndroidSpecificProperty(i);
        this.mUsesDefactProperty = VCardConfig.usesDefactProperty(i);
        this.mRefrainsQPToNameProperties = VCardConfig.shouldRefrainQPToNameProperties(i);
        this.mAppendTypeParamName = VCardConfig.appendTypeParamName(i);
        this.mNeedsToConvertPhoneticString = VCardConfig.needsToConvertPhoneticString(i);
        this.mShouldAppendCharsetParam = (VCardConfig.isVersion30(i) && albo.ar("UTF-8", str)) ? false : true;
        if (VCardConfig.isDoCoMo(i)) {
            if (!albo.ar(SHIFT_JIS, str) && TextUtils.isEmpty(str)) {
                this.mCharset = SHIFT_JIS;
            } else {
                this.mCharset = str;
            }
            this.mVCardCharsetParameter = "CHARSET=SHIFT_JIS";
        } else {
            if (TextUtils.isEmpty(str)) {
                Log.i("vCard", "Use the charset \"UTF-8\" for export.");
                this.mCharset = "UTF-8";
                concat = "CHARSET=UTF-8";
            } else {
                this.mCharset = str;
                concat = "CHARSET=".concat(String.valueOf(str));
            }
            this.mVCardCharsetParameter = concat;
        }
        clear();
    }

    private void appendTypeParameter(StringBuilder sb, String str) {
        if (VCardConfig.isVersion40(this.mVCardType) || ((VCardConfig.isVersion30(this.mVCardType) || this.mAppendTypeParamName) && !this.mIsDoCoMo)) {
            sb.append("TYPE=");
        }
        sb.append(str);
    }

    public void appendLine(String str, String str2, boolean z, boolean z2) {
        appendLine(str, (List<String>) null, str2, z, z2);
    }

    public void appendLineWithCharsetAndQPDetection(String str, List<String> list) {
        appendLineWithCharsetAndQPDetection(str, (List<String>) null, list);
    }

    public void appendLine(String str, List<String> list) {
        appendLine(str, list, false, false);
    }

    public void appendLineWithCharsetAndQPDetection(String str, List<String> list, String str2) {
        appendLine(str, list, str2, !VCardUtils.containsOnlyPrintableAscii(str2), this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(str2));
    }

    public void appendLine(String str, List<String> list, String str2) {
        appendLine(str, list, str2, false, false);
    }

    public void appendLine(String str, List<String> list, String str2, boolean z, boolean z2) {
        String escapeCharacters;
        this.mBuilder.append(str);
        if (list != null && !list.isEmpty()) {
            this.mBuilder.append(";");
            appendTypeParameters(list);
        }
        if (z) {
            this.mBuilder.append(";");
            this.mBuilder.append(this.mVCardCharsetParameter);
        }
        if (z2) {
            this.mBuilder.append(";");
            this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
            escapeCharacters = encodeQuotedPrintable(str2);
        } else {
            escapeCharacters = escapeCharacters(str2);
        }
        this.mBuilder.append(VCARD_DATA_SEPARATOR);
        this.mBuilder.append(escapeCharacters);
        this.mBuilder.append(VCARD_END_OF_LINE);
    }

    public void appendLineWithCharsetAndQPDetection(String str, List<String> list, List<String> list2) {
        appendLine(str, list, list2, this.mShouldAppendCharsetParam && !VCardUtils.containsOnlyNonCrLfPrintableAscii(list2), this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(list2));
    }

    public void appendLine(String str, List<String> list, List<String> list2, boolean z, boolean z2) {
        String escapeCharacters;
        this.mBuilder.append(str);
        if (list != null && !list.isEmpty()) {
            this.mBuilder.append(";");
            appendTypeParameters(list);
        }
        if (z) {
            this.mBuilder.append(";");
            this.mBuilder.append(this.mVCardCharsetParameter);
        }
        if (z2) {
            this.mBuilder.append(";");
            this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
        }
        this.mBuilder.append(VCARD_DATA_SEPARATOR);
        boolean z3 = true;
        for (String str2 : list2) {
            if (z2) {
                escapeCharacters = encodeQuotedPrintable(str2);
            } else {
                escapeCharacters = escapeCharacters(str2);
            }
            if (!z3) {
                this.mBuilder.append(";");
            }
            this.mBuilder.append(escapeCharacters);
            z3 = false;
        }
        this.mBuilder.append(VCARD_END_OF_LINE);
    }

    public void appendLine(String str, List<String> list, boolean z, boolean z2) {
        appendLine(str, (List<String>) null, list, z, z2);
    }
}
