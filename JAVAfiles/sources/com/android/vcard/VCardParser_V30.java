package com.android.vcard;

import defpackage.hjc;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardParser_V30 extends VCardParser {
    private final hjc mVCardParserImpl;
    public static final Set<String> sKnownPropertyNameSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(VCardConstants.PROPERTY_BEGIN, VCardConstants.PROPERTY_END, VCardConstants.PROPERTY_LOGO, VCardConstants.PROPERTY_PHOTO, VCardConstants.PROPERTY_LABEL, VCardConstants.PROPERTY_FN, VCardConstants.PROPERTY_TITLE, VCardConstants.PROPERTY_SOUND, VCardConstants.PROPERTY_VERSION, VCardConstants.PROPERTY_TEL, VCardConstants.PROPERTY_EMAIL, VCardConstants.PROPERTY_TZ, VCardConstants.PROPERTY_GEO, VCardConstants.PROPERTY_NOTE, VCardConstants.PROPERTY_URL, VCardConstants.PROPERTY_BDAY, VCardConstants.PROPERTY_ROLE, VCardConstants.PROPERTY_REV, VCardConstants.PROPERTY_UID, VCardConstants.PROPERTY_KEY, VCardConstants.PROPERTY_MAILER, VCardConstants.PROPERTY_NAME, "PROFILE", VCardConstants.PROPERTY_SOURCE, VCardConstants.PROPERTY_NICKNAME, "CLASS", VCardConstants.PROPERTY_SORT_STRING, VCardConstants.PROPERTY_CATEGORIES, VCardConstants.PROPERTY_PRODID, VCardConstants.PROPERTY_IMPP)));
    static final Set<String> sAcceptableEncoding = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(VCardConstants.PARAM_ENCODING_7BIT, VCardConstants.PARAM_ENCODING_8BIT, VCardConstants.PARAM_ENCODING_BASE64, VCardConstants.PARAM_ENCODING_B)));

    public VCardParser_V30() {
        this.mVCardParserImpl = new hjc();
    }

    @Override // com.android.vcard.VCardParser
    public void addInterpreter(VCardInterpreter vCardInterpreter) {
        this.mVCardParserImpl.i(vCardInterpreter);
    }

    @Override // com.android.vcard.VCardParser
    public void cancel() {
        this.mVCardParserImpl.j();
    }

    @Override // com.android.vcard.VCardParser
    public void parse(InputStream inputStream) {
        this.mVCardParserImpl.r(inputStream);
    }

    @Override // com.android.vcard.VCardParser
    public void parseOne(InputStream inputStream) {
        this.mVCardParserImpl.t(inputStream);
    }

    public VCardParser_V30(int i) {
        this.mVCardParserImpl = new hjc(null);
    }
}
