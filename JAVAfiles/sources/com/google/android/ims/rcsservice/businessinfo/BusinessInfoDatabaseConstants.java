package com.google.android.ims.rcsservice.businessinfo;

import android.provider.BaseColumns;
import defpackage.alob;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BusinessInfoDatabaseConstants {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static final class BusinessInfoAndVerifierInfoViewConstants {
        public static final String[] DEFAULT_PROJECTION;
        public static final String VIEW_NAME = "business_info_and_verifier_info";

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static final class Columns {
            public static final String VERIFIER_DESCRIPTION = "verifier_description";
            public static final String VERIFIER_LOGO_IMAGE_LOCAL_URI = "verifier_logo_image_local_uri";
            public static final String VERIFIER_LOGO_IMAGE_REMOTE_URL = "verifier_logo_image_remote_url";
            public static final String VERIFIER_NAME = "verifier_name";

            private Columns() {
            }
        }

        static {
            alob alobVar = new alob();
            alobVar.j(Arrays.asList(BusinessInfoTableConstants.PROJECTION_WITHOUT_ID));
            alobVar.i(Columns.VERIFIER_NAME, Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL, Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI);
            DEFAULT_PROJECTION = (String[]) alobVar.g().toArray(new String[0]);
        }

        private BusinessInfoAndVerifierInfoViewConstants() {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static final class BusinessInfoMetadataTableConstants {
        public static final String[] DEFAULT_PROJECTION = {"_id", "rbm_bot_id", Columns.VERSION, Columns.EXPIRY_MILLISECONDS};
        public static final String TABLE_NAME = "business_info_metadata";

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static final class Columns implements BaseColumns {
            public static final String EXPIRY_MILLISECONDS = "expiry_milliseconds";
            public static final String RBM_BOT_ID = "rbm_bot_id";
            public static final String VERSION = "version";
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static final class BusinessInfoPropertiesTableConstants {
        public static final String[] DEFAULT_PROJECTION = {"_id", "rbm_bot_id", Columns.TYPE, Columns.HEADER, Columns.SUBHEADER, Columns.VALUE, Columns.IMPORTANCE};
        public static final String TABLE_NAME = "business_info_properties";

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static final class Columns implements BaseColumns {
            public static final String HEADER = "header";
            public static final String IMPORTANCE = "importance";
            public static final String RBM_BOT_ID = "rbm_bot_id";
            public static final String SUBHEADER = "subheader";
            public static final String TYPE = "type";
            public static final String VALUE = "value";
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static final class BusinessInfoTableConstants {
        public static final String[] DEFAULT_PROJECTION;
        public static final String[] PROJECTION_WITHOUT_ID;
        public static final String TABLE_NAME = "business_info";

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static final class Columns implements BaseColumns {
            public static final String COLOR = "color";
            public static final String DESCRIPTION = "description";
            public static final String HERO_IMAGE_LOCAL_URI = "hero_image_local_uri";
            public static final String HERO_IMAGE_REMOTE_URL = "hero_image_remote_url";
            public static final String LOGO_IMAGE_LOCAL_URI = "logo_image_local_uri";
            public static final String LOGO_IMAGE_REMOTE_URL = "logo_image_remote_url";
            public static final String NAME = "name";
            public static final String RBM_BOT_ID = "rbm_bot_id";
            public static final String VERIFICATION_STATUS = "verification_status";
            public static final String VERIFIER_ID = "verifier_id";
        }

        static {
            String[] strArr = {"rbm_bot_id", "name", "logo_image_remote_url", "logo_image_local_uri", "description", Columns.COLOR, Columns.VERIFICATION_STATUS, Columns.HERO_IMAGE_REMOTE_URL, Columns.HERO_IMAGE_LOCAL_URI, "verifier_id"};
            PROJECTION_WITHOUT_ID = strArr;
            alob alobVar = new alob();
            alobVar.h("_id");
            alobVar.j(Arrays.asList(strArr));
            DEFAULT_PROJECTION = (String[]) alobVar.g().toArray(new String[0]);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static final class BusinessVerifierInfoTableConstants {
        public static final String[] DEFAULT_PROJECTION = {"verifier_id", "name", "logo_image_remote_url", "logo_image_local_uri"};
        public static final String TABLE_NAME = "business_verifier_info";

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static final class Columns implements BaseColumns {
            public static final String DESCRIPTION = "description";
            public static final String LOGO_IMAGE_LOCAL_URI = "logo_image_local_uri";
            public static final String LOGO_IMAGE_REMOTE_URL = "logo_image_remote_url";
            public static final String NAME = "name";
            public static final String VERIFIER_ID = "verifier_id";
        }
    }
}
