package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jdh extends arpw implements arqy {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ jdi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdh(jdi jdiVar, arpe arpeVar) {
        super(5, arpeVar);
        this.e = jdiVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        aqil.P(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        ?? r1 = this.c;
        Object obj3 = this.d;
        boolean z2 = true;
        boolean z3 = false;
        if (r1 != 0 && r1.f().p()) {
            z = true;
        } else {
            z = false;
        }
        wpn wpnVar = wpn.b;
        if (z) {
            if (obj3 == wpnVar) {
                z2 = false;
            }
            jdi jdiVar = this.e;
            r1.getClass();
            alog r = alog.r((ResolvedRecipient) r1);
            r.getClass();
            return jdiVar.c(r, false, z2);
        }
        if (r0.b() == mit.ONE_ON_ONE) {
            alog alogVar = (alog) obj2;
            if (((ResolvedRecipient) alogVar.get(0)).f().p()) {
                if (obj3 != wpnVar) {
                    z3 = true;
                }
                return this.e.c(alogVar, true, z3);
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.arqy
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        jdh jdhVar = new jdh(this.e, (arpe) obj5);
        jdhVar.a = (alog) obj;
        jdhVar.b = (miu) obj2;
        jdhVar.c = (Recipient) obj3;
        jdhVar.d = (wpn) obj4;
        return jdhVar.b(arnb.a);
    }
}
