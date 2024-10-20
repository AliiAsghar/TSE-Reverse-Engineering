package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukz implements uld {
    private static final alwo a = alwo.o("BugleCms");
    private final ulc b;

    public ukz(ulc ulcVar) {
        this.b = ulcVar;
    }

    @Override // defpackage.uld
    public final List a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.b.a(3, 1, umx.b(17)).a());
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantTriggers", "getCreateTriggersSqls", 37, "CmsParticipantTriggers.java")).q("Creating trigger SQL for delete participants");
        rzy c = this.b.c(3, 3, umx.b(9), true);
        c.h = "cms_id";
        arrayList.add(c.a());
        rzy a2 = this.b.a(3, 2, umx.b(5));
        a2.c = alzz.ap("sub_id", "normalized_destination", "profile_photo_blob_id", "profile_photo_encryption_key", "send_destination", "full_name", "first_name", "profile_photo_uri", "lookup_key", "extended_color", "blocked", "participant_type", "is_spam", "is_spam_source");
        arrayList.add(a2.a());
        return arrayList;
    }
}
