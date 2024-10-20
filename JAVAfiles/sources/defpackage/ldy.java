package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldy implements mag {
    public static final uuf a = uuh.i(uuh.b, "disable_logging_linkify", false);
    public static final xze b = xze.g("BugleAnnotation", "LinkifyLogging");
    public final mho c;
    public final mbl d;
    public final Optional e;
    public final armf f;
    public final armf g;
    public final anen h;
    private final anen i;
    private final lpg j;

    public ldy(mho mhoVar, mbl mblVar, Optional optional, armf armfVar, armf armfVar2, lpg lpgVar, anen anenVar, anen anenVar2) {
        this.c = mhoVar;
        this.d = mblVar;
        this.e = optional;
        this.f = armfVar;
        this.g = armfVar2;
        this.j = lpgVar;
        this.i = anenVar;
        this.h = anenVar2;
    }

    @Override // defpackage.mag
    public final void a(MessageCoreData messageCoreData, ParticipantsTable.BindData bindData) {
        if (bindData != null && !((Boolean) a.e()).booleanValue()) {
            this.j.h(new itl(this, messageCoreData, bindData, 4), "Bugle.Async.LinkPreviewUtils.logReceivedLinkAnnotation.Duration", this.i);
        }
    }

    @Override // defpackage.mag
    public final void b(MessageCoreData messageCoreData) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        if (this.e.isEmpty()) {
            b.l("Sent message is null, skip logging links.");
            return;
        }
        String am = messageCoreData.am();
        if (TextUtils.isEmpty(am)) {
            b.l("Sent message text is empty, skip logging links.");
        } else {
            albo.bR(((uza) this.e.get()).b(SpannableString.valueOf(am), null), qjc.a(new ydv(new ksn(this, messageCoreData, 4), new ldx(1), 0)), this.h);
        }
    }

    @Override // defpackage.mag
    public final void c(MessageIdType messageIdType, boolean z) {
        xyl.f(messageIdType.b());
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        this.j.h(new ldv(this, messageIdType, z, 0), "Bugle.Async.LinkifyLogging.logLinkClick.Duration", this.i);
    }
}
