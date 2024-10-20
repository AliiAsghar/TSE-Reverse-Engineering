package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xuc extends xzs {
    public final String a;
    public ContactIconView b;
    private final mho c;
    private final armf k;
    private final armf l;
    private final armf m;
    private final Optional n;
    private final amho o;

    public xuc(mho mhoVar, armf armfVar, armf armfVar2, armf armfVar3, Optional optional, String str, ContactIconView contactIconView, amho amhoVar) {
        super("Bugle.Async.ContactIconView.onClick.Duration", null);
        this.c = mhoVar;
        this.k = armfVar;
        this.l = armfVar2;
        this.m = armfVar3;
        this.n = optional;
        this.a = str;
        this.b = contactIconView;
        this.o = amhoVar;
    }

    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        int a;
        Optional of;
        Optional empty;
        if (((rxq) this.m.b()).b(this.a) == null) {
            of = Optional.empty();
        } else {
            Object obj = this.o;
            amho amhoVar = amho.UNKNOWN_BIZINFO_EVENT_SOURCE;
            if (amhoVar == obj || (amhoVar != null && obj != null && amhoVar.equals(obj))) {
                xyl.o(a.ct(obj, amhoVar, "Expected anything but ", " but got "));
            }
            this.c.aN(2, this.o, this.a);
            ConversationIdType k = ((uie) this.l.b()).k(this.a);
            if (k.b()) {
                a = 0;
            } else {
                a = ((rtz) this.k.b()).a(k);
            }
            of = Optional.of(new xua(k, a, true));
        }
        if (!of.isPresent()) {
            ParticipantsTable.BindData c = ((rxq) this.m.b()).c(this.a);
            if (c != null && c.A().a()) {
                empty = Optional.of(new xua(((uie) this.l.b()).k(this.a), 0, false));
            } else {
                empty = Optional.empty();
            }
            if (!empty.isPresent()) {
                return Optional.empty();
            }
            return empty;
        }
        return of;
    }

    @Override // defpackage.xzs
    public final /* synthetic */ void d(Object obj) {
        Optional optional = (Optional) obj;
        ContactIconView contactIconView = this.b;
        if (contactIconView != null) {
            if (optional.isEmpty()) {
                if (contactIconView.isAttachedToWindow()) {
                    contactIconView.k();
                    return;
                }
                return;
            }
            ConversationIdType conversationIdType = ((xua) optional.get()).a;
            if (conversationIdType.b()) {
                alvw i = ContactIconView.h.i();
                i.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/ui/ContactIconView$OpenConversationSettingsTask", "doPostExecute", 409, "ContactIconView.java")).q("Can't launch Info & Options page. RBM bot conversation ID is empty");
            } else if (contactIconView.isAttachedToWindow()) {
                this.n.ifPresent(new xub(this, optional, contactIconView, conversationIdType, 0));
            }
        }
    }
}
