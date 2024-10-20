package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qwb implements alhr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ qwb(iki ikiVar, enh enhVar, ConversationIdType conversationIdType, int i, int i2) {
        this.e = i2;
        this.b = ikiVar;
        this.d = enhVar;
        this.c = conversationIdType;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [msh, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                Optional of = Optional.of(Integer.valueOf(this.a));
                Object obj = this.b;
                return ((rul) this.d).ax((Optional) this.c, (ConversationIdType) obj, of);
            }
            alvw g = iki.a.g();
            g.X(alwp.a, "Bugle");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/conversation/dataservice/RcsCapabilitiesDataSourceWrapper", "unlatchAndFetchCapabilitiesDataSource", 278, "RcsCapabilitiesDataSourceWrapper.java")).r("UCC Data Source created with subId=%d.", this.a);
            Object obj2 = this.c;
            Object obj3 = this.b;
            alhv alhvVar = new alhv(new ezr(17), albo.D(new fgh(obj3, obj2, 4, null)));
            iki ikiVar = (iki) obj3;
            qdq qdqVar = (qdq) ikiVar.p.b();
            qya qyaVar = new qya((yxx) ((kqw) qdqVar.a).b.A.b(), ((kqw) qdqVar.a).a.a.iz(), (ConversationIdType) obj2);
            qdq qdqVar2 = (qdq) ikiVar.d.b();
            return new akfk(new pui((lgg) ((kqw) qdqVar2.a).a.hS.b(), (ahiy) ((kqw) qdqVar2.a).a.aC.b(), (arwe) ((kqw) qdqVar2.a).a.bQ.b(), (xnv) ((kqw) qdqVar2.a).a.bV.b(), ikiVar.t, qyaVar, new qdq(obj3), alhvVar, (enh) this.d), new icj(obj3, 18), ikiVar.e, 1);
        }
        return ((qwd) this.b).j(new qxc(this.a, (String) this.c, (msh) this.d, (String) null, 24)).a;
    }

    public /* synthetic */ qwb(qwd qwdVar, int i, String str, msh mshVar, int i2) {
        this.e = i2;
        this.b = qwdVar;
        this.a = i;
        this.c = str;
        this.d = mshVar;
    }

    public /* synthetic */ qwb(rul rulVar, Optional optional, ConversationIdType conversationIdType, int i, int i2) {
        this.e = i2;
        this.d = rulVar;
        this.c = optional;
        this.b = conversationIdType;
        this.a = i;
    }
}
