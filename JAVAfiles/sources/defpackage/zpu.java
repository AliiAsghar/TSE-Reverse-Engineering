package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpu extends xug {
    private static final alvi i = alvi.m("com/google/android/apps/messaging/ui/common/CursorRecyclerAdapter");
    protected final Context f;
    public final armf g;
    public final aain h;
    private final armf j;

    public zpu(armf armfVar, armf armfVar2, ahmn ahmnVar, Context context, aain aainVar) {
        super(ahmnVar);
        this.f = context;
        this.g = armfVar;
        this.j = armfVar2;
        this.h = aainVar;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i2) {
        VCardAttachmentView vCardAttachmentView = (VCardAttachmentView) LayoutInflater.from(this.f).inflate(R.layout.people_list_item_view_m2, viewGroup, false);
        aaij aaijVar = new aaij(this, vCardAttachmentView);
        vCardAttachmentView.j(aaijVar);
        return aaijVar;
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i2) {
        int i3 = alog.d;
        z(ooVar, i2, alsx.a);
    }

    @Override // defpackage.no
    public final long gI(int i2) {
        sar sarVar;
        saf safVar;
        if (((okf) this.j.b()).a()) {
            if (this.c && (safVar = this.e) != null && !safVar.isClosed() && this.e.moveToPosition(i2)) {
                return this.e.c().a;
            }
            return 0L;
        }
        if (this.c && (sarVar = this.d) != null && !sarVar.isClosed() && this.d.moveToPosition(i2)) {
            return this.d.c().a;
        }
        return 0L;
    }

    public final /* bridge */ /* synthetic */ void m(oo ooVar, Cursor cursor) {
        aaij aaijVar = (aaij) ooVar;
        if (((okf) this.j.b()).a()) {
            aaijVar.s.U((saf) cursor);
            ((VCardAttachmentView) aaijVar.a).h(aaijVar.t);
        } else {
            aaijVar.s.V((sar) cursor);
            ((VCardAttachmentView) aaijVar.a).h(aaijVar.t);
        }
    }

    @Override // defpackage.no
    public final void z(oo ooVar, int i2, List list) {
        sar sarVar;
        saf safVar;
        if (ody.a()) {
            if (this.c && (safVar = this.e) != null) {
                if (safVar.moveToPosition(i2)) {
                    m(ooVar, this.e);
                    return;
                }
                throw new IllegalStateException(a.bV(i2, "couldn't move cursor to position "));
            }
            alvw i3 = i.i();
            i3.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/ui/common/CursorRecyclerAdapter", "onBindViewHolder", 57, "CursorRecyclerAdapter.java")).q("Cursor is not available when binding the view");
            return;
        }
        if (this.c && (sarVar = this.d) != null) {
            if (sarVar.moveToPosition(i2)) {
                m(ooVar, this.d);
                return;
            }
            throw new IllegalStateException(a.bV(i2, "couldn't move cursor to position "));
        }
        alvw i4 = i.i();
        i4.X(alwp.a, "Bugle");
        ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/ui/common/CursorRecyclerAdapter", "onBindViewHolder", 73, "CursorRecyclerAdapter.java")).q("Cursor is not available when binding the view");
    }
}
