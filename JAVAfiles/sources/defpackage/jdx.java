package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jdx extends arpw implements arqy {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ jeb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdx(jeb jebVar, arpe arpeVar) {
        super(5, arpeVar);
        this.d = jebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [miu, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        ?? r3 = this.a;
        Object obj2 = this.b;
        ?? r1 = this.c;
        if (obj2 != null) {
            if (r1 == 0) {
                return null;
            }
            return this.d.c(r1);
        }
        return this.d.c(r3);
    }

    @Override // defpackage.arqy
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        jdx jdxVar = new jdx(this.d, (arpe) obj5);
        jdxVar.a = (miu) obj;
        jdxVar.b = (Recipient) obj3;
        jdxVar.c = (miu) obj4;
        return jdxVar.b(arnb.a);
    }
}
