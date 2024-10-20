package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbw {
    public static final /* synthetic */ int c = 0;
    private static final alwo d = alwo.o("BugleSyncManager");
    public final xnv a;
    public final aiwu b;

    public xbw(aiwu aiwuVar, xnv xnvVar) {
        this.b = aiwuVar;
        this.a = xnvVar;
    }

    public static Optional c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Optional.of(UUID.fromString(str));
            } catch (IllegalArgumentException e) {
                ((alwl) ((alwl) ((alwl) d.i()).g(e)).h("com/google/android/apps/messaging/shared/sms/datastore/SyncManagerDataStore", "uuidFromString", 109, "SyncManagerDataStore.java")).t("Failed to parse Current Sync Id: [%s]", str);
            }
        }
        return Optional.empty();
    }

    public final akul a() {
        return akul.g(this.b.a()).h(new woc(17), andi.a);
    }

    public final akul b(long j) {
        return akul.g(this.b.b(new mdq(j, 15), andi.a));
    }
}
