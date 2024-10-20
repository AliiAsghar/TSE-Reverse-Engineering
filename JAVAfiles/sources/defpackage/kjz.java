package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjz extends arpw implements arqz {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ nei f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjz(nei neiVar, arpe arpeVar) {
        super(6, arpeVar);
        this.f = neiVar;
    }

    @Override // defpackage.arqz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        kjz kjzVar = new kjz(this.f, (arpe) obj6);
        kjzVar.a = (List) obj;
        kjzVar.b = (kjo) obj2;
        kjzVar.c = booleanValue;
        kjzVar.d = (ResolvedRecipient) obj4;
        kjzVar.e = (Optional) obj5;
        return kjzVar.b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        kjo kjoVar;
        aerb aerbVar;
        aqil.P(obj);
        ?? r5 = this.a;
        Object obj2 = this.b;
        boolean z = this.c;
        ?? r1 = this.d;
        Optional optional = (Optional) this.e;
        aeia aeiaVar = null;
        if (!optional.isPresent()) {
            return null;
        }
        nel nelVar = (nel) optional.get();
        if (!z && (aerbVar = (kjoVar = (kjo) obj2).b) != null) {
            aeiaVar = new aeia(kjoVar.a, aerbVar, kjoVar.e);
        }
        return new kkb(new aeww(aeiaVar, new aewv(r1.c(xva.b)), nelVar.a.h(), nelVar.b(), r5, new kfq(this.f, nelVar, 8)), (kjo) obj2);
    }
}
