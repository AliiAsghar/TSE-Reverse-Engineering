package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xes {
    private static final alwo a = alwo.o("BugleTachygram");

    public static Iterable a(anjf anjfVar) {
        alob alobVar = new alob();
        int ordinal = anjfVar.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                alobVar.h(qes.SUBJECT_UPDATE);
            }
        } else {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupFeaturesConverter", "convert", 29, "TachygramGroupFeaturesConverter.java")).q("getGroupInfo() tachygram group has unknown renaming policy.");
        }
        int ordinal2 = anjfVar.a.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    alobVar.h(qes.REMOVE_PARTICIPANT_BY_ADMIN);
                }
            } else {
                alobVar.h(qes.REMOVE_PARTICIPANT_BY_ALL);
            }
        } else {
            ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupFeaturesConverter", "convert", 44, "TachygramGroupFeaturesConverter.java")).q("getGroupInfo() tachygram group has unknown removal policy.");
        }
        if (anfi.a("bugle.propagate_icon_modification_policy", "bugle")) {
            int ordinal3 = anjfVar.c.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 == 2) {
                    alobVar.h(qes.ICON_UPDATE);
                }
            } else {
                ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupFeaturesConverter", "convert", 58, "TachygramGroupFeaturesConverter.java")).q("getGroupInfo() tachygram group has unknown icon modification policy.");
            }
        }
        return alobVar.g();
    }
}
