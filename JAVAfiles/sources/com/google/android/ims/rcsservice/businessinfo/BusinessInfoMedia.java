package com.google.android.ims.rcsservice.businessinfo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BusinessInfoMedia {
    public static final Integer[] ALL_MEDIA_TYPES = {0, 1, 2};
    public static final int MEDIA_TYPE_HERO_IMAGE = 1;
    public static final int MEDIA_TYPE_LOGO_IMAGE = 0;
    public static final int MEDIA_TYPE_VERIFIER_LOGO_IMAGE = 2;

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MediaType {
    }
}
