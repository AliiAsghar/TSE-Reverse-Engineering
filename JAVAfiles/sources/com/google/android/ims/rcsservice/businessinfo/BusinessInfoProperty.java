package com.google.android.ims.rcsservice.businessinfo;

import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BusinessInfoProperty implements Parcelable {
    public static final int IMPORTANCE_OPTIONAL = 1;
    public static final int IMPORTANCE_PRIMARY = 0;
    public static final int PROPERTY_TYPE_EMAIL = 0;
    public static final int PROPERTY_TYPE_PHONE_NUMBER = 2;
    public static final int PROPERTY_TYPE_PRIVACY_POLICY_URL = 5;
    public static final int PROPERTY_TYPE_SMS_NUMBER = 1;
    public static final int PROPERTY_TYPE_TERMS_AND_CONDITIONS_URL = 4;
    public static final int PROPERTY_TYPE_WEBSITE = 3;
    public static final int PROPERTY_TYPE_X_GOOGLE_SHORT_CODE = 6;

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Importance {
    }

    /* compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PropertyType {
    }

    public static BusinessInfoProperty create(int i, String str, String str2, String str3, int i2) {
        return new AutoValue_BusinessInfoProperty(i, str, str2, str3, i2);
    }

    public abstract String getHeader();

    public abstract int getImportance();

    public abstract int getPropertyType();

    public abstract String getSubHeader();

    public abstract String getValue();
}
