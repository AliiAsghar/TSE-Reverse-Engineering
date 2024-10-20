package defpackage;

import android.os.Bundle;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acts {
    public static final /* synthetic */ int a = 0;
    private static final acyz b = aczd.a(166335292);
    private final acqy c;

    public acts(acqy acqyVar) {
        this.c = acqyVar;
    }

    public final Bundle a(actr actrVar) {
        String str = (String) actrVar.k.orElse(null);
        Long l = (Long) actrVar.i.orElse(-1L);
        long longValue = l.longValue();
        Bundle bundle = new Bundle();
        bundle.putLong("rcs.intent.extra.sessionid", longValue);
        bundle.putString(RcsIntents.EXTRA_FILENAME, str);
        long j = actrVar.b;
        bundle.putLong(RcsIntents.EXTRA_SIZE, j);
        bundle.putLong(RcsIntents.EXTRA_PROGRESS, 0L);
        String str2 = actrVar.c;
        bundle.putString("rcs.intent.extra.contentType", str2);
        Optional optional = actrVar.e;
        if (optional.isPresent()) {
            bundle.putString(RcsIntents.EXTRA_USER_ID, (String) optional.get());
            acqv h = this.c.h((String) optional.get());
            if (!Objects.isNull(h)) {
                bundle.putString(RcsIntents.EXTRA_PHONE_NUMBER, h.a);
                bundle.putLong(RcsIntents.EXTRA_CONTACT_ID, h.b);
                bundle.putBoolean(RcsIntents.EXTRA_IS_BLOCKED_USER, false);
            }
        }
        int i = 5;
        advr.c("FileTransferUtil.createCommonFileTransferExtras. EXTRA_USER_ID : %s EXTRA_SESSION_ID : %d EXTRA_FILENAME : %s EXTRA_SIZE : %d EXTRA_CONTENT_TYPE : %s", advq.USER_ID.c(optional), l, advq.FILE.c(str), Long.valueOf(j), str2);
        Optional optional2 = actrVar.m;
        optional2.ifPresent(new acsa(bundle, 3));
        Optional optional3 = actrVar.n;
        optional3.ifPresent(new acsa(bundle, 4));
        advr.c("FileTransferUtil.createCommonFileTransferExtras. EXTRA_PREVIEW_CONTENT_TYPE : %s, has EXTRA_PREVIEW_DATA: %b", optional2, Boolean.valueOf(optional3.isPresent()));
        Long l2 = (Long) actrVar.j.orElse(-1L);
        if (l2.longValue() > 0) {
            bundle.putLong(RcsIntents.EXTRA_ASSOCIATED_SESSION_ID, l2.longValue());
            bundle.putBoolean(RcsIntents.EXTRA_IS_CONFERENCE, true);
            advr.c("FileTransferUtil.createCommonFileTransferExtras. EXTRA_ASSOCIATED_SESSION_ID : %d EXTRA_IS_CONFERENCE : true", l2);
        }
        actrVar.l.ifPresent(new acsa(bundle, i));
        String str3 = actrVar.a;
        String str4 = (String) actrVar.f.orElse(null);
        rve.h(bundle, RcsIntents.EXTRA_MESSAGE_ID, rve.a(str3));
        bundle.putString(RcsIntents.EXTRA_REMOTE_INSTANCE, str4);
        if (((Boolean) b.a()).booleanValue()) {
            bundle.putString(RcsIntents.EXTRA_FALLBACK_URL, (String) actrVar.g.orElse(actrVar.d));
        } else {
            bundle.putString(RcsIntents.EXTRA_FALLBACK_URL, actrVar.d);
        }
        actrVar.h.ifPresent(new acsa(bundle, 6));
        actrVar.o.ifPresent(new acsa(bundle, 7));
        advr.c("FileTransferUtil.createFileTransferExtras.EXTRA_MESSAGE_ID : %s EXTRA_REMOTE_INSTANCE : %s", str3, str4);
        return bundle;
    }
}
