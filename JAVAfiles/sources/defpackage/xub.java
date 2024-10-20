package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xub implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ xub(List list, List list2, uj ujVar, xae xaeVar, int i) {
        this.e = i;
        this.c = list;
        this.b = list2;
        this.d = ujVar;
        this.a = xaeVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        if (this.e != 0) {
            Object obj2 = this.a;
            Object obj3 = this.d;
            ?? r2 = this.b;
            xiu.j(this.c, r2, (uj) obj3, (wyb) obj, (xae) obj2);
            return;
        }
        gpx gpxVar = (gpx) obj;
        Optional optional = (Optional) this.b;
        boolean z = ((xua) optional.get()).c;
        Object obj4 = this.c;
        Object obj5 = this.d;
        if (z) {
            ConversationIdType conversationIdType = (ConversationIdType) obj5;
            gpx.w(((ContactIconView) obj4).getContext(), conversationIdType, ((xuc) this.a).a);
        } else {
            gpxVar.v(((ContactIconView) obj4).getContext(), (ConversationIdType) obj5, false, ((xua) optional.get()).b, false, false, 0, 0);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        if (this.e != 0) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ xub(xuc xucVar, Optional optional, ContactIconView contactIconView, ConversationIdType conversationIdType, int i) {
        this.e = i;
        this.a = xucVar;
        this.b = optional;
        this.c = contactIconView;
        this.d = conversationIdType;
    }
}
