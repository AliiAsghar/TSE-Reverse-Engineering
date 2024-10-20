package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nac extends arpw implements arqv {
    long a;
    int b;
    final /* synthetic */ nad c;
    final /* synthetic */ MessageId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nac(nad nadVar, MessageId messageId, arpe arpeVar) {
        super(2, arpeVar);
        this.c = nadVar;
        this.d = messageId;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((nac) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        long j;
        arpl arplVar = arpl.a;
        if (this.b != 0) {
            j = this.a;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            nad nadVar = this.c;
            MessageId messageId = this.d;
            long a = nadVar.e.a();
            akul h = nadVar.b.h(messageId);
            h.getClass();
            this.a = a;
            this.b = 1;
            obj = arro.F(h, this);
            if (obj != arplVar) {
                j = a;
            } else {
                return arplVar;
            }
        }
        mjb mjbVar = (mjb) obj;
        mjbVar.getClass();
        return new nam(mjbVar, j);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new nac(this.c, this.d, arpeVar);
    }
}
