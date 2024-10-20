package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vvo extends arpw implements arqv {
    int a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ vtm e;
    final /* synthetic */ String f;
    final /* synthetic */ msh g;
    final /* synthetic */ SelfIdentityId h;
    final /* synthetic */ List i;
    final /* synthetic */ zap j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvo(zap zapVar, ConversationIdType conversationIdType, String str, String str2, vtm vtmVar, String str3, msh mshVar, SelfIdentityId selfIdentityId, List list, arpe arpeVar) {
        super(2, arpeVar);
        this.j = zapVar;
        this.b = conversationIdType;
        this.c = str;
        this.d = str2;
        this.e = vtmVar;
        this.f = str3;
        this.g = mshVar;
        this.h = selfIdentityId;
        this.i = list;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vvo) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            zap zapVar = this.j;
            ConversationIdType conversationIdType = this.b;
            String str = this.c;
            String str2 = this.d;
            vtm vtmVar = this.e;
            String str3 = this.f;
            msh mshVar = this.g;
            SelfIdentityId selfIdentityId = this.h;
            List list = this.i;
            this.a = 1;
            obj = zapVar.m(conversationIdType, str, str2, vtmVar, str3, mshVar, selfIdentityId, list, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        return obj;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new vvo(this.j, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, arpeVar);
    }
}
