package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aiff {
    DELIVERED("delivered", "positive-delivery"),
    DELIVERY_FAILED("failed", "negative-delivery"),
    DELIVERY_FORBIDDEN("forbidden", "negative-delivery"),
    DELIVERY_ERROR("error", "negative-delivery"),
    DISPLAYED("displayed", "display"),
    DISPLAY_ERROR("error", "display"),
    DISPLAY_FORBIDDEN("forbidden", "display"),
    PROCESSED("processed", "processing"),
    STORED("stored", "processing"),
    PROCESSING_ERROR("error", "processing"),
    PROCESSING_FORBIDDEN("forbidden", "processing"),
    INTERWORKING_SMS("legacy-sms", "interworking"),
    INTERWORKING_MMS("legacy-mms", "interworking"),
    INTERWORKING_ERROR("error", "interworking");

    public final String o;
    public final String p;

    aiff(String str, String str2) {
        this.o = str;
        this.p = str2;
    }
}
