package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irr extends ire implements iyi {
    public final Context c;
    public hk d;
    public itm f;
    public boolean g;
    public Map h;
    public final iyh i;
    public final rae j;
    private final ahmn k;
    private final ifb l;

    public irr(xnv xnvVar, iyh iyhVar, ahmn ahmnVar, rae raeVar, Context context, aack aackVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, ifb ifbVar) {
        super(aackVar, onClickListener, onLongClickListener, xnvVar);
        this.g = true;
        this.h = altc.a;
        this.i = iyhVar;
        this.j = raeVar;
        this.c = context;
        this.k = ahmnVar;
        this.l = ifbVar;
    }

    private final void M(rry rryVar) {
        hk hkVar = this.d;
        hkVar.getClass();
        q(hkVar.c(rryVar));
    }

    public final int F(MessageIdType messageIdType) {
        itm itmVar = this.f;
        if (itmVar != null) {
            xyl.g();
            rry rryVar = (rry) itmVar.g.get(messageIdType);
            if (rryVar != null) {
                return itmVar.f.c(rryVar);
            }
            return -1;
        }
        return -1;
    }

    public final akul H(MessageIdType messageIdType) {
        itm itmVar = this.f;
        itmVar.getClass();
        return akul.g(itmVar.j(messageIdType));
    }

    @Override // defpackage.iyi
    public final void I(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            M((rry) it.next());
        }
    }

    @Override // defpackage.iyi
    public final void J(rry rryVar) {
        M(rryVar);
    }

    @Override // defpackage.iyi
    public final void K(rry rryVar) {
        if (this.i.a() == 1) {
            M(rryVar);
        } else {
            if (this.i.a() == 2) {
                Iterator it = this.i.b().iterator();
                while (it.hasNext()) {
                    M((rry) it.next());
                }
                return;
            }
            M(rryVar);
        }
    }

    @Override // defpackage.no
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void g(akhx akhxVar, int i) {
        long longValue;
        boolean z;
        aksa m = this.k.m("MessageListAdapter onBindViewHolder");
        try {
            aacv aacvVar = (aacv) akhxVar.s;
            hk hkVar = this.d;
            hkVar.getClass();
            rry rryVar = (rry) hkVar.d(i);
            rry rryVar2 = (rry) this.d.d(i);
            Long l = (Long) this.h.get(rryVar.u());
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            rryVar2.h = longValue;
            if (aacvVar instanceof aacl) {
                aacl aaclVar = (aacl) aacvVar;
                rry rryVar3 = (rry) this.d.d(i);
                boolean z2 = this.g;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                aaclVar.g(rryVar3, z2, z);
            }
            m.close();
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.no
    public final int b() {
        hk hkVar = this.d;
        hkVar.getClass();
        return hkVar.g;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.no
    public final long gI(int i) {
        hk hkVar = this.d;
        hkVar.getClass();
        rry rryVar = (rry) hkVar.d(i);
        if (rryVar.v().k()) {
            Long l = rryVar.u;
            if (l != null) {
                return l.longValue();
            }
            ifb ifbVar = this.l;
            Long l2 = (Long) ConcurrentMap.EL.computeIfAbsent(ifbVar.a, rryVar.v(), new ijs(ifbVar, 20));
            long longValue = l2.longValue();
            rryVar.u = l2;
            return longValue;
        }
        return rryVar.u().a;
    }

    @Override // defpackage.ire
    protected final int m(int i) {
        hk hkVar = this.d;
        hkVar.getClass();
        rry rryVar = (rry) hkVar.d(i);
        if (rryVar.aS()) {
            return R.layout.conversation_toolstone;
        }
        if (rryVar.aR()) {
            return R.layout.conversation_tombstone;
        }
        if (rryVar.aH()) {
            if (((Boolean) ((utz) aaem.a.get()).e()).booleanValue()) {
                return R.layout.conversation_rich_card_view2;
            }
            return R.layout.conversation_rich_card_view;
        }
        if (rryVar.aI()) {
            return R.layout.conversation_rich_card_carousel_view;
        }
        return R.layout.conversation_message_view;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void z(oo ooVar, int i, List list) {
        akhx akhxVar = (akhx) ooVar;
        aksa m = this.k.m("MessageListAdapter onBindViewHolder with payloads");
        try {
            if (list.isEmpty()) {
                g(akhxVar, i);
            } else {
                for (Object obj : list) {
                    aacv aacvVar = (aacv) akhxVar.s;
                    albo.U(aacvVar instanceof aacl, "MessageListAdapter.onBindViewHolder() called with FileTransferProgress payload with a view that isn't a ConversationMessageRowView.");
                    ((aacl) aacvVar).d(obj);
                }
            }
            m.close();
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
