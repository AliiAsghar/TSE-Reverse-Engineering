package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yeh extends aoon {
    private volatile aoon a;
    private final aonx b;

    public yeh(aonx aonxVar) {
        this.b = aonxVar;
    }

    @Override // defpackage.aoon
    public final /* synthetic */ Object a(aoro aoroVar) {
        String str = null;
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        aoroVar.m();
        String str2 = null;
        while (aoroVar.r()) {
            String h = aoroVar.h();
            if (aoroVar.t() == 9) {
                aoroVar.p();
            } else {
                h.hashCode();
                if ("gifObjectId".equals(h)) {
                    aoon aoonVar = this.a;
                    if (aoonVar == null) {
                        aoonVar = this.b.b(String.class);
                        this.a = aoonVar;
                    }
                    str = (String) aoonVar.a(aoroVar);
                } else if (ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY.equals(h)) {
                    aoon aoonVar2 = this.a;
                    if (aoonVar2 == null) {
                        aoonVar2 = this.b.b(String.class);
                        this.a = aoonVar2;
                    }
                    str2 = (String) aoonVar2.a(aoroVar);
                } else {
                    aoroVar.q();
                }
            }
        }
        aoroVar.o();
        return new yem(str, str2);
    }

    @Override // defpackage.aoon
    public final /* synthetic */ void b(aorp aorpVar, Object obj) {
        yem yemVar = (yem) obj;
        if (yemVar == null) {
            aorpVar.j();
            return;
        }
        aorpVar.f();
        aorpVar.i("gifObjectId");
        aoon aoonVar = this.a;
        if (aoonVar == null) {
            aoonVar = this.b.b(String.class);
            this.a = aoonVar;
        }
        aoonVar.b(aorpVar, yemVar.a);
        aorpVar.i(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        aoon aoonVar2 = this.a;
        if (aoonVar2 == null) {
            aoonVar2 = this.b.b(String.class);
            this.a = aoonVar2;
        }
        aoonVar2.b(aorpVar, yemVar.b);
        aorpVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorRegisterShareRequest)";
    }
}
