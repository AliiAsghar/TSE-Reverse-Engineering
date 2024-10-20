package com.android.vcard;

import defpackage.alpt;
import defpackage.hjd;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardParser_V40 extends VCardParser {
    public static final Set<String> sKnownPropertyNameSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(VCardConstants.PROPERTY_BEGIN, VCardConstants.PROPERTY_END, VCardConstants.PROPERTY_VERSION, VCardConstants.PROPERTY_SOURCE, "KIND", VCardConstants.PROPERTY_XML, VCardConstants.PROPERTY_FN, VCardConstants.PROPERTY_N, VCardConstants.PROPERTY_NICKNAME, VCardConstants.PROPERTY_PHOTO, VCardConstants.PROPERTY_BDAY, VCardConstants.PROPERTY_ANNIVERSARY, VCardConstants.PROPERTY_GENDER, VCardConstants.PROPERTY_ADR, VCardConstants.PROPERTY_TEL, VCardConstants.PROPERTY_EMAIL, VCardConstants.PROPERTY_IMPP, "LANG", VCardConstants.PROPERTY_TZ, VCardConstants.PROPERTY_GEO, VCardConstants.PROPERTY_TITLE, VCardConstants.PROPERTY_ROLE, VCardConstants.PROPERTY_LOGO, VCardConstants.PROPERTY_ORG, VCardConstants.PROPERTY_MEMBER, VCardConstants.PROPERTY_RELATED, VCardConstants.PROPERTY_CATEGORIES, VCardConstants.PROPERTY_NOTE, VCardConstants.PROPERTY_PRODID, VCardConstants.PROPERTY_REV, VCardConstants.PROPERTY_SOUND, VCardConstants.PROPERTY_UID, VCardConstants.PROPERTY_CLIENTPIDMAP, VCardConstants.PROPERTY_URL, VCardConstants.PROPERTY_VERSION, VCardConstants.PROPERTY_KEY, VCardConstants.PROPERTY_FBURL, "CALENDRURI", VCardConstants.PROPERTY_CALURI)));
    public static final Set<String> valueListParameters = alpt.s("PID", VCardConstants.PARAM_TYPE, VCardConstants.PARAM_SORT_AS);
    private final hjd mVCardParserImpl;

    public VCardParser_V40() {
        this.mVCardParserImpl = new hjd();
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

    public VCardParser_V40(int i) {
        this.mVCardParserImpl = new hjd(null);
    }
}
