package com.android.vcard;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class VCardParser_V21 extends VCardParser {
    private final VCardParserImpl_V21 mVCardParserImpl;
    static final Set<String> sKnownPropertyNameSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(VCardConstants.PROPERTY_BEGIN, VCardConstants.PROPERTY_END, VCardConstants.PROPERTY_LOGO, VCardConstants.PROPERTY_PHOTO, VCardConstants.PROPERTY_LABEL, VCardConstants.PROPERTY_FN, VCardConstants.PROPERTY_TITLE, VCardConstants.PROPERTY_SOUND, VCardConstants.PROPERTY_VERSION, VCardConstants.PROPERTY_TEL, VCardConstants.PROPERTY_EMAIL, VCardConstants.PROPERTY_TZ, VCardConstants.PROPERTY_GEO, VCardConstants.PROPERTY_NOTE, VCardConstants.PROPERTY_URL, VCardConstants.PROPERTY_BDAY, VCardConstants.PROPERTY_ROLE, VCardConstants.PROPERTY_REV, VCardConstants.PROPERTY_UID, VCardConstants.PROPERTY_KEY, VCardConstants.PROPERTY_MAILER)));
    static final Set<String> sKnownTypeSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(VCardConstants.PARAM_ADR_TYPE_DOM, VCardConstants.PARAM_ADR_TYPE_INTL, "POSTAL", VCardConstants.PARAM_ADR_TYPE_PARCEL, VCardConstants.PARAM_TYPE_HOME, VCardConstants.PARAM_TYPE_WORK, "PREF", VCardConstants.PARAM_TYPE_VOICE, VCardConstants.PARAM_TYPE_FAX, VCardConstants.PARAM_TYPE_MSG, VCardConstants.PARAM_TYPE_CELL, VCardConstants.PARAM_TYPE_PAGER, VCardConstants.PARAM_TYPE_BBS, VCardConstants.PARAM_TYPE_MODEM, VCardConstants.PARAM_TYPE_CAR, VCardConstants.PARAM_TYPE_ISDN, VCardConstants.PARAM_TYPE_VIDEO, "AOL", "APPLELINK", "ATTMAIL", "CIS", "EWORLD", VCardConstants.PARAM_TYPE_INTERNET, "IBMMAIL", "MCIMAIL", "POWERSHARE", "PRODIGY", VCardConstants.PARAM_TYPE_TLX, "X400", "GIF", "CGM", "WMF", "BMP", "MET", "PMB", "DIB", "PICT", "TIFF", "PDF", "PS", "JPEG", "QTIME", "MPEG", "MPEG2", "AVI", "WAVE", "AIFF", "PCM", "X509", "PGP")));
    static final Set<String> sKnownValueSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("INLINE", VCardConstants.PROPERTY_URL, "CONTENT-ID", "CID")));
    static final Set<String> sAvailableEncoding = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(VCardConstants.PARAM_ENCODING_7BIT, VCardConstants.PARAM_ENCODING_8BIT, VCardConstants.PARAM_ENCODING_QP, VCardConstants.PARAM_ENCODING_BASE64, VCardConstants.PARAM_ENCODING_B)));

    public VCardParser_V21() {
        this.mVCardParserImpl = new VCardParserImpl_V21();
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

    public VCardParser_V21(int i) {
        this.mVCardParserImpl = new VCardParserImpl_V21(null);
    }
}
