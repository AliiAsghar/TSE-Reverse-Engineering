package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vvn extends arpw implements arqv {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ SelfIdentityId c;
    final /* synthetic */ vtm d;
    final /* synthetic */ msh e;
    final /* synthetic */ ConversationIdType f;
    final /* synthetic */ String g;
    final /* synthetic */ List h;
    final /* synthetic */ zap i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvn(zap zapVar, String str, String str2, SelfIdentityId selfIdentityId, vtm vtmVar, msh mshVar, ConversationIdType conversationIdType, String str3, List list, arpe arpeVar) {
        super(2, arpeVar);
        this.i = zapVar;
        this.a = str;
        this.b = str2;
        this.c = selfIdentityId;
        this.d = vtmVar;
        this.e = mshVar;
        this.f = conversationIdType;
        this.g = str3;
        this.h = list;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vvn) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [agnq, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        final String str = this.a;
        final String str2 = this.b;
        final SelfIdentityId selfIdentityId = this.c;
        final ConversationIdType conversationIdType = this.f;
        final zap zapVar = this.i;
        final vtm vtmVar = this.d;
        final String str3 = this.g;
        final msh mshVar = this.e;
        final List list = this.h;
        return zapVar.f.c("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs", new alhr() { // from class: vvm
            /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v6, types: [pfx, java.lang.Object] */
            @Override // defpackage.alhr
            public final Object get() {
                String str4;
                sng sngVar = new sng();
                sngVar.aj("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs");
                sngVar.j();
                sngVar.K(str);
                sngVar.I(str2);
                sngVar.w(vvh.j);
                sngVar.k(((SelfIdentityIdImpl) selfIdentityId).a);
                sngVar.v(0);
                String str5 = str3;
                if (str5 == null || str5.length() == 0) {
                    sngVar.y(tqh.NAME_IS_AUTOMATIC);
                }
                msh mshVar2 = mshVar;
                sngVar.J(vtmVar);
                Optional e = mshVar2.e();
                e.getClass();
                qei qeiVar = (qei) arsd.k(e);
                if (qeiVar != null) {
                    str4 = qeiVar.d;
                } else {
                    str4 = null;
                }
                zap zapVar2 = zapVar;
                sngVar.M(str4);
                if (zapVar2.d.a()) {
                    sngVar.L(Optional.of(((xnv) zapVar2.c).f()));
                }
                List list2 = list;
                ConversationIdType conversationIdType2 = conversationIdType;
                sngVar.e(conversationIdType2);
                ((rtz) zapVar2.a.b()).T(conversationIdType2, str5, 2, false);
                sky skyVar = new sky();
                skyVar.f("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs");
                skyVar.b(new vte(conversationIdType2, 11));
                skyVar.d();
                smk smkVar = new smk();
                smkVar.f("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs");
                smkVar.b(new vte(conversationIdType2, 12));
                smkVar.d();
                return Boolean.valueOf(((rtz) zapVar2.a.b()).am(mshVar2.e(), list2, conversationIdType2, false));
            }
        });
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new vvn(this.i, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, arpeVar);
    }
}
