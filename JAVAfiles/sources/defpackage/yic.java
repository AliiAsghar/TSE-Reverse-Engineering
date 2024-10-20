package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yic {
    public static final utz a;
    public static final utz b;
    public static final utz c;
    public static final utz d;
    public static final utz e;
    public static final utz f;
    public static final utz g;
    public static final utz h;

    static {
        uuh.c(uuh.b, "text_classifier_entity_confidence_threshold", 0.0d);
        a = uuh.i(uuh.b, "enable_miniature_contact_message_annotations", false);
        b = uuh.i(uuh.b, "enable_text_classifier_webref_message_annotations", false);
        c = uuh.i(uuh.b, "enable_text_classifier_address_message_annotations", false);
        d = uuh.i(uuh.b, "enable_text_classifier_contact_message_annotations", false);
        uuh.i(uuh.b, "enable_text_classifier_datetime_message_annotations", false);
        e = uuh.i(uuh.b, "enable_text_classifier_map_link_message_annotations", false);
        f = uuh.i(uuh.b, "enable_text_classifier_email_message_annotations", false);
        g = uuh.i(uuh.b, "enable_text_classifier_phone_message_annotations", false);
        h = uuh.i(uuh.b, "enable_regex_message_annotations", false);
        uuh.w("enable_annotations_in_example_store");
        uuh.w("enable_prefix_map_link_annotations_regex");
        uuh.h(uuh.b, "map_link_annotation_regex_example_store", "(http(s?)://)?((maps\\.google\\.(\\w)+/)|(maps\\.app.goo.gl/)|((www\\.)?google\\.(\\w)+/maps[/?])|(goo.gl/maps/)).*");
    }
}
