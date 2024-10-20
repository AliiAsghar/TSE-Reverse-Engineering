package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rap extends arpw implements arqv {
    int a;
    final /* synthetic */ rat b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ SelfIdentityId g;
    final /* synthetic */ ConversationIdType h;
    final /* synthetic */ boolean i;
    final /* synthetic */ boolean j;
    final /* synthetic */ List k;
    final /* synthetic */ List l;
    final /* synthetic */ List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rap(rat ratVar, int i, String str, String str2, String str3, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, boolean z, boolean z2, List list, List list2, List list3, arpe arpeVar) {
        super(2, arpeVar);
        this.b = ratVar;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = selfIdentityId;
        this.h = conversationIdType;
        this.i = z;
        this.j = z2;
        this.k = list;
        this.l = list2;
        this.m = list3;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((rap) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i != 0) {
            return obj;
        }
        rat ratVar = this.b;
        int i2 = this.c;
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        SelfIdentityId selfIdentityId = this.g;
        ConversationIdType conversationIdType = this.h;
        boolean z = this.i;
        boolean z2 = this.j;
        List list = this.k;
        List list2 = this.l;
        List list3 = this.m;
        this.a = 1;
        Object d = ratVar.d(i2, str, str2, str3, selfIdentityId, conversationIdType, z, z2, list, list2, list3, this);
        if (d == arplVar) {
            return arplVar;
        }
        return d;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new rap(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, arpeVar);
    }
}
