package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tvs implements algk {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ tvs(tvt tvtVar, boolean z, altk altkVar, altk altkVar2, ConversationIdType conversationIdType, int i) {
        this.f = i;
        this.b = tvtVar;
        this.a = z;
        this.c = altkVar;
        this.d = altkVar2;
        this.e = conversationIdType;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                Object obj2 = this.d;
                Object obj3 = this.e;
                boolean z = this.a;
                Object obj4 = this.c;
                Object obj5 = this.b;
                return (Void) ((vxz) obj5).f.b(new muc(obj5, obj4, z, obj3, obj2, 3));
            }
            xyo a = tvt.a.a();
            a.H("Scytale session was established.");
            Object obj6 = this.d;
            Object obj7 = this.c;
            if (true == this.a) {
                obj6 = obj7;
            }
            a.M("destinations", obj6);
            a.q();
            tvt tvtVar = (tvt) this.b;
            iew iewVar = tvtVar.l;
            Object obj8 = this.e;
            if (iewVar.k()) {
                tvtVar.f((ConversationIdType) obj8, 1, uax.DEFAULT);
            } else {
                tvtVar.f((ConversationIdType) obj8, 0, uax.DOWNGRADE_FILE_UPLOAD_NOT_SUPPORTED);
            }
            return null;
        }
        aqwb aqwbVar = (aqwb) obj;
        xyo a2 = tvt.a.a();
        a2.H("Failed to establish Scytale session.");
        Object obj9 = this.d;
        Object obj10 = this.c;
        if (true == this.a) {
            obj9 = obj10;
        }
        a2.M("destinations", obj9);
        a2.r(aqwbVar);
        Object obj11 = this.e;
        ((tvt) this.b).f((ConversationIdType) obj11, 0, uax.DOWNGRADE_FAILED_TO_SETUP_SCYTALE);
        return null;
    }

    public /* synthetic */ tvs(vxz vxzVar, ChatSessionMessageEvent chatSessionMessageEvent, boolean z, rve rveVar, amgu amguVar, int i) {
        this.f = i;
        this.b = vxzVar;
        this.c = chatSessionMessageEvent;
        this.a = z;
        this.e = rveVar;
        this.d = amguVar;
    }
}
