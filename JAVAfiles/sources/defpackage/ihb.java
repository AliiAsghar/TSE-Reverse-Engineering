package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihb {
    public Runnable a;
    public ParticipantsTable.BindData b;
    public ihc c;
    public ihd d;
    public int e;
    public int f;
    private ihe g;
    private ConversationIdType h;
    private int i;
    private byte j;
    private int k;

    public final ihg a() {
        ihe iheVar;
        int i;
        Runnable runnable;
        ConversationIdType conversationIdType;
        int i2;
        int i3;
        ihc ihcVar;
        ihd ihdVar;
        if (this.j == 1 && (iheVar = this.g) != null && (i = this.e) != 0 && (runnable = this.a) != null && (conversationIdType = this.h) != null && (i2 = this.k) != 0 && (i3 = this.f) != 0 && (ihcVar = this.c) != null && (ihdVar = this.d) != null) {
            ihg ihgVar = new ihg(iheVar, i, runnable, conversationIdType, this.b, i2, i3, ihcVar, ihdVar, this.i);
            if (ihgVar.f.b() == 2) {
                return ihgVar;
            }
            d.s(!ihgVar.c.b());
            ParticipantsTable.BindData bindData = ihgVar.d;
            bindData.getClass();
            d.s(true ^ TextUtils.isEmpty(bindData.O()));
            return ihgVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == null) {
            sb.append(" dialogType");
        }
        if (this.e == 0) {
            sb.append(" dialogDoneBehavior");
        }
        if (this.a == null) {
            sb.append(" onPositiveAction");
        }
        if (this.h == null) {
            sb.append(" conversationId");
        }
        if (this.k == 0) {
            sb.append(" scope");
        }
        if (this.f == 0) {
            sb.append(" entryPoint");
        }
        if (this.c == null) {
            sb.append(" dialogLoggingSource");
        }
        if (this.d == null) {
            sb.append(" dialogTarget");
        }
        if (this.j == 0) {
            sb.append(" anchorViewId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.i = i;
        this.j = (byte) 1;
    }

    public final void c(ConversationIdType conversationIdType) {
        if (conversationIdType != null) {
            this.h = conversationIdType;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    public final void d(ihe iheVar) {
        if (iheVar != null) {
            this.g = iheVar;
            return;
        }
        throw new NullPointerException("Null dialogType");
    }

    public final void e() {
        this.k = 3;
    }
}
